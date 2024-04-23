import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        FileWriter fileWriter = new FileWriter("my_todo_list.txt");
        String toWrite = "just write something";
        fileWriter.close();
    }
}