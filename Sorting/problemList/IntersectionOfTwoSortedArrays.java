package Sorting.problemList;

// Problem: Find the intersection of two arrays.
// Both arrays are sorted and may contain duplicates. The intersection should contain only unique elements.

public class IntersectionOfTwoSortedArrays {
    

    public static void intersection(int a[],int b[],int m, int n){ // time complexity 
        for(int i=0;i<m;i++){
            if(i>0 && a[i]==a[i-1]){
                continue;
            }
            for(int j=0;j<n;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }

    public static void efficientIntersection(int a[], int b[], int m,int n){ // example 
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                System.out.println(a[i]);
                i++;
                j++;
            }

        }
    }

      public static void main (String[] args) 
    {
        int a[] = new int[]{3,5,10,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};
        
        int m = a.length;
        int n = b.length;
        System.out.println("Naive Approach:");
	    intersection(a,b,m,n);
        System.out.println("Efficient Approach:");
        efficientIntersection(a, b, m, n); 

    }
  
}
