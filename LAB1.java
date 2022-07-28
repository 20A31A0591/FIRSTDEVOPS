public class classA
{
 public void dispA()
 {
 System.out.println("disp() method of classA");
 }
}
public class classB extends classA
{
 public void dispB()
 {
 System.out.println("disp() method of classB");
 }
 public static void main(String args[])
 {
 //Assigning ClassB object to ClassB reference
 classB b = new classB(); 
 b.dispB();
 }
}