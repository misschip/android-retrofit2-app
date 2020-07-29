package com.pyj.retrofit2ex01;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    private int userId;
    private int id;
    // @Expose 쓰면  이 필드를 JSON 데이터 만들때 제외하게 됨
    private String title;
    @SerializedName("body") // JSON 데이터로 만들 때 이름 지정
    private String text;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}