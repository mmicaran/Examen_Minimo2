
package dsa.eetac.upc.edu.examen_minimo2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GrupAjuntament {

    @SerializedName("adreca-completa")
    @Expose
    private String adrecaCompleta;
    @SerializedName("adreca")
    @Expose
    private String adreca;
    @SerializedName("codi_postal")
    @Expose
    private String codiPostal;
    @SerializedName("localitzacio")
    @Expose
    private String localitzacio;
    @SerializedName("telefon_contacte")
    @Expose
    private String telefonContacte;
    @SerializedName("fax")
    @Expose
    private String fax;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("url_general")
    @Expose
    private String urlGeneral;
    @SerializedName("cif")
    @Expose
    private String cif;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GrupAjuntament() {
    }

    /**
     * 
     * @param urlGeneral
     * @param fax
     * @param telefonContacte
     * @param cif
     * @param adreca
     * @param email
     * @param localitzacio
     * @param adrecaCompleta
     * @param codiPostal
     */
    public GrupAjuntament(String adrecaCompleta, String adreca, String codiPostal, String localitzacio, String telefonContacte, String fax, String email, String urlGeneral, String cif) {
        super();
        this.adrecaCompleta = adrecaCompleta;
        this.adreca = adreca;
        this.codiPostal = codiPostal;
        this.localitzacio = localitzacio;
        this.telefonContacte = telefonContacte;
        this.fax = fax;
        this.email = email;
        this.urlGeneral = urlGeneral;
        this.cif = cif;
    }

    public String getAdrecaCompleta() {
        return adrecaCompleta;
    }

    public void setAdrecaCompleta(String adrecaCompleta) {
        this.adrecaCompleta = adrecaCompleta;
    }

    public GrupAjuntament withAdrecaCompleta(String adrecaCompleta) {
        this.adrecaCompleta = adrecaCompleta;
        return this;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public GrupAjuntament withAdreca(String adreca) {
        this.adreca = adreca;
        return this;
    }

    public String getCodiPostal() {
        return codiPostal;
    }

    public void setCodiPostal(String codiPostal) {
        this.codiPostal = codiPostal;
    }

    public GrupAjuntament withCodiPostal(String codiPostal) {
        this.codiPostal = codiPostal;
        return this;
    }

    public String getLocalitzacio() {
        return localitzacio;
    }

    public void setLocalitzacio(String localitzacio) {
        this.localitzacio = localitzacio;
    }

    public GrupAjuntament withLocalitzacio(String localitzacio) {
        this.localitzacio = localitzacio;
        return this;
    }

    public String getTelefonContacte() {
        return telefonContacte;
    }

    public void setTelefonContacte(String telefonContacte) {
        this.telefonContacte = telefonContacte;
    }

    public GrupAjuntament withTelefonContacte(String telefonContacte) {
        this.telefonContacte = telefonContacte;
        return this;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public GrupAjuntament withFax(String fax) {
        this.fax = fax;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GrupAjuntament withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUrlGeneral() {
        return urlGeneral;
    }

    public void setUrlGeneral(String urlGeneral) {
        this.urlGeneral = urlGeneral;
    }

    public GrupAjuntament withUrlGeneral(String urlGeneral) {
        this.urlGeneral = urlGeneral;
        return this;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public GrupAjuntament withCif(String cif) {
        this.cif = cif;
        return this;
    }

}
