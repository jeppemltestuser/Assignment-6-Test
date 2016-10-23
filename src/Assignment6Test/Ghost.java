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
public class Ghost extends MovingObject{

    private boolean isEatable;

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
    
}
