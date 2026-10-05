import java.util.Date;
import java.io.*;
import java.text.SimpleDateformat;
import java.text.ParseException;

/**
 * Un oggetto della classe <code>Film</code> rappresenta
 * Un film nella banca dati del cinema
 *
 * @author
 */

public class Film {

    //CAMPI

    private Date data_ora;
    private String titolo;
    private Generi genere;
    private String regista;
    private int anno;
    private int durata_minuti;
    private int eta_minima;
    private double prezzo_biglietto;

    //COSTRUTTORI

    /**
     * Costruisce un oggetto che rappresenta un film
     * Cercandolo nel file proiezioni.csv tramite il titolo fornito per parametro
     * @param t la stringa contenente il titolo del film
     */

    public Film (String t) throws IOException, ParseException{

    String delim=",";
    File f= new File("proiezioni.csv");
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    String[] colonne = new String[8];
    String riga;
     while ((riga = br.readLine()) != null) {
            colonne = riga.split(delim);

            if (t.equals(colonne[1])) {
                break;
            }
        }
        if (riga == null) {
            throw new IllegalArgumentException("Film non trovato");
        }
        this.data_ora = formatter.parse(colonne[0]);
        this.titolo = t;
        this.genere = Generi.valueOf(colonne[2]);
        this.regista = colonne[3];
        this.anno = Integer.parseInt(colonne[4]);
        this.durata_minuti = Integer.parseInt(colonne[5]);
        this.eta_minima = Integer.parseInt(colonne[6]);
        this.prezzo_biglietto = Double.parseDouble(colonne[7]);

    }


    //METODI
    /**
     * Restituisce le ore
     * @return le ore
     */
    public Date getData_ora() {
        return data_ora;
    }
    /**
     * Restituisce il titolo
     * @return il titolo
     */
    public String getTitolo() {
        return titolo;
    }
    /**
     * Restituisce il genere
     * @return il genere
     */
    public Generi getGenere() {
        return genere;
    }
    /**
     * Restituisce il regista
     * @return il regista
     */
    public String getRegista() {
        return regista;
    }
    /**
     * Restituisce l'anno
     * @return l'anno
     */
    public int getAnno() {
        return anno;
    }
    /**
     * Restituisce la durata in minuti del film
     * @return la durata in minuti del film
     */
    public int getDurata_minuti() {
        return durata_minuti;
    }
    /**
     * Restituisce l'età minima per il film
     * @return l'età minima per il film
     */
    public int getEta_minima() {
        return eta_minima;
    }
    /**
     * Restituisce il prezzo del biglietto
     * @return il prezzo del biglietto
     */
    public double getPrezzo_biglietto() {
        return prezzo_biglietto;
    }
    /**
     * Imposta la data e ora
     * @param la data e ora da impostare
     */
    public void setData_ora(Date data_ora) {
        this.data_ora = data_ora;
    }
    /**
     * Imposta il titolo del film
     * @param il nuovo titolo
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    /**
     * Imposta il genere del film
     * @param il nuovo genere
     */
    public void setGenere(Generi genere) {
        this.genere = genere;
    }
    /**
     * Imposta il regista del film
     * @param il nuovo regista
     */
    public void setRegista(String regista) {
        this.regista = regista;
    }
    /**
     * Imposta l'anno d'uscita
     * @param il nuovo anno d'uscita
     */
    public void setAnno(int anno) {
        this.anno = anno;
    }
    /**
     * Imposta la durata del film
     * @param la nuova durata del film
     */
    public void setDurata_minuti(int durata_minuti) {
        this.durata_minuti = durata_minuti;
    }
    /**
     * Imposta l'età minima del film
     * @param la nuova età minima del film
     */
    public void setEta_minima(int eta_minima) {
        this.eta_minima = eta_minima;
    }
    /**
     * Imposta il prezzo del biglietto
     * @param il nuovo prezzo
     */
    public void setPrezzo_biglietto(double prezzo_biglietto) {
        this.prezzo_biglietto = prezzo_biglietto;
    }
}