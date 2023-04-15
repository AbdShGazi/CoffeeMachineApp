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
    private static final String name = "Espresso";
    private  static final int singleShotBeansAmount = 7;
    private static final int singleShotWaterAmount = 30;
     private  static final int singleShotCaffineAmount=63;
   private static final int doubleShotBeansAmount = 14;
    private static final int doubleShotWaterAmounts = 60;
 private static final int doubleShotCaffineAmount=150;
    public Espresso(int shots) {
        super(name, shots);
    }


    @Override
    public int getRequiredBeans(int x) {
        if(getShots()==1)
            return singleShotBeansAmount;
        else
            return
                    doubleShotBeansAmount;
       
    }

    @Override
    public int getCaffine() {
         if(getShots()==1)
             return singleShotCaffineAmount;
         else
             return doubleShotCaffineAmount;
    }

    

    
    @Override
    public int getRequiredWater(int x) {
        if(getShots()==1)
            return 
                    singleShotWaterAmount;
                    else 
            return doubleShotWaterAmounts;
      
    }
}
