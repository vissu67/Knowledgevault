package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTQueryResult_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTQueryResult_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTQueryResult)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTQueryResult_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTQueryResult_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTQueryResult)object);
    }
  }
  private static native com.openkm.frontend.client.bean.GWTDocument getAttachment(com.openkm.frontend.client.bean.GWTQueryResult instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryResult::attachment;
  }-*/;
  
  private static native void  setAttachment(com.openkm.frontend.client.bean.GWTQueryResult instance, com.openkm.frontend.client.bean.GWTDocument value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryResult::attachment = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTDocument getDocument(com.openkm.frontend.client.bean.GWTQueryResult instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryResult::document;
  }-*/;
  
  private static native void  setDocument(com.openkm.frontend.client.bean.GWTQueryResult instance, com.openkm.frontend.client.bean.GWTDocument value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryResult::document = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTFolder getFolder(com.openkm.frontend.client.bean.GWTQueryResult instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryResult::folder;
  }-*/;
  
  private static native void  setFolder(com.openkm.frontend.client.bean.GWTQueryResult instance, com.openkm.frontend.client.bean.GWTFolder value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryResult::folder = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTMail getMail(com.openkm.frontend.client.bean.GWTQueryResult instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryResult::mail;
  }-*/;
  
  private static native void  setMail(com.openkm.frontend.client.bean.GWTQueryResult instance, com.openkm.frontend.client.bean.GWTMail value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryResult::mail = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getScore(com.openkm.frontend.client.bean.GWTQueryResult instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTQueryResult::score;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void  setScore(com.openkm.frontend.client.bean.GWTQueryResult instance, long value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTQueryResult::score = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTQueryResult.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTQueryResult instance) throws SerializationException {
    setAttachment(instance, (com.openkm.frontend.client.bean.GWTDocument) streamReader.readObject());
    setDocument(instance, (com.openkm.frontend.client.bean.GWTDocument) streamReader.readObject());
    setFolder(instance, (com.openkm.frontend.client.bean.GWTFolder) streamReader.readObject());
    setMail(instance, (com.openkm.frontend.client.bean.GWTMail) streamReader.readObject());
    setScore(instance, streamReader.readLong());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTQueryResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTQueryResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTQueryResult instance) throws SerializationException {
    streamWriter.writeObject(getAttachment(instance));
    streamWriter.writeObject(getDocument(instance));
    streamWriter.writeObject(getFolder(instance));
    streamWriter.writeObject(getMail(instance));
    streamWriter.writeLong(getScore(instance));
    
  }
  
}
