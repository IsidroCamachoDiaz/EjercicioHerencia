package ejercicio1;

public class CA  extends CB{
	int x,y;
	public CA(int x, int y,int z) {
		super(z);
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int suma() {
		return this.x+this.y;
	}
}
