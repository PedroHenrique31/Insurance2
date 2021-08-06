package Tabelas;

import java.util.Locale;

public abstract class TipoEstruturado {
    private int identificador=0;
    String nome;

    public TipoEstruturado(String nome,int id){
        this.nome=nome;
        this.identificador=id;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase(Locale.ROOT);
    }
    public String getNome(){
        return nome;
    }
}
