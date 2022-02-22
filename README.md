# java-lotto

로또 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 🎱 구현해야 하는 기능

### 📌 구입 금액
- [ ] 구입 금액을 입력한다.
  - [ ] (예외) 숫자가 아닐 경우 `Illegalargumentexception` 에러를 발생시킨다.
  - [ ] (예외) 양수가 아닐 경우 `Illegalargumentexception` 에러를 발생시킨다.
  - [ ] (예외) 1,000원 단위로 나뉘지 않을 경우 `Illegalargumentexception` 에러를 발생시킨다.

### 📌 로또 구매
- [ ] 몇 개가 구매가능한지 출력한다.
- [ ] 살 수 있는 만큼 로또들을 생성한다.
  - [ ] 숫자 6개를 생성하여 로또를 생성한다.
    - [ ] 1~45의 랜덤 숫자를 생성한다.
        - [ ] (예외) 숫자가 아닐 경우 `Illegalargumentexception` 에러를 발생시킨다.
        - [ ] (예외) 양수가 아닐 경우 `Illegalargumentexception` 에러를 발생시킨다.

### 📌 지난주 로또 번호
- [ ] 지난 주 당첨 번호 6개를 생성한다.
- [ ] 보너스볼 1개를 생성한다.

### 📌 통계
- [ ] 지난 주 당첨 번호와 구매한 로또들이 몇 개 일치하는지 확인한다.
  - [ ] 5개가 일치할 경우 보너스볼이 일치하는지 확인한다.
- [ ] 등수 별로 일치하는 개수를 출력한다.
- [ ] 총 수익률을 계산한다.