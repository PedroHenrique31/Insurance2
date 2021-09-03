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

//Apolice poderia ser uma classe abstrata a depender do tipo de produto coberto
public class Apolice {//Classe 2
    int ID_SEGURO;
    String NumeroApolice,Regiao;
    //Datas de início de fim de vigencia e data atual
    Seguradora SeguradoraAnterior,SeguradoraAtual;
    Ramo ramo;
    MeioPagamento meioPagamento;
    FormaPagamento formaPagamento;
    Produtor produtor;
    Assistencia assistencia;

    //Classes do pacote Principal


}
