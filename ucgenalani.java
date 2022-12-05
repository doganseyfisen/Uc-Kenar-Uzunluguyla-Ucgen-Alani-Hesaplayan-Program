import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
    int k1, k2, k3, u2, u;
		double alan;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Üçgenin birinci kenar uzunluğunu giriniz: ");
		k1 = input.nextInt();
		
		System.out.print("Üçgenin ikinci kenar uzunluğunu giriniz: ");
		k2 = input.nextInt();
		
		System.out.print("Üçgenin üçüncü kenar uzunluğunu giriniz: ");
		k3 = input.nextInt();
		
		u2 = (k1 + k2 + k3);
		u = (u2/2);
		System.out.println("Üçgenin çevresi: " + u2);
		System.out.println("Üçgenin çevresinin yarısı: " + u);
		
		alan = Math.sqrt((u)*(u-k1)*(u-k2)*(u-k3));
		System.out.println("Üçgenin alanı: " + alan);
	}
}
