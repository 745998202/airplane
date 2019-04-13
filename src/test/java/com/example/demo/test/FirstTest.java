package com.example.demo.test;


import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;
import com.example.demo.workpackage.Work;
import com.example.demo.bean.bag;
public class FirstTest {
    //各种测试用例的结果
    double onebagtest[] = new double[]{0,-1,-1,105,0,126,0,84,0,178.5,-1,0};
    double twobagtest[] = new double[]{0,0,0,0,0,0,0,0,0,0,0,0.0,0};
    //标记当前运行的测试用例的下标
    int onebag_index = 0;
    int twobag_index = 0;
    //参数化测试用例
    @DataProvider(name = "test1")
    public Object[][] Users1(){
        return new Object[][]{
                {700,0,1,40,128,0},
                {700,-1,1,40,128,0},
                {700,4,1,40,128,0},
                {700,0,1,50,128,0},
                {700,1,1,30,128,0},
                {700,1,1,42,128,0},
                {700,2,1,20,128,0},
                {700,2,1,28,128,0},
                {700,3,1,20,128,0},
                {700,3,1,37,128,0},
                {-100,3,1,37,128,0},
                {700,0,1,50,128,1},
        };
    }
    @DataProvider(name = "test2")
    public Object[][]Users2(){
        return new Object[][]{
                {700,0,2,20,128,20,128,0},
                {700,0,2,24,128,24,128,0},
                {700,1,2,15,128,15,128,0},
                {700,1,2,20,128,15,128,0},
                {700,2,2,10,128,10,128,0},
                {700,2,2,15,128,15,128,0},
                {700,3,2,10,128,10,128,0},
                {700,3,2,15,128,15,128,0},
                {700,0,2,30,128,25,128,1},
                {700,1,2,20,128,19,128,1},
                {700,1,2,20,128,48,128,1},
                {700,2,2,13,128,14,128,1},
                {700,2,2,13,128,20,128,1},
        };
    }


    //测试函数
    @Test(dataProvider = "test1")
    public void onebag(int money,int type,int bag_num,int bag_1_zhong, int bag_1_chicun,int baby_num) {
        //参数说明： 1. 当日经济舱票价 单位 / rmb   2. 舱位类型  3. 行李数量  4.行李    5. 不占座婴儿数量
        System.out.println("测试用例：");
        System.out.print("money: "+money+" ");
        System.out.print("type: "+type+" ");
        System.out.print("bag_num: "+bag_num+" ");
        System.out.print("bag_1_zhong: "+bag_1_zhong+" ");
        System.out.print("bag_1_chicun: "+bag_1_chicun+" ");
        System.out.print("baby_num: "+baby_num+" ");
        System.out.println(" ");
        bag[] bags = new bag[1];
        bags[0] = new bag(bag_1_chicun,bag_1_zhong);
        assertEquals(onebagtest[onebag_index++],Work.get_no_0(money,type,bag_num,bags,baby_num));

    }
    @Test(dataProvider = "test2")
    public void twobag(int money,int type,int bag_num,int bag_1_zhong, int bag_1_chicun,int bag_2_zhong,int bag_2_chicun,int baby_num){
        System.out.println("测试用例：");
        System.out.print("money: "+money+" ");
        System.out.print("type: "+type+" ");
        System.out.print("bag_num: "+bag_num+" ");
        System.out.print("bag_1_zhong: "+bag_1_zhong+" ");
        System.out.print("bag_1_chicun: "+bag_1_chicun+" ");
        System.out.print("bag_2_zhong: "+bag_2_zhong+" ");
        System.out.print("bag_2_chicun: "+bag_2_chicun+" ");
        System.out.print("baby_num: "+baby_num+" ");
        System.out.println(" ");
        bag[] bags = new bag[2];
        bags[0] = new bag(bag_1_chicun,bag_1_zhong);
        bags[1] = new bag(bag_2_chicun,bag_2_zhong);
        assertEquals(twobagtest[twobag_index++],Work.get_no_0(money,type,bag_num,bags,baby_num));
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("----正在运行国内航空函数测试用例----");
    }

    //在当前测试类结束时运行。
    @AfterClass
    public static void afterClass(){
        System.out.println("----结束测试国内航空函数测试----");
    }


}
