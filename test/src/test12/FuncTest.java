package test12;

public class FuncTest {
	public void printLoop(int start, int end) {
		for(int i=start;i<=end;i++) {
			System.out.println(i);
		}
	}
	
	public void printReverse(int start,int end) {
		for(int i=start;i>=end;i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		FuncTest ft = new FuncTest();
//		(new FuncTest()).printLoop(1, 10);
//		ft.printLoop(3, 12);
//		ft.printLoop(100, 120);
		ft.printReverse(55, 5);
	}

}
