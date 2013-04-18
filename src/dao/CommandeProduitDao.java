/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import bean.CommandeProduit;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import view.CommandeView;

/**
 *
 * @author MoulayYounesSama
 */
public class CommandeProduitDao {
List<CommandeProduit> commandeProduits = new ArrayList<CommandeProduit>();


 public List<CommandeProduit> loadByCode(int codeCommande) throws SQLException {
        String requette ="SELECT * FROM commandeproduit where codecommande="+codeCommande;
        return loadAll(requette);
    }


    public List<CommandeProduit> loadAll() throws SQLException {
        String requette ="SELECT * FROM commandeproduit where codecommande="+CommandeView.numero;
        return loadAll(requette);
    }


     public List<CommandeProduit> loadAll(String requette) throws SQLException {

         ResultSet commandeProduitResultSet =Connect.loadAll(requette);
         commandeProduits.clear();
         while(commandeProduitResultSet.next()){

             CommandeProduit commandeProduit = new CommandeProduit();
              commandeProduit.setCodeProduit(commandeProduitResultSet.getInt("codeproduit"));
              commandeProduit.setLibelleProduit(commandeProduitResultSet.getString("libelleproduit"));
              commandeProduit.setQuantite(commandeProduitResultSet.getDouble("quantite"));
              commandeProduit.setUniteMesur(commandeProduitResultSet.getString("um"));
              commandeProduit.setDescription(commandeProduitResultSet.getString("description"));
              commandeProduit.setMontant(commandeProduitResultSet.getDouble("montant"));
              commandeProduit.setQuantiteLivree(commandeProduitResultSet.getDouble("livraison"));
             commandeProduits.add(commandeProduit);
         }
        return commandeProduits;
    }
    public int save(CommandeProduit commandeProduit) throws SQLException{
        String requette = "INSERT INTO commandeproduit VALUES(NULL, "+commandeProduit.getCodeCommande()+","+
     commandeProduit.getCodeProduit()+", "+commandeProduit.getMontant()+", "+commandeProduit.getQuantite()+", '" +
               commandeProduit.getDescription()+"', '"+commandeProduit.getLibelleProduit()+"', '"+commandeProduit.getUniteMesur()
               +"',0)";
        System.out.println(requette);
        return Connect.exec(requette);
    }

      public int update(double quantite, int codeCommande, int codeProduit) throws SQLException{
        String requette = "UPDATE commandeproduit SET livraison=livraison+"+
                quantite+" where codecommande="+codeCommande+" and codeproduit="+codeProduit;
        System.out.println("je ss updateee ========================");
          System.out.println(requette);
          System.out.println("fin updateeeeeeeeeeeee==================");
        return Connect.exec(requette);
    }
     

     public List<CommandeProduit> getCommandeProduits() {
        return commandeProduits;
    }

    public void setCommandeProduits(List<CommandeProduit> commandeProduits) {
        this.commandeProduits = commandeProduits;
    }
}
