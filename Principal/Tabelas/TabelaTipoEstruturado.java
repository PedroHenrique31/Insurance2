package Principal.Tabelas;

import java.util.ArrayList;
/**
 *              Classe TabelaTipoEstruturado
 *
 *      Essa classe usa generics para gerenciar diversos tipos de coisas.
 *      Os TiposEstruturados são classes anêmicas que não possuem muitas funções, sua utilidade advém principalmente
 *    do conjunto destes tipos, daí a necessidade dessa classe.
 *      Ela deve manter a coesão de dados e estruturas, assegurando:
 *      1-A não inserção de nomes ou numeros de identificação repetidos;
 *
 *    */
public class TabelaTipoEstruturado<T extends TipoEstruturado> {
    ArrayList<T> Tabela;
    /**
     * Construtor padrão de TabelaTipoEstruturado: cria Tabela vazia.*/
    public TabelaTipoEstruturado(){
        Tabela=new ArrayList<>();
    }
    /**
     * Cria TabelaTipoEstruturado com tamanho pré-definido.*/
    public TabelaTipoEstruturado(int tamanhoInicial){
        Tabela=new ArrayList<>(tamanhoInicial);
    }
    //TODO: deve abortar caso usuário queria inserir nome que já existe
    public void adicionaNovo(T novo){
        int ID_novo=novo.getIdentificador(),idCorrigida=0;
        boolean JaExisteID=false,JaExisteNome=false;
        JaExisteID=codigoJaExiste(ID_novo);
        //Identifica se o numero de ID ja existe e atribui outro automaticamente
        if(JaExisteID){
            System.out.println("codigo ja existe");//TODO:lançar excessão
            idCorrigida=geraNovoID();
            novo.setIdentificador(idCorrigida);
        }
        //Avalia se o nome inserido ja existe e aborta se existir
        JaExisteNome=nomeJaExiste(novo.getNome());
        if(JaExisteNome){
            System.out.println("Nome já existente");//TODO:lançar excessão

        }else {
            Tabela.add(novo);
        }
    }

    public ArrayList<T> listaTodos(){
        return Tabela;
    }
    //Cria um tipo T fora com ID=0 aqui ele recebe o ID e entra no lugar de outro elemento da lista
        //TODO:acaba permitindo a inserção de nomes repetidos, falta verificação
    public void modifica(int posicao,T nome){
        T velho=Tabela.get(posicao);
        System.out.println("Antigo: "+velho.getNome()+" codigo: "+velho.getIdentificador());
        int ID=velho.getIdentificador();
        nome.setIdentificador(ID);
        if(nomeJaExiste(nome.getNome())){
            System.out.println("Nome repetido");
        }else {
            Tabela.set(posicao, nome);
            T novo = Tabela.get(posicao);
            System.out.println("Novo: " + novo.getNome() + " codigo: " + novo.getIdentificador());
        }
        System.out.println("Tamanho: "+Tabela.size());

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
            Existe=nome.equals(item.getNome());
            //System.out.println("Nome: "+nome+" item nome: "+item.getNome()+" Existe: "+Existe);
            if(Existe) {
                return Existe;
            }
        }

        return Existe;
    }
    /**
     * método buscaNome: recebe uma String nome e verifica se o mesmo existe na tabela, se
     * não exisitir retorna null, se sim devolve o objeto.
     * Obs: não testada porém derivada de nomJaExiste*/
    public T buscaNome(String nome){
        boolean Existe=false;

        for ( T item:Tabela) {
            Existe=nome.equals(item.getNome());

            if(Existe) {
                return item;
            }
        }

        return null;
    }


}
