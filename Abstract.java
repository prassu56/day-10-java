/*the process of hiding the properties and 
showcasing the fubctionalities
implements keyword is used for interface
*/
import java.util.*;
abstract class mobileapp{
  abstract void menu();
  abstract void rating();
  abstract void contact();
}
class b extends mobileapp
{
  public void menu()
  {
    System.out.println("Hello");
  }
  public void rating()
  {
    System.out.println("Hello Raju");
  }
  public void contact()
  {
    System.out.println("89898989879");
  }
}
public class Abstract{
  public static void main(String args[])
  {
    b a = new b();
    a.contact();
  }
}