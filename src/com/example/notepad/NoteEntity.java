package com.example.notepad;
import java.time.LocalDateTime;


public class NoteEntity {

    private String title;
    private String content;
    private LocalDateTime lastUpdatedDatetime;

    private NoteEntity(String title, String content){
        this.title = title;
        this.content = content;
        this.lastUpdatedDatetime = LocalDateTime.now();
    }
    static NoteEntity newInstance(String title, String content){
        return new NoteEntity(title, content);
    }

    void update(String content){
        this.content=content;
        this.lastUpdatedDatetime = LocalDateTime.now();
    }

    String getTitle() {
        return title;
    }

    String getContent() {
        return content;
    }

    String getLastUpdatedDatetime() {
        return lastUpdatedDatetime.toString();
    }
}
