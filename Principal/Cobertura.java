package Principal;

// Classe cobertura é uma classe abstrata pois depende do tipo de produto comercializado
public interface Cobertura{
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
    String Nota= new String();
    void setNota(String novaNota);
    void setTipoCobertura(int tipoCobertura);
    int getTipoCobertura();
    void setNomeCobertura(String nomeCobertura);
    String getNomeCobertura();

}
