package bean;

public class Client {

	private String societe;
	private int code;
	private  String formeJuridique;
	private String personneContacter;
	private String adress1;
    private String adress2;
	private int codePostal;
	private String ville;
	private String pays;
	private int telStandard;
	private int telCommercial;
	private int telTechnique;
	private int telSav;
	private int fax1;
	private int fax2;
	private int telx;
	private String email;
	private String siteWeb;
	private String risque;
	private String bloque;
	private String motif;
    private String attention;
	private String observation;
	private String activite;
    private String statut;

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }




    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

	public String getSociete() {
		return societe;
	}
	public int getCode() {
		return code;
	}
	public String getFormeJuridique() {
		return formeJuridique;
	}
	public String getPersonneContacter() {
		return personneContacter;
	}
	public String getAdress1() {
		return adress1;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public String getVille() {
		return ville;
	}
	public String getPays() {
		return pays;
	}
	public int getTelStandard() {
		return telStandard;
	}
	public int getTelCommercial() {
		return telCommercial;
	}
	public int getTelTechnique() {
		return telTechnique;
	}
	public int getTelSav() {
		return telSav;
	}
	public int getFax1() {
		return fax1;
	}
	public int getFax2() {
		return fax2;
	}
	public int getTelx() {
		return telx;
	}
	public String getEmail() {
		return email;
	}
	public String getSiteWeb() {
		return siteWeb;
	}
	public String getRisque() {
		return risque;
	}
	public String getBloque() {
		return bloque;
	}
	public String getMotif() {
		return motif;
	}

	public String getObservation() {
		return observation;
	}
	public String getActivite() {
		return activite;
	}
	public void setSociete(String societe) {
		this.societe = societe;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setFormeJuridique(String formeJuridique) {
		this.formeJuridique = formeJuridique;
	}
	public void setPersonneContacter(String personneContacter) {
		this.personneContacter = personneContacter;
	}
	public void setAdress1(String adress1) {
		this.adress1 = adress1;
	}
	public void setCodePostal(int codePostal) {}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public void setTelStandard(int telStandard) {
		this.telStandard = telStandard;
	}
	public void setTelCommercial(int telCommercial) {
		this.telCommercial = telCommercial;
	}
	public void setTelTechnique(int telTechnique) {
		this.telTechnique = telTechnique;
	}
	public void setTelSav(int telSav) {
		this.telSav = telSav;
	}
	public void setFax1(int fax1) {
		this.fax1 = fax1;
	}
	public void setFax2(int fax2) {
		this.fax2 = fax2;
	}
	public void setTelx(int telx) {
		this.telx = telx;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}
	public void setRisque(String risque) {
		this.risque = risque;
	}
	public void setBloque(String bloque) {
		this.bloque = bloque;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}
	public void setActivite(String activite) {
		this.activite = activite;
	}

	 public String getAdress2() {
                 return adress2;
         }

    public void setAdress2(String adress2) {
            this.adress2 = adress2;
        }

    @Override
    public String toString() {
        return "code "+code+" statut ="+statut;
    }



}
