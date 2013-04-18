/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.Commande;
import dao.CommandeDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MoulayYounesSama
 */
class CatalogueCommandeHelper extends AbstractTableModel{
    private String[] titres = {"Code","Date","Sujet","Echéance","Montant","Mode Paiment","Type"};
    private List<Commande> commandes = new ArrayList<Commande>();
    private CommandeDao commandeDao = new CommandeDao();

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

   



    public int getRowCount() {
        return commandes.size();
    }

    public int getColumnCount() {
        return titres.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         if(rowIndex<commandes.size()){
             switch(columnIndex){
                 case 0: return commandes.get(rowIndex).getNumero();
                 case 1: return commandes.get(rowIndex).getDate();
                 case 2: return commandes.get(rowIndex).getQui();
                 case 3: return commandes.get(rowIndex).getEcheance();
                 case 4: return commandes.get(rowIndex).getMontant();
                 case 5: return commandes.get(rowIndex).getModePaiment();
                 case 6: if(commandes.get(rowIndex).getType().equals("F"))
                           return "Fournisseur";
                         else
                             return "Client";
                 default: return null;
             }
         }
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


    public CatalogueCommandeHelper() {
      try {
            commandes = commandeDao.loadAll();
            System.out.println(commandes);
        } catch (SQLException ex) {
        }
    }
}
