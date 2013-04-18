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
public class CatalogueistProduit extends AbstractTableModel {

    private String[] titres = {"Code","Libelle","Famille","Catégorie","Unité","Stock Max","Stock Min","Seuil Alert","Prix","TVA"};
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
                 case 2:return produits.get(rowIndex).getFamille();
                 case 3: return produits.get(rowIndex).getCategorie();
                 case 4:return produits.get(rowIndex).getUnite();
                 case 5:return produits.get(rowIndex).getStockMax();
                 case 6: return produits.get(rowIndex).getStockMin();
                 case 7:return produits.get(rowIndex).getSeuilAlert();
                 case 8: return produits.get(rowIndex).getPrix();
                 case 9:return produits.get(rowIndex).getTva();

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


    public CatalogueistProduit() {
      try {
            produits = produitDao.loadAll();

        } catch (SQLException ex) {
        }
    }


}
