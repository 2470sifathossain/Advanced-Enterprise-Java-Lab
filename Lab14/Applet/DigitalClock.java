package Lab14.Applet;

import java.applet.*;  
import java.awt.*;  
import java.util.*;  
import java.text.*;  
import java.awt.font.*;
  
public class DigitalClock extends Applet implements Runnable {  
	
  
   Thread t = null;  
   int hours=0, minutes=0, seconds=0;  
   String timeString = "";  
  
   public void init() {  
      setBackground( Color.black);  
   }  
  
   public void start() {  
        t = new Thread( this );  
        t.start();  
   }  
  
    
   public void run() {  
      try {  
         while (true) {  
  
            Calendar cal = Calendar.getInstance();  
           
            hours = cal.get( Calendar.HOUR_OF_DAY );  
            if ( hours > 12 ) hours -= 12;  
            
            minutes = cal.get( Calendar.MINUTE ); 
            
            seconds = cal.get( Calendar.SECOND );  
  
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
            Date date = cal.getTime();  
            timeString = formatter.format( date );  
            
  
            repaint();  
            t.sleep( 1000 );  // interval given in milliseconds  
         }  
      }  
      catch (Exception e) { }  
   }  
  
    
  public void paint( Graphics g ) {
	  g.setColor(Color.WHITE);
	  g.drawString("DIGITAL CLOCK",60,60); 
	  
	  g.setColor(Color.WHITE);
	  g.drawString("Hours:Mintues:Second",80,80);  
	  
	  g.setColor(Color.white);  
      g.drawString( timeString, 100, 100 );  
   }  
}  