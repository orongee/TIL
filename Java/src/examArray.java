
public class examArray {
	public static void main(String[] args) {
		String[] foods = {"coffee","sandwich","macaron","bread"};	
//		int[] arrayNum = new int[5];
//		arrayNum[0] = 10;
//		arrayNum[1] = 20;
//		arrayNum[2] = 30;
//		arrayNum[3] = 40;	
		
//		System.out.println(arrayNum[4]);
		
		for (int i = 0; i<foods.length;i++) {
			String food = foods[i];
			System.out.println(food + "¸¦(À») ³È³È ÂÁÂÁ~~!");
		}
		
		foods[4] ="pickle";
		for (String food:foods) {			
			System.out.println(food+" ÀÌ°Íµµ ³È³È¾²");
		}
		
		
		
	}
}
