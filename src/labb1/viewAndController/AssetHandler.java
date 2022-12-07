package labb1.viewAndController;

import java.util.HashMap;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.IOException;

public class AssetHandler {
    private HashMap<Point, BufferedImage> imagePointMap = new HashMap<Point, BufferedImage>();
    private HashMap<String, BufferedImage> imageNameMap = new HashMap<String, BufferedImage>();

    public void addNamedImageToDict(String name) {
        BufferedImage image = makeImageFromModelName(name);
        imageNameMap.put(name, image);
    }

    private BufferedImage findImageFromName(String name) {
        return imageNameMap.get(name);
    }

    public void bindPointToNamedImage(String modelName, Point point) {
        imagePointMap.put(point, findImageFromName(modelName));
    }

    private BufferedImage makeImageFromModelName(String modelName) {
        try {
            BufferedImage image = ImageIO
                    .read(DrawPanel.class.getResourceAsStream("pics/" + modelName + ".jpg"));
            return image;
        } catch (IOException e) {
            return new BufferedImage(1, 1, 1);
        }
    }

    public BufferedImage getAssetFromPoint(Point point) {
        return imagePointMap.get(point);
    }

    public void clear() {
        imagePointMap.clear();
    }

    public void removePoint(Point point){
        imagePointMap.remove(point);
    }

}
