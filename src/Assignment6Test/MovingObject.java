/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6Test;

/**
 *
 * @author Jeppe
 */
public abstract class MovingObject implements PacPrintable {
    
    private Level lvl;
    private Direction direction;
    private int speed;
    private int x;
    private int y;

    public MovingObject(Level lvl, Direction direction, int speed, int x, int y) {
        this.lvl = lvl;
        this.direction = direction;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }
    
    /**
     * Get the value of y
     *
     * @return the value of y
     */
    public int getY() {
        return y;
    }

    /**
     * Set the value of y
     *
     * @param y new value of y
     */
    public void setY(int y) {
        this.y = y;
        lvl.update(this);
    }

    /**
     * Get the value of x
     *
     * @return the value of x
     */
    public int getX() {
        return x;
    }

    /**
     * Set the value of x
     *
     * @param x new value of x
     */
    public void setX(int x) {
        this.x = x;
        lvl.update(this);
    }

    public enum Direction{UP, DOWN, LEFT, RIGHT};
   
    public void move()
    {
        if(getDirection()!=null)
            switch (direction) {
            case RIGHT:
                setX(x+speed);
                break;
            case LEFT:
                setX(x-speed);
                break;
            case DOWN:
                setY(y+speed);
                break;
            case UP:
                setY(y-speed);
                break;
            default:
                break;
        }
    }

    /**
     * Get the value of speed
     *
     * @return the value of speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Set the value of speed
     *
     * @param speed new value of speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Get the value of direction
     *
     * @return the value of direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Set the value of direction
     *
     * @param direction new value of direction
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

}
