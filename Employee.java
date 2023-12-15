import org.json.JSONArray;
import org.json.JSONObject;

import netscape.javascript.JSObject;


public class Employee {
    public static void main (String[] args){

        JSONArray EmployeeData = new JSONArray();
        EmployeeData.put(new JSONObject().put("fname", "abc").put("lname", "xyz").put("id", 1) );
        EmployeeData.put(new JSObject().put("fname", "abc").put("lname", "xyz").put("id", 2) );
        
        System.out.println("Operation: Read");

        for (int i=0; i<EmployeeData.length(); i++){

            JSONObject Employee = EmployeeData.getJSONObject(i);
            System.out.println("First Name: "+Employee.getString("fname")+ "Last Name: " + Employee.getString("lname") + "ID: "+ Employee.getString("id"));

        }

        
    }
    
}
