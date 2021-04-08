package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.*;
import util.UtilFormas;

public class Programa {

	public static void main(String[] args) {
		
		Double raio, lado;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio:");
		raio = in.nextDouble();
		
		Circulo circulo = new Circulo(raio);
		
		//quadrado
		System.out.println("Entre com o valor do lado:");
		lado = in.nextDouble();
		
		Quadrado quadrado = new Quadrado(lado);
		
		List<Forma> formas = new ArrayList<>();
		
		formas.add(circulo);
		formas.add(quadrado);
		
		UtilFormas.imprimir(formas);
		UtilFormas.imprimir(circulo);
		
		in.close();

	}

}
