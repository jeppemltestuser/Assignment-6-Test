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
public class PacMan extends MovingObject{
    private int animCounter=0;
    @Override
    public String getAscii() {
        animCounter++;
        if (animCounter%2==0)
            return "◕";
        else return"*";
    }
    
}
