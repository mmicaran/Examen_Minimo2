
package dsa.eetac.upc.edu.examen_minimo2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Referency {

    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("nom")
    @Expose
    private Object nom;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Referency() {
    }

    /**
     * 
     * @param nom
     * @param url
     */
    public Referency(Object url, Object nom) {
        super();
        this.url = url;
        this.nom = nom;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public Referency withUrl(Object url) {
        this.url = url;
        return this;
    }

    public Object getNom() {
        return nom;
    }

    public void setNom(Object nom) {
        this.nom = nom;
    }

    public Referency withNom(Object nom) {
        this.nom = nom;
        return this;
    }

}
