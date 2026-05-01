class demo4{
    public static void main(String args[]){
       // string reverse

        String str="hello";
        String rev=" ";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev); 
    }
}