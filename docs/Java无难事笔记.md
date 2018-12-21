1. 如果没有写构造函数，Java编译器会默认创建一个不带参数的构造函数；如果定义了带参数的构造函数，Java编译器不会再创建不带参数的构造函数了；
2. 父类中有不带参数的构造函数时，子类一定也要写不带参数的构造函数且使用super(age, name, height)显示调用；
3. final关键字修饰的常量可以在域中初始化，也可以在构造方法中初始化；但是用static修饰时只能在域中初始化；
4. 构造方法不能被继承；
5. 当我们new一个Person对象时，static修饰的成员变量首先被初始化，随后是普通成员，最后调用Person类的构造方法完成初始化。也就是说，在创建对象时，static修饰的成员会首先被初始化，而且我们还可以看到，如果有多个static修饰的成员，那么会按照他们的先后位置进行初始化。[参考资料](https://www.cnblogs.com/dotgua/p/6354151.html?utm_source=itdadao&utm_medium=referral)
6. final也可以修饰类中的类变量，这时候该类变量中的属性还是还是可以变得，不变的是初始化该类的地址；
7. 一个类有一个属性是类时，构造的时候初始化了该类变量时，在外面修改此类时，所有相关的引用都被修改了；
```
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        C c =new C(arrayList);
        A a =new A(c);
        B b =new B(c);
        arrayList.add(1);
        arrayList.add(2);
        a.getArrayList().getArrayList().add(3);
        a.add(4);

        for (Object o : c.getArrayList()) {
            System.out.println(o);
        }

        for (Object o : a.getArrayList().getArrayList()) {
            System.out.println(o);
        }

        for (Object o : b.getArrayList().getArrayList()) {
            System.out.println(o);
        }

    }
```
