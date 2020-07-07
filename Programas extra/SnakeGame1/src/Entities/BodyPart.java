
package Entities;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase que se encarga de el cuerpo de la serpiente
 * @author David Márquez Mínguez
 */
public class BodyPart {
    
    /**
     * Atributos
     */
    
    private int xCoor ;
    
    private int yCoor ;
    
    private int width ;
    
    private int heigth ;
    
    /**
     * Constructor
     * @param xCoor
     * @param yCoor
     * @param TileSize 
     */
    
    public BodyPart(int xCoor, int yCoor, int TileSize) {
        
        this.xCoor = xCoor ;
        
        this.yCoor = yCoor ;
        
        this.heigth = TileSize ;
        
        this.width = TileSize ;
        
    }
    
    /**
     * Se encarga de colorear el cuerpo de la serpiente
     * @param G 
     */
    
    public void draw(Graphics G) {
        
        G.setColor(Color.GREEN);
        
        G.fillRect(xCoor * width, yCoor * heigth, width, heigth);
       
        //G.fillRect(xCoor * width+2 , yCoor* heigth +2, width = 8, heigth = 8);
        
        //G.setColor(Color.GREEN);
          
    }

    /**
     * Metodos Get y Set
    */
    
    public int getxCoor() {
        
        return xCoor;
    
    }

    public int getyCoor() {
        
        return yCoor;
    
    }

    public void setxCoor(int xCoor) {
        
        this.xCoor = xCoor;
    
    }

    public void setyCoor(int yCoor) {
        
        this.yCoor = yCoor;
    
    }
  
}
