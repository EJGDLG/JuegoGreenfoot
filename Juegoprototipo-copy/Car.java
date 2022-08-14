import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * En este apartado lo que se hizo fue ver el tipo de carro , su colición, el 
 * de puntuaje que obtendra.
 * @author (Manuel.u81) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    int score = 0;
    public void act()
    {
        getWorld().showText("Score : " + score, 60, 30);
        checkKey();
        end();
        addscore();
    }

    public void checkKey () {
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-4);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+4);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4, getY());
        }
    }
    public void end(){
    if(isTouching(Mobilbiru.class)){
       getWorld().showText("Game Over \n Score : " + score, 300,300); 
       Greenfoot.stop();
    }
    }
    public void addscore(){
       if(isTouching(Koin.class)){
       score = score + 15 ;
       removeTouching(Koin.class);
    }
}
}
