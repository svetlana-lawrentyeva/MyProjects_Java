package starstofile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StarsFile
{
  public static void main(String[] args)
  {
//    toFile();
    fromFile();    
  }
  private static void toFile()
  {
    File f=new File("f.txt");
    try
    {
    FileWriter fw = new FileWriter(f);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter pw=new PrintWriter(bw);
    
    for(int i=0;i<17;++i)
    {
      for(int j=0;j<17;++j)
      {
        if(i==0||i==16||j==0||j==16)
        {
          pw.print("*");
        }
        else
        {
          pw.print(" ");
        }
      }
      pw.println();
    }
    pw.close();
    bw.close();
    fw.close();
    }
    catch(IOException ex)
    {
      System.out.println(ex.getMessage());
    }
  }
  public static void fromFile()
  {
    File f = new File("f.txt");
    try
    {
      FileReader fr = new FileReader(f);
      BufferedReader br = new BufferedReader(fr);
      String tmp;
      while((tmp=br.readLine())!=null)
      {
        System.out.println(tmp);
      }
      br.close();
      fr.close();
    }
    catch(IOException ex)
    {
      System.out.println(ex.getMessage());
    }
  }
}
