/**
 * ImageHandler.java
 * @author Douglas Chidester
 * @date 24 April 2016
 * @time 00:12
 * 
 * An advanced image viewer.
 * 
    Copyright (C) 2016  Douglas Chidester

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package com.github.objectDisorientedProgrammer.Pictropolis;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * @author doug
 *
 */
public class ImageHandler {
    
    private String urlString;
    private ImageIcon currentImage;

    public ImageHandler() {
        super();
        this.currentImage = new ImageIcon();
    }

    /**
     * Try loading an image from a URL.
     * @param urlStr - URL to attempt
     * @return currentImage
     * @throws IOException 
     * @throws MalformedURLException 
     */
    public ImageIcon attemptToLoadUrlImage(String urlStr) throws MalformedURLException, IOException {
        BufferedImage bufImg = ImageIO.read(new URL(urlStr));
        System.out.println("attempting URL: '"+urlStr+"'");
        currentImage.setImage(bufImg);
        return currentImage;
    }

    /**
     * Set the url to load.
     * @param url - well formatted website URL
     */
    public void setUrlString(String url)
    {
        // TODO verify valid url
        this.urlString = url;
    }

}
