# 장바구니 기능 구현하기

---

- HashSet을 사용해 상품 목록을 만들고, HashMap을 사용해 장바구니에 상품을 담는다.

## 구현 클래스
- 상품
  - 상품의 key, 이름, 가격을 필드로 갖는다.
- 장바구니 : 두개 이상의 상품을 다음ㄹ 수 있어야 된다. (ex. 우유 2개, 화장지 3개)
  - items을 갖는다.
- 다음과 같은 함수를 갖어야 한다.
  - showItems()
  - addProduct()
  - removeProduct()

## 기능 제공 목록
1. 상품을 입력하여 상품 목록을 구성한다.
2. 장바구니에 상품을 담는다. (이때 상품을 몇 개 담을 것인지 명시되어야 함, ex. 우유 2개 담기, 사과 1개 담기)
3. 장바구니에서 상품을 제거한다. (이때 몇 개의 상품을 뺄 것인지 명시되어야 함, ex. 우유 1개 빼기)
4. 장바구니에 담겨있는 상품들의 이름과 수량을 출력
