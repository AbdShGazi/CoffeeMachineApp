/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineapp2.Exceptions;

/**
 *
 * @author abdsh
 */
public class BeansContainerExceptions extends Exception {

    public BeansContainerExceptions() {
        super("Overflow error: Cannot add more beans than the container's capacity.");
    }

    public BeansContainerExceptions(String message) {
        super(message);
    }

   
    
}