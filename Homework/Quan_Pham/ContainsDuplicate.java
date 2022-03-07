import java.util.HashMap;

public class ContainsDuplicate {


    public static boolean containsDuplicate(int[] nums) {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> hashSet = new HashSet<>();
            for (int temp : nums) {
                if (hashSet.contains(temp))
                    return true;
                hashSet.add(temp);
            }
            return false;
        }

    public static void main(String[] args) {
        int[] a = {5,5,1,3,3,4,0,2,9,2};
        System.out.println(containsDuplicate(a));
    }
}
