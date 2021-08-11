package Tabelas;

import java.util.ArrayList;

public class TabelaTipoEstruturado<T extends TipoEstruturado> {
    ArrayList<T> Tabela=new ArrayList<>();
    //TODO: deve abortar caso usuário queria inserir nome que já existe
    public void adicionaNovo(T novo){
        int ID_novo=novo.getIdentificador(),idCorrigida=0;
        boolean JaExisteID=false,JaExisteNome=false;
        JaExisteID=codigoJaExiste(ID_novo);
        if(JaExisteID){
            System.out.println("codigo ja existe");
            idCorrigida=geraNovoID();
            novo.setIdentificador(idCorrigida);
        }
        JaExisteNome=nomeJaExiste(novo.getNome());
        if(JaExisteNome){
            System.out.println("Nome já existente");
        }
        Tabela.add(novo);
    }

    public ArrayList<T> listaTodos(){
        return Tabela;
    }
    //Cria um tipo T fora com ID=0 aqui ele recebe o ID e entra no lugar de outro elemento da lista
    public void modifica(int posicao,T nome){
        T velho=Tabela.get(posicao);
        int ID=velho.getIdentificador();
        nome.setIdentificador(ID);
        Tabela.set(posicao,nome);

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
    //Verificar essa função, caso i seja maior que o tamanho da lista
    public T veElemento(int i){
            return Tabela.get(i);
    }
    //TODO:O que fazer qunado alguém chamar essa função e ela estiver vazia?
        //E quando o codigo gerado já existir?
    public int geraNovoID(){
        int fimLista=Tabela.size(),ultimoCod;
        boolean JaExiste=false;
        T ultimoElemento=Tabela.get(fimLista-1);
        ultimoCod=ultimoElemento.getIdentificador();
        ultimoCod+=1;
        JaExiste=codigoJaExiste(ultimoCod);
        while (JaExiste){
            ultimoCod+=1;
            JaExiste=codigoJaExiste(ultimoCod);
        }
        return ultimoCod;
    }
    public int ultimoDaLista(){
        return Tabela.size()-1;
    }
    public boolean codigoJaExiste(int codigo){
        boolean Existe=false;
        for (T item: Tabela) {
            Existe=(item.getIdentificador()==codigo);//Existe é verdadeiro se o ID de um item for igual ao codigo consultado.
        }
        return Existe;
    }
    //é necesário tratar  repetições de nomes também
    /**
     * nomeJaExiste: este método retorna true se o nome pesquisado existir e false caso contrário.
     * */
    public boolean nomeJaExiste(String nome){
        boolean Existe=false;
        for ( T item:Tabela) {
            Existe=(nome.equals(item.getNome()));
        }
        return Existe;
    }


}
