package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTUpload_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTUpload_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTUpload)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.form.GWTUpload_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTUpload_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTUpload)object);
    }
  }
  private static native java.lang.String getData(com.openkm.frontend.client.bean.form.GWTUpload instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTUpload::data;
  }-*/;
  
  private static native void  setData(com.openkm.frontend.client.bean.form.GWTUpload instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTUpload::data = value;
  }-*/;
  
  private static native java.lang.String getDocumentName(com.openkm.frontend.client.bean.form.GWTUpload instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTUpload::documentName;
  }-*/;
  
  private static native void  setDocumentName(com.openkm.frontend.client.bean.form.GWTUpload instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTUpload::documentName = value;
  }-*/;
  
  private static native java.lang.String getDocumentUuid(com.openkm.frontend.client.bean.form.GWTUpload instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTUpload::documentUuid;
  }-*/;
  
  private static native void  setDocumentUuid(com.openkm.frontend.client.bean.form.GWTUpload instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTUpload::documentUuid = value;
  }-*/;
  
  private static native java.lang.String getFolderPath(com.openkm.frontend.client.bean.form.GWTUpload instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTUpload::folderPath;
  }-*/;
  
  private static native void  setFolderPath(com.openkm.frontend.client.bean.form.GWTUpload instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTUpload::folderPath = value;
  }-*/;
  
  private static native java.lang.String getFolderUuid(com.openkm.frontend.client.bean.form.GWTUpload instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTUpload::folderUuid;
  }-*/;
  
  private static native void  setFolderUuid(com.openkm.frontend.client.bean.form.GWTUpload instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTUpload::folderUuid = value;
  }-*/;
  
  private static native java.lang.String getType(com.openkm.frontend.client.bean.form.GWTUpload instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTUpload::type;
  }-*/;
  
  private static native void  setType(com.openkm.frontend.client.bean.form.GWTUpload instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTUpload::type = value;
  }-*/;
  
  private static native java.util.List getValidators(com.openkm.frontend.client.bean.form.GWTUpload instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTUpload::validators;
  }-*/;
  
  private static native void  setValidators(com.openkm.frontend.client.bean.form.GWTUpload instance, java.util.List value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTUpload::validators = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.form.GWTUpload.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTUpload instance) throws SerializationException {
    setData(instance, streamReader.readString());
    setDocumentName(instance, streamReader.readString());
    setDocumentUuid(instance, streamReader.readString());
    setFolderPath(instance, streamReader.readString());
    setFolderUuid(instance, streamReader.readString());
    setType(instance, streamReader.readString());
    setValidators(instance, (java.util.List) streamReader.readObject());
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.frontend.client.bean.form.GWTUpload instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTUpload();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTUpload instance) throws SerializationException {
    streamWriter.writeString(getData(instance));
    streamWriter.writeString(getDocumentName(instance));
    streamWriter.writeString(getDocumentUuid(instance));
    streamWriter.writeString(getFolderPath(instance));
    streamWriter.writeString(getFolderUuid(instance));
    streamWriter.writeString(getType(instance));
    streamWriter.writeObject(getValidators(instance));
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
