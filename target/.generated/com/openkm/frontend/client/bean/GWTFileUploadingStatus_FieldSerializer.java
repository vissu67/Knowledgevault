package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTFileUploadingStatus_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTFileUploadingStatus_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTFileUploadingStatus)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTFileUploadingStatus_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTFileUploadingStatus_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTFileUploadingStatus)object);
    }
  }
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getBytesRead(com.openkm.frontend.client.bean.GWTFileUploadingStatus instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFileUploadingStatus::bytesRead;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void  setBytesRead(com.openkm.frontend.client.bean.GWTFileUploadingStatus instance, long value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFileUploadingStatus::bytesRead = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getContentLength(com.openkm.frontend.client.bean.GWTFileUploadingStatus instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFileUploadingStatus::contentLength;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void  setContentLength(com.openkm.frontend.client.bean.GWTFileUploadingStatus instance, long value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFileUploadingStatus::contentLength = value;
  }-*/;
  
  private static native boolean getUploadFinish(com.openkm.frontend.client.bean.GWTFileUploadingStatus instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFileUploadingStatus::uploadFinish;
  }-*/;
  
  private static native void  setUploadFinish(com.openkm.frontend.client.bean.GWTFileUploadingStatus instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFileUploadingStatus::uploadFinish = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTFileUploadingStatus.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTFileUploadingStatus instance) throws SerializationException {
    setBytesRead(instance, streamReader.readLong());
    setContentLength(instance, streamReader.readLong());
    instance.started = streamReader.readBoolean();
    setUploadFinish(instance, streamReader.readBoolean());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTFileUploadingStatus instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTFileUploadingStatus();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTFileUploadingStatus instance) throws SerializationException {
    streamWriter.writeLong(getBytesRead(instance));
    streamWriter.writeLong(getContentLength(instance));
    streamWriter.writeBoolean(instance.started);
    streamWriter.writeBoolean(getUploadFinish(instance));
    
  }
  
}
