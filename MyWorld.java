import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Counter counter1;
    private Counter counter2;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        
        super(600, 400, 1); 
        
        setBackground("fantasy-city-underwater.jpg");
        
         Counter counter1 = new Counter();
        addObject(counter1,580,79);
        
        Counter counter2 = new Counter();
        addObject(counter2,86,79);
        
        Paddle paddle = new Paddle("up","down");
        addObject(paddle, 587, 200);
        
        Paddle paddle1 = new Paddle("w","s");
        addObject(paddle1, 15, 196);
        
        ball ball = new ball(counter1,counter2 );
        addObject(ball, 300,200);
        
       
        
        
        
    }
    
    
}
