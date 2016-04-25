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
	}
	
	

	public String getCurrentImagePath() {
		return currentImagePath;
	}

	public void setCurrentImagePath(String newImagePath) {
		this.currentImagePath = newImagePath;
	}

}
