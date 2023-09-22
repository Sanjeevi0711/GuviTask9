package GuviTask9;

import java.util.Scanner;

public class HotelTariff {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int month = sc.nextInt();
		double roomrent = sc.nextDouble();
		int numDays = sc.nextInt();
		 
		double peakSeasonMultipiler = 1.2;
		switch (month) {
		case 4 :
		case 5 :
		case 6 :
		case 11 :
		case 12 :
			roomrent = peakSeasonMultipiler;
			break;
			default:
			break;
			
			
		}
	}
	

	
	
	
	
	
	
	

}
