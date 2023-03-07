package notification.decorator;

import notification.notifier.Notifier;

public abstract class BaseDecorator extends Notifier {
    protected Notifier wrapper;

    public BaseDecorator(Notifier notifier) {
        this.wrapper = notifier;
    }
}
