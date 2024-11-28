abstract class abs1
{
abstract void show();
void display()
{
System.out.println("This is normal method inside abstract class");
}
}
class abs2 extends abs1
{
public void show()
{
System.out.println("This is normal method");
}
}
class abs3
{
public static void main(String s[])
{
abs2 a1=new abs2();
a1.show();
a1.display();
}
}