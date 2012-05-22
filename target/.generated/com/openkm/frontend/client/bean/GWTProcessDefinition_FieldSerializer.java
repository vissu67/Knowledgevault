package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTProcessDefinition_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTProcessDefinition_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTProcessDefinition)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTProcessDefinition_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTProcessDefinition_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTProcessDefinition)object);
    }
  }
  private static native java.lang.String getDescription(com.openkm.frontend.client.bean.GWTProcessDefinition instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessDefinition::description;
  }-*/;
  
  private static native void  setDescription(com.openkm.frontend.client.bean.GWTProcessDefinition instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessDefinition::description = value;
  }-*/;
  
  private static native double getId(com.openkm.frontend.client.bean.GWTProcessDefinition instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessDefinition::id;
  }-*/;
  
  private static native void  setId(com.openkm.frontend.client.bean.GWTProcessDefinition instance, double value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessDefinition::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.openkm.frontend.client.bean.GWTProcessDefinition instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessDefinition::name;
  }-*/;
  
  private static native void  setName(com.openkm.frontend.client.bean.GWTProcessDefinition instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessDefinition::name = value;
  }-*/;
  
  private static native int getVersion(com.openkm.frontend.client.bean.GWTProcessDefinition instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessDefinition::version;
  }-*/;
  
  private static native void  setVersion(com.openkm.frontend.client.bean.GWTProcessDefinition instance, int value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessDefinition::version = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTProcessDefinition.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTProcessDefinition instance) throws SerializationException {
    setDescription(instance, streamReader.readString());
    setId(instance, streamReader.readDouble());
    setName(instance, streamReader.readString());
    setVersion(instance, streamReader.readInt());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTProcessDefinition instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTProcessDefinition();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTProcessDefinition instance) throws SerializationException {
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeDouble(getId(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeInt(getVersion(instance));
    
  }
  
}
