### Java访问控制符
#### 访问控制符
public/protected/default/private;
#### 访问原则
1. 首先是class的访问权限，只有public和缺省这两种
   + 在同一个包中的类可以相互访问到，无需import；
   + 在不同的包中，只能访问到pubulic的类，使用前需要import；
2. 然后看类中方法和成员变量的访问权限，能用四种修饰符修饰
   + 在同一个包中，能访问除private的所有变量和方法；
   + 在不同包中且不是子类，只能访问public的变量和方法；
   + 在不同包中的子类，能访问public和protected的变量和方法；
#### 总结
1. private可以隐藏掉类中的实现细节，对外提供public的set和get方法即可；
2. protected是为继承准备的一种控制符，使不同包的子类都能访问到；

