import java.util.Scanner;

public class Java3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
		
		System.out.println("원화를 입력하세요.(단위 원)");
		long a = sc.nextInt();
		
		float b = a/1100;
		System.out.println(a+"원은 $" + b +"입니다.");
		
		sc.close();
		
		}catch (Exception e) {
			System.out.println("금액이 너무 허용범위를 초과합니다.");
	
		}
	}

}
