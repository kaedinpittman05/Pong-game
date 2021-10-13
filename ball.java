import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    private int dX = 5;
    private int dY = 2;
    private int player1=0;
    private int player2=0;
    private Counter counter1;
    private Counter counter2;
    
    private int start=0;
    private boolean bounce;
    /**
     * counter increase
     */
    public ball(Counter count1,Counter count2)
    {
        counter1 = count1;
        counter2 = count2;
    }
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       start();
       
       
          move();
       checkForBounce();
       
       isTouching();
       atEdge(); 
       
       
       
    }
    
    /**
     * adds 1 to the start variable
     */
    public void start()
    {
        start++;
    }
    
    /**
     * Makes the ball move
     */
    public void move()
    {
        if(start >= 60)
        {
            setLocation(getX()+dX, getY()+dY );
        }
        
    }
    
    /** 
     * makes the ball bounce at the edges
     */
    public void checkForBounce()
    {
        if(getY()<=0 || getY() >= getWorld().getHeight()-1)
        {
            dY = -dY;
            Greenfoot.playSound("Pong-ball-bounce.wav");
        }
    }
    
    /**
     * makes the ball bounce off of the paddles
     */
    public void isTouching()
    {
        if(isTouching(Paddle.class))
        {
            dX = -dX;
            
            move(40);
            move(-40);
            
            Greenfoot.playSound("Pong-ball-bounce.wav");
        }
        
        
    }
    
    
    
    

    /**
     * gives the player a point and resets the ball
     */
    public void atEdge()
    {
        if(getX()<=0 )
        {
            setLocation(300, 200);
            counter1.addScore();
            if(start > 20)
            {
                start = start * 0;
            }
            dX=5;
            player2++;
            checkForWin();
            Greenfoot.playSound("Score.wav");
            
        }
        
        if(getX() >= getWorld().getWidth()-1)
        {
            setLocation(300, 200);
            counter2.addScore();
             if(start > 20)
            {
                start = start * 0;
            }
            dX=5;
            player1++;
            checkForWin();
            Greenfoot.playSound("Score.wav");
            
        }
    }
    
    /**
     * checks to see if a player meets the win condition
     */
    public void checkForWin()
    {
        if(player1 >= 8)
        {
            
            setImage(new GreenfootImage("Player 1 wins",50,Color.BLACK,
            Color.RED));
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
        }
        
        if(player2 >= 8)
        {
            
            setImage(new GreenfootImage("Player 2 wins",50,Color.BLACK,
            Color.RED));
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
        }
    }
}
