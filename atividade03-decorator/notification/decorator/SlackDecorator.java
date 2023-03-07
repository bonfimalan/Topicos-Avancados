package notification.decorator;

import notification.notifier.Notifier;

public class SlackDecorator extends BaseDecorator {
    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        return wrapper.send(message) + "\nSending Slack: " + message;
    }
}
