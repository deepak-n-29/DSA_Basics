package Arrays.BasicArrays_Strings.arrays;
//find maximum in an array

public class MaxInArray {
    public static void main(String[] args){
        int max=0;
        int a[]={1,2,3,5,8};
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
