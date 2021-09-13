package Principal;
/**
 *          Classe Apolice
 *          Pertence ao pacote Principal e tem 23 atributos de varias classes,
 *    incluindo quase todos do pacote Tabelas, é uma classe central que agrega
 *    diversas outras na aplicação, ela varia de acordo com o tipo de produto segurado e
 *    deve possuir tipos de coberturas e ações diferentes para tal(as vezes um generics aqui seria promissor).
 *    */

import Principal.Tabelas.Ramo;
import Principal.Tabelas.MeioPagamento;
import Principal.Tabelas.FormaPagamento;
import Principal.Tabelas.Produtor;
import Principal.Tabelas.Assistencia;
import Principal.Tabelas.Seguradora;
import Principal.Bens.Carro;


//Apolice poderia ser uma classe abstrata a depender do tipo de produto coberto
public class Apolice {//Classe 2
    private int ID_SEGURO;//é o BD quem vai setar esse valor
    String NumeroApolice,Regiao;
    //Datas de início de fim de vigencia e data atual
    Seguradora SeguradoraAnterior,SeguradoraAtual;
    Ramo ramo;
    MeioPagamento meioPagamento;
    FormaPagamento formaPagamento;
    Produtor produtor;
    Assistencia assistencia;

    //Classes do pacote Principal
    Carro veiculo;//Se a apolice for de automovel
    String clausula,comentario;
    //Primitivos de Apolice
    double  premioLiq,premioTotal;


    /* Funcionalidades de Apolice envolvem:
    *   1-Cria uma nova apolice: onde é preciso criar um novo bem (que definirá o tipo da apolice),
    * determinar ID_SEGURO,preencher:NumeroApolice,Regiao,meioPagamento,FormaPagamento,Produtor,
    * Assistencia,Carro,premioLiq e premioTotal;
    *       1.1-Posteriormente se adiciona comentarios e clausulas.
    *   2-Endosso de apolice:algum tipo de alteração contratual (como uma mudança de carro),
    * mas que preserva demais parametros(com excessão talvez dos valores de premio) nesse caso temos que
    * descobrir o que se quer alterar para modificar, perguntar se alterará o premio e se for o caso
    * modificar seu valor;
    *       2.1-a alteração dos campos clausula e comentario é livre;
    *   3-Finda apolice: destroi esta apolice, seja por fim de vigencia e/ou cancelamento de seguro;
    *   4-Renovação apolice: reaproveita informações da apolice anterior, pois o seguro foi renovado
    * por mais um ano.*/
    public Apolice(String NumeroApolice, String Regiao, Seguradora anterior, Seguradora atual,Ramo ramo,
                   MeioPagamento pagamentoMeio, FormaPagamento pagForma,Produtor produtor,
                   Assistencia assistencia,Carro carro,double premioLiq,double premioTotal){
        //NOTE: OS TIPOS ESTRUTURADOS DEVEM VIR JÁ VERIFICADOS.
        this.NumeroApolice=NumeroApolice;
        this.Regiao=Regiao;
        this.SeguradoraAnterior=anterior;//deve estar verificado
        this.SeguradoraAtual=atual;//deve estar verificado
        this.meioPagamento=pagamentoMeio;//deve estar verificado
        this.formaPagamento=pagForma;//deve estar verificado
        this.produtor=produtor;//deve estar verificado
        this.assistencia=assistencia;//deve estar verificado
        this.veiculo=carro;
        this.premioLiq=premioLiq;
        this.premioTotal=premioTotal;
        this.ramo=ramo;//deve estar verificado
    }

    public void setClausula(String clausula) {
        this.clausula = clausula;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getClausula() {
        return clausula;
    }

    public String getComentario() {
        return comentario;
    }

    public void setID_SEGURO(int ID_SEGURO) {
        this.ID_SEGURO = ID_SEGURO;
    }

    public int getID_SEGURO() {
        return ID_SEGURO;
    }
}//FimClasse Apolice
