package notification;

import notification.decorator.EmailDecorator;
import notification.decorator.FacebookDecorator;
import notification.decorator.SMSDecorator;
import notification.decorator.SlackDecorator;
import notification.notifier.Notifier;

public class Main {
    public static void main(String... args) {
        String message = "Fazendinha hmmm";
        Notifier notifier = new Notifier();
        notifier = new SMSDecorator(notifier);
        notifier = new EmailDecorator(notifier);
        notifier = new SlackDecorator(notifier);
        notifier = new FacebookDecorator(notifier);

        System.out.println(notifier.send(message));
    }
}
