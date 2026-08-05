import java.util.HashMap;
public class frequency{
    public static void main(String args[]){
        int arr[]={4,7,4,2,7,4,9};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int num:arr){
            if(map.get(num)>=2){
                System.out.println(num+":"+map.get(num));
                break;
            }
        }

    }
}