class Solution {
    public void reverseString(char[] s) {
        int size=s.length;
        int right=size-1;
        int left=0;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<size;i++){
            System.out.print(s[i]);
        }

      
    }
}