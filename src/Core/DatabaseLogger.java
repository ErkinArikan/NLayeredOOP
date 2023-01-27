package Core;

public class DatabaseLogger implements Logger{
    @Override
    public void addLogger(String data) {
        System.out.println("Logging to Database " + data);
    }
}
