import java.util.ArrayList;
import java.util.HashMap;

import com.aayush;


public class Example {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, String>> jsonarray= JsonParser.parse("http://api.androidhive.info/contacts/", "contacts", "id","name","address","email","gender");
		for(int j=0;j<jsonarray.size();j++){
			System.out.println(jsonarray.get(j).get("id")+" : "+jsonarray.get(j).get("name"));
		}
	}

}
