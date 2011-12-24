package org.project.ui;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

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
public class ReservationJFrame extends javax.swing.JFrame implements ReservationView, ListSelectionListener {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private JTable table;
	//private JList list;
	private JTextArea output;
	private JButton newReservation;
	private JButton deleteReservation;
	private JButton updateReservation;
	
	private Integer[][] reservationIDs;
	private ListSelectionModel listSelectionModel;
	
	private ReservationAdminPresenter presenter;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
			}
		});
	}
	
	public ReservationJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			GridBagLayout thisLayout = new GridBagLayout();
			thisLayout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.1};
			thisLayout.rowHeights = new int[] {7, 7, 7, 7};
			thisLayout.columnWeights = new double[] {0.0, 0.0, 0.0, 0.1};
			thisLayout.columnWidths = new int[] {266, 280, 149, 7};
			getContentPane().setLayout(thisLayout);
			this.setPreferredSize(new java.awt.Dimension(768, 340));
			this.setTitle("Reservations");
			{
				//String[][] tableData = { {"One","Two","Three","Four","Five","Six" }, { "One","Two","Three","Four","Five","Six"  } };
				//String[] columnNames = { "ReservationID", "Starting Date","Ending Date", "Paid","Customer Last Name", "Customer First Name"  };
				
				//TableModel tableColumns;
				//tableColumns = new DefaultTableModel(tableData,columnNames);
				table = new JTable();
				table.addComponentListener(null);
				//presenter.showReservations();
				for(int rows = 0; rows<reservationIDs[rows].length; rows++){
					for(int columns = 0; columns < reservationIDs[columns].length; columns++)
					table.setValueAt(reservationIDs[rows][columns], rows, columns);
				}
				
				listSelectionModel = table.getSelectionModel();
		        listSelectionModel.addListSelectionListener(new SharedListSelectionHandler());
		        table.setSelectionModel(listSelectionModel);
		        JScrollPane tablePane = new JScrollPane(table);
		        
		        tablePane.setLayout(new BorderLayout());
		        tablePane.add(table, BorderLayout.CENTER);
		        tablePane.add(table.getTableHeader(), BorderLayout.NORTH);
		        
				getContentPane().add(table, new GridBagConstraints(0, 0, 4, 2, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
				table.setPreferredSize(new java.awt.Dimension(889, 150));
			}
			{
				newReservation = new JButton();
				getContentPane().add(newReservation, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				newReservation.setText("New");
			}
			{
				updateReservation = new JButton();
				getContentPane().add(updateReservation, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				updateReservation.setText("Update");
			}
			{
				deleteReservation = new JButton();
				getContentPane().add(deleteReservation, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				deleteReservation.setText("Delete");
			}
			pack();
			this.setSize(768, 340);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	public void refresh() {
		// begin-user-code

		// end-user-code
	}

	@Override
	public void open() {
		setVisible(true);
	}

	@Override
	public void close() {
		dispose();
	}

	@Override
	public void setReservation(Integer reservationID, int row,int column) {
		reservationIDs[row][column] = reservationID;
		//listModel.add(index, reservationID);
	}

	@Override
	public Integer[][] getCode() {
		return reservationIDs;//listModel.getElementAt(index).toString();
	}

	@Override
	public void setStartDate(Calendar startDate, int rows,int columns) {
		//for(int i = 0; i<presenter.reservationsListSize(); i++)
			//listModel.add(index,startDate);
	}
	public String getStartDate(){
		return null;//list.getModel().toString();
	}

	@Override
	public void setEndDate(Calendar endDate, int rows,int columns) {
		//for(int i = 0; i<presenter.reservationsListSize(); i++)
			//listModel.add(index,endDate);
	}
	
	public String getEndDate(){
		return null;//list.getModel().toString();
	}

	@Override
	public void setPaid(boolean b, int rows,int columns) {
		//for(int i = 0; i<presenter.reservationsListSize(); i++)
			//listModel.add(index,b);
	}
	
	public String getPaid() {
		return null;//list.getModel().toString();
	}
	
	@Override
	public void setCusAddress(String address) {
		
	}

	@Override
	public void setCusFirstName(String firstName, int rows,int columns) {
		//for(int i = 0; i<presenter.reservationsListSize(); i++)
			//listModel.add(index,firstName);
	}

	@Override
	public void setCusLastName(String lastName, int rows,int columns) {
		//for(int i = 0; i<presenter.reservationsListSize(); i++)
			//listModel.add(index,lastName);
		
	}

	@Override
	public void setCusEmail(String mail) {
		
	}

	@Override
	public void setCusPhoneNumber(String phoneNumber) {

	}
	
	@Override
	public String getCusAddress() {
		return null;//list.getModel().toString();		
	}

	@Override
	public String getCusFirstName() {
		return null;//list.getModel().toString();
		
	}

	@Override
	public String getCusLastName() {
		return null;//list.getModel().toString();
	}

	@Override
	public String getCusEmail() {
		return null;//list.getModel().toString();
	}

	@Override
	public String getCusPhoneNumber() {
		return null;//list.getModel().toString();		
	}

	
	
	
	
	
	
	
	public void setTotalPrice(Double totalPrice) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void showWarning(String msg) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}


	@Override
	public void showError(String message) {
	}

	@Override
	public void showInfo(String message) {	
	}
	
	@Override
	public void setReservatonActionEnabled(boolean enabled) {		
	}

	@Override
	public void setRoomNumber(Integer roomNum) {		
	}	
	
	@Override
	public String getCustomerCode() {
		return null;
	}

	@Override
	public void setReservationDeleted(boolean reservationFound) {		
	}

	@Override
	public void setAdminPresenter(ReservationAdminPresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public void Initialize(ActionEvent evt) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getReservationCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPresenter(ReservationPresenter reservationPresenter) {
		// TODO Auto-generated method stub
		
	}
	
	class SharedListSelectionHandler implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) { 
            ListSelectionModel lsm = (ListSelectionModel)e.getSource();

            int firstIndex = e.getFirstIndex();
            int lastIndex = e.getLastIndex();
            boolean isAdjusting = e.getValueIsAdjusting(); 
            output.append("Event for indexes "
                          + firstIndex + " - " + lastIndex
                          + "; isAdjusting is " + isAdjusting
                          + "; selected indexes:");

            if (lsm.isSelectionEmpty()) {
                output.append(" <none>");
            } else {
                // Find out which indexes are selected.
                int minIndex = lsm.getMinSelectionIndex();
                int maxIndex = lsm.getMaxSelectionIndex();
                for (int i = minIndex; i <= maxIndex; i++) {
                    if (lsm.isSelectedIndex(i)) {
                        output.append(" " + i);
                    }
                }
            }
            output.append("\n");
            output.setCaretPosition(output.getDocument().getLength());
        }
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
