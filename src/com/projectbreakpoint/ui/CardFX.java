package com.projectbreakpoint.ui;

import com.projectbreakpoint.cards.Card;
import com.projectbreakpoint.cards.Suit;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CardFX extends Card {

    private ImageView imageView = new ImageView();
    private boolean faceUp;
    final private String imgSrc;

    public CardFX(Suit suit, int value, boolean up) throws Exception {
        super(suit, value);
        this.faceUp = up;
        this.imgSrc = this.buildImageUrl();
        this.imageView.setImage(new Image(imgSrc));
    }

    public CardFX(Card card, boolean up) throws Exception {
        super(card.getSuit(), card.getValue());
        this.faceUp = up;
        this.imgSrc = this.buildImageUrl();
        this.imageView.setImage(new Image(imgSrc));

    }

    private String buildImageUrl() {
        String url = ("assets/cards/"
                + this.getSuit().toString()
                + "-" + this.getValue()
                + ".png")
                .toLowerCase();
        return url;
    }

    public ImageView getImage() {
        return this.imageView;
    }

    public void toggleFace(boolean up) {
        this.faceUp = up;

    }
}
