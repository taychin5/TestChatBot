package com.example.test_chat_app_two.value_class;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.example.test_chat_app_two.activities.homePage.Home_activity;

import java.util.ArrayList;

/**
 * Created by Toddy on 30/03/2018.
 */

public class MainStory {
    private int allstory;


    private int MainImage;
    private String storyTitle;
    private String newActivity;


    // mainImage Getter n setter

    public int getMainImage() {
        return MainImage;
    }

    public void setMainImage(int mainImage) {
        MainImage = mainImage;
    }


    // StoryTitle Getter n setter

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }


    // ActivityToGo Getter n setter

    public String getNewActivity() {

        return newActivity;
    }

    public void setNewActivity(String newActivity) {
        this.newActivity = newActivity;
    }


    public int getAllStory() {
        return allstory;
    }

}