package homepractice;

public class GitClass {
	public static void main(String[] args) {
		int numOne =10;
		int numTwo=20;
		getResult(numOne, numTwo);// add
		int numThree = 20;
		int numFour = 30;
		getResult(numThree, numFour);
		
		// hello
		
		
	}
	public static void getResult(int numOne, int numTwo) {

		if (numOne > numTwo) {
			System.out.println(numOne - numTwo);// sub
		} else if (numOne < numTwo) {
			System.out.println(numOne + numTwo);// add
		} else {
			System.out.println(numOne * numTwo);// mul
		}

}
}
