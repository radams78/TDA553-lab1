package labb1.viewAndController;

import java.util.HashMap;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.IOException;

public class AssetHandler {
    private HashMap<Point, BufferedImage> imagePointMap = new HashMap<Point, BufferedImage>();
    BufferedImage currentImage;

    public void bindPointToNamedImage(String modelName, Point point) {
        makeImageFromModelName(modelName);
        imagePointMap.put(point, currentImage);
        System.out.print("put in image");
    }

    private void makeImageFromModelName(String modelName) {
        try {
            currentImage = ImageIO
                    .read(DrawPanel.class.getResourceAsStream("pics/" + modelName + ".jpg"));
        } catch (IOException e) {
        }
    }

    public BufferedImage getAssetFromPoint(Point point) {
        return imagePointMap.get(point);
    }

}
