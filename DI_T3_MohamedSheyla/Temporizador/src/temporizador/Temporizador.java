package temporizador;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author sheyla
 */
public class Temporizador extends Application {
    
    @Override
    public void start(Stage stage) {
        
        TemporizadorController tempo =  new TemporizadorController(100);
        stage.setScene(new Scene(tempo));
        stage.setWidth(100);
        stage.setHeight(100);
        stage.show();
        
        tempo.getLabelTime().textProperty().addListener(new ChangeListener<String>()
        {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) 
            {
                if(newValue.equals("0"))
                {
                    
                }
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
