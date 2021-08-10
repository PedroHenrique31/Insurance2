package Tabelas.Testes;

import Tabelas.Produtor;
import Tabelas.TabelaTipoEstruturado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabelaTipoEstruturadoTest {
    TabelaTipoEstruturado<Produtor> TbProdutor= new TabelaTipoEstruturado<>();
    Produtor novinho=new Produtor("Zé do Picadinho Silva",1);
    String nome="Raul Seixas";

    @Test
    void testTbProdutor(){
        assertNotNull(TbProdutor);
    }
    @Test void testAdicionaNovo(){
        TbProdutor.adicionaNovo(novinho);
        int topo=TbProdutor.CodigoUltimoDaLista();
        Produtor novo=new Produtor(nome,topo++);
        assertEquals(novo,TbProdutor.veElemento(topo));
    }

}