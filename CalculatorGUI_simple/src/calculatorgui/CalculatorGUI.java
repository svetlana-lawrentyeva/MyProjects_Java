package calculatorgui;

import javax.swing.JFrame;

public class CalculatorGUI
{
    public static void main(String[] args)
    {
        CalcFrame frame=new CalcFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(150,250);
        frame.setVisible(true);
    }
}
