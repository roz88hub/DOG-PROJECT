// Author:- Rojan Pradhan
// Creating a dog class
public class Dog {
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getHungry() {
		return hungry;
	}
	public void setHungry(int hungry) {
		this.hungry = hungry;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	private String name;
	String breed;
	private int hungry;
	private int energy;
	
	// Consructor for Dog Class
	Dog(String color, String name, String breed, int hungry, int energy){
		this.color = color;
		this.name = name;
		this.breed = breed;
		this.hungry = hungry;
		this.energy = energy;
	}
	
	 public void Sleep(){
		 ++hungry;
		++energy;
		System.out.print("Hungry Level :" + this.hungry + '\n');
		System.out.print("Energy Level :" + this.energy);
	}

	public void Eat(){
		--hungry;
		++energy ;
		
	}
	static void bark(){
		System.out.println("wOOf WooF");
	}
 public String toString(){
	 return ("Name:" + this.name +  "\n" + "Breed:" + this.breed);
 }
	
}
