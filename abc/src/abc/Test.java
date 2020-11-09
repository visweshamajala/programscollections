package abc;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test {
public static void main(String[] args) {
	TreeMap<String,String> map=new TreeMap<String,String>();
	map.put("a","apple");
	map.put("e","egg");
	map.put("g","gear");
	SortedMap<String,String>smap=  map.subMap("a", "e");
	smap.put("b","ball");
	smap.put("f","fish");
	map.put("c","cat");
	map.remove("a");
	System.out.println(smap);
	System.out.println(map);
}
}
