package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTMail_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTMail_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTMail)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTMail_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTMail_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTMail)object);
    }
  }
  private static native java.util.Collection getAttachments(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::attachments;
  }-*/;
  
  private static native void  setAttachments(com.openkm.frontend.client.bean.GWTMail instance, java.util.Collection value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::attachments = value;
  }-*/;
  
  private static native java.lang.String[] getBcc(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::bcc;
  }-*/;
  
  private static native void  setBcc(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String[] value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::bcc = value;
  }-*/;
  
  private static native java.lang.String[] getCc(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::cc;
  }-*/;
  
  private static native void  setCc(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String[] value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::cc = value;
  }-*/;
  
  private static native java.lang.String getContent(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::content;
  }-*/;
  
  private static native void  setContent(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::content = value;
  }-*/;
  
  private static native java.lang.String getFrom(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::from;
  }-*/;
  
  private static native void  setFrom(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::from = value;
  }-*/;
  
  private static native java.lang.String getMimeType(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::mimeType;
  }-*/;
  
  private static native void  setMimeType(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::mimeType = value;
  }-*/;
  
  private static native java.lang.String getParent(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::parent;
  }-*/;
  
  private static native void  setParent(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::parent = value;
  }-*/;
  
  private static native java.lang.String getPath(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::path;
  }-*/;
  
  private static native void  setPath(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::path = value;
  }-*/;
  
  private static native byte getPermissions(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::permissions;
  }-*/;
  
  private static native void  setPermissions(com.openkm.frontend.client.bean.GWTMail instance, byte value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::permissions = value;
  }-*/;
  
  private static native java.util.Date getReceivedDate(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::receivedDate;
  }-*/;
  
  private static native void  setReceivedDate(com.openkm.frontend.client.bean.GWTMail instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::receivedDate = value;
  }-*/;
  
  private static native java.lang.String[] getReply(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::reply;
  }-*/;
  
  private static native void  setReply(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String[] value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::reply = value;
  }-*/;
  
  private static native java.util.Date getSentDate(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::sentDate;
  }-*/;
  
  private static native void  setSentDate(com.openkm.frontend.client.bean.GWTMail instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::sentDate = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getSize(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::size;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void  setSize(com.openkm.frontend.client.bean.GWTMail instance, long value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::size = value;
  }-*/;
  
  private static native java.lang.String getSubject(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::subject;
  }-*/;
  
  private static native void  setSubject(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::subject = value;
  }-*/;
  
  private static native java.lang.String[] getTo(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::to;
  }-*/;
  
  private static native void  setTo(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String[] value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::to = value;
  }-*/;
  
  private static native java.lang.String getUuid(com.openkm.frontend.client.bean.GWTMail instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTMail::uuid;
  }-*/;
  
  private static native void  setUuid(com.openkm.frontend.client.bean.GWTMail instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTMail::uuid = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTMail.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTMail instance) throws SerializationException {
    setAttachments(instance, (java.util.Collection) streamReader.readObject());
    setBcc(instance, (java.lang.String[]) streamReader.readObject());
    setCc(instance, (java.lang.String[]) streamReader.readObject());
    setContent(instance, streamReader.readString());
    setFrom(instance, streamReader.readString());
    setMimeType(instance, streamReader.readString());
    setParent(instance, streamReader.readString());
    setPath(instance, streamReader.readString());
    setPermissions(instance, streamReader.readByte());
    setReceivedDate(instance, (java.util.Date) streamReader.readObject());
    setReply(instance, (java.lang.String[]) streamReader.readObject());
    setSentDate(instance, (java.util.Date) streamReader.readObject());
    setSize(instance, streamReader.readLong());
    setSubject(instance, streamReader.readString());
    setTo(instance, (java.lang.String[]) streamReader.readObject());
    setUuid(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTMail instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTMail();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTMail instance) throws SerializationException {
    streamWriter.writeObject(getAttachments(instance));
    streamWriter.writeObject(getBcc(instance));
    streamWriter.writeObject(getCc(instance));
    streamWriter.writeString(getContent(instance));
    streamWriter.writeString(getFrom(instance));
    streamWriter.writeString(getMimeType(instance));
    streamWriter.writeString(getParent(instance));
    streamWriter.writeString(getPath(instance));
    streamWriter.writeByte(getPermissions(instance));
    streamWriter.writeObject(getReceivedDate(instance));
    streamWriter.writeObject(getReply(instance));
    streamWriter.writeObject(getSentDate(instance));
    streamWriter.writeLong(getSize(instance));
    streamWriter.writeString(getSubject(instance));
    streamWriter.writeObject(getTo(instance));
    streamWriter.writeString(getUuid(instance));
    
  }
  
}
