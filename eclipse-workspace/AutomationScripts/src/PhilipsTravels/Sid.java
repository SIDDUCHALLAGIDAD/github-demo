package PhilipsTravels;

public class Sid 
{
public static void main(String[] args) 
{
  String word = "H2i re45tf b5sw 123";
   
  for(int i=0;i<word.length();i++)
  {     
      if(word.charAt(i)>='0')
          if(word.charAt(i)<='9')
          word=word.replaceAll("[a-z A-Z]","");   
  }
   word.replaceAll("//s", "")    ;
  System.out.println(word);
   
}
}
