package Lab9.Collection;
     import java.util.*;
     public class Insert {
	  public static void main(String[] args) {
	  
	  List<String> list_Strings = new ArrayList<String>();
	  list_Strings.add("Red");
	  list_Strings.add("Green");
	  list_Strings.add("Orange");
	  list_Strings.add("White");
	  list_Strings.add("Black");

	  System.out.println(list_Strings);

	  list_Strings.add(0, "Pink");
	  list_Strings.add(5, "Yellow");
	  // Print the list
	  System.out.println(list_Strings);
	  
	  LinkedList<String> sifat = new LinkedList<String>();
	  sifat.add("Red");
	  sifat.add("Green");
	  sifat.add("Orange");
	  sifat.add("White");
	  sifat.add("Black");
	  // Print the list
	  System.out.println(sifat);
	 
	  sifat.add(0, "Pink");
	  sifat.add(5, "Yellow");

	  System.out.println(sifat);
	 }
	}