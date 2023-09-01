package com.angel_angelov.board_games_site.data.product;

public enum ProductType {
    BOARD_GAME("Board game"), EXPANSION("Expansion");

    private final String code;

    ProductType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
