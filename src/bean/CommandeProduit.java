/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author MoulayYounesSama
 */
public class CommandeProduit {


    private int code;
    private int codeCommande;
    private int codeProduit;
    private String libelleProduit;
    private double montant;
    private double quantite;
    private String description;
    private String uniteMesur;
    private double quantiteLivree;

    public double getQuantiteLivree() {
        return quantiteLivree;
    }

    public void setQuantiteLivree(double quantiteLivree) {
        this.quantiteLivree = quantiteLivree;
    }


    

    public String getUniteMesur() {
        return uniteMesur;
    }

    public void setUniteMesur(String uniteMesur) {
        this.uniteMesur = uniteMesur;
    }



     public String getLibelleProduit() {
        return libelleProduit;
    }

    public void setLibelleProduit(String libelleProduit) {
        this.libelleProduit = libelleProduit;
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

    public int getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(int codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "code commande ="+codeCommande+" code Produit ="+codeProduit+
                " des"+description+" um"+uniteMesur+"libelle "+libelleProduit;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    

}
