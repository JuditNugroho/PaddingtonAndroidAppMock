package com.example.sisalfamart.models;

public class MenuModel {

    public String namaMenu;
    public boolean hasChildren,isGroup;

    public MenuModel(String namaMenu, boolean hasChildren, boolean isGroup) {
        this.namaMenu = namaMenu;
        this.hasChildren = hasChildren;
        this.isGroup = isGroup;
    }

}
