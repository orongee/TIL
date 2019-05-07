# 자바 시작하기

## 메소드

특정 기능의 처리를 해주는 코드들의 집합임. 
기본적으로는 데이터를 입력 받아 처리하고 결과값을 돌려줌. (때에 따라 입력값이나 결과값이 없을 수도 있음.)

```java
// 메소드명도 소문자로 하는 것이 관례임
// 입력값으로 받는 매겨변수를 정의
리턴타입 메소드명 ((데이터타입 변수명1,데이터타입 변수명2,...))
// 매개변수는 지역변수. 입력값을 받기 위해 메소드 내에서 변수를 지정해줌
{
	// 코드 ~~
	// return 값;
}
 
```
#### return
- 값을 반환
- 메소드를 종료시킴


#### void
값을 반환하지 않을 경우 리턴타입 대신`void` 쓴다.

```java
void power(){
	power = !power;
}
```

#### static
 프로그램 시작시에 메모리에 로드함.
 main메소드는 반드시 실행해야 하기 때문에 메인메소드에 반드시 포함되는거임.
 

#### main 메소드 

메소드의 호출을 하는 메인 메소드.

```java
public static void main(String[] args){}
```


## 객체지향언어

클래스와 인스턴스
#### 클래스 
객체를

인스턴스는 메모리에 올려놓고 사용하는 거임. 클래스인 객체를 생성하면 메모리에 추가가 되는 거겠지?

클래스를 생성한 후 메모리에 올려놓는 작업을 인스턴스화 / 
```java
클래스 변수이름 = new 클래스();
// 클래스의 인스턴스화
```
생성된 클래스를 main 메소드에서 호출시켜 사용하면 클래스참조변수.메소드or 클래스참조변수.변수이름 등으로 사용 가능함.


<!--stackedit_data:
eyJoaXN0b3J5IjpbLTIwNjYxNTA5MTQsLTE3OTUyNTYzMTQsMj
AyODYwMjIsLTIxNDAyNjAyOTYsLTE1MDE2ODU1MTYsLTE0Mzg2
MzU0NTAsMTg2NzgwNjIwMSw2Mjg2NzI0MTgsLTI0MzcxMTcyNl
19
-->