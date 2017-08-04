package com.wms.util;
import java.util.*;
import java.text.*;

public class DateUtil {
	public static String getStringDate(){//specify format
		Date now = new Date();
		SimpleDateFormat form = new SimpleDateFormat("E yyyy.MM.dd hh:mm:ss a zzz");//check out the chart to known what is them.
		return form.format(now);
	}
	
	public static Date getDateFromString(String str) throws ParseException{//this can use printf to format the output
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
		try{
			return form.parse(str);
		}catch(ParseException e){
			//parse error
			throw e;
		}
	}
}
