/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineapp2;

/**
 *
 * @author abdsh
 */
public class Espresso extends Drink {
    private static final String NAME = "Espresso";
    private static final int SINGLE_SHOT_GROUND_COFFEE = 7;
    private static final int SINGLE_SHOT_WATER = 30;
    private static final int DOUBLE_SHOT_GROUND_COFFEE = 14;
    private static final int DOUBLE_SHOT_WATER = 60;

    public Espresso(int shots) {
        super(NAME, shots);
    }


    @Override
    public int getRequiredBeans(int x) {
        return getShots() == 1 ? SINGLE_SHOT_GROUND_COFFEE : DOUBLE_SHOT_GROUND_COFFEE;
    }

    
    @Override
    public int getRequiredWater(int x) {
        return getShots() == 1 ? SINGLE_SHOT_WATER : DOUBLE_SHOT_WATER;
    }
}
