import java.io.*;
class string
{
    public static void main(String args[])throws IOException
     {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s1,rev="";
        System.out.println("Enter the string");
        s1=in.readLine();
        int l=s1.length();
        System.out.println("Length = "+l);
        for(int i=l-1;i>=0;i--)
        rev=rev+s1.charAt(i);
        System.out.println("String in reverse is " + rev);
    }
}