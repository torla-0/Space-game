
package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.Timer;


public class GameThread{
    
    
    Color color;
    JLabel label;
    
    int x;
    Random random;
    
    int sleepTime = 250;
    

    public GameThread(JLabel label)        
    {
        this.label = label;
        this.color = label.getBackground();
    }

    
    Timer timer = new Timer(500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            
        random = new Random();
        
        x = random.nextInt(5);
        
        switch(x)
        {
            case 0:
            {
                color = Color.red;
                label.setBackground(color);
            
            break;
            }
            case 1:
            {
                color = Color.green;
                label.setBackground(color);
             
            break;
            }
            case 2:
            {
                color = Color.blue;
                label.setBackground(color);
            
            break;            
            }
            case 3:
            {
                color = Color.pink;
                label.setBackground(color);

            break;
            }

            case 4:
            {
                color = Color.cyan;
                label.setBackground(color);

            break;
            }
            default:
                break;
        }
            
        }
    });
   
    public void startTimer()
    {
        timer.start();
    }
    
    
    
    
}
