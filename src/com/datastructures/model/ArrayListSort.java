package com.datastructures.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		
		//Se crea una nueva lista de tipo array list
		List <String> letras = new ArrayList<String>();
		
		//se añaden elementos a la lista
		letras.add("b");
		letras.add("e");
		letras.add("a");
		letras.add("d");
		letras.add("c");
		
		//se instancia el metodo "sort" de la clase collections para ordenar el ArrayList de forma ASCENDENTE
		Collections.sort(letras);
		
		//metodo para ordenar de forma DESENDENTE
		//Collections.sort(letras,Collections.reverseOrder());
		
		
		//se muestra la lista con un for each
		for(String elemento:letras) {
			System.out.println(elemento);
		}

	}

}
