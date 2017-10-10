package app;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero a convertir: ");
		int num = sc.nextInt();
		DAB(num);
	}
	
	public static void DAB(int n){
		if(n<2){
			System.out.print(n);
			return;
		}else {
			DAB(n/2);
			System.out.print(n%2);
		}
	}
	
}
