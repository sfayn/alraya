/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author MoulayYounesSama
 */
public class CatalogueItem {
    private int code;
    private int codeProduit;
    private int codeFournisseur;
    private double prix;
    private double tva;



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public int getCodeFournisseur() {
        return codeFournisseur;
    }

    public void setCodeFournisseur(int codeFournisseur) {
        this.codeFournisseur = codeFournisseur;
    }

    public int getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(int codeProduit) {
        this.codeProduit = codeProduit;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }
    



}
