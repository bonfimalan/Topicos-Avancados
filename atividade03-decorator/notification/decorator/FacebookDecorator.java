package notification.decorator;

import notification.notifier.Notifier;

public class FacebookDecorator extends BaseDecorator{
    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        return wrapper.send(message) + "\nSending Facebook message: " + message;
    }
}
