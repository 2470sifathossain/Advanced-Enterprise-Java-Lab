package Lab15.FinalExam.Qus2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Test extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Rectangle rectangleTop = new Rectangle(50, 50, 500, 80);
        rectangleTop.setFill(Color.YELLOW);
        Rectangle rectangleMiddle = new Rectangle(50, 130, 500, 80);
        rectangleMiddle.setFill(Color.RED);
        Rectangle rectangleBottom = new Rectangle(50, 210, 500, 80);
        rectangleBottom.setFill(Color.BLACK);

      
        Line line = new Line(50, 50, 50, 500);

        TextArea textArea = new TextArea();
        textArea.setPrefSize(150, 50);
        textArea.setLayoutX(100);
        textArea.setLayoutY(320);
        textArea.setText("Sifat Hossain\n153402342");

        Group group = new Group();
        group.getChildren().addAll(rectangleTop, rectangleMiddle, rectangleBottom, line, textArea);
        stage.setScene(new Scene(group, 600, 600));
        stage.show();
        stage.setTitle("German");
    }

    public static void main(String[] args) {
        launch(args);
    }

}
