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

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingWindow
{
    private final String author = "Douglas Chidester";
    private final String version = " v0.0.2";
    private final String windowTitle = "Pictropolis";
    private final int frameWidth = 1000;
    private final int frameHeight = 800;
    
    private ImageHandler imageHandler;
    
    private JFrame mainWindow;
    private JPanel mainPanel;
    
    public SwingWindow()
    {
        super();
        
        imageHandler = new ImageHandler();
        
        initializeMainWindowAndPanel();
        
        NavagationPanel navPanel = new NavagationPanel(imageHandler);
        
        mainPanel.add(navPanel, BorderLayout.PAGE_END);
        
        mainWindow.setVisible(true);
    }
    
    /**
     * Create a jframe and jpanel to use as the main window.
     */
    private void initializeMainWindowAndPanel()
    {
        mainWindow = new JFrame(windowTitle);
        mainWindow.setSize(frameWidth, frameHeight);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setLocationRelativeTo(null);
        
        mainPanel = new JPanel(new BorderLayout(10, 10));
        //TODO mainPane = mainWindow.getContentPane();
        
        mainWindow.add(mainPanel);
    }

}
