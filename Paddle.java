import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle extends Actor
{
    private int dY =5;
    private String up;
    private String down;
    
    /**
     * creates paddle
     */
    public Paddle(String upMove, String downMove)
    {
        this.up = upMove;
        this.down = downMove;
    }
    /**
     * moves the paddle up and down
     
     */
    public void act()
    {
    if(Greenfoot.isKeyDown(up))
        {
            setLocation(getX(), getY()-dY );
        }
        
    if(Greenfoot.isKeyDown(down))
        {
            setLocation(getX(), getY()+dY );
        }          
    }
    
    
    }

