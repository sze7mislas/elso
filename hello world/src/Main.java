
public class Main {

	/**
	 * ALT+SHIT+J az argumentumon
	 * @param args- argumentumok
	 * 
	 */
	public static void main(String[] args) {

		/*
		 * int i=10; double j=2.5; char a='a'; char A=65; String szöveg ="valalmi";
		 * boolean igaze=true;
		 * 
		 * final double PI=3.14;
		 * 
		 * String szo=igaze? "igaz":"hamis"; if(igaze) { System.out.println("Igaz"); }
		 * else System.out.println("hamis");
		 * 
		 * 
		 * System.out.println(i+""+j+""+a+" "+A+" "+szöveg+" "+igaze+" ");
		 * System.out.print(PI); System.out.println(!igaze);
		 */
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int terfogat = a * b * c;
		int felszin = 2 * (a * b + b * c + a * c);
		System.out.println(terfogat);
		System.out.println(felszin);
		
		System.out.println("összeg="+(a+b));
		System.out.println("különbség="+(a-b));
		System.out.println("hányados="+(a/b));

	}

}
