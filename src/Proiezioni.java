import java.util.Date;
import java.text.SimpleDateformat;

public class Proiezioni{
    //CAMPI
    private Film[] proiezioni;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //COSTRUTTORI
    public Proiezioni(){
        proiezioni==new Film[20] ; //limite imposto per film in una giornata;
    }
    public modificaDataOra(String t; Date d){
        for (int i=0; i<proiezioni.length(); i++){
            if (t.equals(proiezioni[i])){
                proiezioni[i].setData_Ora(formatter.parse(d));
            }
        }
    public modificaPrezzo_biglietto(string t; double pb){
            for (int i=0; i<proiezioni.length(); i++){
                if (t.equals(proiezioni[i])){
                    proiezioni[i].setPrezzo_biglietto(pb);
                }
            }
        }
    }
    //METODI
}