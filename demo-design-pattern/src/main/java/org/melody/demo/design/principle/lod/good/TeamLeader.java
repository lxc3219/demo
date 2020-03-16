package org.melody.demo.design.principle.lod.good;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {

    public void checkNumberOfProject(){
        List<Project> list = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            list.add(new Project());
        }
        System.out.println("项目数量是: "+list.size());
    }

}
