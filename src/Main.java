import java.io.*;

public class Main {
    public static void main(String[] args) {
        String data = "JAVA OGRENIYORUM :)";
        try{
            FileOutputStream output = new FileOutputStream("test.txt");
            BufferedOutputStream buffOutput = new BufferedOutputStream(output);

            byte[] buffArray = data.getBytes();

            buffOutput.write(buffArray);
            output.close();
            buffOutput.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
       /*try{
           File newBinder = new File("test.txt");
           newBinder.createNewFile();
           FileInputStream input = new FileInputStream("test.txt");
           BufferedInputStream buff = new BufferedInputStream(input);
           int i = buff.read();
           while (i!=-1){
               System.out.print((char) i);
               i=buff.read();
           }
       }catch (Exception e){
           System.out.println(e.getMessage());
       }*/

    }
}
