> 参考：https://www.cnkirito.moe/spi/
> https://mp.weixin.qq.com/s?subscene=23&__biz=MzI3NzE0NjcwMg==&mid=2650122049&idx=1&sn=8a0cb5f274f8123d513580d4534a6b95&chksm=f36bba60c41c3376e55f0e28c7908b44e24e6f4adc8381afdcd733ca0cf0abb1336f0978be8b&scene=7&key=d6b38e7eaeb9ec1377b10a63749407affcc57d0a5883f2c1db27402c81354483a411a83800ff192ae2ad70dff64701cfecdb35e4967c3e1485aa2ce86cf00e2f07a992e7ca2a2697395c081827f72a64&ascene=0&uin=NjQ4MDI3MTEw&devicetype=Windows+10&version=62080079&lang=zh_CN&exportkey=AX9q%2BUs8z0DU%2FSHGo7EedeE%3D&pass_ticket=ZdBBVuxvKPVQwnsFeGNuHmNpn4bNN9V2HPAZLq0H3%2F4aJw58H7vdnaDL%2F9Tw8VWA

JDK 提供的 SPI(Service Provider Interface) 机制，这个机制是针对厂商或者插件的，也可以在一些框架的扩展中看到。其核心类 java.util.ServiceLoader 可以在 jdk1.8 的文档中看到详细的介绍。
虽然不太常见，但是项目中用到的第三方日志包、数据库驱动，这些都和 SPI 有关。

- demo-spi-bad-printer、demo-spi-good-printer
    - 两个厂商对 interface 的不同实现，所以他们会依赖于 demo-spi-interface 项目。
    - 每一个 SPI 接口都需要在自己项目的静态资源目录中声明一个 services 文件，文件为 ` 规范接口的类名全路径 `, 文件内容为 ` 一行具体实现类的全路径 `。
        - 文件路径：resources\META-INF\services\org.melody.demo.spi.Printer
        - 文件内容：org.melody.demo.spi.GoodPrinter
- demo-spi-interface
    - 针对厂商和插件商定义的接口项目，只提供接口，不提供实现。
- demo-spi-invoker
    - 用来测试的主项目。
    - 依赖 demo-spi-interface、demo-spi-bad-printer 或 demo-spi-good-printer