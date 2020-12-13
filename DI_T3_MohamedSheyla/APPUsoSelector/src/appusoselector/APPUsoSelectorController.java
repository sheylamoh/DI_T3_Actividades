
package appusoselector;

import selectordeslizamiento.SelectorDeslizamiento;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 * @author sheyla
 */
public class APPUsoSelectorController implements Initializable {

    @FXML
    private SelectorDeslizamiento component1;
    @FXML
    private SelectorDeslizamiento component2;
    @FXML
    private Label result;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<String> items1 = new ArrayList<>();
        ArrayList<String> items2 = new ArrayList<>();
        
        items1.add("1");
        items1.add("2");
        items1.add("3");
        
        
        items2.add("dos");
        items2.add("dos");
        items2.add("tres");
        
        component1.setItems(items1);
        component2.setItems(items2);
        
        component1.setOnAction(e->{
            result.setText("Pulsado el selector de arriba");
            result.setTextFill(Color.GREEN);
        });
        
        component2.setOnAction(e->{
            result.setText("Pulsado el selector de abajo");
            result.setTextFill(Color.GREEN);
        });
        
    }    
    
}
