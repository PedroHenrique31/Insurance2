import Tabelas.TbProdutor;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Scanner;
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








