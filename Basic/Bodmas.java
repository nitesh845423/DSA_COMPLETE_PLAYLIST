
public class Bodmas{
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        a=a+6;
        System.out.println(a);
        a=a*4;
        System.out.println(a);
        int x=10;
        System.out.println("preincrement: "+ ++x);//preincrement->pahle ek badao original value me then print karo ; so result will be 11
        System.out.println("post increement: "+ x++);//post increment ->pahle value likho then increment karo//11 print hoga
        System.out.println("Predecrement: "+ --x);//pre decrement ->pahle ghatao fir likho->11 print hoga
        System.out.println("Post decrement: "+ x--);//post dcrement-> pahle likho fir ghatao->11

    }
}
