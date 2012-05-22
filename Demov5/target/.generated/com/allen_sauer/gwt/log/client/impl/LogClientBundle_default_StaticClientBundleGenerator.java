package com.allen_sauer.gwt.log.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class LogClientBundle_default_StaticClientBundleGenerator implements com.allen_sauer.gwt.log.client.impl.LogClientBundle {
  public com.allen_sauer.gwt.log.client.impl.LogClientBundle.LogCssResource css() {
    return css;
  }
  private void _init0() {
    css = new com.allen_sauer.gwt.log.client.impl.LogClientBundle.LogCssResource() {
    private boolean injected;
    public boolean ensureInjected() {
      if (!injected) {
        injected = true;
        com.google.gwt.dom.client.StyleInjector.inject(getText());
        return true;
      }
      return false;
    }
    public String getName() {
      return "css";
    }
    public String getText() {
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".log-panel{background-color:" + ("#ecf2fc")  + ";border:" + ("1px"+ " " +"solid"+ " " +"red")  + ";margin:" + ("0")  + ";filter:" + ("alpha(opacity\\=95)")  + ";opacity:" + ("0.95")  + ";z-index:" + ("1000")  + ";}.log-panel .GMGDFJ1DI{font-size:" + ("10pt")  + ";margin:" + ("0")  + ";text-align:" + ("right")  + ";}.log-panel BUTTON{font-size:" + ("10pt")  + ";margin:") + (("0")  + ";}.log-panel .GMGDFJ1DJ{cursor:" + ("move")  + ";font-weight:" + ("bold")  + ";}.log-panel .GMGDFJ1DB{margin:" + ("0"+ " " +"1.2em")  + ";}.log-panel BUTTON.GMGDFJ1DA{color:" + ("#444")  + " !important;}.log-panel .GMGDFJ1DH{white-space:" + ("nowrap")  + ";}.log-panel .GMGDFJ1DC{white-space:" + ("pre")  + ";font-family:" + ("monospace")  + ";cursor:" + ("help")  + ";}.log-panel .GMGDFJ1DD{background-color:" + ("#f0f0f0")  + ";}.log-panel .GMGDFJ1DG{background-color:" + ("#fff") ) + (";}.log-panel .GMGDFJ1DF{cursor:" + ("sw-resize")  + ";}")) : ((".log-panel{background-color:" + ("#ecf2fc")  + ";border:" + ("1px"+ " " +"solid"+ " " +"red")  + ";margin:" + ("0")  + ";filter:" + ("alpha(opacity\\=95)")  + ";opacity:" + ("0.95")  + ";z-index:" + ("1000")  + ";}.log-panel .GMGDFJ1DI{font-size:" + ("10pt")  + ";margin:" + ("0")  + ";text-align:" + ("left")  + ";}.log-panel BUTTON{font-size:" + ("10pt")  + ";margin:") + (("0")  + ";}.log-panel .GMGDFJ1DJ{cursor:" + ("move")  + ";font-weight:" + ("bold")  + ";}.log-panel .GMGDFJ1DB{margin:" + ("0"+ " " +"1.2em")  + ";}.log-panel BUTTON.GMGDFJ1DA{color:" + ("#444")  + " !important;}.log-panel .GMGDFJ1DH{white-space:" + ("nowrap")  + ";}.log-panel .GMGDFJ1DC{white-space:" + ("pre")  + ";font-family:" + ("monospace")  + ";cursor:" + ("help")  + ";}.log-panel .GMGDFJ1DD{background-color:" + ("#f0f0f0")  + ";}.log-panel .GMGDFJ1DG{background-color:" + ("#fff") ) + (";}.log-panel .GMGDFJ1DF{cursor:" + ("se-resize")  + ";}"));
    }
    public java.lang.String logClearAbout(){
      return "GMGDFJ1DA";
    }
    public java.lang.String logClearButton(){
      return "GMGDFJ1DB";
    }
    public java.lang.String logMessage(){
      return "GMGDFJ1DC";
    }
    public java.lang.String logMessageHover(){
      return "GMGDFJ1DD";
    }
    public java.lang.String logPanel(){
      return "log-panel";
    }
    public java.lang.String logResizeSe(){
      return "GMGDFJ1DF";
    }
    public java.lang.String logScrollPanel(){
      return "GMGDFJ1DG";
    }
    public java.lang.String logStacktrace(){
      return "GMGDFJ1DH";
    }
    public java.lang.String logTextArea(){
      return "GMGDFJ1DI";
    }
    public java.lang.String logTitle(){
      return "GMGDFJ1DJ";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.allen_sauer.gwt.log.client.impl.LogClientBundle.LogCssResource css;
  
  static {
    new LogClientBundle_default_StaticClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.allen_sauer.gwt.log.client.impl.LogClientBundle::css()();
    }
    return null;
  }-*/;
}
