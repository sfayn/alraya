package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Produit;



public class ProduitDao {

	private List<Produit> produits = new ArrayList<Produit>();


    public List<Produit> loadAll() throws SQLException{
        ResultSet produitsResultSet = Connect.loadAll("Select * from produit");
        produits.clear();
		Produit produit;
		while(produitsResultSet.next()){
			produit = new Produit();
            produit.setCode(produitsResultSet.getInt("code"));
			produit.setLibelle(produitsResultSet.getString("libelle"));
            produit.setFamille(produitsResultSet.getString("famille"));
            produit.setCategorie(produitsResultSet.getString("categorie"));

			produit.setUnite(produitsResultSet.getString("unite"));
            produit.setStockMax(produitsResultSet.getDouble("stockMax"));
            produit.setStockMin(produitsResultSet.getDouble("stockMin"));
            produit.setSeuilAlert(produitsResultSet.getDouble("seuilAlert"));


			produits.add(produit);
		}

		produitsResultSet.close();
        return produits;
    }

    public List<Produit> loadAllByCode(List<Integer> listCode) throws SQLException{
          produits.clear();
          ResultSet produitResultSet = null;
		       for (Integer mycode : listCode) {
               produitResultSet = Connect.loadAll("Select * from produit where code="+mycode);
                

               while(produitResultSet.next()){
                        Produit produit = new Produit();
                        produit.setCode(produitResultSet.getInt("code"));
                        produit.setLibelle(produitResultSet.getString("libelle"));
                        produit.setFamille(produitResultSet.getString("famille"));
                        produit.setCategorie(produitResultSet.getString("categorie"));

                        produit.setUnite(produitResultSet.getString("unite"));
                        produit.setStockMax(produitResultSet.getDouble("stockMax"));
                        produit.setStockMin(produitResultSet.getDouble("stockMin"));
                        produit.setSeuilAlert(produitResultSet.getDouble("seuilAlert"));


			produits.add(produit);
		}

         }

        if(produitResultSet != null)
		produitResultSet.close();
        return produits;

	}

    public Produit loadAllByCode(int mycode) throws SQLException{
        ResultSet produitResultSet = Connect.loadAll("Select * from produit where code="+mycode);

               while(produitResultSet.next()){
                        Produit produit = new Produit();
      
                        produit.setStockMax(produitResultSet.getDouble("stockMax"));
                        produit.setStockMin(produitResultSet.getDouble("stockMin"));
                        produit.setSeuilAlert(produitResultSet.getDouble("seuilAlert"));
                        produit.setStockDispo(produitResultSet.getDouble("stock"));
			return produit;
		}
        return null;
    }


     public List<Produit> loadAllByCode(List<Integer> listCode, int codefor) throws SQLException{
          produits.clear();
          ResultSet produitResultSet = null;
          ResultSet catalogueResultSet=null;
		       for (Integer mycode : listCode) {
               produitResultSet = Connect.loadAll("Select * from produit where code="+mycode);
               catalogueResultSet = Connect.loadAll("Select * from catalogueitem where codeproduit="+mycode+" and codefournisseur="+codefor);


               while(produitResultSet.next() && catalogueResultSet.next()){
                        Produit produit = new Produit();
                        produit.setCode(produitResultSet.getInt("code"));
                        produit.setLibelle(produitResultSet.getString("libelle"));
                        produit.setFamille(produitResultSet.getString("famille"));
                        produit.setCategorie(produitResultSet.getString("categorie"));

                        produit.setUnite(produitResultSet.getString("unite"));
                        produit.setStockMax(produitResultSet.getDouble("stockMax"));
                        produit.setStockMin(produitResultSet.getDouble("stockMin"));
                        produit.setSeuilAlert(produitResultSet.getDouble("seuilAlert"));
                        produit.setPrix(catalogueResultSet.getDouble("prix"));
                        produit.setTva(catalogueResultSet.getDouble("tva"));

			produits.add(produit);
		}

         }

        if(produitResultSet != null)
		produitResultSet.close();
        return produits;

	}


	public List<Produit> loadAllForCatalogue() throws SQLException{
		ResultSet produitsResultSet = Connect.loadAll("Select code, libelle,unite from produit");
        produits.clear();
		Produit produit;
		while(produitsResultSet.next()){
			produit = new Produit();
			produit.setLibelle(produitsResultSet.getString("libelle"));
			produit.setCode(produitsResultSet.getInt("code"));
            produit.setUnite(produitsResultSet.getString("unite"));

			produits.add(produit);
		}

		produitsResultSet.close();
        return produits;

	}


	public int save(Produit produit) throws SQLException{
		String requete = "INSERT INTO produit(`famille`, `categorie`, `description`, `unite`, `stockMin`," +
                " `seuilAlert`, `stockMax`, `libelle`) VALUES('"+produit.getFamille()+"', '"+produit.getCategorie()+"', '"+
                produit.getDescription()+"', '"+produit.getUnite()+"', "+produit.getStockMin()+", "
                +produit.getSeuilAlert()+", "+produit.getStockMax()+", '"+produit.getLibelle()+"')";
		return Connect.exec(requete);
	}

	public void delete(Produit produit) throws SQLException{
		String req = "DELETE FROM produit WHERE code ="+produit.getCode();
		Connect.exec(req);
	}

    public void update(int codeProduit, double quantite) throws SQLException{
		String req = "UPDATE  produit SET stock=stock+"+quantite+" WHERE code ="+codeProduit;
        System.out.println(req);
        Connect.exec(req);
	}



}
