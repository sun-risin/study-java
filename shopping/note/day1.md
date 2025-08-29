## 개발환경 세팅 및 spring boot 플젝 생성


### 순서
1. IntelliJ community edition 에디터 설치 (무료버전)
2. Spring initializr에서 프로젝트 생성  
    2-1. Gradle과 Spring Boot 3.x 버전 (소괄호 있는 거 X)  
    2-2. 오른쪽에 기본 라이브러리 설치  
        -> Spring Web, Spring Boot DevTools  
    2-3. Group에는 회사명, Name에는 프로젝트명 작명  
    2-4. 그리고 Java 17이상 (너무 신버전은 문제 있을 수 있다)  
    2-5. 다운받아서 압축풀기.  
        에디터에서 프로젝트 폴더 오픈하면 코딩시작가능
3. 에디터에서 프로젝트 오픈  
    3-1. SDK 버전 확인 -> 생성한 프로젝트 설정 버전 이상  
    3-2. build tool 선택 (IntelliJ IDEA로) -> 선택사항      
    (Java Compiler 메뉴에서 -parameters 확인)

### 프로젝트 파일 설명
- src 폴더 : 실제로 코드 짜는 곳
- resources 폴더 : HTML CSS JavaScript 이미지 등 하찮은 파일 보관소
- application.properties 파일 : 환경변수나 프로젝트 설정 보관하는 곳
- build.gradle 파일 : 프로젝트 이름, 버전, 라이브러리 등 기록용 파일
- gradle~ : gradle이라는 작업자동화 프로그램 돌리는거 도와주는 파일들, 건드릴 일 없음