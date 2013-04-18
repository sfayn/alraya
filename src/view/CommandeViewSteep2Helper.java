/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.CommandeProduit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MoulayYounesSama
 */
public class CommandeViewSteep2Helper extends AbstractTableModel{
    private String[] titres = {"Libelle","Prix", "Quantite","Montant"};
    private List<CommandeProduit> produitLivraison = new ArrayList<CommandeProduit>();

    public int getRowCount() {
        return produitLivraison.size();
    }

    public List<CommandeProduit> getProduitCommandes() {
        return produitLivraison;
    }

    public void setProduitCommandes(List<CommandeProduit> produitLivraison) {
        this.produitLivraison = produitLivraison;
    }

    public int getColumnCount() {
        return titres.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         if(rowIndex<produitLivraison.size()){
             switch(columnIndex){
                 case 0: return produitLivraison.get(rowIndex).getLibelleProduit();
                 case 1: return produitLivraison.get(rowIndex).getMontant();
                 case 2: return produitLivraison.get(rowIndex).getQuantite();
                 case 3: return produitLivraison.get(rowIndex).getQuantite()*produitLivraison.get(rowIndex).getMontant();

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


    public CommandeViewSteep2Helper() {

    }
}
