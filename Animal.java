
public class Animal implements Comparable<Animal>{
	public String name;
	public int legs;

	public Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}
	
	public String toString() {
		return name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Animal a) {
		return this.toString().compareTo(a.toString());
	}
	
	

}
