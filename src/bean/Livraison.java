/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author MoulayYounesSama
 */
public class Livraison {
    private int code;
    private int codeCommande;
    private int codeSujet;
    private String sujet;
    private String responsable;
    private String dateLivraison;
    private String type;
    private double autre;
    private double montant;

    public double getAutre() {
        return autre;
    }

    public void setAutre(double autre) {
        this.autre = autre;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }


     public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCodeCommande() {
        return codeCommande;
    }

    public void setCodeCommande(int codeCommande) {
        this.codeCommande = codeCommande;
    }

    public int getCodeSujet() {
        return codeSujet;
    }

    public void setCodeSujet(int codeSujet) {
        this.codeSujet = codeSujet;
    }

    public String getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(String dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
