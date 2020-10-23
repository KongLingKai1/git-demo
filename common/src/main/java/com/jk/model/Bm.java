package com.jk.model;

import lombok.Data;

@Data
public class Bm {

    private     Integer     bmId;

    private     String      bmName;

    public Integer getBmId() {
        return bmId;
    }

    public void setBmId(Integer bmId) {
        this.bmId = bmId;
    }

    public String getBmName() {
        return bmName;
    }

    public void setBmName(String bmName) {
        this.bmName = bmName;
    }
}
