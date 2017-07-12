package com.kingbbode.chatbot.autoconfigure.common.request;


import com.kingbbode.chatbot.autoconfigure.conversation.Conversation;
import lombok.Builder;
import lombok.Data;
import org.springframework.util.StringUtils;

/**
 * Created by YG on 2017-01-23.
 */
@Data
@Builder
public class BrainRequest {
    private String messageNo;
    private String team;
    private String user;
    private String room;
    
    
    private String content;
    private Conversation conversation;
    /*
    public BrainRequest(EventResponse.Event.Chat chat, MessageResponse.Message message) {
        this.user = String.valueOf(message.getUser());
        this.room = chat.getRoom();
        this.content = message.getContent()!=null?message.getContent().trim():null;
        this.messageNo = String.valueOf(message.getMsg());
        this.team = String.valueOf(chat.getTeam());
    }

    public BrainRequest(String user, String room, String content) {
        this.user = user;
        this.room = room;
        this.content = content;
    }*/

    public boolean isValid(){
        return !StringUtils.isEmpty(content);
    }

    @Override
    public String toString() {
        return "BrainRequest{\n" +
                "team=" + team + "\n" + 
                "message no=" + messageNo + "\n" + 
                "user='" + user + "\n" +
                "room='" + room + "\n" +
                "\n}";
    }
}
