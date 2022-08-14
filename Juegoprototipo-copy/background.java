import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }

    private void prepare() {
        Car car = new Car();
        addObject(car,159,545);
    }

    public void act(){
        if(Greenfoot.getRandomNumber(100)<1){
        addObject(new Mobilbiru(), Greenfoot.getRandomNumber(200) + 30, 0);
        }
        if(Greenfoot.getRandomNumber(100)<1){
        addObject(new Koin(), Greenfoot.getRandomNumber(200) + 30, 0);
        }
    }
}
