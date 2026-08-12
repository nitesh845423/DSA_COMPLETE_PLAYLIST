public class ReverseSB{
    public static void main(String[] args) {
     //   String s="LeveL";
     //   StringBuilder sb=new StringBuilder(s);
        //sb.reverse();
        /*int i=0;int j=sb.length()-1;
        while(i<=j){
            char temp1=sb.charAt(i);
            char temp2=sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);*/
       String s1 = "Devesh";
StringBuilder sb1 = new StringBuilder(s1);

sb1.deleteCharAt(1);       // removes character at index 1: 'e'
System.out.println(sb1);   // Dvesh

sb1.insert(1, 'e');
System.out.println(sb1);   // Devesh

sb1.delete(3, 6);          // deletes indexes 3 through 5 (end index excluded)
System.out.println(sb1);   // Dev
    }
}