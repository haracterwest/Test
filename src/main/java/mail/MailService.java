package mail;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<IMessage<T>> {
    private static class MyHashMap<K,V> extends HashMap<K,V> {

        @Override
        public V get(Object key) {
            V temp = super.get(key);
            try {
                if (temp == null) {
                    temp = (V) Collections.emptyList();
                }
            } catch (ClassCastException e) {
            }
            return temp;
        }
    }

    private Map<String, List<T>> mailBox;

    public MailService() {
        mailBox = new MyHashMap<>();
    }

    @Override
    public void accept(IMessage<T> mailMessage) {
        String to = mailMessage.getTo();
        if (!mailBox.containsKey(to)) {
            mailBox.put(to, new ArrayList<>());
        }
        mailBox.put(to, mailBox.get(to)).add((T) mailMessage.getContent());
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}
