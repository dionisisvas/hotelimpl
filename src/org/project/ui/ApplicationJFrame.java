package org.project.ui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.project.dao.Initializer;
import org.project.jpadao.JpaInitializer;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class ApplicationJFrame extends javax.swing.JFrame {
	private JLabel descriptionJL;
	private JButton roomsJB;
	private JButton reservationsJB;
	private JButton offersJB;
	private JButton customersJB;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		
		System.setProperty("daofactory", "org.project.jpadao.JpaDAOFactory");
		
		Initializer dataHelper = new JpaInitializer();
        dataHelper.prepareData();
        
		ApplicationJFrame inst = new ApplicationJFrame();
		inst.setLocationRelativeTo(null);
		inst.setVisible(true);
		
	}
	
	public ApplicationJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				descriptionJL = new JLabel();
				getContentPane().add(descriptionJL);
				descriptionJL.setText("Would you like to manage:");
				descriptionJL.setBounds(52, 12, 152, 18);
			}
			{
				roomsJB = new JButton();
				getContentPane().add(roomsJB);
				roomsJB.setText("Rooms");
				roomsJB.setBounds(52, 51, 87, 22);
				
				roomsJB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        roomsJBActionPerformed(evt);
                    }
                });
			}
			{
				customersJB = new JButton();
				getContentPane().add(customersJB);
				customersJB.setText("Customers");
				customersJB.setBounds(159, 51, 87, 22);
				
				customersJB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                    	customersJBActionPerformed(evt);
                    }
                });
			}
			{
				offersJB = new JButton();
				getContentPane().add(offersJB);
				offersJB.setText("Offers");
				offersJB.setBounds(52, 84, 87, 22);
				
				offersJB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                    	offersJBActionPerformed(evt);
                    }
                });
			}
			{
				reservationsJB = new JButton();
				getContentPane().add(reservationsJB);
				reservationsJB.setText("Reservations");
				reservationsJB.setBounds(159, 84, 87, 22);
				
				reservationsJB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                    	reservationsJBActionPerformed(evt);
                    }
                });
			}
			pack();
			this.setSize(354, 232);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	

	private void roomsJBActionPerformed(ActionEvent evt) {
		    SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	/*  RoomJFrame inst = new RoomJFrame();
                inst.setLocationRelativeTo(null);
                RoomPresenter presenter = new RoomPresenter(inst);
                presenter.start();
                //inst.setVisible(true);*/
            }
        }); 
    }
   
    
	private void customersJBActionPerformed(ActionEvent evt) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	CustomerJFrame inst = new CustomerJFrame();
                inst.setLocationRelativeTo(null);
                CustomerPresenter presenter = new CustomerPresenter(inst);
                presenter.start();
                //inst.setVisible(true);
            }
        });
    }
	
	private void reservationsJBActionPerformed(ActionEvent evt) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	ReservationJFrame inst = new ReservationJFrame();
                inst.setLocationRelativeTo(null);
                ReservationPresenter presenter = new ReservationPresenter(inst);
                presenter.start();
                //inst.setVisible(true);
            }
        });
    }
	
	private void offersJBActionPerformed(ActionEvent evt) {
		 	SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	/* OfferJFrame inst = new OfferJFrame();
                inst.setLocationRelativeTo(null);
                OfferPresenter presenter = new OfferPresenter(inst);
                presenter.start();
                //inst.setVisible(true);*/
            }
        });
    }
    

}
