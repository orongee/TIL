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
스코프가 프로그램 실행 시부터 종료 시까지 유지됨. 가상머신이 로드할 때 가장 처음으로 읽고 선언함.

 

#### main 메소드 

메소드의 호출을 하는 메인 메소드.

```java
public static void main(String[] args){}
```


## 객체 지향

#### 클래스 
객체를 **정의**해놓은 상태. 객체를 생성하기 위해 사용됨.

#### 객체 인스턴스
실제로 **생성**해놓은 클래스. 속성(변수)과 기능(메소드)의 집합. 
객체의 속성은 = 멤버 변수, 기능은 = 멤버 메소드 라고도 함.
하나의 클래스를 통해 여러 개의 객체를 만들 수 있고 객체 하나를 여러개의 변수에 참조시킬 수도 있음.

```java
class First{
}

First f1rst = new First();
// Class의이름 변수이름 = new Class이름();
// 변수이름에 new를 통해 생성한 인스턴스의 주소값(객체 자신 ㄴㄴ)을 저장하는 거임. 참조변수. Class 변수는 4byte의 메모리를 저장해둠.
// 이걸 클래스의 인스턴스화라고함.
```
생성된 클래스를 `main` 메소드에서 호출시켜 사용하면 `클래스참조변수.메소드()`or `클래스참조변수.변수` 등으로 사용 가능함.

*ex) 인스턴스 생성과 변수와 메소드 참조 예시*

```java
// Number.java
// 변수와 메소드만 정의하는 클래스.
package classtest;
public class Number{
	int num; // 인스턴스 초기화. 자동으로 0이 대입됨.
	
	void addNum(int n){
		num = num+n;
	}
	int getNum(){
		return num;
	}
}

//InstanceMain.java
package classtest;

public class InstanceMain {
	public static void main(String[] args){
		// 인스턴스 생성
		Number nInst = new Number();
		
		// 인스턴스를 생성만 하고 호출하지 않은 상태
		System.out.println("인스턴스의 메소드 호출 전 : num의 값  = "+nInst.num);
		// 결과는 0
		System.out.println("인스턴스의 메소드 호출 전 : num의 값  = "+nInst.getNum());
		// 결과는 0

		// nInst 참조변수를 전달받아 addNum()이라는 메소드를 호출시킴.
		// 메소드 선언부에서 10이라는 값을 전달했으므로 현재 num은 10.
		simpleMethod(nInst);
		
		System.out.println("인스턴스의 addNum 메소드를 실행 후 : num의 값  = "+nInst.getNum());
		// 결과는 10

		static void simpleMethod(Number number){
			number.addNum(10);
		}		
	}
}

```

#### 변수 & 메소드


- 클래스변수 
	`static`키워드와 같이 사용하면 클래스 변수가 됨. 인스턴스의 생성 없이도 프로그램이 실행하면 바로 변수가 선언된다. 프로그램 종료가 될 때까지 유지됨. 변수 이름이 중복되면 안됨.
	`public` 으로 선언될 경우 어디서든 누구나 접근 가능함.
	= 공유변수

- 인스턴스 변수
	인스턴스 생성 시에 선언되는 변수. `참조변수.인스턴스변수명`를 통해서 접근한다.
	참조변수가 없으면 자동으로 제거됨.
	```java
	class Tv{
		int channel;
	}
	Tv t1 = new Tv();
	Tv t2 = new Tv();
	t2 = t1;
	// t2는 t1의 주소값으로 대치됨.
	// t2가 원래 가르키고 있던 주소값이 가지고 있던 인스턴스 변수는 사라짐.
	```

- 지역변수
	메소드 내에서 선언된 변수로 블럭 문 안에서만 유지됨. 메소드가 호출되지 않으면 변수도 선언되지 않음.

<!--stackedit_data:
eyJoaXN0b3J5IjpbMjUwNTg1MDAyLC0xMDc4ODU1MDQ4LC0xMj
k0NjkyNTE2LC0xNzkyODg3Mjg3LC0xMzgzMDEyMjYzLC01MjA5
NTg0NDcsMTIyOTE3NDUwNywtMTM3MzQ5NjE3NCwtODYxNjQ0OT
U2LDcxNDMzODYwMCw5Nzc1NzkzOTUsMjYwMjQ4MDkzLDEwMDM4
MTYwNTUsMjAzNjM5NzE4MSwxOTI2MjQ2OTUwLDM4MTE4MzcyNF
19
-->