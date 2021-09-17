package Principal.Segurado;

//import Principal.Tabelas.TipoEstruturado;

public abstract class DadoDeSegurado {
    protected int ID_SEGURADO;
    final int tamanhoMaximo=20;
    public DadoDeSegurado(int ID_SEGURADO){
        this.ID_SEGURADO=ID_SEGURADO;
    }

}
