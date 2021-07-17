package polylab;

public class ActionProgrammer extends Programmer {
	private double wage;
	private double pieces;
	
	public ActionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year, double wage, double pieces) {
		super(firstName, lastName, socialSecurityNumber, month, year);
	
		this.wage = wage;
		this.pieces = pieces;
		
		
		
	}

	/**
	 * @return the wage
	 */
	public double getWage() {
		return wage;
	}

	/**
	 * @param wage the wage to set
	 */
	public void setWage(double wage) {
		this.wage = wage;
	}

	/**
	 * @return the pieces
	 */
	public double getPieces() {
		return pieces;
	}

	/**
	 * @param pieces the pieces to set
	 */
	public void setPieces(double pieces) {
		this.pieces = pieces;
	}

	@Override
	public double earnings() {
		
		return getWage() * getPieces();
		
	}
	@Override      
	public String toString() {
		return String.format("action programmer: "
				+ super.toString() 
				+ "\nper pieces wage: $%,.2f; pieces: $%,.2f"
				, getWage(), getPieces()); 
				
		} 
}
