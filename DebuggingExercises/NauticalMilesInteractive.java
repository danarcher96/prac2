import javax.swing.*;

public class NauticalMilesInteractive
{
    public static void main(String[] args)
    {
        double miles = 1.150779;
        double kilometers = 1.852;
        int nauticalMilesCon;
        String nauticalMiles;
        nauticalMiles = JOptionPane.showInputDialog(null,"Nautical miles","How many nautical miles?", JOptionPane.INFORMATION_MESSAGE);
        nauticalMilesCon = Integer.parseInt(nauticalMiles);
        double convertMiles = nauticalMilesCon * miles;
        double convertKilometers = nauticalMilesCon * kilometers;
        JOptionPane.showMessageDialog(null,nauticalMiles + " nautical miles is " + convertMiles + " miles and " + convertKilometers + " km");

    }
}
