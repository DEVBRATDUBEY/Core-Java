import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="RevNo.class" height=200 width=300>
	</applet>
*/
public class RevNo extends Applet implements ActionListener
{
	Button b1,b2;
	TextField no;
	Label l1,l2,ans;
	public void init()
	{
		l1=new Label("Enter the number: ");
		no=new TextField(3);
		b1=new Button("Reverse of the number");
		b2=new Button("Clear");
		l2=new Label("Answer");
		ans=new Label();
		add(l1);
		add(no);
		add(b1);
		add(b2);
		add(l2);
		add(ans);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		int n,rev=0,i,rem;
		if(e.getSource()==b1)
		{
			n=Integer.parseInt(no.getText());
			while(n>0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			ans.setText(String.valueOf(rev));
		}
		else if(e.getSource()==b2)
		{
			no.setText("");
			ans.setText("");
		}
	}
}