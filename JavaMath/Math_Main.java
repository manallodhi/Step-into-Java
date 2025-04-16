package JavaMath;

public class Math_Main {

	public static void main(String[] args) {
 
	 // creating objects for Q#1 finding square root 	
		
		SquareRootFinder root = new SquareRootFinder();
        root.input();
        root.findSquareRoot();
      
     // creating objects for Q#2 Random num generator
        
        RandomNumberGenerator randnum = new RandomNumberGenerator();
        randnum.generate();
        
     // creating objects for Q#3 Calculate power
        
        PowerCalculator pow = new PowerCalculator();
        pow.input();
        pow.calculate();
        
    // creating object for finding absolute difference
        
        AbsoluteDifference diff = new AbsoluteDifference();
        diff.input();
        diff.findDifference();
        
   // creating object for finding max number
        
        MaxOfThree max = new MaxOfThree();
        max.input();
        max.findMax();
		
	}

}
