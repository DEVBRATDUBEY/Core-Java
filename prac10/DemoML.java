import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="DemoML.class" height=400 width=400></applet>*/
public class DemoML extends Frame implements MouseListener
{
	Label l;
	public DemoML()
	{
		l=new Label();
		l.setBackground(Color.RED);
		l.setBounds(20,50,100,20);
		add(l);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e)
	{
		Graphics g=getGraphics();
		g.setColor(Color.BLACK);
		g.fillOval(e.getX(),e.getY(),30,30);
	}
	public void mouseEntered(MouseEvent e)
	{
		l.setText("X:"+e.getX()+"Y:"+e.getY());
	}

	public void mouseExited(MouseEvent e)
	{
		l.setText("Mouse Exited");
	}
	public void mousePressed(MouseEvent e)
	{
		l.setText("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e)
	{
		l.setText("Mouse Released");
	}
	public static void main(String[] args)
	{
		DemoML d=new DemoML();
	}
}