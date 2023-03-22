package ejercicio1;

public class CB extends CA{
	int z;
	public CB(int z) {
		super(z,z);
		this.z = z;

	}
	@Override
	public int suma() {
		return x+y+this.z;
	}
}
