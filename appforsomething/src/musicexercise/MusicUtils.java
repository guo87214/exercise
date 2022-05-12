package musicexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//音乐体系中相关常数
public class MusicUtils {
	//基本唱名组合
	public static final int [] doReMis= {1,2,3,4,5,6,7};
	//音名组合
	public static final char musicalAlphabels[]= {'C','D','E','F','G','A','B','C'};
	//琴弦序号组合
	public static final int strings[]= {1,2,3,4,5,6};
	//品柱序号组合
	public static final int[] getCapos(){
		int[] capoArray=new int[25];
		for(int i=0;i<25;i++) {
			capoArray[i]=i;
		}
		return capoArray;
	}
}
