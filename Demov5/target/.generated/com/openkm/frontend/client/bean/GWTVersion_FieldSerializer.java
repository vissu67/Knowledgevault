package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTVersion_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTVersion_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTVersion)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTVersion_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTVersion_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTVersion)object);
    }
  }
  private static native boolean getActual(com.openkm.frontend.client.bean.GWTVersion instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTVersion::actual;
  }-*/;
  
  private static native void  setActual(com.openkm.frontend.client.bean.GWTVersion instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTVersion::actual = value;
  }-*/;
  
  private static native java.lang.String getAuthor(com.openkm.frontend.client.bean.GWTVersion instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTVersion::author;
  }-*/;
  
  private static native void  setAuthor(com.openkm.frontend.client.bean.GWTVersion instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTVersion::author = value;
  }-*/;
  
  private static native java.lang.String getComment(com.openkm.frontend.client.bean.GWTVersion instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTVersion::comment;
  }-*/;
  
  private static native void  setComment(com.openkm.frontend.client.bean.GWTVersion instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTVersion::comment = value;
  }-*/;
  
  private static native java.util.Date getCreated(com.openkm.frontend.client.bean.GWTVersion instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTVersion::created;
  }-*/;
  
  private static native void  setCreated(com.openkm.frontend.client.bean.GWTVersion instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTVersion::created = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTVersion instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTVersion::name;
  }-*/;
  
  private static native void  setName(com.openkm.frontend.client.bean.GWTVersion instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTVersion::name = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getSize(com.openkm.frontend.client.bean.GWTVersion instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTVersion::size;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void  setSize(com.openkm.frontend.client.bean.GWTVersion instance, long value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTVersion::size = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTVersion.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTVersion instance) throws SerializationException {
    setActual(instance, streamReader.readBoolean());
    setAuthor(instance, streamReader.readString());
    setComment(instance, streamReader.readString());
    setCreated(instance, (java.util.Date) streamReader.readObject());
    setName(instance, streamReader.readString());
    setSize(instance, streamReader.readLong());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTVersion instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTVersion();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTVersion instance) throws SerializationException {
    streamWriter.writeBoolean(getActual(instance));
    streamWriter.writeString(getAuthor(instance));
    streamWriter.writeString(getComment(instance));
    streamWriter.writeObject(getCreated(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeLong(getSize(instance));
    
  }
  
}
