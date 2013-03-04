/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import com.sun.imageio.plugins.jpeg.JPEG;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author nau
 */
public class View extends JFrame
{
    JButton[][] bArray=new JButton[4][4];
    String[]bNames={"9","8","7","+",
                    "6","5","4","-",
                    "3","2","1","*",
                    "0","=","C","/"};
    JTextField lScreen;
    JPanel buttonPanel;
    JPanel bigPanel;
    Container contentPane=this.getContentPane();
    String input="";
    String inputA="0";
    String inputB="0";
    String sign="";
    boolean Aflag=true;
    public View()
    {
        super("Calculator");
        setBounds(0, 0, 200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false);
        int buttonCounter=0;
        for(int i=0;i<4;++i)
        {
            for(int j=0;j<4;++j)
            {
                bArray[i][j]=new JButton(bNames[buttonCounter++]);
                bArray[i][j].addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        input=((JButton)e.getSource()).getText();
                        switch (input)
                        {
                            case "+":
                                sign=input;
                                Aflag=false;
                                break;
                            case "-":
                                sign=input;
                                Aflag=false;
                                break;
                            case "*":
                                sign=input;
                                Aflag=false;
                                break;
                            case "/":
                                sign=input;
                                Aflag=false;
                                break;
                            case "=":
                                if(inputA.equals(""))inputA="0";
                                if(inputB.equals(""))inputB="0";
                                int a=Integer.parseInt(inputA);
                                int b=Integer.parseInt(inputB);
                                char c=sign.charAt(0);
                                Calc calc=new CalcR();
                                inputA=calc.calc(a, b, c)+"";
                                lScreen.setText(inputA);
                                inputB="0";
                                break;
                            case "C":
                                Aflag=true;
                                inputA="0";
                                inputB="0";
                                lScreen.setText("0");
                                break;
                            default:
                                if(Aflag)                          
                                {
                                    if(inputA.equals("0")/* & input.equals("0")*/)
                                    {
                                        inputA=input;
                                        lScreen.setText(inputA);
                                    }
                                    else 
                                    {
                                        inputA+=input;
                                        lScreen.setText(inputA);
                                    }
                                }
                                else if(!Aflag)
                                {
                                    if(inputB.equals("0"))
                                    {           
                                        inputB=input;
                                        lScreen.setText(inputB);
                                    }
                                    else
                                    {
                                        inputB+=input;
                                        lScreen.setText(inputB);
                                    }
                                }                                    
                        }                        
                    }
                });
            }
        }
        lScreen=new JTextField("0");
        lScreen.setFont(new Font("Ubuntu", Font.PLAIN, 20));
        lScreen.setHorizontalAlignment(JLabel.RIGHT);
        lScreen.setEditable(false);
        buttonPanel=new JPanel(new GridLayout(4, 4));
        for(int i=0;i<4;++i)
        {
            for(int j=0;j<4;++j)
            {
                buttonPanel.add(bArray[i][j]);
            }
        }
        bigPanel=new JPanel(new BorderLayout());
        bigPanel.add(lScreen,BorderLayout.NORTH);
        bigPanel.add(buttonPanel);
        contentPane.add(bigPanel);
    }
}

