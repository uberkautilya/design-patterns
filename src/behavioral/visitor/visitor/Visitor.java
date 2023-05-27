package behavioral.visitor.visitor;

import behavioral.visitor.shapes.Circle;
import behavioral.visitor.shapes.CompoundShape;
import behavioral.visitor.shapes.Dot;
import behavioral.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
