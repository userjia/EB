ERROR:java non-static variable this cannot be referenced from a static context 
解决：main 是静态的，它直接引用的方法也应该是静态的

java 数组length是属性，不是方法，后面没有括号

java 控制台运行
javac Test.java 编译
java Test.class 运行

各常见排序算法
http://www.cnblogs.com/eniac12/p/5329396.html

export PATH=$PATH:/home/cabox/dev/apache-maven-3.5.0/bin

Mybatis优势
MyBatis可以进行更为细致的SQL优化，可以减少查询字段。
MyBatis容易掌握，而Hibernate门槛较高。

Hibernate优势
Hibernate的DAO层开发比MyBatis简单，Mybatis需要维护SQL和结果映射。
Hibernate对对象的维护和缓存要比MyBatis好，对增删改查的对象的维护要方便。
Hibernate数据库移植性很好，MyBatis的数据库移植性不好，不同的数据库需要写不同SQL。
Hibernate有更好的二级缓存机制，可以使用第三方缓存。MyBatis本身提供的缓存机制不佳。
链接：https://www.zhihu.com/question/21104468/answer/58579295

java获取程序执行时间 
long startTime=System.nanoTime(); //纳秒
long startTime=System.currentTimeMillis(); //毫秒  //获取开始时间
doSomeThing();  //测试的代码段
long endTime=System.currentTimeMillis(); //获取结束时间


