package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTKeyword_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTKeyword_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTKeyword)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTKeyword_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTKeyword_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTKeyword)object);
    }
  }
  private static native int getFrequency(com.openkm.frontend.client.bean.GWTKeyword instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTKeyword::frequency;
  }-*/;
  
  private static native void  setFrequency(com.openkm.frontend.client.bean.GWTKeyword instance, int value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTKeyword::frequency = value;
  }-*/;
  
  private static native java.lang.String getKeyword(com.openkm.frontend.client.bean.GWTKeyword instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTKeyword::keyword;
  }-*/;
  
  private static native void  setKeyword(com.openkm.frontend.client.bean.GWTKeyword instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTKeyword::keyword = value;
  }-*/;
  
  private static native boolean getTop10(com.openkm.frontend.client.bean.GWTKeyword instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTKeyword::top10;
  }-*/;
  
  private static native void  setTop10(com.openkm.frontend.client.bean.GWTKeyword instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTKeyword::top10 = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTKeyword.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTKeyword instance) throws SerializationException {
    setFrequency(instance, streamReader.readInt());
    setKeyword(instance, streamReader.readString());
    setTop10(instance, streamReader.readBoolean());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTKeyword instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTKeyword();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTKeyword instance) throws SerializationException {
    streamWriter.writeInt(getFrequency(instance));
    streamWriter.writeString(getKeyword(instance));
    streamWriter.writeBoolean(getTop10(instance));
    
  }
  
}
