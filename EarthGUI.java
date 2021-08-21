package m03Prep;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.ComponentOrientation;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class EarthGUI extends JFrame
{

	private JPanel contentPane;
	private EarthPanel earthPanel;
	private JLabel lblTitle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					EarthGUI frame = new EarthGUI();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EarthGUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 450); // set this because this is how it opens.
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		lblTitle = createTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);

		JPanel panel = createCnrlPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		earthPanel = new EarthPanel();
		contentPane.add(earthPanel, BorderLayout.CENTER);
	}

	private JLabel createTitle()
	{
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBorder(new EmptyBorder(10, 0, 10, 0));
		lblTitle.setOpaque(true);
		lblTitle.setBackground(new Color(204, 204, 204)); /// COLOR
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		return lblTitle;
	}

	private JPanel createCnrlPanel()
	{
		JPanel ControlPanel = new JPanel();
		ControlPanel.setLayout(new GridLayout(0, 4, 0, 0));

		JCheckBox chckbxBlue = new JCheckBox("Blue");
		ControlPanel.add(chckbxBlue);

		JCheckBox chckBold = new JCheckBox("Bold");
		ControlPanel.add(chckBold);

		JCheckBox chckbxEarth = new JCheckBox("Earth");
		ControlPanel.add(chckbxEarth);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				earthPanel.update(); 
				updateTitle();
			}

			private void updateTitle()
			{
				lblTitle.setText("x"); 
				if(chckbxBlue.isSelected())
				{
					lblTitle.setForeground(Color.BLUE);
				}
					
				
			}
		});
		ControlPanel.add(btnNewButton);

		JLabel label = new JLabel("");
		ControlPanel.add(label);

		JLabel label_1 = new JLabel("");
		ControlPanel.add(label_1);
		return ControlPanel;
	}

}
