package _03_cat;

public class CatRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat ann = new Cat("Ann");
		Cat nameless = new Cat(null);
		
		System.out.println("Ann has started to meow: ");
		ann.meow();
		System.out.println("The nameless cat has started to meow: ");
		nameless.meow();
		
		ann.printName();
		nameless.printName();
		
		System.out.println("Ann has been attacked: ");
		ann.kill();
		
		for (int i = 0; i<10;i++) {
			System.out.println("The nameless cat has been attacked: ");
			nameless.kill();
		}
	}
}
