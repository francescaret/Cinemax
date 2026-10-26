import java.util.Date;
import java.io.*;
import java.text.SimpleDateformat;

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
    private String Nome;
    private String Cognome;
    private String Username;
    private String Password;
    private String Indirizzo;
    private Ruoli Ruolo;


    //COSTRUTTORI

    /**
     * Costruisce un oggetto che rappresenta il cliente
     * con i suoi dati anagrafici e il ruolo di default "CLIENTE"
     * @param datanascita la data di nascita dell'utente
     * @param Nome è il nome dell'utente
     * @param Cognome è il cognome dell'utente
     * @param Username è lo username dell'utente
     * @param Password è la password scelta dall'utente
     * @param Indirizzo è l'indirizzo dove l'utente è locato
     */

    public Utente (Date datanascita,String Nome, String Cognome, String Username, String Password, String Indirizzo) {

        this.datanascita = datanascita;
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.Username = Username;
        this.Password = Password;//mofifica per farlo
        this.Indirizzo = Indirizzo;
        //Salvo l'oggetto utente nel file
        File f= new File("utenti.csv");
        FileWriter fw = new FileWriter(fw);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(Nome+","+Cognome+","+Username+","+Password+","+datanascita+","+Indirizzo+","+Ruolo);

    }
    /**
     * Costruisce un oggetto che rappresenta il cliente
     * con i suoi dati anagrafici e il ruolo inserito come parametro
     * @param datanascita la data di nascita dell'utente
     * @param Nome è il nome dell'utente
     * @param Cognome è il cognome dell'utente
     * @param Username è lo username dell'utente
     * @param Password è la password scelta dall'utente
     * @param Indirizzo è l'indirizzo dove l'utente è locato
     * @param Ruolo è il ruolo che assegnamo al cliente
     */
    public Utente (Date datanascita,String Nome, String Cognome, String Username, String Password, String Indirizzo, Ruoli Ruolo) {

        this.datanascita = datanascita;
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.Username = Username;
        this.Password = Password;//mofifica per farlo
        this.Indirizzo = Indirizzo;
        this.Ruolo = Ruolo;
        //Salvo l'oggetto utente nel file
        File f= new File("utenti.csv");
        FileWriter fw = new FileWriter(fw);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(Nome+","+Cognome+","+Username+","+Password+","+datanascita+","+Indirizzo+","+Ruolo);

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
     * @param la data di nascita
     */
    public void setDatanascita(Date datanascita) {
        this.datanascita = datanascita;
    }

    /**
     * Restituisce il nome
     * @return il nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * imposta il nome
     * @param il nome
     */
    public void setNome(String nome) {
        Nome = nome;
    }

    /**
     * Restituisce il cognome
     * @return il cognome
     */
    public String getCognome() {
        return Cognome;
    }

    /**
     * imposta il cogome
     * @param il cognome
     */
    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    /**
     * Restituisce lo username
     * @return lo username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * imposta lo username
     * @param lo username
     */
    public void setUsername(String username) {
        Username = username;
    }

    /**
     * Restituisce la password
     * @return la password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * imposta la password
     * @param la password
     */
    public void setPassword(String password) {
        Password = password;
    }

    /**
     * Restituisce l'indirizzo
     * @return l'indirizzo
     */
    public String getIndirizzo() {
        return Indirizzo;
    }

    /**
     * imposta l'indirizzo
     * @param l'indirizzo
     */
    public void setIndirizzo(String indirizzo) {
        Indirizzo = indirizzo;
    }

    /**
     * Restituisce il ruolo
     * @return il ruolo
     */
    public Ruoli getRuolo() {
        return Ruolo;
    }

}
/**
 * imposta il ruolo
 * @param il ruolo
 */
    public void setRuolo(Ruoli ruolo) {
        Ruolo = ruolo;
    }
}