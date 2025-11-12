public class TimeCalc {
    public static void main(String[] args) {

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutestoadd = Integer.parseInt(args[1]);
        minutestoadd += hours * 60 + minutes;
        int newhours = (minutestoadd / 60) % 24;
        int newminutes = minutestoadd - newhours * 60;
        System.out.println(newhours + ":" + newminutes);


    }
}
