import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class SpaceInvaders extends JFrame implements Commons {

	private JButton start, help;

	
	JFrame frame = new JFrame ("Space Invaders");
	JFrame frame2 = new JFrame ("Space Invaders");
	JFrame frame3 = new JFrame ("Help");
	
	
    public SpaceInvaders()
    {
      
    	String topmessage = "<html><br><br>Space Invaders BETA</html>";
    	String message = 
    				"<html>"+
    				"Help us Captain Awesome.. <br>"+	
    				"The alien scum is trying to take our female`s on our planet Xflode.<br><br><br> "+
    				"Your Mission:<br><br>"+
    				"Kill the aliens before they can get to Xflode and steal the female`s.<br>"+
    				"Try not to get killed in the prosess."+
    				"</html> ";
        
    	start = new JButton ("Start Mission");
        start.addActionListener (new ButtonListener());
        start.setBounds(800, 800, 200, 100);
        
        help = new JButton ("Help");
        help.addActionListener (new HelpButton());
       
        JLabel tekst = new JLabel(message, SwingConstants.CENTER); 
        JLabel toptekst = new JLabel(topmessage, SwingConstants.CENTER);
        
        Font font = new Font("Helvetica", Font.BOLD, 12);
        tekst.setFont(font);
        
        Font font2 = new Font("Helvetica", Font.BOLD, 20);
        toptekst.setFont(font2);
        
        frame2.setTitle("Space Invaders");
        
        frame2.add(tekst);
        
        frame2.add(toptekst, BorderLayout.PAGE_START);
        JPanel nedredel = new JPanel();
        nedredel.add(help);
        nedredel.add(start);
        
        frame2.add(nedredel, BorderLayout.PAGE_END);
        frame2.setSize(500, 500);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
        frame2.setResizable(false);
        
    }
    
    public void closeIntro(){
    	frame2.dispose();
    	frame3.dispose();
    }
    
    public void closeHelp(){
    	frame3.dispose();
    }
    
    public static void main(String[] args) {
        new SpaceInvaders();
    }
    
    private class ButtonListener implements ActionListener
    {
      
       public void actionPerformed (ActionEvent event)
       {
   

    	   
    	   frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    	   frame.setSize(BOARD_WIDTH, BOARD_HEIGTH);
    	   frame.getContentPane().add(new Board());
    	   frame.setResizable(false);
    	   frame.setLocationRelativeTo(null);
    	   frame.setVisible(true);
    	   closeIntro();
    	   
 
       }
    }
    
    private class CloseHelp implements ActionListener
    {
      
       public void actionPerformed (ActionEvent event)
       {
    	   closeHelp();
       }
    }
    
    private class HelpButton implements ActionListener
    {
      
       public void actionPerformed (ActionEvent event)
       {
   
    	   	JButton close = new JButton("Close");
    	   	close.addActionListener(new CloseHelp());
    	   
      		String topmessage = "<html><br>Help</html>";
      		String message = 
      			"<html>"+
      			"Controles:<br><br><br> "+
      			"Go Left - Left Arrowkey<br>"+
      			"Go Right - Right Arrowkey<br>"+
      			"Shot - Spacebar<br>"+
      			"</html> ";
      		JLabel tekst = new JLabel(message, SwingConstants.CENTER); 
      		JLabel toptekst = new JLabel(topmessage, SwingConstants.CENTER);
           
      		Font font = new Font("Helvetica", Font.BOLD, 12);
      		tekst.setFont(font);
           
      		Font font2 = new Font("Helvetica", Font.BOLD, 20);
      		toptekst.setFont(font2);
      		
      		frame3.add(tekst);
            
            frame3.add(toptekst, BorderLayout.PAGE_START);
      		
      		frame3.add(close, BorderLayout.PAGE_END);
      		frame3.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      		frame3.setSize(250, 290);
    	   	frame3.setResizable(false);
    	   	frame3.setLocationRelativeTo(null);
    	   	frame3.setVisible(true);
    	   
       }
    }
}