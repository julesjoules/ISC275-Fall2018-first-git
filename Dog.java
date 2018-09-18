
public class Dog extends Animal {
	
	
	public Dog(String name, int legs) {
		super(name, legs);
		this.legs = legs;
		this.name = name;
	}

	/*commented out these functions since they are defined in Animal which dog extends
	 * public String toString() {
		return name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLegs() {
		return legs;
	}


	public void setLegs(int legs) {
		this.legs = legs;
	}*/
		
}
