package ch04;

import java.util.Scanner;

public class summary {
    public static void main(String args[]){

        // if 조건문
        int num = (int)(Math.random()*6) + 1;
        if (num == 1){
            System.out.println("1이 나옴");
        }else if(num == 2){
            System.out.println("2 나옴");
        }else{
            System.out.printf("%d 나옴\n", num);
        }

        // switch 조건문
        switch (num) {
            case 1:
                System.out.println("1이 나옴");
                break; // 안 쓰면 다음 case까지 실행됨
            case 2:
                System.out.println("2 나옴");
                break;
            default: // 해당 case 없을 시
                System.out.printf("%d 나옴\n", num);
        }

        // for 반복문 - 2단 출력
        for(int n = 2; n <= 2; n++){
            for (int m = 1; m<=9; m++){
                System.out.printf("%d X %d = %d\n", n, m, n*m);
            }
        }
        
        // do-while 반복문 - 잘 안 쓰긴 하는디...
        Scanner scanner = new Scanner(System.in);
        String inputString = "q";
        System.out.println("q를 입력하면 종료됩니다.");
        
        // while문으로 쓰게 되면~ 이 경우 실행되지 않음
        // while(! inputString.equals("q")){
        //     System.out.print(">");
        //     inputString = scanner.nextLine();
        //     System.out.println(inputString);
        // }
        
        do { // 일단 1번은 실행됨! q로 초기화했지만 실행됨
            System.out.print(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while( ! inputString.equals("q")); // 세미콜론!
    }    
}

/*
4장 조건문과 반복문 - js랑 동일

    조건문 - if, switch

    반복문 - for, while, do-while / break와 continue~
*/