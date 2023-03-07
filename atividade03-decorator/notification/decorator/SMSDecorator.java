package notification.decorator;

import notification.notifier.Notifier;

public class SMSDecorator extends BaseDecorator{

    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        return wrapper.send(message) + "\nSending SMS: " + message;
    }
    
}
