import java.io.*;
import java.text.ParseException;
import java.util.Date;
import java.util.LinkedList;

public class Prenotazioni {

    //CAMPI
    private Proiezioni proiezioni = new Proiezioni();
    private LinkedList<String> prenotazioni;
    private File file= new File("data/prenotazioni.csv");
    private FileWriter fw = new FileWriter(file);
    private BufferedWriter bw = new BufferedWriter(fw);
    private FileReader fr = new FileReader(file);
    private BufferedReader br = new BufferedReader(fr);

    //COSTRUTTORI
    public Prenotazioni() throws IOException, ParseException {
        prenotazioni = new LinkedList<>();

        String[] colonne = new String[8];
        String riga;
        while ((riga = br.readLine()) != null) {
            String delim = ",";
            colonne = riga.split(delim);
            Film f = new Film(colonne[1], colonne[2], colonne[3], colonne[4], colonne[5], colonne[6], colonne[7], colonne[8]);
            String film = f.toString();

            prenotazioni.add(colonne[0] + "," + film);
        }

    }


    //METODI
    public void aggiungiPrenotazione(String username, String titolo, String data) throws IOException, ParseException {
        String informazioniFilm = proiezioni.cercaProiezioneConData(titolo, data).toString();

        prenotazioni.add(username + "," + informazioniFilm);

        bw.write(username + "," + informazioniFilm);
    }


    public Boolean trovaPrenotazione(String u) throws IOException {
        String[] colonne = new String[3];
        String riga;

        while ((riga = br.readLine()) != null) {
            colonne = riga.split(",");

            if (u.equals(colonne[1])) {
                System.out.println(colonne);
                return true;
            }
        }
        System.out.println("Nessuna prenotazione trovata");
        return false;

    }
}
