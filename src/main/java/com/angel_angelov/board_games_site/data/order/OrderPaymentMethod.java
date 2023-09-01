package com.angel_angelov.board_games_site.data.order;

public enum OrderPaymentMethod {
    ON_RECEIVE("On receive"), BY_CARD("By card");

    private final String code;

    OrderPaymentMethod(String code) {
        this.code = code;
    }

    public String getCode() {return code;}
}
