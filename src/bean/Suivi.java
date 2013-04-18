/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

/**
 *
 * @author MoulayYounesSama
 */
public class Suivi {
    private int id;
    private int code;
    private int risque;
    private String motif;
    private String attention;
    private String observation;
    private int bloque;
    private String type;
    private String dateSuivi;
    private String interesse;

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }


    

    public String getDateSuivi() {
        return dateSuivi;
    }

    public void setDateSuivi(String dateSuivi) {
        this.dateSuivi = dateSuivi;
    }

   

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    


    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public int getRisque() {
        return risque;
    }

    public void setRisque(int risque) {
        this.risque = risque;
    }

    @Override
    public String toString() {
        return "date ="+dateSuivi+" code ="+code+" observation="+observation+" bloque ="+bloque+" type ="+type;
    }

    

}
