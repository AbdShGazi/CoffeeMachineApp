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
    private final  int beansCapacity=300;
    private int beansAmount;

    public BeansContainer() {
        beansAmount = 0;
    }

    public void addBeans(int amount)  {
        if (beansAmount + amount > beansCapacity) {
            throw new BeansOverCapacityException();
        }

        beansAmount += amount;
    }

    public int useBeans(int amount) {
        int remainingBeans = beansAmount - amount;

        if (remainingBeans < 0) {
           throw new BeansNotEnoughException();
        }

        beansAmount = remainingBeans;
return remainingBeans;
       
    }

    public int getBeans() {
        return beansAmount;
    }
}

