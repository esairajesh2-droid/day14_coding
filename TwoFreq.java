import java.util.HashMap;
class TwoFreq{
    public static void main(String[] args) {
        int arr1[]={1,2,2,3,3,3};
        int arr2[]={3,1,3,3,3,2};
        HashMap<Integer,Integer>map1=new HashMap<>();
        HashMap<Integer,Integer>map2=new HashMap<>();
        for(int num:arr1){
            if(map1.containsKey(num)){
            map1.put(num,map1.get(num)+1);
        }else{
            map1.put(num,1);
        }
    }
    for(int num:arr2){
            if(map2.containsKey(num)){
            map2.put(num,map2.get(num)+1);
        }else{
            map2.put(num,1);
        }
    }
    if(map1.equals(map2)){
        System.out.println("both arrays have same frequencies");
    }else{
        System.out.println("both arrays do not have same frequency");
    }

}
}