import java.text.ParseException;
import java.util.Date;
import java.io.*;
import java.text.SimpleDateFormat;

/**
 * Un oggetto della classe <code>Utente</code> rappresenta
 * un utente, con ruolo e dati anagrafici.
 *
 * @author Kristian Matanaj
 * @version 1.0
 */

public class Utente {

    //CAMPI

    private Date datanascita;
    private String nome;
    private String cognome;
    private String username;
    private String password;
    private String indirizzo;
    private Ruoli ruolo;
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    //COSTRUTTORI

    /**
     * Costruisce un oggetto che rappresenta il cliente
     * con i suoi dati anagrafici e il ruolo di default "CLIENTE"
     * @param datanascita la data di nascita dell'utente
     * @param nome è il nome dell'utente
     * @param cognome è il cognome dell'utente
     * @param username è lo username dell'utente
     * @param password è la password scelta dall'utente
     * @param indirizzo è l'indirizzo dove l'utente è locato
     */

    public Utente (String datanascita,String nome, String cognome, String username, String password, String indirizzo) throws IOException, ParseException {

        this.datanascita = formatter.parse(datanascita);
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.password = password;//mofifica per farlo
        this.indirizzo = indirizzo;
        this.ruolo = Ruoli.valueOf("CLIENTE");
        //Salvo l'oggetto utente nel file
        File f= new File("utenti.csv");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(nome+","+cognome+","+username+","+password+","+datanascita+","+indirizzo+","+ruolo);

    }
    /**
     * Costruisce un oggetto che rappresenta il cliente
     * con i suoi dati anagrafici e il ruolo inserito come parametro
     * @param datanascita la data di nascita dell'utente
     * @param nome è il nome dell'utente
     * @param cognome è il cognome dell'utente
     * @param username è lo username dell'utente
     * @param password è la password scelta dall'utente
     * @param indirizzo è l'indirizzo dove l'utente è locato
     * @param ruolo è il ruolo che assegnamo al cliente
     */
    public Utente (Date datanascita,String nome, String cognome, String username, String password, String indirizzo, String ruolo) throws IOException {

        this.datanascita = datanascita;
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.password = password;//mofifica per farlo
        this.indirizzo = indirizzo;
        this.ruolo = Ruoli.valueOf(ruolo);
        //Salvo l'oggetto utente nel file
        File f= new File("utenti.csv");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(nome+","+cognome+","+username+","+password+","+datanascita+","+indirizzo+","+ruolo);

    }


    //METODI
    /**
     * Restituisce la data di nascita
     * @return la data di nascita
     */
    public Date getDatanascita() {
        return datanascita;
    }

    /**
     * imposta la data di nascita
     * @param datanascita la data di nascita
     */
    public void setDatanascita(Date datanascita) {
        this.datanascita = datanascita;
    }

    /**
     * Restituisce il nome
     * @return il nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * imposta il nome
     * @param nome il nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il cognome
     * @return il cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * imposta il cogome
     * @param cognome il cognome
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Restituisce lo username
     * @return lo username
     */
    public String getUsername() {
        return username;
    }

    /**
     * imposta lo username
     * @param username l'username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Restituisce la password
     * @return la password
     */
    public String getPassword() {
        return password;
    }

    /**
     * imposta la password
     * @param password la password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Restituisce l'indirizzo
     * @return l'indirizzo
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * imposta l'indirizzo
     * @param indirizzo l'indirizzo
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     * Restituisce il ruolo
     * @return il ruolo
     */
    public Ruoli getRuolo() {
        return ruolo;
    }


/**
 * imposta il ruolo
 * @param ruolo il ruolo
 */
    public void setRuolo(String ruolo) {
        this.ruolo = Ruoli.valueOf(ruolo);
    }
}
