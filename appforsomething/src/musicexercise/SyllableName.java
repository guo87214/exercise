package musicexercise;

import java.util.Random;

//��������
public class SyllableName {
	//��������
	 public int stringNum;
	 //����Ʒ��
	 public int capoNum;
	 //��������
	 public char musicalAlphabet;
	 //��������
	 public int doReMi;
	 
	 public static void main(String arg[]) throws InterruptedException {
		 Random ran=new Random(2);
		 for(int i=0;i<10;i++) {
			 System.out.println("�뵯��C�����aС����һ��λ"+(ran.nextInt(6)+1)+"���ϵ���");
			 Thread.sleep(2000);
		 }
	 }
}
