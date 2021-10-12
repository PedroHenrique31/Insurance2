package GUI;
import javax.swing.*;
import java.awt.Graphics;

/**
 *          Classe Painel
 *     Herda da classe JPanel. Cria botões e outros objetos para tornar possivel o uso.
 *    TODO:Pode ser uma boa idéia juntar todas essas classes de GUI em um pacote único no futuro.
 * */
public class PainelFundo extends JPanel{
    public void paintComponent( Graphics g ){
        super.paintComponent( g );
        int pixel=0;

        for(pixel=0 ; pixel <= getHeight() ; pixel += 10){
            g.drawLine(0, pixel, pixel, getHeight());
        }

        for(pixel=getHeight() ; pixel >=0 ; pixel -= 10){
            g.drawLine(0, pixel, getHeight() - pixel, 0);
        }

        for(pixel=0 ; pixel <= getHeight() ; pixel +=10){
            g.drawLine(getWidth(), pixel, getWidth() - pixel, getHeight());
        }

        for(pixel=getHeight() ; pixel >=0 ; pixel -= 10){
            g.drawLine(getWidth(), pixel, getWidth() - (getHeight() - pixel), 0);
        }


    }
}