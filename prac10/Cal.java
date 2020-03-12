import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Cal extends Frame implements ActionListener
{
	TextField t;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bc,beq,bfr,bpm;
	float n1,f=0,ans;
	char ope;
	public Cal()
	{
		setTitle("Calculator");
		setSize(250,400);
		t=new TextField(20);
		t.setBounds(30,50,190,40);
		b1=new Button("1");
		b1.setBounds(30,100,40,40);
		b1=new Button("1");
		b1.setBounds(30,100,40,40);
		b2=new Button("2");
		b2.setBounds(80,100,40,40);
		b3=new Button("3");
		b3.setBounds(130,100,40,40);
		badd=new Button("+");
		badd.setBounds(180,100,40,40);
		b4=new Button("4");
		b4.setBounds(30,150,40,40);
		b5=new Button("5");
		b5.setBounds(80,150,40,40);
		b6=new Button("6");
		b6.setBounds(130,150,40,40);
		bsub=new Button("-");
		bsub.setBounds(180,150,40,40);
		b7=new Button("7");
		b7.setBounds(30,200,40,40);
		b8=new Button("8");
		b8.setBounds(80,200,40,40);
		b9=new Button("9");
		b9.setBounds(130,200,40,40);
		bdiv=new Button("/");
		bdiv.setBounds(180,200,40,40);
		b0=new Button("0");
		b0.setBounds(30,250,40,40);
		bc=new Button("C");
		bc.setBounds(80,250,40,40);
		bfr=new Button(".");
		bfr.setBounds(130,250,40,40);
		bmul=new Button("*");
		bmul.setBounds(180,250,40,40);
		beq=new Button("=");
		beq.setBounds(30,300,120,40);
		bpm=new Button("+/-");
		bpm.setBounds(180,300,40,40);
		add(t);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(badd);
		add(bc);
		add(bdiv);
		add(beq);
		add(bfr);
		add(bmul);
		add(bpm);
		add(bsub);
		setLayout(null);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		beq.addActionListener(this);
		bc.addActionListener(this);
		bfr.addActionListener(this);
		bpm.addActionListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}	
	public void actionPerformed(ActionEvent e)
	{
			if(e.getSource()==b1)
			{
				if(f==0)
					t.setText(t.getText()+"1");
				else	
				{
					t.setText("");
					t.setText("1");
					f=0;
				}
			}
			if(e.getSource()==b2)
			{
				if(f==0)
					t.setText(t.getText()+"2");
				else	
				{
					t.setText("");
					t.setText("2");
					f=0;
				}
			}
			if(e.getSource()==b3)
			{
				if(f==0)
					t.setText(t.getText()+"3");
				else	
				{
					t.setText("");
					t.setText("3");
					f=0;
				}
			}
			if(e.getSource()==b4)
			{
				if(f==0)
					t.setText(t.getText()+"4");
				else	
				{
					t.setText("");
					t.setText("4");
					f=0;
				}
			}
			if(e.getSource()==b5)
			{
				if(f==0)
					t.setText(t.getText()+"5");
				else	
				{
					t.setText("");
					t.setText("5");
					f=0;
				}
			}
			if(e.getSource()==b6)
			{
				if(f==0)
					t.setText(t.getText()+"6");
				else	
				{
					t.setText("");
					t.setText("6");
					f=0;
				}
			}
			if(e.getSource()==b7)
			{
				if(f==0)
					t.setText(t.getText()+"7");
				else	
				{
					t.setText("");
					t.setText("7");
					f=0;
				}
			}
			if(e.getSource()==b8)
			{
				if(f==0)
					t.setText(t.getText()+"8");
				else	
				{
					t.setText("");
					t.setText("9");
					f=0;
				}
			}
			if(e.getSource()==b9)
			{
				if(f==0)
					t.setText(t.getText()+"9");
				else	
				{
					t.setText("");
					t.setText("9");
					f=0;
				}
			}
			if(e.getSource()==b0)
			{
				if(f==0)
					t.setText(t.getText()+"0");
				else	
				{
					t.setText("");
					t.setText("0");
					f=0;
				}
			}
			if(e.getSource()==bfr)
			{
					t.setText(t.getText()+".");
			}
			if(e.getSource()==bpm)
			{
					t.setText("-"+t.getText());
			}
			if(e.getSource()==bc)
			{
					t.setText("");
			}
			if(e.getSource()==badd)
			{
				ope='+';
				n1=Float.valueOf(t.getText());
				f=1;
			}
			if(e.getSource()==bsub)
			{
				ope='-';
				n1=Float.valueOf(t.getText());
				f=1;
			}
			if(e.getSource()==bmul)
			{
				ope='*';
				n1=Float.valueOf(t.getText());
				f=1;
			}
			if(e.getSource()==bdiv)
			{
				ope='/';
				n1=Float.valueOf(t.getText());
				f=1;
			}
			if(e.getSource()==beq)
			{
				switch(ope)
				{
					case'+':ans=n1+Float.parseFloat(t.getText());
					break;
					case'*':ans=n1*Float.parseFloat(t.getText());
					break;
					case'/':ans=n1/Float.parseFloat(t.getText());
					break;
					case'-':ans=n1-Float.parseFloat(t.getText());
					break;
				}
				t.setText(String.valueOf(ans));
			}
	}
	public static void main(String ar[])
	{
		Cal c =new Cal();
	}
}
