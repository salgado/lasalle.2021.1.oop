package entidades;

public class Quadrado extends Forma {

	private Double lado;
	
	public Quadrado(Double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public Double getArea() {
		return this.lado * this.lado;
	}

}
