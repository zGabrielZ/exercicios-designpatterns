package teste;

import java.util.Scanner;

import factory.ContadorFactory;

public class Cliente4 {

	public static void main(String[] args) {
		System.out.println("Qual op��o que voce quer que imprima um contador at� 10 ? ");
		System.out.println("No console ou No arquivo ? ");
		
		Scanner sc = new  Scanner(System.in);
		
	
		String msg = sc.nextLine();
		
		ContadorFactory.gerarContador(msg).contarAteDez();
	
	
		sc.close();
		
	}
}
