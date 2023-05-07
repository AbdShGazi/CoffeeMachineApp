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
  private final int maximumCups=5;
   private int cupsUsed;
   private FileLogger logger;

    public Tray(FileLogger logger) {
        this.logger = logger;
    }
   

    public int getTraycapacity() {
        return maximumCups;
    }

    public void setCupsUsed(int cupsUsed) {
        this.cupsUsed = cupsUsed;
    }

    

    public int getIntrayAmount() {
        return cupsUsed;
    }

    public void setIntrayAmount(int intrayAmount) {
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