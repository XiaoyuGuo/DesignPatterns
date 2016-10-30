package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/31.
 * 命令模式
 * 将命令与执行解耦，使得行为可以单独储存延后集中执行，还可以提供撤销、重做等行为
 * Light是行为接收者
 * FlipDownCommand和FlipUpCommand是实现了Command接口的具体命令，同时指定了行为接收者
 * Switch通过Command唤醒行为
 * 最后通过Switch唤醒
 * 例如玩网游，可以发出一系列命令，最终由服务器执行
 */
public class Main {
    public static void main(String[] args) {
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);
        Switch mySwitch = new Switch();
        //使用ON作为例子
        switch("ON") {
            case "ON":
                mySwitch.storeAndExecute(switchUp);
                break;
            case "OFF":
                mySwitch.storeAndExecute(switchDown);
                break;
            default:
                System.err.println("Argument \"ON\" or \"OFF\" required");
        }
    }
}
