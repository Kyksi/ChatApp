package com.naz.chatapp.Notifications;

public class Token {
    private String token;

    public Token(String token){
        this.token = token;
    }

    public Token(){

    }

    public String goToken(){
        return token;
    }

    public void setToken(String token){
        this.token = token;
    }
}

