
package Principal.Segurado;
import java.util.ArrayList;
import Principal.Apolice;

public class Segurado {//Classe 1
    int ID_SEGURADO;
    String Empresa, Nome, Grupo, Observacao1, Profissao, CPF, Indicacao;
    double Renda, RG;

    //Lista de telefones de contato
    ArrayList<Telefone> Telefones = new ArrayList<Telefone>();
    //Lista de emails
    ArrayList<Email> emails = new ArrayList<Email>();
    //Lista de endereços
    ArrayList<Endereco> Enderecos = new ArrayList<Endereco>();
    //Lista de apólices
    ArrayList<Apolice> Apolices = new ArrayList<Apolice>();
    //Lista de Dependentes
    ArrayList<Dependente> Dependentes = new ArrayList<Dependente>();

}
