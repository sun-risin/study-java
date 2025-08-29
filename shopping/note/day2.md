## 웹서버와 웹페이지 만들기 (Controller)

### 서버란
: 유저가 데이터 달라고 요청 시 그 데이터를 갖다 주는 역할을 하는 프로그램
=> A 달라고 하면 A를 주는 코드를 짜는 것이 서버 개발

### 웹서버란
: 웹페이지 요청 시 해당 페이지 갖다 주는 것
(이외에도 글 저장, 수정, 삭제 등의 요청도 처리)
오늘은 페이지 갖다 주는 것만 할 예정

### 수업 내용
1. 서버 기능 만들기

    1-1. @Controller 바로 밑 class에 서버 기능 작성 가능 (위에 관련 import 필수)

    1-2. 기본틀 (GetMapping(url) 등...) 작성 후 메소드(기능) 작성

2. 서버에서 데이터 보내주는 법
    - 각 페이지에 매핑 한 개 가능, 각 매핑에 메소드 한 개 가능
    - url 부분에 /페이지명 작성 시 해당 페이지 생성 및 기능 작성 가능
    - 코드
        @GetMapping("/")    // 메인 페이지 접속 시
        @ResponseBody       // 문자 그대로를 보내게 하는 역할 (파일 보낼 시 삭제)
        String hello(){     // 기능
            return "hello"; // hello 내용 보냄 (페이지에 보임)
        }

3. html 보내는 법: return 문자열에 html 코드 작성

4. html 파일 보내주는 법
    
    4-1. resources/static에 파일 생성 및 보관

    4-2. ResponseBody를 제외한 기본틀에 코드 작성
        @GetMapping("/send")
        String send(){
            return "index.html"; // resources/static에 있는 파일! == 기본 경로
                                // 하위 폴더에 있는 파일이라면 폴더명/파일명
        }

### 숙제 - 오늘 날짜 및 시각을 date 페이지에 띄우기
        @GetMapping("/date")
        @ResponseBody
        String date(){
            LocalDateTime now = LocalDateTime.now();
            String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd(HH:mm:ss)"));

            return formatedNow;
            // return LocalDateTime.now().toString();
            // return ZonedDateTime.now().toString();
        }

#### 이외 메모
- java 파일 만들 때 
new > java class 누르면 편함
- html 파일 만들 때 
new > html > 빈 파일 내용에 !치고 엔터 누르면 기본 틀
- sout 엔터
System.out.println();
- @~ 엔터
위에 import 자동 생성
- 동일 파일 main 함수 내에 코드를 짜지 않았는데 연결되는 이유
@Controller 밑에 있는 클래스를 spring framework가 챙겨서 main함수에 집어 넣어 실행시켜주기 때문이다.