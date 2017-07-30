###java运行###
* java 控制台运行注意
javac Test.java 编译
java Test.class 运行

* main 是静态的，它直接引用的方法也应该是静态的,否则
ERROR:java non-static variable this cannot be referenced from a static context 

###代码细节###
* java 数组length是属性，不是方法，后面没有括号

###一些方法###
java获取程序执行时间 
long startTime=System.nanoTime(); //纳秒
long startTime=System.currentTimeMillis(); //毫秒  //获取开始时间
doSomeThing();  //测试的代码段
long endTime=System.currentTimeMillis(); //获取结束时间

###算法###
* 各常见排序算法http://www.cnblogs.com/eniac12/p/5329396.html









