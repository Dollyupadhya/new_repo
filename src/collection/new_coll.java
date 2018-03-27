package collection;
import java.util.*;


public class new_coll {
public static void main(String args[])
{
	Product s1=new Product(01,"ABC",10000);  
	Product s2=new Product(02,"XYZ",2000);  
	Product s3=new Product(03,"RST",25000);
	Product s4=new Product(04,"PQR",209000);
	Product s5=new Product(03,"RST",25000);
LinkedList<Product> pro=new LinkedList<Product>();
pro.add(s1);
pro.add(s2);
pro.add(s3);
pro.add(1,s4);
pro.add(s2);
pro.add(s5);
Iterator r=pro.iterator();
while(r.hasNext())
{
	Product pr=(Product)r.next();
System.out.println(pr.pro_id +" " +pr.pro_name +" " +pr.pro_price);
}
System.out.println("---------");
HashSet<Product> hs=new HashSet<Product>();
hs.add(s1);
hs.add(s3);
hs.add(s5);
hs.add(s1);
Iterator r1=hs.iterator();
while(r1.hasNext())
{
	Product pr=(Product)r1.next();
System.out.println(pr.pro_id +" " +pr.pro_name +" " +pr.pro_price);
//changed
/////////
//------------
//gfyyjty
// Terminal
}
}
}
