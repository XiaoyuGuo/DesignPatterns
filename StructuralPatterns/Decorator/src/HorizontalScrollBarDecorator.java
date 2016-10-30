/**
 * Created by gxytk on 2016/10/30.
 */
public class HorizontalScrollBarDecorator extends WindowDecorator {
    public HorizontalScrollBarDecorator(Window windowToBeDecorated) {
        super(windowToBeDecorated);
    }

    @Override
    public void draw() {
        super.draw();
        drawHorizontalScrollBar();
    }

    private void drawHorizontalScrollBar() {

    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", and add horizontal scroll bar";
    }
}
