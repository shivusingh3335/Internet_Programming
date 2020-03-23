import java.util.*;
import java.io.*;
import java.net.*;
class client1
{
   public static void main(String arg[]) throws Exception
   {
      String rec=new String();
      String res=new String();
      Socket s=new Socket("localhost",1001);
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
      PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
      res=br1.readLine();
      System.out.println(res);
      do
      {
         rec=br.readLine();
         pw.println(rec);
         res=br1.readLine();
         System.out.println(res);
      }while(!rec.equalsIgnoreCase("end"));
   }
}
