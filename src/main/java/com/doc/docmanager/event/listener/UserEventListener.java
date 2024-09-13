package com.doc.docmanager.event.listener;


import com.doc.docmanager.event.UserEvent;
import com.doc.docmanager.service.EmailService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserEventListener {
    private final EmailService emailService;

    @EventListener
    public void onUserEvent(UserEvent event){
        switch(event.getType()){
            case REGISTRATION -> emailService.sendNewAccountEmail(event.getUser().getFistName(), event.getUser().getEmail(), (String)event.getData().get("key"));
            case RESETPASSWORD -> emailService.sendPasswordResetEmail(event.getUser().getFistName(), event.getUser().getEmail(), (String)event.getData().get("key"));
            default -> {}
        }
    }
}
