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

<!--stackedit_data:
eyJoaXN0b3J5IjpbLTE0Mzg2MzU0NTAsMTg2NzgwNjIwMSw2Mj
g2NzI0MTgsLTI0MzcxMTcyNl19
-->