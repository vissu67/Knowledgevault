/**
 *  OpenKM, Open Document Management System (http://www.openkm.com)
 *  Copyright (c) 2006-2011  Paco Avila & Josep Llort
 *
 *  No bytes were intentionally harmed during the development of this application.
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.openkm.frontend.client.widget;

import java.util.Map;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.openkm.frontend.client.Main;
import com.openkm.frontend.client.bean.GWTReport;
import com.openkm.frontend.client.util.Util;
import com.openkm.frontend.client.widget.form.FormManager;
/**
 * ReportPopup
 * s
 * @author jllort
 *
 */
public class ReportPopup extends DialogBox {
	
	private VerticalPanel vPanel;
	private Button cancelbutton;
	private Button executeButton;
	private GWTReport report;
	private FormManager manager;
	
	/**
	 * ReportPopup popup
	 */
	public ReportPopup() {
		// Establishes auto-close when click outside
		super(false,true);
		
		setText(Main.i18n("report.parameters"));
		vPanel = new VerticalPanel();
		
		manager = new FormManager();
		
		cancelbutton =  new Button(Main.i18n("button.execute"));
		cancelbutton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				report = null;
				hide();
			}
		});
		cancelbutton.setStyleName("okm-Button");
		executeButton =  new Button(Main.i18n("button.execute"));
		executeButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				manager.updateFormElementsValuesWithNewer(); // Updates form element values
				Map<String, String> parameters = manager.getStringMapValues();
				parameters.put("format", String.valueOf(Main.get().mainPanel.topPanel.mainMenu.getReportOutput()));
				Util.executeReport(report.getId(), parameters);
				hide();
			}
		});
		executeButton.setStyleName("okm-Button");
		
		HorizontalPanel hPanel = new HorizontalPanel();
		hPanel.add(cancelbutton);
		hPanel.add(Util.hSpace("5"));
		hPanel.add(executeButton);
		
		vPanel.add(manager.getTable());
		vPanel.add(Util.vSpace("5"));
		vPanel.add(hPanel);
		vPanel.add(Util.vSpace("5"));
		vPanel.setCellHorizontalAlignment(hPanel, HasAlignment.ALIGN_CENTER);
		vPanel.setSize("100%", "20");
		
		super.hide();
		setWidget(vPanel);
	}
	
	/**
	 * @param report
	 */
	public void setReport(GWTReport report) {
		this.report = report;
		manager.setFormElements(report.getFormElements());
		manager.edit();
	}
	
	/**
	 * langRefresh
	 */
	public void langRefresh() {
		setText(Main.i18n("report.parameters"));
		cancelbutton.setHTML(Main.i18n("button.execute"));
		executeButton.setHTML(Main.i18n("button.execute"));
	}
}
