public class OopExampleAssignments
{
int x=10;
String y="Rahul";
void show() {
System.out.println(x+y);
}
}
class Test {
public static void main(String[] args) {
	OopExampleAssignments a= new OopExampleAssignments();
	OopExampleAssignments b= new OopExampleAssignments();
a.x=15;
a.show();
a.y="YoYo";
b.show();
b.y="Ramu";
a.show();
b.show();
}
}