package GUI;

import javax.swing.*;

public class BarraMenuSuperior extends JMenuBar {
    JMenu menuArquivo,menuSegurado,menuAuto,Imprimir,subMenuFicha;
    JMenuItem menuItemsArquivo[],menuItemSegurado[],menuItemAuto[],menuItemimpressora[];



    public BarraMenuSuperior(){
        super();
        //Conjunto de opções do menuBar
            //Itens dentro das opções da barra de menu
        menuItemsArquivo=new JMenuItem[2];
        menuItemSegurado=new JMenuItem[4];
        menuItemAuto=new JMenuItem[4];
        subMenuFicha=new JMenu("Ficha");

        //opções da barra de menu
        menuArquivo=new JMenu("Arquivo");
        menuSegurado=new JMenu("Segurado");
        menuAuto=new JMenu("Auto");
        Imprimir=new JMenu("Imprimir");

        //Adiciona o topico na barra de menu
        add(menuArquivo);
        add(menuSegurado);
        add(menuAuto);
        add(Imprimir);

    }

}
