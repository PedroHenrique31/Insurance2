package Testes.Testes;

import Principal.Tabelas.Produtor;
import Principal.Tabelas.TabelaTipoEstruturado;
//import org.jetbrains.annotations.Async;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class TabelaTipoEstruturadoTest<i> {
    TabelaTipoEstruturado<Produtor> TbProdutor = new TabelaTipoEstruturado<>();
    Produtor novinho = new Produtor("Zé do Picadinho Silva", 22);
    String nome = "Raul Seixas";
    int iteracoes=100;

    String geraNomeAleatorio(){
        String nome=new String();
        char letra;
        int numeroAleatorio;
        Random alea=new Random();
        for (int i = 0; i < 20; i++) {
            numeroAleatorio=alea.nextInt(128);
            numeroAleatorio+=48;
            letra=(char)numeroAleatorio;
            nome=nome+letra;
        }
        //System.out.println("String gerada "+nome);
        return nome;

    }

    @Test
    void testTbProdutor() {
        assertNotNull(TbProdutor);
    }

    @Test
    void testAdicionaNovo() {
        TbProdutor.adicionaNovo(novinho);
        int ID_topo = TbProdutor.CodigoUltimoDaLista(), novoID, topo = TbProdutor.tamanhoLista();
        Produtor novo = null;
        Produtor ultimoElemento;

        for(int i=0;i<iteracoes;i++){
            novoID= TbProdutor.geraNovoID();
            novo=new Produtor(geraNomeAleatorio(), novoID);
            TbProdutor.adicionaNovo(novo);
        }

        novoID= TbProdutor.geraNovoID();
        novo=new Produtor("Pedro Henrique",novoID);
        TbProdutor.adicionaNovo(novo);
        ultimoElemento = TbProdutor.veElemento(TbProdutor.tamanhoLista()-1);// eis o poblema
        System.out.println("Ultimo nome: "+ultimoElemento.getNome()+" ultimo codigo: "+ultimoElemento.getIdentificador());
        System.out.println("tamanho: "+TbProdutor.tamanhoLista());
        assertEquals(novo.getIdentificador(), ultimoElemento.getIdentificador());
    }

    @Test
    //TODO:Melhorar esse teste aqui para automatizar as consultas, ele só consulta uma
    void testVeElemento() {
        TbProdutor.adicionaNovo(novinho);
        Produtor verifica = TbProdutor.veElemento(0);
        System.out.println("Novinho.nome: " + novinho.getNome() + "\nTbProdutor[0].nome: " + TbProdutor.veElemento(0));
        assertEquals(novinho.getNome(), verifica.getNome());
    }
    @Test
    //TODO:Melhorar esse teste, como a função não adiciona nomes repetidos esse teste deu erro
    void testTamanhoLista(){
        int i,total=100,tamanhoDaLista;
        for(i=0;i<total;i++){
            TbProdutor.adicionaNovo(novinho);
        }
        tamanhoDaLista=TbProdutor.tamanhoLista();
        System.out.println("tamanho lista: "+tamanhoDaLista);
        assertEquals(total,tamanhoDaLista);

    }
    @Test
    void testUltimoLista(){
        TbProdutor.adicionaNovo(novinho);
        int Codigo;
        Produtor novo=null;
        for (int i = 0; i < iteracoes; i++) {
                Codigo=TbProdutor.geraNovoID();
                novo=new Produtor(nome,Codigo);
                TbProdutor.adicionaNovo(novo);
        }
        int ultimolista=TbProdutor.tamanhoLista()-1,comparador=TbProdutor.ultimoDaLista();
        assertEquals(ultimolista,comparador);

    }
    @Test
    void testGeraNovoID(){
        TbProdutor.adicionaNovo(novinho);
        Produtor novo=null;
        int novoID=0;
        boolean JaExiste,repetiuCodigo=false;
        for (int i = 0; i < iteracoes ; i++) {
            novoID= TbProdutor.geraNovoID();
            novo=new Produtor(nome,novoID);
            TbProdutor.adicionaNovo(novo);
        }
        //Aqui foi adicionado um novo elemento com codigo ja existente
        novo=new Produtor("Sergio Malandro",novoID);
        JaExiste=TbProdutor.codigoJaExiste(novoID);
        TbProdutor.adicionaNovo(novo);
        repetiuCodigo= (novo.getIdentificador()==novoID);

        for (int i = 0; i < iteracoes; i++) {
            novoID= TbProdutor.geraNovoID();
            novo=new Produtor(nome,novoID);
            TbProdutor.adicionaNovo(novo);
        }
        int ultimolista=TbProdutor.tamanhoLista()-1,comparador=TbProdutor.ultimoDaLista();
        System.out.println("tamanho lista: "+TbProdutor.tamanhoLista());
        assertFalse(repetiuCodigo);
    }

    private void insercao(){
        TbProdutor.adicionaNovo(novinho);
        int IDnovo;
        Produtor maisUm;
        for (int i = 0; i < this.iteracoes; i++) {
            IDnovo=TbProdutor.geraNovoID();
            maisUm=new Produtor(nome,IDnovo);
            maisUm=new Produtor(geraNomeAleatorio(),IDnovo);
            TbProdutor.adicionaNovo(maisUm);
        }
    }
    void mostraTudo(TabelaTipoEstruturado<Produtor> Tabela){
        int tamanho=Tabela.tamanhoLista();
        Produtor item;
        for (int i=0;i<tamanho;i++) {
            item=Tabela.veElemento(i);
            System.out.println(item.getNome()+" "+item.getIdentificador());
        }
        System.out.println("------------------------------------------------------------------------");
    }
    @Test
    void testNomesIguais(){
        insercao();
        boolean nomeIgual=false;
        nomeIgual=TbProdutor.nomeJaExiste("Zé do Picadinho Silva");
        assertTrue(nomeIgual);
    }
    @Test
    void testListaTodos(){
        ArrayList<Produtor> listaGeral;
        insercao();
        System.out.println("tamanho lista: "+TbProdutor.tamanhoLista());
        listaGeral=TbProdutor.listaTodos();
        Produtor item;
        int tamanhoLista=TbProdutor.tamanhoLista();
        System.out.println("=======================================================================");
        for (int i = 0; i < tamanhoLista; i++) {
            item=TbProdutor.veElemento(i);
            System.out.println("Nome: "+item.getNome()+" Codigo: "+item.getIdentificador());
            assertEquals(listaGeral.get(i),TbProdutor.veElemento(i));
        }
    }
    @Test
    void testModifica(){//Função funcionando uma beleza, ela deu erro pois nao adicionou o nome repetido,por isso quebra no assetFalse
        insercao();
        Produtor pedro= new Produtor("Pedro Henrique",2);
        int atribuicoes=110;
        for (int i = 0; i < atribuicoes; i++) {
            TbProdutor.modifica(i,pedro);
            assertTrue(TbProdutor.veElemento(i).getNome().equals(pedro.getNome()));
            assertFalse(TbProdutor.veElemento(i).getNome().equals(pedro.getNome()));
        }

    }
    @Test
    void testeBuscaNome(){
        TabelaTipoEstruturado<Produtor> Table=new TabelaTipoEstruturado<>(50);
        Produtor aleatorio,buscado;
        for (int i = 0; i < 25; i++) {//povoa metade de Table
            aleatorio=new Produtor(geraNomeAleatorio(),i);
            Table.adicionaNovo(aleatorio);
        }
        Table.adicionaNovo(novinho);
        for (int i = 0; i < 23; i++) {
            aleatorio=new Produtor(geraNomeAleatorio(),i+20);
            Table.adicionaNovo(aleatorio);
        }
        System.out.println(Table.tamanhoLista());
        mostraTudo(Table);
        buscado=Table.buscaNome("Zé do Picadinho Silva");
        System.out.println(buscado.getNome()+" "+buscado.getIdentificador());
        assertTrue(buscado.getNome().equals(novinho.getNome()) &&
                buscado.getIdentificador()==novinho.getIdentificador());
    }
    @Test
    void testAdicionaNumeroRepetido(){
        /*
        * Tabela mesmo tendo teste para prevenir duplicidade está permitindo a inserção de objetos com
        * mesmo identificador, porém nomes diferentes.
        * Atualização de 16:15 de 17/09/2021: agora que ela avalia a repetição do codigo ela terminou
        * por alterar o numero identificador de ZÉ DO PICADINHO SILVA de 22 para 123, isso fez com que ela
        * terminasse por inserir 2x.
        *
        * PS:mas parece estar ok.*/
        Produtor IDrepetida=new Produtor("José Maromba",22);
        insercao();//essa função insere ZÉ DO PICAIDNHO COMO SENDO ID=22;
        TbProdutor.adicionaNovo(novinho);//tenta inserir zé do picadinho novamente
        TbProdutor.adicionaNovo(IDrepetida);
        TbProdutor.adicionaNovo(IDrepetida);
        mostraTudo(TbProdutor);
    }

}// fim teste