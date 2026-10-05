import java.security.*;
public class GestorePassword{

//CAMPI
private String algo;

//COSTRUTTORI
public GestorePassword(){
    this.algo="SHA-256"
}
public GestorePassword(string a){
this.algo=a;
}

//METODI
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