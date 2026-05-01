// check for pallindrome
class demo3{
       public static void main(String[] args) {
         String str="madam";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
        rev+=str.charAt(i);}
        if(str.equals(rev)){               //== check  for value
            System.out.println("pallindrome");
                    }
        else{
            System.out.println("not a pallindrome");
            }

              // check string is a pallindrome or not
        // String str="hello";
        // String rev="";
        // for(int i=str.length()-1;i>=0;i--){
        // rev+=str.charAt(i);}
        // if(str==rev){               //== check for memory allocation or addrees not for value
        //     System.out.println("pallindrome");
        //             }
        // else{
        //     System.out.println("not a pallindrome");
        //     }
        

       
}
}