![image](https://github.com/user-attachments/assets/1571a693-841e-471b-8b45-4efba5601e26)

<div align=center>
  <h1> 🐶 Hello Dangle World! 🐶 </h2>

  <br>
  <br>
<<<<<<< HEAD
  <strong>댕글</strong> : 댕댕이 미용 및 건강 관리 중계 플랫폼
=======
  <strong>댕글</strong> : 애견 미용 및 건강 관리 중계 플랫폼
>>>>>>> 758eda83ec1d8cddb35096f28375a941b554e667
  <br>


</div>
<br />
<br />

## 🏗️ 시스템 아키텍처

![아키텍처이벤트](https://github.com/user-attachments/assets/8efcdec5-005f-4292-a705-f1c2957eced3)

<br />
<br />

## 📦 레포지토리 구조도

![멀티모듈](https://github.com/user-attachments/assets/4a430e36-25a0-4176-ab2c-d89b94175c49)


<br />
<br />

<<<<<<< HEAD
### 🚨 장애대응

외부 API를 사용하는 기능들에 타임아웃을 설정했습니다.
외부 API 서버의 장애가 우리 API서버로의 장애로 전파되는 것을 방지했습니다.
<br />
<br />

### 🚛 CI/CD 모듈별 자동 배포

api 모듈을 독립적으로 배포할 수 있도록 브랜치 전략을 활용했습니다. 
이로써 각 모듈을 빠르게 빌드하고 배포할 수 있었습니다.
단, 공통 라이브러리 모듈에 변경이 생길 때에는 모든 모듈을 재배포해야하기 때문에 이에 따른 워크플로우도 작성했습니다.
<br />
<br />

### 🖥️ 부하 테스트 및 성능 모니터링

처음에는 모놀리식 프로젝트였습니다. 하지만 알림 API, 결제 API가 굉장히 많이 요청되는 기능에 붙어있기 때문에 만약 이 의존된 외부 API 서버에 장애가 생겼을 때, 우리 서버의 전반적인 장애로 이어질 것 같았습니다.
해서, 의도적으로 타임아웃이 발동되도록 프로젝트를 세팅하고 부하테스트를 진행해보았습니다. 결과로 타임아웃에 묶여있는 스레드들로 인해 프로젝트 전반적인 장애가 생겼고, 멀티모듈로의 전환을 결심했습니다.
<br />
<br />

## 💬 DynamoDB + 실시간 채팅

반려인 사용자와 미용사/병원 간 간단한 상담 서비스를 위해 실시간 채팅 기능을 구현했습니다.
STOMP 프로토콜을 활용해 WebSocket 기반의 실시간 통신을 지원하며, 다수의 사용자가 동시에 여러 채팅방에서 원활하게 소통할 수 있도록 설계했습니다.
빠른 조회와 확장성을 위해 DynamoDB의 Partition Key와 Sort Key를 활용해 채팅방의 대화 내역을 시간순으로 효율적으로 조회 가능하도록 구현했습니다.
<br />
<br />

## 🚀 SQL 튜닝을 통한 DB 최적화

<br />
<br />
=======
>>>>>>> 758eda83ec1d8cddb35096f28375a941b554e667

## 💵 결제 시스템

<br />


![페이먼츠_플로우](https://github.com/user-attachments/assets/8144f1e0-22db-43d8-99eb-53144f8bca67)


</div>

<br />


## 🕵️ 금칙어 필터링

<br />

![필터링 플로우_ (1)](https://github.com/user-attachments/assets/46c01b77-6983-4199-8162-684d5febc838)

![Node Tree_ (1)](https://github.com/user-attachments/assets/2c1e47a1-87aa-4d63-9b37-7c757425af70)


<br />

## 🧰 기술 스택
![댕글 기술스택](https://github.com/user-attachments/assets/aa25f2eb-46af-4cb9-9480-d47fb8c11c97)
<br />
<br />


## 🚢 CI/CD

![CICD_FLOW](https://github.com/user-attachments/assets/b1b341d9-c94e-42dc-be5a-a54e8f5b7d61)

<br />
<br />

## 💬 DynamoDB 설계도

![채팅 플로우](https://github.com/user-attachments/assets/ffacb447-6102-45ce-b22c-1fee66008471)

<br />
<br />

## 🗃️ ERD 설계도
![image](https://github.com/user-attachments/assets/dc1f3e07-9a46-44bf-bab6-22daa21da6de)
![image](https://github.com/user-attachments/assets/92c07e93-3e63-4cc0-9c06-e1d9405d1ae8)


<br />
<br />

## 👥 팀원 소개
|                                              [🐈 진명인](https://github.com/myeonginjin)                                               |                                              [🐳 백효석](https://github.com/alexization)                                               |                                               [🌱 심지혜](https://github.com/sapientia1007)                                                |
| :-------------------------------------------------------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------: |
| <a href="https://github.com/myeonginjin"> <img src="https://avatars.githubusercontent.com/myeonginjin" width=200px alt="_"/> </a> | <a href="https://github.com/alexization"> <img src="https://avatars.githubusercontent.com/alexization" width=200px alt="_"/> </a> | <a href="https://github.com/sapientia1007"> <img src="https://avatars.githubusercontent.com/sapientia1007" width=200px alt="_"/> </a> |
|                                                               백엔드                                                                |                                                            백엔드                                                             |                                                              백엔드                                                               |
|                                                 팀원들이 보는 명인은                                                                    |                                                       팀원들이 보는 효석은                                                        |                                                         팀원들이 보는 지혜는                                                        |
| 🕵 이슈의 해결책을 찾아내는 탐구가 <br/> 👩‍💻 맡은 일은 끝까지! 신뢰형 개발자 <br/> 🚨 한번 시작한 일은 끝을 보는 불도저 <br/> 😤 열정 가득, 엉덩이가 무거운 개발자|🤩 CS부터 파고들고 활용하는 개발자<br/>🤔 코드 하나하나 고민하는 찐 개발자<br/>🧹 리펙토링은 나에게, 최적화의 달인<br/>🥘 기본에 충실한 국밥 개발자|🤓 너무 꼼꼼하고 철저한 변태 개발자 <br />📑 문서 정리 끝판왕, 개발 문서 달인 <br/> 😏 꼼꼼함과 효율성을 겸비한 개발자 <br />😁 답답한건 싫은 효율 끝판왕 개발자|

<br />
<br />

## 🔨 작업 및 역할 분담
<div align=center>
  
<<<<<<< HEAD
| 팀원  | 사진 | 역할                                                            |
|-----------------|-----------------|---------------------------------------------------------------|
| 진명인   |  <img src="https://avatars.githubusercontent.com/myeonginjin" alt="진명인" width="100"> | <ul><li>인프라 구축</li><li>페이먼츠 시스템</li><li>금칙어 필터링 시스템</li></ul> |
| 백효석   |  <img src="https://avatars.githubusercontent.com/alexization" alt="백효석" width="100">| <ul><li>인증/인가 시스템</li><li>견적 입찰 시스템</li>                      |
| 심지혜   |  <img src="https://avatars.githubusercontent.com/sapientia1007" alt="심지혜" width="100">    | <ul><li>실시간 채팅 시스템</li><li>실시간 알림 시스템</li></ul>               |
=======
| 팀원  | 사진 | 역할 |
|-----------------|-----------------|-----------------|
| 진명인   |  <img src="https://avatars.githubusercontent.com/myeonginjin" alt="진명인" width="100"> | <ul><li>아키텍처·인프라</li><li>페이먼츠 시스템</li><li>금칙어 필터링 시스템</li></ul>     |
| 백효석   |  <img src="https://avatars.githubusercontent.com/alexization" alt="백효석" width="100">| <ul><li>인증/인가 시스템</li><li>견적 입찰 시스템</li> |
| 심지혜   |  <img src="https://avatars.githubusercontent.com/sapientia1007" alt="심지혜" width="100">    |<ul><li>실시간 채팅 시스템</li><li>검색 시스템</li></ul>  |
>>>>>>> 758eda83ec1d8cddb35096f28375a941b554e667

</div>
<br/> 
<br/>
