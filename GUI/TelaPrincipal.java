package GUI;

import javax.swing.*;
import java.awt.*;

/**
 *          Interface gráfica
 *      */
public class TelaPrincipal extends JFrame {
    private PainelFundo fundo;
    private Container contentPane=getContentPane();

        public TelaPrincipal(){
            super("CAWA-Corretora de Seguros");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(720,720);
            fundo=new PainelFundo();
            contentPane.setLayout(new BorderLayout());
            contentPane.add(fundo);

            JMenuBar menuBar;

            // Instancia os objetos para criar a barra de menu
            menuBar=new BarraMenuSuperior();

            contentPane.add(menuBar,BorderLayout.PAGE_START);

            setVisible(true);




        }

}
