package org.project.ui;

import java.util.Calendar;

import org.project.dao.DAOFactory;
import org.project.dao.OfferDAO;
import org.project.domain.Offer;
import org.project.domain.RoomType;

public class OfferPresenter {
	
	private OfferDAO offerDAO;
	private OfferView view;
	private Offer offer;
	
	public OfferPresenter (OfferView view) {
		// begin-user-code
		this.view = view;
		// end-user-code
	}


	public Offer getOffer() {
		// begin-user-code
		return offer;
		// end-user-code
	}

	public void setOffer(Offer offer) {
		// begin-user-code
		this.offer = offer;
		// end-user-code
	}

	
	public void initialize(OfferView view) {
		// begin-user-code
		// TODO Auto-generated method stub
		DAOFactory factory = DAOFactory.getInstance();
		offerDAO = factory.getOfferDAO();	
		// end-user-code
	}

	public void insertDates(OfferView view, Calendar startingDate, Calendar endingDate) {
		// begin-user-code
		// TODO Auto-generated method stub
		view.setStartingDate(startingDate);
		view.setEndingDate(endingDate);
		view.refresh();
		// end-user-code
	}

	public void insertRoomType(OfferView view, RoomType roomType) {
		// begin-user-code
		// TODO Auto-generated method stub
		view.setRoomType(roomType);
		view.refresh();
		// end-user-code
	}

	
	public void insertPercentage(OfferView view, double percentage) {
		// begin-user-code
		// TODO Auto-generated method stub
		view.setPercentage(percentage);
		view.refresh();
		// end-user-code
	}

	
	public void createOffer(OfferView view, Calendar startingDate, Calendar endingDate, RoomType roomType, double percentage) {
		// begin-user-code
		// TODO Auto-generated method stub
		/*******Offer currentOffer = new Offer (startingDate, endingDate, roomType, percentage);
		
		if (offerExists(startingDate, endingDate, roomType) == false) {
			offerDAO.save(currentOffer);
			
			}else{ view.showWarning("Warning");
		}
		// end-user-code
		 *******/
	}

	/*Method that checks if an offer exists for the same type of rooms for the selected dates or
	 *for days between the selected ones.
	 * The method searches the offer table at the database and checks if there is an another offer for the same room type
	 * starting the same day or any day between the selected range of days.
	 */
	public boolean offerExists(Calendar startingDate, Calendar endingDate, RoomType roomType){
		if(offerDAO.findOfferByStartingDate(roomType, startingDate)!=null){
			return true;
		}else{
			while (startingDate.equals(endingDate)!=true){
				startingDate.add(Calendar.DATE, 1);
				if (offerDAO.findOfferByStartingDate(roomType, startingDate)!=null){
					return true;
				}
			}
		return false;
		}
	}

}
