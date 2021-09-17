package Principal.Segurado;

//import Principal.Tabelas.TipoEstruturado;

/**
 *          Classe DadoDeSegurado
 *
 *    Classe abstrata para representar os tipos que orbitam segurado e possuem relação 1:N com este.
 *    Também possui um atributo chamado tamanhoMaximo que serve para restringir o tamanho de uma String
 *    que possui tamanho fixado no Banco de Dados.
 *    @author Pedro Henrique Carneiro de Araújo*/
public abstract class DadoDeSegurado {
    protected int ID_SEGURADO;
    final int tamanhoMaximo=20;
    public DadoDeSegurado(int ID_SEGURADO){
        this.ID_SEGURADO=ID_SEGURADO;
    }

    public int getID_SEGURADO() {
        return ID_SEGURADO;
    }

    public void setID_SEGURADO(int ID_SEGURADO) {
        this.ID_SEGURADO = ID_SEGURADO;
    }
}
