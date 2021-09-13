package Principal.Segurado;

import java.util.Locale;

public class Email {//Classe 7
    int ID_SEGURADO;
    String email, notas;
    public Email(String email){
        this.email=email.toLowerCase(Locale.ROOT);
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getNotas() {
        return notas;
    }
}
