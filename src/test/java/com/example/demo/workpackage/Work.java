package com.example.demo.workpackage;
import com.example.demo.bean.bag;

public class Work {//用于计算托运行李票价的类
    public static int nowdaysMoney;//当日的经济舱价格
    public static void setNowdaysMoney(int money){nowdaysMoney = money;}
    public static double get_no_0(int nowdaysMoney , int type , int bag_num ,bag[] bags ,int baby_num)   //国内航班
    {

        //参数说明： 1. 当日经济舱票价 单位 / rmb   2. 舱位类型  3. 行李数量  4. 不占座婴儿数量
        setNowdaysMoney(nowdaysMoney);//设置当日的经济舱航班的价格
        if(bag_num < 0 || bag_num > 5 || type < 0 || type > 3 || nowdaysMoney < 0)
        {
            return -1; //有不符合规定的输入
        }
        if(bag_num==0)
            return 0;
        double money = 0; //总金额
        int now_weight = 0;//当前超额总重量

        for(int i = 0 ; i < bag_num ; i++){
            now_weight += bags[i].getZhong();
        }
        for(int i = 0;i<baby_num;i++){
            now_weight -= 10; //每有一个婴儿就可以减去10斤
        }
        switch (type){//根据舱位信息决定超重标准
            case 0:// 头等舱 40kg
                if(bags[0].getZhong()<=40)
                    return 0;//不收费
                else
                    now_weight = now_weight - 40;
                break;
            case 1://  公务舱
                if(bags[0].getZhong()<=30)
                    return 0;//不收费
                else
                    now_weight = now_weight - 30;
                break;
            case 2://   明珠经济舱
                if(bags[0].getZhong()<=20)
                    return 0;//不收费
                else
                    now_weight = now_weight - 20;
                break;
            case 3://   经济舱
                if(bags[0].getZhong()<=20)
                    return 0;//不收费
                else
                    now_weight = now_weight - 20;
                break;
        }
        money = now_weight * 0.015 * nowdaysMoney;
        return money;
    }

