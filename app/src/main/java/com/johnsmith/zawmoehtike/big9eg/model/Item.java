package com.johnsmith.zawmoehtike.big9eg.model;

import com.google.gson.annotations.SerializedName;

/*
    Created at 14/03/19 by Zaw Moe Htike
 */
public class Item {
    /*
    "ItemID" : "ITEM_1",
						"ItemType" : "SingleItem",
						"ItemName" : "American Movie",
						"ItemName2" : "Movie",
						"ItemIcon" : "https://images.big9.tv/Myanmar%20Movies/Myanmar-Movies-Main-Cover-1.jpg",
						"ItemDisplaySeq" : "1",
						"ItemDisplayWidth" : "1.5",
						"IsFree" : "1",
						"iOSLaunchURL" : "",
						"iOSAppStoreLaunchURL" : "",
						"AndroidPlayStoreURL": "",
						"AvailableInPlatform": "",
						"ActionLink": "-",
						"VENDORCODE": "Big9",
						"EpisodeName": "Episode 1",
						"Category": "Series",
						"Packages": ""
     */

    @SerializedName("ItemType")
    private String itemType;

    @SerializedName("ItemName")
    private String itemName;

    @SerializedName("ItemName2")
    private String itemName2;

    @SerializedName("ItemIcon")
    private String itemIcon;

    @SerializedName("ItemDisplaySeq")
    private String itemDisplaySeq;

    @SerializedName("ItemDisplayWidth")
    private String itemDisplayWidth;

    @SerializedName("IsFree")
    private String isFree;

    @SerializedName("iOSLaunchURL")
    private String iOsLaunchUrl;

    @SerializedName("iOSAppStoreLaunchURL")
    private String iOsAppStoreLaunchUrl;

    @SerializedName("AndroidPlayStoreURL")
    private String androidPlayStoreUrl;

    @SerializedName("AvailableInPlatform")
    private String availableInPlatform;

    @SerializedName("ActionLink")
    private String actionLink;

    @SerializedName("VENDORCODE")
    private String vendorCode;

    @SerializedName("EpisodeName")
    private String episodeName;

    @SerializedName("Category")
    private String category;

    @SerializedName("Packages")
    private String packages;

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName2() {
        return itemName2;
    }

    public void setItemName2(String itemName2) {
        this.itemName2 = itemName2;
    }

    public String getItemIcon() {
        return itemIcon;
    }

    public void setItemIcon(String itemIcon) {
        this.itemIcon = itemIcon;
    }

    public String getItemDisplaySeq() {
        return itemDisplaySeq;
    }

    public void setItemDisplaySeq(String itemDisplaySeq) {
        this.itemDisplaySeq = itemDisplaySeq;
    }

    public String getItemDisplayWidth() {
        return itemDisplayWidth;
    }

    public void setItemDisplayWidth(String itemDisplayWidth) {
        this.itemDisplayWidth = itemDisplayWidth;
    }

    public String getIsFree() {
        return isFree;
    }

    public void setIsFree(String isFree) {
        this.isFree = isFree;
    }

    public String getiOsLaunchUrl() {
        return iOsLaunchUrl;
    }

    public void setiOsLaunchUrl(String iOsLaunchUrl) {
        this.iOsLaunchUrl = iOsLaunchUrl;
    }

    public String getiOsAppStoreLaunchUrl() {
        return iOsAppStoreLaunchUrl;
    }

    public void setiOsAppStoreLaunchUrl(String iOsAppStoreLaunchUrl) {
        this.iOsAppStoreLaunchUrl = iOsAppStoreLaunchUrl;
    }

    public String getAndroidPlayStoreUrl() {
        return androidPlayStoreUrl;
    }

    public void setAndroidPlayStoreUrl(String androidPlayStoreUrl) {
        this.androidPlayStoreUrl = androidPlayStoreUrl;
    }

    public String getAvailableInPlatform() {
        return availableInPlatform;
    }

    public void setAvailableInPlatform(String availableInPlatform) {
        this.availableInPlatform = availableInPlatform;
    }

    public String getActionLink() {
        return actionLink;
    }

    public void setActionLink(String actionLink) {
        this.actionLink = actionLink;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }
}
