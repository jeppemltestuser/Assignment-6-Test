/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6Test;

import static Assignment6Test.MovingObject.Direction.*;
import java.util.Random;

/**
 *
 * @author Jeppe
 */
public class Ghost extends MovingObject{
    private static final Random rand = new Random(); 
    
    private boolean isEatable;

    public Ghost(Level lvl, Direction direction, int speed, int x, int y) {
        super(lvl, direction, speed, x, y);
    }

    /**
     * Get the value of isEatable
     *
     * @return the value of isEatable
     */
    public boolean isIsEatable() {
        return isEatable;
    }

    /**
     * Set the value of isEatable
     *
     * @param isEatable new value of isEatable
     */
    public void setIsEatable(boolean isEatable) {
        this.isEatable = isEatable;
    }

    @Override
    public String getAscii() {
        return "∩";
    }

    private void setRandomDirection()
    {
        int dir = rand.nextInt(4);
        switch (dir) {
            case 0:
                setDirection(UP);
                break;
            case 1:
                setDirection(RIGHT);
                break;
            case 2:
                setDirection(DOWN);
                break; 
            case 3:
                setDirection(LEFT);
                break;
            default:
                throw new UnsupportedOperationException("Not supported yet.");
        }
    }
    
    @Override
    public void move() {
        setRandomDirection();
        super.move();
    }

    
    
}
