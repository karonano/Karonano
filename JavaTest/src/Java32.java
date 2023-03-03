

	import java.util.Scanner; // try- catch - try로 반복

	public class Java32 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        boolean isValid = false;   // boolean 타입으로 초기값 false
	        while (!isValid) {			//논리값 (거짓이지만 !논리값반대로 참)
	            try {
	                System.out.println("원화를 입력하세요.(단위 원)");
	                long a = sc.nextInt();
	                float b = a / 1100;
	                System.out.println(a + "원은 $" + b + "입니다.");
	                isValid = true; // 입력이 유효할 경우 while 루프 종료
	            } catch (Exception e) {
	                System.out.println("금액이 너무 허용범위를 초과합니다. 다시 입력하세요.");
	                sc.nextLine(); // 입력 버퍼에 남아있는 개행 문자 제거
	            }
	        }
	        sc.close();
	    }
	}

