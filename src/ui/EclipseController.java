package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class EclipseController {

    @FXML
    private Rectangle sky;

    @FXML
    private Circle moon;

    @FXML
    private Circle son;

    @FXML
    private Circle crater1;

    @FXML
    private Circle crater4;

    @FXML
    private Circle crater3;

    @FXML
    private Circle crater2;

    @FXML
    private Color color;
    
    @FXML
    public void initialize() {
    	color = (Color)sky.getFill();
    }
    
    @FXML
    public void moveMoon(ActionEvent event) {
    	
    	moon.setLayoutX(moon.getLayoutX()+5);
    	crater1.setLayoutX(crater1.getLayoutX()+5);
    	crater2.setLayoutX(crater2.getLayoutX()+5);
    	crater3.setLayoutX(crater3.getLayoutX()+5);
    	crater4.setLayoutX(crater4.getLayoutX()+5);
    	
    	if(moon.getLayoutX() >= son.getLayoutX() - son.getRadius() && moon.getLayoutX() <= son.getLayoutX()) {
    		color = color.darker();
    	}
    	else {
    		color = color.brighter();
    	}
    	
    	sky.setFill(color);
    }

}

