package Solutions.LinkedList;
public class List 
{
   Node head=null;
   
   public void insert(int value)
   {
       Node node = new Node(value);
       if(head==null)
       {
           head=node;
       }
       else
       {
             Node temp=head;
             while(temp.next!=null)
             {
                 temp=temp.next;
             }
             temp.next=node;
       }

   }

   public void delete(int value)
   {
       Node cur=head,prev=null;;
       if(head!=null && head.data==value)
       {
           System.out.println("Deleted "+ value);
           head=head.next;
           return;
           
       }

       while(cur!=null)
       {
           if(cur.data==value)
           {
               prev.next=cur.next;
               System.out.println("Deleted "+value);
               break;
           }
           prev=cur;
           cur=cur.next;
       }
       System.out.println("not found");
       return;
    }

    public void display()
    {
      Node temp=head;
      while(temp!=null)
      {
          System.out.print("["+temp.data+"]"+" - >");
          temp=temp.next;
      }
      System.out.println();
    }
}
