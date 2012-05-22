package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTAvailableOption_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTAvailableOption_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTAvailableOption)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTAvailableOption_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTAvailableOption_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTAvailableOption)object);
    }
  }
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTAvailableOption.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTAvailableOption instance) throws SerializationException {
    instance.aboutOption = streamReader.readBoolean();
    instance.addBookmarkOption = streamReader.readBoolean();
    instance.addDocumentOption = streamReader.readBoolean();
    instance.addPropertyGroupOption = streamReader.readBoolean();
    instance.addSubscription = streamReader.readBoolean();
    instance.administrationOption = streamReader.readBoolean();
    instance.bugReportOption = streamReader.readBoolean();
    instance.cancelCheckoutOption = streamReader.readBoolean();
    instance.checkinOption = streamReader.readBoolean();
    instance.checkoutOption = streamReader.readBoolean();
    instance.copyOption = streamReader.readBoolean();
    instance.createFolderOption = streamReader.readBoolean();
    instance.createFromTemplateOption = streamReader.readBoolean();
    instance.debugOption = streamReader.readBoolean();
    instance.deleteOption = streamReader.readBoolean();
    instance.documentationOption = streamReader.readBoolean();
    instance.downloadOption = streamReader.readBoolean();
    instance.downloadPdfOption = streamReader.readBoolean();
    instance.exportOption = streamReader.readBoolean();
    instance.findFolderOption = streamReader.readBoolean();
    instance.gotoFolderOption = streamReader.readBoolean();
    instance.helpOption = streamReader.readBoolean();
    instance.homeOption = streamReader.readBoolean();
    instance.imageViewerOption = streamReader.readBoolean();
    instance.languagesOption = streamReader.readBoolean();
    instance.lockOption = streamReader.readBoolean();
    instance.manageBookmarkOption = streamReader.readBoolean();
    instance.mediaPlayerOption = streamReader.readBoolean();
    instance.moveOption = streamReader.readBoolean();
    instance.preferencesOption = streamReader.readBoolean();
    instance.projectWebOption = streamReader.readBoolean();
    instance.publicForumOption = streamReader.readBoolean();
    instance.purgeOption = streamReader.readBoolean();
    instance.purgeTrashOption = streamReader.readBoolean();
    instance.refreshOption = streamReader.readBoolean();
    instance.removePropertyGroupOption = streamReader.readBoolean();
    instance.removeSubscription = streamReader.readBoolean();
    instance.renameOption = streamReader.readBoolean();
    instance.restoreOption = streamReader.readBoolean();
    instance.scannerOption = streamReader.readBoolean();
    instance.sendDocumentAttachmentOption = streamReader.readBoolean();
    instance.sendDocumentLinkOption = streamReader.readBoolean();
    instance.setHomeOption = streamReader.readBoolean();
    instance.skinOption = streamReader.readBoolean();
    instance.supportRequestOption = streamReader.readBoolean();
    instance.unLockOption = streamReader.readBoolean();
    instance.uploaderOption = streamReader.readBoolean();
    instance.versionChangesOption = streamReader.readBoolean();
    instance.workflowOption = streamReader.readBoolean();
    
  }
  
  public static com.openkm.frontend.client.bean.GWTAvailableOption instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTAvailableOption();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTAvailableOption instance) throws SerializationException {
    streamWriter.writeBoolean(instance.aboutOption);
    streamWriter.writeBoolean(instance.addBookmarkOption);
    streamWriter.writeBoolean(instance.addDocumentOption);
    streamWriter.writeBoolean(instance.addPropertyGroupOption);
    streamWriter.writeBoolean(instance.addSubscription);
    streamWriter.writeBoolean(instance.administrationOption);
    streamWriter.writeBoolean(instance.bugReportOption);
    streamWriter.writeBoolean(instance.cancelCheckoutOption);
    streamWriter.writeBoolean(instance.checkinOption);
    streamWriter.writeBoolean(instance.checkoutOption);
    streamWriter.writeBoolean(instance.copyOption);
    streamWriter.writeBoolean(instance.createFolderOption);
    streamWriter.writeBoolean(instance.createFromTemplateOption);
    streamWriter.writeBoolean(instance.debugOption);
    streamWriter.writeBoolean(instance.deleteOption);
    streamWriter.writeBoolean(instance.documentationOption);
    streamWriter.writeBoolean(instance.downloadOption);
    streamWriter.writeBoolean(instance.downloadPdfOption);
    streamWriter.writeBoolean(instance.exportOption);
    streamWriter.writeBoolean(instance.findFolderOption);
    streamWriter.writeBoolean(instance.gotoFolderOption);
    streamWriter.writeBoolean(instance.helpOption);
    streamWriter.writeBoolean(instance.homeOption);
    streamWriter.writeBoolean(instance.imageViewerOption);
    streamWriter.writeBoolean(instance.languagesOption);
    streamWriter.writeBoolean(instance.lockOption);
    streamWriter.writeBoolean(instance.manageBookmarkOption);
    streamWriter.writeBoolean(instance.mediaPlayerOption);
    streamWriter.writeBoolean(instance.moveOption);
    streamWriter.writeBoolean(instance.preferencesOption);
    streamWriter.writeBoolean(instance.projectWebOption);
    streamWriter.writeBoolean(instance.publicForumOption);
    streamWriter.writeBoolean(instance.purgeOption);
    streamWriter.writeBoolean(instance.purgeTrashOption);
    streamWriter.writeBoolean(instance.refreshOption);
    streamWriter.writeBoolean(instance.removePropertyGroupOption);
    streamWriter.writeBoolean(instance.removeSubscription);
    streamWriter.writeBoolean(instance.renameOption);
    streamWriter.writeBoolean(instance.restoreOption);
    streamWriter.writeBoolean(instance.scannerOption);
    streamWriter.writeBoolean(instance.sendDocumentAttachmentOption);
    streamWriter.writeBoolean(instance.sendDocumentLinkOption);
    streamWriter.writeBoolean(instance.setHomeOption);
    streamWriter.writeBoolean(instance.skinOption);
    streamWriter.writeBoolean(instance.supportRequestOption);
    streamWriter.writeBoolean(instance.unLockOption);
    streamWriter.writeBoolean(instance.uploaderOption);
    streamWriter.writeBoolean(instance.versionChangesOption);
    streamWriter.writeBoolean(instance.workflowOption);
    
  }
  
}
