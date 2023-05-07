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
    private static final String name = "Americano";
    private static final double singleShotArabicaBensAmount = 4;
    private static final double singleShotRobustaBensAmount =3;
   private static final double singleShotCaffineAmount=60;
    private static final double singleShotWaterAmount = 170;
    private static final double doubleShotArabicaBeansAmount = 7;
       private static final double  doubleShotRobustaBeansAmount = 7;
    private static final double doubleShotWaterAmount = 220;
       private static final double doubleShotCaffineAmount=90;

    public Americano(double shots) {
        
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
         return  singleShotArabicaBensAmount;
                    else
          return doubleShotArabicaBeansAmount;
    
    }

    @Override
    public double getRobustarequiredBeans(double shots) {
        
        if(getShots()==1)
         return  singleShotRobustaBensAmount;
                    else
          return doubleShotRobustaBeansAmount;
    }


    
    public double getRequiredWater(double x) {
        if (getShots()==1)
        return  singleShotWaterAmount ;else
            return doubleShotWaterAmount;
        
    }
}
