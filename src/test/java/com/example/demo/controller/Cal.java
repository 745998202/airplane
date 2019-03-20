package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.bean.bag;
import com.example.demo.bean.receive_bag;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Cal {
    @RequestMapping("Cal")
    public String step_2(ModelMap map,User us){

        System.out.println("线路");
        System.out.println(us.getRoad_type());
        System.out.println("舱位类型");
        System.out.println(us.getSite_type());
        System.out.println("行李件数");
        System.out.println(us.getPackage_num());

        receive_bag receive_bag = new receive_bag();
        int copy_package_num = us.getPackage_num();//通过获取数量返回不同数量的表单
        bag[] mybag = new bag[copy_package_num];
        for(int i = 0; i < copy_package_num ; i++){
            mybag[i] = new bag(0,0);
        }
        us.setPackages(mybag);
        receive_bag.setNow_size(us.getPackage_num());
        receive_bag.setRoad_type(us.getRoad_type());
        receive_bag.setSite_type(us.getSite_type());
        map.put("us",us);
        map.put("receive_bag",receive_bag);
        return "test";
    }
}
