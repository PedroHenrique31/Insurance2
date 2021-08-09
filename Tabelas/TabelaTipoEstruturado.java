package Tabelas;

import java.util.ArrayList;

public abstract class TabelaTipoEstruturado extends ArrayList {
    abstract TipoEstruturado constroiTipo(String nome,int id);//chamao construtor segundo seu tipo

    //Verifica se o elemento tem ou não na lista
    public boolean temNaLista(TipoEstruturado candidato){
        for (TipoEstruturado item :Tabela) {
            if(candidato.nome.equals(item.nome)){
                return true;
            }
        }
        return false;
    }
    public String leValor(int posicao){
        TipoEstruturado gary;
        String nomelido;
        gary=Tabela.get(posicao);
        nomelido=gary.nome;
        return nomelido;
    }

}
