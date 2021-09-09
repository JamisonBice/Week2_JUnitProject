package model;

/**
 * @author Jamison Bice - jdbice
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
public class Pool {
	private int numOfPeople;
	private int numOfLifeGuards;
	//Based off the guidelines of 1 life guard to 25 patrons
	private final double RATIO_OF_PEOPLE_TO_GUARDS = 0.04;
	private int maxNumOfPeople;
	private double entranceFee;
	
	/**
	 * 
	 */
	public Pool() {
	}

	/**
	 * @param numOfPeople
	 * @param numOfLifeGuards
	 * @param RATIO_OF_PEOPLE_TO_GUARDS
	 * @param entranceFee
	 */
	public Pool(int numOfPeople,int maxNumOfPeople, int numOfLifeGuards, double entranceFee) {
		this.numOfPeople = numOfPeople;
		this.numOfLifeGuards = numOfLifeGuards;
		this.entranceFee = entranceFee;
		this.maxNumOfPeople = maxNumOfPeople;
	}
	
	/**
	 * @return the numOfPeople
	 */
	public int getNumOfPeople() {
		return numOfPeople;
	}
	
	/**
	 * @param numOfPeople the numOfPeople to set
	 */
	public void setNumOfPeople(int numOfPeople) {
		this.numOfPeople = numOfPeople;
	}
	
	/**
	 * @return the numOfLifeGuards
	 */
	public int getNumOfLifeGuards() {
		return numOfLifeGuards;
	}
	
	/**
	 * @param numOfLifeGuards the numOfLifeGuards to set
	 */
	public void setNumOfLifeGuards(int numOfLifeGuards) {
		this.numOfLifeGuards = numOfLifeGuards;
	}
	
	/**
	 * @return the RATIO_OF_PEOPLE_TO_GUARDS
	 */
	public double getRATIO_OF_PEOPLE_TO_GUARDS() {
		return RATIO_OF_PEOPLE_TO_GUARDS;
	}
	
	/**
	 * @return the entranceFee
	 */
	public double getEntranceFee() {
		return entranceFee;
	}
	
	/**
	 * @param entranceFee the entranceFee to set
	 */
	public void setEntranceFee(double entranceFee) {
		this.entranceFee = entranceFee;
	}

	/**
	 * @return the maxNumOfPeople
	 */
	public int getMaxNumOfPeople() {
		return maxNumOfPeople;
	}

	/**
	 * @param maxNumOfPeople the maxNumOfPeople to set
	 */
	public void setMaxNumOfPeople(int maxNumOfPeople) {
		this.maxNumOfPeople = maxNumOfPeople;
	}

	/**
	 * @return
	 */
	public double calculateRevenue() {
		double revenue = numOfPeople * entranceFee;
		return revenue;
	}

	/**
	 * @return
	 */
	public boolean correctAmtOfLGuards() {
		 int amountNeeded =(int) (numOfPeople * RATIO_OF_PEOPLE_TO_GUARDS);
		 
		 if (amountNeeded > numOfLifeGuards ) {
			 return false;
		 } else {
			 return true;
		 }
		
	}

	/**
	 * @return
	 */
	//For when the pool is over capacity
	public boolean closeEntering() {
		
		if (numOfPeople >= maxNumOfPeople) {
			return true;
		} else {
			return false;
		}
	}
	

}
