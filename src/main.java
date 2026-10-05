import Prenotazioni;
import Proiezioni;
import Utenti;
import GestorePassword;
import Film;
import Generi;
import Ruoli;
import java.util.Scanner;


public static void main (String[] args){
    //azioni utenti non loggati
    Scanner sc = new Scanner(System.in);
    //Do-While loop per scegliere l'opzione, se non è scelto nessun caso va su default e ritorna indietro per scegliere una nuova opzione
    do {
        print("Scegli un'opzione (Inserisci un numero): \n1. Cerca proiezione\n2. Visualizza proiezioni\n3. Registrazione\n4. Login\n")
        int scelta = sc.nextInt();
        //switch case con opzioni
        switch (scelta) {
            case 1:
                print("Cerca proiezione:");
                Proiezioni proiezioni = new Proiezioni();
                print("\nInserisci il nome del film da cercare\n")
                String film = sc.nextLine();
                proiezioni.cercaProiezione(film);

                //code
                break;
            case 2:
                print("Visualizza proiezioni:");
                Proiezioni proiezioniTotali = new Proiezioni();
                proiezioniTotali.visualizzaProiezioni();
                //code
                break;
            case 3:
                print("registrazione");
                //code
                break;
            case 4:
                print("login");
                //code
                break;
            default:
                print("Inserire un numero da 1 a 4 in base all'opzione desiderata")
        }
    } while(scelta<1 or scelta>4);

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