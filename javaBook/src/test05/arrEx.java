package test05;

public class arrEx {

	public static void main(String[] args) {
		//1>���� ���
		int[] score = {55,55,15,89,26,10,89,55,15,89};
		for(int i : score) {
			System.out.print(i+", ");
		}
		System.out.println();
//		int hap=0;
//		
//		for(int i=0;i<score.length;i++) {
//			hap+=score[i];
//		}
//		
//		System.out.println("\n�� : "+hap);
//		System.out.println("��� : "+(hap/score.length));

		
//		//2>�ִ밪 �ּҰ�
//
//		int min=score[0];
//		int max=score[0];
//		
//		for(int i=0;i<score.length;i++) {
//			if(score[i]>max) {
//				max=score[i];
//			}
//			if(score[i]<min) {
//				min=score[i];
//			}
//		}
//		System.out.println("max : "+max);
//		System.out.println("min : "+min);
		
		
//		//3> ����(����)
//		int[] ranBea = new int[score.length];
//		for(int i=0;i<score.length;i++) {
//			int ran = (int)(Math.random()*(score.length-1));
//			ranBea[i]=ran;
//			int tmp=score[i];
//			score[i]=score[ran];
//			score[ran]=tmp;
//		}
//		System.out.print("���� : ");
//		for(int i : score) {
//			System.out.print(i+", ");
//		}
		
		
//		//4> ����
//		for(int i=0;i<score.length;i++) {
//			for(int j=i+1;j<score.length;j++) {
//				if(score[i]<=score[j]) { //<,>,<=,>=
//					int tmp=score[i];
//					score[i]=score[j];
//					score[j]=tmp;
//				}
//			}
//		}
//		for(int i : score) {
//			System.out.println(i);
//		}
		
		
		//5> �� �� ���ϱ�
//		int max=0;
//		int[] printBin;
//
//		for(int i=0;i<score.length;i++) {
//			if(score[i]>max) {
//				max=score[i];
//			}
//		}
//		printBin = new int[max+1];
//		
//		for(int i=0;i<score.length;i++) {
//			printBin[score[i]]++;
//
//		}
//		for(int i=0;i<printBin.length;i++) {
//			if(printBin[i]!=0) {
//				System.out.println(i+"�� ���� "+printBin[i]);
//			}
//		}
		
		
		//6 ������ ������ �迭 ä���
//		int[] ranBea = new int[10];
//		for(int i=0;i<ranBea.length;i++) {
//			ranBea[i]=(int)(Math.random()*50)+1;
//			System.out.println("ranBea["+i+"]"+ranBea[i]);
//		}
		
	}
}
