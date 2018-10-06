
public class Main {

	/**
	 * ALT+SHIT+J az argumentumon
	 * 
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

		System.out.println("összeg=" + (a + b));
		System.out.println("különbség=" + (a - b));
		System.out.println("hányados=" + (a / b));
		System.out.println("ujbranch ág");

		double szam1 = 2.9;
		;
		int szam2 = 4;
		int szam3 = 6;
		int szam4 = 8;
		int szam5 = 10;

		double szamtanikozep = (double) (szam1 + szam2 + szam3 + szam4 + szam5) / 5;
		System.out.println("számtaniközep= " + szamtanikozep);

		int x = Integer.parseInt(args[3]);
		int y = Integer.parseInt(args[4]);//
		int z = Integer.parseInt(args[5]);

		double masodfoku = (-y - Math.sqrt(y * y - 4 * x * z)) / 2 * x;
		double masodfoku2 = (-y + Math.sqrt(y * y - 4 * x * z)) / 2 * x;

		System.out.println("masodfoku egyenlet: " + masodfoku);
		System.out.println("masodfoku egyenlet: " + masodfoku2);

		int digit = 3;
		if (digit % 2 == 0) {
			System.out.println("páros");
		} else {
			System.out.println("páratlan");
		}
		int oszthatoE = 24597;
		int oszto1 = 2;
		int oszto2 = 3;
		int oszto3 = 5;

		if (oszthatoE % oszto1 == 0) {
			System.out.println("A " + oszthatoE + " Kettővel osztható a szám");
		} else {
			System.out.println("A " + oszthatoE + " Nem osztható kettővel -maradék nélkül- a szám ");
		}
		if (oszthatoE % oszto2 == 0) {
			System.out.println("A " + oszthatoE + " Hárommal osztható a szám");
		} else {
			System.out.println("A " + oszthatoE + " Nem osztható hárommal -maradék nélkül- a szám ");
		}
		if (oszthatoE % oszto3 == 0) {
			System.out.println("A " + oszthatoE + " Öttel osztható a szám");
		} else {
			System.out.println("A " + oszthatoE + " Nem osztható öttel -maradék nélkül- a szám ");
		}
		int oldalA = 2;
		int oldalB = 6;
		int oldalC = 10;

		if (oldalA + oldalB > oldalC && oldalA + oldalC > oldalB && oldalB + oldalC > oldalA) {
			System.out.println("A háromszög szerkeszthető");
		} else {
			System.out.println("Nem szerkeszthető");
		}
		int megadottSzam = 444444;
		if (1 < megadottSzam && megadottSzam < 1000000) {
			if (1 <= megadottSzam && megadottSzam < 10) {

				System.out.println("Egyjegyű");

			}
			if (10 <= megadottSzam && megadottSzam < 100) {

				System.out.println("Kétjegyű");

			}
			if (100 <= megadottSzam && megadottSzam < 1000) {

				System.out.println("Háromjegyű");

			}
			if (1000 <= megadottSzam && megadottSzam < 10000) {

				System.out.println("Négyjegyű");

			}
			if (10000 <= megadottSzam && megadottSzam < 100000) {

				System.out.println("Ötjegyű");

			}
			if (100000 <= megadottSzam && megadottSzam < 1000000) {

				System.out.println("Hatjegyű");

			}
			int parameter1 = 15;
			int parameter2 = 65;

			if (parameter1 > parameter2) {
				System.out.println("Az első szám a nagyobb");
			}
			if (parameter1 < parameter2) {
				System.out.println("A második szám a nagyobb");
			}
			if (parameter1 == parameter2) {
				System.out.println("A két szám egyenlő");
			}
			int visszaszamol=5;					
			if (visszaszamol<=10)
			{
				
				switch (visszaszamol)
				{
				case(9):
					System.out.println("kilenc");
				
				case(8):
					System.out.println("nyolc");
				
				case(7):
					System.out.println("hét");
				
				case(6):
					System.out.println("hat");
				
				case(5):
					System.out.println("öt");
				
				case(4):
					System.out.println("négy");
				
				case(3):
					System.out.println("három");
				
				case(2):
					System.out.println("kettő");
				
				case(1):
					System.out.println("egy");
				case(0):
					System.out.println("nulla");
					
				
			}
			}
				else
				{
					System.out.println("A szám nem megfelelő!! ");
				}
				
				
			}

	}
}
