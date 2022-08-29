
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFXMainEx1 extends Application {
Color color = Color.rgb(223, 123, 50);
    @Override
    public void start(Stage primaryStage) {
        //remove code from here 
	Button btn = new Button();
        btn.setText("Say 'HelloWorld'");
        btn.setColor(color);
        btn.setOnAction(new EventHandler<ActionEvent>()
	{
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        Rectangle rect = new Rectangle(39, 29, 19, 38);
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
                0.0, 0.0,
                20.0, 10.0,
                10.0, 20.0 });

        g.getChildren().add(polygon);

        scene.setRoot(g);
        stage.show();
    }

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
		//to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }
}
