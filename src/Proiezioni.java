import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.io.*;

/**
 * Un oggetto della classe <code>Proiezieni</code> rappresenta
 * La lista di film attualmente in proiezione del cinema
 *
 * @author
 */

public class Proiezioni {
    //CAMPI
    private LinkedList<Film> proiezioni;
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    File proiezioniAttuali = new File("proiezioniAttuali.csv");
    FileWriter fw;

    {
        try {
            fw = new FileWriter(proiezioniAttuali);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    BufferedWriter bw = new BufferedWriter(fw);

    FileReader fr;

    {
        try {
            fr = new FileReader(proiezioniAttuali);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    BufferedReader br = new BufferedReader(fr);

    //COSTRUTTORI
    public Proiezioni() throws IOException, ParseException, FileNotFoundException {
        proiezioni = new LinkedList<Film>();



        String[] colonne = new String[8];
        String riga;
        while ((riga = br.readLine()) != null) {
            String delim = ",";
            colonne = riga.split(delim);
            Film f = new Film(colonne[0], colonne[1], colonne[2], colonne[3], colonne[4], colonne[5], colonne[6], colonne[7]);
            proiezioni.add(f);
        }

    }
    //METODI
    public void aggiungiProiezione(Date data, String titolo) throws IOException, ParseException {
        Film f = new Film(titolo);
        f.setData_ora(data);
        proiezioni.add(f);

        //bw.write(data_ora_proiezione+","+titolo_film+","genere+","+regista+","+anno+","+durata_minuti+","+eta_minima+","+prezzo_biglietto);
    }

    public void aggiungiProiezioneCustom(String data, String titolo, String genere, String regista, String anno, String durata, String eta_minima, String prezzo_biglietto) throws IOException, ParseException {
        Film f = new Film(data, titolo, genere, regista, anno, durata, eta_minima, prezzo_biglietto);
        proiezioni.add(f);

        //bw.write();
    }

    public void eliminaProiezione(String t) throws IOException {
        for (int i=0; i<proiezioni.size(); i++){
            if (t.equals(proiezioni.get(i).getTitolo())){
                proiezioni.remove(i);
            }
            else {
                System.out.print("Film non trovato");
            };
        }

    }

    public void modificaDataOra(String t, String d) throws FileNotFoundException, ParseException {
        for (int i = 0; i < proiezioni.size(); i++) {
            if (t.equals(proiezioni.get(i))) {
                proiezioni.get(i).setData_ora(formatter.parse(d));
            }
        }
    }
    public void modificaPrezzo_biglietto(String t, double pb) throws FileNotFoundException {
            for (int i=0; i<proiezioni.size(); i++){
                if (t.equals(proiezioni.get(i))){
                    proiezioni.get(i).setPrezzo_biglietto(pb);
                }
            }
        }
    public void visualizzaProiezioni() throws FileNotFoundException {
        for(int i=0; i<proiezioni.size();i++) {
            System.out.print(proiezioni.get(i));
        }
    }
    public Film cercaProiezione(String t) throws FileNotFoundException {
        for (int i = 0; i < proiezioni.size(); i++) {
            if (t.equals(proiezioni.get(i))) {
                return proiezioni.get(i);

            }
        }
        return null;
    }
    }