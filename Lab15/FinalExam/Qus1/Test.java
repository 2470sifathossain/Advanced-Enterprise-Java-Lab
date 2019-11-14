package Lab15.FinalExam.Qus1;

/* Md Sifat Hossain 153402342*/
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame implements ActionListener {

    JTextField ID, NAME;
    JLabel l, l1, l2;
    JRadioButton r1,r2; 
    JButton JB;
    JTable jTable;
    DefaultTableModel model ;

    Test() {        
    	 jTable = new JTable();
         jTable.setBounds(50, 200, 500, 150);
         
        
        l = new JLabel("ID: ");
        l.setBounds(30, 50, 50, 20);
        
        NAME = new JTextField();
        NAME.setBounds(80, 50, 150, 20);
        
        l1 = new JLabel("NAME: ");
        l1.setBounds(250, 50, 50, 20);
        
        ID = new JTextField();
        ID.setBounds(300, 50, 100, 20);
        
       
        
        l2 = new JLabel("GENDER: ");
        l2.setBounds(450, 50, 55, 20);
        
        r1=new JRadioButton("MALE");    
        r1.setBounds(510,50,70,30);      
        r2=new JRadioButton("FEMALE");    
        r2.setBounds(600,50,70,30); 
        
        String data[][] = {{}};
        model = new DefaultTableModel();
        jTable.setModel(model);
      
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("GENDER");
        model.addRow(new Object[]{"ID","NAME",  "GENDER"});
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);
        bg.add(r2);  
        
        JB = new JButton("SUBMIT");
        JB.setBounds(600, 100, 95, 30);
        JB.addActionListener(this);
        
        add(JB);
        add(ID);
        add(l);
        add(l1);
        add(l2);
        add(NAME);
        add(r1);
        add(r2);
        add(jTable);
        setSize(700, 600);       
        setLayout(null);        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String gend;
        if(r1.isSelected()){
            gend = "MALE";
        }else {
            gend = "FEMALE";
        }
        model.addRow(new Object[]{NAME.getText(), ID.getText(),gend});
            
    }

    public static void main(String[] args) {
        new Test();
    }

}

