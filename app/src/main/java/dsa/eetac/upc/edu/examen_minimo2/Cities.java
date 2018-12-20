package dsa.eetac.upc.edu.examen_minimo2;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import dsa.eetac.upc.edu.examen_minimo2.Element;
import dsa.eetac.upc.edu.examen_minimo2.Referency;

public class Cities {

    @SerializedName("nom")
    @Expose
    private String nom;
    @SerializedName("machinename")
    @Expose
    private String machinename;
    @SerializedName("descripcio")
    @Expose
    private String descripcio;
    @SerializedName("paraules_clau")
    @Expose
    private List<String> paraulesClau = null;
    @SerializedName("llicencia")
    @Expose
    private String llicencia;
    @SerializedName("freq_actualitzacio")
    @Expose
    private int freqActualitzacio;

    @SerializedName("sector")
    @Expose
    private List<String> sector = null;

    @SerializedName("tema")
    @Expose
    private List<String> tema = null;

    @SerializedName("responsable")
    @Expose
    private String responsable;

    @SerializedName("idioma")
    @Expose
    private String idioma;

    @SerializedName("home_page")
    @Expose
    private String homePage;

    @SerializedName("referencies")
    @Expose
    private List<Referency> referencies = null;

    @SerializedName("tipus")
    @Expose
    private String tipus;

    @SerializedName("estat")
    @Expose
    private String estat;

    @SerializedName("creacio")
    @Expose
    private String creacio;

    @SerializedName("modificacio")
    @Expose
    private String modificacio;

    @SerializedName("entitats")
    @Expose
    private int entitats;

    @SerializedName("elements")
    @Expose
    private List<Element> elements = null;

    @SerializedName("cache")
    @Expose
    private String cache;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cities() {
    }

    /**
     * 
     * @param sector
     * @param responsable
     * @param machinename
     * @param cache
     * @param referencies
     * @param idioma
     * @param tema
     * @param llicencia
     * @param nom
     * @param creacio
     * @param estat
     * @param paraulesClau
     * @param descripcio
     * @param freqActualitzacio
     * @param entitats
     * @param elements
     * @param tipus
     * @param homePage
     * @param modificacio
     */
    public Cities(String nom, String machinename, String descripcio, List<String> paraulesClau, String llicencia, int freqActualitzacio, List<String> sector, List<String> tema, String responsable, String idioma, String homePage, List<Referency> referencies, String tipus, String estat, String creacio, String modificacio, int entitats, List<Element> elements, String cache) {
        super();
        this.nom = nom;
        this.machinename = machinename;
        this.descripcio = descripcio;
        this.paraulesClau = paraulesClau;
        this.llicencia = llicencia;
        this.freqActualitzacio = freqActualitzacio;
        this.sector = sector;
        this.tema = tema;
        this.responsable = responsable;
        this.idioma = idioma;
        this.homePage = homePage;
        this.referencies = referencies;
        this.tipus = tipus;
        this.estat = estat;
        this.creacio = creacio;
        this.modificacio = modificacio;
        this.entitats = entitats;
        this.elements = elements;
        this.cache = cache;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Cities withNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getMachinename() {
        return machinename;
    }

    public void setMachinename(String machinename) {
        this.machinename = machinename;
    }

    public Cities withMachinename(String machinename) {
        this.machinename = machinename;
        return this;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public Cities withDescripcio(String descripcio) {
        this.descripcio = descripcio;
        return this;
    }

    public List<String> getParaulesClau() {
        return paraulesClau;
    }

    public void setParaulesClau(List<String> paraulesClau) {
        this.paraulesClau = paraulesClau;
    }

    public Cities withParaulesClau(List<String> paraulesClau) {
        this.paraulesClau = paraulesClau;
        return this;
    }

    public String getLlicencia() {
        return llicencia;
    }

    public void setLlicencia(String llicencia) {
        this.llicencia = llicencia;
    }

    public Cities withLlicencia(String llicencia) {
        this.llicencia = llicencia;
        return this;
    }

    public int getFreqActualitzacio() {
        return freqActualitzacio;
    }

    public void setFreqActualitzacio(int freqActualitzacio) {
        this.freqActualitzacio = freqActualitzacio;
    }

    public Cities withFreqActualitzacio(int freqActualitzacio) {
        this.freqActualitzacio = freqActualitzacio;
        return this;
    }

    public List<String> getSector() {
        return sector;
    }

    public void setSector(List<String> sector) {
        this.sector = sector;
    }

    public Cities withSector(List<String> sector) {
        this.sector = sector;
        return this;
    }

    public List<String> getTema() {
        return tema;
    }

    public void setTema(List<String> tema) {
        this.tema = tema;
    }

    public Cities withTema(List<String> tema) {
        this.tema = tema;
        return this;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Cities withResponsable(String responsable) {
        this.responsable = responsable;
        return this;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Cities withIdioma(String idioma) {
        this.idioma = idioma;
        return this;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public Cities withHomePage(String homePage) {
        this.homePage = homePage;
        return this;
    }

    public List<Referency> getReferencies() {
        return referencies;
    }

    public void setReferencies(List<Referency> referencies) {
        this.referencies = referencies;
    }

    public Cities withReferencies(List<Referency> referencies) {
        this.referencies = referencies;
        return this;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public Cities withTipus(String tipus) {
        this.tipus = tipus;
        return this;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public Cities withEstat(String estat) {
        this.estat = estat;
        return this;
    }

    public String getCreacio() {
        return creacio;
    }

    public void setCreacio(String creacio) {
        this.creacio = creacio;
    }

    public Cities withCreacio(String creacio) {
        this.creacio = creacio;
        return this;
    }

    public String getModificacio() {
        return modificacio;
    }

    public void setModificacio(String modificacio) {
        this.modificacio = modificacio;
    }

    public Cities withModificacio(String modificacio) {
        this.modificacio = modificacio;
        return this;
    }

    public int getEntitats() {
        return entitats;
    }

    public void setEntitats(int entitats) {
        this.entitats = entitats;
    }

    public Cities withEntitats(int entitats) {
        this.entitats = entitats;
        return this;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public Cities withElements(List<Element> elements) {
        this.elements = elements;
        return this;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public Cities withCache(String cache) {
        this.cache = cache;
        return this;
    }

}
