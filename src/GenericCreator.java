//模板方法
public abstract class GenericWithCreate<T>{
	final T element;
	abstract T create();
	GenericWithCreate(){
		element=create();
	}
}
  
class Task{}  
  
class TaskCreator extends GenericWithCreate<Task>{
  Task create() {
    return new Task();
  }
}

public class GenericCreator{
  TaskCreator t=new TaskCreator;
}
