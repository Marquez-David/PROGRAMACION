
package snakegame.graficos;

import Entities.Apple;
import Entities.BodyPart;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 * Se encarga de ejecutar la pantalla del juego
 * @author David Márquez Mínguez
 */
public class Screen extends JPanel implements Runnable{
    
    /**
     * Atributos
     */
    
    public static final int anchoPantalla = 800 ; // Compone el ancho de la ventana
    
    public static final int largoPantalla = 800 ; // Compone el alto de la ventana
    
    private static final long serialVersionUID = 1L ;
    
    private boolean running = false ; // Booleano que avisa si el juego esta en ejecucion
    
    private ArrayList<Apple> apples; // ArrayList que representa donde se colocaran las manzanas
    
    private ArrayList<BodyPart> snake ; // ArrayList que representa snake
    
    private int xCoor = 10, yCoor = 10 ;  // Coordenadas que indican donde empezara la serpiente
    
    private int size = 5 ; // Tamaño inicial de la serpiente
    
    private boolean right = true , left = false , up = false , down = false ; // Definimos los parametros de hacia donde se dirigira inicialmente

    private int ticks = 0 ;
    
    /**
     * Objetos
     */
    
    private Thread thread ; 
      
    private BodyPart b ;
    
    private Apple apple ;
               
    private Random rand ;
        
    private Key key ;
    
    /**
     * Constructor donde llamamos al metodo start()
     */
    
    public Screen () {
        
        setFocusable(true) ;
        
        key = new Key() ;
        
        addKeyListener(key) ;
        
        rand = new Random () ;
        
        setPreferredSize(new Dimension(anchoPantalla, largoPantalla)) ; 
        
        snake = new ArrayList<BodyPart>() ;
        
        apples = new ArrayList<Apple>() ;
        
        start() ; 
        
    }
    
    /**
     * Metodo donde se ira actualizando las variables del juego
     */
    
    public void tick() {
        
        if ( snake.size() == 0) { // Si el tamaño de la snake es 0
            
            b = new BodyPart(xCoor, yCoor, 0) ;
            
            snake.add(b) ; 
            
        }
        
        if(apples.size() == 0) {  // Si no hay manzanas en el mapa
            
            int xCoor = rand.nextInt(79) ; // Elige un numero aleatorio para la coordenada y
            
            int yCoor = rand.nextInt(79); // Elige un numero aleatorio para la coordenada x
            
            apple = new Apple(xCoor,yCoor,10) ; // Creamos el objeto de la manzana
            
            apples.add(apple); // Añade la manzana al mapa
            
        }
        
        for (int i = 0 ; i< apples.size();i++) { // Recorre el array de manzanas
            
            if(xCoor == apples.get(i).getxCoor() && yCoor == apples.get(i).getyCoor()) { // Si la coordenada x y la coordenada y de la manzana
                                                                                         // Coinciden con los de la serpiente
                
                size ++ ;  // El tamaño de la serpiente aumenta
                
                apples.remove(i); // Se elimina el lugar de aparicion de la manzana
                
                i-- ;
                
            }
            
        }
        
        for(int i = 0 ; i < snake.size();i++){  // Recorremos el array de la serpiente
            
            if( xCoor == snake.get(i).getxCoor() && yCoor == snake.get(i).getyCoor()){  // Si la serpiente se toca en algun momento
                
                if( i != snake.size() - 1) {
                    
                    stop() ; // El juego se para
                    
                }
                
            }
            
        }
        
        if( xCoor < 0 || xCoor > 79 || yCoor < 0 || yCoor > 79) {  // Si se completan todas las casillas del juego
            
            stop(); // El juego se para
            
        }
        
        ticks ++ ;
        
        if ( ticks > 250000) {
            
            if(right) xCoor ++ ;
            
            if(left) xCoor -- ;
            
            if(up) yCoor -- ;
            
            if(down) yCoor ++ ;
            
            ticks = 0 ;
            
            b = new BodyPart(xCoor, yCoor, 10) ;
            
            snake.add(b) ;
            
            if(snake.size() > size) {
                
                snake.remove(0);
                
            }
                    
            
        }
        
    }
    
    /**
     * Se esncargara de dibujhar los elementos en la pantalla
     * @param G 
     */
    
    public void paint(Graphics G) {
        
        G.clearRect(0, 0, anchoPantalla, largoPantalla); //Dibuja el rectangulo del juego
        
        G.setColor(Color.green);// define el color del que se van a pintar las rallas
        
        for(int i = 0 ; i < anchoPantalla / 10; i++) {  // Dibuja las lineas en lo ancho
            
            G.drawLine( i * 10, 0, i * 10, largoPantalla);
        
        }
        
        for(int i = 0 ; i < largoPantalla /10; i++) {  // Dibuja las lineas a lo alto
            
            G.drawLine(0, i * 10, anchoPantalla, i*10);
            
        }
        
        for ( int i = 0 ; i < snake.size() ; i++) {  // Dibuja la serpiente
            
            snake.get(i).draw(G);
            
        }
        
        for (int i = 0 ; i< apples.size();i++) {  // Dibuja las manzanas
            
            apples.get(i).draw(G);
              
        }
         
    }
   
    /**
     * Se encarga de que el juego comience, crear el hilo
     */
    
    public void start() {
        
        running = true ;  // El juego ya se esta ejecutando
        
        thread = new Thread(this, "Game Loop") ;  // run();
        
        thread.start(); 
        
    }
   
    /**
     * Se encarga de hacer wue el juego pare, espera a que el hilo muera
     */
    
    public void stop(){
        
        running = false ;
        
        try {
            
            thread.join(); // Espera a que muera el hilo
        
        } catch (InterruptedException ex) {
            
            Logger.getLogger(Screen.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
    }
    
    /**
     * Se encarga de que el juego se vaya actualizando por cada moviento que se haga
     */
    
    public void run() {
        
        while(running) {
            
            tick() ; 
            
            repaint() ;
            
        }
         
    }
 
    /**
     * Esta clase se encarga de que los movientos que se hagan con el taclado se ejecuten
     */
    
    private class Key implements KeyListener {
        
        @Override
        public void keyTyped(KeyEvent ke) {
            
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        }

        /**
         * Cada vez que el jugador pulse una tecla el movimiento cambia
         * @param e 
         */
        
        public void keyPressed(KeyEvent e) {
            
            int key = e.getKeyCode() ;
            
            if( key == KeyEvent.VK_RIGHT && !left) {
                
                up = false ;
                
                down = false ;
                
                right = true ;
                
            }
            
            if( key == KeyEvent.VK_LEFT && !right) {
                
                up = false ;
                
                down = false ;
                
                left = true ;
                
            }
            
            if( key == KeyEvent.VK_UP && !down) {
                
                up = true ;
                
                left = false ;
                
                right = false ;
                
            }
            
            if( key == KeyEvent.VK_DOWN && !up) {
                
                right = false ;
                
                down = true ;
                
                left = false ;
                
            }
            
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        }
    }
}