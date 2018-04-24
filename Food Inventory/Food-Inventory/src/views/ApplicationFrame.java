package views;

import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ApplicationFrame 
{

	private static JFrame frame;
	private static JPanel activePanel;
	private static Menu menuPanel = new Menu();
	private static Recipes recipesPanel = new Recipes();
	

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
					ApplicationFrame window = new ApplicationFrame();
					window.frame.setVisible(true);
				} 
				catch (Exception e){
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApplicationFrame()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(1,1));
		activePanel = menuPanel;
		frame.add(activePanel);
	}
	
    public static void setPanel(String newPanel)
	{
    	if(newPanel.equals("Menu"))
    	{
    		activePanel = menuPanel;
    		frame.setContentPane(activePanel);
    		frame.revalidate();
    	}
        else if(newPanel.equals("Recipes"))
    	{
    	   activePanel = recipesPanel;    	
     	   frame.setContentPane(activePanel);
           frame.revalidate();
    	}
    }

}
