package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import static main.GameWindow.scorInteger;
import static main.GameWindow.projectiles;
import static main.GameWindow.timer;
import static main.LoseWindow.finalScoreLabel;
import static main.StartWindow.nickName;

public class GamePaint{
    
    Color color;
    
    int xLoc;
    int yLoc;
    int xSize;
    int ySize;
    
    JLabel label;

    JPanel panel;

    static boolean switcher = true;
    
    int sleepTime = 50;
    
    ArrayList<JLabel> list = new ArrayList();

    public GamePaint(JLabel label, JPanel panel) 
    {
        this.panel = panel;
        this.label = label;
        this.color = label.getBackground();
        xLoc = label.getLocation().x;
        yLoc = label.getLocation().y;
        xSize = label.getSize().width;
        ySize = label.getSize().height;
        list.add(label);

    }
    public GamePaint()
    {
        
    }



    
    Timer shootTimer = new Timer(sleepTime, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(switcher)
            {
                label.setLocation(xLoc, yLoc);
                yLoc += 5;
                label.repaint();
                
                if(scorInteger > 250)
                {
                    sleepTime = 45;
                }else if(scorInteger > 500)
                {
                    sleepTime = 40;
                }else if(scorInteger > 650)
                {
                    sleepTime = 35;
                }else if(scorInteger > 800)
                {
                    sleepTime = 30;
                }else if(scorInteger > 900)
                {
                    sleepTime = 25;
                }else if(scorInteger > 1000)
                {
                    sleepTime = 20;
                }
                
                
                
                if(label.getLocation().y == 570)  
                {
                    try{
                        if(label.getLocationOnScreen().x >= GameWindow.playerLabel.getLocationOnScreen().x  && label.getLocationOnScreen().x <= GameWindow.playerLabel.getLocationOnScreen().x+60)
                        {
                         scorInteger += 5;
                         GameWindow.scorLabel.setText("Scor: " + scorInteger);    
                         panel.remove(label);
                        }else
                        {
                            switcher = false;
                            LoseWindow win = new LoseWindow();
                            finalScoreLabel.setText(nickName + ": " + scorInteger);
                            scorInteger = 0;
                            GameWindow.elapsed = 0;
                            nickName = "";
                            win.setVisible(true);
                            win.setLocationRelativeTo(null);
                            list.clear();
                            timer.stop();
                            projectiles.stop();
                            stopTimer();
                    }
                    }catch(Exception exc)
                    {
                       
                    }
                }
            }

        }
    });
    
    public void startTimer()
    {
        shootTimer.start();
    }
    
    public void stopTimer()
    {
        shootTimer.stop();
    }
    
}
