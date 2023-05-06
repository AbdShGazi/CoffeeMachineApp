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
    private BeansContainer beansContainer=new BeansContainer();
    private WaterContainer waterContainer=new WaterContainer();
    private Grinder grinder= new Grinder();
    private Tray wasteTray= new Tray();
    private int cupsDone;
    

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

    public WaterContainer getWaterContainer() {
        return waterContainer;
    }

    public int getWaterCapacity() {
        return waterContainer.getWater();
    }

    public int getWaterLevel(){
        return waterContainer.getWaterAmount();
    }
    public int getBeansLevel(){
        return beansContainer.getArabicaBeansAmount() + beansContainer.getRobustaBeansAmount();
    }
    public int getGrindLevel(){
        return grinder.getGrindSize();
    }
    public String getCoffeeName(){
        return Drink.getName();
    }

    public Tray getWasteTray() {
        return wasteTray;
    }
    
//    public void addBeans(int amount)  {
//        beansContainer.addBeans(amount);
//    }
    
    public void addWater(int amount)  {
        waterContainer.addWater(amount);
    }
   public void clean(){
 wasteTray.clean();
 cupsDone=0;
   }
   // 
    public void selectCoffee(Drink coffeeType, int shots)  {
        int robustaBeans = coffeeType.getRobustarequiredBeans(shots);
          int arabicaBeans = coffeeType.getArabicaRequiredBeans(shots);
        int requiredWater = coffeeType.getRequiredWater(shots);

                                             
    


        grinder.setGrindSize(coffeeType.getGrindsize());
        

try {
    beansContainer.useArabicaBeans(arabicaBeans);
    beansContainer.useRobustaBeans(robustaBeans);
    waterContainer.useWater(requiredWater);
            wasteTray.setCupsUsed(cupsDone++);
            
if(!wasteTray.isClean())
    throw new TrayFullException();
} catch (Exception ex) {
   
    throw ex;
}

        

       

//        System.out.println("Enjoy your " + Drink.getName() + " coffee!");

        int caffeine = coffeeType.getCaffine();
        
//        System.out.println("Caffeine: " + caffeine + " mg");
       

        
//
//        System.out.println("Remaining Arabica beans: " + remainArabicabeans);
//        System.out.println("Remaining Robusta beans: " + remainRobustabeans);
//
//        System.out.println("Remaining water: " + remainwater);
    }

    public BeansContainer getBeansContainer() {
        return beansContainer;
    }
    
    public void CustomCoffee(String name,int robusta,int arabica,int shots){
    try {
           
            Drink customDrink = new Drink(name, shots);
             if(customDrink.getShots()==0)
                 waterContainer.useWater(30);
             else if(customDrink.getShots()==1)
 waterContainer.useWater(120);
             else
                 waterContainer.useWater(200);
            
             beansContainer.useArabicaBeans(arabica);
             beansContainer.useRobustaBeans(robusta);
           wasteTray.setCupsUsed(cupsDone++);
            
if(!wasteTray.isClean())
    throw new TrayFullException();
            
            System.out.println("Custom drink created: " + customDrink.getName());
        } catch (Exception ex) {
            throw ex;
            
        }
    }

    
}

