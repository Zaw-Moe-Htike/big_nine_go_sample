package com.johnsmith.zawmoehtike.big9eg.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/*
    Created at 14/03/19 by Zaw Moe Htike
 */
public class Big9Data {
    /*
        "MainPage" : "Home",
"SubPage" :
     */

    @SerializedName("MainPage")
    private String mainPage;

    @SerializedName("SubPage")
    private List<SubPage> subPage;

    public String getMainPage() {
        return mainPage;
    }

    public void setMainPage(String mainPage) {
        this.mainPage = mainPage;
    }

    public List<SubPage> getSubPage() {
        return subPage;
    }

    public void setSubPage(List<SubPage> subPage) {
        this.subPage = subPage;
    }
}
