## 기본 문법

### 주석

**<구현 주석>**
```java
// ... 행 단위 주석, 한 줄 주석
/* ... */  블럭 단위 주석, 여러 줄 주석
```
> 단축키는 `ctrl+/` 

**<문서화 주석>**

말 그대로 문서를 위해 쓰는 주석. 클래스, 인터페이스 등 하나만 작성이 가능하다함.
```java
/**
* 내용 
* 작성
*/ 

// 예시 ex)
public class AddNum {
   /**
   * This method is used to add two integers. This is
   * a the simplest form of a class method, just to
   * show the usage of various javadoc Tags.
   * @param numA This is the first paramter to addNum method
   * @param numB  This is the second parameter to addNum method
   * @return int This returns sum of numA and numB.
   */
   public int addNum(int numA, int numB) {
      return numA + numB;
   }
```

### 변수
자바는 강형 언어. 강형 언어란 데이터 값이 컴파일 후에 저장되는 언어를 뜻함. 

**변수**

변수를 선언할 때는 **데이터 타입명과 변수이름**을 같이 선언 해야한다. 만약 데이터 타입과 변수값이 불일치 할 경우엔 에러가 뜬다.

- 변수명의 첫번째 글자는 소문자여야함. 
- camelCase 기법을 준수한다.  '_'는 안 씀.

```java
int count; // '정수' 데이터 값을 가지고 있는 count 변수명 선언.
double avg; // '실수' 데이터 값을 가지고 있는 avg 변수명 선언.

count = 20;
avg = 1.2;

count = 2.5 
// => 2.5는 정수가 아니기 때문에 에러남!

int countNum = 30;
// 여러 단어로 이어진 명을 쓰고 싶다면 camelCase를 이용한다.

```

**상수**

상수는 절대 변하지 않는 값. 일반 변수와 달리 값을 새로 업데이트 시킬수 X. 상수를 선언할 땐 앞에 `final`을 붙여준다. 

 - 상수명은 모두 대문자로 적는 것이 관례. 
- camelCase가 아닌 '_'로 이어주면 된다.

```java
final double PI;
PI = 3.14159;

final int BAR_NUM = 20;
```

### 데이터 타입

자바는 반드시 변수명을 사용하기 위해 항상 데이터 타입을 명시해줘야함. 그리고 각각의 데이터 타입마다 크기와 표현 범위가 또 달라진다는 사실. 

**기본형 데이터 타입**

1. 정수형

정수를 표현하는 데이터 타입이며, 정수의 표현 범위가 다양하므로 여러 가지로 나눠 표현 가능.

- int

가장 많이 사용하는 정수형 데이터 타입으로 4byte의 값을 가짐. 연산할 때 기본적으로 `int`형으로 바꿔 연산한다. 기본형. 
```java
int x = 59;
```

- long 

int보다 더 큰 범위를 표현하고 싶을 때 사용한다. `long`은 8byte 값을 가짐.
```java
long big = 12345678L;
// long에 값을 적을 때 뒤에 소문자 l 혹은 대문자 L을 적어야 함.
// 접미사 L이 없으면 정수의 기본형인 int 타입으로 인식함.
```
2. 실수형

실수를 표현하는 데이터 타입. `float`와 `double` 이 있음.

`float`는 4byte, `double`은 8byte 값을 가지며, double이 더 큰 범위임!
```java
float a = 1.7538f;
// float 에 값을 대입할 때는 실수 뒤에 소문자 f 혹은 대문자 F를 붙여야 함.
double b = 32.2;
```
4. 문자형

문자는 `char` 하나 뿐임. 2byte의 값을 가지며, 딱 한 글자! `'` 싱글 쿼터를 이용해 딱 한 글자를 표현할 수 있다. 유니코드로 표현 or 그에 상응하는 숫자로 표현한다.
```java
char aa = 'a';
```
5. 논리형(boolean)

논리형은 리터럴 값이 `true` 혹은 `false` 딱 두 개다. 크기는 1byte. 기본값은 `false`
```java
boolean isFun;
isFun = true; // or false
```

**형변환**

앞서 지정한 변수의 데이터 타입을 다른 데이터 타입으로 변환해줄 수 있다. 이것을 형변환이라고 함. 

```java
// 다른 데이터 타입 값을 가지는 변수에 대입시켜 형을 변환시킬 수 있다.

int x = 50000;
long y = x; // ok

long x2 = 5;
int y2 = x2; // Error!

```
but,,, 반대로 `long`에서 `int`로 변환시키는 것은 다름. 왜냐면 타입별로 크기가 다른데 long이 int보다 표현 범위가 더 크기 때문임. 이럴 경우엔 타입을 명시적으로 적어줘야 한다.

```java
long x2 = 5;
int y2 = (int) x2;

// 이걸 강제 형변환이라고 함.
```


> 타입별 크기 순 : byte < short, char < int < long < float < double


