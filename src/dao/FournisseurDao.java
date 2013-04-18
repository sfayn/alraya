package dao;
import bean.Fournisseur;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class FournisseurDao {

    private List<Fournisseur> fournissuers = new ArrayList<Fournisseur>();
	public int save(Fournisseur fournisseur) throws SQLException{
		String requete = "INSERT INTO fournisseur(`societe`, `formeJuridique`, `personneContacter`, " +
                "`adress1`, `adress2`, `codePostal`, `ville`, `pays`, `telStandard`," +
                " `telCommercial`, `telTechnique`, `telSav`, `fax1`, `fax2`, `telx`, `email`," +
                " `siteWeb`, `activite`) VALUES ('"+fournisseur.getSociete()+"'," +
                " '"+fournisseur.getFormeJuridique()+"', '"+fournisseur.getPersonneContacter()+"', '" +
                fournisseur.getAdress1()+"', '"+fournisseur.getAdress2()+"', "+fournisseur.getCodePostal()+", '" +
                fournisseur.getVille()+"', '"+fournisseur.getPays()+"',"+fournisseur.getTelStandard()+","
                +fournisseur.getTelCommercial()+","+fournisseur.getTelTechnique()+","+fournisseur.getTelSav()+
                ","+fournisseur.getFax1()+","+fournisseur.getFax2()+","+fournisseur.getTelx()+
                ", '"+fournisseur.getEmail()+"', '"+fournisseur.getSiteWeb()+"', '"+fournisseur.getActivite()+"')";

        System.out.println(requete);
        return Connect.exec(requete);
	}



    public List<Fournisseur> loadAllForCatalogue() throws SQLException{
		ResultSet fournisseursResultSet = Connect.loadAll("Select code, societe from fournisseur where statut='Actif'");
		Fournisseur fournisseur;
        fournissuers.clear();
		while(fournisseursResultSet.next()){
			fournisseur = new Fournisseur();
			fournisseur.setSociete(fournisseursResultSet.getString("societe"));
			fournisseur.setCode(fournisseursResultSet.getInt("code"));

            System.out.println(fournisseur);
			fournissuers.add(fournisseur);
		}

		fournisseursResultSet.close();
        return fournissuers;

	}



     public List<Fournisseur> loadAll(String requette) throws SQLException{
		ResultSet fournisseursResultSet = Connect.loadAll(requette);
		Fournisseur fournisseur;
        fournissuers.clear();
		while(fournisseursResultSet.next()){
			fournisseur = new Fournisseur();
            fournisseur.setCode(fournisseursResultSet.getInt("code"));
			fournisseur.setSociete(fournisseursResultSet.getString("societe"));
			fournisseur.setFormeJuridique(fournisseursResultSet.getString("formeJuridique"));
            fournisseur.setPersonneContacter(fournisseursResultSet.getString("personneContacter"));
            fournisseur.setAdress1(fournisseursResultSet.getString("adress1"));
            fournisseur.setTelStandard(new Integer(fournisseursResultSet.getString("telStandard")));
            fournisseur.setStatut(fournisseursResultSet.getString("statut"));

        //    System.out.println(fournisseur);
			fournissuers.add(fournisseur);
		}

		fournisseursResultSet.close();
        return fournissuers;

	}


     public List<Fournisseur> loadAll() throws SQLException{
		ResultSet fournisseursResultSet = Connect.loadAll("Select * from fournisseur");
		Fournisseur fournisseur;
        fournissuers.clear();
		while(fournisseursResultSet.next()){
			fournisseur = new Fournisseur();
            fournisseur.setCode(fournisseursResultSet.getInt("code"));
			fournisseur.setSociete(fournisseursResultSet.getString("societe"));
			fournisseur.setFormeJuridique(fournisseursResultSet.getString("formeJuridique"));
            fournisseur.setPersonneContacter(fournisseursResultSet.getString("personneContacter"));
            fournisseur.setAdress1(fournisseursResultSet.getString("adress1"));
            fournisseur.setTelStandard(new Integer(fournisseursResultSet.getString("telStandard")));
            fournisseur.setStatut(fournisseursResultSet.getString("statut"));

          //  System.out.println(fournisseur);
			fournissuers.add(fournisseur);
		}

		fournisseursResultSet.close();
        return fournissuers;

	}

     public List<Fournisseur> loadAllByCode(List<Integer> listCode,int codeProduit) throws SQLException{
          fournissuers.clear();
          ResultSet fournisseursResultSet = null;
          ResultSet catalogueResultSet = null;
		       for (Integer mycode : listCode) {
               fournisseursResultSet = Connect.loadAll("Select * from fournisseur where code="+mycode);
               catalogueResultSet = Connect.loadAll("Select * from catalogueItem where codefournisseur="+mycode+" and codeproduit="+codeProduit);

               Fournisseur fournisseur;

                while(fournisseursResultSet.next() && catalogueResultSet.next()){
                    fournisseur = new Fournisseur();
                    fournisseur.setCode(fournisseursResultSet.getInt("code"));
                    fournisseur.setSociete(fournisseursResultSet.getString("societe"));
                    fournisseur.setFormeJuridique(fournisseursResultSet.getString("formeJuridique"));
                    fournisseur.setPersonneContacter(fournisseursResultSet.getString("personneContacter"));
                    fournisseur.setAdress1(fournisseursResultSet.getString("adress1"));
                    fournisseur.setTelStandard(new Integer(fournisseursResultSet.getString("telStandard")));
                    fournisseur.setPrix(catalogueResultSet.getDouble("prix"));
                    fournisseur.setTva(catalogueResultSet.getDouble("tva"));
                 //   System.out.println(fournisseur);
                    fournissuers.add(fournisseur);
                }

         }

        if(fournisseursResultSet!=null)
		fournisseursResultSet.close();
        return fournissuers;

	}


    public void update(int code) throws SQLException{
	String requete = "UPDATE fournisseur SET statut='Bloque' WHERE code="+code ;
        System.out.println(requete);
        Connect.exec(requete);
	}


    public void debloque(int code) throws SQLException{
	String requete = "UPDATE fournisseur SET statut='Actif' WHERE code="+code ;
        System.out.println(requete);
        Connect.exec(requete);
	}


    
}
