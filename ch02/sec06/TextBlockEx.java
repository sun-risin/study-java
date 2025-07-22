package ch02.sec06;

public class TextBlockEx {

	public static void main(String[] args) {

		// str1과 str2는 동일한 문자열이 저장되나 다른 방식으로 작성한 모습.
		// str1 : +를 이용해 이어 붙였으며 이스케이프 문자 이용
		// str2 : 텍스트블록 기능 이용함
		String str1 = "" +          //얜 왜 했을까...
		"{\n" +                     //{엔터
		"\t\"id\":\"winter\",\n" +  //탭 "id":"winter", 엔터
		"\t\"name\":\"눈송이\"\n" +   //탭 "name":"눈송이" 엔터
		"}";                        //}

		String str2 = """
		{
			"id":"winter",
			"name":"눈송이"
		}
		""";
		
		System.out.println(str1);
		System.out.println("--------------------------");
		System.out.println(str2);
		System.out.println("--------------------------");
		

		// 29라인 \ => 줄바꿈 없이 이어 작성됨.
		String str = """
		나는 자바를 \
		학습합니다.
		나는 자바 고수가 될 겁니다.
		""";
		System.out.println(str);
	}

}

/*
 """ """ (텍스트 블록 기능) 사용하려면 JAVA 15 이상이어야 함
    이스케이프, 라인피드 없이 작성된 그대로 문자열이 저장됨.
	줄바꿈을 하지 않고 이어서 작성하고 싶다면 이스케이프(\) 붙이기
 */