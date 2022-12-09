import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

import java.io.IOException;

import javax.swing.*;

public class ImageFactory extends JPanel{
    
    public static BufferedImage makeImage(String imageSource) throws IOException{
          
        return ImageIO.read(DrawPanel.class.getResourceAsStream(imageSource));
        
    }

}

