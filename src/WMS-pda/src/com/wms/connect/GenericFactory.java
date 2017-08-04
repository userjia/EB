package com.wms.connect;

import java.util.ArrayList;
import java.util.List;

import com.wms.entity.Task;

interface Factory<T>{
	T create();
}

class FactoryCreator<T>{
	private T x;
	public <F extends Factory<T>> FactoryCreator(F factory){
		x=factory.create();
	}
	//...
}

class ListFactoryCreator<T>{
	private List<T> list;
	public <F extends Factory<T>> ListFactoryCreator(F factory, int length){
		if(length>0) {
			list=new ArrayList<T>();
			for(int i=0;i<length;i++){
				T y=factory.create();
				list.add(y);
			}
		}else {
			list=null;
		}
	}
}

class TaskListFactory implements Factory<Task>{
	public Task create() {
		return new Task();
	}
}

public class GenericFactory() {
	public static void main(String[] args) {
		new ListFactoryCreator<Task>(new TaskListFactory());
	}
}

