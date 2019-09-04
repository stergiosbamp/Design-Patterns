public class Main {
    public static void main(String[] args) {
        int N = 3;
        int S = 10;

//        for (int j = 1; j < 11; j++) {
//                for (int k = j; k < 11 - j; k++) {
//                    for (int l = k; l < 11 - k; l++) {
//
//                        if(j + k + l == S){
//                            System.out.println(j + "+" + k + "+" + l + " = " + S);
//                        }
//                    }
//                }
//        }

        int[] nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0;
        }

        combinations(S, N, nums);
    }

    public static void combinations(int S, int N, int[] nums){
//        for (int i = 0; i < N; i++) {
//            if (nums[i] + nums[N-i+]== S){
//                System.out.println("DONE");
//            }else{
//                nums
//            }
//        }

    }
}
