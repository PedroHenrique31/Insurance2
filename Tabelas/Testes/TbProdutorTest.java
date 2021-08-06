package Tabelas.Testes;

import Tabelas.TbProdutor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

//Classe agora possui um array de produtor, faltam metodos para avaliar eles individualemnte
public class TbProdutorTest {
    TbProdutor ClasseTeste=new TbProdutor();
    String nome="Glorinha";

    @Test
    void testNovoTBProdutor(){
        TbProdutor Novo;
        Novo=new TbProdutor();
        assertNotNull(Novo);
    }
    @Test
    void testCriaNovo(){
        ClasseTeste.CriaNovo(nome);
        assertTrue(nome.equals("Falta um metodo"));

    }

}

