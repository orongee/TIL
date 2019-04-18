public class method {
	public static void func() {
		System.out.println("함수 예제입니다 ^ㅁ^");
	}
	
	public static void methodExam(int limit) {
		int i = 0;
		while (i< limit) {
			System.out.println(i);
			i++;
		}
	}
	
	public static String methodReturn(int arg1, int arg2) {
		// void 가 아닌 String 구문을 쓰는 이유는?
		// 메소드가 return값이 있다면 해당 return값이 어떤 데이터 타입인 지 일일히 명시해줘야 함. 해당 메소드는 string값을 리턴하기 때문에 String을 쓰는 거. 
		int a = arg1;
		int b = arg2;
		String output = "";
		//왜 String을 쓰는지?
		
		while(a<b) {
			output = output + a;
			a++;
		}
		
		return output;
		// return 값은 String만 가능한지?
		
	}
	
	public static int one() {
		return 1;
//		return 2;
//		return 3;
	}
	
	public static String[] getVixx() {
		String[] vixx = {"차학연","정택운","이재환","김원식","이홍빈","한상혁"};
		
		return vixx;
	}
	
	
	public static void main(String[] args) {
		// return값이 없을 경우에 void를 쓴다. 
//		func();
		
//		methodExam(6);
		
		
//		methodReturn(0,2);
		
		String[] members = getVixx();
		for(int b=0;b<members.length;b++) {
			System.out.println(members[b]);
		}
		
		System.out.println(one());
		
	}
	
}
