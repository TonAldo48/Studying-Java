public class MyFirstClass {
    public static void main(String[] args) {

        System.out.println(GenerateMessage.generateMessage());
        System.out.println(GenerateAnotherMessage.generateAnotherMessage());
    }
}

class GenerateMessage {
    static String generateMessage() {
        return "Here's the first message!";
    }
}

class GenerateAnotherMessage {
    static String generateAnotherMessage() {
        return "Here's the second message!";
    }
}