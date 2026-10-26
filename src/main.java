import Prenotazioni;
import Proiezioni;
import Utente;
import GestorePassword;
import Film;
import Generi;
import Ruoli;
import java.util.Scanner;
import java.text.SimpleDateformat;


public static void main (String[] args){
    //azioni utenti non loggati
    Ruoli FlagRuoloUtente = null;
    File f = new File("utenti.csv");
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Proiezioni proiezioni = new Proiezioni();
    GestorePassword gp = new GestorePassword();
    Scanner sc = new Scanner(System.in);
    //Do-While loop per scegliere l'opzione, se non è scelto nessun caso va su default e ritorna indietro per scegliere una nuova opzione
    do {
        print("Scegli un'opzione (Inserisci un numero): \n1. Cerca proiezione\n2. Visualizza proiezioni\n3. Registrazione\n4. Login\n")
        int scelta = sc.nextInt();
        //switch case con opzioni
        switch (scelta) {
            case 1:
                print("Cerca proiezione:");

                print("\nInserisci il titolo del film da cercare: \n");
                String titolo = sc.nextLine();
                proiezioni.cercaProiezione(titolo);

                //code
                break;
            case 2:
                print("Visualizza proiezioni:");
                proiezioni.visualizzaProiezioni();
                //code
                break;
            case 3:
                print("Registrazione:");
                //data
                print("\nInserisci data di nascita in formato yyyy-MM--dd: \n");
                String data = sc.nextLine();
                //nome
                print("Inserisci Nome\n");
                String nome = sc.nextLine();
                //cognome
                print("Inserisci Cognome\n");
                String cognome = sc.nextLine();
                //username
                print("Inserisci un Username\n");
                String username = sc.nextLine();
                //password
                print("Inserisci password\n");
                String password = gp.hashPassword(sc.nextLine());
                //indirizzo
                print("Inserisci Indirizzo\n");
                String indirizzo = sc.nextLine();

                Utente utente = new Utente(data, nome, cognome, username, password, indirizzo);



                //code
                break;
            case 4:
                print("login");
                print("Inserisci un Username\n");
                String username = sc.nextLine();
                //password
                print("Inserisci password\n");
                String password = gp.hashPassword(sc.nextLine());
                String delim = new String(",");
                String[] colonne = new String[7];
                String riga;
                while ((riga = br.readLine()) != null) {
                    colonne = riga.split(delim);

                    if (username == colonne[2] && password == colonne[3]) {
                        FlagRuoloUtente = colonne[6];
                    }
                }
                break;
            default:
                print("Inserire un numero da 1 a 4 in base all'opzione desiderata")
        }
    } while(scelta<1 || scelta>4);



        //cercaproiezione -> inserisci titolo
        //visualizzaproiezioni
        //registrazione -> inserisci tutto tranne ruolo -> controllo nome non duplicato
        //login -> inserisci username -> inserisci password
            //password -> cifrata -> confronta
        //ricava ruolo utente da username
            //switch case in base al ruolo
                //CLIENTE
                    //switch case con opzioni
                        //visualizza prenotazioni
                        //crea prenotazione
                        //elimina prenotazione
                        //modifica prenotazione
                //BIGLIETTAIO
                    //switch case con opzioni
                        //cerca prenotazione (da fare con id)
                        //visualizza prenotazioni (di tutti)
                //PROIEZIONISTA
                    //switch case con opzioni
                        //modifica proiezione
                        //crea proiezione
                        //elimina proiezione


}