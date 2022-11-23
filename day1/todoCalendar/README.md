# todoCalendar 실습

## 목차
1. [프로젝트 계획 이유](#프로젝트-계획-이유)
2. [기능 설명](#기능-설명)
3. [프로젝트 요구 사항](#프로젝트-요구-사항)
4. [개발 환경](#개발-환경)
5. [실행 방법](#실행-방법)
---

## 1. 프로젝트 계획 이유
- 수업 시간에 배운 내용을 따로 실습하기 위함

## 2. 기능 설명
- 캘린더에 일정 등록

## 3. 프로젝트 요구 사항
1. GET방식의 /all/schedule  요청으로 할 일의 ArrayList<Calendar> 을 JSON Ajax방식으로 화면으로 가져 갑니다. Calendar 는 dto객체로 title, date을 String 형태로 저장합니다.
2. GET방식의 /put/schedule 요청으로 할 일을 등록합니다, 파라미터로는 title,date을 String 형태로 넘겨 줍니다. 등록이 완료된 후에 1번과 같은 응답을 주세요.
3. 날짜기준으로 중복이 안되게 처리해주세요.
4. html의 이름은 index.html 이고, 주소 입력 시, 바로 나와야 합니다.

## 4. 개발 환경
- Oracle OpenJDK 11.0.15
- SpringBoot 2.7.5
- Spring Web
- Thymeleaf
- IntelliJ IDEA 2022.2.2

## 5. 실행 방법
- Tomcat 서버 실행 후 사용