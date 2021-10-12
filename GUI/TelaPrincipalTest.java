package GUI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelaPrincipalTest {
    TelaPrincipal gui=new TelaPrincipal();

    @Test
    void testAbrirTela(){
        TelaPrincipal Tela=new TelaPrincipal();
        assertNotNull(Tela);
    }

}