

public class OopEx5 {
int x;
void m(){
System.out.println("Hello A");
}
public static void main(String[] args) {
System.out.println("Hello Main");
OopEx5 a=new OopEx5();
a.x=90;
OopEx5 a2=new OopEx5();
a2.x=80;
a.m();
a2.m();
System.out.println(a.x);
System.out.println(a2.x);
}
}	

