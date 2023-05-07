/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineapp2;

import coffeemachineapp2.Exceptions.GrinderLevelException;

/**
 *
 * @author abdsh
 */
public class Grinder {
    private int grindLevel;
    private int beansNedded;
private FileLogger logger;

    public Grinder(FileLogger logger) {
        this.logger = logger;
    }
    
    public void grind(int grindLevel){
        if(grindLevel==1)
            logger.log("Grind level set to  1 (Coarse).");
        else if(grindLevel==2)
            logger.log("Grind level set to 2 (Medium).");
             else if(grindLevel==3)
                 logger.log("Grind level set to 3 (Above Meduim.");
                  else if(grindLevel==4)
                      logger.log("Grind level set to 4 (fine) ");
                       else if(grindLevel==5)
                           logger.log("Grind level set to 5 (Very fine)");
    }

    public int getBeansNedded() {
        return beansNedded;
    }

    public void setBeansNedded(int beansNedded) {
        this.beansNedded = beansNedded;
    }

    public void setGrindSize(int grindSize) {
        this.grindLevel = grindSize;
    }

    
    

    public int getGrindSize() {
        return grindLevel;
    }
}
