/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.Produit;
import dao.ProduitDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MoulayYounesSama
 */
public class CatalogueViewHelperProduit extends AbstractTableModel {
    private String[] titres = {"Code","Libelle"};
    private List<Produit> produits = new ArrayList<Produit>();
    private ProduitDao produitDao = new ProduitDao();

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }


    public int getRowCount() {
        return produits.size();
    }

    public int getColumnCount() {
        return titres.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         if(rowIndex<produits.size()){
             switch(columnIndex){
                 case 0: return produits.get(rowIndex).getCode();
                 case 1: return produits.get(rowIndex).getLibelle();
                 default: return null;
             }
         }
            return null;
    }

    public Produit getValueAt(int rowIndex) {
        if(rowIndex<produits.size()){
           return produits.get(rowIndex);
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


    public CatalogueViewHelperProduit() {
      try {
            produits = produitDao.loadAllForCatalogue();
        } catch (SQLException ex) {
        }
    }

}
