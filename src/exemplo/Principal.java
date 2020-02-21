package exemplo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
		
		// Vetor "tradicional" -> estático
		int vetor[] = new int[5];
		
		//System.out.println("Tamanho do vetor: " + vetor.length);
		
		vetor[0] = 10;
		vetor[1] = 11;
		
		// ArrayList -> dinâmico
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("café");
		arrayList.add("arroz");
		arrayList.add("feijão");
		
		// Vector -> dinâmico
		Vector<String> vectorDinamico = new Vector<String>();
		vectorDinamico.add("leite");
		
		// LinkedList -> Duplamente encadeada
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("açúcar");
		
		/*
		 * for tradicional
		 
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		*/
		
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
			
		
		// for each
		for(String s : arrayList) {
			System.out.println(s);
		}
		
		

	}

}
