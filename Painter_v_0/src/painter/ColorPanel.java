package painter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ColorPanel extends JPanel
{
    private JButton colorButton = new JButton("Color");
    private Color color = Color.RED;
    
    public ColorPanel()
    {
        this.add(colorButton);
        colorButton.addActionListener(new ColorListener());
        colorButton.setBackground(color);
    }

    public Color getColor()
    {
        return color;
    }

    class ColorListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            color = JColorChooser.showDialog(ColorPanel.this, "Choose", color);
            colorButton.setBackground(color);
        }
    }
}
