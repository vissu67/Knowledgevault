package com.openkm.frontend.client.bean;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class GWTDashboardDocumentResult_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTDashboardDocumentResult_FieldSerializer.deserialize(reader, (com.openkm.frontend.client.bean.GWTDashboardDocumentResult)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.openkm.frontend.client.bean.GWTDashboardDocumentResult_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.openkm.frontend.client.bean.GWTDashboardDocumentResult_FieldSerializer.serialize(writer, (com.openkm.frontend.client.bean.GWTDashboardDocumentResult)object);
    }
  }
  private static native java.util.Date getDate(com.openkm.frontend.client.bean.GWTDashboardDocumentResult instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDashboardDocumentResult::date;
  }-*/;
  
  private static native void  setDate(com.openkm.frontend.client.bean.GWTDashboardDocumentResult instance, java.util.Date value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDashboardDocumentResult::date = value;
  }-*/;
  
  private static native com.openkm.frontend.client.bean.GWTDocument getDocument(com.openkm.frontend.client.bean.GWTDashboardDocumentResult instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDashboardDocumentResult::document;
  }-*/;
  
  private static native void  setDocument(com.openkm.frontend.client.bean.GWTDashboardDocumentResult instance, com.openkm.frontend.client.bean.GWTDocument value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDashboardDocumentResult::document = value;
  }-*/;
  
  private static native boolean getVisited(com.openkm.frontend.client.bean.GWTDashboardDocumentResult instance) /*-{
    return instance.@com.openkm.frontend.client.bean.GWTDashboardDocumentResult::visited;
  }-*/;
  
  private static native void  setVisited(com.openkm.frontend.client.bean.GWTDashboardDocumentResult instance, boolean value) /*-{
    instance.@com.openkm.frontend.client.bean.GWTDashboardDocumentResult::visited = value;
  }-*/;
  
  public static Class<?> concreteType() {
    return com.openkm.frontend.client.bean.GWTDashboardDocumentResult.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.openkm.frontend.client.bean.GWTDashboardDocumentResult instance) throws SerializationException {
    setDate(instance, (java.util.Date) streamReader.readObject());
    setDocument(instance, (com.openkm.frontend.client.bean.GWTDocument) streamReader.readObject());
    setVisited(instance, streamReader.readBoolean());
    
  }
  
  public static com.openkm.frontend.client.bean.GWTDashboardDocumentResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.openkm.frontend.client.bean.GWTDashboardDocumentResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.openkm.frontend.client.bean.GWTDashboardDocumentResult instance) throws SerializationException {
    streamWriter.writeObject(getDate(instance));
    streamWriter.writeObject(getDocument(instance));
    streamWriter.writeBoolean(getVisited(instance));
    
  }
  
}
