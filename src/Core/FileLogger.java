package Core;

public class FileLogger implements Logger{

    @Override
    public void addLogger(String data) {
        System.out.println("Logging to File " + data);

    }
}
