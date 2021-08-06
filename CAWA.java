import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
//import Tabelas.Seguradora;

/*
*   Algumas questões que preciso definir a respeito de como o pograma vai operar
* as classes anêmicas são úteis para manter a coesão referencial das classes, assim,
* garantimos que as chaves e os pogramas se referenciam,prevenindo referencias nulas.
*   Como proceder quando mudarem o nome de um campo dessas classes? devemos modificar os
* nomes em todas as classes que referenciem? ou simplesmente fazer um update para o banco e
* isso será corrigido no proximo acesso?
*   Como será efetuada as alterações no banco? de forma ativa me parece interessante mas o hibernate
* é um framework datamapper.
* */
//TODO: Talvez eu deva criar uma classe de gerenciamento como uma lista de seguradoras
// e posteriormente criar funções que verifiquem a existencia de seguradora
// Crias um tipo Texto herdando de String para definir tamanhos fixos nos campos

/*
class Data extends Calendar{
    private Calendar hoje;
    //Data trata eventos de data,mas não as cria
    public Data(Calendar hoje){
        this.hoje=hoje;
    }
    // esqueci o que deveria criar
    public void Saudacao(){
        System.out.println("Olá");
    }
    //Precisa implementar as funções para herdar de calendar
}*/

public class CAWA {
    public static void main(String args[]){
        System.out.println("Olá");
        Date data_atual=new Date();
        System.out.println("Data agora: "+data_atual);


        Calendar calendario_teste=Calendar.getInstance();
        System.out.println("Data e hora atual: "+calendario_teste.getTime());
    }
}
 class Segurado{//Classe 1
    int ID_SEGURADO;
    String Empresa,Nome,Grupo,Observacao1,Profissao,CPF,Indicacao;
    double Renda,RG;

    //Lista de telefones de contato
     ArrayList<Telefone> Telefones=new ArrayList<Telefone>();
    //Lista de emails
     ArrayList<Email> emails=new ArrayList<Email>();
    //Lista de endereços
     ArrayList<Endereco> Enderecos=new ArrayList<Endereco>();
    //Lista de apólices
    ArrayList<Apolice> Apolices=new ArrayList<Apolice>();
    //Lista de Dependentes
     ArrayList<Dependente> Dependentes=new ArrayList<Dependente>();

}

//Apolice poderia ser uma classe abstrata a depender do tipo de produto coberto
class Apolice{//Classe 2
    int ID_SEGURO;
    String NumeroApolice;
    //Datas de início de fim de vigencia e data atual
    //Seguradora SeguradoraAnterior,SeguradoraAtual;

    Funcionario Produtor;
    // Será que ramo deve ser um objeto? pelo mapeamento objeto relacional sim

}

class Funcionario{//Classe 4 Pertece à Main
    /*Pode ser interessante deixar essa coisa encapsulada numa classe arraylist,
    pois ela só guarda uma informação em String, logo ela pode ser uma tabela para ser usada em verificação de
    tipos.
     */
    int ID_Produtor;
    String ProdutorNome;
    ArrayList<Apolice> ApolicesFuncionario= new ArrayList<Apolice>();
}
class  Telefone{//Classe 5
    int DDD,tamanhoObsMax=20;//campo observação tem que ter no máximo 20 caracteres, para ser uma nota rápida
    String NumeroTelefone,Tipo,Observacao;

}
class Dependente{//Classe 6
    int ID_SEGURADO,TamanhoMaximo=20;
    String NomeDependente,EstadoCivil,Ocupacao,Parentesco;

}
class Email{//Classe 7
    int ID_SEGURADO;
    String email,notas;
}
class Endereco{//Classe 8
    int ID_SEGURADO;
    String endereco,TIPO,bairro,cidade,UF,CEP;


}
class Grupo{//Classe 9 Pertence a classe CAWA
    int ID_Grupo;
    String NomeGrupo;
    //Lista de segurados
    ArrayList<Segurado> Segurados=new ArrayList<Segurado>();
}

class Usuario{//Classe 10
    int ID_USUARIO;
    String NomeUsario,Comentario,EstadoCivil,InfoFilhos;
    boolean filhos;
    int CPF,RG,IdadeUsuario;
    Date datanasc,anohabil;

    //TODO:Cria método que em caso usuario tenha filhos anote a idade e nome deles no campo InfoFilhos.
}

class Carro{//Classe 11
    int ID_CARRO;
    String Placa,Chassi,Marca,modelo,cor,AnoModelo;
}


//Classes anêmicas: apenas guardam valores para mostrar em tela

// Classe cobertura é uma classe abstrata pois depende do tipo de produto comercializado
interface Cobertura{
    // TODO: aqui criaremos um método para separar as coberturas por tipo, no BD haverá
    //  uma chave primaria composta de tipo e e ID_COBERTURA
    /* Os tipos são:
    * 1-Carro
    * 2-Residencia
    * 3-Vida
    * 4-Fiança Locaticia
    * 5-PCD
    * 6-Prestamista
    * */
    int TipoCobertura=0;
    String NomeCobertura=new String();

}
//TODO:algo como uma chave dupla ajudaria a indentificar o tipo e posteriormente a apolice
class CoberturaCarro implements  Cobertura{
    int ID_COBERTURA,ID_SEGURO,TipoCobertura=1;
    double RCDanosMoraisEsteticos,RCDanosMaterias,RCDanosCorpo,APPMortePassageiro,APPInvalidezPassgeiro,
    CoberturaPrincipal;
    boolean Atinfurto,TipoFranquia;
    int BonusAuto,BonusRCF,DiasDeCarroReserva;
    String Garagem,TipoFranquiaNome,Nota,AntifurtoNome;

}



