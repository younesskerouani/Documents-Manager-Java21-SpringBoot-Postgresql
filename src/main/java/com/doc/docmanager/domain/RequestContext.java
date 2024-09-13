package com.doc.docmanager.domain;

public class RequestContext {

    private static final ThreadLocal<Long> USER_ID = new ThreadLocal<>();
    private RequestContext(){}
    private static void start() {
        USER_ID.remove();
    }
    public static void setUserId(Long userId){ USER_ID.set(userId);}
    public static Long getUserId(){ return USER_ID.get(); }
}
