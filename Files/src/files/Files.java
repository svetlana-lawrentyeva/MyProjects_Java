package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Scanner;

public class Files
{  
  public static void main(String[] args) throws FileNotFoundException, IOException
  {
    String fileName;
    Scanner sc=new  Scanner(System.in);
    System.out.println("Введите директорию для просмотра содержимого:");
    fileName=sc.next();
    getFiles(fileName);
    getFolders(fileName);
    System.out.println("Введите файл для получения информации:");
    fileName=sc.next();
    getInfo(fileName);
    System.out.println("Введите файл для копирования:");
    fileName=sc.next();
    System.out.println("Введите путьЮ куда копировать:");
    String outFileName=sc.next();
    File in = new File(fileName);
    File out=new File(outFileName);
    FileInputStream fis = new FileInputStream(in);
    FileOutputStream fos = new FileOutputStream(out);
    fileCopy(fis, fos);
  }
  public static void getFiles(String fileName)
  {
    System.out.println("FILES:");
    File f=new File(fileName);
    File[]list=f.listFiles();
    for(int i=0;i<list.length;++i)
    {
      if(list[i].isFile()&!list[i].isHidden())
      {
        System.out.println(list[i].getName());
      }
    }
  }
  public static void getFolders(String fileName)
  {
    System.out.println("FOLDERS:");
    File f=new File(fileName);
    File[]list=f.listFiles();
    for(int i=0;i<list.length;++i)
    {
      if(list[i].isDirectory()&!list[i].isHidden())
      {
        System.out.println(list[i].getName());
      }
    }
  }
  public static void getInfo(String fileName)
  {
    File f=new File(fileName);
    System.out.println("size is " + f.length()+" bites");
    System.out.println("last modified "+new Date(f.lastModified()));
  }
    public static void fileCopy(InputStream is, OutputStream os) throws IOException
  {
    int nLength;
    byte[] buf = new byte[8000];
    
    while(true)
    {
      nLength = is.read(buf);
        if(nLength < 0) 
          break;
      os.write(buf, 0, nLength);
    }

    is.close();
    os.close();
  }
}
