package sw;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String [] args) throws InterruptedException, IOException {
		
		/*System.out.println("Please enter your username or email");
		String name; 
		Scanner sc = new Scanner(System.in); 
		name = sc.nextLine(); 
		System.out.println("Please enter your password");
		String pw; 
		Scanner s = new Scanner(System.in); 
		pw = s.nextLine();*/
		
		//User.login(name, pw);
		User.Registeration();
		System.out.println("enter product to add.\n");

		
		


		
        
        String name;
		String category;
		String description;
		String brand;
		double price;
		Integer rate=0;
		
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("enter product name: ");
		name=sc.nextLine();
		System.out.println("enter brand name: ");
		brand=sc.nextLine();
		System.out.println("enter category: ");
		category=sc.nextLine();
		
		System.out.println("enter description: ");
		description=sc.nextLine();
		
		System.out.println("enter price: ");
		price=sc.nextDouble();
		
		System.out.println("thanks\n");
		
		ProductSpec specs= new ProductSpec(name,price,brand,category,description,rate);
		
		Product product = new Product(specs);
		
		Inventory inventory= new Inventory();
		
		inventory.addToInventory(specs);
		
		
	
	}
}