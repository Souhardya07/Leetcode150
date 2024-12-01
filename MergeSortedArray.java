    //INPUT : 
// num1 = [1,2,3,0,0,0] num2=[2,5,6]
// m=3 n=3

// OUTPUT

// NUM1 =[1,2,3,5,6]

               // Process

// compare the last elements of num1 to num2 and place the
// greater element at the end 
                    
                // [1,2,3,0,0,0] and [2,5,6]
                //      ^(i)              ^(j)
                //            compare ith and jth element

class MergeSortedArray{
    public static void main(String[] args) {
        int num1[]={1,2,3,0,0,0};
        int num2[]={2,5,6};
        int m=3;
        int n=3;
        mergeArrays(num1, num2, n, m);
        for (int i=0 ; i < m+n;i++){
            System.out.print(num1[i]+" ");
        }
    }
    public static void mergeArrays(int[] num1,int[] num2,int n , int m ){
          int i = m-1;
          int j = n-1;
        
          int k = m+n-1;

         while(j>=0){
            if(i>=0 && num1[i]>num2[j]){
                num1[k]= num1[i];
                k--;
                i--;
            }
            else{
                num1[k] = num2[j];
                k--;
                j--;
              }
         } 
    }
}