import java.security.MessageDigest;
public class GestorePassword{
//campi

//costruttori

//metodi
public String cifraPassword(String passwordEsatta) {
        try
        {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            Byte[] passwordCifrata = md.digest(passwordEsatta.getBytes());
            return passwordCifrata.toString();
        }
         catch(NoSuchAlgorithmException e){
            system.out.println("Errore durante hashing:" + e.getMessage());
        }
    }
}