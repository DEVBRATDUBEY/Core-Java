import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Fact.class" height=400 width=400>
	</applet>
*/

public class Fact extends Applet implements ActionListener 
{
	Button b1,b2;
	TextField no;
	Label l1,l2,ans;
	public void init()
		{
			l1=new Label("Enter number: ");
			no=new TextField(3);
			b1=new Button("factorial");
			b2=new Button("Clear");
			l2=new Label("Answer");
			ans=new Label();
			add(l1);
			add(no);
			add(b1);
			add(b2);
			add(ans);
			b1.addActionListener(this);
			b2.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e)
		{
				int n,f=1;
				if(e.getSource()==b1)
				{
					n=Integer.parseInt(no.getText());
					while(n>=1)
					{
						f=f*n;
						n=n-1;
					}
					ans.setText(String.valueOf(f));
				}
				else if(e.getSource()==b2)
				{
					no.setText("");
					ans.setText("");
				}
		}
}		