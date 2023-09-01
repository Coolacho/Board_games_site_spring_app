package com.angel_angelov.board_games_site.data.order;

public enum OrderStatus {
    IN_PROGRESS("In progress"), CANCELED("Canceled"), COMPLETED("Completed");

    private final String code;

    OrderStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
