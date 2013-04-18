/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author MoulayYounesSama
 */
public class Commande {
    private int numero;
    private String date;
    private String responsable;
    private String modePaiment;
    private String echeance;
    private int societeClient;
    private String qui;
    private String type;
    private double montant;
    private double autre;
    private int livraison;

    public int getLivraison() {
        return livraison;
    }

    public void setLivraison(int livraison) {
        this.livraison = livraison;
    }

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
    

    public String getQui() {
        return qui;
    }

    public void setQui(String qui) {
        this.qui = qui;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSocieteClient() {
        return societeClient;
    }

    public void setSocieteClient(int societeClient) {
        this.societeClient = societeClient;
    }

   



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEcheance() {
        return echeance;
    }

    public void setEcheance(String echeance) {
        this.echeance = echeance;
    }

    public String getModePaiment() {
        return modePaiment;
    }

    public void setModePaiment(String modePaiment) {
        this.modePaiment = modePaiment;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "date "+date+" date echeance "+echeance+" numero "+numero+" soc =="+societeClient;
    }



}
