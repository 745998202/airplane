package com.example.demo.bean;

public class receive_bag {
    //用于传入前端页面接受包裹信息的类
    //因为只能是第一层，所以只能这么写了
    public int now_size = 0;
    public int bag_1_zhong;
    public int bag_1_size;
    public int bag_2_zhong;
    public int bag_2_size;
    public int bag_3_zhong;
    public int bag_3_size;
    public int bag_4_zhong;
    public int bag_4_size;
    public int bag_5_zhong;
    public int bag_5_size;
    public int bag_6_zhong;
    public int bag_6_size;
    public int bag_7_zhong;
    public int bag_7_size;
    public int baby_num;
    public int road_type = 0;
    public int site_type = 0;

    public receive_bag(){
        now_size = 0;
        bag_1_zhong = 0;
        bag_1_size = 0;
        bag_2_zhong = 0;
        bag_2_size = 0;
        bag_3_zhong = 0;
        bag_3_size = 0;
        bag_4_zhong = 0;
        bag_4_size = 0;
        bag_5_zhong = 0;
        bag_5_size = 0;
        baby_num = 0;
        road_type = 0;
        site_type = 0;
    }

    public void setSite_type(int site_type) {
        this.site_type = site_type;
    }

    public int getSite_type() {
        return site_type;
    }

    public void setRoad_type(int road_type) {
        this.road_type = road_type;
    }

    public int getRoad_type() {
        return road_type;
    }

    public int getBaby_num() {
        return baby_num;
    }

    public void setBaby_num(int baby_num) {
        this.baby_num = baby_num;
    }

    public int getNow_size() {
        return now_size;
    }

    public void setNow_size(int now_size) {
        this.now_size = now_size;
    }

    public int getBag_1_zhong() {
        return bag_1_zhong;
    }

    public int getBag_1_size() {
        return bag_1_size;
    }

    public int getBag_2_zhong() {
        return bag_2_zhong;
    }

    public int getBag_2_size() {
        return bag_2_size;
    }

    public int getBag_3_zhong() {
        return bag_3_zhong;
    }

    public int getBag_3_size() {
        return bag_3_size;
    }

    public int getBag_4_zhong() {
        return bag_4_zhong;
    }

    public int getBag_4_size() {
        return bag_4_size;
    }

    public int getBag_5_zhong() {
        return bag_5_zhong;
    }

    public int getBag_5_size() {
        return bag_5_size;
    }

    public int getBag_6_zhong() {
        return bag_6_zhong;
    }

    public int getBag_6_size() {
        return bag_6_size;
    }

    public int getBag_7_zhong() {
        return bag_7_zhong;
    }

    public int getBag_7_size() {
        return bag_7_size;
    }

    public void setBag_1_size(int bag_1_size) {
        this.bag_1_size = bag_1_size;
    }

    public void setBag_1_zhong(int bag_1_zhong) {
        this.bag_1_zhong = bag_1_zhong;
    }

    public void setBag_2_zhong(int bag_2_zhong) {
        this.bag_2_zhong = bag_2_zhong;
    }

    public void setBag_2_size(int bag_2_size) {
        this.bag_2_size = bag_2_size;
    }

    public void setBag_3_zhong(int bag_3_zhong) {
        this.bag_3_zhong = bag_3_zhong;
    }

    public void setBag_3_size(int bag_3_size) {
        this.bag_3_size = bag_3_size;
    }

    public void setBag_4_zhong(int bag_4_zhong) {
        this.bag_4_zhong = bag_4_zhong;
    }

    public void setBag_4_size(int bag_4_size) {
        this.bag_4_size = bag_4_size;
    }

    public void setBag_5_zhong(int bag_5_zhong) {
        this.bag_5_zhong = bag_5_zhong;
    }

    public void setBag_5_size(int bag_5_size) {
        this.bag_5_size = bag_5_size;
    }

    public void setBag_6_size(int bag_6_size) {
        this.bag_6_size = bag_6_size;
    }

    public void setBag_6_zhong(int bag_6_zhong) {
        this.bag_6_zhong = bag_6_zhong;
    }

    public void setBag_7_size(int bag_7_size) {
        this.bag_7_size = bag_7_size;
    }

    public void setBag_7_zhong(int bag_7_zhong) {
        this.bag_7_zhong = bag_7_zhong;
    }
}
