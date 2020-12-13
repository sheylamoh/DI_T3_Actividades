
package temporizador;


import java.io.IOException;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

/**
 *
 * @author sheyla
 */
public class TemporizadorController extends HBox {
    
    private Timeline timeline;
    private IntegerProperty seg;
    
    @FXML
    private Label labelTime;
    
    public TemporizadorController(int i)
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Temporizador.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        seg = new SimpleIntegerProperty(i);
        labelTime.textProperty().bind(seg.asString());
        seg.set(i);
        timeline = new Timeline();
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(i+1), new KeyValue(seg,0)));
        timeline.playFromStart();
    }
    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public IntegerProperty getSegundos() {
        return seg;
    }

    public void setSegundos(IntegerProperty segundos) {
        this.seg = segundos;
    }

    public Label getLabelTime() {
        return labelTime;
    }

    public void setLabelTime(Label labelTime) {
        this.labelTime = labelTime;
    }
    
    
   
    
}
