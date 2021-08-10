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
    public void modifica(int posicao,T novo){
        T velho=Tabela.get(posicao),novo;
        int ID=velho.getIdentificador();
        Tabela.set(posicao,novo);

    }
    /*public void CriaNovo(String nome){
        T novo;
        int ultimaPosicao=Tabela.size()-1;
        novo=new T(nome,ultimaPosicao);
        Tabela.add(novo);

    }*/
    //abstract TipoEstruturado constroiTipo(String nome,int id);//chamao construtor segundo seu tipo

}
