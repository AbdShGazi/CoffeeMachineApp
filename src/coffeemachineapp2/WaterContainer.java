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
    private final double waterCapacity=1500;
    private double waterAmount;
FileLogger logger;

    public WaterContainer() {
       
        waterAmount = 0;
    }

    public WaterContainer(FileLogger logger) {
        this.logger = logger;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
        logger.log( "Water Conatiner has been filled ");
    }



    public void addWater(double amount)  {
        if (waterAmount + amount > waterCapacity) {
            throw new WaterOverflowException();
        }

        waterAmount += amount;
        logger.log("You Added "+ amount +" ml of Water");
    }

    public void useWater(double amount) {
        double remainingWater = waterAmount - amount;

        if (remainingWater < 0) {
            throw new WaterNotEnoughException();
        }

        waterAmount = remainingWater;
 logger.log(amount +" ml of Water Beans has been Used");
       
    }

    public double getWater() {
        return waterAmount;
    }

    Object useWater() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
