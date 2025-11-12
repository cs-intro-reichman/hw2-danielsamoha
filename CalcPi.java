// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int l = Integer.parseInt(args[0]);
		double v =1.0;
		double mone = 3.0;
		for(int i = 0; i < l - 1; i++){
			System.out.println("Mone Status: " + mone);
			double d = 1.0/mone;
			System.out.println("mone: " + d);
			if(i % 2 == 0){
				v -= d;
			}
			else{
				v += d;
			}
			System.out.println("Value: " + v * 4);
			mone +=2;
			
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + v * 4);
	}
}
