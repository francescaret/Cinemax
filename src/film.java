import java.util.Date;
import java.io.*

public class film {

    String delim=",";
    File f= new File(proiezioni.csv);
    FileReader fr = new FileReader(f);
    LineNumberReader lnr = new LineNumberReader(fr);

    //CAMPI

    private Date data_ora;
    private String titolo;
    private generi genere;
    private String regista;
    private int anno;
    private int durata_minuti;
    private int eta_minima;
    private double prezzo_biglietto;

    //COSTRUTTORI
    public film (string titolo) {

    int numeroriga=0;
    String[] colonne = new String[7];

    //cerca la riga con il titolo uguale a quella da input, split restituisce un array di stringhe
    while (titolo != colonne[1] ){

        lnr.setLineNumber(numeroriga+1);

        String riga=lnr.readLine();

        numeroriga=lnr.getLineNumber();

        colonne=riga.split(delim);
    }

        data_ora = colonne[0];
        titolo = colonne[1];
        genere = colonne[2];
        regista = colonne[3];
        anno = colonne[4];
        durata_minuti = colonne[5];
        eta_minima = colonne[6];
        prezzo_biglietto = colonne [7];

    }


    //METODI
}