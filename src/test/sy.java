package test;

public class sy {

    public static void main(String[] args) {

       int[] nums ={-1, 0, 1, 2, -1, -4};

       int q,w,e;

        System.out.println("[");
        for (int i=0 ;i< nums.length;i++) {

            if ((i+2)<nums.length){
               if(0==(nums[i]+nums[i+1]+nums[i+2])){
                   System.out.print("  ["+nums[i]+", "+nums[i+1]+", "+nums[i+2]+"]");
                   System.out.println("");
               }

            }

        }
        System.out.println("]");

        System.out.print("[\n" +
                "  [-1, 0, 1],\n" +
                "  [-1, -1, 2]\n" +
                "]");





    }
}
