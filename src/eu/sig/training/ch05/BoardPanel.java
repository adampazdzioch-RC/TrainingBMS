package eu.sig.training.ch05;

import java.awt.Graphics;
import java.util.List;

public class BoardPanel {
    @SuppressWarnings("unused")
    // tag::render[]
    /**
     * Renders a single square on the given graphics context on the specified
     * rectangle.
     * 
     * @param square
     *            The square to render.
     * @param g
     *            The graphics context to draw on.
     * @param rectangle
     */
    private void render(Square square, Graphics g, Rectangle rectangle) {
        square.getSprite().draw(g, rectangle);
        for (Unit unit : square.getOccupants()) {
            unit.getSprite().draw(g, rectangle);
        }
    }
    // end::render[]

    private class Sprite {
        @SuppressWarnings("unused")
        public void draw(Graphics g, Rectangle rectangle ) {

        }
    }

    private class Unit {
        public Sprite getSprite() {
            return null;
        }
    }

    private class Square extends Unit {

        public List<Unit> getOccupants() {
            return null;
        }

    }

}
