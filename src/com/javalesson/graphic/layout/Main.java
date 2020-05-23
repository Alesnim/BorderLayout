package com.javalesson.graphic.layout;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}


class BorderLayoutTest extends JFrame {
    public BorderLayoutTest() {
        super("BorderLayoutTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 250);
        // Панель содержимого
        Container container = getContentPane();
        /*
         *  Размещаем в панели компоненты
         *  В качестве параметров можно использовать
         *  строки и константы класса BorderLayout
         */
        container.add(new JButton("Север"), "North");
        container.add(new JButton("Юг"), "South");
        container.add(new JLabel("Запад"), BorderLayout.WEST);
        container.add(new JLabel("Восток"), BorderLayout.EAST);
        Util util = new Util();
        JLabel img = new JLabel();

        BufferedImage previewImage = util.getImage(200,300);
        img.setIcon(new ImageIcon(previewImage));
        img.setPreferredSize(new Dimension(300, 300));
        // При отсутствии 2-го параметра компонент размещается в центре
        container.add(img);
        // Открываем окно
        setVisible(true);
    }
}