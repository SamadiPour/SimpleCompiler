package ir.SamadiPour.SimpleCompiler.Controller;

import ir.SamadiPour.SimpleCompiler.Module.MyVisitor;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.effects.JFXDepthManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * @author SamadiPour
 */

public class TextEnteringController implements Initializable {
    private static final String TITLE = "Your Code Result:";
    private static final KeyCombination KEY_COMBINATION = new KeyCodeCombination(KeyCode.ENTER,
            KeyCombination.ALT_DOWN);

    static VBox textEnteringPane;
    static TextArea textInputed;

    @FXML
    private VBox Pane;
    @FXML
    private JFXButton submitButton;
    @FXML
    private TextArea textInput;
    @FXML
    private StackPane slackPane;
    @FXML
    private Label upText;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textEnteringPane = Pane;
        textInputed = textInput;
        JFXDepthManager.setDepth(textInput, 1);
    }

    @FXML
    void click(MouseEvent event) {
        //getting result
        try {
            if (!textInput.getText().equals("") & textInput.getText() != null) {
//            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("code.x"));
                ANTLRInputStream input = new ANTLRInputStream(new ByteArrayInputStream(textInput.getText().getBytes(StandardCharsets.UTF_8)));
                ArrayList<String> result = MyVisitor.doYourMagic(input);

                ////create dialog box
                //dialog box layout
                JFXDialogLayout dialogLayout = new JFXDialogLayout();
                //title
                Text text = new Text(TITLE);
                text.setFill(Color.valueOf("#F78C7B"));
                text.getStyleClass().add("custom-font-header");
                dialogLayout.setHeading(text);
                //body
                StringBuilder tempText = new StringBuilder();
                for (int i = 0; i < result.size(); i++) {
                    if (i == result.size() - 1)
                        tempText.append(result.get(i));
                    else
                        tempText.append(result.get(i)).append("\n");
                }
                Text bodyText = new Text(tempText.toString());
                bodyText.getStyleClass().add("custom-font-result");
                dialogLayout.setBody(new Text(bodyText.getText()));
                //button
                JFXButton ok = new JFXButton("OK");
                ok.setButtonType(JFXButton.ButtonType.RAISED);
                ok.getStyleClass().add("pink-btn");
                dialogLayout.setActions(ok);
                //main dialog
                JFXDialog dialog = new JFXDialog(slackPane, dialogLayout, JFXDialog.DialogTransition.CENTER);
                ok.setDefaultButton(true);
                ok.setOnMouseClicked(event1 -> dialog.close());
                dialog.show();
            }
        } catch (Exception e) {
            System.err.println("Something is wrong with your file...!");
        }
    }
}
