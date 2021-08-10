package Tabelas;

import java.util.ArrayList;

public class TabelaTipoEstruturado<T extends TipoEstruturado> {
    ArrayList<T> Tabela=new ArrayList<>();
    T campoConstante;

    public void adicionaNovo(T novo){
        Tabela.add(novo);
    }
    public T busca(int i){
        T buscado=Tabela.get(i);
        return buscado;
    }
    public ArrayList<T> listaTodos(){
        return Tabela;
    }
    public void modifica(int posicao,String nome){
        T velho=Tabela.get(posicao),novo;
        int ID=velho.getIdentificador();
        novo=new T(nome,ID);
        Tabela.set(posicao,novo);

    }
    public int CodigoUltimoDaLista(){
        int topo=Tabela.size()-1,retorno;
        retorno=Tabela.get(topo).getIdentificador();
        return retorno;
    }
    public int tamanhoLista(){
        int tamanho=Tabela.size();
        return tamanho;
    }
    public T veElemento(int i){
            return Tabela.get(i);
    }
    /*public void CriaNovo(String nome){
        T novo;
        int ultimaPosicao=Tabela.size()-1;
        novo=new T(nome,ultimaPosicao);
        Tabela.add(novo);

    }*/
    //abstract TipoEstruturado constroiTipo(String nome,int id);//chama o construtor segundo seu tipo


}
