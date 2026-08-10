import java.security.*;
public class GestorePassword{
//campi
private String algo;
//costruttori
public GestorePassword(){
    this.algo="SHA-256"
}
public GestorePassword(string a){
this.algo=a;
}
//metodi
public String hashPassword(String passwordEsatta) {
        try
        {
            MessageDigest md = MessageDigest.getInstance(algo);
            byte[] passwordCifrata = md.digest(passwordEsatta.getBytes());
            return passwordCifrata;
        }
         catch(NoSuchAlgorithmException e){
            System.out.println("Errore durante hashing:" + e.getMessage());
        }
    }
}