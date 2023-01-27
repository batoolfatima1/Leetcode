// package com.example.arbisoftapi;
// import java.io.IOException;
// import java.net.URL;
// import java.util.*;
// import java.util.stream.Collectors;

// import org.json.*;
// import org.junit.runner.Request;

// public class Main
//  {
//     public static void main(String[] args) throws IOException
//      {
//         OkHttpClient client = new OkHttpClient();

//         Request request = new Request.Builder()
//                 .url("https://www.jsonkeeper.com/b/ITZH")
//                 .build();

//         try (Response response = client.newCall(request).execute())
//          {
//             if (response.code() == 200) 
//             {
//                 JSONObject data = new JSONObject(response.body().string());
//                 System.out.println(data);
//                 JSONObject action_plan = data.getJSONObject("data").getJSONObject("action_plan");
//                 String main_operation = action_plan.getString("operation");
//                 JSONObject sub_operation = action_plan.getJSONObject("sub_operations");
//                 JSONArray timelines = data.getJSONObject("data").getJSONArray("timelines");
//                 JSONArray masks = data.getJSONObject("data").getJSONArray("masks");

//                 // print("status:", status);
//                 System.out.println("timelines: " + timelines);
//                 System.out.println("masks: " + masks);
//                 System.out.println("operation: " + main_operation);
//                 System.out.println("sub operations: " + sub_operation);

//                 Map<String, String> translation_table = new HashMap<String, String>();
//                 translation_table.put("FOO", "SUM");
//                 translation_table.put("FOX", "MAX");
//                 translation_table.put("BAR", "MIN");

//                 Map<String, List<Integer>> output = new HashMap<String, List<Integer>>();
//                 for (int i = 0; i < masks.length(); i++) {
//                     String mask = masks.getString(i);
//                     if (!output.containsKey(mask)) {
//                         output.put(mask, new ArrayList<Integer>());
//                     }
//                     output.get(mask).add(timelines.getInt(i));
//                 }

//                 System.out.println("Timelines grouped by mask labels:- ");
//                 List<String> keys = new ArrayList<String>();
//                 List<String> perform_operations = new ArrayList<String>();
//                 List<Integer> resultant_data = new ArrayList<Integer>();
//                 for (Map.Entry<String, List<Integer>> entry : output.entrySet())
//                  {
//                     String key = entry.getKey();
//                     keys.add(key);
//                     String operation = translation_table.get(sub_operation.getString(key));
//                     perform_operations.add(operation);
//                     System.out.println(key + ": " + entry.getValue());
//                     System.out.println("performing operations:");
//                     if (operation.equals("MAX")) {
//                         resultant_data.add(Collections.max(entry.getValue()));
//                     } else if (operation.equals("MIN")) {
//                         resultant_data.add(Collections.min(entry.getValue()));
//                     } else if (operation.equals("SUM"))
//                     {
//                         resultant_data.add(Collections.sum(entry.getValue()));
//                     }
//                 }
//             }
//             System.out.println(resultant_data);
//         }
//         catch(Exception e)
//         {
//             e.printStackTrace;
//         }
//     }
// }
