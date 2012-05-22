package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTTransition_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTTransition_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTTransition)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTTransition_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTTransition_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTTransition)object);
    }
  }
  private static native java.lang.String getFrom(com.openkm.frontend.client.bean.GWTTransition instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTransition::from;
  }-*/;
  
  private static native void  setFrom(com.openkm.frontend.client.bean.GWTTransition instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTransition::from = value;
  }-*/;
  
  private static native double getId(com.openkm.frontend.client.bean.GWTTransition instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTransition::id;
  }-*/;
  
  private static native void  setId(com.openkm.frontend.client.bean.GWTTransition instance, double value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTransition::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTTransition instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTransition::name;
  }-*/;
  
  private static native void  setName(com.openkm.frontend.client.bean.GWTTransition instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTransition::name = value;
  }-*/;
  
  private static native java.lang.String getTo(com.openkm.frontend.client.bean.GWTTransition instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTransition::to;
  }-*/;
  
  private static native void  setTo(com.openkm.frontend.client.bean.GWTTransition instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTransition::to = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTTransition.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTTransition instance) throws SerializationException {
    setFrom(instance, streamReader.readString());
    setId(instance, streamReader.readDouble());
    setName(instance, streamReader.readString());
    setTo(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTTransition instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTTransition();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTTransition instance) throws SerializationException {
    streamWriter.writeString(getFrom(instance));
    streamWriter.writeDouble(getId(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getTo(instance));
    
  }
  
}
