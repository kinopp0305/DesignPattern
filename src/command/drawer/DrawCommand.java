package command.drawer;

import command.command.Command;
import java.awt.Point;

public class DrawCommand implements Command {
    
    // 描画対象
    protected Drawable drawable;
    // 描画位置
    private final Point position;
    // コンストラクタ

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    
    // 実行
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
