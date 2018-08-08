// Creating a Person Class
public class Person {

	public static void main(String[] args){
		//(String color, String name, String breed, int hungry, int energy)
		Dog dog1 = new Dog("Brown", "Tommy", "Husky", 2, 4);
		Dog dog2 = new Dog("White", "Jerry", "Pug", 4, 2);
		
		
		dog1.bark();
		System.out.println(dog1.breed);
		dog1.Sleep() ; 
	}

	
}
