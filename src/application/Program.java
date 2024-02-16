package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width heidth: ");
		
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
				
		System.out.printf("AREA: %.2f%n", rect.area());
		System.out.printf("PERIMETER %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL %.2f%n", rect.diagonal());
		
		System.out.printf("%.2f + %.2f%n", rect.width, rect.height);
		
		sc.close();
		
	}

}
