package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTBookmark_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTBookmark_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTBookmark)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTBookmark_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTBookmark_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTBookmark)object);
    }
  }
  private static native int getId(com.openkm.frontend.client.bean.GWTBookmark instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTBookmark::id;
  }-*/;
  
  private static native void  setId(com.openkm.frontend.client.bean.GWTBookmark instance, int value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTBookmark::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTBookmark instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTBookmark::name;
  }-*/;
  
  private static native void  setName(com.openkm.frontend.client.bean.GWTBookmark instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTBookmark::name = value;
  }-*/;
  
  private static native java.lang.String getPath(com.openkm.frontend.client.bean.GWTBookmark instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTBookmark::path;
  }-*/;
  
  private static native void  setPath(com.openkm.frontend.client.bean.GWTBookmark instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTBookmark::path = value;
  }-*/;
  
  private static native java.lang.String getType(com.openkm.frontend.client.bean.GWTBookmark instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTBookmark::type;
  }-*/;
  
  private static native void  setType(com.openkm.frontend.client.bean.GWTBookmark instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTBookmark::type = value;
  }-*/;
  
  private static native java.lang.String getUuid(com.openkm.frontend.client.bean.GWTBookmark instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTBookmark::uuid;
  }-*/;
  
  private static native void  setUuid(com.openkm.frontend.client.bean.GWTBookmark instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTBookmark::uuid = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTBookmark.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTBookmark instance) throws SerializationException {
    setId(instance, streamReader.readInt());
    setName(instance, streamReader.readString());
    setPath(instance, streamReader.readString());
    setType(instance, streamReader.readString());
    setUuid(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTBookmark instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTBookmark();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTBookmark instance) throws SerializationException {
    streamWriter.writeInt(getId(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getPath(instance));
    streamWriter.writeString(getType(instance));
    streamWriter.writeString(getUuid(instance));
    
  }
  
}
