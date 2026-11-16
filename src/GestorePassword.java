import java.nio.charset.StandardCharsets;
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
public String hashPassword(String passwordEsatta) throws NoSuchAlgorithmException {
            MessageDigest md = MessageDigest.getInstance(this.algo);
            byte[] bytepasswordcifrata = md.digest(passwordEsatta.getBytes());
            String passwordcifrata=new String(bytepasswordcifrata, StandardCharsets.UTF_8);
            return passwordcifrata;
    }
}