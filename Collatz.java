// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];

		if(mode.equals("v")){
			for(int i= 1; i <= seed; i++ ){
				int mone = 1;
				int x = i;
				System.out.print(i);				
				while (x != 1 || mone == 1) {
					if(x % 2 == 0){
					   x /= 2;
				    }
				    else{
					    x = (x * 3) + 1;
				    }
					mone++;
					System.out.print(" " + x);
				}
				System.out.println(" (" + mone + ")");

			}
			System.out.println("Every one of the first " +seed+ " hailstone sequences reached 1.");
		}
		if(mode.equals("c")){
			for(int i= 1; i <= seed; i++ ){
				int mone = 1;
				int x = i;				
				while (x != 1 || mone == 1) {
					if(x % 2 == 0){
					   x /= 2;
				    }
				    else{
					    x = (x * 3) + 1;
				    }
					mone++;
				}
			}
			System.out.println("Every one of the first " +seed+ " hailstone sequences reached 1.");
		}
	}
}
