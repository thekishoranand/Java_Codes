class AAA{
int x;
String y;
void m(){
System.out.println(x);
System.out.println("Hello A");
System.out.println(y);
}
}
public class OopEx8 {
public static void main(String[] args) {
AAA a=new AAA();
System.out.println("Hello Main");
a.x=40;a.y="yoyo";
AAA a2=new AAA();
a2.y="jj";
a.m(); 
a2.m();
}
}