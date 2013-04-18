
package dao;

import bean.LivraisonProduit;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import view.LivraisonView1;

/**
 *
 * @author MoulayYounesSama
 */
public class LivraisonProduitDao {
List<LivraisonProduit> livraisonProduits = new ArrayList<LivraisonProduit>();
LivraisonDao livraisonDao = new LivraisonDao();

public int save(LivraisonProduit livraisonProduit,String type) throws SQLException{
    String requette="";
    if(type.contains("F")){
       requette = "INSERT INTO livraisonproduit VALUES(NULL, "+livraisonProduit.getCodeLivraison()+","+
     livraisonProduit.getCodeProduit()+", "+livraisonProduit.getMontant()+", "+livraisonProduit.getQuantite()+", '" +
               livraisonProduit.getDescription()+"', '"+livraisonProduit.getLibelleProduit()+"', '"+livraisonProduit.getUniteMesur()
               +"', "+livraisonProduit.getQuantiteCommande()+","+livraisonProduit.getQuantite()+")";
    }
        System.out.println(requette);
        return Connect.exec(requette);
    }

 public List<LivraisonProduit> loadByCode(int codeLivraison) throws SQLException {
        String requette ="SELECT * FROM livraisonproduit where codelivraison="+codeLivraison;
        System.out.println(requette);
        return loadAll(requette);
    }



 public int loadQuantiteLivree(List<Integer> codeLivraisons,int codeProduit) throws SQLException {
       String requette="";
       int qt=0;
       for (Integer element : codeLivraisons) {
        requette ="SELECT quantite FROM livraisonproduit where codeLivraison="+
                element+" and codeProduit="+codeProduit;
        ResultSet myres= Connect.loadAll(requette);
        while (myres.next()) {
         System.out.println(" code liv ="+element+" code prod ="+codeProduit+ " qtt ="+myres.getInt("quantite"));
         qt+=myres.getInt("quantite");
     }
     }
      return qt;
        
      
    }



    public List<LivraisonProduit> loadAll() throws SQLException {
        String requette ="SELECT * FROM livraisonproduit where codelivraison="+LivraisonView1.livraison.getCode();
        System.out.println("la requette est "+requette);
        return loadAll(requette);
    }


     public List<LivraisonProduit> loadAll(String requette) throws SQLException {

         ResultSet livraisonProduitResultSet =Connect.loadAll(requette);
         livraisonProduits.clear();
         while(livraisonProduitResultSet.next()){

             LivraisonProduit commandeProduit = new LivraisonProduit();
              commandeProduit.setCodeProduit(livraisonProduitResultSet.getInt("codeproduit"));
              commandeProduit.setLibelleProduit(livraisonProduitResultSet.getString("libelleproduit"));
              commandeProduit.setQuantite(livraisonProduitResultSet.getDouble("quantite"));
              commandeProduit.setUniteMesur(livraisonProduitResultSet.getString("um"));
              commandeProduit.setDescription(livraisonProduitResultSet.getString("description"));
              commandeProduit.setMontant(livraisonProduitResultSet.getDouble("montant"));
              commandeProduit.setQuantiteCommande(livraisonProduitResultSet.getDouble("quantiteCommande"));

             livraisonProduits.add(commandeProduit);
         }
         if(livraisonProduitResultSet !=null)
             livraisonProduitResultSet.close();
         System.out.println("le nbr de cham retourn est "+livraisonProduits.size());
        return livraisonProduits;
    }
    

     
}
