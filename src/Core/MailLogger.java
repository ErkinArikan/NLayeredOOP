package Core;

public class MailLogger implements Logger{
    @Override
    public void addLogger(String data) {
        System.out.println("Logging to Mail " + data);

    }
}
