package Solutions.LinkedList;

public class Load 
{
  public static void main(String args[])
  {
      List list = new List();
      list.insert(1);
      list.insert(2);
      list.delete(1);
      list.display();
      list.insert(6);
      list.display();
      list.delete(6);
      list.display();
      list.delete(2);
      list.display();
      list.delete(1);
  }    
}
