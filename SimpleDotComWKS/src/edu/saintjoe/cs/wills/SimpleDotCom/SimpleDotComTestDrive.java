package edu.saintjoe.cs.wills.SimpleDotCom;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		SimpleDotComWKS dot = new SimpleDotComWKS();
		int [] locations = {2,3,4};
		dot.setLocationCells(locations);
		String userGuess = "2";
		String result =
	dot.checkYourself(userGuess);
			
		
	}

}
