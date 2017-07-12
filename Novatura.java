import java.util.Scanner;
public class Novatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite trocifren broj: ");
		int broj = unos.nextInt();
		int zadnjacifra = broj % 10;
		broj = broj / 10;
		int drugacifra = broj % 10;
		broj = broj / 10;
		System.out.println("Zbir cifara broja kojeg ste unijeli je " + (zadnjacifra + drugacifra + broj));
		
	}

}
