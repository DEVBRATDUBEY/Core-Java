import java.awt.*;
import java.awt.event.*;
public class DemoKL extends Frame implements KeyListener
{
	Label l;
	TextArea area;
	DemoKL()
	{
		l=new Label();
		l.setBounds(20,50,100,20);
		area=new TextArea();
		area.setBounds(20,80,300,300);
		area.addKeyListener(this);

		add(l);add(area);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void keyPressed(KeyEvent e)
	{
		l.setText("Text Pressed");
	}
	public void keyReleased(KeyEvent e)
	{
		l.setText("Text Released");
	}
	public void keyTyped(KeyEvent e)
	{
		l.setText("Key Typed");
	}
	public static void main(String[] args)
	{
		DemoKL d=new DemoKL();
	}
}
