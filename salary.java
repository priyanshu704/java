import java.util.Scanner;
class salary{
	public static void main(String []args){
		Scanner ip = new Scanner(System.in);
		int st = 40;
		System.out.println("Enter the number of hours worked : ");
		float h = ip.nextFloat();
		System.out.println("Enter the hourly rate:  ");
		float hr = ip.nextFloat();
		float ehw = h - st;
		float pay=0;
		if(ehw>0)
		{
			pay=(st*hr)+(ehw*(hr/2));
		}
		else
		{
			pay=h*hr;
		}
		System.out.println("the total amount to be paid:"+pay);
	}
}