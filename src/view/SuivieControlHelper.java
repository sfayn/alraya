/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.Suivi;
import dao.SuiviDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MoulayYounesSama
 */
public class SuivieControlHelper extends AbstractTableModel {

    private String[] titres = {"Code","Sujet","Type","Risque","Motif","Attention","Date"};
    private List<Suivi> suivis = new ArrayList<Suivi>();
    private SuiviDao suiviDao = new SuiviDao();


   

    public int getRowCount() {
        return suivis.size();
    }

    public int getColumnCount() {
        return titres.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         if(rowIndex<suivis.size()){
             switch(columnIndex){
                 case 0: return suivis.get(rowIndex).getCode();
                 case 1: return  suivis.get(rowIndex).getInteresse();

                 case 2: if (suivis.get(rowIndex).getType().equals("F"))
                     return "Fournisseur";
                 else
                     return "Client";
                 case 3: return suivis.get(rowIndex).getRisque();
                 case 4:return suivis.get(rowIndex).getMotif();
                 case 5: return suivis.get(rowIndex).getAttention();
                 case 6: return suivis.get(rowIndex).getDateSuivi();
                 default: return null;
             }
         }
            return null;
    }

    public Suivi getValueAt(int rowIndex) {
        if(rowIndex<suivis.size()){
           return suivis.get(rowIndex);
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

    public List<Suivi> getSuivis() {
        return suivis;
    }

    public void setSuivis(List<Suivi> suivis) {
        this.suivis = suivis;
    }

public SuivieControlHelper() {
try {
           suivis= suiviDao.loadAll("SELECT * FROM suivi WHERE dateSuivi like '%-%-"+(new Date().getYear()+1900)+"'");
        } catch (SQLException ex) {
            Logger.getLogger(SuivieControlHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public SuivieControlHelper(String requette) {
 try {
           suivis= suiviDao.loadAll(requette);
        } catch (SQLException ex) {
            Logger.getLogger(SuivieControlHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
}
 


}
