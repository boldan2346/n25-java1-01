import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Definição da classe MyWorld.
 * 
 * @author Helena Boldan 
 * @version 2025-06-04
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class BeeWorld here.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        aranha.setLocation(30,38);
        Abelha abelha = new Abelha();
        addObject(abelha,65,161);
        Mosca mosca = new Mosca();
        addObject(mosca,42,360);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,76,289);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,136,344);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,165,258);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,46,438);
        Mosca mosca6 = new Mosca();
        addObject(mosca6,145,439);
        Mosca mosca7 = new Mosca();
        addObject(mosca7,39,508);
        Mosca mosca8 = new Mosca();
        addObject(mosca8,151,504);
        addObject(aranha,32,40);
    }
}
