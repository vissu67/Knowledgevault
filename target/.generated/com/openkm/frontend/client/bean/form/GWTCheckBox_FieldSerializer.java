package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTCheckBox_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTCheckBox_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTCheckBox)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.form.GWTCheckBox_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTCheckBox_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTCheckBox)object);
    }
  }
  private static native java.lang.String getData(com.openkm.frontend.client.bean.form.GWTCheckBox instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTCheckBox::data;
  }-*/;
  
  private static native void  setData(com.openkm.frontend.client.bean.form.GWTCheckBox instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTCheckBox::data = value;
  }-*/;
  
  private static native boolean getReadonly(com.openkm.frontend.client.bean.form.GWTCheckBox instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTCheckBox::readonly;
  }-*/;
  
  private static native void  setReadonly(com.openkm.frontend.client.bean.form.GWTCheckBox instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTCheckBox::readonly = value;
  }-*/;
  
  private static native java.util.List getValidators(com.openkm.frontend.client.bean.form.GWTCheckBox instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTCheckBox::validators;
  }-*/;
  
  private static native void  setValidators(com.openkm.frontend.client.bean.form.GWTCheckBox instance, java.util.List value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTCheckBox::validators = value;
  }-*/;
  
  private static native boolean getValue(com.openkm.frontend.client.bean.form.GWTCheckBox instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTCheckBox::value;
  }-*/;
  
  private static native void  setValue(com.openkm.frontend.client.bean.form.GWTCheckBox instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTCheckBox::value = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.form.GWTCheckBox.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTCheckBox instance) throws SerializationException {
    setData(instance, streamReader.readString());
    setReadonly(instance, streamReader.readBoolean());
    setValidators(instance, (java.util.List) streamReader.readObject());
    setValue(instance, streamReader.readBoolean());
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.frontend.client.bean.form.GWTCheckBox instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTCheckBox();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTCheckBox instance) throws SerializationException {
    streamWriter.writeString(getData(instance));
    streamWriter.writeBoolean(getReadonly(instance));
    streamWriter.writeObject(getValidators(instance));
    streamWriter.writeBoolean(getValue(instance));
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
