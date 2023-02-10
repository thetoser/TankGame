package com.zhljava.draw;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings({"all"})
public class DrawCircle extends JFrame {//JFrame对应的窗口
    //定义一个面板
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        mp = new MyPanel();
        //把面板放入到窗口(画框)
        this.add(mp);
        //设置窗口大小
        this.setSize(500, 800);
        //当点击窗口x，程序退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}

//1.先定义一个 MyPanel, 继承 JPanel 类， 画图形，就在面板上画
class MyPanel extends JPanel {
    //1. MyPanel 对象就是一个画板
    //2. Graphics g 把 g 理解成一支画笔
    //3. Graphics 提供了很多绘图的方法
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //画出一个圆形
        //g.drawOval(10, 10, 100, 100);
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bz1.jpg"));
        g.drawImage(image, 10, 10, 270, 570, this);
    }

}
