package labb1.viewAndController;

import java.util.HashMap;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.IOException;

public class AssetHandler {
    private HashMap<Point, BufferedImage> assetPointMap = new HashMap<Point, BufferedImage>();
    private HashMap<String, BufferedImage> assetNameMap = new HashMap<String, BufferedImage>();

    public void addNamedImageToDict(String name) {
        BufferedImage image = makeImageFromModelName(name);
        assetNameMap.put(name, image);
    }

    private BufferedImage findImageFromName(String name) {
        if (assetNameMap.containsKey(name)) {
            return assetNameMap.get(name);
        }else   {
            throw new IllegalArgumentException("Name "+ name + " doesnt exist");
        }
    }

    public void bindPointToNamedImage(String modelName, Point point) {
        assetPointMap.put(point, findImageFromName(modelName));
    }

    private BufferedImage makeImageFromModelName(String modelName) {
        try {
            BufferedImage image = ImageIO
                    .read(DrawPanel.class.getResourceAsStream("pics/" + modelName + ".jpg"));
            return image;
        } catch (IOException e) {
            throw new RuntimeException("Image with the name " + modelName + " doesnt exist.");
            // return new BufferedImage(1, 1, 1);
        }
    }

    public BufferedImage getAssetFromPoint(Point point) {
        if (assetPointMap.containsKey(point)) {
            //TODO see if you can be more defensive here
            return assetPointMap.get(point);
        }else{
            throw new IllegalArgumentException("point " + point +" does not exist in hash");
        }
    }


    public void refresh(){
        assetPointMap = new HashMap<Point, BufferedImage>();
    }




}
