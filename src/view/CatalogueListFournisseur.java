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
public class CatalogueListFournisseur  extends AbstractTableModel{
private String[] titres = {"Code","Societe","Forme Juridique","Personne a contacter","Adresse","Tel","Statut"};
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
                 case 2:return fournisseurs.get(rowIndex).getFormeJuridique();
                 case 3: return fournisseurs.get(rowIndex).getPersonneContacter();
                 case 4:return fournisseurs.get(rowIndex).getAdress1();
                 case 5:return fournisseurs.get(rowIndex).getTelStandard();
                 case 6:return fournisseurs.get(rowIndex).getStatut();

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


    public CatalogueListFournisseur() {
      try {
            fournisseurs = fournisseurDao.loadAll();

        } catch (SQLException ex) {
        }
    }

    public void updateFounisseur(Integer code) {
        for (int i = 0; i < fournisseurs.size(); i++) {
              if(fournisseurs.get(i).getCode()==code){
            fournisseurs.get(i).setStatut("Actif");
              }

                }
     }

}