package musicexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//������ϵ����س���
public class MusicUtils {
	//�����������
	public static final int [] doReMis= {1,2,3,4,5,6,7};
	//�������
	public static final char musicalAlphabels[]= {'C','D','E','F','G','A','B','C'};
	//����������
	public static final int strings[]= {1,2,3,4,5,6};
	//Ʒ��������
	public static final int[] getCapos(){
		int[] capoArray=new int[25];
		for(int i=0;i<25;i++) {
			capoArray[i]=i;
		}
		return capoArray;
	}
}
