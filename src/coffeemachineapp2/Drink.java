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
    private static  String name;
    private final int shots;
    private  int Caffine;
    private  int grindsize;
    private  int RobustarequiredBeans;
private  int requiredWater;
private int ArabicaRequiredBeans;


    public  int getGrindsize() {
        return grindsize;
    }

    public void setGrindsize(int grindsize) {
        this.grindsize = grindsize;
    }

    public Drink(String name, int shots) {
        this.name = name;
        this.shots = shots;
    }

    public static String getName() {
        return name;
    }

    public int getShots() {
        return shots;
    }

    public int getRobustarequiredBeans(int shots) {
        return RobustarequiredBeans;
    }

    public int getArabicaRequiredBeans(int shots) {
        return ArabicaRequiredBeans;
    }

    public void setRobustarequiredBeans(int RobustarequiredBeans) {
        this.RobustarequiredBeans = RobustarequiredBeans;
    }

    public void setArabicaRequiredBeans(int ArabicaRequiredBeans) {
        this.ArabicaRequiredBeans = ArabicaRequiredBeans;
    }
    

  

    public int getRequiredWater(int x) {
      return 0;
           
    }

    public  int getCaffine() {
        return Caffine;
    }

    public void setCaffine(int Caffine) {
        this.Caffine = Caffine;
    }
    
    
}
