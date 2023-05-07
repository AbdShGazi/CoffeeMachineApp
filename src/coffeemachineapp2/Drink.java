/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineapp2;

/**
 *
 * @author abdsh
 */
public class Drink {

    private String name;
    private final double shots;
    private double Caffine;
    private double grindsize;
    private double RobustarequiredBeans;
    private double requiredWater;
    private double ArabicaRequiredBeans;

    public double getGrindsize() {
        return grindsize;
    }

    public void setGrindsize(double grindsize) {
        this.grindsize = grindsize;
    }

    public Drink(String name, double shots) {
        this.name = name;
        this.shots = shots;
    }

    public String getName() {
        return name;
    }

    public String getinfoShots() {
        if (shots == 0) {
            return "Single shot";
        } else {
            return "Double shot";
        }
    }

    public double getShots() {
        return shots;
    }

    public double getRobustarequiredBeans(double shots) {
        return RobustarequiredBeans;
    }

    public double getArabicaRequiredBeans(double shots) {
        return ArabicaRequiredBeans;
    }

    public void setRobustarequiredBeans(double RobustarequiredBeans) {
        this.RobustarequiredBeans = RobustarequiredBeans;
    }

    public void setArabicaRequiredBeans(double ArabicaRequiredBeans) {
        this.ArabicaRequiredBeans = ArabicaRequiredBeans;
    }

    public double getRequiredWater(double x) {
        return 0;

    }

    public double getCaffine() {
        return Caffine;
    }

    public void setCaffine(double Caffine) {
        this.Caffine = Caffine;
    }

    public String getInfo() {
        return "" + getName() + " " + getinfoShots();
    }

}
