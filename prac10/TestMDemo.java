import java.awt.*;
import java.awt.event.*;
public class TestMDemo extends Frame implements MouseMotionListener
{
	Label l=new Label("position");
	TestMDemo()
	{
		add(l);
		l.setBounds(100,00,100,100);
		addMouseMotionListener(this);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public void mouseDragged(MouseEvent e)
	{
		Graphics g=getGraphics();
		g.setColor(Color.BLACK);
		g.fillOval(e.getX(),e.getY(),20,20);
	}
	public void mouseMoved(MouseEvent e)
	{
		l.setText("x:"+e.getX()+"Y:"+e.getY());
	}
	public static void main(String arg[])
	{
		new TestMDemo();
	}
}