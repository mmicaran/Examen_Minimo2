
package dsa.eetac.upc.edu.examen_minimo2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Element {

    @SerializedName("ine")
    @Expose
    private String ine;
    @SerializedName("municipi_nom")
    @Expose
    private String municipiNom;
    @SerializedName("municipi_nom_curt")
    @Expose
    private String municipiNomCurt;
    @SerializedName("municipi_article")
    @Expose
    private String municipiArticle;
    @SerializedName("municipi_transliterat")
    @Expose
    private String municipiTransliterat;
    @SerializedName("municipi_curt_transliterat")
    @Expose
    private String municipiCurtTransliterat;
    @SerializedName("centre_municipal")
    @Expose
    private String centreMunicipal;
    @SerializedName("grup_comarca")
    @Expose
    private GrupComarca grupComarca;
    @SerializedName("grup_provincia")
    @Expose
    private GrupProvincia grupProvincia;
    @SerializedName("grup_ajuntament")
    @Expose
    private GrupAjuntament grupAjuntament;
    @SerializedName("municipi_escut")
    @Expose
    private String municipiEscut;
    @SerializedName("municipi_bandera")
    @Expose
    private String municipiBandera;
    @SerializedName("municipi_vista")
    @Expose
    private String municipiVista;
    @SerializedName("ine6")
    @Expose
    private String ine6;
    @SerializedName("nom_dbpedia")
    @Expose
    private String nomDbpedia;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Element() {
    }

    /**
     * 
     * @param municipiVista
     * @param municipiEscut
     * @param municipiNomCurt
     * @param ine
     * @param municipiBandera
     * @param nomDbpedia
     * @param municipiArticle
     * @param municipiTransliterat
     * @param centreMunicipal
     * @param municipiNom
     * @param ine6
     * @param municipiCurtTransliterat
     * @param grupAjuntament
     * @param grupComarca
     * @param grupProvincia
     */
    public Element(String ine, String municipiNom, String municipiNomCurt, String municipiArticle, String municipiTransliterat, String municipiCurtTransliterat, String centreMunicipal, GrupComarca grupComarca, GrupProvincia grupProvincia, GrupAjuntament grupAjuntament, String municipiEscut, String municipiBandera, String municipiVista, String ine6, String nomDbpedia) {
        super();
        this.ine = ine;
        this.municipiNom = municipiNom;
        this.municipiNomCurt = municipiNomCurt;
        this.municipiArticle = municipiArticle;
        this.municipiTransliterat = municipiTransliterat;
        this.municipiCurtTransliterat = municipiCurtTransliterat;
        this.centreMunicipal = centreMunicipal;
        this.grupComarca = grupComarca;
        this.grupProvincia = grupProvincia;
        this.grupAjuntament = grupAjuntament;
        this.municipiEscut = municipiEscut;
        this.municipiBandera = municipiBandera;
        this.municipiVista = municipiVista;
        this.ine6 = ine6;
        this.nomDbpedia = nomDbpedia;
    }

    public String getIne() {
        return ine;
    }

    public void setIne(String ine) {
        this.ine = ine;
    }

    public Element withIne(String ine) {
        this.ine = ine;
        return this;
    }

    public String getMunicipiNom() {
        return municipiNom;
    }

    public void setMunicipiNom(String municipiNom) {
        this.municipiNom = municipiNom;
    }

    public Element withMunicipiNom(String municipiNom) {
        this.municipiNom = municipiNom;
        return this;
    }

    public String getMunicipiNomCurt() {
        return municipiNomCurt;
    }

    public void setMunicipiNomCurt(String municipiNomCurt) {
        this.municipiNomCurt = municipiNomCurt;
    }

    public Element withMunicipiNomCurt(String municipiNomCurt) {
        this.municipiNomCurt = municipiNomCurt;
        return this;
    }

    public String getMunicipiArticle() {
        return municipiArticle;
    }

    public void setMunicipiArticle(String municipiArticle) {
        this.municipiArticle = municipiArticle;
    }

    public Element withMunicipiArticle(String municipiArticle) {
        this.municipiArticle = municipiArticle;
        return this;
    }

    public String getMunicipiTransliterat() {
        return municipiTransliterat;
    }

    public void setMunicipiTransliterat(String municipiTransliterat) {
        this.municipiTransliterat = municipiTransliterat;
    }

    public Element withMunicipiTransliterat(String municipiTransliterat) {
        this.municipiTransliterat = municipiTransliterat;
        return this;
    }

    public String getMunicipiCurtTransliterat() {
        return municipiCurtTransliterat;
    }

    public void setMunicipiCurtTransliterat(String municipiCurtTransliterat) {
        this.municipiCurtTransliterat = municipiCurtTransliterat;
    }

    public Element withMunicipiCurtTransliterat(String municipiCurtTransliterat) {
        this.municipiCurtTransliterat = municipiCurtTransliterat;
        return this;
    }

    public String getCentreMunicipal() {
        return centreMunicipal;
    }

    public void setCentreMunicipal(String centreMunicipal) {
        this.centreMunicipal = centreMunicipal;
    }

    public Element withCentreMunicipal(String centreMunicipal) {
        this.centreMunicipal = centreMunicipal;
        return this;
    }

    public GrupComarca getGrupComarca() {
        return grupComarca;
    }

    public void setGrupComarca(GrupComarca grupComarca) {
        this.grupComarca = grupComarca;
    }

    public Element withGrupComarca(GrupComarca grupComarca) {
        this.grupComarca = grupComarca;
        return this;
    }

    public GrupProvincia getGrupProvincia() {
        return grupProvincia;
    }

    public void setGrupProvincia(GrupProvincia grupProvincia) {
        this.grupProvincia = grupProvincia;
    }

    public Element withGrupProvincia(GrupProvincia grupProvincia) {
        this.grupProvincia = grupProvincia;
        return this;
    }

    public GrupAjuntament getGrupAjuntament() {
        return grupAjuntament;
    }

    public void setGrupAjuntament(GrupAjuntament grupAjuntament) {
        this.grupAjuntament = grupAjuntament;
    }

    public Element withGrupAjuntament(GrupAjuntament grupAjuntament) {
        this.grupAjuntament = grupAjuntament;
        return this;
    }

    public String getMunicipiEscut() {
        return municipiEscut;
    }

    public void setMunicipiEscut(String municipiEscut) {
        this.municipiEscut = municipiEscut;
    }

    public Element withMunicipiEscut(String municipiEscut) {
        this.municipiEscut = municipiEscut;
        return this;
    }

    public String getMunicipiBandera() {
        return municipiBandera;
    }

    public void setMunicipiBandera(String municipiBandera) {
        this.municipiBandera = municipiBandera;
    }

    public Element withMunicipiBandera(String municipiBandera) {
        this.municipiBandera = municipiBandera;
        return this;
    }

    public String getMunicipiVista() {
        return municipiVista;
    }

    public void setMunicipiVista(String municipiVista) {
        this.municipiVista = municipiVista;
    }

    public Element withMunicipiVista(String municipiVista) {
        this.municipiVista = municipiVista;
        return this;
    }

    public String getIne6() {
        return ine6;
    }

    public void setIne6(String ine6) {
        this.ine6 = ine6;
    }

    public Element withIne6(String ine6) {
        this.ine6 = ine6;
        return this;
    }

    public String getNomDbpedia() {
        return nomDbpedia;
    }

    public void setNomDbpedia(String nomDbpedia) {
        this.nomDbpedia = nomDbpedia;
    }

    public Element withNomDbpedia(String nomDbpedia) {
        this.nomDbpedia = nomDbpedia;
        return this;
    }

}
