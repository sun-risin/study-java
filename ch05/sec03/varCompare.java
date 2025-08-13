package ch05.sec03;

public class varCompare {
    public static void main(String args[]){
        // 배열(참조 타입)의 비교 연산
        int[] arr1; int[] arr2; int[] arr3;

        arr1 = new int[] {1, 2, 3};
        arr2 = new int[] {1, 2, 3}; // 값은 같아도 다른 객체.
        arr3 = arr2;                // arr2를 arr3에 대입, 즉 같은 객체(배열) 참조

        System.out.println(arr1 == arr2); // false
        System.out.println(arr2 == arr3); // true
    }
}

/*
참조 타입 변수의 ==, != 연산
    단순히 비교 연산을 하면 객체 번지 비교가 됨.
        => 같은 값을 저장해도 동일 객체가 아니라면 다르다는 결론 도출

*/