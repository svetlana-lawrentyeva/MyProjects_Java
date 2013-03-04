package painter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class LinePanel extends JPanel
{
    private int item = 0;
    String[] numbers = new String[50];
    private JComboBox combobox;

    public LinePanel()
    {
        for (int i = 1; i <= 50; ++i)
        {
            numbers[i - 1] = "" + i;
        }
        combobox = new JComboBox(numbers);
        this.add(combobox);
        combobox.addActionListener(new ComboboxListener());
    }

    public int getLine()
    {
        return item + 1;
    }

    class ComboboxListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            JComboBox box = (JComboBox) e.getSource();
            item = box.getSelectedIndex();
        }
    }
}
