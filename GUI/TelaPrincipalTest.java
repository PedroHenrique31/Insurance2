package GUI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

class TelaPrincipalTest {
    //TelaPrincipal gui=new TelaPrincipal();
    Scanner leitor=new Scanner(System.in);

    @Test
    void testAbrirTela(){
        TelaPrincipal Tela=new TelaPrincipal();
        System.out.println("digite alguma coisa quando quiser");
        leitor.nextLine();
        assertNotNull(Tela);
    }

}