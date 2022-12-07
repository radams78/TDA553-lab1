import java.util.HashMap;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.IOException;

public class AssetHandler {
    private static HashMap<Point, BufferedImage> imagePointMap;

    public static void bindPointToNamedImage(String modelName, Point point) {
        imagePointMap.put(point, makeImageFromModelName(modelName));
    }

    private static BufferedImage makeImageFromModelName(String modelName) {
        try {
            return ImageIO.read(DrawPanel.class.getResourceAsStream("pics" + modelName + ".jpg"));
        } catch (IOException e) {

            return new BufferedImage(0, 0, 0);
        }
    }

    public static BufferedImage getAssetFromPoint(Point point) {
        return imagePointMap.get(point);
    }

}
