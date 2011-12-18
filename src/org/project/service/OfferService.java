/**
 * 
 */
package org.project.service;

import java.sql.Date;

import org.project.dao.DAOFactory;
import org.project.dao.OfferDAO;
import org.project.domain.Offer;
import org.project.domain.RoomType;
import org.project.ui.OfferView;


public class OfferService {
	
	private OfferDAO offerDAO;
	private OfferView offerView;
	private Offer offer;
	
	public OfferView getOfferView() {
		// begin-user-code
		return offerView;
		// end-user-code
	}

	
	public void setOfferView(OfferView offerView) {
		// begin-user-code
		this.offerView = offerView;
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

	public void insertDates(OfferView view, Date startingDate, Date endingDate) {
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

	
	public void createOffer(OfferView view, Date startingDate, Date endingDate, RoomType roomType, double percentage) {
		// begin-user-code
		// TODO Auto-generated method stub
		Offer currentOffer = new Offer (startingDate, endingDate, roomType, percentage);
		/*if (offerExists(startingDate, endingDate) == false) {
			offerDAO.save(currentOffer);
			
			}else{ view.showWarning("Warning");
		}*/
		// end-user-code
	}

	
	//public boolean offerExists(RoomType roomType, Date startingDate, Date endingDate){
		//if(OfferDAO.findOffer(roomType, startingDate, endingDate)!=null){
			//ylopoihsh me for klp gia oles tis meres
		//}
		//tsekarei an yparxei prosfora sti sygkekrimeni hmerominia
		//prepei na ftiaxtei methodos sto dao
		//return false;
	//}
	
}

