package com.wms.connect;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.wms.util.*;
import com.wms.entity.*;

public class testData {
	private List<Task> taskList;
	public List<Task> getTaskList(int length){
		if(length>0){
			taskList=new LinkedList<Task>();
			for(int i=0;i<length;i++){
				Task t=new Task(RandomUtil.getRandomInt(0,99999),RandomUtil.getRandomString3(7),new Date(),new Date());
				taskList.add(t);
			}
		}
		return taskList;
	}
	
	
	//据说可以根据返回值确定T，使用时如List<String> ls=getList();
	

}
