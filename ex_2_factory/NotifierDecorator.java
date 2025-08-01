package design;

public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotifier;

    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

   
    public void send(String message) {
        wrappedNotifier.send(message);
    }
}
