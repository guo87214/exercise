package musicexercise;

import java.util.Random;

//吉他唱名
public class SyllableName {
	//所属琴弦
	 public int stringNum;
	 //所属品柱
	 public int capoNum;
	 //所属音名
	 public char musicalAlphabet;
	 //基本唱名
	 public int doReMi;
	 
	 public static void main(String arg[]) throws InterruptedException {
		 Random ran=new Random(2);
		 for(int i=0;i<10;i++) {
			 System.out.println("请弹出C大调和a小调第一把位"+(ran.nextInt(6)+1)+"弦上的音");
			 Thread.sleep(2000);
		 }
	 }
}
