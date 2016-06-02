/**
 * NavagationPanel.java
 * @author Douglas Chidester
 * @date 24 April 2016
 * @time 00:08
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

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author doug
 *
 */
public class NavagationPanel extends JPanel {
	
	private JButton previousBtn, nextBtn, goBtn;
	
	private String previousBtnText = "<-- prev"; // TODO use icon
	private String nextBtnText = "next -->"; // TODO use icon
	private String goBtnText = "go";
	
	private JTextField imagePathTxtFld;
	private JTextField imageIndexTxtFld;
	private int imageIndex = 1; // default value of 1
	
	private JComboBox<String> validExtensionsChooser;
	private String[] validImageExtensions = { ".jpg", ".jpeg", ".png", ".gif" };
	
	private String fullURL = null;
	
	/**
	 * Panel with components for selecting different images.
	 * @param imageHandler 
	 */
	public NavagationPanel()
	{
		super();
		
		this.setLayout(new FlowLayout());
		
		initializeComponents();
		setupComponentBehavior();
		addComponents();
	}

	private void addComponents() {
		this.add(previousBtn);
		this.add(goBtn);
		this.add(nextBtn);
		this.add(imagePathTxtFld);
		this.add(imageIndexTxtFld);
		this.add(validExtensionsChooser);
	}

	private void setupComponentBehavior()
	{
		goBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(getFullURL());
			}
		});
		
		previousBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//imgHandler.attemptToLoadUrlImage(imagePathTxtFld.getText());
			}
		});
		
		nextBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String currentURL = imagePathTxtFld.getText();
				
				++imageIndex;
				// if next number will spill over to next place: 9 -> 10
				if(imageIndex % 10 == 0)
				{
					// if the current url has a zero at the end remove it for the new url
					if(currentURL.endsWith("0"))
					{
						currentURL = currentURL.substring(0, currentURL.length() - 1);
						imagePathTxtFld.setText(currentURL); // update url
					}
				}
			}
		});
		
		imageIndexTxtFld.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
				imageIndex = Integer.parseInt(imageIndexTxtFld.getText());
			}
		});
	}

	private void initializeComponents() {
		previousBtn = new JButton(previousBtnText); // TODO use icon (also?)
		nextBtn = new JButton(nextBtnText); // TODO use icon (also?)
		goBtn = new JButton(goBtnText);
		
		imagePathTxtFld = new JTextField("some default text");
		imageIndexTxtFld = new JTextField("0001");
		
		validExtensionsChooser = new JComboBox<String>(validImageExtensions);
		validExtensionsChooser.setSelectedIndex(0); // select first item by default
	}

	/**
	 * @return the fullURL
	 */
	public String getFullURL() {
		fullURL = imagePathTxtFld.getText() + imageIndexTxtFld.getText() + validImageExtensions[validExtensionsChooser.getSelectedIndex()];
		return fullURL;
	}

//	/**
//	 * @param fullURL the fullURL to set
//	 */
//	public void setFullURL(String fullURL) {
//		this.fullURL = fullURL;
//	}

}
