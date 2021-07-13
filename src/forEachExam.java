
public class forEachExam {
	public static void main(String[] args) {
		int[] iarr = new int[] {10, 20, 30, 40, 50};
		// a int type array named iarr with values 10, 20, 30, 40, 50 is declared
		for(int i = 0; i < iarr.length; i ++) {
		// in this for statement, an int variable i is declared as zero. Under the condition i is smaller than the length of 
		// array iarr (5), the loop will continue. Each time the loop runs, i increases by 1
			int value = iarr[i];
		// in the int variable value, the value of iarr[i] is placed.
			System.out.println(value);
		}
		for(int value:iarr) {
		// in for each statements, in the space after the for statement, before the colon is the data type that will be placed in
		// the variable next. After the colon is where the data will come from (iarr).
			System.out.println(value);
		}
	// for statements uses indices to take values and insert them in variables. For each statements does that automatically
	// for each statements are much more concise and also places values from the data (array) in variables automatically
	// also, for statements requires the length of the array to be known, while for each statements do not
	}
}
