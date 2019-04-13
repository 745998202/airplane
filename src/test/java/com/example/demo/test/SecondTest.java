package com.example.demo.test;

import com.example.demo.bean.bag;
import com.example.demo.workpackage.Work;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SecondTest {
    //各种测试用例的结果
    double onebagtest[] = new double[]{-1,-1,-1,-1,0};
    double twobagtest[] = new double[]{0,3000,1000,4000,1000,2000,5000,1000,2000,3000,2000,3000};
    //标记当前运行的测试用例的下标
    int onebag_index = 0;
    int twobag_index = 0;
    @DataProvider(name = "test1")
    public Object[][] Users1(){
        return new Object[][]{
                {0,-1},
                {0,6},
                {-1,1},
                {-1,1},
                {0,0},
        };
    }
    @DataProvider(name = "test2")
    public Object[][]Users2(){
        return new Object[][]{
                {0,3,30,128,30,128,30,128},
                {0,3,30,128,40,128,30,128},
                {0,3,30,128,30,160,30,128},
                {0,3,30,128,40,160,30,128},
                {1,3,30,128,30,128,30,128},
                {1,3,30,128,30,160,30,128},
                {1,3,30,128,40,160,30,128},
                {2,3,23,128,23,128,23,128},
                {2,3,23,128,23,160,23,128},
                {2,3,23,128,30,160,23,128},
                {3,3,23,128,23,160,23,128},
                {3,3,23,128,30,160,23,128},
        };
    }

    @Test(dataProvider = "test1")
    public void onebag(int type,int bag_num) {
        //参数说明： 1. 当日经济舱票价 单位 / rmb   2. 舱位类型  3. 行李数量  4.行李    5. 不占座婴儿数量
        System.out.println("测试用例：");
        System.out.print("type: "+type+" ");
        System.out.print("bag_num: "+bag_num+" ");
        System.out.println(" ");
        bag[] bags = new bag[5];
        bags[0] = new bag(0,0);
        bags[1] = new bag(0,0);
        bags[2] = new bag(0,0);
        bags[3] = new bag(0,0);
        bags[4] = new bag(0,0);
        assertEquals(onebagtest[onebag_index++], Work.get_no_1(type,bag_num,bags));
    }

    @Test(dataProvider = "test2")
    public void twobag(int type,int bag_num,int bag_1_zhong, int bag_1_chicun,int bag_2_zhong,int bag_2_chicun,int bag_3_zhong,int bag_3_chicun){
        System.out.println("测试用例：");
        System.out.print("type: "+type+" ");
        System.out.print("bag_num: "+bag_num+" ");
        System.out.print("bag_1_zhong: "+bag_1_zhong+" ");
        System.out.print("bag_1_chicun: "+bag_1_chicun+" ");
        System.out.print("bag_2_zhong: "+bag_2_zhong+" ");
        System.out.print("bag_2_chicun: "+bag_2_chicun+" ");
        System.out.print("bag_3_zhong: "+bag_3_zhong+" ");
        System.out.print("bag_3_chicun: "+bag_3_chicun+" ");
        System.out.println(" ");
        bag[] bags = new bag[3];
        bags[0] = new bag(bag_1_chicun,bag_1_zhong);
        bags[1] = new bag(bag_2_chicun,bag_2_zhong);
        bags[2] = new bag(bag_3_chicun,bag_3_zhong);
        assertEquals(twobagtest[twobag_index++],Work.get_no_1(type,bag_num,bags));
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("----正在运行日本航线函数测试用例----");
    }

    //在当前测试类结束时运行。
    @AfterClass
    public static void afterClass(){
        System.out.println("----结束测试日本航线函数测试----");
    }

}
