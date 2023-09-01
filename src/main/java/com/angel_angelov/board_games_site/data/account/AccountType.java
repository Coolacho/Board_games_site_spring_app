package com.angel_angelov.board_games_site.data.account;

public enum AccountType {
    ADMIN("Admin"), CUSTOMER("Customer");

    private final String code;

    AccountType(String code) {
        this.code = code;
    }

    public String getCode() {return code;}
}
