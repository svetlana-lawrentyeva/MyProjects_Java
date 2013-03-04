package calculatorgui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcFrame extends JFrame
{    
    private JPanel panel=new JPanel();
    private JTextField textA=new JTextField("0");
    private JTextField textC=new JTextField("+");
    private JTextField textB=new JTextField("0");
    private JTextField textRes=new JTextField("0");
    private JButton calcButton = new JButton("Calc");
    
    private int a;
    private int b;
    private char c;
    
    public CalcFrame()
    {
        //this.add(panel, BorderLayout.NORTH);
        this.add(panel);
        //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setLayout(null);
        textA.setBounds(25,10,100,30);
        textA.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(textA);
        textC.setBounds(75,50,50,30);
        textC.setHorizontalAlignment(JTextField.CENTER);
        panel.add(textC);
        textB.setBounds(25,90,100,30);
        textB.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(textB);
        textRes.setBounds(25,130,100,30);
        textRes.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(textRes);
        calcButton.setBounds(25,170,100,30);
        panel.add(calcButton);
        calcButton.addActionListener(new CalcListener());
    }
    private class CalcListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            a=Integer.parseInt(textA.getText());
            c=textC.getText().charAt(0);
            b=Integer.parseInt(textB.getText());
            try
            {
            textRes.setText(""+Calculator.Calc(a, b, c));
            }
            catch(ArithmeticException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            catch (IllegalArgumentException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
    }
}
