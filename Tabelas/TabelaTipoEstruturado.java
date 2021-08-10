package Tabelas;

import java.util.ArrayList;

public abstract class TabelaTipoEstruturado<T> {
    ArrayList<T> Tabela=new ArrayList<T>();
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
        Tabela[posicao].nome=nome;
    }


}
