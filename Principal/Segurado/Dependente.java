package Principal.Segurado;

import java.util.Locale;
/**
 *          Classe Dependente
 *     É um tipo de DadoDeSegurado, logo ela orbita em torno de segurado e um segurado
 *   pode ter N Dependentes.
 *   */
public class Dependente extends DadoDeSegurado {//Classe 6

    String NomeDependente, EstadoCivil, Ocupacao, Parentesco;
    /**
     * public Dependente: cria um dependente em um Segurado.*/
    public Dependente(String nome,String estadoCivil,String ocupacao,String parentesco,
                      int ID_SEGURADO){
        super(ID_SEGURADO);
        this.NomeDependente=nome.toUpperCase(Locale.ROOT);
        this.EstadoCivil=estadoCivil.toUpperCase(Locale.ROOT);
        this.Ocupacao=ocupacao.toUpperCase(Locale.ROOT);
        this.Parentesco=parentesco.toUpperCase(Locale.ROOT);

    }
    //getters: para caso seja preciso ler fora do pacote.
        //NOTA: alguns atributos não terão setters, pois não faz sentido modificá-los, mas tem setters,e.g. parentesco.
    public String getNomeDependente() {
        return NomeDependente;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public String getOcupacao() {
        return Ocupacao;
    }

    public String getParentesco() {
        return Parentesco;
    }

}
