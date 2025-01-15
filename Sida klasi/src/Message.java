public abstract class Message{
    String sender;
    String recipient;
    String messageText;

    public Message(String sender, String recipient, String messageText){
        this.sender = sender;
        this.recipient = recipient;
        this.messageText = messageText;
    }

    public abstract void send();
    public abstract void receive();
}