/**
 * Created by gxytk on 2016/10/30.
 * 组合模式
 * 通过实现同一个接口
 * 像处理简单元素Ellipse一样来处理复杂元素Graphic
 * 可以优化处理递归或者分级结构
 */
public class Main {
    public static void main(String[] args) {

        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);

        graphic.print();
    }
}
