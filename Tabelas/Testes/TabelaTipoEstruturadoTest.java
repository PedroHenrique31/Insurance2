package Tabelas.Testes;

import Tabelas.Produtor;
import Tabelas.TabelaTipoEstruturado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabelaTipoEstruturadoTest {
    TabelaTipoEstruturado<Produtor> TbProdutor = new TabelaTipoEstruturado<>();
    Produtor novinho = new Produtor("Zé do Picadinho Silva", 22);
    String nome = "Raul Seixas";
    int iteracoes=100;

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
            novo=new Produtor(nome, novoID);
            TbProdutor.adicionaNovo(novo);
        }

        novoID= TbProdutor.geraNovoID();
        novo=new Produtor("Pedro Henrique",novoID);
        TbProdutor.adicionaNovo(novo);
        ultimoElemento = TbProdutor.veElemento(TbProdutor.tamanhoLista()-1);// eis o poblema
        System.out.println("Ultimo nome: "+ultimoElemento.getNome()+" ultimo codigo: "+ultimoElemento.getIdentificador());
        assertEquals(novo.getIdentificador(), ultimoElemento.getIdentificador());
    }

    @Test
    void testVeElemento() {
        TbProdutor.adicionaNovo(novinho);
        Produtor verifica = TbProdutor.veElemento(0);
        System.out.println("Novinho.nome: " + novinho.getNome() + "\nTbProdutor[0].nome: " + TbProdutor.veElemento(0));
        assertEquals(novinho.getNome(), verifica.getNome());
    }
    @Test
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

}