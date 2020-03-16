package org.melody.demo.design.principle.lsp.good;

public class Square implements QRangle {
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    public long getWidth() {
        return sideLength;
    }

    public long getLength() {
        return sideLength;
    }
}
