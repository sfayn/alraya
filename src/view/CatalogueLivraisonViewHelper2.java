package view;
import bean.LivraisonProduit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MoulayYounesSama
 */
public class CatalogueLivraisonViewHelper2  extends AbstractTableModel{
    private String[] titres = {"Code","Libelle","Prix Unitaire","Quantite","Montant","UM"};
    private List<LivraisonProduit> produitLivraison = new ArrayList<LivraisonProduit>();

    public int getRowCount() {
        return produitLivraison.size();
    }

    public List<LivraisonProduit> getProduitCommandes() {
        return produitLivraison;
    }

    public void setProduitCommandes(List<LivraisonProduit> produitLivraison) {
        this.produitLivraison = produitLivraison;
    }

    public int getColumnCount() {
        return titres.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         if(rowIndex<produitLivraison.size()){
             switch(columnIndex){
                case 0: return produitLivraison.get(rowIndex).getCodeProduit();
                 case 1: return produitLivraison.get(rowIndex).getLibelleProduit();
                 case 2: return produitLivraison.get(rowIndex).getMontant();
                 case 3: return produitLivraison.get(rowIndex).getQuantite();
                 case 4: return produitLivraison.get(rowIndex).getQuantite()*produitLivraison.get(rowIndex).getMontant();
                 case 5: return produitLivraison.get(rowIndex).getUniteMesur();
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


    public CatalogueLivraisonViewHelper2() {

    }
}

