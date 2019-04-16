### 배열

```java
데이터타입[] 변수명 = new 데이터타입[배열크기];

배열이름[인덱스]

int[] arrayNum = new int[5];
// 미리 배열의 크기를 지정할 때 `new`키워드를 사용한다.

arrayNum[0] = 10;
arrayNum[1] = 20;
arrayNum[2] = 30;
arrayNum[3] = 40;

```

**for-each**

배열의 반복문을 간략하게 쓸 수 있음.

```java
for(String e : 배열명)
// 배열의 값들을 변수e 속에 하나하나 반복해서 담는다.

// ex)

String[] foods = {"coffee","sandwich","macaron","bread"};	
		
	// for (int i = 0; i<foods.length;i++) {
	//	 String food = foods[i];
	//	 System.out.println(food + "를(을) 냠냠 쩝쩝~~!");
	// }
		
	for (String food:foods) {
		System.out.println(food+" 를(을) 냠냠쓰";
	}
```

그런데 자바스크립트와 달리 자바에서는 배열의 크기를 먼저 선언하고 나면 그 크기 이상으로 값을 넣을 수가 없음. 유연하지 않다는 소리. 만약 존재하지 않는 인덱스의 값을 지정하려고 한다면?

`Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4` 라는 에러문구가 뜰 것임. 이것을 해결하기 위해 `Collection`이라는 기능을 사용하면 된다.