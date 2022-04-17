package pro.sky.java.homeworks.course5;

public class Main {

    public static void main(String[] args) {
        String example = "I love summer and spring";
        String[] strMasssive = example.split(" ", 5);

        for (String words : strMasssive) {
            System.out.println(words);
        }
    }
}
