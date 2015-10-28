package GUI;

import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.Container;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;
import java.awt.Color;

class JPictureBox extends JPanel {

    private BufferedImage image;
    private int height;
    private int width;
    private boolean autoScale;
    private Container parent;

    public JPictureBox(String path,int height,int width,boolean autoScale) {
        this.height=height;
        this.width=width;
        this.autoScale=autoScale;
        this.parent=parent;
        try {
            image=ImageIO.read(new File(path));
        }
        catch( IOException e) {
            e.printStackTrace();
        }

        if (autoScale) {
            Image i=image.getScaledInstance(width,height,Image.SCALE_SMOOTH);
            BufferedImage buff=new BufferedImage(i.getWidth(null),i.getHeight(null),BufferedImage.TYPE_INT_RGB);
            Graphics g= buff.createGraphics();
            g.drawImage(i,0,0,new Color(0,0,0),null);
            g.dispose();
            image=buff;
        }
    }

    public JPictureBox(String path,int height,int width) {
        this.height=height;
        this.width=width;
        this.autoScale=autoScale;
        this.parent=parent;
        try {
            image=ImageIO.read(new File(path));
        }
        catch( IOException e) {
            e.printStackTrace();
        }
    }

    @Override 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image,0,0,this);
    }

    public int getWidth() {
        return width; 
    }

    public int getHeight() {
        return height;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(String imgPath) {
        try {
            this.image=ImageIO.read(new File(imgPath));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}