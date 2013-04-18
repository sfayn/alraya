/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author MoulayYounesSama
 */
public class Produit {
    private int code;
    private String libelle;
	private String famille;
	private String categorie;
	private String description;
	private String unite;
	private double stockMin;
	private double seuilAlert;
	private double stockMax;
    private double prix;
    private double tva;
    private double stockDispo;

    public double getStockDispo() {
        return stockDispo;
    }

    public void setStockDispo(double stockDispo) {
        this.stockDispo = stockDispo;
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

    

    @Override
    public String toString() {
        return "proddd :code ="+code;
    }


      public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

   
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

   
    public double getSeuilAlert() {
        return seuilAlert;
    }

    public void setSeuilAlert(double seuilAlert) {
        this.seuilAlert = seuilAlert;
    }

    public double getStockMax() {
        return stockMax;
    }

    public void setStockMax(double stockMax) {
        this.stockMax = stockMax;
    }

    public double getStockMin() {
        return stockMin;
    }

    public void setStockMin(double stockMin) {
        this.stockMin = stockMin;
    }

   
    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }




}
