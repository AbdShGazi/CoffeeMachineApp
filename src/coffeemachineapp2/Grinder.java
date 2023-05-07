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
    private double grindLevel;
    private double beansNedded;
private FileLogger logger;

    public Grinder(FileLogger logger) {
        this.logger = logger;
    }
    
    public void grind(double grindLevel){
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

    public double getBeansNedded() {
        return beansNedded;
    }

    public void setBeansNedded(double beansNedded) {
        this.beansNedded = beansNedded;
    }

    public void setGrindSize(double grindSize) {
        this.grindLevel = grindSize;
    }

    
    

    public double getGrindSize() {
        return grindLevel;
    }
}
