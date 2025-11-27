package _07_duck;

public class Snake {
	
	String faveFood;
	int hungerLevel;
	
	public void hiss() {
		System.out.println("Hissssss...");
	}
	
	public void attack() {
		System.out.println("The snake jumps out and bites. Hard.");
	}

	Snake(String faveFood, int hungerLevel){
		this.faveFood = faveFood;
		this.hungerLevel = hungerLevel;
	
	}
}
