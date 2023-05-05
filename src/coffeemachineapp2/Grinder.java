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

    public Grinder() {
        this.grindLevel = 1;
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

    public void setGrindLevel(int grindLevel) {
        this.grindLevel = grindLevel;
    }
    

    public int getGrindSize() {
        return grindLevel;
    }
}
