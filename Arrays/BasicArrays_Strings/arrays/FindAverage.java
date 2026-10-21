package Arrays.BasicArrays_Strings.arrays;
public class FindAverage {
    public static void main(String[] args){
        int s=0;
        int a[]={1,2,3,5,8};
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        int avg=s/a.length;
        System.out.println(avg);
    }
}
