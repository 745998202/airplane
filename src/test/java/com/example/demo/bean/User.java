package com.example.demo.bean;

public class User {
    public int road_type;//航班路线
    public int site_type;//舱位
    public int package_num;//行李件数
    public bag[] packages;//行李列表

    public int getRoad_type() {
        return road_type;
    }

    public int getSite_type() {
        return site_type;
    }

    public int getPackage_num() {
        return package_num;
    }

    public void setRoad_type(int road_type) {
        this.road_type = road_type;
    }

    public void setSite_type(int site_type) {
        this.site_type = site_type;
    }

    public void setPackage_num(int package_num) {
        this.package_num = package_num;
    }

    public void setPackages(bag[] packages) {
        int size = packages.length;
        this.packages = new bag[size];
        for(int i = 0; i < size ; i++){
            this.packages[i] = new bag(packages[i].getChicun(),packages[i].getZhong());
        }
    }

    public User(int road_type,int site_type,int package_num,bag[] bags){
        this.road_type = road_type;
        this.site_type = site_type;
        this.package_num = package_num;
        int size = 0;
        if(null != bags){
            size = bags.length;
        }
        for(int i = 0; i < size ; i++){
            this.packages[i].setChicun(packages[i].getChicun());
            this.packages[i].setZhong(packages[i].getZhong());
        }
    }
}
