package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTInput_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTInput_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTInput)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.form.GWTInput_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTInput_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTInput)object);
    }
  }
  private static native java.lang.String getData(com.openkm.frontend.client.bean.form.GWTInput instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTInput::data;
  }-*/;
  
  private static native void  setData(com.openkm.frontend.client.bean.form.GWTInput instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTInput::data = value;
  }-*/;
  
  private static native java.util.Date getDate(com.openkm.frontend.client.bean.form.GWTInput instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTInput::date;
  }-*/;
  
  private static native void  setDate(com.openkm.frontend.client.bean.form.GWTInput instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTInput::date = value;
  }-*/;
  
  private static native java.util.Date getDateTo(com.openkm.frontend.client.bean.form.GWTInput instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTInput::dateTo;
  }-*/;
  
  private static native void  setDateTo(com.openkm.frontend.client.bean.form.GWTInput instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTInput::dateTo = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTFolder getFolder(com.openkm.frontend.client.bean.form.GWTInput instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTInput::folder;
  }-*/;
  
  private static native void  setFolder(com.openkm.frontend.client.bean.form.GWTInput instance, com.openkm.frontend.client.bean.GWTFolder value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTInput::folder = value;
  }-*/;
  
  private static native boolean getReadonly(com.openkm.frontend.client.bean.form.GWTInput instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTInput::readonly;
  }-*/;
  
  private static native void  setReadonly(com.openkm.frontend.client.bean.form.GWTInput instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTInput::readonly = value;
  }-*/;
  
  private static native java.lang.String getType(com.openkm.frontend.client.bean.form.GWTInput instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTInput::type;
  }-*/;
  
  private static native void  setType(com.openkm.frontend.client.bean.form.GWTInput instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTInput::type = value;
  }-*/;
  
  private static native java.util.List getValidators(com.openkm.frontend.client.bean.form.GWTInput instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTInput::validators;
  }-*/;
  
  private static native void  setValidators(com.openkm.frontend.client.bean.form.GWTInput instance, java.util.List value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTInput::validators = value;
  }-*/;
  
  private static native java.lang.String getValue(com.openkm.frontend.client.bean.form.GWTInput instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTInput::value;
  }-*/;
  
  private static native void  setValue(com.openkm.frontend.client.bean.form.GWTInput instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTInput::value = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.form.GWTInput.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTInput instance) throws SerializationException {
    setData(instance, streamReader.readString());
    setDate(instance, (java.util.Date) streamReader.readObject());
    setDateTo(instance, (java.util.Date) streamReader.readObject());
    setFolder(instance, (com.openkm.frontend.client.bean.GWTFolder) streamReader.readObject());
    setReadonly(instance, streamReader.readBoolean());
    setType(instance, streamReader.readString());
    setValidators(instance, (java.util.List) streamReader.readObject());
    setValue(instance, streamReader.readString());
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.frontend.client.bean.form.GWTInput instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTInput();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTInput instance) throws SerializationException {
    streamWriter.writeString(getData(instance));
    streamWriter.writeObject(getDate(instance));
    streamWriter.writeObject(getDateTo(instance));
    streamWriter.writeObject(getFolder(instance));
    streamWriter.writeBoolean(getReadonly(instance));
    streamWriter.writeString(getType(instance));
    streamWriter.writeObject(getValidators(instance));
    streamWriter.writeString(getValue(instance));
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
