import java.awt.*;
import java.awt.event.*;
public class Result1 extends Frame
{
	Label l,lname,lrn,l11,l22,l33,l44,ldtot,ldgrade;
	public Result1(){}
	public Result1(int rn,String name,int tot,char grade)
	{
		lname=new Label();
		lrn=new Label();
		ldtot=new Label();
		ldgrade=new Label();
		l11= new Label("Name");
		l22=new Label("Roll no");
		l33=new Label("Total");
		l44=new Label("Grade");
		l=new Label("Result card");
		l.setBounds(200,50,100,40);
		l11.setBounds(50,100,100,40);
		lname.setBounds(150,100,100,40);
		l22.setBounds(50,150,100,40);
		lrn.setBounds(150,150,100,40);
		l33.setBounds(50,200,100,40);
		ldtot.setBounds(150,200,100,40);
		l44.setBounds(50,250,100,40);
		ldgrade.setBounds(150,250,100,40);
		add(l);
		add(lrn);
		add(l11);
		add(l22);
		add(l33);
		add(l44);
		add(lname);
		add(ldtot);
		add(ldgrade);
		lrn.setText(String.valueOf(rn));
		lname.setText((name));
		ldtot.setText(String.valueOf(tot));
		ldgrade.setText(String.valueOf(grade));
		setTitle("Grade card");
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}