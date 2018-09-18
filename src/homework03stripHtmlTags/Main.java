//Напишите метод, с именем stripHtmlTags, который принимает Scanner, представляющий собой входной файл, содержащий
//        веб страницу формата HTML в качестве параметра, а затем считывает этот файл и выводит текст файла без HTML
//        тегов. Тег, как известно, представляет собой текст между символами < и >.
//        Например, рассмотрим следующий текст:
//
//        <html>
//        <head>
//        <title>My web page</title>


package homework03stripHtmlTags;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        File file = new File("file.txt");

        Scanner sc = null;

        try {

            sc = new Scanner(file);
            stripHtmlTags(sc);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } finally {
            sc.close();

        }
        System.out.println("Hello World!");
    }

    public static void stripHtmlTags(Scanner scanner) {

        List<String> textlist = new ArrayList<String>();
        Scanner sc = scanner;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String nohtml= line.replaceAll("\\<.*?>", "");
            textlist.add(nohtml);
        }
        for (String s:textlist)
            System.out.println(s);
    }
}

