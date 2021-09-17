package Principal;
/**
 * @author Pedro Henrique Carneiro de Araújo
 * */

public interface DadosListaveis {
    /*
    * Interface para relacionar as listas em generics, tanto os dados listados na Main (que estão no
    * pacote Tabelas e herdam TipoEstruturado) quanto os objetos que são listados em Segurado (que estão
    * no pacote Segurado) possuem semelhanças entre si.
    *   1-Eles possuem algum tipo de identificador no BD que será atribuido automaticamente pelo BD ou pela
    * aplicação;
    *   2-Um método setIdentificador para permitir ler o Identificador no objeto mesmo fora de seus pacotes;
    *   3-Um método getNome para permitir ler o Nome (ou outro tipo de valor guardado que seja String) para
    * permitir a leitura de seu dado fora do pacote.
    * Obs: Nem todos possuem um setNome já que este deve ser atribuido no construtor e
    * dificilmente será alterado.
    *
    * */
    int getIdentificador();
    void setIdentificador(int identificador);
    String getNome();

}
