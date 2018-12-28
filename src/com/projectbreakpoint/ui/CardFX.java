package com.projectbreakpoint.ui;

import com.projectbreakpoint.cards.*;

public class CardFX extends Card {

    String imgSrc;

    public CardFX(Suit suit, int value, String imgSrc) throws Exception {
        super(suit, value);

        this.imgSrc = imgSrc;
    }

}
