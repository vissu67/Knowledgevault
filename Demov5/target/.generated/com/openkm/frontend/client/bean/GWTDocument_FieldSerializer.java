package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTDocument_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTDocument_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTDocument)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTDocument_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTDocument_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTDocument)object);
    }
  }
  private static native com.openkm.frontend.client.bean.GWTVersion getActualVersion(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::actualVersion;
  }-*/;
  
  private static native void  setActualVersion(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.GWTVersion value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::actualVersion = value;
  }-*/;
  
  private static native java.lang.String getAuthor(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::author;
  }-*/;
  
  private static native void  setAuthor(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::author = value;
  }-*/;
  
  private static native java.util.Set getCategories(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::categories;
  }-*/;
  
  private static native void  setCategories(com.openkm.frontend.client.bean.GWTDocument instance, java.util.Set value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::categories = value;
  }-*/;
  
  private static native boolean getCheckedOut(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::checkedOut;
  }-*/;
  
  private static native void  setCheckedOut(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::checkedOut = value;
  }-*/;
  
  private static native java.lang.String getCipherName(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::cipherName;
  }-*/;
  
  private static native void  setCipherName(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::cipherName = value;
  }-*/;
  
  private static native byte[] getContent(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::content;
  }-*/;
  
  private static native void  setContent(com.openkm.frontend.client.bean.GWTDocument instance, byte[] value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::content = value;
  }-*/;
  
  private static native boolean getConvertibleToDxf(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::convertibleToDxf;
  }-*/;
  
  private static native void  setConvertibleToDxf(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::convertibleToDxf = value;
  }-*/;
  
  private static native boolean getConvertibleToPdf(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::convertibleToPdf;
  }-*/;
  
  private static native void  setConvertibleToPdf(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::convertibleToPdf = value;
  }-*/;
  
  private static native boolean getConvertibleToSwf(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::convertibleToSwf;
  }-*/;
  
  private static native void  setConvertibleToSwf(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::convertibleToSwf = value;
  }-*/;
  
  private static native java.util.Date getCreated(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::created;
  }-*/;
  
  private static native void  setCreated(com.openkm.frontend.client.bean.GWTDocument instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::created = value;
  }-*/;
  
  private static native boolean getHasNotes(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::hasNotes;
  }-*/;
  
  private static native void  setHasNotes(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::hasNotes = value;
  }-*/;
  
  private static native boolean getIsAttachment(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::isAttachment;
  }-*/;
  
  private static native void  setIsAttachment(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::isAttachment = value;
  }-*/;
  
  private static native java.util.Set getKeywords(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::keywords;
  }-*/;
  
  private static native void  setKeywords(com.openkm.frontend.client.bean.GWTDocument instance, java.util.Set value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::keywords = value;
  }-*/;
  
  private static native java.util.Date getLastModified(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::lastModified;
  }-*/;
  
  private static native void  setLastModified(com.openkm.frontend.client.bean.GWTDocument instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::lastModified = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTLock getLockInfo(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::lockInfo;
  }-*/;
  
  private static native void  setLockInfo(com.openkm.frontend.client.bean.GWTDocument instance, com.openkm.frontend.client.bean.GWTLock value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::lockInfo = value;
  }-*/;
  
  private static native boolean getLocked(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::locked;
  }-*/;
  
  private static native void  setLocked(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::locked = value;
  }-*/;
  
  private static native java.lang.String getMimeType(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::mimeType;
  }-*/;
  
  private static native void  setMimeType(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::mimeType = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::name;
  }-*/;
  
  private static native void  setName(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::name = value;
  }-*/;
  
  private static native java.util.List getNotes(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::notes;
  }-*/;
  
  private static native void  setNotes(com.openkm.frontend.client.bean.GWTDocument instance, java.util.List value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::notes = value;
  }-*/;
  
  private static native java.lang.String getParent(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::parent;
  }-*/;
  
  private static native void  setParent(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::parent = value;
  }-*/;
  
  private static native java.lang.String getParentId(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::parentId;
  }-*/;
  
  private static native void  setParentId(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::parentId = value;
  }-*/;
  
  private static native java.lang.String getPath(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::path;
  }-*/;
  
  private static native void  setPath(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::path = value;
  }-*/;
  
  private static native byte getPermissions(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::permissions;
  }-*/;
  
  private static native void  setPermissions(com.openkm.frontend.client.bean.GWTDocument instance, byte value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::permissions = value;
  }-*/;
  
  private static native boolean getSubscribed(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::subscribed;
  }-*/;
  
  private static native void  setSubscribed(com.openkm.frontend.client.bean.GWTDocument instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::subscribed = value;
  }-*/;
  
  private static native java.util.Set getSubscriptors(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::subscriptors;
  }-*/;
  
  private static native void  setSubscriptors(com.openkm.frontend.client.bean.GWTDocument instance, java.util.Set value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::subscriptors = value;
  }-*/;
  
  private static native java.lang.String getUuid(com.openkm.frontend.client.bean.GWTDocument instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDocument::uuid;
  }-*/;
  
  private static native void  setUuid(com.openkm.frontend.client.bean.GWTDocument instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDocument::uuid = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTDocument.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTDocument instance) throws SerializationException {
    setActualVersion(instance, (com.openkm.frontend.client.bean.GWTVersion) streamReader.readObject());
    setAuthor(instance, streamReader.readString());
    setCategories(instance, (java.util.Set) streamReader.readObject());
    setCheckedOut(instance, streamReader.readBoolean());
    setCipherName(instance, streamReader.readString());
    setContent(instance, (byte[]) streamReader.readObject());
    setConvertibleToDxf(instance, streamReader.readBoolean());
    setConvertibleToPdf(instance, streamReader.readBoolean());
    setConvertibleToSwf(instance, streamReader.readBoolean());
    setCreated(instance, (java.util.Date) streamReader.readObject());
    setHasNotes(instance, streamReader.readBoolean());
    setIsAttachment(instance, streamReader.readBoolean());
    setKeywords(instance, (java.util.Set) streamReader.readObject());
    setLastModified(instance, (java.util.Date) streamReader.readObject());
    setLockInfo(instance, (com.openkm.frontend.client.bean.GWTLock) streamReader.readObject());
    setLocked(instance, streamReader.readBoolean());
    setMimeType(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    setNotes(instance, (java.util.List) streamReader.readObject());
    setParent(instance, streamReader.readString());
    setParentId(instance, streamReader.readString());
    setPath(instance, streamReader.readString());
    setPermissions(instance, streamReader.readByte());
    setSubscribed(instance, streamReader.readBoolean());
    setSubscriptors(instance, (java.util.Set) streamReader.readObject());
    setUuid(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTDocument instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTDocument();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTDocument instance) throws SerializationException {
    streamWriter.writeObject(getActualVersion(instance));
    streamWriter.writeString(getAuthor(instance));
    streamWriter.writeObject(getCategories(instance));
    streamWriter.writeBoolean(getCheckedOut(instance));
    streamWriter.writeString(getCipherName(instance));
    streamWriter.writeObject(getContent(instance));
    streamWriter.writeBoolean(getConvertibleToDxf(instance));
    streamWriter.writeBoolean(getConvertibleToPdf(instance));
    streamWriter.writeBoolean(getConvertibleToSwf(instance));
    streamWriter.writeObject(getCreated(instance));
    streamWriter.writeBoolean(getHasNotes(instance));
    streamWriter.writeBoolean(getIsAttachment(instance));
    streamWriter.writeObject(getKeywords(instance));
    streamWriter.writeObject(getLastModified(instance));
    streamWriter.writeObject(getLockInfo(instance));
    streamWriter.writeBoolean(getLocked(instance));
    streamWriter.writeString(getMimeType(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeObject(getNotes(instance));
    streamWriter.writeString(getParent(instance));
    streamWriter.writeString(getParentId(instance));
    streamWriter.writeString(getPath(instance));
    streamWriter.writeByte(getPermissions(instance));
    streamWriter.writeBoolean(getSubscribed(instance));
    streamWriter.writeObject(getSubscriptors(instance));
    streamWriter.writeString(getUuid(instance));
    
  }
  
}
