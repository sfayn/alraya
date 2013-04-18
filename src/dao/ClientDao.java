package dao;
import bean.Client;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




public class ClientDao {

    private List<Client> clients = new ArrayList<Client>();


   public List<Client> loadAll() throws SQLException{
		ResultSet fournisseursResultSet = Connect.loadAll("Select * from client");
		Client fournisseur;
        clients.clear();
		while(fournisseursResultSet.next()){
			fournisseur = new Client();
            fournisseur.setCode(fournisseursResultSet.getInt("code"));
			fournisseur.setSociete(fournisseursResultSet.getString("societe"));
			fournisseur.setFormeJuridique(fournisseursResultSet.getString("formeJuridique"));
            fournisseur.setPersonneContacter(fournisseursResultSet.getString("personneContacter"));
            fournisseur.setAdress1(fournisseursResultSet.getString("adress1"));
            fournisseur.setTelStandard(new Integer(fournisseursResultSet.getString("telStandard")));
            fournisseur.setStatut(fournisseursResultSet.getString("statut"));

          //  System.out.println(fournisseur);
			clients.add(fournisseur);
		}

		fournisseursResultSet.close();
        return clients;

	}

    public List<Client> loadAll(String requette) throws SQLException {
    	ResultSet fournisseursResultSet = Connect.loadAll(requette);
		Client fournisseur;
        clients.clear();
		while(fournisseursResultSet.next()){
			fournisseur = new Client();
            fournisseur.setCode(fournisseursResultSet.getInt("code"));
			fournisseur.setSociete(fournisseursResultSet.getString("societe"));
			fournisseur.setFormeJuridique(fournisseursResultSet.getString("formeJuridique"));
            fournisseur.setPersonneContacter(fournisseursResultSet.getString("personneContacter"));
            fournisseur.setAdress1(fournisseursResultSet.getString("adress1"));
            fournisseur.setTelStandard(new Integer(fournisseursResultSet.getString("telStandard")));
            fournisseur.setStatut(fournisseursResultSet.getString("statut"));

          //  System.out.println(fournisseur);
			clients.add(fournisseur);
		}

		fournisseursResultSet.close();
        return clients;
    }

 


    public void save(Client fournisseur) throws SQLException{
	String requete = "INSERT INTO client(`societe`, `formeJuridique`, `personneContacter`, " +
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
        Connect.exec(requete);
	}

    public void update(int code) throws SQLException{
	String requete = "UPDATE client SET statut='Bloque' WHERE code="+code ;
        System.out.println(requete);
        Connect.exec(requete);
	}

     public void debloque(int code) throws SQLException{
	String requete = "UPDATE client SET statut='Actif' WHERE code="+code ;
        System.out.println(requete);
        Connect.exec(requete);
	}

        public List<Client> loadAllForCombo() throws SQLException{
		ResultSet clientsResultSet = Connect.loadAll("Select code, societe from client where statut='Actif'");
        clients.clear();
		Client client;
		while(clientsResultSet.next()){
			client = new Client();
			client.setSociete(clientsResultSet.getString("societe"));
			client.setCode(clientsResultSet.getInt("code"));

			clients.add(client);
		}

		clientsResultSet.close();
        return clients;
		
	}

}
