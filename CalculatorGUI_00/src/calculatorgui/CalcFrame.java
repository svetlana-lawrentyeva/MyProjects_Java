package calculatorgui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import sun.org.mozilla.javascript.internal.Undefined;

public class CalcFrame extends JFrame
{    
    private JPanel panelText=new JPanel();
    private JPanel panelButtons=new JPanel();
    private JTextField textField=new JTextField("0");
    private int buttonsQuantity=16;
    private JButton[] buttons=new JButton[buttonsQuantity];
    private boolean firstNumber=true;
    
    private int a;
    private int b;
    private char c;
    private void makeButtons()
    {
        int numberCount=1;
        for(int i=0; i<buttonsQuantity; ++i)
        {
            switch(i)
            {
                case 3:                    
                    buttons[i]=new JButton("+");
                    break;
                case 7:
                    buttons[i]=new JButton("-");
                    break;
                case 11:
                    buttons[i]=new JButton("*");
                    break;
                case 12:
                    buttons[i]=new JButton("0");
                    break;
                case 13:
                    buttons[i]=new JButton("C");
                    break;
                case 14:
                    buttons[i]=new JButton("=");
                    break;
                case 15:
                    buttons[i]=new JButton("/");
                    break;
                default:
                    buttons[i]=new JButton(""+(numberCount++));
            }
             buttons[i].setFont(new Font("Ubuntu", 0, 40));
            panelButtons.add(buttons[i]);
            buttons[i].addActionListener(new PressListener());
        }
        
    }
    private class PressListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) {
            char value=((JButton)ae.getSource()).getText().charAt(0);
                    switch(value)
                    {
                        case '+':
                            a=Integer.parseInt(textField.getText());
                            c=value;
                            firstNumber=true;
                            break;
                        case '-':
                            a=Integer.parseInt(textField.getText());
                            c=value;
                            firstNumber=true;
                            break;
                        case '*':
                            a=Integer.parseInt(textField.getText());
                            c=value;
                            firstNumber=true;
                            break;
                        case '/':
                            a=Integer.parseInt(textField.getText());
                            c=value;
                            firstNumber=true;
                            break;
                        case '=':
                            b=Integer.parseInt(textField.getText());
                            try
                            {
                                textField.setText(""+Calculator.Calc(a, b, c));
                            }
                            catch(ArithmeticException e)
                            {
                                textField.setText("Err");
                            }
                            catch(IllegalArgumentException e)
                            {
                                textField.setText("Err");
                            }
                            firstNumber=true;
                            break;
                        case 'C':
                            textField.setText("0");
                            a=0;
                            b=0;
                            firstNumber=true;
                            break;
                        default:
                            String prevalue=textField.getText();
                            //if(prevalue.equals("0"))
                            if(firstNumber)
                            {
                                textField.setText(String.valueOf(value));
                                firstNumber=false;
                            }
                            else
                            {
                                textField.setText(prevalue+String.valueOf(value));
                            }
                    }
        }
        
    }
    public CalcFrame()
    {
        
        this.add(panelText, BorderLayout.NORTH);
        this.add(panelButtons);
        panelText.setLayout(new BorderLayout());
        textField.setFont(new Font("Ubuntu", 0, 40));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        panelText.add(textField);
        panelButtons.setLayout(new GridLayout(4, 4, 10, 10));    
        makeButtons();
    }
}
