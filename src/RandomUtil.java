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
	
	public static void main(String[] args){
		int lenth = 100;
		String str = getRandomString((int)(Math.random()*lenth)+1);
		System.out.println(str);
	}
	
}
