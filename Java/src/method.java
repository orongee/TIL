public class method {
	public static void func() {
		System.out.println("�Լ� �����Դϴ� ^��^");
	}
	
	public static void methodExam(int limit) {
		int i = 0;
		while (i< limit) {
			System.out.println(i);
			i++;
		}
	}
	
	public static String methodReturn(int arg1, int arg2) {
		// void �� �ƴ� String ������ ���� ������?
		// �޼ҵ尡 return���� �ִٸ� �ش� return���� � ������ Ÿ���� �� ������ �������� ��. �ش� �޼ҵ�� string���� �����ϱ� ������ String�� ���� ��. 
		int a = arg1;
		int b = arg2;
		String output = "";
		//�� String�� ������?
		
		while(a<b) {
			output = output + a;
			a++;
		}
		
		return output;
		// return ���� String�� ��������?
		
	}
	
	public static int one() {
		return 1;
//		return 2;
//		return 3;
	}
	
	public static String[] getVixx() {
		String[] vixx = {"���п�","���ÿ�","����ȯ","�����","��ȫ��","�ѻ���"};
		
		return vixx;
	}
	
	
	public static void main(String[] args) {
		// return���� ���� ��쿡 void�� ����. 
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
