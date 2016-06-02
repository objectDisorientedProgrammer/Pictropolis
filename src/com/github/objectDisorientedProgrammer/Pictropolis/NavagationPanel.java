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
	
	private int imageIndex = 0;
	
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
	}

	private void setupComponentBehavior()
	{
		previousBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//imgHandler.attemptToLoadUrlImage(imagePathTxtFld.getText());
			}
		});
		
		nextBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//imgHandler.attemptToLoadUrlImage(imagePathTxtFld.getText());
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
		imageIndexTxtFld = new JTextField("some default text");
	}

}
