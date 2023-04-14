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
  private final int maximumCups=10;
   private int cupsUsed;

    public int getTraycapacity() {
        return maximumCups;
    }

    

    public int getIntrayAmount() {
        return cupsUsed;
    }

    public void setIntrayAmount(int intrayAmount) {
        this.cupsUsed = intrayAmount;
    }
    public boolean cheack(){
        if(cupsUsed==maximumCups)
            return false;
        else 
            return true;
    }
    public void clean()
    { if(cupsUsed==maximumCups)
       cupsUsed=0;
    }
    

}