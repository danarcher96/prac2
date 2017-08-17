import javax.swing.*;

public class QuartsToGallonsInteractive
{
    public static void main(String[] args)
    {
        int quartsRatio = 4;
        String quartsReq;
        int neededGallon;
        int neededQuarts;
        int quarts;
        quartsReq = JOptionPane.showInputDialog(null,"Amount","Enter quarts required",
                JOptionPane.INFORMATION_MESSAGE);
        quarts = Integer.parseInt(quartsReq);
        neededGallon = quarts / quartsRatio;
        neededQuarts = quarts % quartsRatio;
        JOptionPane.showMessageDialog(null,"You will need " + neededGallon +" gallons and " + neededQuarts + " quarts");




    }


}

