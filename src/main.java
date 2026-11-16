import java.util.Scanner;
import java.io.*;
import java.text.SimpleDateFormat;


public static void main (String[] args) throws IOException, NoSuchAlgorithmException, ParseException {
    boolean uscita = false;
    Ruoli FlagRuoloUtente = null;
    File f = new File("utenti.csv");
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Prenotazioni prenotazioni = new Prenotazioni();
    Proiezioni proiezioni = new Proiezioni();
    GestorePassword gp = new GestorePassword();
    Scanner sc = new Scanner(System.in);
    String username = null;
    String password = null;
    //azioni utenti non loggati
    do {
        System.out.print("Scegli un'opzione (Inserisci un numero): \n1. Cerca proiezione\n2. Visualizza proiezioni\n3. Registrazione\n4. Login\n");
        int scelta = sc.nextInt();
        //switch case con opzioni
        switch (scelta) {
            case 1:
                System.out.print("Cerca proiezione:");

                System.out.print("\nInserisci il titolo del film da cercare: \n");
                String titolo = sc.nextLine();
                proiezioni.cercaProiezione(titolo);
                break;
            case 2:
                System.out.print("Visualizza proiezioni:");

                proiezioni.visualizzaProiezioni();
                break;
            case 3:
                System.out.print("Registrazione:");

                //data
                System.out.print("\nInserisci data di nascita in formato yyyy-MM--dd: \n");
                String data = sc.nextLine();
                //nome
                System.out.print("Inserisci Nome\n");
                String nome = sc.nextLine();
                //cognome
                System.out.print("Inserisci Cognome\n");
                String cognome = sc.nextLine();
                //username
                System.out.print("Inserisci un Username\n");
                username = sc.nextLine();
                //password
                System.out.print("Inserisci password\n");
                password = gp.hashPassword(sc.nextLine());
                //indirizzo
                System.out.print("Inserisci Indirizzo\n");
                String indirizzo = sc.nextLine();

                Utente utente = new Utente(data, nome, cognome, username, password, indirizzo);
                System.out.print("Utente registrato, puoi procedere con il login");


            case 4:
                System.out.print("Login");

                System.out.print("Inserisci un Username\n");
                username = sc.nextLine();
                System.out.print("Inserisci password\n");
                password = gp.hashPassword(sc.nextLine());
                String delim = new String(",");
                String[] colonne = new String[7];
                String riga;
                while ((riga = br.readLine()) != null) {
                    colonne = riga.split(delim);

                    if (username == colonne[2] && password == colonne[3]) {
                        FlagRuoloUtente = Ruoli.valueOf(colonne[6]);
                    }
                }
                break;
            default:
                System.out.print("Inserire un numero da 1 a 4 in base all'opzione desiderata");
        }
    } while(FlagRuoloUtente == null);

    switch(FlagRuoloUtente) {
        case CLIENTE:
            System.out.println("Benvenuto " + username);
            do {
                System.out.println("Scegli un'opzione (Inserisci un numero): \n1. Visualizza prenotazioni\n2. Crea prenotazione\n3. Elimina prenotazione\n4. Modifica prenotazione\n5. Esci");
                int scelta = sc.nextInt();
                switch (scelta) {
                    case 1:
                        prenotazioni.trovaPrenotazione(username);
                    case 2:
                        System.out.print("Inserisci il nome del film da prenotare");
                        String filmPrenotato = sc.nextLine();
                        //prenotazioni.creaPrenotazione(colonne[2], filmPrenotato, proiezioni);
                    case 3:

                    case 4:

                    case 5:
                        uscita=true;
                        break;
                    default:
                        System.out.println("Scelta non valida");
                }
            } while (uscita);
            //visualizza prenotazioni

            //crea prenotazione
            //elimina prenotazione
            //modifica prenotazione
            //uscita
            break;

        case PROIEZIONISTA:
            //code
            break;
        case BIGLIETTAIO:
            //code
            break;
    }
        System.out.println("Grazie per aver utilizzato il sistema CINEMAX.");


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
                        //uscita
                //PROIEZIONISTA
                    //switch case con opzioni
                        //modifica proiezione
                        //crea proiezione
                        //elimina proiezione
                        //uscita

}