### 연산자

**1) 산술 연산자**

- 산술 연산자
`+``-``*``/`
`%` : 나머지 값을 나타냄.
- 부호 연산자
`+` 와 `-`
- 대입 연산자
`=`
- 증감 연산자
`++` `--`

```java
public class operatorExam {

	public static void main(String[] args) {
	
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1); //-5
		System.out.println(i2); //-5
		System.out.println(i3); //5
		
		int i4 = ++i3;
		
		System.out.println(i4); //6
		System.out.println(i3); //6

		int i5 = i3++;
		
		System.out.println(i5);	//6
		System.out.println(i3);	//7
		
		int i6 = 3 % 2;
		
		System.out.println(i6); //1
	
	}

}
```

- 단항 연산자
피연산자(리터럴)가 하나인 연산자를 단항 연산자라고 함.
`부호연산자`와 `증감연산자`가 있음.

- 이항 연산자
피연산자 하나로 연산할 수 없는 연산자를 이항 연산자라고 함.

**2) 비교 연산자**

비교 연산자의 값은 `boolean`으로 나타남
```
// 단순 대입 연산자
a == b // 같다
a != b // 같지 않다
a < b 
a > b
a <= b
a >= b

// 복합 대입 연산자
a += 10 // a = a + 10;
b -= 5 // b = b - 5;
```
**3) 논리 연산자**

- `&&` 
논리곱을 의미함. (and) 
a 와 b 가 **모두 true**일 경우에 값이 `true`!

- `||` 
논리합. (or)
a 와 b **둘 중 하나가 true**일 경우 값이 `true` 

- `!` 
논리 부정. 연산값을 **반대로** 바꾼다.
`true` = `false`
`false` = `true`

- `^`
배타적 논리 합. 
a 와 b 가 **서로 다른 값**일 경우 `true`, **같은 값**을 가지면 `false`

### 조건문

#### 1) if문

조건식의 결과가 `true`일 경우 실행됨. 
if문 안에 if문을 중첩으로 사용할 수도 있다는 사실!

- **if문**
```java
if(조건식)
	실행문; // if문 안에 실행문이 하나일 경우, {}블럭은 생략 가능하다.

if(조건식){
	실행문;
	실행문;
}
```

- **if - else문**

조건식이 `true`면 if 블록, `false`면 else 블록이 실행됨.
```java
if(조건식){
	실행문;
	실행문;
} else { 
	실행문;
}
```

- **if - else if - else문**

else if문의 갯수는 상관 없지만 너무 많이 쓰면 속도 저하를 일으킴. 마지막 else블록은 생략 가능.
```java
int a = 10;
int b = 11;
int c = 12;

if(c<b){
	System.out.println(1);
} else if (c<a){
	System.out.println(2);
} else {
	System.out.println(3);
}
// => 3
```

- **삼항 연산자**

if - else 문을 간략하게 삼항 연산자로 대체할 수 있음. 조건식이 참이라면 값 1이, 거짓이라면 값 2가 반환된다. 
```java
// 조건식 ? 값1 :  값2;

// ex)
int a = 10;
int b = 11;

int c = (a > b) ? 20 : 30;
System.out.println(c);
// => 30
```

#### 2) switch문

if문 대신에 좀 더 명료하게 쓸 수 있다. 대신 switch의 조건식으로 사용할 수 있는 데이터 타입은 한정적임. 그렇기 때문에 논리 연산자 등은 사용이 불가함 ㅠ

> 사용가능 : byte, short, char, int, enum, String, Character, Byte, Short, Integer

```java
int value = 4;

switch(value){
	case 1:
		실행문1;
		break;
	case 2:
		실행문2;
		break;
	case 3:
		실행문3;
		break;
	// 마지막 case는 명시하지 않고 default를 쓴다. else 와 같음
	default:
		실행문4;
}
```
!`break`를 만나면 다음 실행문을 무시하고 바로 그 자리에서 빠져나옴.

### 반복문

#### 1) for문

```java
for(초기값;조건식;증감식){
	실행문;
}

// ex)
int total = 0;
for( int i = 1; i <= 10; i++){
	if(i%2 != 0){
		continue;
		// continue를 만나면 구문실행 ㄴㄴ 지나치고 위로 다시 올라감.
	}
	total = total + i;
}
System.out.println(total);
```
#### 2) while문

조건이 true일 경우 실행문을 계속 반복함. 무한 루프에 빠지지 않도록 주의해야함.
```java
while(조건){
	반복 실행문;
}

// ex)
int i = 0;
while ( i < 3 ) {
	System.out.println(i);
	i++;
}
// => 0 1 2
```
#### 3) do while문

실행문이 조건 상관없이 무조건 먼저 한번 실행. 
```java
do{
// 반복 실행문;
} while(조건)
```
<!--stackedit_data:
eyJoaXN0b3J5IjpbMTc0NjQxNjEzMl19
-->