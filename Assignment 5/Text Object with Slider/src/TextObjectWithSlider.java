
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * TextObjectWithSlider.java        COMP 1231 Assignment 5: GUI's
 * 
 * A JavaFX application that displays a Text object and a slider that controls the font size of the text.
 * 
 * @author Michael Kuby
 */

public class TextObjectWithSlider extends Application
{
    public void start(Stage primaryStage) 
    {
        //--------------------------------------------------------------------
        // Insantiate a text object that will display the text to be shown
        // and scaled, and a slider that spans from 1 to 40, and whose value
        // defaults to 12.
        //--------------------------------------------------------------------
        
        String birthday = "text.setFont(Font.font(\"Courier new\", weight, newValue));";            
        Text text = new Text (birthday);
        FontWeight weight = FontWeight.BOLD;
        text.setFont(Font.font("Courier new", weight, 10));
                         
        Slider slider = new Slider(1, 22, 10);
        slider.setShowTickMarks(true);
        slider.setPadding ( new Insets (0, 100, 0, 100));
        slider.setTooltip(new Tooltip("Set font size"));
        
        //--------------------------------------------------------------------
        // Add a change listener to the slider. When the property value of 
        // the slider changes, the font is updated to reflect it's 
        // associated value.
        //--------------------------------------------------------------------
        slider.valueProperty().addListener(
                (observableValue, oldValue, newValue) ->
                        text.setFont(Font.font("Courier new", weight,
                                (double) newValue)));           
              
        //--------------------------------------------------------------------
        // Arrange the elements in a VBox root node that can be added
        // to the scene.
        //--------------------------------------------------------------------
        
        BorderPane root = new BorderPane();
        root.setBottom(slider);
        root.setCenter(text);
        root.setStyle("-fx-background-color: darkseagreen");
                       
        Scene scene = new Scene (root, 800, 200);
        
        primaryStage.setTitle("Scaling text");
        primaryStage.setScene(scene);
        primaryStage.show();
             
    }
        
    public static void main(String[] args)
    {
        launch (args);
    }
    
}
