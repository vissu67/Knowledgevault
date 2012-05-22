package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTTextArea_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTTextArea_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTTextArea)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.form.GWTTextArea_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTTextArea_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTTextArea)object);
    }
  }
  private static native java.lang.String getData(com.openkm.frontend.client.bean.form.GWTTextArea instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTTextArea::data;
  }-*/;
  
  private static native void  setData(com.openkm.frontend.client.bean.form.GWTTextArea instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTTextArea::data = value;
  }-*/;
  
  private static native boolean getReadonly(com.openkm.frontend.client.bean.form.GWTTextArea instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTTextArea::readonly;
  }-*/;
  
  private static native void  setReadonly(com.openkm.frontend.client.bean.form.GWTTextArea instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTTextArea::readonly = value;
  }-*/;
  
  private static native java.util.List getValidators(com.openkm.frontend.client.bean.form.GWTTextArea instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTTextArea::validators;
  }-*/;
  
  private static native void  setValidators(com.openkm.frontend.client.bean.form.GWTTextArea instance, java.util.List value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTTextArea::validators = value;
  }-*/;
  
  private static native java.lang.String getValue(com.openkm.frontend.client.bean.form.GWTTextArea instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTTextArea::value;
  }-*/;
  
  private static native void  setValue(com.openkm.frontend.client.bean.form.GWTTextArea instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTTextArea::value = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.form.GWTTextArea.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTTextArea instance) throws SerializationException {
    setData(instance, streamReader.readString());
    setReadonly(instance, streamReader.readBoolean());
    setValidators(instance, (java.util.List) streamReader.readObject());
    setValue(instance, streamReader.readString());
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.frontend.client.bean.form.GWTTextArea instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTTextArea();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTTextArea instance) throws SerializationException {
    streamWriter.writeString(getData(instance));
    streamWriter.writeBoolean(getReadonly(instance));
    streamWriter.writeObject(getValidators(instance));
    streamWriter.writeString(getValue(instance));
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
