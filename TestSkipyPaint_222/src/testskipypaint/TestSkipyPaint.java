/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testskipypaint;



/**
 *
 * @author nau
 */
        import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;
    import java.awt.Graphics;
    import java.awt.event.MouseListener;
    import java.awt.event.MouseMotionListener;
    import java.util.ArrayList;
    import java.util.List;
     
    public class TestSkipyPaint extends JApplet implements MouseListener, MouseMotionListener {
     
    private List<Point> points = new ArrayList<Point>();
    private int r = 8;
    static Display display;
    int mouse_x, mouse_y;
    String modifierKeys = "";
    String eventType = null;
     
    public class Display extends JComponent {
     
    public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.green);
    g.drawRect(0, 0, getSize().width - 1, getSize().height - 1);
    g.drawRect(1, 1, getSize().width - 3, getSize().height - 3);
    g.setColor(Color.red);
    if (eventType == null) {
    return;
    }
     
    g.drawString("Действия мыши: " + eventType, 6, 18);
    if (modifierKeys.length() > 0)
    g.drawString("Modifier keys: " + modifierKeys, 6, 34);
    g.setColor(Color.black);
    g.drawLine(0, mouse_y, getSize().width - 1, mouse_y);
    g.drawLine(mouse_x, 0, mouse_x, getSize().width - 1);
     
    for (Point p : points) {
    draw(p.x, p.y, g);
    }
    }
     
    }
     
    public void draw(int x, int y, Graphics g) {
    g.setColor(Color.black);
    g.drawOval(x - r / 2, y - r / 2, r, r);
    }
     
    public void init() {
    display = new Display();
    setContentPane(display);
    this.setSize(600, 600);
    display.setBackground(Color.white);
    display.addMouseListener(this);
    display.addMouseMotionListener(this);
    }
     
    void setInfo(MouseEvent evt) {
    mouse_x = evt.getX();
    mouse_y = evt.getY();
    modifierKeys = "";
    if (evt.isShiftDown())
    modifierKeys += "Shift ";
    if (evt.isControlDown())
    modifierKeys += "Control ";
    if (evt.isMetaDown())
    modifierKeys += "Meta ";
    if (evt.isAltDown())
    modifierKeys += "Alt";
    display.repaint();
    }
     
    public void mousePressed(MouseEvent evt) {
    eventType = "mouse Pressed";
    setInfo(evt);
    Point p = new Point(evt.getX(), evt.getY());
    points.add(p);
    display.repaint();
    System.out.println("Точка Х и Y " + p);
    }
     
    public void mouseReleased(MouseEvent evt) {
    eventType = "mouseReleased";
    setInfo(evt);
    }
     
    public void mouseClicked(MouseEvent evt) {
    eventType = "mouse Clicked";
    setInfo(evt);
     
    }
     
    public void mouseEntered(MouseEvent evt) {
    eventType = "mouseEntered";
    setInfo(evt);
     
    }
     
    public void mouseExited(MouseEvent evt) {
    eventType = "mouseExited";
    setInfo(evt);
     
    }
     
    public void mouseMoved(MouseEvent evt) {
    mouse_x = evt.getX();
    mouse_y = evt.getY();
    showStatus("Mouse at (" + mouse_x + "," + mouse_y + ")");
    repaint();
    evt.consume();
    }
     
    public void mouseDragged(MouseEvent evt) {
    eventType = "mouseDragged";
    setInfo(evt);
     
    }
     
    } // end of class SimpleMouseTracker