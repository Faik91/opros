package opros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Opros {

    public static void main(String[] args) throws IOException {

        File file = new File("opros.txt");
        if(!file.exists()){
            file.createNewFile();
        }


        FileWriter fileWriter = new FileWriter(file, true);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Как вас зовут?");
        String answer1 = scanner.nextLine();
        System.out.println("Сколько вам лет?");
        String answer2 = scanner.nextLine();
        System.out.println("Какое у вас хобби?");
        String answer3 = scanner.nextLine();

        fileWriter.write("Name: " + answer1);
        fileWriter.append("\n");
        fileWriter.write("Age: " + answer2);
        fileWriter.append("\n");
        fileWriter.write("Hobby: " + answer3);
        fileWriter.append("\n");
        fileWriter.append("\n");
        fileWriter.close();

    }
}
