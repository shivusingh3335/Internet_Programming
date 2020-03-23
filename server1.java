import java.util.*;
import java.io.*;
import java.net.*;
class server1
{
    public static void main(String argc[]) throws Exception
    {
      try
      {
         String com=new String();
         ServerSocket ss=new ServerSocket(1001);
         Socket s=ss.accept();
         BufferedReader ja=new BufferedReader(new    InputStreamReader(s.getInputStream()));
         PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
         pw.println("Hi How are you");
         do
         {
             com=ja.readLine();
             System.out.println(com);
             InputStreamReader inp=new InputStreamReader(System.in);
             BufferedReader rdr=new BufferedReader(inp);
             String text=rdr.readLine();
             pw.println(text);
         }while(!com.equalsIgnoreCase("end"));
     }
     catch(Exception e)     {		     }
  }


}