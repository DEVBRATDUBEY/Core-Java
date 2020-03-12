//Design an AWT application that contains the interface to add Student info and display the same.//
import java.awt.*;
import java.awt.event.*;

public class Student extends Frame implements ActionListener
{
	Label l,l1,l2,l3,l4,l5,l6,l7,l8;
	TextField tname,temail,tpass;
	TextArea tadd;
	Choice d,y,m;
	CheckboxGroup cb;
	List course;
	Checkbox cf,cm,cdan,csin,cpain,cother;
	Button bdisp,bclear;
	public Student()
	{
		l=new Label("Student Data");
		l1=new Label("Enter Name");
		tname=new TextField(20);
		l2=new Label("Enter Add");
		tadd=new TextArea(10,3);
		l3=new Label("Date of Birth:");
		d=new Choice();
		m=new Choice();
		y=new Choice();
		for(int i=1;i<=31;i++)
			d.add(String.valueOf(i));
		for(int i=1;i<=12;i++)
			m.add(String.valueOf(i));
		for(int i=1980;i<=2100;i++)
			y.add(String.valueOf(i));
		l4=new Label("Gender:");	
		cb=new CheckboxGroup();
		cm=new Checkbox("Male",cb,false);
		cf=new Checkbox("Female",cb,false);
		l5=new Label("Course");
		course=new List(3);
		course.add("B.Com");
		course.add("BScIT");
		course.add("BscCS");
		course.add("BCA");
		course.add("BAF/BMS");
		l6=new Label("Hobbies");
		cpain=new Checkbox("Painting");
		csin=new Checkbox("Singing");
		cdan=new Checkbox("Dance");
		cother=new Checkbox("Other");
		l7=new Label("E-Mail ID");
		temail=new TextField(20);
		l8=new Label("Password");
		tpass=new TextField(20);
		tpass.setEchoChar('*');
		bclear=new Button("Clear");
		bdisp=new Button("Show");
		l.setBounds(300,30,100,40);
		add(l);
		l1.setBounds(50,100,100,40);
		add(l1);
		tname.setBounds(150,100,100,40);
		add(tname);
		l2.setBounds(50,150,100,40);
		add(l2);
		tadd.setBounds(150,150,100,40);
		add(tadd);
		l3.setBounds(50,200,100,40);	
		add(l3);
		d.setBounds(150,200,50,40);
		m.setBounds(210,200,50,40);
		y.setBounds(270,200,100,40);
		add(d);
		add(m);
		add(y);
		l4.setBounds(50,250,100,40);
		add(l4);
		cm.setBounds(150,250,100,40);
		cf.setBounds(250,250,100,40);
		add(cm);	
		add(cf);
		l5.setBounds(50,300,100,40);
		add(l5);
		course.setBounds(150,300,100,40);
		add(course);
		l6.setBounds(50,350,100,40);
		add(l6);
		cpain.setBounds(150,350,80,40);
		csin.setBounds(230,350,80,40);
		cdan.setBounds(310,350,80,40);
		cother.setBounds(390,350,80,40);
		add(cpain);
		add(csin);
		add(cdan);
		add(cother);
		l7.setBounds(50,400,100,40);
		add(l7);
		temail.setBounds(150,400,100,40);
		add(temail);
		l8.setBounds(50,450,100,40);
		add(l8);
		tpass.setBounds(150,450,100,40);	
		add(tpass);
		bdisp.setBounds(150,550,100,40);
		bclear.setBounds(300,550,100,40);
		add(bdisp);
		add(bclear);
		setLayout(null);
		setSize(600,600);
		setVisible(true);
		bdisp.addActionListener(this);
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
			tadd.setText(" ");
			tname.setText(" ");
			d.select(0);
			m.select(0);		
			y.select(0);
			cm.setState(false);
			cf.setState(false);
			cdan.setState(false);
			cpain.setState(false);			
			csin.setState(false);	
			cother.setState(false);	
			course.select(0);
			tpass.setText(" ");
			temail.setText(" ");
		}
		if(e.getSource()==bdisp)
		{
			System.out.println("\nName:"+tname.getText());
			System.out.println("\nAddress:"+tadd.getText());
			System.out.println("\nDate of Birth:"+d.getSelectedItem()+"/"+m.getSelectedItem()+"/"+y.getSelectedItem());
			if(cm.getState()==true)
				System.out.println("\nGender:Male");
			if(cf.getState()==true)
				System.out.println("\nGender:Femal");
	System.out.println("\nCourse:"+course.getSelectedItem());
			System.out.println("\nHobbies:");
			if(cdan.getState()==true)
				System.out.println("Dance");
			if(cpain.getState()==true)
				System.out.println("Painting");
			if(csin.getState()==true)
				System.out.println("Singing");
			if(cother.getState()==true)
				System.out.println("Other");
			System.out.println("\nE=Mail Address:"+temail.getText());
			System.out.println("\nPassword:"+tpass.getText());
		}
	}
	public static void main(String []ar)
	{
		Student s=new Student();
	}
}
					