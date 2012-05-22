package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTFolder_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTFolder_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTFolder)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTFolder_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTFolder_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTFolder)object);
    }
  }
  private static native java.lang.String getAuthor(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::author;
  }-*/;
  
  private static native void  setAuthor(com.openkm.frontend.client.bean.GWTFolder instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::author = value;
  }-*/;
  
  private static native java.util.Date getCreated(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::created;
  }-*/;
  
  private static native void  setCreated(com.openkm.frontend.client.bean.GWTFolder instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::created = value;
  }-*/;
  
  private static native boolean getHasChilds(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::hasChilds;
  }-*/;
  
  private static native void  setHasChilds(com.openkm.frontend.client.bean.GWTFolder instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::hasChilds = value;
  }-*/;
  
  private static native boolean getHasNotes(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::hasNotes;
  }-*/;
  
  private static native void  setHasNotes(com.openkm.frontend.client.bean.GWTFolder instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::hasNotes = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::name;
  }-*/;
  
  private static native void  setName(com.openkm.frontend.client.bean.GWTFolder instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::name = value;
  }-*/;
  
  private static native java.util.List getNotes(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::notes;
  }-*/;
  
  private static native void  setNotes(com.openkm.frontend.client.bean.GWTFolder instance, java.util.List value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::notes = value;
  }-*/;
  
  private static native java.lang.String getParentPath(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::parentPath;
  }-*/;
  
  private static native void  setParentPath(com.openkm.frontend.client.bean.GWTFolder instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::parentPath = value;
  }-*/;
  
  private static native java.lang.String getPath(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::path;
  }-*/;
  
  private static native void  setPath(com.openkm.frontend.client.bean.GWTFolder instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::path = value;
  }-*/;
  
  private static native byte getPermissions(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::permissions;
  }-*/;
  
  private static native void  setPermissions(com.openkm.frontend.client.bean.GWTFolder instance, byte value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::permissions = value;
  }-*/;
  
  private static native boolean getSubscribed(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::subscribed;
  }-*/;
  
  private static native void  setSubscribed(com.openkm.frontend.client.bean.GWTFolder instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::subscribed = value;
  }-*/;
  
  private static native java.util.Set getSubscriptors(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::subscriptors;
  }-*/;
  
  private static native void  setSubscriptors(com.openkm.frontend.client.bean.GWTFolder instance, java.util.Set value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::subscriptors = value;
  }-*/;
  
  private static native java.lang.String getUuid(com.openkm.frontend.client.bean.GWTFolder instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTFolder::uuid;
  }-*/;
  
  private static native void  setUuid(com.openkm.frontend.client.bean.GWTFolder instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTFolder::uuid = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTFolder.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTFolder instance) throws SerializationException {
    setAuthor(instance, streamReader.readString());
    setCreated(instance, (java.util.Date) streamReader.readObject());
    setHasChilds(instance, streamReader.readBoolean());
    setHasNotes(instance, streamReader.readBoolean());
    setName(instance, streamReader.readString());
    setNotes(instance, (java.util.List) streamReader.readObject());
    setParentPath(instance, streamReader.readString());
    setPath(instance, streamReader.readString());
    setPermissions(instance, streamReader.readByte());
    setSubscribed(instance, streamReader.readBoolean());
    setSubscriptors(instance, (java.util.Set) streamReader.readObject());
    setUuid(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTFolder instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTFolder();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTFolder instance) throws SerializationException {
    streamWriter.writeString(getAuthor(instance));
    streamWriter.writeObject(getCreated(instance));
    streamWriter.writeBoolean(getHasChilds(instance));
    streamWriter.writeBoolean(getHasNotes(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeObject(getNotes(instance));
    streamWriter.writeString(getParentPath(instance));
    streamWriter.writeString(getPath(instance));
    streamWriter.writeByte(getPermissions(instance));
    streamWriter.writeBoolean(getSubscribed(instance));
    streamWriter.writeObject(getSubscriptors(instance));
    streamWriter.writeString(getUuid(instance));
    
  }
  
}
