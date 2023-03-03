import java.util.Scanner;

public class Java2 {

	public static void main(String[] args) {
		System.out.println("가위 바위보 게임입니다. 가위 , 바위 , 보 중에서 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		//철수 입력 , print로 넘기지않음
		System.out.println("철수 >> ");
		String user1 = sc.next(); // 띄어쓰기 안하는 단어만 받으니 nextline ㄴㄴ
		
		//영희 입력 
		System.out.println("영희 >>");
		String user2 = sc.next();
		
		//if로 진행
		if(user1.equals("가위")) {
			if(user2.contentEquals("가위")) {
				System.out.println("비겼습니다.");
			}else if(user2.contentEquals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}else if(user2.contentEquals("보")) {
				System.out.println("철수가 이겼습니다.");
			}else {
				System.out.println("가위 바위 보 중에 입력하세요.");
			}
	}
		else if(user1.equals("바위")) {
			if(user2.contentEquals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}else if(user2.contentEquals("바위")) {
				System.out.println("비겼습니다.");
			}else if(user2.contentEquals("보")) {
				System.out.println("영희가 이겼습니다.");
			}else {
				System.out.println("가위 바위 보중에 입력하세요..");
		}
	}
		else if(user1.equals("보")) {
			if(user2.contentEquals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}else if(user2.contentEquals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}else if(user2.contentEquals("보")) {
				System.out.println("비겼습니다.");
			}else {
				System.out.println("가위 바위 보중에 입력하세요..");
			}
		}
		else {
			System.out.println("가위 바위 보 중에서 입력하세요.");
		}
	}
}
