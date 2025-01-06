import java.util.Scanner;
class root{
	public static void main(String []args){
		Scanner ip = new Scanner(System.in);
		System.out.println("enter value of a:");
		int a=ip.nextInt();
		System.out.println("enter value of b:");
		int b=ip.nextInt();
		System.out.println("enter value of c:");
		int c=ip.nextInt();
		int discriminant = b*b - (4*a*c);
		if(discriminant == 0){
			double root = -b/(2*a);
			System.out.println("The equation has one real root: "+ root);
			System.out.println();
		}else if(discriminant > 0){
			double root1 = (-b + Math.sqrt(discriminant))/2*a;
			double root2 = (-b - Math.sqrt(discriminant))/2*a;
			System.out.println("The equation has two real roots: "+root1+" "+root2);
			System.out.println();

		}else{
			System.out.println("Roots are imaginary");
			System.out.println();
		}
	}
}