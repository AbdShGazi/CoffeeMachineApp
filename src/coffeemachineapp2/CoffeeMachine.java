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
public class CoffeeMachine {
    private BeansContainer beansContainer=new BeansContainer();
    private WaterContainer waterContainer=new WaterContainer();
    private Grinder grinder= new Grinder();
    private Tray wasteTray= new Tray();
    private int cupsServed;
    private static final int MAX_CUPS_BEFORE_CLEAN = 10;

    public CoffeeMachine(){
        cupsServed = 0;
    }

    
    public String Start(){
        return "Coffee Machine Status: "+"Water Amount: "+waterContainer.getWater()+"\nBeans Amount: "+beansContainer.getBeans()+"\nGrinder Level:"+grinder.getGrindSize()+"\nTray Status:"+wasteTray.cheack();
    }

public void selectGrindLevel(int level) {
    if (level < 1 || level > 5) {
       throw new GrinderLevelException();
    } else {
        grinder.setGrindSize(level);
        System.out.println("Grind level set to");
    }
}

    public int getWaterCapacity() {
        return waterContainer.getWater();
    }

    public void addBeans(int amount)  {
        beansContainer.addBeans(amount);
    }

    public void addWater(int amount)  {
        waterContainer.addWater(amount);
    }
   public void clean(){
 wasteTray.clean();
   }
    public void selectCoffee(Drink coffeeType, int shots)  {
        int requiredBeans = coffeeType.getRequiredBeans(shots);
        int requiredWater = coffeeType.getRequiredWater(shots);

      
        grinder.setGrindSize(coffeeType.getGrindsize());
        
        cupsServed++;

        int remainingBeans = beansContainer.useBeans(requiredBeans);
        int remainingWater = waterContainer.useWater(requiredWater);

       

        System.out.println("Enjoy your " + Drink.getName() + " coffee!");

        int caffeine = coffeeType.getCaffine();
        
        System.out.println("Caffeine: " + caffeine + " mg");
       

        if (cupsServed % MAX_CUPS_BEFORE_CLEAN == 0) {
            wasteTray.clean();
        }

        System.out.println("Remaining beans: " + remainingBeans);
        System.out.println("Remaining water: " + remainingWater);
    }
    
}

