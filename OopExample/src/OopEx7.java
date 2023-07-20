class AA{
int x;
String y;
void m(){
System.out.println("Hello A");
System.out.println(x+y);
}
}
public class OopEx7 {
public static void main(String[] args) {
System.out.println("Hello Main");
AA a=new AA();
a.x=10;
AA a2=new AA();
a2.y="jj";
a.m();
a2.m();
}
}