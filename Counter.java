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
    /** 
     * creates counter
     */
    public Counter()
    {
        score = 0;
        setImage (new GreenfootImage(99,113));
        update();
    }
    
    
    /**
     * adds points to the score
     */
    public void addScore()
    {
        score++;
        update();
    }
    
    /**
     * Changes the image on the score
     */
    public void update()
    {
        GreenfootImage img = getImage();
        
        img.clear();
        img.drawString("score:" + score,4,20);
    }
}
