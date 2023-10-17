package view;

import model.Lista;

public class Principal {

	public static void main(String[] args) throws Exception{
		Lista<Integer> ListaA = new Lista<Integer>();
		Lista<Integer> ListaB = new Lista<Integer>();
		Lista<Integer> ListaI = new Lista<Integer>();
		Lista<Integer> ListaU = new Lista<Integer>();
		int [] VetorA = new int [7];
		int [] VetorB = new int [5];
				//carregando a Lista A//
		ListaA.addFirst(16);
		ListaA.addFirst(7);
		ListaA.addFirst(9);
		ListaA.addFirst(12);
		ListaA.addFirst(8);
		ListaA.addFirst(5);
		ListaA.addFirst(3);
		
				//carregando a Lista B//
		ListaB.addFirst(7);
		ListaB.addFirst(3);
		ListaB.addFirst(2);
		ListaB.addFirst(6);
		ListaB.addFirst(9);
		
				//vetores auxiliares para comparação//
		for(int i = 0; i < 7; i++) {
			if(i < 5) {
				VetorA[i] = ListaA.get(i);
				VetorB[i] = ListaB.get(i);
			}
			else {
				VetorA[i] = ListaA.get(i);
			}
		}
	
				//carregando a Lista I//
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 7; j++) {
				if(VetorB[i] == VetorA[j]) {
					ListaI.addFirst(VetorB[i]);
				}
			}
		}
		
				//carregando a Lista U//
		for(int i = 0; i < 7; i++) {
			if(i < 5) {
				ListaU.addFirst(VetorA[i]);
				ListaU.addFirst(VetorB[i]);
			}
			else {
				ListaU.addFirst(VetorA[i]);
			}
		}
	}
}