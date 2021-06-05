public class EmailLogger extends BaseLogger{
    @Override
    public void log(String messages) {
        System.out.println("Logged to Email : " + messages);
    }
}
