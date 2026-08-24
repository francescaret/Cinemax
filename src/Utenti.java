import java.util.Date;
import java.io.*;
import java.text.SimpleDateformat;

public class Utenti {

    //CAMPI

    private Date datanascita;
    private String Nome;
    private String Cognome;
    private String Username;
    private String Password;
    private String Indirizzo;
    private Ruoli Ruolo;


    //COSTRUTTORI
    public Utenti (Date datanascita,String Nome, String Cognome, String Username, String Password, String Indirizzo, Ruoli Ruolo) throws IOException {

        this.datanascita = datanascita;
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.Username = Username;
        this.Password = Password;//mofifica per farlo
        this.Indirizzo = Indirizzo;
        this.Ruolo = "CLIENTE";
        //Salvo l'oggetto utente nel file
        File f= new File("utenti.csv");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(Nome+","+Cognome+","+Username+","+Password+","+datanascita+","+Indirizzo+","+Ruolo);

    }


    //METODI

    public Date getDatanascita() {
        return datanascita;
    }

    public void setDatanascita(Date datanascita) {
        this.datanascita = datanascita;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getIndirizzo() {
        return Indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        Indirizzo = indirizzo;
    }

    public Ruoli getRuolo() {
        return Ruolo;
    }

    public void setRuolo(Ruoli ruolo) {
        Ruolo = ruolo;
    }
}