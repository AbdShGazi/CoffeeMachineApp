/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineapp2.Exceptions;

/**
 *
 * @author abdsh
 */
public class WaterNotEnoughException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Water not enough!"; 
    }
    
    
}
