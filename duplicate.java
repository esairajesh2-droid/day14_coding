import java.util.HashMap;
public class duplicate {
    public static void main(String[] args) {
        
    int arr[]={10,20,30,20,40};
    HashMap<Integer,Integer>map=new HashMap<>();
    boolean isDuplicate=false;
       for(int num:arr){
        if(map.containsKey(num)){
            map.put(num,map.get(num)+1);
        }else{
            map.put(num,1);
        }
    }
    for(int num:arr){
        if(map.get(num)>1){
            isDuplicate=true;
        }
    }
    System.out.println(isDuplicate);
}
}
