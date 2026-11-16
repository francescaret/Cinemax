import java.security.*;
public class GestorePassword{

//CAMPI
private String algo;

//COSTRUTTORI
public GestorePassword(){
    this.algo="SHA-256";
}
public GestorePassword(String a){
this.algo=a;
}

//METODI
public String hashPassword(String passwordEsatta) {
        try
        {
            MessageDigest md = MessageDigest.getInstance(this.algo);
            byte[] bytepasswordcifrata = md.digest(passwordEsatta.getBytes());
            String passwordcifrata=new String(bytepasswordcifrata, StandardCharsets.UTF_8);
            return passwordcifrata;
        }
         catch(NoSuchAlgorithmException e){
            System.out.println("Errore durante hashing:" + e.getMessage());
        }
    }
}