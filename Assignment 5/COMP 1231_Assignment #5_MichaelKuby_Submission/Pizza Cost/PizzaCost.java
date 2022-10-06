import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.text.NumberFormat;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;
import javafx.scene.control.Tooltip;

/**
 * PizzaCost.java       COMP 1231 Assignment 5: GUI's
 * 
 * Allows the user to pick a set of toppings using a set of check boxes.
 * Assumes each topping cost 50 cents, and a plain pizza costs $10.
 * Displays the cost of the pizza; when a topping is checked or unchecked,
 * the cost of the pizza updates automatically.
 * 
 * @author MichaelKuby
 */

public class PizzaCost extends Application 
{
    CheckBox pepperoni, ham, italSausage, greenPepper, jalapeno, pineapple;
    Text pizzaCost = new Text();
    Double cost = 10.00, extra = 0.50;
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    //--------------------------------------------------------------------
    // Displays a list of toppings that can be added to a pizza, as well
    // as the total cost. Updates the cost of the pizza as each box is 
    // checked or unchecked. Plain pizza cost: $10; Toppings: $.50
    //--------------------------------------------------------------------
    
    public void start(Stage primaryStage) 
    {
        // Add checkboxes representing the toppings
        // Add tooltips to inform the user of the additional cost
        // Set action events for instances where the boxes are checked
        pepperoni = new CheckBox ("Pepperoni");
        pepperoni.setTooltip(new Tooltip("Cost: " + fmt.format(extra)));
        pepperoni.setOnAction (this::processCheckBoxAction);
        
        ham = new CheckBox ("Ham");
        ham.setTooltip(new Tooltip("Cost: " + fmt.format(extra)));
        ham.setOnAction (this::processCheckBoxAction);
        
        italSausage = new CheckBox ("Italian Sausage");
        italSausage.setTooltip(new Tooltip("Cost: " + fmt.format(extra)));
        italSausage.setOnAction (this::processCheckBoxAction);
        
        greenPepper = new CheckBox ("Green Pepper");
        greenPepper.setTooltip(new Tooltip("Cost: " + fmt.format(extra)));
        greenPepper.setOnAction (this::processCheckBoxAction);
        
        jalapeno = new CheckBox ("Jalapeno Pepper");
        jalapeno.setTooltip(new Tooltip("Cost: " + fmt.format(extra)));
        jalapeno.setOnAction (this::processCheckBoxAction);
        
        pineapple = new CheckBox ("Pineapple");
        pineapple.setTooltip(new Tooltip("Cost: " + fmt.format(extra)));
        pineapple.setOnAction (this::processCheckBoxAction);
        
        // Add each checkbox to a gridpane
        // Set the alignment and spacing
        GridPane gridpane = new GridPane();
        
        gridpane.add(pepperoni, 0, 0);
        gridpane.add(ham, 0, 1);
        gridpane.add(italSausage, 0, 2);
        gridpane.add(greenPepper, 1, 0);
        gridpane.add(jalapeno, 1, 1);
        gridpane.add(pineapple, 1, 2);
        
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setHgap(40);
        gridpane.setVgap(10);
        
        // Set the text to be displayed and modified by the CheckBoxes
        Font font = new Font ("Helvetica", 28);
        pizzaCost.setText("Pizza Cost: " + fmt.format(cost));
        pizzaCost.setFont(font);
                
        // Add the two main nodes of the scene to the root node
        VBox root = new VBox(gridpane, pizzaCost);
        root.setAlignment(Pos.CENTER);
        root.setSpacing (40);
        root.setStyle("-fx-background-color: cornsilk");
        
        Scene scene = new Scene (root, 400, 200);
        
        primaryStage.setTitle("Pizza Cost");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public void processCheckBoxAction(ActionEvent event)
    {
        double additional = 0;
        
        // Check if each box is selected.
        // For each selected box, add $0.50
        if (pepperoni.isSelected())
            additional += extra;
        if (ham.isSelected())
            additional += extra;
        if (italSausage.isSelected())
            additional += extra;
        if (greenPepper.isSelected())
            additional += extra;
        if (jalapeno.isSelected())
            additional += extra;
        if (pineapple.isSelected())
            additional += extra;
        
        pizzaCost.setText ("Pizza Cost: " + fmt.format(cost + additional));
    }
       
        public static void main(String[] args)
    {
        launch(args);
    }
}
