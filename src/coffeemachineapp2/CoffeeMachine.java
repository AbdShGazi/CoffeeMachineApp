/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineapp2;

import coffeemachineapp2.Exceptions.GrinderLevelException;
import coffeemachineapp2.Exceptions.TrayFullException;

/**
 *
 * @author abdsh
 */
public class CoffeeMachine {
    private BeansContainer beansContainer=new BeansContainer();
    private WaterContainer waterContainer=new WaterContainer();
    private Grinder grinder= new Grinder();
    private Tray wasteTray= new Tray();
    private int cupsDone;
    private static final int MaximumCups = 10;

    public CoffeeMachine(){
        cupsDone = 0;
    }

    public void start(){}
  

public void selectGrindLevel(int level) {
    if (level < 1 || level > 5) {
       throw new GrinderLevelException();
    }
    else
    {
        
        grinder.setGrindSize(level);
        
        System.out.println("Grind level is :");
    }
}

    public int getWaterCapacity() {
        return waterContainer.getWater();
    }

    public int getWaterLevel(){
        return waterContainer.getWaterAmount();
    }
    public int getBeansLevel(){
        return beansContainer.getBeans();
    }
    public int getGrindLevel(){
        return grinder.getGrindSize();
    }
    public String getCoffeeName(){
        return Drink.getName();
    }
    public boolean isClean(){
        if (cupsDone ==10) {
          return false;
        }
        else
            return true;
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
        
        cupsDone++;
if(cupsDone>=10)
    throw new TrayFullException();
        int remainbeans = beansContainer.useBeans(requiredBeans);
        int remainwater = waterContainer.useWater(requiredWater);

       

        System.out.println("Enjoy your " + Drink.getName() + " coffee!");

        int caffeine = coffeeType.getCaffine();
        
        System.out.println("Caffeine: " + caffeine + " mg");
       

        

        System.out.println("Remaining beans: " + remainbeans);
        System.out.println("Remaining water: " + remainwater);
    }
    
}

