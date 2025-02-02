# Movie-App
LG CNS AM inpsire camp에서 진행한 두번째 개인 프로젝트입니다.
DB에서 영화 정보를 불러와 목록으로 표시하고, 상세 정보를 수정 및 삭제할 수 있습니다.


## 페이지별 소개
1. 전체 목록 조회

   - Endpoint: /movie/home
   - 애플리케이션 실행 시 기본으로 저장되어 있는 영화 정보를 불러옵니다.
   - 추가하고 싶은 영화의 정보를 입력하고 '영화 등록'버튼을 눌러 영화를 목록에 추가합니다.
   - 영화 선택 시 영화 상세 페이지로 전환됩니다.


   <img width="1093" alt="image" src="https://github.com/user-attachments/assets/cf76031b-205e-4f35-8469-065f32663ebc" />

2. 영화 상세 조회
   - Endpoint: /movie/{id}
   - 영화 상세 정보를 조회합니다.
   - Edit 버튼을 클릭하여 영화 정보를 수정하는 페이지로 전환합니다.
   - Delete 버튼을 클릭하면 즉시 영화 정보가 삭제됩니다.
<br><br/>
   <img width="1138" alt="image" src="https://github.com/user-attachments/assets/a56586db-a0b1-419e-a52a-1f63950c1023" />


3. 영화 수정
   - Endpoint: /movie/update/{id}
   - 영화 정보를 수정합니다.
  <br><br/>
     <img width="835" alt="image" src="https://github.com/user-attachments/assets/2bce58bf-0a62-42ae-856b-d47693954602" />

