import java.util.HashMap;
public class Count{
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,4,5,6};
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        } 
        for(int num:arr){
            if(map.get(num)==2){
                count++;
            }
        }
        System.out.println(count);
      }
}