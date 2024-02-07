
public class Info {
	public static void main(String[] args) {
		 Animal a = new Animal();
		
		 a.name = "Cow";
			a.type ="Big";
			a.size = 60;		
		a.nightvision = true;
		a.Eat("grass");
		a.sleep(true);
		a.bite(false);
		System.out.println("The animal is : " + a.name + " ,The animal Type : "+a.type+ " , The animal Size : " +a.size);
		
		System.out.println("Take new animal for its identification ");
		 Animal b = new Animal();
		 b.name = "Cat";
			a.type ="Small";
			a.size = 20;		
		a.nightvision = true;
		a.Eat("catfood");
		a.sleep(true);
		a.bite(true);
		System.out.println("The animal is : " + b.name + " ,The animal Type : "+b.type+ " , The animal Size : " +b.size);
		
	
	}
}
