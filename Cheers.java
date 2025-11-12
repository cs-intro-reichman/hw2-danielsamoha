//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String m = args[0].toUpperCase();
            for (int i = 0;i < args[0].length(); i++){
                char n = m.charAt(i);
                if(n == 'A' ||n == 'E' ||n == 'I' ||n == 'O' || n== 'U'||n == 'F' ||n == 'H'||n == 'L'||n == 'M'||n == 'N'||n == 'R'||n == 'S'||n == 'X'){
                        System.out.println("Give me an " + m.charAt(i) + ": " + m.charAt(i) + "!");
                }
                else{
                        System.out.println("Give me a  " + m.charAt(i) + ": " + m.charAt(i) + "!");
                }
            }
            System.out.println("What does that spell?");
            for(int i = 0; i < Integer.parseInt(args[1]); i++){
                System.out.println(m + "!!!");
            }
        }
}
