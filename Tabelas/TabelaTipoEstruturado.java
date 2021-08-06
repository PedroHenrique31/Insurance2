package Tabelas;

import java.util.ArrayList;

public abstract class TabelaTipoEstruturado {
    ArrayList<TipoEstruturado> Tabela= new ArrayList<>();

    public void CriaNovo(String nome){
        TipoEstruturado novo;
        int ultimaposicao=Tabela.size()-1;
        int valorChave=Tabela.get(ultimaposicao).getIdentificador(),proximo;
        proximo=valorChave++;
        novo=constroiTipo(nome,proximo);
        Tabela.add(novo);
    }
    abstract TipoEstruturado constroiTipo(String nome,int id);//chamao construtor segundo seu tipo
    public boolean consultaLista(TipoEstruturado candidato){
        //Verifica se o elemento tem ou não na lista
        for (TipoEstruturado item :Tabela) {
            if(candidato.nome.equals(item.nome)){
                return true;
            }
        }
        return false;
    }

}
