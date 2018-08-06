package com.company;

import java.util.ArrayList;
import java.util.List;

public class Division implements Operation{
    public ArrayList list;
    public Division (ArrayList list) {
        this.list = list;
    }
    public double calculate(ArrayList args) {
        double proizv = Double.parseDouble(args.get(1).toString());
        for (int i = 2; i < args.size(); i++) {
            proizv /= Double.parseDouble(args.get(i).toString());
        }
        return proizv;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}

