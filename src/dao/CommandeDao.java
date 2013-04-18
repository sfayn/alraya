/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;
import bean.Commande;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MoulayYounesSama
 */
public class CommandeDao {
List<Commande> commandes = new ArrayList<Commande>();


public void save(Commande commande) throws SQLException {
        String requette = "INSERT INTO commandeclient Values("+commande.getNumero()+",'"+commande.getDate()+"', '"+
                commande.getResponsable()+"', '"+commande.getModePaiment()+"', '"+commande.getEcheance()
                +"', "+commande.getSocieteClient()+", '"+commande.getQui()+"', '"+commande.getType()+"',"
                +commande.getMontant()+","+commande.getAutre()+",0) ";
        System.out.println(requette);
        Connect.exec(requette);
    }

public int update(double montant,double autre,int codeCommande) throws SQLException{
    String requette = "UPDATE commandeclient SET autre ="+autre+" , montant="+montant+" WHERE code="+codeCommande ;
    System.out.println(requette);
    return Connect.exec(requette);
}

public int update(int livraison,int codeCommande) throws SQLException{
    String requette = "UPDATE commandeclient SET livraison ="+livraison+" WHERE code="+codeCommande ;
    System.out.println("avanttttt updateeeeeeeeeeeeeeeee");
    System.out.println(requette);
    System.out.println("apresss updateeeeeeeeeeeeeeeeeeee");
    return Connect.exec(requette);
}
     public int loadMaxId() throws SQLException{
		ResultSet commandesResultSet = Connect.loadAll("Select Max(code) AS codemax from commandeclient");
      
		while(commandesResultSet.next()){
			return commandesResultSet.getInt("codemax")+ 1;
		}

		commandesResultSet.close();
        return 1;

	}

     public List<Commande> loadAll() throws SQLException {
         return loadAll("Select * from commandeclient where type ='C' and livraison =0 and dateEmission like '%-%-"+(new Date().getYear()+1900)+"'");

     }

      public List<Integer> loadAllCode(String type) throws SQLException {

   ResultSet commandeResultSet = Connect.loadAll("Select code from commandeclient where type ='"+type+"'and livraison =0 and dateEmission like '%-%-"+(new Date().getYear()+1900)+"'");
       List<Integer> codes = new ArrayList<Integer>();
		while(commandeResultSet.next()){

           codes.add(commandeResultSet.getInt("code"));
     }
       commandeResultSet.close();
       return codes;

      }


  public List<Commande> loadAll(String requette) throws SQLException {
    ResultSet commandeResultSet = Connect.loadAll(requette);
        commandes.clear();
		while(commandeResultSet.next()){
            Commande commande = new Commande();
            commande.setNumero(commandeResultSet.getInt("code"));
			commande.setDate(commandeResultSet.getString("dateEmission"));
			commande.setModePaiment(commandeResultSet.getString("modePaiment"));
			commande.setEcheance(commandeResultSet.getString("echeance"));
            commande.setQui(commandeResultSet.getString("qui"));
            commande.setMontant(commandeResultSet.getDouble("montant"));
            commande.setType(commandeResultSet.getString("type"));
            commande.setLivraison(commandeResultSet.getInt("livraison"));
            commande.setResponsable(commandeResultSet.getString("responsable"));
            commande.setSocieteClient(commandeResultSet.getInt("codeclient"));
			commandes.add(commande);
		}

		commandeResultSet.close();
        return commandes;
    }



}
