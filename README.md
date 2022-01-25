# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

---

# 문자열 계산기
## 기능 요구 사항
- [x] 입력받은 문자열에 따라 사칙 연산(-, +, /, *)을 수행할 수 있다. - `Calculator`
  - [x] 입력값을 숫자와 부호로 나누는 함수 - `Calculator`.splitInput
- [x] 사용자의 입력을 받는다.
  - [x] 오류 검증
    - [x] 입력값이 `null`, 공백일 경우 `IllegalArgumentException`
    - [x] 사칙 연산 기호가 아닌 경우 `IllegalArgumentException`
- [x] 계산된 결과값을 최종적으로 출력한다.
- [x] 계산기를 계속 실행할지 종료할지를 사용자 입력값에 따라 결정

---

# 자동차 경주
## 기능 요구 사항
- [x] n대의 자동차를 생성할 수 있다.
  - [x] 사용자 입력값에서 쉼표를 기준으로 자동차를 구분한다.
  - [x] 각 자동차의 이름은 5자 이하
  - [x] 자동차 이름은 중복될 수 없음
- [x] 몇 번의 이동을 할 것인지 사용자에게 입력받는다.
  - [x] 1 ~ 9회까지만 이동할 수 있다.
- [x] 각 자동차는 전진 또는 멈출 수 있다.
  - [x] 0 ~ 9 사이의 랜덤값을 각 자동차 별로 구할 수 있다.
    - [x] 4이상은 전진, 4미만은 멈춤
- [X] 최종적으로 가장 많이 전진한 자동차가 우승한다.
  - [x] 우승자는 여러명일 수 있다.
  - [x] 만약 모든 자동차가 한번도 전진하지 못했다면 우승자는 없다.
- [x] 각 이동마다 현재의 자동차 상태를 출력한다.
  - [x] 자동차의 이름도 함께 출력한다.