class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        ArrayList list1=new ArrayList();
        ArrayList list2=new ArrayList();
        int size1=s.length();
        int size2=t.length();
        for(int i=0;i<size1;i++){
            list1.add(s.charAt(i));
        }
        for(int i=0;i<size2;i++){
             list2.add(t.charAt(i));
        }
        list1.sort(null);
        list2.sort(null);
        
        return list1.equals(list2);
    }
}