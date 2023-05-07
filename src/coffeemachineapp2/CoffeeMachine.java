/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineapp2;

import coffeemachineapp2.Exceptions.GrinderLevelException;
import coffeemachineapp2.Exceptions.TrayFullException;
import javax.swing.JOptionPane;

/**
 *
 * @author abdsh
 */
public class CoffeeMachine {

    private BeansContainer beansContainer = null;
    private WaterContainer waterContainer = null;
    private Grinder grinder = null;
    private Tray wasteTray = null;
    private int cupsDone;
    FileLogger logger;

    public CoffeeMachine(FileLogger logger) {
        cupsDone = 0;
        this.logger = logger;
        beansContainer = new BeansContainer(logger);
        waterContainer = new WaterContainer(logger);
        grinder = new Grinder(logger);
        wasteTray = new Tray(logger);
    }

    public void start() {
        logger.log("Starting..");
    }

    public void selectGrindLevel(int level) {
        if (level < 1 || level > 5) {
            throw new GrinderLevelException();
        } else {

            grinder.setGrindSize(level);
            logger.log("Grind Level Setted to : " + level);

        }
    }

    public WaterContainer getWaterContainer() {
        return waterContainer;
    }

    public double getWaterCapacity() {
        return waterContainer.getWater();
    }

    public double getWaterLevel() {
        return waterContainer.getWaterAmount();
    }

    public double getBeansLevel() {
        return beansContainer.getArabicaBeansAmount() + beansContainer.getRobustaBeansAmount();
    }

    public double getGrindLevel() {
        return grinder.getGrindSize();
    }

    public String getCoffeeName(Drink coffeeType) {
        return coffeeType.getName();
    }

    public Tray getWasteTray() {
        return wasteTray;
    }

//    public void addBeans(int amount)  {
//        beansContainer.addBeans(amount);
//    }
    public void addWater(int amount) {
        waterContainer.addWater(amount);

    }

    public void clean() {
        wasteTray.clean();
        cupsDone = 0;
    }
    // 

    public void selectCoffee(Drink coffeeType, int shots, int level) {
        int robustaBeans = coffeeType.getRobustarequiredBeans(shots);
        int arabicaBeans = coffeeType.getArabicaRequiredBeans(shots);
        int requiredWater = coffeeType.getRequiredWater(shots);

        grinder.setGrindSize(coffeeType.getGrindsize());
        Drink d = new Drink(coffeeType.getName(), shots);

        try {
            beansContainer.useArabicaBeans(arabicaBeans);
            beansContainer.useRobustaBeans(robustaBeans);
            waterContainer.useWater(requiredWater);
            grinder.grind(level);
            wasteTray.setCupsUsed(cupsDone++);
            logger.log("You ordered: " + d.getInfo());

            if (!wasteTray.isClean()) {
                throw new TrayFullException();
            }
        } catch (Exception ex) {

            throw ex;
        }

        int caffeine = coffeeType.getCaffine();

    }

    public BeansContainer getBeansContainer() {
        return beansContainer;
    }

    public double calculateCaffeine(double arabica, double robusta) {
        double caffeine = 0;
        caffeine = arabica * 12 + robusta * 27;
        return caffeine;
    }

    public void CustomCoffee(String name, double arabica, double robusta, int shots, int grindLevel) {
        try {

            Drink customDrink = new Drink(name, shots);
            if (customDrink.getShots() == 0) {
                waterContainer.useWater(30);
            } else if (customDrink.getShots() == 1) {
                waterContainer.useWater(120);
            } else {
                waterContainer.useWater(200);
            }
            grinder.grind(grindLevel);
            beansContainer.useArabicaBeans(arabica);
            beansContainer.useRobustaBeans(robusta);
            wasteTray.setCupsUsed(cupsDone++);
            logger.log("You ordered: " + customDrink.getName());
            if (!wasteTray.isClean()) {
                throw new TrayFullException();
            }

        } catch (Exception ex) {
            throw ex;

        }
    }

}
