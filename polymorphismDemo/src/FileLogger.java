public class FileLogger extends BaseLogger {
    @Override
    public void log(String messages) {
        System.out.println("Logged to File : " + messages);
    }
}
