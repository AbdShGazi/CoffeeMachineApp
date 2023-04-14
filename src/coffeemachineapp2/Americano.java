/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineapp2;

/**
 *
 * @author abdsh
 */
public class Americano extends Drink {
    private static final String NAME = "Americano";
    private static final int SINGLE_SHOT_GROUND_COFFEE = 7;
    private static final int SINGLE_SHOT_WATER = 170;
    private static final int DOUBLE_SHOT_GROUND_COFFEE = 14;
    private static final int DOUBLE_SHOT_WATER = 220;

    public Americano(int shots) {
        super(NAME, shots);
    }

    

    
    public int getRequiredBeans() {
        
        return getShots() == 1 ? SINGLE_SHOT_GROUND_COFFEE : DOUBLE_SHOT_GROUND_COFFEE;
    }

    

    
    public int getRequiredWater() {
        return getShots() == 1 ? SINGLE_SHOT_WATER : DOUBLE_SHOT_WATER;
    }
}
