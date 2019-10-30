package Lab14.Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;  
public class AppletNew extends Applet{  
	
  
public void paint(Graphics g){ 
	setBackground(Color.LIGHT_GRAY);
	g.setColor(Color.BLUE);
	
g.drawString("Welcome My Website",100,100);  
g.setColor(Color.green);
g.drawString("Name -Sifat Hossain",150,150);
g.setColor(Color.WHITE);
g.drawString("University-City University",200,200);
g.setColor(Color.RED);
g.drawString("Subject-Cse",250,250);
g.setColor(Color.CYAN);
g.drawString("Id-153402342",300,300);


}

  
}  
