import java.util.*;
public class RandomUtil{
	
	public static String getRandomString(int lenth){
		if(lenth<=0){
			return "";
		}
		StringBuilder randomString=new StringBuilder();
		while(lenth>0){
			randomString.append(getRandomChar());
			lenth--;
		}
		return randomString.toString();
	}
	
	public static char getRandomChar(){
		final int intDown = 48;
		int intUp = 57;
		int UpperWorddown = 65;
		int UpperWordup = 90;	
		int LowerWorddown = 97;
		int LowerWordup = 122;	
		int random=(int)(Math.random()*62);
		if(random>=10&&random<36){
			random+=55;
		}else if(random>=36&&random<62){
			random+=61;
		}else{
			random+=48;
		}
		
		return (char)random;
	}
	
	public static String BubbleSort(String seralize){
		char[] tempChar=seralize.toCharArray();
		int lenth=tempChar.length-1;
		char c;
		boolean b;
		do{
		b=false;
		for(int i=0;i<lenth;i++){
			if(tempChar[i]>tempChar[i+1]){
				b=true;
				c=tempChar[i];
				tempChar[i]=tempChar[i+1];
				tempChar[i+1]=c;
			}
		}
		lenth--;
		}while(lenth>1||b==true);
		return new String(tempChar);
	}
	
	public static void QuickSort(char[] cArray, int start, int end){
		int standNum=start;
		int i;
		for ( i=start+1;i<end;i++)//choose the first element 0 to be stand
		{
			char c;
			if(cArray[i]<cArray[standNum]&&standNum<i){
				c=cArray[i];
				cArray[i]=cArray[standNum];
				cArray[standNum]=c;
				standNum=i;
			}
		}
		if(standNum>1){
			QuickSort(cArray, 0, standNum);
		}
		if(standNum<end-2){
			QuickSort(cArray, standNum+1, end);
		}
		
	}
	
	public static void main(String[] args){
		int lenth = 100;
		String str = getRandomString((int)(Math.random()*lenth)+1);
		char[] cArray=str.toCharArray();
		int end=cArray.length;
		System.out.println(BubbleSort(str))
		QuickSort(cArray,0,end);
		System.out.println(new String(cArray));
	}
	
}
