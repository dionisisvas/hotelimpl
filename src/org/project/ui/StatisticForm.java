/**
 * 
 */
package org.project.ui;

import org.project.service.StatisticService;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author katsivelhsp
 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
public class StatisticForm implements StatisticView {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private StatisticService statisticService;

	/** 
	 * @return the statisticService
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public StatisticService getStatisticService() {
		// begin-user-code
		return statisticService;
		// end-user-code
	}

	/** 
	 * @param statisticService the statisticService to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setStatisticService(StatisticService statisticService) {
		// begin-user-code
		this.statisticService = statisticService;
		// end-user-code
	}
}