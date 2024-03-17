import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class collection {
    public static void main(String[] args) {
   /*  Map<Integer,String> emp=new HashMap<Integer,String>();
    emp.put(15816,"Yeshwanth");
    emp.put(15818,null);//but it maintain the order in ascending order.
    emp.getOrDefault(15818, "Mathan");
    System.out.println(emp.get(15818));
    System.out.println(emp);
    Set<Integer> empId=emp.keySet();
     System.out.println(empId);   
     Iterator<Integer> n=empId.iterator();
     while(n.hasNext()){
        Integer find=n.next();
        for(Map.Entry<Integer,String> emps:emp.entrySet() ){
            if(find.equals(emps.getKey())){
                System.out.println(find+" Name is "+emps.getValue());
            }
        }*/
        int[] nums={1,2,3,4,1,2,3,5,6};
        Map<Integer,Integer> frequency = new HashMap<>();
        for(int val:nums){
            frequency.put(val,frequency.getOrDefault(val,0)+1);

        }
        //System.out.println(frequency);
        for(Map.Entry<Integer,Integer> val1:frequency.entrySet()){
            System.out.println(val1.getKey()+" is repeated "+val1.getValue());
        }

     }


    }



      


       

        

