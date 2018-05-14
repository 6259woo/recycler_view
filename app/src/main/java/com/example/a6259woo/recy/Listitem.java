package com.example.a6259woo.recy;

/**
 * Created by 6259woo on 2018. 5. 14..
 */

public class Listitem {
    String title;
    String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Listitem(String title, String content) {
        this.title = title;
        this.content = content;

    }
}
