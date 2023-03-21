package ejercicio1;

public class CC extends CD{
	
	public CC(int x, int y) {
		super(x, y);
	}

	int dobleSuma() {
		return suma()+suma();
	}
}
