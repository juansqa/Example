import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
//		int num1= 10;
//		int num2= 5;
		
//		System.out.println("El resultado de la suma es: " + (num1+num2));
//		System.out.println("El resultado de la resta es: " + (num1-num2));
//		System.out.println("El resultado de la multiplicación es: " + (num1*num2));
//		System.out.println("El resultado de la división es: " + (num1/num2));

//		if(num1>num2) {
//			System.out.println("el numero " + num1 + " es mayor que el numero " + num2 );
//			
//		}
		//System.out.println("ingrese un numero: ");
		int num1=sc.nextInt();
		System.out.println("ingrese un numero: ");
		int num2=sc.nextInt();
//		System.out.println("El resultado de la suma es: " + (num1+num2));
		
//		for(int i=0;i<=100;i++) {
//			System.out.println("los numeros son: " + i);
//		}
		
		Operaciones ope=new Operaciones();
		//ope.suma(num1,num2);
		ope.entreValores(num1, num2);
		
		
		
		
		
		
		
		
	}
	

}
