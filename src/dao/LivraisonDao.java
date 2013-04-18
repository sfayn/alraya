/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;
import bean.Livraison;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MoulayYounesSama
 */
public class LivraisonDao {
List<Livraison> livraisons = new ArrayList<Livraison>();


public void save(Livraison livraison) throws SQLException {
        String requette = "INSERT INTO livraison Values("+livraison.getCode()+","+livraison.getCodeCommande()+", "+
                livraison.getCodeSujet()+", '"+livraison.getSujet()+"', '"+livraison.getDateLivraison()
                +"', '"+livraison.getType()+"', '"+livraison.getResponsable()+"',0,0)";
        System.out.println(requette);
        Connect.exec(requette);
    }


public void update(Livraison livraison) throws SQLException {
        String requette = "UPDATE livraison SET autre="+livraison.getAutre()+", montant="+livraison.getMontant()+
                " WHERE code="+livraison.getCode();
        System.out.println(requette);
        Connect.exec(requette);
    }

     public int loadMaxId() throws SQLException{
		ResultSet commandesResultSet = Connect.loadAll("Select Max(code) AS codemax from livraison");

		while(commandesResultSet.next()){
			return commandesResultSet.getInt("codemax")+ 1;
		}

        if(commandesResultSet != null)
		commandesResultSet.close();
        return 1;

	}

     public List<Livraison> loadAll() throws SQLException {
         return loadAll("Select * from livraison where type ='C' and dateEmission like '%-%-"+(new Date().getYear()+1900)+"'");

     }

      public List<Livraison> loadByCodeCommande() throws SQLException {
         return loadAll("Select * from livraison where type ='C' and dateEmission like '%-%-"+(new Date().getYear()+1900)+"'");

     }

        public List<Livraison> loadByCodeCommande(int codecommande) throws SQLException {
            String request = "SELECT * from livraison where codeCommande ="+codecommande;
            System.out.println(request);
            return loadAll(request);
     }

  


  public List<Livraison> loadAll(String requette) throws SQLException {
    ResultSet livraisonResultSet = Connect.loadAll(requette);
        livraisons.clear();
		while(livraisonResultSet.next()){
            Livraison livraison = new Livraison();
            livraison.setCode(livraisonResultSet.getInt("code"));
			livraison.setDateLivraison(livraisonResultSet.getString("dateLivraison"));
			livraison.setSujet(livraisonResultSet.getString("sujet"));
            livraison.setCodeSujet(livraisonResultSet.getInt("codesujet"));
            livraison.setCodeCommande(livraisonResultSet.getInt("codecommande"));
            livraison.setType(livraisonResultSet.getString("type"));
            livraison.setResponsable(livraisonResultSet.getString("responsable"));
            livraison.setMontant(livraisonResultSet.getDouble("montant"));
			livraisons.add(livraison);
		}

        if(livraisonResultSet != null)
		livraisonResultSet.close();
        return livraisons;
    }



}
