package com.main;
import com.bean.Corso;
import com.bean.Academy;

public class MainApplication {
	
	public static void main(String[] args) {
		
		
		//Una delle due modalità per inizializzare l'array
		int arrayInt [] = new int [3];
		
		arrayInt[0] = 42;
		arrayInt[1] = 71;
		arrayInt[2] = 99;
		
		for(int i=0;i<arrayInt.length;i++ ) {
			System.out.println("L'array nella posizione "+i+" contiene "+arrayInt[i]);
		}
		
		
		
		//Seconda modalità utile per inizializzare l'array
		int arrayNew [] = {42,56,98,645,98734};
		int arrayNewLength = arrayNew.length;
		
		for(int i=0;i<arrayNewLength;i++ ) {
			System.out.println("L'array nella posizione "+i+" contiene "+arrayNew[i]);
		}
		
		/*Array di Reference ad oggetti
		 * */
		Corso corsi [] = new Corso [3];
		corsi[0] = new Corso("1028x", "Java SE", "Roma");
		corsi[1] = new Corso("1028y", "Java EE", "Milano");
		corsi[2] = new Corso("1028z", "Spring", "Napoli");
		
		for (Corso corso : corsi) {
			
			System.out.println(corso.toString());
		
		}
		
		/*Il polimorfismo ci consente di inizializzare un 
		 * Array di reference dello stesso tipo (Object)
		 * che potranno poi assumere forme di oggetti
		 * */
		Object arrayCA [] = new Object [2];
		
		arrayCA[0] = new Corso("1076G", "Angular", "Roma");
		arrayCA[1] = new Academy("1076K", "Microservizi", "Formatemp", "Milano");
		
		for(Object object : arrayCA) {
			System.out.println(object.toString());
		}
		
	}

}
