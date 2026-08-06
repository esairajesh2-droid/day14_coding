import java.util.HashMap;
public class Non {
    public static void main(String[] args) {
        int arr[]={4,5,1,4,5,2,1,3};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int num:arr){
            if(map.get(num)==1){
                System.out.println(num);
                break;
            }
        }
    }
    
}
