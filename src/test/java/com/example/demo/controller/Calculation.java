package com.example.demo.controller;

import com.example.demo.bean.bag;
import com.example.demo.bean.receive_bag;
import com.example.demo.workpackage.Work;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Calculation {
    @RequestMapping("/Calculation")
    public String cc(receive_bag recv , ModelMap map){
        System.out.println("receive bag information:");
        System.out.println("one _ zhong: "+ recv.getBag_1_zhong());
        System.out.println("one _ size: "+ recv.getBag_1_size());
        System.out.println("two _ zhong: "+ recv.getBag_2_zhong());
        System.out.println("two _ size: "+ recv.getBag_2_size());
        System.out.println("three _ zhong: "+ recv.getBag_3_zhong());
        System.out.println("three _ size: "+ recv.getBag_3_size());
        System.out.println("four _ zhong: "+ recv.getBag_4_zhong());
        System.out.println("four _ size: "+ recv.getBag_4_size());
        System.out.println("five _ zhong: "+ recv.getBag_5_zhong());
        System.out.println("five _ size: "+ recv.getBag_5_size());
        System.out.println("baby_num : "+ recv.getBaby_num());
        System.out.println("road_type: "+recv.getRoad_type());
        System.out.println("site_type: "+recv.getSite_type());
        bag[] bags = new bag[recv.getNow_size()]; //根据当前的行李数量决定需要创造几个背包类
        if(recv.getNow_size()>0){
            bags[0] = new bag(recv.getBag_1_size(),recv.getBag_1_zhong());
        }
        if(recv.getNow_size()>1){
            bags[1] = new bag(recv.getBag_2_size(),recv.getBag_2_zhong());
        }
        if(recv.getNow_size()>2){
            bags[2] = new bag(recv.getBag_3_size(),recv.getBag_3_zhong());
        }
        if(recv.getNow_size()>3){
            bags[3] = new bag(recv.getBag_4_size(),recv.getBag_4_zhong());
        }
        if(recv.getNow_size()>4){
            bags[4] = new bag(recv.getBag_5_size(),recv.getBag_5_zhong());
        }
        double money = 0;
        switch (recv.getRoad_type()){
            case 0:
                money = Work.get_no_0(700,recv.getRoad_type(),recv.getNow_size(),bags,recv.getBaby_num());
                break;
            case 1:
                money = Work.get_no_1(recv.getRoad_type(),recv.getNow_size(),bags);
                break;
            case 2:
                money = Work.get_no_2(recv.getRoad_type(),recv.getNow_size(),bags);
                break;
            case 3:
                money = Work.get_no_3(recv.getRoad_type(),recv.getNow_size(),bags);
                break;
            case 4:
                money = Work.get_no_4(recv.getRoad_type(),recv.getNow_size(),bags);
                break;
            case 5:
                money = Work.get_no_5(recv.getRoad_type(),recv.getNow_size(),bags);
                break;
        }
        map.put("money",money);
        return "result";
    }

}
