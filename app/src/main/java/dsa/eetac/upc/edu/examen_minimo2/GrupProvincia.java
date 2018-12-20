
package dsa.eetac.upc.edu.examen_minimo2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GrupProvincia {

    @SerializedName("provincia_codi")
    @Expose
    private String provinciaCodi;
    @SerializedName("provincia_nom")
    @Expose
    private String provinciaNom;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GrupProvincia() {
    }

    /**
     * 
     * @param provinciaNom
     * @param provinciaCodi
     */
    public GrupProvincia(String provinciaCodi, String provinciaNom) {
        super();
        this.provinciaCodi = provinciaCodi;
        this.provinciaNom = provinciaNom;
    }

    public String getProvinciaCodi() {
        return provinciaCodi;
    }

    public void setProvinciaCodi(String provinciaCodi) {
        this.provinciaCodi = provinciaCodi;
    }

    public GrupProvincia withProvinciaCodi(String provinciaCodi) {
        this.provinciaCodi = provinciaCodi;
        return this;
    }

    public String getProvinciaNom() {
        return provinciaNom;
    }

    public void setProvinciaNom(String provinciaNom) {
        this.provinciaNom = provinciaNom;
    }

    public GrupProvincia withProvinciaNom(String provinciaNom) {
        this.provinciaNom = provinciaNom;
        return this;
    }

}
