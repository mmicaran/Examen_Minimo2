
package dsa.eetac.upc.edu.examen_minimo2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GrupComarca {

    @SerializedName("comarca_codi")
    @Expose
    private String comarcaCodi;
    @SerializedName("comarca_nom")
    @Expose
    private String comarcaNom;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GrupComarca() {
    }

    /**
     * 
     * @param comarcaCodi
     * @param comarcaNom
     */
    public GrupComarca(String comarcaCodi, String comarcaNom) {
        super();
        this.comarcaCodi = comarcaCodi;
        this.comarcaNom = comarcaNom;
    }

    public String getComarcaCodi() {
        return comarcaCodi;
    }

    public void setComarcaCodi(String comarcaCodi) {
        this.comarcaCodi = comarcaCodi;
    }

    public GrupComarca withComarcaCodi(String comarcaCodi) {
        this.comarcaCodi = comarcaCodi;
        return this;
    }

    public String getComarcaNom() {
        return comarcaNom;
    }

    public void setComarcaNom(String comarcaNom) {
        this.comarcaNom = comarcaNom;
    }

    public GrupComarca withComarcaNom(String comarcaNom) {
        this.comarcaNom = comarcaNom;
        return this;
    }

}
