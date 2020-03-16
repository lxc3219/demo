package org.melody.demo.design.principle.lsp.good;

public class Rectangle implements QRangle{
    private long length;
    private long width;

    public long getLength() {
        return length;
    }

    public long getWidth() {
        return width;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}