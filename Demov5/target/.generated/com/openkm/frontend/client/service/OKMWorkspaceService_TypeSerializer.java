package com.openkm.frontend.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;

public class OKMWorkspaceService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, TypeHandler> methodMapJava;
  private static final MethodMap methodMapNative;
  private static final Map<Class<?>, String> signatureMapJava;
  private static final JsArrayString signatureMapNative;
  
  static {
    if (GWT.isScript()) {
      methodMapJava = null;
      methodMapNative = loadMethodsNative();
      signatureMapJava = null;
      signatureMapNative = loadSignaturesNative();
    } else {
      methodMapJava = loadMethodsJava();
      methodMapNative = null;
      signatureMapJava = loadSignaturesJava();
      signatureMapNative = null;
    }
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, TypeHandler> loadMethodsJava() {
    Map<String, TypeHandler> result = new HashMap<String, TypeHandler>();
    result.put("com.google.gwt.i18n.client.impl.DateRecord/112389920", new com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer.Handler());
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", new com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.OKMException/1351513842", new com.openkm.frontend.client.OKMException_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.GWTAvailableOption/407420004", new com.openkm.frontend.client.bean.GWTAvailableOption_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.GWTFolder/3209717831", new com.openkm.frontend.client.bean.GWTFolder_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.GWTLanguage/4163759701", new com.openkm.frontend.client.bean.GWTLanguage_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.GWTLanguage;/1281629170", new com.openkm.frontend.client.bean.GWTLanguage_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.GWTNote/2046630910", new com.openkm.frontend.client.bean.GWTNote_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.GWTNote;/2827106097", new com.openkm.frontend.client.bean.GWTNote_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.GWTPropertyGroup/2271038861", new com.openkm.frontend.client.bean.GWTPropertyGroup_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.GWTPropertyGroup;/513760195", new com.openkm.frontend.client.bean.GWTPropertyGroup_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.GWTReport/4005520573", new com.openkm.frontend.client.bean.GWTReport_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.GWTReport;/2096494535", new com.openkm.frontend.client.bean.GWTReport_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.GWTWorkspace/3564998046", new com.openkm.frontend.client.bean.GWTWorkspace_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTButton/2740530207", new com.openkm.frontend.client.bean.form.GWTButton_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTButton;/3352927165", new com.openkm.frontend.client.bean.form.GWTButton_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTCheckBox/3635695530", new com.openkm.frontend.client.bean.form.GWTCheckBox_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTCheckBox;/839810964", new com.openkm.frontend.client.bean.form.GWTCheckBox_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTDownload/1001678564", new com.openkm.frontend.client.bean.form.GWTDownload_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTDownload;/725090506", new com.openkm.frontend.client.bean.form.GWTDownload_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTFormElement/3225343223", new com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTFormElement;/378458069", new com.openkm.frontend.client.bean.form.GWTFormElement_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTInput/2795871859", new com.openkm.frontend.client.bean.form.GWTInput_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTInput;/3779958542", new com.openkm.frontend.client.bean.form.GWTInput_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTNode/971517141", new com.openkm.frontend.client.bean.form.GWTNode_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTNode;/2872961105", new com.openkm.frontend.client.bean.form.GWTNode_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTOption/3356685567", new com.openkm.frontend.client.bean.form.GWTOption_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTOption;/2695132787", new com.openkm.frontend.client.bean.form.GWTOption_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTPrint/602664531", new com.openkm.frontend.client.bean.form.GWTPrint_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTPrint;/168684583", new com.openkm.frontend.client.bean.form.GWTPrint_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTSelect/837897173", new com.openkm.frontend.client.bean.form.GWTSelect_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTSelect;/1848480226", new com.openkm.frontend.client.bean.form.GWTSelect_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTSeparator/3015862250", new com.openkm.frontend.client.bean.form.GWTSeparator_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTSeparator;/75079524", new com.openkm.frontend.client.bean.form.GWTSeparator_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTSuggestBox/2272482382", new com.openkm.frontend.client.bean.form.GWTSuggestBox_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTSuggestBox;/608115600", new com.openkm.frontend.client.bean.form.GWTSuggestBox_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTText/3588128186", new com.openkm.frontend.client.bean.form.GWTText_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTTextArea/2618283748", new com.openkm.frontend.client.bean.form.GWTTextArea_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTTextArea;/546313721", new com.openkm.frontend.client.bean.form.GWTTextArea_Array_Rank_1_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTText;/3708004535", new com.openkm.frontend.client.bean.form.GWTText_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTUpload/172244304", new com.openkm.frontend.client.bean.form.GWTUpload_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTUpload;/2347874406", new com.openkm.frontend.client.bean.form.GWTUpload_Array_Rank_1_FieldSerializer.Handler());
    result.put("com.openkm.frontend.client.bean.form.GWTValidator/3741116181", new com.openkm.frontend.client.bean.form.GWTValidator_FieldSerializer.Handler());
    result.put("[Lcom.openkm.frontend.client.bean.form.GWTValidator;/2122628886", new com.openkm.frontend.client.bean.form.GWTValidator_Array_Rank_1_FieldSerializer.Handler());
    result.put("java.lang.Boolean/476441737", new com.google.gwt.user.client.rpc.core.java.lang.Boolean_FieldSerializer.Handler());
    result.put("java.lang.Double/858496421", new com.google.gwt.user.client.rpc.core.java.lang.Double_FieldSerializer.Handler());
    result.put("[Ljava.lang.Double;/2857560407", new com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer.Handler());
    result.put("java.lang.String/2004016611", new com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer.Handler());
    result.put("[Ljava.lang.String;/2600011424", new com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer.Handler());
    result.put("java.sql.Date/3996530531", new com.google.gwt.user.client.rpc.core.java.sql.Date_FieldSerializer.Handler());
    result.put("java.sql.Time/831929183", new com.google.gwt.user.client.rpc.core.java.sql.Time_FieldSerializer.Handler());
    result.put("java.sql.Timestamp/1769758459", new com.google.gwt.user.client.rpc.core.java.sql.Timestamp_FieldSerializer.Handler());
    result.put("java.util.ArrayList/3821976829", new com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer.Handler());
    result.put("java.util.Arrays$ArrayList/1243019747", new com.google.gwt.user.client.rpc.core.java.util.Arrays_ArrayList_FieldSerializer.Handler());
    result.put("java.util.Collections$EmptyList/3012082351", new com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyList_FieldSerializer.Handler());
    result.put("java.util.Collections$EmptySet/3150696644", new com.google.gwt.user.client.rpc.core.java.util.Collections_EmptySet_FieldSerializer.Handler());
    result.put("java.util.Collections$SingletonList/833432284", new com.google.gwt.user.client.rpc.core.java.util.Collections_SingletonList_FieldSerializer.Handler());
    result.put("java.util.Date/1659716317", new com.google.gwt.user.client.rpc.core.java.util.Date_FieldSerializer.Handler());
    result.put("java.util.HashSet/1594477813", new com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer.Handler());
    result.put("java.util.LinkedHashSet/3628722029", new com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer.Handler());
    result.put("java.util.LinkedList/1060625595", new com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer.Handler());
    result.put("java.util.Stack/1031431137", new com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer.Handler());
    result.put("java.util.TreeMap/1575826026", new com.google.gwt.user.client.rpc.core.java.util.TreeMap_FieldSerializer.Handler());
    result.put("java.util.TreeSet/1002270346", new com.google.gwt.user.client.rpc.core.java.util.TreeSet_FieldSerializer.Handler());
    result.put("java.util.Vector/3125574444", new com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer.Handler());
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.google.gwt.i18n.client.impl.DateRecord/112389920"] = [
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/impl/DateRecord;),
        @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/client/impl/DateRecord;)
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.openkm.frontend.client.OKMException/1351513842"] = [
        @com.openkm.frontend.client.OKMException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.OKMException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/OKMException;),
      ];
    
    result["com.openkm.frontend.client.bean.GWTAvailableOption/407420004"] = [
        @com.openkm.frontend.client.bean.GWTAvailableOption_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.GWTAvailableOption_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/GWTAvailableOption;),
        @com.openkm.frontend.client.bean.GWTAvailableOption_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/GWTAvailableOption;)
      ];
    
    result["com.openkm.frontend.client.bean.GWTFolder/3209717831"] = [
        @com.openkm.frontend.client.bean.GWTFolder_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.GWTFolder_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/GWTFolder;),
        @com.openkm.frontend.client.bean.GWTFolder_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/GWTFolder;)
      ];
    
    result["com.openkm.frontend.client.bean.GWTLanguage/4163759701"] = [
        @com.openkm.frontend.client.bean.GWTLanguage_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.GWTLanguage_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/GWTLanguage;),
        @com.openkm.frontend.client.bean.GWTLanguage_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/GWTLanguage;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.GWTLanguage;/1281629170"] = [
        @com.openkm.frontend.client.bean.GWTLanguage_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.GWTLanguage_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/GWTLanguage;),
        @com.openkm.frontend.client.bean.GWTLanguage_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/GWTLanguage;)
      ];
    
    result["com.openkm.frontend.client.bean.GWTNote/2046630910"] = [
        @com.openkm.frontend.client.bean.GWTNote_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.GWTNote_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/GWTNote;),
        @com.openkm.frontend.client.bean.GWTNote_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/GWTNote;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.GWTNote;/2827106097"] = [
        @com.openkm.frontend.client.bean.GWTNote_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.GWTNote_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/GWTNote;),
        @com.openkm.frontend.client.bean.GWTNote_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/GWTNote;)
      ];
    
    result["com.openkm.frontend.client.bean.GWTPropertyGroup/2271038861"] = [
        @com.openkm.frontend.client.bean.GWTPropertyGroup_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.GWTPropertyGroup_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/GWTPropertyGroup;),
        @com.openkm.frontend.client.bean.GWTPropertyGroup_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/GWTPropertyGroup;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.GWTPropertyGroup;/513760195"] = [
        @com.openkm.frontend.client.bean.GWTPropertyGroup_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.GWTPropertyGroup_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/GWTPropertyGroup;),
        @com.openkm.frontend.client.bean.GWTPropertyGroup_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/GWTPropertyGroup;)
      ];
    
    result["com.openkm.frontend.client.bean.GWTReport/4005520573"] = [
        @com.openkm.frontend.client.bean.GWTReport_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.GWTReport_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/GWTReport;),
        @com.openkm.frontend.client.bean.GWTReport_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/GWTReport;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.GWTReport;/2096494535"] = [
        @com.openkm.frontend.client.bean.GWTReport_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.GWTReport_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/GWTReport;),
        @com.openkm.frontend.client.bean.GWTReport_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/GWTReport;)
      ];
    
    result["com.openkm.frontend.client.bean.GWTWorkspace/3564998046"] = [
        @com.openkm.frontend.client.bean.GWTWorkspace_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.GWTWorkspace_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/GWTWorkspace;),
        @com.openkm.frontend.client.bean.GWTWorkspace_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/GWTWorkspace;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTButton/2740530207"] = [
        @com.openkm.frontend.client.bean.form.GWTButton_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTButton_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTButton;),
        @com.openkm.frontend.client.bean.form.GWTButton_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTButton;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTButton;/3352927165"] = [
        @com.openkm.frontend.client.bean.form.GWTButton_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTButton_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTButton;),
        @com.openkm.frontend.client.bean.form.GWTButton_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTButton;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTCheckBox/3635695530"] = [
        @com.openkm.frontend.client.bean.form.GWTCheckBox_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTCheckBox_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTCheckBox;),
        @com.openkm.frontend.client.bean.form.GWTCheckBox_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTCheckBox;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTCheckBox;/839810964"] = [
        @com.openkm.frontend.client.bean.form.GWTCheckBox_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTCheckBox_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTCheckBox;),
        @com.openkm.frontend.client.bean.form.GWTCheckBox_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTCheckBox;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTDownload/1001678564"] = [
        @com.openkm.frontend.client.bean.form.GWTDownload_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTDownload_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTDownload;),
        @com.openkm.frontend.client.bean.form.GWTDownload_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTDownload;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTDownload;/725090506"] = [
        @com.openkm.frontend.client.bean.form.GWTDownload_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTDownload_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTDownload;),
        @com.openkm.frontend.client.bean.form.GWTDownload_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTDownload;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTFormElement/3225343223"] = [
        @com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTFormElement;),
        @com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTFormElement;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTFormElement;/378458069"] = [
        @com.openkm.frontend.client.bean.form.GWTFormElement_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTFormElement_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTFormElement;),
        @com.openkm.frontend.client.bean.form.GWTFormElement_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTFormElement;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTInput/2795871859"] = [
        @com.openkm.frontend.client.bean.form.GWTInput_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTInput_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTInput;),
        @com.openkm.frontend.client.bean.form.GWTInput_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTInput;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTInput;/3779958542"] = [
        @com.openkm.frontend.client.bean.form.GWTInput_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTInput_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTInput;),
        @com.openkm.frontend.client.bean.form.GWTInput_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTInput;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTNode/971517141"] = [
        @com.openkm.frontend.client.bean.form.GWTNode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTNode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTNode;),
        @com.openkm.frontend.client.bean.form.GWTNode_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTNode;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTNode;/2872961105"] = [
        @com.openkm.frontend.client.bean.form.GWTNode_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTNode_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTNode;),
        @com.openkm.frontend.client.bean.form.GWTNode_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTNode;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTOption/3356685567"] = [
        @com.openkm.frontend.client.bean.form.GWTOption_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTOption_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTOption;),
        @com.openkm.frontend.client.bean.form.GWTOption_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTOption;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTOption;/2695132787"] = [
        @com.openkm.frontend.client.bean.form.GWTOption_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTOption_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTOption;),
        @com.openkm.frontend.client.bean.form.GWTOption_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTOption;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTPrint/602664531"] = [
        @com.openkm.frontend.client.bean.form.GWTPrint_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTPrint_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTPrint;),
        @com.openkm.frontend.client.bean.form.GWTPrint_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTPrint;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTPrint;/168684583"] = [
        @com.openkm.frontend.client.bean.form.GWTPrint_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTPrint_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTPrint;),
        @com.openkm.frontend.client.bean.form.GWTPrint_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTPrint;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTSelect/837897173"] = [
        @com.openkm.frontend.client.bean.form.GWTSelect_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTSelect_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTSelect;),
        @com.openkm.frontend.client.bean.form.GWTSelect_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTSelect;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTSelect;/1848480226"] = [
        @com.openkm.frontend.client.bean.form.GWTSelect_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTSelect_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTSelect;),
        @com.openkm.frontend.client.bean.form.GWTSelect_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTSelect;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTSeparator/3015862250"] = [
        @com.openkm.frontend.client.bean.form.GWTSeparator_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTSeparator_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTSeparator;),
        @com.openkm.frontend.client.bean.form.GWTSeparator_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTSeparator;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTSeparator;/75079524"] = [
        @com.openkm.frontend.client.bean.form.GWTSeparator_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTSeparator_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTSeparator;),
        @com.openkm.frontend.client.bean.form.GWTSeparator_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTSeparator;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTSuggestBox/2272482382"] = [
        @com.openkm.frontend.client.bean.form.GWTSuggestBox_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTSuggestBox_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTSuggestBox;),
        @com.openkm.frontend.client.bean.form.GWTSuggestBox_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTSuggestBox;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTSuggestBox;/608115600"] = [
        @com.openkm.frontend.client.bean.form.GWTSuggestBox_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTSuggestBox_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTSuggestBox;),
        @com.openkm.frontend.client.bean.form.GWTSuggestBox_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTSuggestBox;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTText/3588128186"] = [
        @com.openkm.frontend.client.bean.form.GWTText_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTText_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTText;),
        @com.openkm.frontend.client.bean.form.GWTText_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTText;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTTextArea/2618283748"] = [
        @com.openkm.frontend.client.bean.form.GWTTextArea_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTTextArea_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTTextArea;),
        @com.openkm.frontend.client.bean.form.GWTTextArea_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTTextArea;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTTextArea;/546313721"] = [
        @com.openkm.frontend.client.bean.form.GWTTextArea_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTTextArea_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTTextArea;),
        @com.openkm.frontend.client.bean.form.GWTTextArea_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTTextArea;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTText;/3708004535"] = [
        @com.openkm.frontend.client.bean.form.GWTText_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTText_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTText;),
        @com.openkm.frontend.client.bean.form.GWTText_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTText;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTUpload/172244304"] = [
        @com.openkm.frontend.client.bean.form.GWTUpload_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTUpload_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTUpload;),
        @com.openkm.frontend.client.bean.form.GWTUpload_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTUpload;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTUpload;/2347874406"] = [
        @com.openkm.frontend.client.bean.form.GWTUpload_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTUpload_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTUpload;),
        @com.openkm.frontend.client.bean.form.GWTUpload_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTUpload;)
      ];
    
    result["com.openkm.frontend.client.bean.form.GWTValidator/3741116181"] = [
        @com.openkm.frontend.client.bean.form.GWTValidator_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTValidator_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/openkm/frontend/client/bean/form/GWTValidator;),
        @com.openkm.frontend.client.bean.form.GWTValidator_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/openkm/frontend/client/bean/form/GWTValidator;)
      ];
    
    result["[Lcom.openkm.frontend.client.bean.form.GWTValidator;/2122628886"] = [
        @com.openkm.frontend.client.bean.form.GWTValidator_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.openkm.frontend.client.bean.form.GWTValidator_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lcom/openkm/frontend/client/bean/form/GWTValidator;),
        @com.openkm.frontend.client.bean.form.GWTValidator_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lcom/openkm/frontend/client/bean/form/GWTValidator;)
      ];
    
    result["java.lang.Boolean/476441737"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ];
    
    result["java.lang.Double/858496421"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Double;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Double;)
      ];
    
    result["[Ljava.lang.Double;/2857560407"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/Double;),
        @com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Double;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["[Ljava.lang.String;/2600011424"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/String;)
      ];
    
    result["java.sql.Date/3996530531"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
        @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Date;)
      ];
    
    result["java.sql.Time/831929183"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
        @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Time;)
      ];
    
    result["java.sql.Timestamp/1769758459"] = [
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
        @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Timestamp;)
      ];
    
    result["java.util.ArrayList/3821976829"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
      ];
    
    result["java.util.Arrays$ArrayList/1243019747"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyList/3012082351"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptySet/3150696644"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Set;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Set;)
      ];
    
    result["java.util.Collections$SingletonList/833432284"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Date/1659716317"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Date;),
        @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Date;)
      ];
    
    result["java.util.HashSet/1594477813"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashSet;),
        @com.google.gwt.user.client.rpc.core.java.util.HashSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashSet;)
      ];
    
    result["java.util.LinkedHashSet/3628722029"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashSet;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashSet;)
      ];
    
    result["java.util.LinkedList/1060625595"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedList;)
      ];
    
    result["java.util.Stack/1031431137"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Stack;)
      ];
    
    result["java.util.TreeMap/1575826026"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
      ];
    
    result["java.util.TreeSet/1002270346"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeSet;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeSet_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeSet;)
      ];
    
    result["java.util.Vector/3125574444"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Vector;)
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  private static Map<Class<?>, String> loadSignaturesJava() {
    Map<Class<?>, String> result = new HashMap<Class<?>, String>();
    result.put(com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer.concreteType(), "com.google.gwt.i18n.client.impl.DateRecord/112389920");
    result.put(com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer.concreteType(), "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put(com.openkm.frontend.client.OKMException_FieldSerializer.concreteType(), "com.openkm.frontend.client.OKMException/1351513842");
    result.put(com.openkm.frontend.client.bean.GWTAvailableOption_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.GWTAvailableOption/407420004");
    result.put(com.openkm.frontend.client.bean.GWTFolder_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.GWTFolder/3209717831");
    result.put(com.openkm.frontend.client.bean.GWTLanguage_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.GWTLanguage/4163759701");
    result.put(com.openkm.frontend.client.bean.GWTLanguage_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.GWTLanguage;/1281629170");
    result.put(com.openkm.frontend.client.bean.GWTNote_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.GWTNote/2046630910");
    result.put(com.openkm.frontend.client.bean.GWTNote_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.GWTNote;/2827106097");
    result.put(com.openkm.frontend.client.bean.GWTPropertyGroup_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.GWTPropertyGroup/2271038861");
    result.put(com.openkm.frontend.client.bean.GWTPropertyGroup_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.GWTPropertyGroup;/513760195");
    result.put(com.openkm.frontend.client.bean.GWTReport_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.GWTReport/4005520573");
    result.put(com.openkm.frontend.client.bean.GWTReport_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.GWTReport;/2096494535");
    result.put(com.openkm.frontend.client.bean.GWTWorkspace_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.GWTWorkspace/3564998046");
    result.put(com.openkm.frontend.client.bean.form.GWTButton_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTButton/2740530207");
    result.put(com.openkm.frontend.client.bean.form.GWTButton_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTButton;/3352927165");
    result.put(com.openkm.frontend.client.bean.form.GWTCheckBox_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTCheckBox/3635695530");
    result.put(com.openkm.frontend.client.bean.form.GWTCheckBox_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTCheckBox;/839810964");
    result.put(com.openkm.frontend.client.bean.form.GWTDownload_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTDownload/1001678564");
    result.put(com.openkm.frontend.client.bean.form.GWTDownload_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTDownload;/725090506");
    result.put(com.openkm.frontend.client.bean.form.GWTFormElement_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTFormElement/3225343223");
    result.put(com.openkm.frontend.client.bean.form.GWTFormElement_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTFormElement;/378458069");
    result.put(com.openkm.frontend.client.bean.form.GWTInput_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTInput/2795871859");
    result.put(com.openkm.frontend.client.bean.form.GWTInput_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTInput;/3779958542");
    result.put(com.openkm.frontend.client.bean.form.GWTNode_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTNode/971517141");
    result.put(com.openkm.frontend.client.bean.form.GWTNode_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTNode;/2872961105");
    result.put(com.openkm.frontend.client.bean.form.GWTOption_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTOption/3356685567");
    result.put(com.openkm.frontend.client.bean.form.GWTOption_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTOption;/2695132787");
    result.put(com.openkm.frontend.client.bean.form.GWTPrint_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTPrint/602664531");
    result.put(com.openkm.frontend.client.bean.form.GWTPrint_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTPrint;/168684583");
    result.put(com.openkm.frontend.client.bean.form.GWTSelect_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTSelect/837897173");
    result.put(com.openkm.frontend.client.bean.form.GWTSelect_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTSelect;/1848480226");
    result.put(com.openkm.frontend.client.bean.form.GWTSeparator_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTSeparator/3015862250");
    result.put(com.openkm.frontend.client.bean.form.GWTSeparator_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTSeparator;/75079524");
    result.put(com.openkm.frontend.client.bean.form.GWTSuggestBox_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTSuggestBox/2272482382");
    result.put(com.openkm.frontend.client.bean.form.GWTSuggestBox_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTSuggestBox;/608115600");
    result.put(com.openkm.frontend.client.bean.form.GWTText_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTText/3588128186");
    result.put(com.openkm.frontend.client.bean.form.GWTTextArea_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTTextArea/2618283748");
    result.put(com.openkm.frontend.client.bean.form.GWTTextArea_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTTextArea;/546313721");
    result.put(com.openkm.frontend.client.bean.form.GWTText_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTText;/3708004535");
    result.put(com.openkm.frontend.client.bean.form.GWTUpload_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTUpload/172244304");
    result.put(com.openkm.frontend.client.bean.form.GWTUpload_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTUpload;/2347874406");
    result.put(com.openkm.frontend.client.bean.form.GWTValidator_FieldSerializer.concreteType(), "com.openkm.frontend.client.bean.form.GWTValidator/3741116181");
    result.put(com.openkm.frontend.client.bean.form.GWTValidator_Array_Rank_1_FieldSerializer.concreteType(), "[Lcom.openkm.frontend.client.bean.form.GWTValidator;/2122628886");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.Boolean_FieldSerializer.concreteType(), "java.lang.Boolean/476441737");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.Double_FieldSerializer.concreteType(), "java.lang.Double/858496421");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.Double_Array_Rank_1_FieldSerializer.concreteType(), "[Ljava.lang.Double;/2857560407");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer.concreteType(), "java.lang.String/2004016611");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer.concreteType(), "[Ljava.lang.String;/2600011424");
    result.put(com.google.gwt.user.client.rpc.core.java.sql.Date_FieldSerializer.concreteType(), "java.sql.Date/3996530531");
    result.put(com.google.gwt.user.client.rpc.core.java.sql.Time_FieldSerializer.concreteType(), "java.sql.Time/831929183");
    result.put(com.google.gwt.user.client.rpc.core.java.sql.Timestamp_FieldSerializer.concreteType(), "java.sql.Timestamp/1769758459");
    result.put(com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer.concreteType(), "java.util.ArrayList/3821976829");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer.concreteType(), "java.util.Arrays$ArrayList/1243019747");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyList/3012082351");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptySet_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptySet/3150696644");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer.concreteType(), "java.util.Collections$SingletonList/833432284");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Date_FieldSerializer.concreteType(), "java.util.Date/1659716317");
    result.put(com.google.gwt.user.client.rpc.core.java.util.HashSet_FieldSerializer.concreteType(), "java.util.HashSet/1594477813");
    result.put(com.google.gwt.user.client.rpc.core.java.util.LinkedHashSet_FieldSerializer.concreteType(), "java.util.LinkedHashSet/3628722029");
    result.put(com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer.concreteType(), "java.util.LinkedList/1060625595");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer.concreteType(), "java.util.Stack/1031431137");
    result.put(com.google.gwt.user.client.rpc.core.java.util.TreeMap_FieldSerializer.concreteType(), "java.util.TreeMap/1575826026");
    result.put(com.google.gwt.user.client.rpc.core.java.util.TreeSet_FieldSerializer.concreteType(), "java.util.TreeSet/1002270346");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer.concreteType(), "java.util.Vector/3125574444");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.i18n.client.impl.DateRecord::class)] = "com.google.gwt.i18n.client.impl.DateRecord/112389920";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.OKMException::class)] = "com.openkm.frontend.client.OKMException/1351513842";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTAvailableOption::class)] = "com.openkm.frontend.client.bean.GWTAvailableOption/407420004";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTFolder::class)] = "com.openkm.frontend.client.bean.GWTFolder/3209717831";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTLanguage::class)] = "com.openkm.frontend.client.bean.GWTLanguage/4163759701";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTLanguage[]::class)] = "[Lcom.openkm.frontend.client.bean.GWTLanguage;/1281629170";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTNote::class)] = "com.openkm.frontend.client.bean.GWTNote/2046630910";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTNote[]::class)] = "[Lcom.openkm.frontend.client.bean.GWTNote;/2827106097";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTPropertyGroup::class)] = "com.openkm.frontend.client.bean.GWTPropertyGroup/2271038861";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTPropertyGroup[]::class)] = "[Lcom.openkm.frontend.client.bean.GWTPropertyGroup;/513760195";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTReport::class)] = "com.openkm.frontend.client.bean.GWTReport/4005520573";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTReport[]::class)] = "[Lcom.openkm.frontend.client.bean.GWTReport;/2096494535";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.GWTWorkspace::class)] = "com.openkm.frontend.client.bean.GWTWorkspace/3564998046";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTButton::class)] = "com.openkm.frontend.client.bean.form.GWTButton/2740530207";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTButton[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTButton;/3352927165";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTCheckBox::class)] = "com.openkm.frontend.client.bean.form.GWTCheckBox/3635695530";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTCheckBox[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTCheckBox;/839810964";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTDownload::class)] = "com.openkm.frontend.client.bean.form.GWTDownload/1001678564";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTDownload[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTDownload;/725090506";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTFormElement::class)] = "com.openkm.frontend.client.bean.form.GWTFormElement/3225343223";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTFormElement[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTFormElement;/378458069";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTInput::class)] = "com.openkm.frontend.client.bean.form.GWTInput/2795871859";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTInput[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTInput;/3779958542";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTNode::class)] = "com.openkm.frontend.client.bean.form.GWTNode/971517141";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTNode[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTNode;/2872961105";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTOption::class)] = "com.openkm.frontend.client.bean.form.GWTOption/3356685567";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTOption[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTOption;/2695132787";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTPrint::class)] = "com.openkm.frontend.client.bean.form.GWTPrint/602664531";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTPrint[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTPrint;/168684583";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTSelect::class)] = "com.openkm.frontend.client.bean.form.GWTSelect/837897173";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTSelect[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTSelect;/1848480226";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTSeparator::class)] = "com.openkm.frontend.client.bean.form.GWTSeparator/3015862250";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTSeparator[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTSeparator;/75079524";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTSuggestBox::class)] = "com.openkm.frontend.client.bean.form.GWTSuggestBox/2272482382";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTSuggestBox[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTSuggestBox;/608115600";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTText::class)] = "com.openkm.frontend.client.bean.form.GWTText/3588128186";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTTextArea::class)] = "com.openkm.frontend.client.bean.form.GWTTextArea/2618283748";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTTextArea[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTTextArea;/546313721";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTText[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTText;/3708004535";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTUpload::class)] = "com.openkm.frontend.client.bean.form.GWTUpload/172244304";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTUpload[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTUpload;/2347874406";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTValidator::class)] = "com.openkm.frontend.client.bean.form.GWTValidator/3741116181";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.openkm.frontend.client.bean.form.GWTValidator[]::class)] = "[Lcom.openkm.frontend.client.bean.form.GWTValidator;/2122628886";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean::class)] = "java.lang.Boolean/476441737";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Double::class)] = "java.lang.Double/858496421";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Double[]::class)] = "[Ljava.lang.Double;/2857560407";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[]::class)] = "[Ljava.lang.String;/2600011424";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Date::class)] = "java.sql.Date/3996530531";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Time::class)] = "java.sql.Time/831929183";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.sql.Timestamp::class)] = "java.sql.Timestamp/1769758459";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/3821976829";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays$ArrayList::class)] = "java.util.Arrays$ArrayList/1243019747";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$EmptyList::class)] = "java.util.Collections$EmptyList/3012082351";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$EmptySet::class)] = "java.util.Collections$EmptySet/3150696644";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections$SingletonList::class)] = "java.util.Collections$SingletonList/833432284";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Date::class)] = "java.util.Date/1659716317";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashSet::class)] = "java.util.HashSet/1594477813";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashSet::class)] = "java.util.LinkedHashSet/3628722029";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/1060625595";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1031431137";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeMap::class)] = "java.util.TreeMap/1575826026";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeSet::class)] = "java.util.TreeSet/1002270346";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3125574444";
    return result;
  }-*/;
  
  public OKMWorkspaceService_TypeSerializer() {
    super(methodMapJava, methodMapNative, signatureMapJava, signatureMapNative);
  }
  
}
