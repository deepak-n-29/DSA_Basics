package Arrays.BasicArrays_Strings.arrays;
public class CountDistinctElements {
    public static void main(String[] args){
        int count=0;
        int a[]={1,2,3,5,8,8,2,1,4,9};
        for(int i=1;i<a.length;i++){
            boolean isdistinct=true;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    isdistinct=false;
                    break;
                }
            }
            if(isdistinct==true){
                count++;
            }
        }
        System.out.println(count);
    }
}

//Array: {1, 2, 3, 1, 5}

//i = 0:
//Inner Loop: None
     //Count = 1

//i = 1:
    //j = 0: a[1] != a[0]
    //Count = 2

//i = 2:
    //j = 0: a[2] != a[0]
    //j = 1: a[2] != a[1]
    //Count = 3

//i = 3:
    //j = 0: a[3] == a[0] (Break)
    //Count = 3

//i = 4:
    //j = 0: a[4] != a[0]
    //j = 1: a[4] != a[1]
    //j = 2: a[4] != a[2]
    //j = 3: a[4] != a[3]
    //Count = 4

//Final Count: 4
