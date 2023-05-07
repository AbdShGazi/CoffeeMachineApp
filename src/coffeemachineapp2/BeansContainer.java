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
    private int ArabicaBeansAmount;
    private int RobustaBeansAmount;
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
        logger.log("Amount is setted");
    }
    public void addRobustaBeanS(int amount)  {
        if (RobustaBeansAmount + amount > robustaBeansCapacity ) {
            throw new BeansOverCapacityException();
        }

       RobustaBeansAmount += amount;
    }
    public void useRobustaBeans(int amount) {
        int remainingBeans = RobustaBeansAmount  - amount;

        if (remainingBeans < 0) {
           throw new BeansNotEnoughException();
        }

        RobustaBeansAmount = remainingBeans;

       
    }

    public void setArabicaBeansAmount(int ArabicaBeansAmount) {
        this.ArabicaBeansAmount = ArabicaBeansAmount;
    }

    public void setRobustaBeansAmount(int RobustaBeansAmount) {
        this.RobustaBeansAmount = RobustaBeansAmount;
    }
    
    public void useArabicaBeans(int amount) {
        int remainingBeans = ArabicaBeansAmount  - amount;

        if (remainingBeans < 0) {
           throw new BeansNotEnoughException();
        }

       ArabicaBeansAmount = remainingBeans;

       
    }

    public int getArabicaBeansAmount() {
        return ArabicaBeansAmount;
    }

    public int getRobustaBeansAmount() {
        return RobustaBeansAmount;
    }

    public int getArabicaBeansCapacity() {
        return arabicaBeansCapacity;
    }

    public int getRobustaBeansCapacity() {
        return robustaBeansCapacity;
    }

    
}

