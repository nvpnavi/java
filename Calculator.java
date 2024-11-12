import java.awt.event.*;
import javax.swing.*;
class Calculator extends JFrame implements ActionListener
{ private JLabel l1,l2,l3,l4;
  private JTextField t1,t2;
  private JButton b1,b2,b3,b4;
  { setSize(640,480);
    setLayout(null);
	l1=new JLabel("1st Number");
	l1.setBounds(50,50,200,50);
	add(l1);
	l2=new JLabel("2nd Number");
	l2.setBounds(50,150,200,50);
	add(l2);
	t1=new JTextField();
	t1.setBounds(300,50,200,50);
	add(t1);
	t2=new JTextField();
	t2.setBounds(300,150,200,50);
	add(t2);
	l3=new JLabel("Answer");
	l3.setBounds(50,350,200,50);
	add(l3);
	l4=new JLabel("");
	l4.setBounds(300,350,200,50);
	add(l4);
	b1=new JButton("+");
	b1.setBounds(50,250,100,50);
	add(b1);
	b2=new JButton("-");
	b2.setBounds(200,250,100,50);
	add(b2);
	b3=new JButton("*");
	b3.setBounds(350,250,100,50);
	add(b3);
	b4=new JButton("/");
	b4.setBounds(500,250,100,50);
	add(b4);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  { Integer a=Integer.parseInt(t1.getText());
    Integer b=Integer.parseInt(t2.getText());
	Integer ans;
	if(e.getSource()==b1)
    {  ans=a+b;
    }
	else if(e.getSource()==b2)
	{  ans=a-b;
    }
	else if(e.getSource()==b3)
	{  ans=a*b;
    }
	else 
	{  ans=a/b;
    }
	l4.setText(ans.toString());
  }
  public static void main(String args[])
  { Calculator c=new Calculator();
    c.setVisible(true);
  }
}