    public static double get_no_1(int type , int bag_num ,bag[] bags)    //日本，美洲，澳新，俄罗斯，迪拜，新加坡
    {
        if(bag_num < 0 || bag_num > 5 || type < 0 || type > 3)
        {
            return -1;              //有不符合规定的输入
        }
        if(bag_num==0)
            return 0;
        double money = 0;
        int now_weight = 0;         //当前超额的重量

        switch(type){
            case 0:
                for(int i = 0;i < bag_num; i ++){
                    if(i > 2) {
                        if (i == 3)
                            money += 1000;
                        else
                            money += 2000;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>32)
                        money += 3000;
                }
                break;
            case 1:
                for(int i = 0;i < bag_num; i ++){
                    if(i > 1) {
                        if (i == 2)
                            money += 1000;
                        else
                            money += 2000;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>32)
                        money += 3000;
                }
                break;
            case 2:
                for(int i = 0; i < bag_num  ; i++){
                    if(i > 1){
                        if(i == 2)
                            money += 1000;
                        else
                            money +=2000;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if (bags[i].getZhong()>23 && bags[i].getZhong()<=32)
                        money += 1000;
                    else if (bags[i].getZhong()>32 && bags[i].getZhong()<=45)
                        money += 3000;
                }
                break;
            case 3:
                for(int i = 0; i < bag_num ; i++){
                    if(i > 1){
                        if(i == 2)
                            money += 1000;
                        else
                            money +=2000;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if (bags[i].getZhong()>23 && bags[i].getZhong()<=32)
                        money += 1000;
                    else if (bags[i].getZhong()>32 && bags[i].getZhong()<=45)
                        money += 3000;
                }
                break;
        }

        return money;


    }


    public static double get_no_2(int type , int bag_num ,bag[] bags)     //中西亚
    {
        double money = 0.0;
        if(bag_num < 0 || bag_num > 5 || type < 0 || type > 3)
        {
            return -1;              //有不符合规定的输入
        }
        if(bag_num==0)
            return 0;

        switch (type){
            case 0:
                for(int i = 0; i < bag_num  ; i++){
                    if(i > 2) {
                        if (i == 3)
                            money += 450;
                        else
                            money += 1300;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>32)
                        money += 3000;
                }
                break;
            case 1:
                for(int i = 0; i < bag_num ; i++){
                    if(i > 1) {
                        if (i == 2)
                            money += 450;
                        else
                            money += 1300;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>32)
                        money += 3000;
                }
                break;
            case 2:
                for(int i = 0; i < bag_num ; i++){
                    if(i > 1) {
                        if (i == 2)
                            money += 450;
                        else
                            money += 1300;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>32)
                        money += 3000;
                }
                break;
            case 3:
                for(int i = 0; i < bag_num ; i++){
                    if(i > 1) {
                        if (i == 2)
                            money += 450;
                        else
                            money += 1300;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>32)
                        money += 3000;
                }
                break;
        }

        return money;

    }

    public static double get_no_3(int type , int bag_num ,bag[] bags)    //航线4  内罗毕 土耳其
    {
        double money = 0.0;
        if(bag_num < 0 || bag_num > 5 || type < 0 || type > 3 )
        {
            return -1;              //有不符合规定的输入
        }
        if(bag_num==0)
            return 0;
        switch (type){
            case 0:
                for(int i = 0; i < bag_num ; i++){
                    if(i > 2){
                        if(i == 3)
                            money += 1000;
                        else
                            money += 2000;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>32)
                        money += 3000;
                }
                break;
            case 1:
                for(int i = 0; i < bag_num ; i++){
                    if(i > 1){
                        if(i == 2)
                            money += 1000;
                        else
                            money += 2000;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>32)
                        money += 3000;
                }
                break;
            case 2:
                for(int i = 0; i < bag_num ; i++){
                    if(i > 1){
                        if(i == 2)
                            money += 1000;
                        else
                            money += 2000;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>23&&bags[i].getZhong()<32)
                        money += 2000;
                    else if(bags[i].getZhong()>32&&bags[i].getZhong()<45)
                        money += 3000;
                }
                break;
            case 3:
                for(int i = 0; i < bag_num ; i++){
                    if(i > 1){
                        if(i == 2)
                            money += 1000;
                        else
                            money += 2000;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>23&&bags[i].getZhong()<32)
                        money += 2000;
                    else if(bags[i].getZhong()>32&&bags[i].getZhong()<45)
                        money += 3000;
                }
                break;
        }
        return money;
    }




    public static double get_no_4(int type , int bag_num ,bag[] bags ){  //韩国首发与中国间的行程
        double money = 0.0;
        if(bag_num < 0 || bag_num > 5 || type < 0 || type > 3 )
        {
            return -1;              //有不符合规定的输入
        }
        if(bag_num==0)
            return 0;
        switch (type){
            case 0:
                for(int i = 0; i<bag_num;i++) {
                    if(i>2){
                        if(i == 3)
                            money += 450;
                        else
                            money += 1300;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>32 &&  bags[i].getZhong() <= 45)
                        money += 3000;
                }
                break;
            case 1:
                for(int i = 0; i<bag_num;i++) {
                    if(i>1){
                        if(i == 2)
                            money += 600;
                        else
                            money += 1300;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>32 &&  bags[i].getZhong() <= 45)
                        money += 3000;
                }
                break;
            case 2:
                for(int i = 0; i<bag_num;i++) {
                    if(i>2){
                        if(i == 3)
                            money += 600;
                        else
                            money += 1300;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>32 &&  bags[i].getZhong() <= 45)
                        money += 3000;
                }
                break;
            case 3:
                for(int i = 0; i<bag_num;i++) {
                    if(i>2){
                        if(i == 3)
                            money += 600;
                        else
                            money += 1300;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>23 &&  bags[i].getZhong() <= 32)
                        money += 1000;
                    else if(bags[i].getZhong()>32 && bags[i].getZhong()<=45)
                        money += 3000;
                }
                break;

        }
        return money;

    }

    public static double get_no_5(int type , int bag_num ,bag[] bags){ //其他
        double money = 0.0;
        if(bag_num < 0 || bag_num > 5 || type < 0 || type > 3 )
        {
            return -1;              //有不符合规定的输入
        }
        if(bag_num==0)
            return 0;
        switch (type){
            case 0:
                for(int i = 0; i < bag_num ; i++){
                    if(i > 2){
                        if(i == 3)
                            money += 450;
                        else
                            money += 1300;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>32 &&  bags[i].getZhong() <= 45)
                        money += 3000;
                }
                break;
            case 1:
                for(int i = 0; i < bag_num ; i++){
                    if(i > 2){
                        if(i == 3)
                            money += 450;
                        else
                            money += 1300;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>23 &&  bags[i].getZhong() <= 32)
                        money += 1000;
                    else if(bags[i].getZhong()>32 && bags[i].getZhong()<=45)
                        money += 3000;
                }
                break;
            case 2:
                for(int i = 0; i < bag_num ; i++){
                    if(i > 1){
                        if(i == 2)
                            money += 450;
                        else
                            money += 1300;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>23 &&  bags[i].getZhong() <= 32)
                        money += 1000;
                    else if(bags[i].getZhong()>32 && bags[i].getZhong()<=45)
                        money += 3000;
                }
                break;
            case 3:
                for(int i = 0; i < bag_num ; i++){
                    if(i > 0){
                        if(i == 1)
                            money += 450;
                        else
                            money += 1300;
                    }
                    if(bags[i].getChicun()>158)
                        money += 1000;
                    if(bags[i].getZhong()>23 &&  bags[i].getZhong() <= 32)
                        money += 1000;
                    else if(bags[i].getZhong()>32 && bags[i].getZhong()<=45)
                        money += 3000;
                }
                break;
        }
        return money;
    }

    public static void main (String[] args){

    }
}
