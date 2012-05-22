package com.google.gwt.user.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class VerticalSplitPanel_Resources_default_StaticClientBundleGenerator implements com.google.gwt.user.client.ui.VerticalSplitPanel.Resources {
  public com.google.gwt.resources.client.ImageResource verticalSplitPanelThumb() {
    return verticalSplitPanelThumb;
  }
  private void _init0() {
    verticalSplitPanelThumb = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "verticalSplitPanelThumb",
    bundledImage_None,
    0, 0, 7, 7, false, false
  );
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "8603379B5088782D2C0620FAE856E112.cache.png";
  private static com.google.gwt.resources.client.ImageResource verticalSplitPanelThumb;
  
  static {
    new VerticalSplitPanel_Resources_default_StaticClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      verticalSplitPanelThumb(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("verticalSplitPanelThumb", verticalSplitPanelThumb());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'verticalSplitPanelThumb': return this.@com.google.gwt.user.client.ui.VerticalSplitPanel.Resources::verticalSplitPanelThumb()();
    }
    return null;
  }-*/;
}
