package Tabelas.Testes;

import Principal.Tabelas.Produtor;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class ProdutorTest {
    //TODO:Primeira tentativa de teste, mais tarde devo criar um array para testar em massa.
    Produtor candidato;
    String nome="Teste de nome";
    int identificador=9;

    @Test
    void testaConstrutorProdutor(){
        String nome="Nome Teste";
        int i=9;
        candidato=new Produtor(nome,i);
        assertNotNull(candidato);
    }
    @Test
    void testaGetidentificador(){
        candidato=new Produtor(nome,identificador);
        int id=candidato.getIdentificador(),comparador=9;
        assertEquals(id,comparador);
    }
    @Test
    void testaSetIdentificador(){//Testa a função setIdenttificador
        candidato=new Produtor(nome,identificador);
        int novo_id=127,comparador=127;
        candidato.setIdentificador(novo_id);
        assertEquals(candidato.getIdentificador(),comparador);
    }
    @Test
    void testaSetNome(){//Mais tarde gerar string aleatória para testar
        candidato=new Produtor(nome,identificador);
        String novoNome="Zé do picadinho",nomeCandidato;
        candidato.setNome(novoNome);
        nomeCandidato=candidato.getNome();
        assertTrue(nomeCandidato.equals(novoNome.toUpperCase(Locale.ROOT)));
    }


}