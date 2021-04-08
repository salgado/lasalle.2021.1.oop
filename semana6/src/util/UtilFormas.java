package util;

import java.util.List;

import entidades.*;

public final class UtilFormas {
	
	public static void imprimir(List<Forma> formas)
	{
		//percorrer a lista
		System.out.println("Areas de Formas Geométricas");
		for (Forma forma : formas) {
			
			if(forma instanceof Circulo )
				System.out.println("Area do Círculo = " + forma.getArea());
			else if(forma instanceof Quadrado)
				System.out.println("Area do Quadrado = " + forma.getArea());
			
		}
	}

	public static void imprimir(Circulo circulo) {
		System.out.println("Círculo");
		System.out.println("Area = " + circulo.getArea());
	}

}
