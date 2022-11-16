class AxisOrbit{
    public static void main(String args[]){
        String s="nitin";
        System.out.println(countPalindrome(s));
    }
    public static int countPalindrome(String s){
        for(int axis=0;axis<s.length;axis++){
            for(int orbit=0;orbit<s.length && axis-orbit>=0 && axis+orbit;orbit++){
                if(s.charAt((int)axis-orbit)!=s.charAt((int)axis+orbit)){
                    break;
                }
                
                count++;
            }
        }
        return count;
    }
}