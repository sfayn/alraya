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
public class CatalogueCommandeHelper2  extends AbstractTableModel{
    private String[] titres = {"Code","Libelle","Prix Unitaire","Quantite","Montant","UM","Quantité Livrée"};
    private List<CommandeProduit> produitCommandes = new ArrayList<CommandeProduit>();

    public int getRowCount() {
        return produitCommandes.size();
    }

    public List<CommandeProduit> getProduitCommandes() {
        return produitCommandes;
    }

    public void setProduitCommandes(List<CommandeProduit> produitCommandes) {
        this.produitCommandes = produitCommandes;
    }

    public int getColumnCount() {
        return titres.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         if(rowIndex<produitCommandes.size()){
             switch(columnIndex){
                case 0: return produitCommandes.get(rowIndex).getCodeProduit();
                 case 1: return produitCommandes.get(rowIndex).getLibelleProduit();
                 case 2: return produitCommandes.get(rowIndex).getMontant();
                 case 3: return produitCommandes.get(rowIndex).getQuantite();
                 case 4: return produitCommandes.get(rowIndex).getQuantite()*produitCommandes.get(rowIndex).getMontant();
                 case 5: return produitCommandes.get(rowIndex).getUniteMesur();
                 case 6: return produitCommandes.get(rowIndex).getQuantiteLivree();
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


    public CatalogueCommandeHelper2() {

    }
}

