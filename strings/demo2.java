//  non repeating character 
class demo2{
       public static void main(String[] args) {
        String str="rishabh";
        for(int i=0 ; i <= str.length(); i++){
           char ch=str.charAt(i);
           int c=0;
            for ( int j=0;j<str.length();j++){
               if(str.charAt(j)==ch);
                   }c++;

                if(c==1){
                     System.out.println(ch);
                       break;
        }
    }
}
}