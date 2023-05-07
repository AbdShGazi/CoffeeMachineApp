/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineapp2;

/**
 *
 * @author abdsh
 */
public class Tray {
  private final double maximumCups=5;
   private double cupsUsed;
   private FileLogger logger;

    public Tray(FileLogger logger) {
        this.logger = logger;
    }
   

    public double getTraycapacity() {
        return maximumCups;
    }

    public void setCupsUsed(double cupsUsed) {
        this.cupsUsed = cupsUsed;
    }

    

    public double getIntrayAmount() {
        return cupsUsed;
    }

    public void setIntrayAmount(double intrayAmount) {
        this.cupsUsed = intrayAmount;
    }
   
    public void clean()
    { 
       cupsUsed=0;
    }
    public boolean isClean(){
        if (cupsUsed >=maximumCups) {
          return false;
        }
        else
            return true;
    }
    

}