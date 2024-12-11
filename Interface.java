/*the process of hiding the properties and 
showcasing the fubctionalities
implements keyword is used for interface
*/
import java.util.*;
interface mobileapp{
  public void menu();
  public void rating();
  public void contact();
}
class b implements mobileapp
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
public class Interface{
  public static void main(String args[])
  {
    b a = new b();
    a.contact();
  }
}