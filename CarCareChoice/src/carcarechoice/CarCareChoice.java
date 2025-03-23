/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carcarechoice;

import java.util.ArrayList;
import javax.swing.*;

public class CarCareChoice
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList availableServices = new ArrayList();
        
        String wantedService, OC, TR, BC, BI;
        
        OC = ("oil change");
        TR = ("tire rotation");
        BC = ("battery check");
        BI = ("brake inspection");
        
        wantedService = JOptionPane.showInputDialog("Welcome to Peter’s car shop\nwe have four available services:\n~oil change\n~tire rotation\n~battery check\n~brake inspection\nplease type which service you would like.");
        
        
        if (wantedService.equals(OC))
        {
            JOptionPane.showMessageDialog(null, "an oil change is R25");
            System.exit(0);
        }
        
        if (wantedService.equals(TR))
        {
            JOptionPane.showMessageDialog(null, "a tire rotation is R22");
            System.exit(0);
        }
        
        if (wantedService.equals(BC))
        {
            JOptionPane.showMessageDialog(null, "a battery check is R20");
            System.exit(0);
        }
        
        if (wantedService.equals(BI))
        {
            JOptionPane.showMessageDialog(null, "a brake inspection is R8");
            System.exit(0);
        }
        
        else if (!!wantedService.equals(BI)&&(!!wantedService.equals(BC))&&(!!wantedService.equals(TR))&&(!!wantedService.equals(OC)))
        {
            JOptionPane.showMessageDialog(null, "Unfortuntely, Peter’s car shop does not offer this service at this time");
            System.exit(0);
        }
        
    }
    
}
