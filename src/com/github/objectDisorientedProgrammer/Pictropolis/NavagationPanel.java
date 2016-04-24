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

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author doug
 *
 */
public class NavagationPanel extends JPanel {
	
	private JButton previousBtn, nextBtn;
	private JTextField imagePathTxtFld;
	
	/**
	 * Panel with components for selecting different images.
	 */
	public NavagationPanel()
	{
		super();
		initializeComponents();
		setupComponentBehavior();
		addComponents();
	}

	private void addComponents() {
		// TODO Auto-generated method stub
		
	}

	private void setupComponentBehavior() {
		// TODO Auto-generated method stub
		
	}

	private void initializeComponents() {
		// TODO Auto-generated method stub
		
	}

}