package com.example.arbisoftapi;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;  
import org.json.simple.JSONValue;

import netscape.javascript.JSException;

import java.util.*;
public class code
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
            Object obj= JSONValue.parse(jsonData);  
            JSONObject json = (JSONObject) obj;  
            try{
              System.out.println(json);

              JSONObject data = (JSONObject)json.get("data");
              JSONArray timelines =(JSONArray) data.get("timelines");
              JSONArray masks = (JSONArray)data.get("masks");
              JSONObject action_plan = (JSONObject)data.get("action_plan");
              String main_operation = (String)action_plan.get("operation");
              JSONObject sub_operation = (JSONObject)action_plan.get("sub_operations");

              System.out.println(timelines.get(3).getClass());

            //   JSONArray d = new JSONArray();
            //   for(int j=0; j< timelines.size(); j++)
            //   {
            //     int o = ((Long) timelines.get(j)).intValue();
            //     d.add(o);
            //   }

              System.out.println("timelines: " + timelines);
              System.out.println("masks: " + masks);
              System.out.println("operation: " + main_operation);
              System.out.println("sub operations: " + sub_operation);

              HashMap<String, String> translation_table = new HashMap<>();
              translation_table.put("FOO", "SUM");
              translation_table.put("FOX", "MAX");
              translation_table.put("BAR", "MIN");
              System.out.println("translation table" +translation_table);

              HashMap<String, List<Integer>> output = new HashMap<>();
              for (int i = 0; i < masks.size(); i++) 
              {
                  String mask = (String)masks.get(i);
                  if (!output.containsKey(mask))
                  {
                      List<Integer> dummy = new ArrayList<Integer>();
                      //dummy.add((Long)timelines.get(i));
                      //output.put(mask, new ArrayList<Integer>());
                      output.put(mask, dummy);
                  }
                  //output.get(mask).add(timelines.get(i));
                  List<Integer> l = output.get(mask);
                //  l.add((Integer)d.get(i));
                  l.add(((Long)timelines.get(i)).intValue());
                  output.put(mask,l);
              }
              
              System.out.println("Timelines grouped by mask labels:- " + output);
              List<String> keys = new ArrayList<>();
              List<String> perform_operations = new ArrayList<>();
              List<Integer> resultant_data = new ArrayList<>();
              for (Map.Entry<String, List<Integer>> entry : output.entrySet())
               {
                  keys.add(entry.getKey());
                  String operation = translation_table.get(sub_operation.get(entry.getKey()));
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
                      resultant_data.add(sum);
                  }
               }
               System.out.println("resultant : "+ resultant_data);


               // final steps
               // perform operation specified "FOO" to these resultants

               String operation2 = translation_table.get(main_operation);

               Integer result =null;
               if (operation2.equals("MAX"))
                  {
                     result = Collections.max(resultant_data);
                      System.out.println("ouput = " + Collections.max(resultant_data)); 
            
                  }
                  else if (operation2.equals("MIN"))
                  {
                    result = Collections.min(resultant_data);
                    System.out.println("ouput = " + Collections.min(resultant_data));
                  }
                  else if (operation2.equals("SUM"))
                  {
                      int sum = 0;
                      for (int i :resultant_data )
                      {
                          sum += i;
                      }
                      result = sum;
                      System.out.println("ouput = " + sum);
                  }

                  try 
                  {
                    FileWriter myWriter = new FileWriter("output.txt");
                    myWriter.write(result.toString());
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                  } 
                  catch (IOException e)
                   {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }

            }
            catch(JSException e)
            {
                e.printStackTrace();
            }
               
  }          
 }

    