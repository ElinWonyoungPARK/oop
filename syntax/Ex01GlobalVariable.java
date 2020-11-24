package day08;

import java.util.Scanner;

// 전역 변수
// 전역 변수란 해당 프로그램 전체에서
// 접근 가능한 변수를
// 전역 변수라고 한다.
// 전역 변수의 장점: 모든 메소드가 접근 가능하다.
// 전역 변수의 단점: 모든 메소드가 접근 가능하다.

// 어떤 메소드이던간에 접근이 가능하기 때문에
// 전역변수의 사용은 이제 권장하지 않는다.
// 왜냐하면 그 값의 무결성(결점이 없음)을 검증하려면
// 여러 메소드를 다 확인해야하기 때문에
// 확인도 어렵고 확인이 정확하지 않을수도 있다!!


public class Ex01GlobalVariable {
    // 전역변수의 경우 유효범위가 프로그램 전체가 되어야 하기 때문에
    // 즉 클래스의 바로 다음줄에 나온다.
    int userNumber = 0;
    Scanner scanner = new Scanner(System.in);
    // 하지만 3세대 언어에선 이 위치에
    // 우리가 변수를 선언하면?
    // 변수가 아닌 필드가 된다.
    
    // 그렇다면 우리가 정말정말 모든 메소드가 쓸 몇개의 변수를
    // private 선언하고, 겟터/셋터 만들지 않으면?
    // 조금이나마 해당 변수의 무결성을 올려줄 수 있다.
    
    
    
}

















