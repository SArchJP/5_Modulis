package com.company;

public class Engine {
    private int val;
    private int min;

    public Engine() {
    }

    public Engine(int val, int min) {
        this.val = val;
        this.min = min;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void laikas(int val, int min) {
        if (getMin() + min >= 0 && getMin() + min < 60) {
            this.min = getMin() + min;
        } else {
            this.min = (getMin() + min) % 60;
            val++;
        }

        if (getVal() + val >= 0 && getVal() + val < 24) {
            this.val = getVal() + val;
        } else {
            this.val = (getVal() + val) % 24;
        }


    }
}
