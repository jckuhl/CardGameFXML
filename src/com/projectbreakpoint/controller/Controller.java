package com.projectbreakpoint.controller;

import com.projectbreakpoint.cards.Suit;
import com.projectbreakpoint.ui.CardFX;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Controller {


    private CardFX card;

    {
        try {
            card = new CardFX(Suit.HEARTS, 4, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    assets/cards/clubs-6.png

    @FXML
    private ImageView image = card.getImage();

    @FXML
    private Text text = new Text();

    {
        text.setText("Eat at Joes");
    }
}
