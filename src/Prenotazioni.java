import java.io.*;

public class Prenotazioni {

    //CAMPI
    private int id;
    private String username;
    private String film;
    private static int count = 0;

    //COSTRUTTORI
    public Prenotazioni(String u, String f) throws IOException {
        id = ++count;
        username = u;
        film = f;

        File file= new File("prenotazioni.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(id+","+username+","+film);
    }




    //METODI
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public Boolean trovaPrenotazione(String u) throws IOException {
        String[] colonne = new String[3];
        String riga;
        File f= new File("prenotazioni.csv");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        while ((riga = br.readLine()) != null) {
            colonne = riga.split(",");

            if (u.equals(colonne[1])) {
                return true;
            }
        }
        return false;

    }
}
