package ejercicio1;

public class CA implements comparable{
	int x,y;
	public CA(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int suma(){
		return this.x+this.y;
	}
	int mayor() {
		if(this.x>this.y)
			return this.x;
		return this.y;
	}

	@Override
	public int compareTo(Object o1, Object o2) {
		if(o1.x>o2.x)
			return -1;
		if(o1.x<o2.x)
			return 1;
		return 0;
	}
}

