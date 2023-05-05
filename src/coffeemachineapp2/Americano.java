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
    private static final int singleShotArabicaBensAmount = 4;
    private static final int singleShotRobustaBensAmount =3;
   private static final int singleShotCaffineAmount=60;
    private static final int singleShotWaterAmount = 170;
    private static final int doubleShotArabicaBeansAmount = 7;
       private static final int doubleShotRobustaBeansAmount = 7;
    private static final int doubleShotWaterAmount = 220;
       private static final int doubleShotCaffineAmount=90;

    public Americano(int shots) {
        
        super(name, shots);
        
    }  

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
         return  singleShotArabicaBensAmount;
                    else
          return doubleShotArabicaBeansAmount;
    
    }

    @Override
    public int getRobustarequiredBeans(int shots) {
        
        if(getShots()==1)
         return  singleShotRobustaBensAmount;
                    else
          return doubleShotRobustaBeansAmount;
    }


    @Override
    public int getRequiredWater(int x) {
        if (getShots()==1)
        return  singleShotWaterAmount ;else
            return doubleShotWaterAmount;
        
    }
}
