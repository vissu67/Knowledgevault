package com.openkm.extension.frontend.client.util;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class OKMExtensionBundleExampleResources_default_StaticClientBundleGenerator implements com.openkm.extension.frontend.client.util.OKMExtensionBundleExampleResources {
  public com.google.gwt.resources.client.ImageResource box() {
    return box;
  }
  public com.google.gwt.resources.client.ImageResource general() {
    return general;
  }
  private void _init0() {
    box = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "box",
    bundledImage_None,
    40, 0, 16, 16, false, false
  );
    general = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "general",
    bundledImage_None,
    0, 0, 40, 40, false, false
  );
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "BED4201AF37314788EC9E841339F6B52.cache.png";
  private static com.google.gwt.resources.client.ImageResource box;
  private static com.google.gwt.resources.client.ImageResource general;
  
  static {
    new OKMExtensionBundleExampleResources_default_StaticClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      box(), 
      general(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("box", box());
        resourceMap.put("general", general());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'box': return this.@com.openkm.extension.frontend.client.util.OKMExtensionBundleExampleResources::box()();
      case 'general': return this.@com.openkm.extension.frontend.client.util.OKMExtensionBundleExampleResources::general()();
    }
    return null;
  }-*/;
}
