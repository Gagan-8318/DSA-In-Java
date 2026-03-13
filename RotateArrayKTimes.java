import javafx.scene.transform.Rotate;

public class RotateArrayKTimes {
    static int[] Rotate(int [] nums,int k){
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        return nums;
        
        }
        static void reverse(int []nums,int i,int j){
            while(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }

        public static void main(String[] args) {

            // System.out.println("hello");
            int[] nums={1,2,3,4,5,6};
            int k=3;
            int [] ans=new int[nums.length];
            ans=Rotate(nums, k);
            for(int i=0;i<nums.length;i++){
                System.out.print(ans[i] + " ");
            }
            // System.out.println("hello");
            

        }
    }
    

