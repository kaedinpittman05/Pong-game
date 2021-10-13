import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private int score;
    
    public Counter()
    {
        score = 0;
        setImage (new GreenfootImage(99,113));
        update();
    }
    
    
    
    public void addScore()
    {
        score++;
        update();
    }
    
    public void update()
    {
        GreenfootImage img = getImage();
        
        img.clear();
        img.drawString("score:" + score,4,20);
    }
}
