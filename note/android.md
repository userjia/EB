


### layout
android:visibility="invisible" / setVisibility(View.INVISIBLE);/visible,invisible,gone
android:clickable="false" / button.setCheckable(false);

dp: always the same size whatever the screen pixels are
sp: front size concerned
px: change with the screen pixels

FrameLayout(框架布局) 
框架布局是最简单的布局形式。所有添加到这个布局中的视图都以层叠的方式显示。第一个添加的控件被放在最底层，最后一个添加到框架布局中的视图显示在最顶层，上一层的控件会覆盖下一层的控件。这种显示方式有些类似于堆栈。    
一般很少使用，所以只是作为一个知识点列出来。借鉴于前人的样例

当 android:orientation="vertical"  时， 只有水平方向的设置才起作用，垂直方向的设置不起作用。即：left，right，center_horizontal 是生效的。    
当 android:orientation="horizontal" 时， 只有垂直方向的设置才起作用，水平方向的设置不起作用。即：top，bottom，center_vertical 是生效的。

### fragment
#### fragment and activity
* To host a UI fragment, an activity must 
1. define a spot in its layout for the fragment's view
2. manage the lifecycle of the fragment instance

* fragment is activity's business, OS knows nothing about it.

* add fragment to activity    
  1. add to activity's *layout*  
  2. add to activity's *code* : better way to handle

* fragment's lifecycle methods are public, they will be called by activity 

* never use more than three fragments in an activity   

public View onCreatView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){    
  View view = inflater.inflate(R.layout.fragment_item_list, container,false);//false表示这里不把视图加到父activity中，在singlefragment中加   
}
inflater?映射视图的工具？
container, 父activity的表示？
savedInstanceState, 生命周期中保存状态的变量？

* Question   
what is the relationship between fragment's lifecycle and activity's?   
: align with it

### eclipse  的问题
#### Dx.jar
不知道是环境变量还是什么，把26.0.1的dx.jar 替换成25的就好了

#### support包的引用
使用support v7 appcompat 需要导入其项目
引用support包时在preference->Android 下选择sdk后下方的lib中引用

#### 有时出现.xml中的东西找不到的问题
更改jdk版本可能解决问题
https://stackoverflow.com/questions/26656567/appcompat-v7-error-in-eclipse
http://www.eoeandroid.com/thread-559360-1-1.html?_dsign=32941d87
http://www.cnblogs.com/expiator/p/5914418.html

####
support 下载地址
https://dl.google.com/android/repository/support_r19.zip
现在的sdk下载的support不直接支持eclipse 导入，所以可以通过以上链接单独下载，但是这个功能以后可能也就不支持了
