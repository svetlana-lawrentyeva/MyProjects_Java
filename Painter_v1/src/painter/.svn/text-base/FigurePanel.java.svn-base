/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package painter;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author nau
 */
public class FigurePanel extends JPanel
{
    private ButtonGroup group = new ButtonGroup();
    private JRadioButton radioDraw = new JRadioButton();
    private JRadioButton radioLine = new JRadioButton();
    private JRadioButton radioSquare = new JRadioButton();
    private JRadioButton radioCircle = new JRadioButton();
    private String figure = "Draw";

    public FigurePanel()
    {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        group.add(radioDraw);
        group.add(radioLine);
        group.add(radioSquare);
        group.add(radioCircle);
        this.add(radioDraw);
        this.add(radioLine);
        this.add(radioSquare);
        this.add(radioCircle);
        radioDraw.setText("Draw");
        radioLine.setText("Line");
        radioSquare.setText("Square");
        radioCircle.setText("Circle");
        radioDraw.setSelected(true);
        radioDraw.setAlignmentX(Component.CENTER_ALIGNMENT);
        radioLine.setAlignmentX(Component.CENTER_ALIGNMENT);
        radioSquare.setAlignmentX(Component.CENTER_ALIGNMENT);
        radioCircle.setAlignmentX(Component.CENTER_ALIGNMENT);
        radioDraw.addActionListener(new RadioListener());
        radioLine.addActionListener(new RadioListener());
        radioSquare.addActionListener(new RadioListener());
        radioCircle.addActionListener(new RadioListener());
    }

    public String getFigure()
    {
        return figure;
    }

    class RadioListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            JRadioButton rb = (JRadioButton) e.getSource();
            figure = rb.getText();
        }
    }
}
