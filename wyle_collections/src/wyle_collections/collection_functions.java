package wyle_collections;

import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;

public class collection_functions {
	
	public ArrayList<Integer> CombineandSort (ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> c = new ArrayList();
		c = a;
		for(int i=0;i<b.size();i++){
			if(!c.contains(b.get(i))){
				c.add(b.get(i));
			}
		}
		c.sort(null);
		c.remove(c.size()/2);
		return c;
		
	}
	
	public ArrayList<Integer> CreateandPrint (int min, int max){
		ArrayList<Integer> alist = new ArrayList();
		for(int i=min;i<=max;i++){
			alist.add(i);
		}
		Collections.shuffle(alist);
		for(int i=0;i<alist.size();i++){
			System.out.print(alist.get(i) + " ");
		}
		System.out.println(": size = " + alist.size());
		
		return alist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collection_functions cf = new collection_functions();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a = cf.CreateandPrint(1, 10);
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b = cf.CreateandPrint(6, 15);
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		c = cf.CombineandSort(a, b);
		for(int i=c.size()-1;i>=0;i--){
			System.out.print(c.get(i) + " ");
		}
		System.out.println(": size = " + c.size());
		
		//end of integer collections
		
		HashMap<String, String> identities = new HashMap<String, String>();
		identities.put("Superman", "Klark Kent"); //first value
		
		identities.put("Batman", "Bruce Wayne");  //five others
		identities.put("Flash", "Barry Allen");
		identities.put("Green Lantern", "Hal Jordan");
		identities.put("Green Arrow", "Oliver Queen");
		identities.put("Cyborg", "Victor Stone");
		
		identities.put("Batman", "Bruce Wayne");//Replaces old value
		identities.put("Batman", "Dick Greyson");//To prove it replaces old value
		
		for (String name: identities.keySet()){	//prints out hashmap. There are no duplicates

            String key =name.toString();
            String value = identities.get(name).toString();  
            System.out.println(key + ": " + value);  
		}
		
		//I didn't need the Hashtable and hashmap is less restrictive
		//I personally feet like a "table" should have more than 2 values per row
		//also it made the duplicate part easy
	}

}
