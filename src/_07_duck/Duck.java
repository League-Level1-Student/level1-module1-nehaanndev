package _07_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	
	public void quack() {
		System.out.println("Quack");
	}
	public void waddle() {
		System.out.println("Waddle");
	}
	
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
}
