import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File dir = new File("src");
        File dir1 = new File("res");
        File dir2 = new File("savegames");
        File dir3 = new File("temp");
        File dir4 = new File("src/main");
        File dir5 = new File("src/test");
        File item = new File("src/main/Main.java");
        File item1 = new File("src/main/Utils.java");
        File dir6 = new File("res/drawables");
        File dir7 = new File("res/vectors");
        File dir8 = new File("res/icons");
        File item2 = new File("temp/temp.txt");

        if (dir.mkdir()) {
            System.out.println((dir.getName() + "Создалась"));
        }
        if (dir1.mkdir()) {
            System.out.println((dir1.getName() + "Создалась"));
        }
        if (dir2.mkdir()) {
            System.out.println((dir2.getName() + "Создалась"));
        }
        if (dir3.mkdir()) {
            System.out.println((dir3.getName() + "Создалась"));
        }
        if (dir4.mkdir()) {
            System.out.println((dir4.getName() + "Создалась"));
        }
        if (dir5.mkdir()) {
            System.out.println((dir5.getName() + "Создалась"));
        }
        try {
            if (item.createNewFile()) {
                System.out.println((item.getName() + "Created"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (item1.createNewFile()) {
                System.out.println((item1.getName() + "Created"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (dir6.mkdir()) {
            System.out.println((dir6.getName() + "Создалась"));
        }
        if (dir7.mkdir()) {
            System.out.println((dir7.getName() + "Создалась"));
        }
        if (dir8.mkdir()) {
            System.out.println((dir8.getName() + "Создалась"));
        }
        try {
            if (item2.createNewFile()) {
                System.out.println((item2.getName() + "Created"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder sb = new StringBuilder();

        sb.append("Создана директория успешно" + " " + dir.getName()).append("\n").append("Создана директория успешно" + " " + dir1.getName())
                .append("\n").append("Создана директория успешно" + " " + dir2.getName()).append("\n")
                .append("Создана директория успешно" + " " + dir3.getName()).append("\n").append("Создана директория успешно" + " " + dir4.getName())
                .append("\n").append("Создана директория успешно" + " " + dir5.getName()).append("\n").append("Файл создан успешно" + " " + item.getName())
                .append("\n").append("Файл создан успешно" + " " + item1.getName()).append("\n").append("Создана директория успешно" + " " + dir6.getName())
                .append("\n").append("Создана директория успешно" + " " + dir7.getName()).append("\n").append("Создана директория успешно" + " " + dir8.getName())
                .append("\n").append("Файл создан успешно" + " " + item2.getName());


        final String rezult = sb.toString();

        byte[] sbb = rezult.getBytes();
        File file = new File("temp/temp.txt");
        try (FileOutputStream
                     fos = new FileOutputStream(file)) {
            fos.write(sbb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


