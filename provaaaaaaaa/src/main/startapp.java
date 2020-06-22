package main;

import java.util.ArrayList;
import java.util.Scanner;


import vo.cardapio;
import vo.estabelecimento;
import vo.lanchonete;
import vo.pizzaria;
import vo.restaurante;



public class startapp {

	public static void main (String [] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		ArrayList <estabelecimento> lista = new ArrayList();
		
		cardapio c = new cardapio();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("1- Lanchonete\n2-Restaurante\n3-Pizzaria");
			int opcao = sc.nextInt();
			
			System.out.println("Nome do estabelecimento:");
			String nome = sc.nextLine();
			sc.nextLine();
			
			if(opcao == 1) {
			lanchonete x = new lanchonete(nome);
			lista.add(x);
			
			}
			
			else if(opcao == 2) {
			restaurante y = new restaurante(nome);
			lista.add(y);
			
				
			}
			
			else if(opcao == 3) {
			pizzaria z = new pizzaria(nome);
			lista.add(z);
			
				
			}
			
			else {
				System.out.println("Inválido!");
			}
			
			
		
		}
}
}

		
	
