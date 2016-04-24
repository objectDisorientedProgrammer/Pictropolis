/**
 * SwingWindow.java
 * @author Douglas Chidester
 * @date 23 April 2016
 * @time 23:48
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

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingWindow
{
	private final String author = "Douglas Chidester";
	private final String version = " v0.0.1";
	private final String windowTitle = "Pictropolis";
	private final int frameWidth = 450;
	private final int frameHeight = 400;
	
	private JFrame mainWindow;
	private JPanel mainPanel;
	
	public SwingWindow()
	{
		super();
		
		initializeMainWindowAndPanel();
		
		mainWindow.setVisible(true);
	}
	
	private void initializeMainWindowAndPanel()
	{
		mainWindow = new JFrame(windowTitle);
		mainWindow.setSize(frameWidth, frameHeight);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setLocationRelativeTo(null);
		
		mainPanel = new JPanel(null); // TODO change layout manager
		
		mainWindow.add(mainPanel);
	}

}
