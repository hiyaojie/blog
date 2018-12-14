+ 调用jdbc底层的prepareStatement预编译sql语句实现；
+ 预编译的sql已经对应好数据格式，参数里传入的sql指令不会被解析；
+ mybatis使用#{}作为prepareStatement参数占位符，${}会直接传入字符串；
+ mybatis也有prepareStatement失效的情况，具体处理方法参考博客；

+ (prepareStatement防注入原理)[https://blog.csdn.net/chenleixing/article/details/44024095]
+ (mybatis防注入方法)[http://www.cnblogs.com/moxiaotao/p/9330711.html]
