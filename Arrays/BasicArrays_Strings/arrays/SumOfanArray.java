package Arrays.BasicArrays_Strings.arrays;
public class SumOfanArray {

    public static void main(String[] args){
        int s=0;
        int a[]={1,2,3,5,8};
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        System.out.println(s);
    }
}
