import java.awt.*;//Button,Color,Font,Frame,GridLayout,Panel,TextField
import java.awt.event.*;//ActionEvent,WindowEvent,ActionListener,WindowListener

class Calculator2 extends Frame implements ActionListener{
	static Frame f;
	static TextField l;
	String s0,s1,s2;
	
	Calculator2()
	{
		s0=s1=s2="";
	}
	public static void main(String args[])
	{
		f=new Frame("My Calculator");
		f.setLayout(null);
		Calculator2 a=new Calculator2();
		l=new TextField(15);
		l.setEditable(false);
		l.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,be,beq,beq1;
		
		b0=new Button("0");
		b0.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		b1=new Button("1");
		b1.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		b2=new Button("2");
		b2.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		b3=new Button("3");
		b3.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		b4=new Button("4");
		b4.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		b5=new Button("5");
		b5.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		b6=new Button("6");
		b6.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		b7=new Button("7");
		b7.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		b8=new Button("8");
		b8.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		b9=new Button("9");
		b9.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		ba=new Button("+");
		ba.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		bs=new Button("-");
		bs.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		bm=new Button("*");
		bm.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		bd=new Button("/");
		bd.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		be=new Button("%");
		be.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		beq=new Button("C");
		beq.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		beq1=new Button("=");
		beq1.setFont(new Font(Font.MONOSPACED,Font.BOLD,20));
		
		Panel p=new Panel();
		p.setBounds(25,25,300,40);
		
		Panel p1=new Panel();
		p1.setBounds(25,68,300,300);
		p1.setBackground(Color.ORANGE);
		
		b0.addActionListener(a);
		b1.addActionListener(a);
		b2.addActionListener(a);
		b3.addActionListener(a);
		b4.addActionListener(a);
		b5.addActionListener(a);
		b6.addActionListener(a);
		b7.addActionListener(a);
		b8.addActionListener(a);
		b9.addActionListener(a);
		ba.addActionListener(a);
		bs.addActionListener(a);
		bm.addActionListener(a);
		bd.addActionListener(a);
		be.addActionListener(a);
		beq.addActionListener(a);
		beq1.addActionListener(a);
		
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		}
		);
		p.add(l);
		p1.add(b0);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		p1.add(ba);
		p1.add(bs);
		p1.add(bm);
		p1.add(bd);
		p1.add(be);
		p1.add(beq);
		p1.add(beq1);
		p.setBackground(Color.blue);
		p1.setLayout(new GridLayout(4,5,5,5));
		f.add(p);
		f.add(p1);
		f.setSize(350,380);
		f.setVisible(true);// makes the frame appear on the screen
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
		if((s.charAt(0)>='0'&& s.charAt(0)<='9'||s.charAt(0)=='.'))
		{
			if(!s1.equals(""))
					s2=s2+s;
			else
				s0=s0+s;
			l.setText(s0+s1+s2);
		}
		else if(s.charAt(0)=='C')
		{
			s0=s1=s2="";
			l.setText(s0+s1+s2);
			
		}
		else if(s.charAt(0)=='=')
		{
			double te;
			if(s1.equals("+"))
				te=(Double.parseDouble(s0)+Double.parseDouble(s2));
			else if(s1.equals("-"))
				te=(Double.parseDouble(s0)-Double.parseDouble(s2));
			else if(s1.equals("*"))
				te=(Double.parseDouble(s0)*Double.parseDouble(s2));
			else if(s1.equals("/"))
				te=(Double.parseDouble(s0)/Double.parseDouble(s2));
			else
				te=(Double.parseDouble(s0)%Double.parseDouble(s2));
			l.setText(Double.toString(te));
			s0=Double.toString(te);
			s1=s2="";
			
		}
		else
		{
			if(s1.equals("")||s2.equals(""))
				s1=s;
			else
			{
				
			double te;
			if(s1.equals("+"))
				te=(Double.parseDouble(s0)+Double.parseDouble(s2));
			else if(s1.equals("-"))
				te=(Double.parseDouble(s0)-Double.parseDouble(s2));
			else if(s1.equals("*"))
				te=(Double.parseDouble(s0)*Double.parseDouble(s2));
			else if(s1.equals("/"))
				te=(Double.parseDouble(s0)/Double.parseDouble(s2));
			else
				te=(Double.parseDouble(s0)%Double.parseDouble(s2));
			
			s0=Double.toString(te);
			s1=s;
			s2="";
		}
		
		}
		
	}

}
