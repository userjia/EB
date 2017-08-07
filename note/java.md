### java运行 ###
* java 控制台运行注意
javac Test.java 编译
java Test.class 运行

* main 是静态的，它直接引用的方法也应该是静态的,否则
ERROR:java non-static variable this cannot be referenced from a static context 

### 代码细节 ###
* java 数组length是属性，不是方法，后面没有括号

### 一些方法 ###
java获取程序执行时间

`long startTime=System.nanoTime(); //纳秒   

long startTime=System.currentTimeMillis(); //毫秒  //获取开始时间   

doSomeThing();  //测试的代码段   

long endTime=System.currentTimeMillis(); //获取结束时间`  

### 算法 ###
* 各常见排序算法http://www.cnblogs.com/eniac12/p/5329396.html

### 原理
#### 转型
1. 父类引用指向子类对象，而子类引用不能指向父类对象。   
2. 把子类对象直接赋给父类引用叫upcasting向上转型，向上转型不用强制转换。  
      如：Father f1 = new Son();   
3. 把指向子类对象的父类引用赋给子类引用叫向下转型(downcasting)，要强制转换。   
   如：f1 就是一个指向子类对象的父类引用。把f1赋给子类引用s1即 Son s1 = (Son)f1；  
      其中f1前面的(Son)必须加上，进行强制转换。  
      
?静态，动态绑定的转型

#### 泛型
泛型三种：
          [1]ArrayList<T> al=new ArrayList<T>();指定集合元素只能是T类型   
          [2]ArrayList<?> al=new ArrayList<?>();集合元素可以是任意类型，这种没有意义，一般是方法中，只是为了说明用法    
          [3]ArrayList<? extends E> al=new ArrayList<? extends E>();   
泛型的限定：   
          ? extends E:接收E类型或者E的子类型。   
          ？super E:接收E类型或者E的父类型。







