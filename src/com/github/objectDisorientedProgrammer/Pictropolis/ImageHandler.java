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

import java.awt.Canvas;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author doug
 *
 */
public class ImageHandler {
	
	private String previousImagePath;
	private String currentImagePath;
	private String nextImagePath;
	
	private ImageIcon currentImage;
	
	public ImageHandler()
	{
		super();
		this.previousImagePath = null;
		this.nextImagePath = null;
		this.currentImagePath = null;
		this.currentImage = null;
	}
	
	/**
	 * 
	 * @param urlStr - URL to attempt
	 * @return a BufferedImage object or null.
	 */
	public void attemptToLoadUrlImage(String urlStr)
	{
		//BufferedImage bufImg = null;
		try {
			BufferedImage bufImg = ImageIO.read(new URL(urlStr));
			currentImage.setImage(bufImg);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage().toString() + "\n" +urlStr, "Error", JOptionPane.ERROR_MESSAGE);
		}
		//return bufImg;
	}

	public String getCurrentImagePath() {
		return currentImagePath;
	}

	public void setCurrentImagePath(String newImagePath) {
		this.currentImagePath = newImagePath;
	}

}
