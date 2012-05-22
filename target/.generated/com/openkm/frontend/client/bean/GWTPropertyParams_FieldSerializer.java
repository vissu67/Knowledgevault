package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTPropertyParams_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTPropertyParams_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTPropertyParams)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTPropertyParams_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTPropertyParams_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTPropertyParams)object);
    }
  }
  private static native com.openkm.frontend.client.bean.form.GWTFormElement getFormElement(com.openkm.frontend.client.bean.GWTPropertyParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPropertyParams::formElement;
  }-*/;
  
  private static native void  setFormElement(com.openkm.frontend.client.bean.GWTPropertyParams instance, com.openkm.frontend.client.bean.form.GWTFormElement value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTPropertyParams::formElement = value;
  }-*/;
  
  private static native java.lang.String getGrpLabel(com.openkm.frontend.client.bean.GWTPropertyParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPropertyParams::grpLabel;
  }-*/;
  
  private static native void  setGrpLabel(com.openkm.frontend.client.bean.GWTPropertyParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTPropertyParams::grpLabel = value;
  }-*/;
  
  private static native java.lang.String getGrpName(com.openkm.frontend.client.bean.GWTPropertyParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPropertyParams::grpName;
  }-*/;
  
  private static native void  setGrpName(com.openkm.frontend.client.bean.GWTPropertyParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTPropertyParams::grpName = value;
  }-*/;
  
  private static native java.lang.String getValue(com.openkm.frontend.client.bean.GWTPropertyParams instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTPropertyParams::value;
  }-*/;
  
  private static native void  setValue(com.openkm.frontend.client.bean.GWTPropertyParams instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTPropertyParams::value = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTPropertyParams.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTPropertyParams instance) throws SerializationException {
    setFormElement(instance, (com.openkm.frontend.client.bean.form.GWTFormElement) streamReader.readObject());
    setGrpLabel(instance, streamReader.readString());
    setGrpName(instance, streamReader.readString());
    setValue(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTPropertyParams instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTPropertyParams();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTPropertyParams instance) throws SerializationException {
    streamWriter.writeObject(getFormElement(instance));
    streamWriter.writeString(getGrpLabel(instance));
    streamWriter.writeString(getGrpName(instance));
    streamWriter.writeString(getValue(instance));
    
  }
  
}
