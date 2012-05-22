package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTTestImap_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTTestImap_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTTestImap)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTTestImap_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTTestImap_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTTestImap)object);
    }
  }
  private static native boolean getError(com.openkm.frontend.client.bean.GWTTestImap instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTestImap::error;
  }-*/;
  
  private static native void  setError(com.openkm.frontend.client.bean.GWTTestImap instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTestImap::error = value;
  }-*/;
  
  private static native java.lang.String getErrorMsg(com.openkm.frontend.client.bean.GWTTestImap instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTTestImap::errorMsg;
  }-*/;
  
  private static native void  setErrorMsg(com.openkm.frontend.client.bean.GWTTestImap instance, java.lang.String value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTTestImap::errorMsg = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTTestImap.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTTestImap instance) throws SerializationException {
    setError(instance, streamReader.readBoolean());
    setErrorMsg(instance, streamReader.readString());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTTestImap instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTTestImap();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTTestImap instance) throws SerializationException {
    streamWriter.writeBoolean(getError(instance));
    streamWriter.writeString(getErrorMsg(instance));
    
  }
  
}
