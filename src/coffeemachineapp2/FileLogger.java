/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineapp2;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author yazan
 */
public class FileLogger implements Logger {

    Date currentDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy, HH:mm:ss");
    String formattedDate = dateFormat.format(currentDate);


    @Override
    public void log(String msg) {
        try {
            FileWriter fileWriter = new FileWriter("machine.log", true);
            fileWriter.write( "["+ formattedDate +  "] : "+ msg+"\n\n");
            fileWriter.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error:" + ex.getMessage());
        }
    }

}
