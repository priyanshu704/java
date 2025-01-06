import java.util.Scanner;
class conversion{
	public static void main(String []args){
		Scanner ip = new Scanner(System.in);
		int choice;
		double distInKM, distInMeter;
		do{
			System.out.println("Press 1 for KM_per_hour to meter_per_hour conversion");
			System.out.println("Press 2 for meter_per_hour to KM_per_hour conversion");
			System.out.println("Press 0 to exit");
			System.out.println("Enter your choice: ");
			choice = ip.nextInt();
			switch(choice){
				case 1: System.out.println("Enter the speed in KM_per_hour: ");
						distInKM = ip.nextDouble();
						distInMeter = distInKM * 1000/3600;
						System.out.println("Speed in meter_per_hour : "+distInMeter+" mps");
						break;
				case 2: System.out.println("Enter the speed in meter_per_hour: ");
						distInMeter = ip.nextDouble();
						distInKM =distInMeter*3600/1000 ;
						System.out.println("Speed in meter_per_hour : "+distInKM);
						break;
				default:System.out.println("Exting....");
						return;
			}
			System.out.println("Press 1 to continue or 0 to exit");
			choice = ip.nextInt();
		}while(choice==1);
	}
}