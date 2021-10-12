package GUI;

import javax.swing.*;
/**
 *          Interface gráfica
 *      */
public class TelaPrincipal extends JFrame {
    private PainelFundo fundo;
        public TelaPrincipal(){
            super("CAWA-Corretora de Seguros");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(720,720);
            fundo=new PainelFundo();
            add(fundo);


            setVisible(true);




        }

}
