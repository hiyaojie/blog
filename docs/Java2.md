### String相关笔试题
```
class StringEqualTest {
    public static void main(String[] args) {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());
    }
}
```
答案是：
1. false 
2. true
3. false
4. true
5. false

可以看出，只要是+中出现非字符串直接量，就会在堆中产生新的对象，并不会检测栈内存
