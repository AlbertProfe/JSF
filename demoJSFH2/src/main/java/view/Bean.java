package view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Message;
import service.MessageService;

import java.util.List;

import javax.annotation.PostConstruct;


@Named
@RequestScoped
public class Bean {

	private Message message = new Message();
    private List<Message> messages;

    @Inject
    private MessageService messageService;

    @PostConstruct
    public void init() {
        messages = messageService.list();
    }
    
    public void submit() {
        messageService.create(message);
        messages.add(message);
        message = new Message();
    }
    
    public Message getMessage() {
        return message;
    }
    
    public List<Message> getMessages() {
        return messages;
    }
}