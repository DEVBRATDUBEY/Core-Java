import java.awt.*;
import java.awt.event.*;
class Data extends Frame implements ActionListener
{
	Label l,l1,l2,l3,l4,l5,l6,l7,l8,l9,ltot,lgrade;
	TextField tm1,tm2,tm3,tm4,tm5,trn,tname;
	Button bres,bclear;
	public Data()
	{
		l=new Label("Result");
		l1=new Label("Enter name");
		tname=new TextField(20);
		l2=new Label("Enter rn");
		trn=new TextField(4);
		l3=new  Label("Marks Sub1");
		tm1=new TextField(3);
		l4=new  Label("Marks Sub2");
		tm2=new TextField(3);
		l5=new  Label("Marks Sub3");
		tm3=new TextField(3);
		l6=new  Label("Marks Sub4");
		tm4=new TextField(3);
		l7=new  Label("Marks Sub5");
		tm5=new TextField(3);
		bclear=new Button("Clear");
		bres=new Button("Result");
		l.setBounds(300,30,50,100);
		add(l);
		l1.setBounds(50,100,100,40);
		add(l1);
		tname.setBounds(150,100,100,40);
		add(tname);
		l2.setBounds(50,150,100,40);
		add(l2);
		trn.setBounds(150,150,100,40);
		add(trn);
		l3.setBounds(50,200,100,40);
		add(l3);
		tm1.setBounds(150,200,100,40);
		add(tm1);
		l4.setBounds(50,250,100,40);
		add(l4);
		tm2.setBounds(150,250,100,40);
		add(tm2);
		l5.setBounds(50,300,100,40);
		add(l5);
		tm3.setBounds(150,300,100,40);
		add(tm3);
		l6.setBounds(50,350,100,40);
		add(l6);
		tm4.setBounds(150,350,100,40);
		add(tm4);
		l7.setBounds(50,400,100,40);
		add(l7);
		tm5.setBounds(150,400,100,40);
		add(tm5);
		bres.setBounds(150,550,100,40);
		add(bres);
		add(bclear);
		setLayout(null);
		setSize(600,600);
		setVisible(true);
		bres.addActionListener(this);
		bclear.addActionListener(this);	
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
		if(e.getSource()==bclear)
		{
			trn.setText("");
			tname.setText("");
			tm1.setText("");
			tm2.setText("");
			tm3.setText("");
			tm4.setText("");
			tm5.setText("");
		}
		if(e.getSource()==bres)
		{
			int tot,per,m1,m2,m3,m4,m5,rn;
			char grade;
			String name;
			rn=Integer.parseInt(trn.getText());
			name=tname.getText();
			m1=Integer.parseInt(tm1.getText());
			m2=Integer.parseInt(tm2.getText());
			m3=Integer.parseInt(tm3.getText());
			m4=Integer.parseInt(tm4.getText());
			m5=Integer.parseInt(tm5.getText());
			tot=m1+m2+m3+m4+m5;
			per=(tot*100)/500;
			if(m1<40|| m2<40|| m3<40|| m4<40|| m5<40)
			{
					tot=0;grade='F';
			}
			else if(per<50)
				grade='C';
			else if(per<60)
				grade='B';
			else if(per<70)
				grade='A';
			else
				grade='O';
			Result1 r =new Result1(rn,name,tot,grade);
		}
	}

	public static void main(String arg[])
	{
		Data d=new Data();
	}

}