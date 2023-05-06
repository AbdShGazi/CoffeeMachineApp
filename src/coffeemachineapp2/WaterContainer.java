/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineapp2;

import coffeemachineapp2.Exceptions.WaterNotEnoughException;
import coffeemachineapp2.Exceptions.WaterOverflowException;

/**
 *
 * @author abdsh
 */
public class WaterContainer {
    private final int waterCapacity=1500;
    private int waterAmount;

    public WaterContainer() {
       
        waterAmount = 0;
    }

    public int getWaterAmount() {
        return waterAmount;
    }



    public void addWater(int amount)  {
        if (waterAmount + amount > waterCapacity) {
            throw new WaterOverflowException();
        }

        waterAmount += amount;
    }

    public void useWater(int amount) {
        int remainingWater = waterAmount - amount;

        if (remainingWater < 0) {
            throw new WaterNotEnoughException();
        }

        waterAmount = remainingWater;
;
       
    }

    public int getWater() {
        return waterAmount;
    }
}
