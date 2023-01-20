package com.example.firebasetorecyclerjamal;

public class modal {

    String message,title;

    public modal() {
    }

    public modal(String message, String message_id, String title) {
        this.message = message;
     //   this.message_id = message_id;
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

//    public String getMessage_id() {
//        return message_id;
//    }
//
//    public void setMessage_id(String message_id) {
//        this.message_id = message_id;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
