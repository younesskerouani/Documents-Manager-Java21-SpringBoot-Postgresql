package com.doc.docmanager.event;


import com.doc.docmanager.entity.UserEntity;
import com.doc.docmanager.enumeration.EventType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class UserEvent {
    private UserEntity user;
    private EventType type;
    private Map<?,?> data;
}
