package m03Prep;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class EarthPanel extends JPanel
{
	int count = 0;
	ImageIcon earthIcon = new ImageIcon(EarthPanel.class.getResource("/changingImages/LightsImages/LightsOnBB.png"));

	
	public EarthPanel()
	{
		this.setOpaque(true);
		this.setBackground(Color.GRAY);
	}
	
	public void update()
	{
		count++; 
		repaint(); 
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g); 
		
		int size = 300 -(40*count);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(20 + (20*count), 20+(20*count), size, size);
		
		if(count>2)
			earthIcon.paintIcon(null,g,108, 108); 
		
	}

}
