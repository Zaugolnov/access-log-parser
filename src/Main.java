import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        //c:/java/access.log
        while (true) {
            System.out.println(" Введите путь к файлу");
            String path = new Scanner(System.in).nextLine();
            System.out.println(path);
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists || isDirectory) {
                System.out.println("Файл не существует или указанный путь является путём к папке");
                continue;
            }
            count++;
            System.out.println("Путь указан верно");
            System.out.println("Это файл номер " + count);
        }
    }
}
