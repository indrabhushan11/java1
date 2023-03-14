import java.util.*;

public class treemap {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("----MENU----");
	System.out.println("1. Add");
	System.out.println("2. Get");
	System.out.println("3. Display using keySet");
	System.out.println("4. put if absent");
	System.out.println("5. pollFirstEntry");
	System.out.println("6. pollLastEntry");
	System.out.println("7. Delete");
	System.out.println("8. clear");
	System.out.println("9. Exit");
	
	String usn,name;
	Map<String,String> tmap = new TreeMap<>();
	
	while(true)
	{
		System.out.print("Enter your choice : ");
		int ch = sc.nextInt();
		
		if(ch==1)
		{
			System.out.print("Enter USN : ");
			usn = sc.next();
			System.out.print("Enter Name : ");
			name = sc.next();
			tmap.put(usn, name);
		}
		else if(ch==2)
		{
			System.out.print("Enter USN to display name : ");
			usn = sc.next();
			System.out.println("Name : " + tmap.get(usn));
		}
		else if(ch==3)
		{
			System.out.println("KEYS : " + tmap.keySet());
		}
		else if(ch==4)
		{
			System.out.print("Enter USN : ");
			usn = sc.next();
			System.out.print("Enter Name : ");
			name = sc.next();
			tmap.putIfAbsent(usn, name);
		}
		else if(ch==5)
		{
			System.out.println(((TreeMap<String, String>) tmap).pollFirstEntry());
		}
		else if(ch==6)
		{
			System.out.println(((TreeMap<String, String>) tmap).pollLastEntry());
		}
		else if(ch==7)
		{
			System.out.print("Enter USN to delete : ");
			usn = sc.next();
			tmap.remove(usn);
		}
		else if(ch==8)
		{
			tmap.clear();
			System.out.println(tmap);
		}
		else if(ch==9)
		{
			break;
		}
		else
			System.out.println("Invalid choice");
	
	}
	sc.close();
}

}

