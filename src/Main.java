public class Main {

    public static void main(String[] args) {
        String s="1211";
        String returnString="";
        
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }else{
                    returnString+=String.valueOf(count)+s.charAt(i);
                    i=j-1;
                    break;
                }
//                returnString+=String.valueOf(count)+s.charAt(i);
//                i=j-1;
            }
        }
        System.out.println(returnString);
    }
}
