/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import bean.CatalogueItem;
import bean.Produit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MoulayYounesSama
 */
public class CatalogueItemDao {



    public int save(CatalogueItem catalogueItem) throws SQLException{
        String requete = "INSERT INTO catalogueItem(codeproduit,codefournisseur,prix,tva)" +
                " VALUES("+catalogueItem.getCodeProduit()+", "+catalogueItem.getCodeFournisseur()+
                ", "+catalogueItem.getPrix()+", "+catalogueItem.getTva()+")";
       return  Connect.exec(requete);
    }

    public List<Integer> loadByCodeProduit(int codeProduit) throws SQLException{
        ResultSet codeforResultSet = Connect.loadAll("Select codefournisseur from catalogueitem where codeproduit="+codeProduit);
        List<Integer> listCodeFournisseur = new ArrayList<Integer>();
		while(codeforResultSet.next()){
			listCodeFournisseur.add(codeforResultSet.getInt("codefournisseur"));
		}

		codeforResultSet.close();
        return listCodeFournisseur;

    }

    public List<Integer> loadByCodeFournisseur(int codeFornisseur) throws SQLException {
         ResultSet codeProResultSet = Connect.loadAll("Select codeproduit from catalogueitem where codefournisseur="+codeFornisseur);
        List<Integer> listCodeProduit = new ArrayList<Integer>();
		while(codeProResultSet.next()){
			listCodeProduit.add(codeProResultSet.getInt("codeproduit"));
		}

		codeProResultSet.close();
        return listCodeProduit;

    }

}
