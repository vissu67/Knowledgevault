package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTDashboardMailResult_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTDashboardMailResult_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTDashboardMailResult)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTDashboardMailResult_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTDashboardMailResult_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTDashboardMailResult)object);
    }
  }
  private static native java.util.Date getDate(com.openkm.frontend.client.bean.GWTDashboardMailResult instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDashboardMailResult::date;
  }-*/;
  
  private static native void  setDate(com.openkm.frontend.client.bean.GWTDashboardMailResult instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDashboardMailResult::date = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTMail getMail(com.openkm.frontend.client.bean.GWTDashboardMailResult instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDashboardMailResult::mail;
  }-*/;
  
  private static native void  setMail(com.openkm.frontend.client.bean.GWTDashboardMailResult instance, com.openkm.frontend.client.bean.GWTMail value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDashboardMailResult::mail = value;
  }-*/;
  
  private static native boolean getVisited(com.openkm.frontend.client.bean.GWTDashboardMailResult instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDashboardMailResult::visited;
  }-*/;
  
  private static native void  setVisited(com.openkm.frontend.client.bean.GWTDashboardMailResult instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDashboardMailResult::visited = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTDashboardMailResult.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTDashboardMailResult instance) throws SerializationException {
    setDate(instance, (java.util.Date) streamReader.readObject());
    setMail(instance, (com.openkm.frontend.client.bean.GWTMail) streamReader.readObject());
    setVisited(instance, streamReader.readBoolean());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTDashboardMailResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTDashboardMailResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTDashboardMailResult instance) throws SerializationException {
    streamWriter.writeObject(getDate(instance));
    streamWriter.writeObject(getMail(instance));
    streamWriter.writeBoolean(getVisited(instance));
    
  }
  
}
