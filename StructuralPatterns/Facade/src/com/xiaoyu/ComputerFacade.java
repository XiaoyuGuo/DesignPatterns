package com.xiaoyu;

/**
 * Created by gxytk on 2016/10/30.
 */
public class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(123123, "123".getBytes());
        processor.jump(123123);
        processor.execute();
    }
}
