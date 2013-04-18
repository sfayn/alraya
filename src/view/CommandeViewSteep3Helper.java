/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.CommandeProduit;
import bean.LivraisonProduit;
import dao.CommandeProduitDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MoulayYounesSama
 */
public class CommandeViewSteep3Helper extends AbstractTableModel{
    private String[] titres = {"Code Produit","Libelle PRoduit","Quantité","UM","Description","Prix unitaire","Montant"};
    private List<CommandeProduit> commandeProduits = new ArrayList<CommandeProduit>();
    private CommandeProduitDao commandeProduitDao = new CommandeProduitDao();

    public List<CommandeProduit> getCommandeProduits() {
        return commandeProduits;
    }

    public void setCommandeProduits(List<CommandeProduit> commandeProduits) {
        this.commandeProduits = commandeProduits;
    }

 



    public int getRowCount() {
        return commandeProduits.size();
    }

    public int getColumnCount() {
        return titres.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         if(rowIndex<commandeProduits.size()){
             switch(columnIndex){
                 case 0: return commandeProduits.get(rowIndex).getCodeProduit();
                 case 1: return commandeProduits.get(rowIndex).getLibelleProduit();
                 case 2:return commandeProduits.get(rowIndex).getQuantite();
                 case 3: return commandeProduits.get(rowIndex).getUniteMesur();
                 case 4:return commandeProduits.get(rowIndex).getDescription();
                 case 5: return commandeProduits.get(rowIndex).getMontant();
                 case 6: return commandeProduits.get(rowIndex).getMontant()*commandeProduits.get(rowIndex).getQuantite();
                 default: return null;
             }
         }
            return null;
    }



    public CommandeProduit getValueAt(int rowIndex) {
        if(rowIndex<commandeProduits.size()){
           return commandeProduits.get(rowIndex);
        }
        else
            return null;
    }
    @Override
    public String getColumnName(int columnIndex){
        return titres[columnIndex];
    }

    public String[] getTitres() {
        return titres;
    }

    public void setTitres(String[] titres) {
        this.titres = titres;
    }



    public CommandeViewSteep3Helper() {
        try {
            commandeProduits = commandeProduitDao.loadAll();
        } catch (SQLException ex) {
            Logger.getLogger(CommandeViewSteep3Helper.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }

}
