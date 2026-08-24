import java.util.*


public class Proiezioni{
    //CAMPI
    private LinkedList<Film> proiezioni;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //COSTRUTTORI
    public Proiezioni(){
        proiezioni==new LinkedList<Film>();
    }
    //METODI
    public aggiungiProiezione(String t){
        Film f= new Film(t);
        proiezioni.add(f);
    }
    public eliminaProiezione(String t){
        for (int i=0; i<proiezioni.size(); i++){
            if (t.equals(proiezioni.get(i))){
                proiezioni.remove(i);
            }
            else {
                print("Film non trovato")
            };
        }
    }

    public modificaDataOra(String t; Date d){
        for (int i = 0; i < proiezioni.size(); i++) {
            if (t.equals(proiezioni.get(i))) {
                proiezioni.get(i).setData_Ora(formatter.parse(d));
            }
        }
    }
    public modificaPrezzo_biglietto(String t; double pb){
            for (int i=0; i<proiezioni.size(); i++){
                if (t.equals(proiezioni.get(i))){
                    proiezioni.get(i).setPrezzo_biglietto(pb);
                }
            }
        }
    public visualizzaProiezioni(){
        for(int i=0; i<proiezioni.size();i++){
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