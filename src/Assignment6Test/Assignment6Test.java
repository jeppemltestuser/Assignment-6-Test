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
public class Assignment6Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Level lvl1 = new Level();
        lvl1.createMockLevel();
        Ghost g = lvl1.getGhost();
        PacMan p = lvl1.getPacMan();
        System.out.print(lvl1);
        
        g.move();
        p.move();
        System.out.print(lvl1);
        g.move();
        System.out.print(lvl1);
        g.move();
        System.out.print(lvl1);
    }
    
}
