
package appvisoranimales;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class CeldaImagenTexto extends ListCell<Animal> {

    private VBox caja = new VBox();
    private ImageView image = new ImageView();
    private Label texto = new Label();

    public CeldaImagenTexto() {
        image.setPreserveRatio(true);
        image.setFitHeight(100);
        texto.setWrapText(true);
        texto.setAlignment(Pos.CENTER);
        this.setPrefWidth(super.getPrefWidth());
        caja.setAlignment(Pos.CENTER);
        caja.getChildren().addAll(image, texto);

    }

    @Override
    public void updateItem(Animal item, boolean empty) {
        super.updateItem(item, empty);
        if(item != null)
        {
            image.setImage(new Image(item.getImagenMiniatura()));
            texto.setText(item.getNombre());
            setGraphic(caja);
        }
    }

}
