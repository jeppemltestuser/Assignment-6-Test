/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6Test;

import static Assignment6Test.MovingObject.Direction.*;

/**
 *
 * @author Jeppe
 */
public class PacMan extends MovingObject{
    private int animCounter=0;

    public PacMan(Level lvl, Direction direction, int speed, int x, int y) {
        super(lvl, direction, speed, x, y);
    }
    
    public void move()
    {
        super.move();
    }
    
    @Override
    public String getAscii() {
        animCounter++;
        if (animCounter%2==0)
            return "◕";
        else return"*";
    }
    
}
