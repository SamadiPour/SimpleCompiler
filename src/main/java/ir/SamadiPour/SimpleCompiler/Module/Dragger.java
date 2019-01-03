package ir.SamadiPour.SimpleCompiler.Module;

import ir.SamadiPour.SimpleCompiler.Controller.FileInputController;
import javafx.scene.Node;

/**
 * @author SamadiPour
 */
public class Dragger {

    private static double xOffSet = 0;
    private static double yOffSet = 0;

    public static void makeStageDragable(Node parent) {
        parent.setOnMousePressed((event) -> {
            xOffSet = event.getSceneX();
            yOffSet = event.getSceneY();
        });
        parent.setOnMouseDragged((event) -> {
            FileInputController.getStage().setX(event.getScreenX() - xOffSet);
            FileInputController.getStage().setY(event.getScreenY() - yOffSet);
            FileInputController.getStage().setOpacity(0.8f);
        });
        parent.setOnDragDone((event) -> {
            FileInputController.getStage().setOpacity(1.0f);
        });
        parent.setOnMouseReleased((event) -> {
            FileInputController.getStage().setOpacity(1.0f);
        });
    }
}
