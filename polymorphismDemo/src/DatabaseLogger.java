public class DatabaseLogger extends BaseLogger {
    @Override
    public void log(String messages) {
        System.out.println("Logged to Database : " + messages);
    }
}
