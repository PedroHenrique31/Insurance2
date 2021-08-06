package Tabelas.Testes;

import Tabelas.TbProdutor;
import org.junit.jupiter.api.Test;

public class TbProdutorTest {
    TbProdutor ClasseTeste=new TbProdutor();
    String nome="Glorinha";

    @Test
    void testNovoTB(){
        TbProdutor Novo;
        Novo=new TbProdutor();
        assertNotNull(Novo);
    }
    @Test
    void testCriaNovo(){
        ClasseTeste.CriaNovo(nome);

    }

}
