public class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("Invalid age");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
} {
    
}
