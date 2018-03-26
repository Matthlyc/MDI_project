package Autres;
/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/

import Interface.Selection;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of SelectionImpl.
 * 
 * @author gwenl
 */
public class SelectionImpl implements Selection {
	/**
	 * Description of the property debut.
	 */
	public int debut = 0;
	
	/**
	 * Description of the property fin.
	 */
	public int fin=0;
	
	// Start of user code (user defined attributes for SelectionImpl)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public SelectionImpl() {
		// Start of user code constructor for SelectionImpl)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for SelectionImpl)
	
	// End of user code
	/**
	 * Returns debut.
	 * @return 
	 * @return debut 
	 */
	public  int getDebut() {
		return this.debut;
	}
	
	/**
	 * Sets a value to attribute debut. 
	 * @param newDebut 
	 */
	public void setDebut(int newDebut) {
		this.debut=newDebut;
	}

	/**
	 * Returns fin.
	 * @return fin 
	 */
	public int getFin() {
		return this.fin;
	}
	
	/**
	 * Sets a value to attribute fin. 
	 * @param newFin 
	 */
	public void setFin(int newFin) {
		this.fin=newFin;
	}



}
