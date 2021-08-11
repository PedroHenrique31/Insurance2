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
        T ultimoElemento=Tabela.get(fimLista-1);
        ultimoCod=ultimoElemento.getIdentificador();
        ultimoCod+=1;
        return ultimoCod;
    }
    public int ultimoDaLista(){
        return Tabela.size()-1;
    }
    public boolean codigoJaExiste(int codigo){
        boolean Existe=false;
        for (Produtor item: Tabela) {
            Existe=(item.getIdentificador()==codigo);//Existe é verdadeiro se o ID de um item for igual ao codigo consultado.
        }
        return Existe;
    }
    /*public void CriaNovo(String nome){
        T novo;
        int ultimaPosicao=Tabela.size()-1;
        novo=new T(nome,ultimaPosicao);
        Tabela.add(novo);

    }*/
    //abstract TipoEstruturado constroiTipo(String nome,int id);//chama o construtor segundo seu tipo


}
