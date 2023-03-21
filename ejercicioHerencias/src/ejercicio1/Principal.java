package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		CA c = (CA) new CB(123);
		//no es posible hacerlo
		c.suma();

	}

}
