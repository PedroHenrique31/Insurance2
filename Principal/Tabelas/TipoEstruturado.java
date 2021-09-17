package Principal.Tabelas;

import Principal.DadosListaveis;

import java.util.Locale;

//Classes anêmicas: apenas guardam valores para mostrar em tela
/**
 * Tipo Estruturado: É uma coleção de classes anêmicas abstratas, por enquanto só possuem valores simples,
 * a serem mostrados em tela e não tem importância individual, precisam estar listadas para que o sistema
 * as acesse e verifique, logo ficam contidas em TabelaTipoEstruturado. Acabam por quase ser uma struct de C
 * daí o nome.
 * Obs:esta classe não deve ser acessível fora de seu pacote, para prevenir que uma classe manipule,
 * diretamente um TipoEstruturado ou acabe por criar um objeto sem correspondencia no BD.
 *
 * @author Pedro Henrique Carneiro de Araújo
 * */
abstract class TipoEstruturado implements DadosListaveis {
    private int identificador=0;
    String nome;
    /**
     * Construtor de TipoEstruturado: comum a todas as classes filhas insere os dois unicos argumentos
     * que estas classes carregam inicialmente.*/
    public TipoEstruturado(String nome,int id){
        nome=nome.trim();
        this.nome=nome.toUpperCase(Locale.ROOT);
        this.identificador=id;
    }
    /**
     * setIdentificador: usada para alterar ID das classes que é private.*/
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    /**
     * getIdentificador: usada para acessar identificador da classe quando preciso.*/
    public int getIdentificador() {
        return identificador;
    }
    /**setNome: usada para modificar nome fora de seu pacote.*/
    public void setNome(String nome) {
        this.nome = nome.toUpperCase(Locale.ROOT);
    }
    /**
     * getNome:usada para acessar nome fora de seu pacote.*/
    public String getNome(){
        return nome;
    }
}
