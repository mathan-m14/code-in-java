
/*This code is used to find the difference between the two JSON input String  */
/*The Problem is solved using by interface such as Map,List and inbuilt functions like split,replaceAll,replace */
import java.util.*;
public class JSONdifferentKeys {
        public static void main (String[] args) { 
          Map<String,String> diff1=new LinkedHashMap<>();
          Map<String,String> diff2=new LinkedHashMap<>();
          List<String> differentKey=new ArrayList<>();
          String s1="{\"header\":\"hi\",\"column\":\"bye\"}";
          String s2="{\"header\":\"hii\",\"column\":\"byee\"}";
          String[] ar1=s1.replaceAll("[{}]"," ").replace(" ","").split(",");
          String[] ar2=s2.replaceAll("[{}]"," ").replace(" ","").split(",");
          
         for(String n:ar1){
          String[] val1=n.split(":");
          diff1.put(val1[0],val1[1]);
         }
         for(String n:ar2){
          String[] val1=n.split(":");
          diff2.put(val1[0],val1[1]);
         }
         for(Map.Entry<String,String> check:diff1.entrySet()){
          if(diff1.get(check.getKey()).equals(diff2.get(check.getKey()))){
                    continue;
          }
          else{
            differentKey.add(check.getKey());
          }          
         }
         System.out.println(differentKey);
         }

    }



      


       

        

