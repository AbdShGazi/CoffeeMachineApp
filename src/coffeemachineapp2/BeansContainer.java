/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineapp2;

import coffeemachineapp2.Exceptions.BeansOverCapacityException;
import coffeemachineapp2.Exceptions.BeansNotEnoughException;

/**
 *
 * @author abdsh
 */
public class BeansContainer {
//    private final  int beansCapacity=300;
//    private int beansAmount;
    private double ArabicaBeansAmount;
    private double RobustaBeansAmount;
    int arabicaBeansCapacity = 400;
    int robustaBeansCapacity = 400;
  private FileLogger logger;
        
    
public BeansContainer(FileLogger logger) {
        
        this.logger = logger;
    }

   
    public BeansContainer() {
        this.ArabicaBeansAmount =0;
        this.RobustaBeansAmount =0;
    }
   

    public void addArabicaBeans(int amount)  {
        if (ArabicaBeansAmount + amount > arabicaBeansCapacity ) {
            throw new BeansOverCapacityException();
        }

        ArabicaBeansAmount += amount;
        logger.log("You Added "+ amount +" gm of Arabica Beans");
    }
    public void addRobustaBeanS(double amount)  {
        if (RobustaBeansAmount + amount > robustaBeansCapacity ) {
            throw new BeansOverCapacityException();
        }

       RobustaBeansAmount += amount;
        logger.log("You Added "+ amount +" gm of Robusta Beans");
    }
    public void useRobustaBeans(double amount) {
        double remainingBeans = RobustaBeansAmount  - amount;

        if (remainingBeans < 0) {
           throw new BeansNotEnoughException();
        }

        RobustaBeansAmount = remainingBeans;
        logger.log(amount +" gm of Robusta Beans has been Used");

       
    }

    public void setArabicaBeansAmount(int ArabicaBeansAmount) {
        this.ArabicaBeansAmount = ArabicaBeansAmount;
          logger.log( "Arabica Conatiner has been filled ");
    }

    public void setRobustaBeansAmount(int RobustaBeansAmount) {
        this.RobustaBeansAmount = RobustaBeansAmount;
        logger.log( "Roubsta Conatiner has been filled ");
    }
    
    public void useArabicaBeans(double amount) {
        double remainingBeans = ArabicaBeansAmount  - amount;

        if (remainingBeans < 0) {
           throw new BeansNotEnoughException();
        }

       ArabicaBeansAmount = remainingBeans;
 logger.log(amount +" gm of Robusta Beans has been Used");
       
    }

    public double getArabicaBeansAmount() {
        return ArabicaBeansAmount;
    }

    public double getRobustaBeansAmount() {
        return RobustaBeansAmount;
    }

    public double getArabicaBeansCapacity() {
        return arabicaBeansCapacity;
    }

    public double getRobustaBeansCapacity() {
        return robustaBeansCapacity;
    }

    
}

