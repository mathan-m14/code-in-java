
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner user=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=user.nextLine();
        System.out.println();
        System.out.print("Enter your Lover name:");
        String name1=user.nextLine();
        
        int load=5;
        while(load>0){
            System.out.println("Loading wait......");
            load--;

        }
        String val="Flames";
        String result=flames(name,name1,val);
        
        System.out.println("Your Flames result :"+ result);
        
    }

      public static String flames(String name,String name1,String val){
        ArrayList<Character> n=new ArrayList<>();
        ArrayList<Integer> index=new ArrayList<>();
        int count=0;
        int total=0;
        int len=0;
        int len1=0;
        if(name.length()<name1.length()){
           len=name1.length();
           len1=name.length();
        }
        else{
            len=name.length();
            len1=name1.length();
        }
        for(int i=0;i<len;i++){
           
            for(int j=0;j<len1;j++){
                /*if(name.length()<name1.length()){   //removed because of same element repeated its break and continue with new element
                    if(n.contains(name1.charAt(i)) )
                    {   if(index.contains(j)){
                        continue;
                    }
                    
                    }
                }
                else{
                    if(n.contains(name.charAt(i)) ){
                    if(index.contains(j)){
                        continue;
                    }
                    
                    
                    }
    
                }*/
                if(name.length()<name1.length()){
                    if(n.contains(name1.charAt(i)) && index.contains(j)){
                        continue;
                    }
                    if(name1.charAt(i)==name.charAt(j)){
                        n.add(name1.charAt(i));
                        index.add(j);
                        count++;
                        break;
                    }
                }
                else{
                    if(n.contains(name.charAt(i)) && index.contains(j)){
                        continue;
                    }
                    if(name.charAt(i)==name1.charAt(j)){
                        n.add(name.charAt(i));
                        index.add(j);
                        count++;
                        break;
                    }
                }
            }
        }
        total=(name.length()-count)+(name1.length()-count);
       String tot=name+name1;
       tot=tot.replace("#", "");
       int tot_len=tot.length();
       char isrelation =0;
       int temp=0;
       if(tot_len>0){
        temp=tot_len%val.length();
       }
       if(temp==0 && tot_len>=6){
        isrelation='s';
       }
       else{
        int ct=temp-1;
        if(ct >=0){
            isrelation=val.charAt(ct);
        }
       }
      switch (isrelation) {
        case 'F':
            return "Friends";
        case 'l':
             return "Love";
        case 'a':
            return "Affection";
        case 'm':
            return "Marriage";
        case 'e':
            return "Enemy";
        case 's':
            return "Sister";        
        default:
            return "Nakku";
      }
    }

      

    
}



