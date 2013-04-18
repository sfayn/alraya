

package view;

import bean.Livraison;
import dao.LivraisonDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MoulayYounesSama
 */
class CatalogueLivraisonViewHelper extends AbstractTableModel{
    private String[] titres = {"Code","Date","Montant"};
    private List<Livraison> livraisons = new ArrayList<Livraison>();

    public List<Livraison> getLivraisons() {
        return livraisons;
    }

    public void setLivraisons(List<Livraison> livraisons) {
        this.livraisons = livraisons;
    }


    public int getRowCount() {
        return livraisons.size();
    }

    public int getColumnCount() {
        return titres.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         if(rowIndex<livraisons.size()){
             switch(columnIndex){
                 case 0: return livraisons.get(rowIndex).getCode();
                 case 1: return livraisons.get(rowIndex).getDateLivraison();
                 case 2: return livraisons.get(rowIndex).getMontant();
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


    public CatalogueLivraisonViewHelper() {
      
    }
}

