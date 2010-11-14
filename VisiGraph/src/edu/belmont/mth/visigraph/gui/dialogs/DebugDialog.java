/**
 * DebugDialog.java
 */
package edu.belmont.mth.visigraph.gui.dialogs;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.html.*;
import edu.belmont.mth.visigraph.resources.*;
import edu.belmont.mth.visigraph.settings.GlobalSettings;
import edu.belmont.mth.visigraph.utilities.DebugUtilities;

/**
 * @author Cameron Behar
 *
 */
@SuppressWarnings("serial")
public class DebugDialog extends JDialog implements ActionListener
{	
	private static DebugDialog dialog;
	
	public static void showDialog(Component owner)
	{
		dialog = new DebugDialog(JOptionPane.getFrameForComponent(owner));
		dialog.setVisible(true);
		return;
	}
	
	private DebugDialog(Frame owner)
	{
		super(owner, GlobalSettings.applicationName + " debug console", true);
		this.setResizable(false);
		
		JPanel inputPanel = new JPanel(new GridBagLayout());
		inputPanel.setBorder(BorderFactory.createEmptyBorder(8, 0, 8, 0));
		
		final HTMLEditorKit html = new HTMLEditorKit();
		JEditorPane logPane = new JEditorPane() { { setEditorKit( html ); setBackground( Color.white ); setEditable(false); } };
		
		try { html.read( new StringReader(DebugUtilities.getLog()), logPane.getDocument(), 0 ); }
		catch (Exception e) { DebugUtilities.logException("An exception occurred while loading the debug console.", e); e.printStackTrace(); }

		inputPanel.add( new JScrollPane(logPane) { { setPreferredSize(new Dimension(700, 500)); } }, new GridBagConstraints() { { gridx = 0; gridy = 0; } } );
		
		//Create and initialize the buttons
		final JButton okButton = new JButton(StringBundle.get("ok_button_text")) { { setPreferredSize(new Dimension(80, 28)); setActionCommand("Ok"); } };
		okButton.addActionListener(this);
		getRootPane().setDefaultButton(okButton);
		
		//Lay out the buttons from left to right
		JPanel buttonPanel = new JPanel()
		{
			{
				setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
				setBorder(BorderFactory.createEmptyBorder(-2, 9, 9, 13));
				add(Box.createHorizontalGlue());
				add(okButton);
			}
		};
		
		//Put everything together, using the content pane's BorderLayout
		Container contentPanel = getContentPane();
		contentPanel.setLayout(new BorderLayout(9, 0));
		contentPanel.add(inputPanel, BorderLayout.CENTER);
		contentPanel.add(buttonPanel, BorderLayout.PAGE_END);
		
		Dimension size = this.getPreferredSize();
		size.width += 40;
		size.height += 40;
		setPreferredSize(size);
		
		pack();
		setLocationRelativeTo(owner);
	}

	public void actionPerformed(ActionEvent e)
	{
		DebugDialog.dialog.setVisible(false);
	}
}
