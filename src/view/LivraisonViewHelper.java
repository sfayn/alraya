/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.LivraisonProduit;
import dao.LivraisonProduitDao;
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
public class LivraisonViewHelper extends AbstractTableModel{
    private String[] titres = {"Code Produit","Libelle PRoduit","Quantité Commandée","Quantité Livrée","UM","Description","Prix unitaire","Montant"};
    private List<LivraisonProduit> livraisonProduits = new ArrayList<LivraisonProduit>();
    private LivraisonProduitDao livraisonProduitDao = new LivraisonProduitDao();




    public int getRowCount() {
        return livraisonProduits.size();
    }

    public int getColumnCount() {
        return titres.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         if(rowIndex<livraisonProduits.size()){
             switch(columnIndex){
                 case 0: return livraisonProduits.get(rowIndex).getCodeProduit();
                 case 1: return livraisonProduits.get(rowIndex).getLibelleProduit();
                 case 2:return livraisonProduits.get(rowIndex).getQuantiteCommande();
                 case 3:return livraisonProduits.get(rowIndex).getQuantite();
                 case 4: return livraisonProduits.get(rowIndex).getUniteMesur();
                 case 5:return livraisonProduits.get(rowIndex).getDescription();
                 case 6: return livraisonProduits.get(rowIndex).getMontant();
                 case 7: return livraisonProduits.get(rowIndex).getMontant()*livraisonProduits.get(rowIndex).getQuantite();
                 default: return null;
             }
         }
            return null;
    }

    public List<LivraisonProduit> getLivraisonProduits() {
        return livraisonProduits;
    }

    public void setLivraisonProduits(List<LivraisonProduit> livraisonProduits) {
        this.livraisonProduits = livraisonProduits;
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



    public LivraisonViewHelper() {
        try {
            livraisonProduits = livraisonProduitDao.loadAll();
        } catch (SQLException ex) {
            Logger.getLogger(CommandeViewSteep3Helper.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

}
