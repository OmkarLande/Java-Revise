// Always use the ctrl+shift+b to compile and run the code
import java.util.*;


public class Code {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0 ; i<n; i++){
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> res = threeSum(nums);

        System.out.println(res);

        sc.close();
    }

    private static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i<n-2; i++){
            for(int j = i + 1; j<n-1; j++){
                for(int k = j + 1; k<n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        int[] triplet = new int[]{nums[i], nums[j], nums[k]};
                        Arrays.sort(triplet);

                        List<Integer> tripletList = Arrays.asList(triplet[0], triplet[1], triplet[2]);
                        System.out.println(" Triplet list "+ i + ": " + tripletList);
                        if(!res.contains(tripletList)){
                            res.add(tripletList);
                        }
                    }
                }
            }
        }

        return res;
    }
}