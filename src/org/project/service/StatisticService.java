/**
 * 
 */
package org.project.service;

import org.project.ui.StatisticView;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 * 
 */
public class StatisticService {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private StatisticView statisticView;

	/** 
	 * @return the statisticView
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public StatisticView getStatisticView() {
		// begin-user-code
		return statisticView;
		// end-user-code
	}

	/** 
	 * @param statisticView the statisticView to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setStatisticView(StatisticView statisticView) {
		// begin-user-code
		this.statisticView = statisticView;
		// end-user-code
	}
}