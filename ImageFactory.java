import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

import java.io.IOException;

import javax.swing.*;

public class ImageFactory extends JPanel{
    
    public static BufferedImage makeVolvoImage(String imageSource) throws IOException{
          
        return ImageIO.read(DrawPanel.class.getResourceAsStream(imageSource));
        
    }

    public static BufferedImage makeSaab95Image(String imageSource)throws IOException{
        return ImageIO.read(DrawPanel.class.getResourceAsStream(imageSource));
    }

    public static BufferedImage makeScaniaImage(String imageSource)throws IOException{
        return ImageIO.read(DrawPanel.class.getResourceAsStream(imageSource));
    }

    public static BufferedImage makCarTransporterImage(String imageSource)throws IOException{
        return ImageIO.read(DrawPanel.class.getResourceAsStream(imageSource));
    }

}
