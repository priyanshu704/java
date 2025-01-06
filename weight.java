import java.util.Scanner;
class weight{
	public static void main(String args[]){
		Scanner ip = new Scanner(System.in);
		System.out.println("enter weight in kg:");
		float w=ip.nextFloat();
		System.out.println("enter height in cms:");
		float h=ip.nextFloat();
		float him=h/100;
		float bmi= w/(him * him);
		System.out.println("body mass index:"+bmi);
		if(bmi<18.5){
		   System.out.println("Underweight");
		   }
		   else if(bmi>=18.5 && bmi<24.9){
		    System.out.println("Normal");
		    }
		    else if(bmi>=25 && bmi<=29.9){
		    System.out.println("Overweight");
		    }
		    else{
		    System.out.println("Obese");
		    }

	}
}






