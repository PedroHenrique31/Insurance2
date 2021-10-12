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
        Imprimir=new JMenu("Relatórios");

        //Adiciona o topico na barra de menu
        add(menuArquivo);
        add(menuSegurado);
        add(menuAuto);
        add(Imprimir);

        //Cria os subItens para os topicos da barra de menu

        //Criar opções do menu Arquivo
        menuItemsArquivo[0]=new JMenuItem("Abrir arquivo");
        menuItemsArquivo[1]=new JMenuItem("Buscar");
        for(int i=0;i<2;i++){menuArquivo.add(menuItemsArquivo[i]);}

        //Cria opções do menu Segurado
        menuItemSegurado[0]=new JMenuItem("Buscar Segurado");
        menuItemSegurado[1]=new JMenuItem("Incluir");
        menuItemSegurado[2]= new JMenuItem("Alterar");
        menuItemSegurado[3]=new JMenuItem("Excluir");
        for (int i=0;i<4;i++){menuSegurado.add(menuItemSegurado[i]);}

        //Cria opções do menu Auto
        menuItemAuto[2]= new JMenuItem("Incluir");
        menuItemAuto[1]= new JMenuItem("Alterar");
        menuItemAuto[3]= new JMenuItem("Excluir");
        menuItemAuto[0]= new JMenuItem("Buscar Automóvel");
        for(int i=0;i<4;i++){menuAuto.add(menuItemAuto[i]);}

        //Cria menu imprimir
        menuItemimpressora= new JMenuItem[5];
        menuItemimpressora[0]=new JMenuItem("Vencimentos"); //consulta no BD quais apolices vencem no mes corrente
        menuItemimpressora[1]=new JMenuItem("Segurado");
        menuItemimpressora[2]=new JMenuItem("Bem Segurado");
        menuItemimpressora[3]=new JMenuItem("cartões vencimento");
        menuItemimpressora[4]=new JMenuItem("coisa 4");
        subMenuFicha= new JMenu("Apagar isso");
        //Adciona as coisas ao menu
        Imprimir.add(menuItemimpressora[0]);
        for (int i=1;i<=4;i++){Imprimir.add(menuItemimpressora[i]);}
        Imprimir.add(subMenuFicha);


    }

}
