
package snakegame;

import java.awt.GridLayout;
import javax.swing.JFrame;
import snakegame.graficos.Screen ;


public class Frame extends JFrame {
    
    /**
     * Constructor
     */
    
    public Frame(){
    
      
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;  
        
        setTitle("Snake Game") ; 
        
        setResizable(false) ;  
        
        init() ; 
        
    }
    
    /**
     * Metodo que crea la ventana del juego
     */
    
    public void init() {
        
        setLayout(new GridLayout(1,1,0,0)) ;  
        
        Screen s = new Screen() ;
        
        add(s) ;
        
        pack();  
        
        setLocationRelativeTo(null) ;
        
        setVisible(true);  
        
    }
    
    public static void main (String[] args){
        
        new Frame() ;  
        
    }

}
