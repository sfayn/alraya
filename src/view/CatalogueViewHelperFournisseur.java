/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.Fournisseur;
import dao.FournisseurDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MoulayYounesSama
 */
class CatalogueViewHelperFournisseur extends AbstractTableModel{
    private String[] titres = {"Code","Libelle"};
    private List<Fournisseur> fournisseurs = new ArrayList<Fournisseur>();
    private FournisseurDao fournisseurDao = new FournisseurDao();

    public List<Fournisseur> getFournisseurs() {
        return fournisseurs;
    }

    public void setFournisseurs(List<Fournisseur> fournisseurs) {
        this.fournisseurs = fournisseurs;
    }



    public int getRowCount() {
        return fournisseurs.size();
    }

    public int getColumnCount() {
        return titres.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         if(rowIndex<fournisseurs.size()){
             switch(columnIndex){
                 case 0: return fournisseurs.get(rowIndex).getCode();
                 case 1: return fournisseurs.get(rowIndex).getSociete();
                 default: return null;
             }
         }
            return null;
    }

    public Fournisseur getValueAt(int rowIndex) {
        if(rowIndex<fournisseurs.size()){
           return fournisseurs.get(rowIndex);
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


    public CatalogueViewHelperFournisseur() {
      try {
            fournisseurs = fournisseurDao.loadAllForCatalogue();
        } catch (SQLException ex) {
        }
    }
}
