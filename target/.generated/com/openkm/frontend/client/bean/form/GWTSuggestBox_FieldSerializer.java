package com.openkm.frontend.client.bean.form;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTSuggestBox_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTSuggestBox_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.form.GWTSuggestBox)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.form.GWTSuggestBox_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.form.GWTSuggestBox_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.form.GWTSuggestBox)object);
    }
  }
  private static native java.lang.String getData(com.openkm.frontend.client.bean.form.GWTSuggestBox instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::data;
  }-*/;
  
  private static native void  setData(com.openkm.frontend.client.bean.form.GWTSuggestBox instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::data = value;
  }-*/;
  
  private static native java.lang.String getDialogTitle(com.openkm.frontend.client.bean.form.GWTSuggestBox instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::dialogTitle;
  }-*/;
  
  private static native void  setDialogTitle(com.openkm.frontend.client.bean.form.GWTSuggestBox instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::dialogTitle = value;
  }-*/;
  
  private static native int getFilterMinLen(com.openkm.frontend.client.bean.form.GWTSuggestBox instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::filterMinLen;
  }-*/;
  
  private static native void  setFilterMinLen(com.openkm.frontend.client.bean.form.GWTSuggestBox instance, int value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::filterMinLen = value;
  }-*/;
  
  private static native java.lang.String getFilterQuery(com.openkm.frontend.client.bean.form.GWTSuggestBox instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::filterQuery;
  }-*/;
  
  private static native void  setFilterQuery(com.openkm.frontend.client.bean.form.GWTSuggestBox instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::filterQuery = value;
  }-*/;
  
  private static native boolean getReadonly(com.openkm.frontend.client.bean.form.GWTSuggestBox instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::readonly;
  }-*/;
  
  private static native void  setReadonly(com.openkm.frontend.client.bean.form.GWTSuggestBox instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::readonly = value;
  }-*/;
  
  private static native java.lang.String getTable(com.openkm.frontend.client.bean.form.GWTSuggestBox instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::table;
  }-*/;
  
  private static native void  setTable(com.openkm.frontend.client.bean.form.GWTSuggestBox instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::table = value;
  }-*/;
  
  private static native java.util.List getValidators(com.openkm.frontend.client.bean.form.GWTSuggestBox instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::validators;
  }-*/;
  
  private static native void  setValidators(com.openkm.frontend.client.bean.form.GWTSuggestBox instance, java.util.List value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::validators = value;
  }-*/;
  
  private static native java.lang.String getValue(com.openkm.frontend.client.bean.form.GWTSuggestBox instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::value;
  }-*/;
  
  private static native void  setValue(com.openkm.frontend.client.bean.form.GWTSuggestBox instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::value = value;
  }-*/;
  
  private static native java.lang.String getValueQuery(com.openkm.frontend.client.bean.form.GWTSuggestBox instance) /*-{
    return instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::valueQuery;
  }-*/;
  
  private static native void  setValueQuery(com.openkm.frontend.client.bean.form.GWTSuggestBox instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.form.GWTSuggestBox::valueQuery = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.form.GWTSuggestBox.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.form.GWTSuggestBox instance) throws SerializationException {
    setData(instance, streamReader.readString());
    setDialogTitle(instance, streamReader.readString());
    setFilterMinLen(instance, streamReader.readInt());
    setFilterQuery(instance, streamReader.readString());
    setReadonly(instance, streamReader.readBoolean());
    setTable(instance, streamReader.readString());
    setValidators(instance, (java.util.List) streamReader.readObject());
    setValue(instance, streamReader.readString());
    setValueQuery(instance, streamReader.readString());
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.openkm.frontend.client.bean.form.GWTSuggestBox instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.form.GWTSuggestBox();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.form.GWTSuggestBox instance) throws SerializationException {
    streamWriter.writeString(getData(instance));
    streamWriter.writeString(getDialogTitle(instance));
    streamWriter.writeInt(getFilterMinLen(instance));
    streamWriter.writeString(getFilterQuery(instance));
    streamWriter.writeBoolean(getReadonly(instance));
    streamWriter.writeString(getTable(instance));
    streamWriter.writeObject(getValidators(instance));
    streamWriter.writeString(getValue(instance));
    streamWriter.writeString(getValueQuery(instance));
    
    com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
