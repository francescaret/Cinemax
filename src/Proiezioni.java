import java.util.*;
import java

/**
 * Un oggetto della classe <code>Proiezieni</code> rappresenta
 * La lista di film attualmente in proiezione del cinema
 *
 * @author
 */

public class Proiezioni {
    //CAMPI
    private LinkedList<Film> proiezioni;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    File proiezioniAttuali = new File("proiezioniAttuali.csv");
    FileWriter fw = new FileWriter(proiezioniAttuali);
    BufferedWriter bw = new BufferedWriter(fw);

    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);


    //COSTRUTTORI
    public Proiezioni() {
        proiezioni = new LinkedList<Film>();

        String[] colonne = new String[8];
        String riga;
        while ((riga = br.readLine()) != null) {
            colonne = riga.split(delim);
            Film f = new Film(colonne[0], colonne[1], colonne[2], colonne[3], colonne[4], colonne[5], colonne[6], colonne[7]);
            proiezioni.add(f);
        }

    }
    //METODI
    public aggiungiProiezione(Date data, String titolo) {
        Film f = new Film(t);
        f.setData_ora(data);
        proiezioni.add(f);

        bw.write(data_ora_proiezione+","+titolo_film+","genere+","+regista+","+anno+","+durata_minuti+","+eta_minima+","+prezzo_biglietto);
    }
    public eliminaProiezione(String t) {
        for (int i=0; i<proiezioni.size(); i++){
            if (t.equals(proiezioni.get(i))){
                List<String> lines = Files.readAllLines(Paths.get("proiezioniAttuali.csv"));
                lines.removeIf(line -> line.trim().equals(proiezioni.get(i).toString));
                Files.write(Paths.get("myFile.txt"), lines);
                proiezioni.remove(i);
            }
            else {
                System.out.print("Film non trovato");
            };
        }
    }

    public modificaDataOra(String t; Date d) {
        for (int i = 0; i < proiezioni.size(); i++) {
            if (t.equals(proiezioni.get(i))) {
                proiezioni.get(i).setData_Ora(formatter.parse(d));
            }
        }
    }
    public modificaPrezzo_biglietto(String t; double pb) {
            for (int i=0; i<proiezioni.size(); i++){
                if (t.equals(proiezioni.get(i))){
                    proiezioni.get(i).setPrezzo_biglietto(pb);
                }
            }
        }
    public visualizzaProiezioni(){
        for(int i=0; i<proiezioni.size();i++) {
            print(proiezioni.get(i));
        }
    }
    public cercaProiezione(string t){
        for (int i = 0; i < proiezioni.size(); i++) {
            if (t.equals(proiezioni.get(i))) {
                print(proiezioni.get(i));
            }
        }
    }
    }