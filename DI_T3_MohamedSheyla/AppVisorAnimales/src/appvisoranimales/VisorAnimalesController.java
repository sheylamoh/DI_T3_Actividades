
package appvisoranimales;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author sheyla
 */
public class VisorAnimalesController implements Initializable {
    
    private Label label;
    @FXML
    private ListView<Animal> listaAnimales;
    @FXML
    private ImageView imageView;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Animal gato = new Animal("Gato", "media/gato.jpg","media/gato2.jpg");
        Animal perro = new Animal("Perro", "media/perro.jpg","media/perro2.jpg");
        Animal pajaro = new Animal("Pájaro", "media/pajaro.png","media/pajaro2.png");
        
        ObservableList<Animal> animales = FXCollections.observableArrayList();
        animales.addAll(gato,perro,pajaro);
        
        listaAnimales.setItems(animales);
        listaAnimales.setCellFactory((ListView<Animal> l) -> new CeldaImagenTexto());
        
        listaAnimales.getSelectionModel().selectedItemProperty().addListener(
            (ObservableValue<? extends Animal> ov, Animal old_val, 
                Animal new_val) -> {
                imageView.setImage(new Image(new_val.getImagenGrande()));
        });
        
    }    
    
}
