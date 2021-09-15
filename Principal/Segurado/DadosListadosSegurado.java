package Principal.Segurado;

//import Principal.Tabelas.TipoEstruturado;

public abstract class DadosListadosSegurado {
    int ID_SEGURADO;
    final int tamanhoMaximo=20;
    public DadosListadosSegurado(int ID_SEGURADO){
        this.ID_SEGURADO=ID_SEGURADO;
    }
}
