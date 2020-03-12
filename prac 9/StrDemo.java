import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="StrDemo.class" height=400 width=400>
	</applet>
*/
public class StrDemo extends Applet implements ActionListener
{
	Button b1,b2,b3;
	TextField t1,t2;
	Label l1,l2,l3,ans;
	public void init()
	{
		b1=new Button ("Concat");
		b2=new Button ("Reverse");
		b3=new Button ("Clear");
		l1=new Label("Enter String 1:");
		add(l1);
		l2=new Label("Enter String 2:");
		ans=new Label();
		l3=new Label("Answer");
		t1=new TextField();
		t1.setBounds(120,20,100,40);
		t2=new TextField();
		l1.setBounds(20,20,80,40);
		add(t1);
		l2.setBounds(20,70,80,40);
		add(l2);
		add(l3);
		t2.setBounds(120,70,100,40);
		add(t2);
		b1.setBounds(50,120,80,40);
		add(b1);
		b2.setBounds(120,120,80,40);
		add(b2);
		b3.setBounds(190,120,80,40);
		add(b3);
		l3.setBounds(80,180,80,40);
		add(l3);
		ans.setBounds(180,180,80,40);
		add(ans);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setLayout(null);
	}
	public void actionPerformed(ActionEvent e)
	{
		int n,f=1;
		if(e.getSource()==b1)
		{
			ans.setText((t1.getText())+(t2.getText()));
		}
		else if(e.getSource()==b2)
		{
			String s,rev="";
			int l;
			s=t1.getText();
			l=s.length();
			for(int i=1;i>=0;i--)
				rev=rev+s.charAt(i);
			ans.setText(rev);
		}
		else if(e.getSource()==b3)
		{
			t1.setText("");
			t2.setText("");
			ans.setText("");
		}
	}
}	