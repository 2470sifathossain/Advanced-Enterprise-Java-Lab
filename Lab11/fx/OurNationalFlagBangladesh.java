package Lab11.fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class OurNationalFlagBangladesh extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // use the correct ratio to draw the flag of bangladesh
        // ratio in below
        // width : height : cpcha : cpcva : radius
        // 10 : 6 : 4.5 : 3 : 2
        // cpcha = center point of the circle in horizontal axis
        // cpcva = certer point of the circle in vertical axis

        Rectangle rectangle = new Rectangle(50,50, 500, 300);
        rectangle.setFill(Color.GREEN);

        Circle circle = new Circle(275,200,100, Color.rgb(218,41,28));

        Group group = new Group();
        group.getChildren().addAll(rectangle, circle);
        stage.setScene(new Scene(group,600,400));
        stage.show();
        stage.setTitle("Bnagladesh");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
