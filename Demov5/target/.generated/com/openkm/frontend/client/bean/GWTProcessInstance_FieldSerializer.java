package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTProcessInstance_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTProcessInstance_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTProcessInstance)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTProcessInstance_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTProcessInstance_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTProcessInstance)object);
    }
  }
  private static native boolean getEnded(com.openkm.frontend.client.bean.GWTProcessInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstance::ended;
  }-*/;
  
  private static native void  setEnded(com.openkm.frontend.client.bean.GWTProcessInstance instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstance::ended = value;
  }-*/;
  
  private static native double getId(com.openkm.frontend.client.bean.GWTProcessInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstance::id;
  }-*/;
  
  private static native void  setId(com.openkm.frontend.client.bean.GWTProcessInstance instance, double value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstance::id = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTProcessDefinition getProcessDefinition(com.openkm.frontend.client.bean.GWTProcessInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstance::processDefinition;
  }-*/;
  
  private static native void  setProcessDefinition(com.openkm.frontend.client.bean.GWTProcessInstance instance, com.openkm.frontend.client.bean.GWTProcessDefinition value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstance::processDefinition = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTToken getRootToken(com.openkm.frontend.client.bean.GWTProcessInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstance::rootToken;
  }-*/;
  
  private static native void  setRootToken(com.openkm.frontend.client.bean.GWTProcessInstance instance, com.openkm.frontend.client.bean.GWTToken value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstance::rootToken = value;
  }-*/;
  
  private static native java.util.Date getStart(com.openkm.frontend.client.bean.GWTProcessInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstance::start;
  }-*/;
  
  private static native void  setStart(com.openkm.frontend.client.bean.GWTProcessInstance instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstance::start = value;
  }-*/;
  
  private static native boolean getSuspended(com.openkm.frontend.client.bean.GWTProcessInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstance::suspended;
  }-*/;
  
  private static native void  setSuspended(com.openkm.frontend.client.bean.GWTProcessInstance instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstance::suspended = value;
  }-*/;
  
  private static native java.util.Map getVariables(com.openkm.frontend.client.bean.GWTProcessInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstance::variables;
  }-*/;
  
  private static native void  setVariables(com.openkm.frontend.client.bean.GWTProcessInstance instance, java.util.Map value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstance::variables = value;
  }-*/;
  
  private static native int getVersion(com.openkm.frontend.client.bean.GWTProcessInstance instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTProcessInstance::version;
  }-*/;
  
  private static native void  setVersion(com.openkm.frontend.client.bean.GWTProcessInstance instance, int value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTProcessInstance::version = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTProcessInstance.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTProcessInstance instance) throws SerializationException {
    setEnded(instance, streamReader.readBoolean());
    setId(instance, streamReader.readDouble());
    instance.key = streamReader.readString();
    setProcessDefinition(instance, (com.openkm.frontend.client.bean.GWTProcessDefinition) streamReader.readObject());
    setRootToken(instance, (com.openkm.frontend.client.bean.GWTToken) streamReader.readObject());
    setStart(instance, (java.util.Date) streamReader.readObject());
    setSuspended(instance, streamReader.readBoolean());
    setVariables(instance, (java.util.Map) streamReader.readObject());
    setVersion(instance, streamReader.readInt());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTProcessInstance instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTProcessInstance();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTProcessInstance instance) throws SerializationException {
    streamWriter.writeBoolean(getEnded(instance));
    streamWriter.writeDouble(getId(instance));
    streamWriter.writeString(instance.key);
    streamWriter.writeObject(getProcessDefinition(instance));
    streamWriter.writeObject(getRootToken(instance));
    streamWriter.writeObject(getStart(instance));
    streamWriter.writeBoolean(getSuspended(instance));
    streamWriter.writeObject(getVariables(instance));
    streamWriter.writeInt(getVersion(instance));
    
  }
  
}
