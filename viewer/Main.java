package viewer;

import java.util.Scanner;

import user.UserController;
import user.UserDto;
/**
 * 요구사항 (기능정의)
 * <사용자기능>
 * 1. 회원가입
 * 2. 로그인 
 * 3. 비번 수정
 * 4. 회원탈퇴
 * 5. 아이디 존재 체크
 * 6. 마이페이지
 * **********
 * <관리자기능>
 * 7. 회원목록
 * 8. 아이디검색
 * 9. 이름검색
 * 10. 전체 회원수
 */

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MemberController userController = new MemberController();
		while(true) {
			System.out.println("Menu: 1.회원가입 2.로그인 3.비번 수정"
					+ " 4.회원탈퇴 5.아이디 존재 체크 6.마이페이지 7.회원목록 8.아이디찾기"
					+ " 9.이름찾기 10.전체 회원수 0.Exit");
			switch (scanner.next()) {
				case"0":
					System.out.println("Exit");
					return;//종료
				case "1":
					System.out.println("1번 회원가입");
					userController.postJoin(user);
					break;
				case "2":
					System.out.println("2번 로그인");
					break;
				case "3":
					System.out.println("3번 비번 수정");
					break;
				case "4":
					System.out.println("4번 회원탈퇴");
					break;
				case "5":
					System.out.println("5번 아이디 존재 체크");
					break;
				case "6":
					System.out.println("6번 마이페이지");
					break;
				case "7":
					System.out.println("7번 회원목록");
					break;
				case "8":
					System.out.println("8번 아이디찾기");
					break;
				case "9":
					System.out.println("9번 이름찾기");
					break;
				case "10":
					System.out.println("10번 전체 회원수");
					break;
					
			}
		}
	}
}





