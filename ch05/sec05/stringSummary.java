package ch05.sec05;

import java.util.Scanner;

public class stringSummary {
    public static void main(String[] args){
        /* 문자열 비교 */
        String str1 = "홍길동";
        String str2 = "홍길동";
        String str3 = new String("홍길동");

        // true
        System.out.println("str1과 str2가 같은가?: " + (str1 == str2));
        // false
        System.out.println("str2와 str3이 같은가?: " + (str2 == str3));

        String hobby = " ";            // 빈 문자열 저장된 String 객체 생성됨.
        if(hobby.equals(" ")){ // true. String 객체이므로 equlas로 비교해야 함
            System.out.println("hobby가 참조하는 객체는 빈 문자열");
        }

        /* 문자 추출 */
        String ssn = "9506241230123";   // 주민등록번호
        char sex = ssn.charAt(6); // 7번째 문자 == 성별 나타냄
        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
        
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }

        /* 문자열 길이 */
        if (ssn.length() == 13){
            System.out.println("주민등록번호 자릿수가 알맞습니다.");
        }else{
            System.out.println("주민등록번호 자릿수가 맞지 않습니다.");
        }

        /* 문자열 대체 */
        String newSsn = ssn.replace("95", "94");
        System.out.println("기존 문자열: " + ssn);
        System.out.println("새로운 문자열: " + newSsn);

        /* 문자열 잘라내기 */
        String newSex = ssn.substring(6, 7);
        System.out.println(sex == (newSex.charAt(0))); // true

        /* 문자열 찾기 */
        String stat = "파이썬, 스프링부트, 자바 공부중";
        boolean check = stat.contains("자바"); // 포함 검사
        if (check){
            int idx = stat.indexOf("자바"); // 위치
            System.out.print("필자는 자바를 공부 중이며, 해당 내용은 ");
            System.out.println(idx + "번 인덱스부터 기술되어 있다.");
        }

        /* 문자열 분리 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("3반 학생 이름: ");
        String names = scanner.nextLine();
        String[] namesLi = names.split(" ");
        
        System.out.println("3반 출석 부르겠습니다.");
        for(int i = 0; i < namesLi.length; i++){
            System.out.println(namesLi[i]);
        }
    }
}

/*
5.5 문자열 String
    자바의 문자열은 String 객체로 생성, 리터럴을 대입해 번지수로 초기화 
    or new 연산자로 생성 후 대입 초기화

    * 문자열 비교
        String 객체로 생성 후 대입한 문자열 리터럴 동일할 시 객체 공유.
        따라서 같은 값의 리터럴을 대입할 시 비교 연산으로 true 도출
        
        But!! new 연산자로 생성해 같은 값으로 대입한 경우는 다른 객체.
        
        => 문자열 리터럴로 생성한 경우와 new로 생성한 경우의 결과가 다름

        동일 객체인지에 상관 없이 값이 같은지만 보고 싶다면?
            : .equals() 메소드 이용! (ex) str1.equals(str2) 등
    

    * 문자 추출
        charAt() 메소드 -> 넣은 인덱스의 문자 리턴.

    * 문자열 길이
        length() 메소드 -> 문자 개수 리턴. (마지막 인덱스= 길이-1)

    * 문자열 대체 (매개변수: 기존값, 변경값)
        replace() 메소드 -> 기존 문자열 변화 X 새 문자열 리턴

    * 문자열 잘라내기 (슬라이싱)
        substring() 메소드
            1. 시작 인덱스만 작성: 시작인덱스~끝까지
            2. 시작 인덱스, 끝 인덱스: 시작인덱스~끝인덱스-1까지 
    
    * 문자열 찾기 (인덱스 찾기)
        indexOf() 메소드 -> 문자열 매개, 첫 시작 인덱스 리턴
        포함되지 않은 문자열을 찾게 되면 -1 리턴

        (+) 문자열 포함돼있는지 조사? : contains() 메소드
            true or false 리턴
    
    * 문자열 분리
        split() 메소드 -> 특정 문자열을 기준으로 분리 가능, 배열 리턴
*/
