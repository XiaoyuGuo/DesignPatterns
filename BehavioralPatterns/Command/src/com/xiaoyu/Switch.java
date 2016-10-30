package com.xiaoyu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gxytk on 2016/10/31.
 */
public class Switch {
    private List<Command> history = new ArrayList<>();

    public void storeAndExecute(Command cmd) {
        this.history.add(cmd);
        cmd.execute();
    }
}
