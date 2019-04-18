### 메소드

코드를 재사용하기 위한 함수. 

```java
public static void func(){
	// 함수를 정의함.
	System.out.println("이것은 함수함수함수함수");
}
public static void main(String[] args){
	func();
	// 앞서 정의한 함수를 호출함.
}

//  => 이것은 함수함수함수함수
```

먼저 `func()`이라는 함수를 정의하고 `main()`함수를 통해 정의한 함수를 호출한다. 반드시 main 안에 호출해야함!


- **매개변수**

매개변수로 인자값을 입력받아서 제어된 결과를 출력할 수 있음.

- **return**

메소드를 통해 반환시킬 값을 `return` 뒤에 적으면 됨. return을 만나면 구문은 종료된다.

```java
public static int one() {
		return 1;
		return 2;
		return 3;
}

// 리턴값은 중복이 불가함. 첫번째 리턴을 만나면 다음 리턴값은 도달못함. 아예 컴파일 안됨.
```

만약 메소드에 리턴값이 있다면 해당 리턴값이 어떤 데이터 타입인지 일일히 명시해줘야함. 리턴값이 없다면 `void`를 씀.

```java

public static int paraExam(int arg1, int arg2){
// 매개변수와 인자는 복수로도 입력 받을 수 있다.
// output을 리턴하기 때문에 int라는 데이터 타입을 명시해줌.


	int i = arg1;
	int j = arg2;
	int output = 0;

	while(i<j){
		output += i;
		i++;
	}

	return output;
}

public static void main(String[] arg){
// 리턴값이 없기 때문에 void
	paraExam(1,10);
	// 인자값으로 1과 10을 입력
}

```

배열 등을 사용해서 복수의 리턴값을 받을 수도 있다.


- **main(String[] args)**

`args`라는 이름의 문자형 타입을 가진 배열을 매개변수로 쓴다는 의미임.

```java
public static void main(String[] args){
	System.out.println(args.length);
}

// 결과값은 1 2 3 4 5 6;
```
