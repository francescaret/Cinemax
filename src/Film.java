import java.util.Date;
import java.io.*;
import java.text.SimpleDateformat;
import java.text.ParseException;

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
    public Film (String t) throws IOException, ParseException{

    String delim=",";
    File f= new File("proiezioni.csv");
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    String[] colonne = new String[8];
    String riga;
    //cerca la riga con il titolo uguale a quella passata come parametro, split restituisce un array di stringhe
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

    public Date getData_ora() {
        return data_ora;
    }

    public String getTitolo() {
        return titolo;
    }

    public Generi getGenere() {
        return genere;
    }

    public String getRegista() {
        return regista;
    }

    public int getAnno() {
        return anno;
    }

    public int getDurata_minuti() {
        return durata_minuti;
    }

    public int getEta_minima() {
        return eta_minima;
    }

    public double getPrezzo_biglietto() {
        return prezzo_biglietto;
    }

    public void setData_ora(Date data_ora) {
        this.data_ora = data_ora;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setGenere(Generi genere) {
        this.genere = genere;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setDurata_minuti(int durata_minuti) {
        this.durata_minuti = durata_minuti;
    }

    public void setEta_minima(int eta_minima) {
        this.eta_minima = eta_minima;
    }

    public void setPrezzo_biglietto(double prezzo_biglietto) {
        this.prezzo_biglietto = prezzo_biglietto;
    }
}