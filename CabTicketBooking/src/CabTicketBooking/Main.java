package CabTicketBooking;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		createTaxi(4);
		
		
		boolean flag=true;
		while(flag) {
			System.out.println("----------Ticket Booking----------");
			System.out.println("1.Booking");
			System.out.println("2.Booking Details");
			System.out.println("3.Taxi Details");
			System.out.println("4.Exit");
			
			int option =sc.nextInt();
			
			while(true) {
				if(option>=1&&option<=4) {
					
					break;
				}
				System.out.println("Enter the value between 1 to 4: ");
				option =sc.nextInt();
			}
			switch(option) {
			case 1: Booking();
			break;
			case 2: Booking();
			break;
			case 3: Booking();
			break;
			case 4: {flag=false;
			System.out.println("--------------Exiting--------------");
			break;}
			
			}	
		}
		

	}

	private static void createTaxi(int i) {
		// TODO Auto-generated method stub
		
	}

	private static void Booking() {
		// TODO Auto-generated method stub
		System.out.println("module working");
		
	}

}
