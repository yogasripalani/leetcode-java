class Solution {
    public boolean isPalindrome(String s) {
    //     int size=s.length();
    // String temp="";
    // Boolean flag=true;
    // for(int index=0;index<size;index++){
        
    //     if(Character.isLetterOrDigit(s.charAt(index))){
    //     if(s.charAt(index)>='A'&& s.charAt(index)<='Z' )
    //         temp=temp+((char)(s.charAt(index)+32));
    //     else if((s.charAt(index)>='a'&& s.charAt(index)<='z') || (s.charAt(index)>='0'&& s.charAt(index)<='9'))
    //         temp=temp+s.charAt(index);
    //     }
    // }
    // int left=0;
    // int right=temp.length()-1;
    // while(left<right 
    // ){
    //     if(temp.charAt(left)!=temp.charAt(right)){
    //         flag=false;
    //         break;
    //     }
    //     left++;
    //     right--;
    // }
    // return flag;
   
    Boolean flag=true;
    int size=s.length();
    int left=0;
    int right=size-1;
    while(left<right){
        if(Character.isLetterOrDigit(s.charAt(left))){
            if(Character.isLetterOrDigit(s.charAt(right))){
                if(Character.toLowerCase(s.charAt(left))==Character.toLowerCase(s.charAt(right)))
                {
                left++;
                right--;
                }
                else{
                    flag=false;
                    break;
                }
            }
            else
                right--;
        }
        else
            left++;
    }
    return flag;
    }
}