package com.dayplanner;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root,600, 600, Color.LIGHTSKYBLUE);

        Image icon = new Image("images/to-do-list.png");
        stage.getIcons().add(icon);

        stage.setTitle("Dayplanner");


        Text text = new Text("To Do List");

        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.LIMEGREEN);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.INDIANRED);
        line.setOpacity(0.5);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(150);
        rectangle.setY(150);
        rectangle.setFill(Color.LIGHTGOLDENRODYELLOW);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.MISTYROSE);

        Polygon polygon = new Polygon();
        polygon.setFill(Color.MEDIUMPURPLE);
        polygon.getPoints().setAll(
                200.0, 200.0,
                300.0, 300.0,
                200.0, 300.0
        );

        Circle circle = new Circle();
        circle.setCenterX(400);
        circle.setCenterY(400);
        circle.setRadius(50);
        circle.setFill(Color.DARKORANGE);

        Image image = new Image("images/to-do-list.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(0);
        imageView.setY(0);


        root.getChildren().add(imageView);
        root.getChildren().add(circle);
        root.getChildren().add(polygon);
        root.getChildren().add(rectangle);
        root.getChildren().add(line);
        root.getChildren().add(text);

        stage.setScene(scene);
        stage.show();
    }
}