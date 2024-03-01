Какой результат следующих выражений? Почему?

```java
// 1
Integer a = Integer.valueOf(100);
Integer b = Integer.valueOf(100);
System.out.println(a == b);
System.out.println(a.equals(b));

// 2
Integer a = Integer.valueOf(1000);
Integer b = Integer.valueOf(1000);
System.out.println(a == b);
System.out.println(a.equals(b));

// 3
String a = "str";
String b = "str";
System.out.println(a == b);
System.out.println(a.equals(b));

// 4
String a = "str";
String b = new String("str");
System.out.println(a == b);
System.out.println(a.equals(b));

// 5
String a = new String("abc").intern();
String b = new String("abc").intern();
System.out.println(a == b);
System.out.println(a.equals(b));
```