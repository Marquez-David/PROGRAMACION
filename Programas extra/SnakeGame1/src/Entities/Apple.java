
package Entities;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase que crea aleatriamente una manzana en el mapa
 * @author David Márquez Mínguez
 */

public class Apple {
    
    /**
     * Atributos
     */
    
    private int xCoor ;
    
    private int yCoor ;
    
    private int width ;
    
    private int weigth ;
    
    /**
     * Constructor
     * @param xCoor
     * @param yCoor
     * @param TileSize 
     */
    
    public Apple(int xCoor, int yCoor,int TileSize) {
        
        this.xCoor = xCoor ;
        
        this.yCoor = yCoor ;
        
        this.weigth = TileSize ;
        
        this.width = TileSize ;
        
    }
    
    /**
     * Metodo que se encarga de colorear en el mapa la manzana
     * @param G 
     */
    
    public void draw(Graphics G) {
        
        G.setColor(Color.RED);
        
        G.fillRect(xCoor*width, yCoor*weigth , width, weigth);
    
    }

    /**
     * Metodos get y set
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
