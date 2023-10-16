import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        File file = new File(
                "src/Ex1.txt");
        BufferedReader br
                = new BufferedReader(new FileReader(file));
        String st;
        HashMap hashMap = new HashMap<>(100);

        while ((st = br.readLine()) != null)
        {
            int value = Integer.parseInt(st);
            LinkList.Node node = new LinkList.Node(value,value);
        }


    }

}

