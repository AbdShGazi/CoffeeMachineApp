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
    private  static final int singleShotArabicaBeansAmount = 4;
      private  static final int singleShotRobustaBeansAmount = 3;
    private static final int singleShotWaterAmount = 30;
     private  static final int singleShotCaffineAmount=63;
   private static final int doubleShotArabicaBeansAmount = 7;
      private static final int doubleShotRobustaBeansAmount = 7;
    private static final int doubleShotWaterAmounts = 60;
 private static final int doubleShotCaffineAmount=150;
    public Espresso(int shots) {
        super(name, shots);
    }


    @Override
    public int getCaffine() {
         if(getShots()==1)
             return singleShotCaffineAmount;
         else
             return doubleShotCaffineAmount;
    }
//    @Override
//    public int getRequiredArabicaBeans(int x) {
//        if(getShots()==1)
//          return  singleShotArabicaBensAmount;
//                    else
//           return doubleShotArabicaBeansAmount;
//      
//    }

    @Override
    public int getArabicaRequiredBeans(int shots) {
       if(getShots()==1)
         return  singleShotArabicaBeansAmount;
                    else
          return doubleShotArabicaBeansAmount;
    
    }

    @Override
    public int getRobustarequiredBeans(int shots) {
        
        if(getShots()==1)
         return  singleShotRobustaBeansAmount;
                    else
          return doubleShotRobustaBeansAmount;
    }


    @Override
    public int getRequiredWater(int x) {
        if (getShots()==1)
        return  singleShotWaterAmount ;else
            return doubleShotWaterAmounts;
        
    }
}
