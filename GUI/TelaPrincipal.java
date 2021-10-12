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
            JMenu menuArquivo,menuSegurado,menuAuto,Imprimir,subMenuFicha;
            JMenuItem menuItemsArquivo[],menuItemSegurado[],menuItemAuto[],menuItemimpressora[];

            //Conjunto de opções do menuBar
            menuItemsArquivo=new JMenuItem[2];
            menuItemSegurado=new JMenuItem[4];
            menuItemAuto=new JMenuItem[4];
            subMenuFicha=new JMenu("Ficha");

            // Instancia os objetos para criar a barra de menu
            menuBar=new JMenuBar();

            menuArquivo=new JMenu("Arquivo");
            menuSegurado=new JMenu("Segurado");
            menuAuto=new JMenu("Auto");
            Imprimir=new JMenu("Imprimir");

            //Adiciona o topico na barra de menu
            menuBar.add(menuArquivo);
            menuBar.add(menuSegurado);
            menuBar.add(menuAuto);
            menuBar.add(Imprimir);

            contentPane.add(menuBar,BorderLayout.PAGE_START);




            setVisible(true);




        }

}
