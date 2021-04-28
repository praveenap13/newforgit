package newforgit;

public class PrintCode {

	void printNos(int n) {
		if (n > 0) {
			printNos(n - 1);
			System.out.print(n + " ");
			// create a stack LILO
		}
		// return;
	}

	/*
	 * static void printNos(int n) { if (n > 0) { printNos(n - 1);
	 * System.out.print(n + " "); // create a stack LILO } // return; }
	 */
	public static void main(String[] args) {
		PrintCode ob = new PrintCode();
		ob.printNos(100);

	}

}
