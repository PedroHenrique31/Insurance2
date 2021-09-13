
package Principal.Segurado;
import java.util.ArrayList;
import java.util.Locale;

import Principal.Apolice;

public class Segurado {//Classe 1
    private int ID_SEGURADO;
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

    public void setID_SEGURADO(int ID_SEGURADO) {
        this.ID_SEGURADO = ID_SEGURADO;
    }

    public int getID_SEGURADO() {
        return ID_SEGURADO;
    }
    public Segurado(String empresa,String nome,String cpf,String profissao,String indicacao,
                    double renda,double rg){
        this.Empresa=empresa;
        this.Nome=nome.toUpperCase(Locale.ROOT);
        this.Profissao=profissao.toUpperCase(Locale.ROOT);
        this.Indicacao=indicacao.toUpperCase(Locale.ROOT);
        this.Renda=renda;
        this.RG=rg;
        this.CPF=cpf;// ver como validar cpf
    }

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setObservacao1(String observacao1) {
        this.Observacao1 = observacao1;
    }

    public String getObservacao1() {
        return Observacao1;
    }
}
