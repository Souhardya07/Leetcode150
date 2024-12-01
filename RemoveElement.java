// Given an array named NUms and a Val integer 
//If we give the val an integer it will check for the same
// in the array if that matches then it will remove that element from the array 


// We cannot us another array to save the result 
class RemoveElement{
  public static void main(String [] args){
      int val=3;
      int nums[]={2,3,3,2};
      System.out.print(removeElement(nums,val));
      
  }
  public static int removeElement(int[] nums, int val) {
      int count=0;
      for (int i=0;i<nums.length;i++){
          if(nums[i]!=val){
              nums[count]=nums[i];
              count++;
          }    
      }
      return count;
  }
}