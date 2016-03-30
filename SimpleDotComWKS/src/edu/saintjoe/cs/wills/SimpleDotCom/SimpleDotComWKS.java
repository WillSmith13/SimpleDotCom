package edu.saintjoe.cs.wills.SimpleDotCom;

public class SimpleDotComWKS {

	int[] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

public String checkYourself(String stringGuess) {
	int guess = 
Integer.parseInt(stringGuess);
	String result = "miss";
	for (int cell : locationCells) {
		if (guess == cell) {
			result = "hit";
			numOfHits++;
			break;
		}
	} // out of the loop 
			
	if (numOfHits ==
			locationCells.length) {
		result = "kills";
	}
	System.out.println(result);
	return result;

} // Close method 

}// close class
	





