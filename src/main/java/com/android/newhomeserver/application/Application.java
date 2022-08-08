package com.android.newhomeserver.application;

import com.android.newhomeserver.info.HomeInfo;

import java.util.ArrayList;

public class Application {

    public static ArrayList<HomeInfo> g_homeinfolist;

    public Application() {
        g_homeinfolist = new ArrayList<>();

        HomeInfo homeInfo;
        String homeInfostring;

        homeInfo = new HomeInfo("abc","1-1-101","1/23","abc",2500,3,true);
        g_homeinfolist.add(homeInfo);
        homeInfo = new HomeInfo("abc","2-2-202","2/23","abc",3000,4,true);
        g_homeinfolist.add(homeInfo);
        homeInfo = new HomeInfo("abc","3-3-303","3/23","abc",2000,2,true);
        g_homeinfolist.add(homeInfo);
        homeInfo = new HomeInfo("abc","4-4-402","4/23","abc",4000,5,true);
        g_homeinfolist.add(homeInfo);

        homeInfo = new HomeInfo("xyz","1-1-101","1/23","xyz",5000,5,true);
        g_homeinfolist.add(homeInfo);
        homeInfo = new HomeInfo("xyz","2-2-202","2/23","xyz",4000,4,true);
        g_homeinfolist.add(homeInfo);
        homeInfo = new HomeInfo("xyz","3-3-303","3/23","xyz",2000,2,true);
        g_homeinfolist.add(homeInfo);
        homeInfo = new HomeInfo("xyz","4-4-402","4/23","xyz",4000,5,true);
        g_homeinfolist.add(homeInfo);
    }

    public static String generateHomeInfoListString(){
        String string = "";

        for (HomeInfo homeInfo : g_homeinfolist){
            string = string + homeInfo.generateString(homeInfo);
        }
        return string;
    }

}
