package org.melody.demo.spi;

import java.util.ServiceLoader;

public class SpiMain {

    public static void main(String[] args) {
        // ServiceLoader是java.util提供的用于加载固定类路径下文件的一个加载器，正是它加载了对应接口声明的实现类。
        ServiceLoader<Printer> printerLoader = ServiceLoader.load(Printer.class);
        for (Printer printer : printerLoader) {
            printer.print();
        }
    }
}
