import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.*;
public class Api
{
    public static void main(String[] args) throws IOException 
    {
        URL url = new URL("https://www.jsonkeeper.com/b/ITZH");
        Scanner sc = new Scanner(url.openStream());
        String inline = "";
        
        while(sc.hasNext()) 
        {
            inline += sc.nextLine();
        }
        sc.close();

        String jsonData = inline;
        JSONObject json = new JSONObject(jsonData);
    
        if (json.getInt("status") == 200)
         {
            System.out.println(json);
            JSONObject data = json.getJSONObject("data");
            JSONArray timelines = data.getJSONArray("timelines");
            JSONArray masks = data.getJSONArray("masks");
            JSONObject action_plan = data.getJSONObject("action_plan");
            String main_operation = action_plan.getString("operation");
            JSONObject sub_operation = action_plan.getJSONObject("sub_operations");

            System.out.println("timelines: " + timelines);
            System.out.println("masks: " + masks);
            System.out.println("operation: " + main_operation);
            System.out.println("sub operations: " + sub_operation);

            HashMap<String, String> translation_table = new HashMap<>();
            translation_table.put("FOO", "SUM");
            translation_table.put("FOX", "MAX");
            translation_table.put("BAR", "MIN");

            HashMap<String, List<Integer>> output = new HashMap<>();
            for (int i = 0; i < masks.length(); i++) 
            {
                String mask = masks.getString(i);
                if (!output.containsKey(mask))
                 {
                    output.put(mask, new ArrayList<Integer>());
                }
                output.get(mask).add(timelines.getInt(i));
            }

            System.out.println("Timelines grouped by mask labels:- ");
            List<String> keys = new ArrayList<>();
            List<String> perform_operations = new ArrayList<>();
            List<Integer> resultant_data = new ArrayList<>();
            for (Map.Entry<String, List<Integer>> entry : output.entrySet())
             {
                keys.add(entry.getKey());
                String operation = translation_table.get(sub_operation.getString(entry.getKey()));
                perform_operations.add(operation);
                System.out.println(entry.getKey() + ": " + entry.getValue());
                System.out.println("performing operations:");
                if (operation.equals("MAX"))
                {
                    resultant_data.add(Collections.max(entry.getValue()));
                }
                else if (operation.equals("MIN"))
                {
                    resultant_data.add(Collections.min(entry.getValue()));
                }
                else if (operation.equals("SUM"))
                {
                    int sum = 0;
                    for (int i : entry.getValue())
                    {
                        sum += i;
                    }
                }
             }
            } 
        }          
}
