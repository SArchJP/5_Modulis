package com.company;

public class Engine {
    private int price;
    private int money;

    public Engine() {
    }

    public Engine(int price, int money) {
        this.price = price;
        this.money = money;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int saldainiuGalimaNupirkti() {
        return getMoney() / getPrice();
    }

    public int saldainiuGalimaGautiUzKuponus() {
        return saldainiuGalimaNupirkti() / 3;
    }

    public int saldainiuTotal() {
        if (saldainiuGalimaGautiUzKuponus() >= 0 && saldainiuGalimaGautiUzKuponus() <= 3) {
            return saldainiuGalimaNupirkti() + saldainiuGalimaGautiUzKuponus();
        } else {
            return saldainiuGalimaNupirkti() + 3;
        }
    }
}
