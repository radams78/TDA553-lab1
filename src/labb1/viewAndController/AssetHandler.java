package labb1.viewAndController;

import java.util.HashMap;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.IOException;

public class AssetHandler {
    private HashMap<Point, BufferedImage> imagePointMap = new HashMap<Point, BufferedImage>();

    public void bindPointToNamedImage(String modelName, Point point) {
        imagePointMap.put(point, makeImageFromModelName(modelName));
        System.out.print("put in image");
    }

    private BufferedImage makeImageFromModelName(String modelName) {
        try {
            return ImageIO.read(DrawPanel.class.getResourceAsStream("pics/" + modelName + ".jpg"));
        } catch (IOException e) {

            return new BufferedImage(0, 0, 0);
        }
    }

    public BufferedImage getAssetFromPoint(Point point) {
        return imagePointMap.get(point);
    }

}
