package com.johnsmith.zawmoehtike.big9eg.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/*
    Created at 14/03/19 by Zaw Moe Htike
 */
public class SubPage {
    /*
    "SubPageID": "086cdd35-9988-40ec-9b15-b58ade4cfd5e",
            "SubPageType": "SingleItem",
            "SubPageName": "Single Item",
            "SubPageName2": "test",
            "SubPageDisplaySeq": "30",
            "SubPageImageType": "Landscape Big",
            "SubPageNoOfRows": "0",
            "SeeAllID":"83b1e07e-c367-4551-a853-0bf2a52bbe01",
			"Items" :
     */

    @SerializedName("SubPageID")
    private String subPageId;

    @SerializedName("SubPageType")
    private String subPageType;

    @SerializedName("SubPageName")
    private String subPageName;

    @SerializedName("SubPageName2")
    private String subPageName2;

    @SerializedName("SubPageDisplaySeq")
    private String subPageDisplaySeq;

    @SerializedName("SubPageImageType")
    private String subPageImageType;

    @SerializedName("SubPageNoOfRows")
    private String subPageNoOfRows;

    @SerializedName("SeeAllID")
    private String seeAllId;

    @SerializedName("Items")
    private List<Item> items;

    public String getSubPageId() {
        return subPageId;
    }

    public void setSubPageId(String subPageId) {
        this.subPageId = subPageId;
    }

    public String getSubPageType() {
        return subPageType;
    }

    public void setSubPageType(String subPageType) {
        this.subPageType = subPageType;
    }

    public String getSubPageName() {
        return subPageName;
    }

    public void setSubPageName(String subPageName) {
        this.subPageName = subPageName;
    }

    public String getSubPageName2() {
        return subPageName2;
    }

    public void setSubPageName2(String subPageName2) {
        this.subPageName2 = subPageName2;
    }

    public String getSubPageDisplaySeq() {
        return subPageDisplaySeq;
    }

    public void setSubPageDisplaySeq(String subPageDisplaySeq) {
        this.subPageDisplaySeq = subPageDisplaySeq;
    }

    public String getSubPageImageType() {
        return subPageImageType;
    }

    public void setSubPageImageType(String subPageImageType) {
        this.subPageImageType = subPageImageType;
    }

    public String getSubPageNoOfRows() {
        return subPageNoOfRows;
    }

    public void setSubPageNoOfRows(String subPageNoOfRows) {
        this.subPageNoOfRows = subPageNoOfRows;
    }

    public String getSeeAllId() {
        return seeAllId;
    }

    public void setSeeAllId(String seeAllId) {
        this.seeAllId = seeAllId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
