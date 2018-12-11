### 简单工厂模式
[简单工厂模式](https://blog.csdn.net/jason0539/article/details/23020989)
+ 场景，一个面馆销售10种面，客户点餐；
   1. 创建一个面馆类；有一个方法可以根据参数返回需要的面；abstract noodle getNoodle(int type);
   2. 用户点一种面；getNoodle(1);

### 工厂方法模式
[工厂方法模式](https://blog.csdn.net/jason0539/article/details/23020989)
+ 场景，n个面馆销售自己的面，客户用餐；
   1. 创建一个抽象面馆类；
   2. 每个面馆实现一个面馆类；
   3. 用户指定一个面馆类；
   4. 点面；


### 抽象工厂模式
[抽象工厂模式](https://blog.csdn.net/jason0539/article/details/44976775)
+ 场景，n个面馆，不仅销售面，还销售小吃；
   1. 创建一个抽象面馆类；
   2. 抽象面馆类包括面和小吃属性；
   3. 不同的面馆分别实现抽象面馆；
   4. 具体面和小吃分别实现面、小吃接口；
   5. 用户点餐new一个面馆的工厂实例，点相应的东西；
   
   另外的理解：
   1. 抽象工厂指的是工厂的工厂，由假设有一个组织管理者所有的工厂，由它生成一个工厂；FactoryProducer;
   2. FactoryProducer有一个静态方法用于生成工厂的实例；Factory;
   3. Factory实现里不同的抽象类和接口；
   4. 总之，工厂生成的是具体对象，抽象工厂生成的是工厂；（来自知乎搜索，与菜鸟教程里的例子是一致的）

[看笔记部分](http://www.runoob.com/design-pattern/abstract-factory-pattern.html)
