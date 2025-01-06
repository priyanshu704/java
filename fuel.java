import java.util.Scanner;
class fuel{
	public static void main(String []args){
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the total distance covered: ");
		float d = ip.nextFloat();
		System.out.println("Enter the amount of fuel consumed: ");
		float fc = ip.nextFloat();
		float ec = d/fc;
		System.out.println("Average fuel economy : "+ec);
		int choice;
		do{
			System.out.println("Press 1 for distance estimation");
			System.out.println("Press 2 for fuel estimation");
			System.out.println("Press 0 to exit");
			System.out.println("Enter your choice: ");
			choice =ip.nextInt();
			switch(choice){
				case 1: System.out.println("Enter the fuel: ");
						float f = ip.nextFloat();
						System.out.println("Estimated disatnce : "+ec*f);
						break;
				case 2: System.out.println("Enter the distance: ");
						float dist = ip.nextFloat();
						System.out.println("Estimated Fuel : "+dist/ec);
						break;
				default:System.out.println("Exting....");
						return;
			}
			System.out.println("Press 1 to continue or 0 to exit");
			choice = ip.nextInt();
		}while(choice==1);
	}
}