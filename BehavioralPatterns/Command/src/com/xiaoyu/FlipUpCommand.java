package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 */
public class FlipUpCommand implements Command {
    private Light theLight;

    public FlipUpCommand(Light light) {
        this.theLight = light;
    }

    @Override
    public void execute() {
        this.theLight.turnOn();
    }
}
