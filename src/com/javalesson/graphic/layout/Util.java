package com.javalesson.graphic.layout;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Util {
    BufferedImage previewImage = null;

    public Util() {

        String url = "https://www.pulpfreepress.com/wp-content/uploads/2017/05/JFAFrontCover_FullSize.jpg";
        try {
            previewImage = ImageIO.read(new URL(url));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Image getImage(Dimension d) {
        BufferedImage dest = previewImage.getSubimage(0, 0, d.width, d.height);
        return dest;
    }

    public BufferedImage getImage(int w, int h) {
        BufferedImage dest = previewImage.getSubimage(0, 0, w, h);
        return dest;
    }
}
