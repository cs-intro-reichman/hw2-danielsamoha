//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

            for (int i = 0;i < args[0].length(); i++){
                char n = args[0].charAt(i);
                if(n == 'A' ||n == 'E' ||n == 'I' ||n == 'O' || n== 'U'){
                        System.out.println("Give me an " + args[0].charAt(i) + ": " + args[0].charAt(i) + "!");
                }
                else{
                        System.out.println("Give me a  " + args[0].charAt(i) + ": " + args[0].charAt(i) + "!");
                }
            }
            System.out.println("What does that spell?");
            for(int i = 0; i < Integer.parseInt(args[1]); i++){
                System.out.println(args[0] + "!!!");
            }
        }
}
