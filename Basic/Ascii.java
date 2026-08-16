public class Ascii {
    public static void main(String[] args) {
        // Capital letters: A = 65 to Z = 90
        // Small letters:   a = 97 to z = 122
       // Digits:          0 = 48 to 9 = 57
       //typecasting->ek data type se dusre data type me conversion
       char ch='A';
       int x=ch;//implicit typecasting
       System.out.println(x);
       char Nitesh='$';
       int y=Nitesh;
       System.out.println(y);
       char Shivam='@';
       int y1=(int)Shivam;//explicit type casting mean dikha ke khuleyam karna
       System.out.println(y1);
       char c2='3';
       System.out.println((int)c2);
       //how to find ascii value of any character
       char ch1='c';
       System.out.println(ch1+0);
       System.out.println(ch1*1);
    //integer to character
    int x3=43;
    char ch3=(char)x3;
    System.out.println(ch);
    int x4=70;
    char ch4=(char)x4;
    System.out.println(ch4);
    }
}
