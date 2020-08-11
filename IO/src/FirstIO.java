import java.io.IOException;
import java.io.OutputStream;

public class FirstIO {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream=null;
        try {
            outputStream=System.out;
            String data = "vineel mathew";
            char[] Array = data.toCharArray();
            for (int i = 0; i < Array.length; i++) {
                char c = Array[i];
                outputStream.write(c);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            outputStream.close();
        }

    }
}
