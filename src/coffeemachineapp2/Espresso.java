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
    private  static final double singleShotArabicaBeansAmount = 4;
      private  static final double singleShotRobustaBeansAmount = 3;
    private static final double singleShotWaterAmount = 30;
     private  static final double singleShotCaffineAmount=63;
   private static final double doubleShotArabicaBeansAmount = 7;
      private static final double doubleShotRobustaBeansAmount = 7;
    private static final double doubleShotWaterAmounts = 60;
 private static final double doubleShotCaffineAmount=150;
 
    public Espresso(double shots) {
        super(name, shots);
    }

  


  

    @Override
    public double getCaffine() {
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
    public double getArabicaRequiredBeans(double shots) {
       if(getShots()==1)
         return  singleShotArabicaBeansAmount;
                    else
          return doubleShotArabicaBeansAmount;
    
    }

    @Override
    public double getRobustarequiredBeans(double shots) {
        
        if(getShots()==1)
         return  singleShotRobustaBeansAmount;
                    else
          return doubleShotRobustaBeansAmount;
    }


    @Override
    public double getRequiredWater(double x) {
        if (getShots()==1)
        return  singleShotWaterAmount ;else
            return doubleShotWaterAmounts;
        
    }
}
