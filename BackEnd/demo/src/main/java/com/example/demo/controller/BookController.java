package com.example.demo.controller;

import com.example.demo.pojo.bookdata;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @RequestMapping("/getListBookstoreInfo")
    public List<bookdata> getListBookstoreInfo() {
        System.out.println("OK");
        List<bookdata> bookdatalist = new ArrayList<>();
        bookdata data1 = new bookdata();
        bookdata data2 = new bookdata();
        data1.setId("Threebody");
        data1.setName("三体：全三册");
        data1.setAuthor("刘慈欣");
        data1.setState(true);
        data1.setPrice(100);
        data1.setUnitPrice(100);
        data1.setNumber(1);
        data1.setInstruction("文化大革命如火如荼进行的同时。军方探寻外星文明的绝秘计划“红岸工程”取得了突破性进展。但在按下发射键的那一刻，\n" +
                "                    历经劫难的叶文洁没有意识到，她彻底改变了人类的命运。地球文明向宇宙发出的第一声啼鸣，以太阳为中心，\n" +
                "                    以光速向宇宙深处飞驰……\n" +
                "                    四光年外，“三体文明”正苦苦挣扎——三颗无规则运行的太阳主导下的百余次毁灭与重生逼迫他们逃离母星。\n" +
                "                    而恰在此时。他们接收到了地球发来的信息。在运用超技术锁死地球人的基础科学之后。三体人庞大的宇宙舰队开始向地球进发……\n" +
                "                    人类的末日悄然来临。");
        data2.setId("CSAPP");
        data2.setName("深入理解计算机系统：第三版");
        data2.setAuthor("兰德尔");
        data2.setState(true);
        data2.setPrice(176);
        data2.setUnitPrice(88);
        data2.setNumber(2);
        data2.setInstruction("和第2版相比，本版内容上最大的变化是，\n" +
                "                    从以IA32和x86-64为基础转变为完全以x86-64为基础。主要更新如下：\n" +
                "                    基于x86-64，大量地重写代码，首次介绍对处理浮点数据的程序的机器级支持。\n" +
                "                    处理器体系结构修改为支持64位字和操作的设计。\n" +
                "                    引入更多的功能单元和更复杂的控制逻辑，使基于程序数据流表示的程序性能模型预测更加可靠。\n" +
                "                    扩充关于用GOT和PLT创建与位置无关代码的讨论，描述了更加强大的链接技术（比如库打桩）。\n" +
                "                    增加了对信号处理程序更细致的描述，包括异步信号安全的函数等。\n" +
                "                    采用新函数，更新了与协议无关和线程安全的网络编程。");
        bookdatalist.add(data1);
        bookdatalist.add(data2);
        return bookdatalist;
    }
}
