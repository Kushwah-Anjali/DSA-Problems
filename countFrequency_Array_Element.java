package BasicHashing;

public class countFrequency_Array_Element {
    public static void main(String[] args) {
        int nums[] = { 14, 1, 2, 2, 1, 3 };

        int n = nums.length;
       brute_Force(nums,n);


    }

    static void brute_Force(int nums[],int n){
         boolean[] visited = new boolean[n];
      for(int i=0;i<n;i++){
        int count=1;
        if(visited[i])
         continue;
         for(int j=i+1;j<n;j++){
            if(nums[j]==nums[i]){
                visited[j]=true;
                count++;
            }
         } System.out.println(nums[i] + " appears " + count + " times");
      }
      
    }

}