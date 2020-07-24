package listcomp;
import java.util.ArrayList;
import java.util.Iterator;
public class Operation {
 static ArrayList a1 = new ArrayList(10);
 int fetchEle(int index)
 {
	
	 return (Integer) a1.get(index);
	 
 }
 void AddEle(int ele)
 {
	 a1.add(ele);
	 System.out.println("Element is successfully added");
	 Iterator i = a1.iterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }

 }
 void removeEle(int ele)
 {
	 a1.remove(ele);
 }
 void printEle()
 {
	 Iterator i = a1.iterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
 }
}