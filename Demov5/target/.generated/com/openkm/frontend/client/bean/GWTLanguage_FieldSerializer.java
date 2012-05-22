package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTLanguage_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTLanguage_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTLanguage)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTLanguage_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTLanguage_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTLanguage)object);
    }
  }
  private static native java.lang.String getId(com.openkm.frontend.client.bean.GWTLanguage instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTLanguage::id;
  }-*/;
  
  private static native void  setId(com.openkm.frontend.client.bean.GWTLanguage instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTLanguage::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTLanguage instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTLanguage::name;
  }-*/;
  
  private static native void  setName(com.openkm.frontend.client.bean.GWTLanguage instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTLanguage::name = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTLanguage.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTLanguage instance) throws SerializationException {
    setId(instance, streamReader.readString());
    setName(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTLanguage instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTLanguage();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTLanguage instance) throws SerializationException {
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getName(instance));
    
  }
  
}
