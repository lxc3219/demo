package org.melody.demo.design.principle.lod.bad;

import java.util.ArrayList;
import java.util.List;

public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        List<Project> list = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            list.add(new Project());
        }
        teamLeader.checkNumberOfProject(list);
    }
}
