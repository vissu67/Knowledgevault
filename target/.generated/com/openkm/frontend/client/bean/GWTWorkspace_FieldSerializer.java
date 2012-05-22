package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTWorkspace_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTWorkspace_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTWorkspace)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTWorkspace_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTWorkspace_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTWorkspace)object);
    }
  }
  private static native boolean getAdminRole(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::adminRole;
  }-*/;
  
  private static native void  setAdminRole(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::adminRole = value;
  }-*/;
  
  private static native boolean getAdvancedFilters(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::advancedFilters;
  }-*/;
  
  private static native void  setAdvancedFilters(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::advancedFilters = value;
  }-*/;
  
  private static native java.lang.String getAppVersion(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::appVersion;
  }-*/;
  
  private static native void  setAppVersion(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::appVersion = value;
  }-*/;
  
  private static native java.lang.String getApplicationURL(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::applicationURL;
  }-*/;
  
  private static native void  setApplicationURL(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::applicationURL = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTAvailableOption getAvailableOption(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::availableOption;
  }-*/;
  
  private static native void  setAvailableOption(com.openkm.frontend.client.bean.GWTWorkspace instance, com.openkm.frontend.client.bean.GWTAvailableOption value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::availableOption = value;
  }-*/;
  
  private static native boolean getChangePassword(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::changePassword;
  }-*/;
  
  private static native void  setChangePassword(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::changePassword = value;
  }-*/;
  
  private static native boolean getChatAutoLogin(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::chatAutoLogin;
  }-*/;
  
  private static native void  setChatAutoLogin(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::chatAutoLogin = value;
  }-*/;
  
  private static native boolean getChatEnabled(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::chatEnabled;
  }-*/;
  
  private static native void  setChatEnabled(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::chatEnabled = value;
  }-*/;
  
  private static native boolean getDashboardGeneralVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::dashboardGeneralVisible;
  }-*/;
  
  private static native void  setDashboardGeneralVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::dashboardGeneralVisible = value;
  }-*/;
  
  private static native boolean getDashboardKeywordsVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::dashboardKeywordsVisible;
  }-*/;
  
  private static native void  setDashboardKeywordsVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::dashboardKeywordsVisible = value;
  }-*/;
  
  private static native boolean getDashboardMailVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::dashboardMailVisible;
  }-*/;
  
  private static native void  setDashboardMailVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::dashboardMailVisible = value;
  }-*/;
  
  private static native boolean getDashboardNewsVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::dashboardNewsVisible;
  }-*/;
  
  private static native void  setDashboardNewsVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::dashboardNewsVisible = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getDashboardSchedule(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::dashboardSchedule;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void  setDashboardSchedule(com.openkm.frontend.client.bean.GWTWorkspace instance, long value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::dashboardSchedule = value;
  }-*/;
  
  private static native boolean getDashboardUserVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::dashboardUserVisible;
  }-*/;
  
  private static native void  setDashboardUserVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::dashboardUserVisible = value;
  }-*/;
  
  private static native boolean getDashboardWorkflowVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::dashboardWorkflowVisible;
  }-*/;
  
  private static native void  setDashboardWorkflowVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::dashboardWorkflowVisible = value;
  }-*/;
  
  private static native java.lang.String getEmail(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::email;
  }-*/;
  
  private static native void  setEmail(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::email = value;
  }-*/;
  
  private static native java.lang.String getImapFolder(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::imapFolder;
  }-*/;
  
  private static native void  setImapFolder(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::imapFolder = value;
  }-*/;
  
  private static native java.lang.String getImapHost(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::imapHost;
  }-*/;
  
  private static native void  setImapHost(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::imapHost = value;
  }-*/;
  
  private static native int getImapID(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::imapID;
  }-*/;
  
  private static native void  setImapID(com.openkm.frontend.client.bean.GWTWorkspace instance, int value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::imapID = value;
  }-*/;
  
  private static native java.lang.String getImapPassword(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::imapPassword;
  }-*/;
  
  private static native void  setImapPassword(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::imapPassword = value;
  }-*/;
  
  private static native java.lang.String getImapUser(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::imapUser;
  }-*/;
  
  private static native void  setImapUser(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::imapUser = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getKeepAliveSchedule(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::keepAliveSchedule;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void  setKeepAliveSchedule(com.openkm.frontend.client.bean.GWTWorkspace instance, long value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::keepAliveSchedule = value;
  }-*/;
  
  private static native boolean getKeywordEnabled(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::keywordEnabled;
  }-*/;
  
  private static native void  setKeywordEnabled(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::keywordEnabled = value;
  }-*/;
  
  private static native java.util.List getLangs(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::langs;
  }-*/;
  
  private static native void  setLangs(com.openkm.frontend.client.bean.GWTWorkspace instance, java.util.List value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::langs = value;
  }-*/;
  
  private static native boolean getMenuBookmarksVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::menuBookmarksVisible;
  }-*/;
  
  private static native void  setMenuBookmarksVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::menuBookmarksVisible = value;
  }-*/;
  
  private static native boolean getMenuEditVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::menuEditVisible;
  }-*/;
  
  private static native void  setMenuEditVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::menuEditVisible = value;
  }-*/;
  
  private static native boolean getMenuFileVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::menuFileVisible;
  }-*/;
  
  private static native void  setMenuFileVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::menuFileVisible = value;
  }-*/;
  
  private static native boolean getMenuHelpVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::menuHelpVisible;
  }-*/;
  
  private static native void  setMenuHelpVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::menuHelpVisible = value;
  }-*/;
  
  private static native boolean getMenuToolsVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::menuToolsVisible;
  }-*/;
  
  private static native void  setMenuToolsVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::menuToolsVisible = value;
  }-*/;
  
  private static native java.lang.String getPassword(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::password;
  }-*/;
  
  private static native void  setPassword(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::password = value;
  }-*/;
  
  private static native java.lang.String getPreviewer(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::previewer;
  }-*/;
  
  private static native void  setPreviewer(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::previewer = value;
  }-*/;
  
  private static native boolean getPrintPreview(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::printPreview;
  }-*/;
  
  private static native void  setPrintPreview(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::printPreview = value;
  }-*/;
  
  private static native java.util.List getReports(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::reports;
  }-*/;
  
  private static native void  setReports(com.openkm.frontend.client.bean.GWTWorkspace instance, java.util.List value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::reports = value;
  }-*/;
  
  private static native java.util.List getRoleList(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::roleList;
  }-*/;
  
  private static native void  setRoleList(com.openkm.frontend.client.bean.GWTWorkspace instance, java.util.List value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::roleList = value;
  }-*/;
  
  private static native boolean getStackCategoriesVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::stackCategoriesVisible;
  }-*/;
  
  private static native void  setStackCategoriesVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::stackCategoriesVisible = value;
  }-*/;
  
  private static native boolean getStackMailVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::stackMailVisible;
  }-*/;
  
  private static native void  setStackMailVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::stackMailVisible = value;
  }-*/;
  
  private static native boolean getStackPersonalVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::stackPersonalVisible;
  }-*/;
  
  private static native void  setStackPersonalVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::stackPersonalVisible = value;
  }-*/;
  
  private static native boolean getStackTaxonomy(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::stackTaxonomy;
  }-*/;
  
  private static native void  setStackTaxonomy(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::stackTaxonomy = value;
  }-*/;
  
  private static native boolean getStackTemplatesVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::stackTemplatesVisible;
  }-*/;
  
  private static native void  setStackTemplatesVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::stackTemplatesVisible = value;
  }-*/;
  
  private static native boolean getStackThesaurusVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::stackThesaurusVisible;
  }-*/;
  
  private static native void  setStackThesaurusVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::stackThesaurusVisible = value;
  }-*/;
  
  private static native boolean getStackTrashVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::stackTrashVisible;
  }-*/;
  
  private static native void  setStackTrashVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::stackTrashVisible = value;
  }-*/;
  
  private static native boolean getTabAdminVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabAdminVisible;
  }-*/;
  
  private static native void  setTabAdminVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabAdminVisible = value;
  }-*/;
  
  private static native boolean getTabDashboardVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDashboardVisible;
  }-*/;
  
  private static native void  setTabDashboardVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDashboardVisible = value;
  }-*/;
  
  private static native boolean getTabDesktopVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDesktopVisible;
  }-*/;
  
  private static native void  setTabDesktopVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDesktopVisible = value;
  }-*/;
  
  private static native boolean getTabDocumentNotesVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDocumentNotesVisible;
  }-*/;
  
  private static native void  setTabDocumentNotesVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDocumentNotesVisible = value;
  }-*/;
  
  private static native boolean getTabDocumentPreviewVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDocumentPreviewVisible;
  }-*/;
  
  private static native void  setTabDocumentPreviewVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDocumentPreviewVisible = value;
  }-*/;
  
  private static native boolean getTabDocumentPropertiesVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDocumentPropertiesVisible;
  }-*/;
  
  private static native void  setTabDocumentPropertiesVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDocumentPropertiesVisible = value;
  }-*/;
  
  private static native boolean getTabDocumentPropertyGroupsVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDocumentPropertyGroupsVisible;
  }-*/;
  
  private static native void  setTabDocumentPropertyGroupsVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDocumentPropertyGroupsVisible = value;
  }-*/;
  
  private static native boolean getTabDocumentSecurityVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDocumentSecurityVisible;
  }-*/;
  
  private static native void  setTabDocumentSecurityVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDocumentSecurityVisible = value;
  }-*/;
  
  private static native boolean getTabDocumentVersionVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDocumentVersionVisible;
  }-*/;
  
  private static native void  setTabDocumentVersionVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabDocumentVersionVisible = value;
  }-*/;
  
  private static native boolean getTabFolderNotesVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabFolderNotesVisible;
  }-*/;
  
  private static native void  setTabFolderNotesVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabFolderNotesVisible = value;
  }-*/;
  
  private static native boolean getTabFolderPropertiesVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabFolderPropertiesVisible;
  }-*/;
  
  private static native void  setTabFolderPropertiesVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabFolderPropertiesVisible = value;
  }-*/;
  
  private static native boolean getTabFolderSecurityVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabFolderSecurityVisible;
  }-*/;
  
  private static native void  setTabFolderSecurityVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabFolderSecurityVisible = value;
  }-*/;
  
  private static native boolean getTabMailPropertiesVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabMailPropertiesVisible;
  }-*/;
  
  private static native void  setTabMailPropertiesVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabMailPropertiesVisible = value;
  }-*/;
  
  private static native boolean getTabMailSecurityVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabMailSecurityVisible;
  }-*/;
  
  private static native void  setTabMailSecurityVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabMailSecurityVisible = value;
  }-*/;
  
  private static native boolean getTabSearchVisible(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabSearchVisible;
  }-*/;
  
  private static native void  setTabSearchVisible(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::tabSearchVisible = value;
  }-*/;
  
  private static native java.lang.String getToken(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::token;
  }-*/;
  
  private static native void  setToken(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::token = value;
  }-*/;
  
  private static native java.lang.String getUser(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::user;
  }-*/;
  
  private static native void  setUser(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::user = value;
  }-*/;
  
  private static native boolean getUserQuotaEnabled(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::userQuotaEnabled;
  }-*/;
  
  private static native void  setUserQuotaEnabled(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::userQuotaEnabled = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getUserQuotaLimit(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::userQuotaLimit;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void  setUserQuotaLimit(com.openkm.frontend.client.bean.GWTWorkspace instance, long value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::userQuotaLimit = value;
  }-*/;
  
  private static native java.lang.String getWebSkin(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::webSkin;
  }-*/;
  
  private static native void  setWebSkin(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::webSkin = value;
  }-*/;
  
  private static native boolean getWebdavFix(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::webdavFix;
  }-*/;
  
  private static native void  setWebdavFix(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::webdavFix = value;
  }-*/;
  
  private static native boolean getWizardCategories(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::wizardCategories;
  }-*/;
  
  private static native void  setWizardCategories(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::wizardCategories = value;
  }-*/;
  
  private static native boolean getWizardKeywords(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::wizardKeywords;
  }-*/;
  
  private static native void  setWizardKeywords(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::wizardKeywords = value;
  }-*/;
  
  private static native boolean getWizardPropertyGroups(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::wizardPropertyGroups;
  }-*/;
  
  private static native void  setWizardPropertyGroups(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::wizardPropertyGroups = value;
  }-*/;
  
  private static native java.util.List getWizardPropertyGroupsList(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::wizardPropertyGroupsList;
  }-*/;
  
  private static native void  setWizardPropertyGroupsList(com.openkm.frontend.client.bean.GWTWorkspace instance, java.util.List value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::wizardPropertyGroupsList = value;
  }-*/;
  
  private static native boolean getWizardWorkflows(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::wizardWorkflows;
  }-*/;
  
  private static native void  setWizardWorkflows(com.openkm.frontend.client.bean.GWTWorkspace instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::wizardWorkflows = value;
  }-*/;
  
  private static native java.util.List getWizardWorkflowsList(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::wizardWorkflowsList;
  }-*/;
  
  private static native void  setWizardWorkflowsList(com.openkm.frontend.client.bean.GWTWorkspace instance, java.util.List value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::wizardWorkflowsList = value;
  }-*/;
  
  private static native java.lang.String getWorkflowProcessIntanceVariablePath(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::workflowProcessIntanceVariablePath;
  }-*/;
  
  private static native void  setWorkflowProcessIntanceVariablePath(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::workflowProcessIntanceVariablePath = value;
  }-*/;
  
  private static native java.lang.String getWorkflowProcessIntanceVariableUUID(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::workflowProcessIntanceVariableUUID;
  }-*/;
  
  private static native void  setWorkflowProcessIntanceVariableUUID(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::workflowProcessIntanceVariableUUID = value;
  }-*/;
  
  private static native java.lang.String getWorkflowRunConfigForm(com.openkm.frontend.client.bean.GWTWorkspace instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTWorkspace::workflowRunConfigForm;
  }-*/;
  
  private static native void  setWorkflowRunConfigForm(com.openkm.frontend.client.bean.GWTWorkspace instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTWorkspace::workflowRunConfigForm = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTWorkspace.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTWorkspace instance) throws SerializationException {
    setAdminRole(instance, streamReader.readBoolean());
    setAdvancedFilters(instance, streamReader.readBoolean());
    setAppVersion(instance, streamReader.readString());
    setApplicationURL(instance, streamReader.readString());
    setAvailableOption(instance, (com.openkm.frontend.client.bean.GWTAvailableOption) streamReader.readObject());
    setChangePassword(instance, streamReader.readBoolean());
    setChatAutoLogin(instance, streamReader.readBoolean());
    setChatEnabled(instance, streamReader.readBoolean());
    setDashboardGeneralVisible(instance, streamReader.readBoolean());
    setDashboardKeywordsVisible(instance, streamReader.readBoolean());
    setDashboardMailVisible(instance, streamReader.readBoolean());
    setDashboardNewsVisible(instance, streamReader.readBoolean());
    setDashboardSchedule(instance, streamReader.readLong());
    setDashboardUserVisible(instance, streamReader.readBoolean());
    setDashboardWorkflowVisible(instance, streamReader.readBoolean());
    setEmail(instance, streamReader.readString());
    setImapFolder(instance, streamReader.readString());
    setImapHost(instance, streamReader.readString());
    setImapID(instance, streamReader.readInt());
    setImapPassword(instance, streamReader.readString());
    setImapUser(instance, streamReader.readString());
    setKeepAliveSchedule(instance, streamReader.readLong());
    setKeywordEnabled(instance, streamReader.readBoolean());
    setLangs(instance, (java.util.List) streamReader.readObject());
    setMenuBookmarksVisible(instance, streamReader.readBoolean());
    setMenuEditVisible(instance, streamReader.readBoolean());
    setMenuFileVisible(instance, streamReader.readBoolean());
    setMenuHelpVisible(instance, streamReader.readBoolean());
    setMenuToolsVisible(instance, streamReader.readBoolean());
    setPassword(instance, streamReader.readString());
    setPreviewer(instance, streamReader.readString());
    setPrintPreview(instance, streamReader.readBoolean());
    setReports(instance, (java.util.List) streamReader.readObject());
    setRoleList(instance, (java.util.List) streamReader.readObject());
    setStackCategoriesVisible(instance, streamReader.readBoolean());
    setStackMailVisible(instance, streamReader.readBoolean());
    setStackPersonalVisible(instance, streamReader.readBoolean());
    setStackTaxonomy(instance, streamReader.readBoolean());
    setStackTemplatesVisible(instance, streamReader.readBoolean());
    setStackThesaurusVisible(instance, streamReader.readBoolean());
    setStackTrashVisible(instance, streamReader.readBoolean());
    setTabAdminVisible(instance, streamReader.readBoolean());
    setTabDashboardVisible(instance, streamReader.readBoolean());
    setTabDesktopVisible(instance, streamReader.readBoolean());
    setTabDocumentNotesVisible(instance, streamReader.readBoolean());
    setTabDocumentPreviewVisible(instance, streamReader.readBoolean());
    setTabDocumentPropertiesVisible(instance, streamReader.readBoolean());
    setTabDocumentPropertyGroupsVisible(instance, streamReader.readBoolean());
    setTabDocumentSecurityVisible(instance, streamReader.readBoolean());
    setTabDocumentVersionVisible(instance, streamReader.readBoolean());
    setTabFolderNotesVisible(instance, streamReader.readBoolean());
    setTabFolderPropertiesVisible(instance, streamReader.readBoolean());
    setTabFolderSecurityVisible(instance, streamReader.readBoolean());
    setTabMailPropertiesVisible(instance, streamReader.readBoolean());
    setTabMailSecurityVisible(instance, streamReader.readBoolean());
    setTabSearchVisible(instance, streamReader.readBoolean());
    setToken(instance, streamReader.readString());
    setUser(instance, streamReader.readString());
    setUserQuotaEnabled(instance, streamReader.readBoolean());
    setUserQuotaLimit(instance, streamReader.readLong());
    setWebSkin(instance, streamReader.readString());
    setWebdavFix(instance, streamReader.readBoolean());
    setWizardCategories(instance, streamReader.readBoolean());
    setWizardKeywords(instance, streamReader.readBoolean());
    setWizardPropertyGroups(instance, streamReader.readBoolean());
    setWizardPropertyGroupsList(instance, (java.util.List) streamReader.readObject());
    setWizardWorkflows(instance, streamReader.readBoolean());
    setWizardWorkflowsList(instance, (java.util.List) streamReader.readObject());
    setWorkflowProcessIntanceVariablePath(instance, streamReader.readString());
    setWorkflowProcessIntanceVariableUUID(instance, streamReader.readString());
    setWorkflowRunConfigForm(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTWorkspace instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTWorkspace();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTWorkspace instance) throws SerializationException {
    streamWriter.writeBoolean(getAdminRole(instance));
    streamWriter.writeBoolean(getAdvancedFilters(instance));
    streamWriter.writeString(getAppVersion(instance));
    streamWriter.writeString(getApplicationURL(instance));
    streamWriter.writeObject(getAvailableOption(instance));
    streamWriter.writeBoolean(getChangePassword(instance));
    streamWriter.writeBoolean(getChatAutoLogin(instance));
    streamWriter.writeBoolean(getChatEnabled(instance));
    streamWriter.writeBoolean(getDashboardGeneralVisible(instance));
    streamWriter.writeBoolean(getDashboardKeywordsVisible(instance));
    streamWriter.writeBoolean(getDashboardMailVisible(instance));
    streamWriter.writeBoolean(getDashboardNewsVisible(instance));
    streamWriter.writeLong(getDashboardSchedule(instance));
    streamWriter.writeBoolean(getDashboardUserVisible(instance));
    streamWriter.writeBoolean(getDashboardWorkflowVisible(instance));
    streamWriter.writeString(getEmail(instance));
    streamWriter.writeString(getImapFolder(instance));
    streamWriter.writeString(getImapHost(instance));
    streamWriter.writeInt(getImapID(instance));
    streamWriter.writeString(getImapPassword(instance));
    streamWriter.writeString(getImapUser(instance));
    streamWriter.writeLong(getKeepAliveSchedule(instance));
    streamWriter.writeBoolean(getKeywordEnabled(instance));
    streamWriter.writeObject(getLangs(instance));
    streamWriter.writeBoolean(getMenuBookmarksVisible(instance));
    streamWriter.writeBoolean(getMenuEditVisible(instance));
    streamWriter.writeBoolean(getMenuFileVisible(instance));
    streamWriter.writeBoolean(getMenuHelpVisible(instance));
    streamWriter.writeBoolean(getMenuToolsVisible(instance));
    streamWriter.writeString(getPassword(instance));
    streamWriter.writeString(getPreviewer(instance));
    streamWriter.writeBoolean(getPrintPreview(instance));
    streamWriter.writeObject(getReports(instance));
    streamWriter.writeObject(getRoleList(instance));
    streamWriter.writeBoolean(getStackCategoriesVisible(instance));
    streamWriter.writeBoolean(getStackMailVisible(instance));
    streamWriter.writeBoolean(getStackPersonalVisible(instance));
    streamWriter.writeBoolean(getStackTaxonomy(instance));
    streamWriter.writeBoolean(getStackTemplatesVisible(instance));
    streamWriter.writeBoolean(getStackThesaurusVisible(instance));
    streamWriter.writeBoolean(getStackTrashVisible(instance));
    streamWriter.writeBoolean(getTabAdminVisible(instance));
    streamWriter.writeBoolean(getTabDashboardVisible(instance));
    streamWriter.writeBoolean(getTabDesktopVisible(instance));
    streamWriter.writeBoolean(getTabDocumentNotesVisible(instance));
    streamWriter.writeBoolean(getTabDocumentPreviewVisible(instance));
    streamWriter.writeBoolean(getTabDocumentPropertiesVisible(instance));
    streamWriter.writeBoolean(getTabDocumentPropertyGroupsVisible(instance));
    streamWriter.writeBoolean(getTabDocumentSecurityVisible(instance));
    streamWriter.writeBoolean(getTabDocumentVersionVisible(instance));
    streamWriter.writeBoolean(getTabFolderNotesVisible(instance));
    streamWriter.writeBoolean(getTabFolderPropertiesVisible(instance));
    streamWriter.writeBoolean(getTabFolderSecurityVisible(instance));
    streamWriter.writeBoolean(getTabMailPropertiesVisible(instance));
    streamWriter.writeBoolean(getTabMailSecurityVisible(instance));
    streamWriter.writeBoolean(getTabSearchVisible(instance));
    streamWriter.writeString(getToken(instance));
    streamWriter.writeString(getUser(instance));
    streamWriter.writeBoolean(getUserQuotaEnabled(instance));
    streamWriter.writeLong(getUserQuotaLimit(instance));
    streamWriter.writeString(getWebSkin(instance));
    streamWriter.writeBoolean(getWebdavFix(instance));
    streamWriter.writeBoolean(getWizardCategories(instance));
    streamWriter.writeBoolean(getWizardKeywords(instance));
    streamWriter.writeBoolean(getWizardPropertyGroups(instance));
    streamWriter.writeObject(getWizardPropertyGroupsList(instance));
    streamWriter.writeBoolean(getWizardWorkflows(instance));
    streamWriter.writeObject(getWizardWorkflowsList(instance));
    streamWriter.writeString(getWorkflowProcessIntanceVariablePath(instance));
    streamWriter.writeString(getWorkflowProcessIntanceVariableUUID(instance));
    streamWriter.writeString(getWorkflowRunConfigForm(instance));
    
  }
  
}
