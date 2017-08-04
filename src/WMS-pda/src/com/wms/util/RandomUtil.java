package com.wms.util;

public class RandomUtil {
	/*public RandomUtil(){
		random = new Random();//When active this?//Can this make many same result?
	}*/
	
	//ATTENTION the top is not include in this way
	public static int getRandomInt(int down, int top) {
		//return random.nextInt(top-down)+down;
		int result = new Double(Math.random()*(top-down)).intValue()+down;
		return result;
	}
	
	
	public static char getRandomChar(){
		int down = 33;
		int up = 126;
		return (char)getRandomInt(down, up+1);
	}
	
	public static char getRandomChar2(){
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
	
	//TODO how to generate custom specific IDs
	public static String getRandomString(int length) {
		char[] temp = new char[length];
		for(int i = 0; i <= length-1; i++){
			 temp[i]=getRandomChar();//BUG happened, array fill out 
		}
		String result = new String(temp);
		return result; 
	}
	
	public static String getRandomString2(int length){//powerful StringBuffer to append
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i<length;i++){
			buffer.append(getRandomChar());
		}
		return buffer.toString();
	}
	
		
	public static String getRandomString3(int length){
		if(length<=0){
			return "";
		}
		StringBuilder randomString=new StringBuilder();
		while(length>0){
			randomString.append(getRandomChar());
			length--;
		}
		return randomString.toString();
	}
	
	public static double getRandomDouble(double down, double top) {
		return Math.random()*(top-down)+down;
	}
}