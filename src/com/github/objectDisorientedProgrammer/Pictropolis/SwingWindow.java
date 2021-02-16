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
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SwingWindow
{
    private final String author = "Douglas Chidester";
    private final String version = " v0.0.2";
    private final String windowTitle = "Pictropolis";
    private final int frameWidth = 1000;
    private final int frameHeight = 800;
    
    private static ImageHandler imageHandler;
    private static NavagationPanel navPanel;
    
    private JFrame mainWindow;
    private static JPanel mainPanel;
    
    private static ImageIcon img;
    
    public SwingWindow()
    {
        super();
        initializeMainWindowAndPanel();
        
        imageHandler = new ImageHandler();
        
        
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
        navPanel = new NavagationPanel();
        mainPanel.add(navPanel, BorderLayout.PAGE_END);
        
        mainWindow.add(mainPanel);
        
        mainWindow.setVisible(true);
    }
    
    public void paint(Graphics g) {
        mainPanel.paint(g);
        Graphics2D g2d = (Graphics2D) g; // initialize graphics
        g2d.drawImage(img.getImage(), (mainPanel.getWidth() - img.getIconWidth()) / 2,
                (mainPanel.getHeight() - img.getIconHeight()) / 2, mainPanel); // draw
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
    private static ImageIcon loadImage()
    {
        ImageIcon icon = null;
        String url = navPanel.getFullURL();
        
        try
        {
            icon = imageHandler.attemptToLoadUrlImage(url);
        } catch(MalformedURLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage().toString() + "\n" + url, "Bad URL",
                    JOptionPane.ERROR_MESSAGE);
        } catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage().toString() + "\n" + url, "IO Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        return icon == null ? new ImageIcon() : icon; // TODO load default image
    }

    public static void displayImage()
    {
        img = loadImage();
        mainPanel.repaint();
    }

}
