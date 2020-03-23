import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class form extends JApplet implements ActionListener
{
 JLabel l[]=new JLabel[9];
 Panel ph,p,p1,p3,p4;
 TextField t,t1,t2,t4,t5;
 JLabel l10,l11;
 JTextArea ta;
 JRadioButton r,r1;
 ButtonGroup bg=new ButtonGroup();
 JComboBox c,c1,c2,c3,c4;
 JButton bl[]=new JButton[1];
 public void init()
 {
  JLabel srk=new JLabel("EMPLOYEE REGISTRATION FORM",JLabel.CENTER);
  setLayout(new BorderLayout());
  p=new Panel();
  p3=new Panel();
  ph=new Panel();
  p4=new Panel();
  p.setLayout(new GridBagLayout());
  add(p,BorderLayout.WEST);
  GridBagLayout gbag=new GridBagLayout();
  GridBagConstraints gbc=new GridBagConstraints();
  gbc.anchor=GridBagConstraints.CENTER;
  gbc.ipadx=10;
  ph.setLayout(gbag);
  l[0]=new JLabel("Name",JLabel.CENTER);
  l[1]=new JLabel("Address",JLabel.CENTER);
  l[2]=new JLabel("Qualification",JLabel.CENTER);
  l[3]=new JLabel("Phone Number",JLabel.CENTER);
  l[4]=new JLabel("Email ID",JLabel.CENTER);
  l[5]=new JLabel("Experience(y/m)",JLabel.CENTER);
  l[8]=new JLabel("Gender",JLabel.CENTER);
  l[6]=new JLabel("Platform",JLabel.CENTER);
  l[7]=new JLabel("Date Of Birth",JLabel.CENTER);
  for(int i=0;i<9;i++)
  {
  gbc.anchor=GridBagConstraints.EAST;
  gbc.weighty=0.2;
  gbc.gridx=0;
  gbc.gridy=i;
  p.add(l[i],gbc);
  }
  l10=new JLabel("Years");
  l11=new JLabel("months");
  JButton b=new JButton("SUBMIT");
  r=new JRadioButton("MALE");
  r1=new JRadioButton("FEMALE");
  c=new JComboBox();
  c1=new JComboBox();
  c2=new JComboBox();
  c3=new JComboBox();
  c4=new JComboBox();
  t=new TextField();
  t1=new TextField();
  t2=new TextField();
  t4=new TextField(5);
  t5=new TextField(5);
  ta=new JTextArea();
  t.setText("");
  t1.setText("");
  t2.setText("");
  t4.setText("");
  t5.setText("");
  ta.setText("");
  ButtonGroup bg=new ButtonGroup();
  bg.add(r);
  bg.add(r1);
  p1=new Panel();
  p1.add(r);
  p1.add(r1);
  c.addItem("Select one");
  c.addItem("M.Tech");
  c.addItem("B.Tech");
  c.addItem("Phd");
  c.addItem("PG");
  c.addItem("M.Phill");
  c.addItem("M.S");
  c1.addItem("Select One");
  c2.addItem("Month");
  c3.addItem("Date");
  c4.addItem("Year");
  c1.addItem("JAVA");
  c1.addItem("ORACLE");
  c1.addItem("LINUX");
  c1.addItem("PHYTHON");
  c1.addItem("FORTAN");
  c2.addItem("JAN");
  c2.addItem("FEB");
  c2.addItem("MAR");
  c2.addItem("APR");
  c2.addItem("MAY");
  c2.addItem("JUN");
  c2.addItem("JUL");
  c2.addItem("AUG");
  c2.addItem("SEP");
  c2.addItem("OCT");
  c2.addItem("NOV");
  c2.addItem("DEC");
  for(int j=1;j<32;j++)
   c3.addItem(""+j);
  for(int k=1980;k<1996;k++)
   c4.addItem(""+k);
  p3.add(c2);
  p3.add(c3);
  p3.add(c4);
  gbc.anchor=GridBagConstraints.WEST;
  gbc.weighty=9.0;
  gbc.gridx=0;
  gbc.gridy=0;
  gbc.ipadx=90;
  gbc.ipady=8;
  ph.add(t,gbc);
  gbc.anchor=GridBagConstraints.WEST;
  gbc.gridx=0;
  gbc.gridy=1;
  gbc.weighty=5.0;
  gbc.gridheight=1;
  ph.add(ta,gbc);
  gbc.anchor=GridBagConstraints.WEST; 
  gbc.gridx=0;
  gbc.weighty=5.0;
  gbc.gridy=2;
  ph.add(c,gbc);
  gbc.anchor=GridBagConstraints.WEST;
  gbc.gridx=0;
  gbc.gridy=3;
  gbc.weighty=5.0;
  ph.add(t1,gbc);
  gbc.anchor=GridBagConstraints.WEST;
  gbc.gridx=0;
  gbc.weighty=5.0;
  gbc.gridy=4;
  ph.add(t2,gbc);
  gbc.anchor=GridBagConstraints.WEST;
  gbc.fill=GridBagConstraints.HORIZONTAL;
  gbc.gridx=0;
  gbc.weighty=5.0;
  gbc.gridy=5;
  gbc.ipadx=40;
  gbc.ipady=5;
  ph.add(t4,gbc);
  gbc.anchor=GridBagConstraints.WEST;
  gbc.fill=GridBagConstraints.HORIZONTAL;
  gbc.gridx=1;
  gbc.weighty=5.0;
  gbc.gridy=5;
  ph.add(l10,gbc);
  gbc.anchor=GridBagConstraints.WEST;
  gbc.fill=GridBagConstraints.HORIZONTAL;
  gbc.gridx=2;
  gbc.weighty=5.0;
  gbc.gridy=5;
  ph.add(t5,gbc);
  gbc.anchor=GridBagConstraints.WEST;
  gbc.fill=GridBagConstraints.HORIZONTAL;
  gbc.gridx=3;
  gbc.weighty=5.0;
  gbc.gridy=5;
  ph.add(l11,gbc);
  gbc.anchor=GridBagConstraints.WEST;
  gbc.gridx=0;
  gbc.weighty=5.0;
  gbc.gridy=6;
  ph.add(c1,gbc);
  gbc.anchor=GridBagConstraints.WEST;
  gbc.gridx=0;
  gbc.weighty=5.0;
  gbc.gridy=7;
  ph.add(p3,gbc);
  gbc.anchor=GridBagConstraints.WEST;
  gbc.gridx=0;  gbc.weighty=5.0;
  gbc.gridy=8;
  ph.add(p1,gbc);
  add(ph,BorderLayout.CENTER);
  bl[0]=(JButton) b;
  add(b,BorderLayout.SOUTH);
  add(srk,BorderLayout.NORTH);
  bl[0].addActionListener(this);
  r.addActionListener(this);
  r1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
  Frame frame=new Frame();
  String s=new String();
  String s1=new String();
  String s2=new String();
  String s3=new String();
  String s4=new String();
  String s5=new String();
  String s6=new String();
  String s7=new String();
  s3+=t4.getText();
  s4+=t5.getText();
  int aa=0,y=0;
  if(r.isSelected() || r1.isSelected())
    y=1;
  if(ae.getSource()==bl[0])
  {
   if(s.equalsIgnoreCase(t.getText()))
   {
   aa=1;}
   else
   if(s5.equalsIgnoreCase(ta.getText()))
   {
   aa=1;}
   else
   if(s1.equalsIgnoreCase(t1.getText()))
   {
   aa=1;}
   else
   if(s2.equalsIgnoreCase(t2.getText()))
   {
   aa=1;
   }
   else
   if(s3.equalsIgnoreCase("") || s4.equalsIgnoreCase(""))
   {
   aa=1;
   }
   else
   if(c.getSelectedIndex()==0)
   {
     aa=1;
   }
   else
   if(c1.getSelectedIndex()==0)
   {
   aa=1;
   }
   else
 if(c2.getSelectedIndex()==0 || c3.getSelectedIndex()==0 || c4.getSelectedIndex()==0)
   {
    aa=1;
   }
   else
   if(y==0)
   {
 aa=1;
   }
if(aa==0)
      JOptionPane.showMessageDialog(frame,"THANK YOU FOR APPLYING");
else
  JOptionPane.showMessageDialog(frame,"PLEASE FILL ALL THE DETAILS");
  }   
  }
}
/*<applet code="form.class" width=500 height=1000></applet>*/