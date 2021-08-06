package Principal;

import java.util.ArrayList;

public class Funcionario {//Classe 4 Pertece à Main
    /*Pode ser interessante deixar essa coisa encapsulada numa classe arraylist,
    pois ela só guarda uma informação em String, logo ela pode ser uma tabela para ser usada em verificação de
    tipos.
     */
    int ID_Produtor;
    String ProdutorNome;
    ArrayList<Apolice> ApolicesFuncionario = new ArrayList<Apolice>();
}
