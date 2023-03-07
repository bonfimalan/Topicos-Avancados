package notification.decorator;

import notification.notifier.Notifier;

public class EmailDecorator extends BaseDecorator {
    
    public EmailDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        return wrapper.send(message) + "\nSending email: " + message;
    }
}
