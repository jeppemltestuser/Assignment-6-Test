/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6Test;

import Assignment6Test.MovingObject.Direction;

/**
 *
 * @author Jeppe
 */
public class Level {
    PacPrintable[][] lvl1 = new PacPrintable[20][10];
    Ghost ghost;
    PacMan pacMan;

    public Ghost getGhost() {
        return ghost;
    }

    public PacMan getPacMan() {
        return pacMan;
    }
    
    @Override
    public String toString()
    {
        String levelString = "";
        
        for (int i = 0; i < lvl1[0].length; i++) {
            for (int j = 0; j < lvl1.length; j++) {
                if (lvl1[j][i]==null)
                    levelString +=" ";
                else
                    levelString += lvl1[j][i].getAscii();
            }
            levelString +="\n";
        }
        
        return levelString;
    }
    
    public void createMockLevel()
    {
        // create top and bottom border walls
        for (int i = 0; i < lvl1[0].length; i++) {
            lvl1[0][i] = new Wall();
            lvl1[lvl1.length-1][i] = new Wall();
        }
        
        // create left and right border walls
        for (int i = 0; i < lvl1.length; i++) {
            lvl1[i][0] = new Wall();
            lvl1[i][lvl1[0].length-1] = new Wall();
        }
        
        lvl1[2][7] = ghost = new Ghost(this,Direction.DOWN, 1, 2, 7);
        lvl1[4][2] = new Ghost(this,Direction.DOWN, 1, 4, 2);
        lvl1[7][2] = new Ghost(this,Direction.DOWN, 1, 7, 2);
        
        lvl1[4][4] = pacMan = new PacMan(this,Direction.DOWN, 1, 4, 4);
    }

    void update(MovingObject aThis) {
        for (int i = 0; i < lvl1[0].length; i++) {
            for (int j = 0; j < lvl1.length; j++) {
                if (lvl1[j][i]==aThis)
                {
                    lvl1[j][i]=null;
                    lvl1[aThis.getX()][aThis.getY()]=aThis;
                }
            }
        }
    }
}
