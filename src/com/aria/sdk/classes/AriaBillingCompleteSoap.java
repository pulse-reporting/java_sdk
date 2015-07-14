package com.aria.sdk.classes;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import com.aria.common.shared.AriaCompleteApi;
import com.aria.common.shared.CompletePort;

/**
 * AriaBillingCompleteSoap
 * Web Service class
 * @copyright Aria Systems, Inc
 * @author (Automatic generated)
 */
public class AriaBillingCompleteSoap extends BaseAriaBilling implements AriaBillingComplete {
    /*************** CLASS ATTRIBUTES ****************/
    private CompletePort completePort = null;
    /*************** END - CLASS ATTRIBUTES ****************/

    /************** CONSTRUCTOR ************************/
    public AriaBillingCompleteSoap(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception {
        super(baseAriaBillingDTO);
    }
    /*************** END - CONSTRUCTOR ****************/

    /*************** GETTERS ****************/
    public CompletePort getCompletePort() {
        if (completePort == null){
            try {
                URL wsdlURL = new URL(getURL());
                AriaCompleteApi ss = new AriaCompleteApi(wsdlURL);
                completePort = ss.getCompletePort();
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        return completePort;
    }
    /*************** END - GETTERS ****************/

    /********************************** METHODS IMPLEMENTATION ***********************************************/

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientPlansAll(Long client_no, String auth_key, Long plan_no, Long acct_no, String promo_code, Long parent_plan_no, com.aria.common.shared.SuppFieldNamesArray supp_field_names, com.aria.common.shared.SuppFieldValuesArray supp_field_values, String include_all_rate_schedules, String include_plan_hierarchy, String client_plan_id, String client_parent_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_client_plans = new javax.xml.ws.Holder();

        
        getCompletePort().getClientPlansAll(client_no, auth_key, plan_no, acct_no, promo_code, parent_plan_no, supp_field_names, supp_field_values, include_all_rate_schedules, include_plan_hierarchy, client_plan_id, client_parent_plan_id, h_error_code, h_error_msg, h_all_client_plans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_client_plans",((javax.xml.ws.Holder)h_all_client_plans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientPlansAll(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long plan_no = (Long) map.get("plan_no");
                Long acct_no = (Long) map.get("acct_no");
                String promo_code = (String) map.get("promo_code");
                Long parent_plan_no = (Long) map.get("parent_plan_no");
                com.aria.common.shared.SuppFieldNamesArray supp_field_names = (com.aria.common.shared.SuppFieldNamesArray) map.get("supp_field_names");
                com.aria.common.shared.SuppFieldValuesArray supp_field_values = (com.aria.common.shared.SuppFieldValuesArray) map.get("supp_field_values");
                String include_all_rate_schedules = (String) map.get("include_all_rate_schedules");
                String include_plan_hierarchy = (String) map.get("include_plan_hierarchy");
                String client_plan_id = (String) map.get("client_plan_id");
                String client_parent_plan_id = (String) map.get("client_parent_plan_id");
                
        return getClientPlansAll(client_no, auth_key, plan_no, acct_no, promo_code, parent_plan_no, supp_field_names, supp_field_values, include_all_rate_schedules, include_plan_hierarchy, client_plan_id, client_parent_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setProvEngine(Long client_no, String auth_key, String on_off_indicator){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setProvEngine(client_no, auth_key, on_off_indicator, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setProvEngine(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String on_off_indicator = (String) map.get("on_off_indicator");
                
        return setProvEngine(client_no, auth_key, on_off_indicator);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAufStatus(Long client_no, String auth_key, String file_name){
        javax.xml.ws.Holder h_status_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_load_date_time = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_recs_received = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_recs_loaded = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_recs_failed = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getAufStatus(client_no, auth_key, file_name, h_status_cd, h_load_date_time, h_recs_received, h_recs_loaded, h_recs_failed, h_error_code, h_error_msg);

        getHashMapReturnValues().put("status_cd",((javax.xml.ws.Holder)h_status_cd).value);
        getHashMapReturnValues().put("load_date_time",((javax.xml.ws.Holder)h_load_date_time).value);
        getHashMapReturnValues().put("recs_received",((javax.xml.ws.Holder)h_recs_received).value);
        getHashMapReturnValues().put("recs_loaded",((javax.xml.ws.Holder)h_recs_loaded).value);
        getHashMapReturnValues().put("recs_failed",((javax.xml.ws.Holder)h_recs_failed).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAufStatus(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String file_name = (String) map.get("file_name");
                
        return getAufStatus(client_no, auth_key, file_name);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getCountryFromIp(Long client_no, String auth_key, String ip_address){
        javax.xml.ws.Holder h_country_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_country_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getCountryFromIp(client_no, auth_key, ip_address, h_country_code, h_country_name, h_error_code, h_error_msg);

        getHashMapReturnValues().put("country_code",((javax.xml.ws.Holder)h_country_code).value);
        getHashMapReturnValues().put("country_name",((javax.xml.ws.Holder)h_country_name).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getCountryFromIp(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String ip_address = (String) map.get("ip_address");
                
        return getCountryFromIp(client_no, auth_key, ip_address);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientItems(Long client_no, String auth_key, String filter_currency_cd, String return_no_cost_items, Long filter_item_no, String client_filter_item_id){
        javax.xml.ws.Holder h_client_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getClientItems(client_no, auth_key, filter_currency_cd, return_no_cost_items, filter_item_no, client_filter_item_id, h_client_items, h_error_code, h_error_msg);

        getHashMapReturnValues().put("client_items",((javax.xml.ws.Holder)h_client_items).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientItems(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String filter_currency_cd = (String) map.get("filter_currency_cd");
                String return_no_cost_items = (String) map.get("return_no_cost_items");
                Long filter_item_no = (Long) map.get("filter_item_no");
                String client_filter_item_id = (String) map.get("client_filter_item_id");
                
        return getClientItems(client_no, auth_key, filter_currency_cd, return_no_cost_items, filter_item_no, client_filter_item_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientItemsAll(Long client_no, String auth_key, String filter_currency_cd, String return_no_cost_items, Long filter_item_no, String include_inactive_items, String filter_client_item_id){
        javax.xml.ws.Holder h_all_client_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getClientItemsAll(client_no, auth_key, filter_currency_cd, return_no_cost_items, filter_item_no, include_inactive_items, filter_client_item_id, h_all_client_items, h_error_code, h_error_msg);

        getHashMapReturnValues().put("all_client_items",((javax.xml.ws.Holder)h_all_client_items).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientItemsAll(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String filter_currency_cd = (String) map.get("filter_currency_cd");
                String return_no_cost_items = (String) map.get("return_no_cost_items");
                Long filter_item_no = (Long) map.get("filter_item_no");
                String include_inactive_items = (String) map.get("include_inactive_items");
                String filter_client_item_id = (String) map.get("filter_client_item_id");
                
        return getClientItemsAll(client_no, auth_key, filter_currency_cd, return_no_cost_items, filter_item_no, include_inactive_items, filter_client_item_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientItemPrices(Long client_no, String auth_key, String filter_currency_cd, String return_no_cost_items, Long filter_item_no, String filter_client_item_id){
        javax.xml.ws.Holder h_all_item_prices = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getClientItemPrices(client_no, auth_key, filter_currency_cd, return_no_cost_items, filter_item_no, filter_client_item_id, h_all_item_prices, h_error_code, h_error_msg);

        getHashMapReturnValues().put("all_item_prices",((javax.xml.ws.Holder)h_all_item_prices).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientItemPrices(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String filter_currency_cd = (String) map.get("filter_currency_cd");
                String return_no_cost_items = (String) map.get("return_no_cost_items");
                Long filter_item_no = (Long) map.get("filter_item_no");
                String filter_client_item_id = (String) map.get("filter_client_item_id");
                
        return getClientItemPrices(client_no, auth_key, filter_currency_cd, return_no_cost_items, filter_item_no, filter_client_item_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientItemSuppFields(Long client_no, String auth_key, Long filter_item_no, String filter_client_item_id){
        javax.xml.ws.Holder h_all_item_supp_fields = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getClientItemSuppFields(client_no, auth_key, filter_item_no, filter_client_item_id, h_all_item_supp_fields, h_error_code, h_error_msg);

        getHashMapReturnValues().put("all_item_supp_fields",((javax.xml.ws.Holder)h_all_item_supp_fields).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientItemSuppFields(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long filter_item_no = (Long) map.get("filter_item_no");
                String filter_client_item_id = (String) map.get("filter_client_item_id");
                
        return getClientItemSuppFields(client_no, auth_key, filter_item_no, filter_client_item_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientItemClasses(Long client_no, String auth_key, Long filter_item_no, String filter_client_item_id){
        javax.xml.ws.Holder h_all_item_classes = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getClientItemClasses(client_no, auth_key, filter_item_no, filter_client_item_id, h_all_item_classes, h_error_code, h_error_msg);

        getHashMapReturnValues().put("all_item_classes",((javax.xml.ws.Holder)h_all_item_classes).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientItemClasses(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long filter_item_no = (Long) map.get("filter_item_no");
                String filter_client_item_id = (String) map.get("filter_client_item_id");
                
        return getClientItemClasses(client_no, auth_key, filter_item_no, filter_client_item_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getWebReplacementVals(Long client_no, String auth_key, com.aria.common.shared.WebValsInArray web_vals_in){
        javax.xml.ws.Holder h_web_vals_out = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getWebReplacementVals(client_no, auth_key, web_vals_in, h_web_vals_out, h_error_code, h_error_msg);

        getHashMapReturnValues().put("web_vals_out",((javax.xml.ws.Holder)h_web_vals_out).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getWebReplacementVals(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        com.aria.common.shared.WebValsInArray web_vals_in = (com.aria.common.shared.WebValsInArray) map.get("web_vals_in");
                
        return getWebReplacementVals(client_no, auth_key, web_vals_in);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientPlansBasic(Long client_no, String auth_key, Long plan_no, String client_plan_id){
        javax.xml.ws.Holder h_plans_basic = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getClientPlansBasic(client_no, auth_key, plan_no, client_plan_id, h_plans_basic, h_error_code, h_error_msg);

        getHashMapReturnValues().put("plans_basic",((javax.xml.ws.Holder)h_plans_basic).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientPlansBasic(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long plan_no = (Long) map.get("plan_no");
                String client_plan_id = (String) map.get("client_plan_id");
                
        return getClientPlansBasic(client_no, auth_key, plan_no, client_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientPlanServices(Long client_no, String auth_key, Long plan_no, String client_plan_id){
        javax.xml.ws.Holder h_plan_services = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getClientPlanServices(client_no, auth_key, plan_no, client_plan_id, h_plan_services, h_error_code, h_error_msg);

        getHashMapReturnValues().put("plan_services",((javax.xml.ws.Holder)h_plan_services).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientPlanServices(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long plan_no = (Long) map.get("plan_no");
                String client_plan_id = (String) map.get("client_plan_id");
                
        return getClientPlanServices(client_no, auth_key, plan_no, client_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientPlanServiceRates(Long client_no, String auth_key, Long plan_no, Long service_no, Long alt_rate_schedule_no, String client_plan_id, String client_service_id, String client_alt_rate_schedule_id){
        javax.xml.ws.Holder h_plan_service_rates = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getClientPlanServiceRates(client_no, auth_key, plan_no, service_no, alt_rate_schedule_no, client_plan_id, client_service_id, client_alt_rate_schedule_id, h_plan_service_rates, h_error_code, h_error_msg);

        getHashMapReturnValues().put("plan_service_rates",((javax.xml.ws.Holder)h_plan_service_rates).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientPlanServiceRates(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long plan_no = (Long) map.get("plan_no");
                Long service_no = (Long) map.get("service_no");
                Long alt_rate_schedule_no = (Long) map.get("alt_rate_schedule_no");
                String client_plan_id = (String) map.get("client_plan_id");
                String client_service_id = (String) map.get("client_service_id");
                String client_alt_rate_schedule_id = (String) map.get("client_alt_rate_schedule_id");
                
        return getClientPlanServiceRates(client_no, auth_key, plan_no, service_no, alt_rate_schedule_no, client_plan_id, client_service_id, client_alt_rate_schedule_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientCountries(Long client_no, String auth_key){
        javax.xml.ws.Holder h_client_country = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getClientCountries(client_no, auth_key, h_client_country, h_error_code, h_error_msg);

        getHashMapReturnValues().put("client_country",((javax.xml.ws.Holder)h_client_country).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientCountries(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getClientCountries(client_no, auth_key);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> subscribeEventClass(Long client_no, String auth_key, Long class_no, String do_write){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_events = new javax.xml.ws.Holder();

        
        getCompletePort().subscribeEventClass(client_no, auth_key, class_no, do_write, h_error_code, h_error_msg, h_events);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("events",((javax.xml.ws.Holder)h_events).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> subscribeEventClass(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long class_no = (Long) map.get("class_no");
                String do_write = (String) map.get("do_write");
                
        return subscribeEventClass(client_no, auth_key, class_no, do_write);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> unsubscribeEventClass(Long client_no, String auth_key, Long class_no, String do_write){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_events = new javax.xml.ws.Holder();

        
        getCompletePort().unsubscribeEventClass(client_no, auth_key, class_no, do_write, h_error_code, h_error_msg, h_events);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("events",((javax.xml.ws.Holder)h_events).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> unsubscribeEventClass(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long class_no = (Long) map.get("class_no");
                String do_write = (String) map.get("do_write");
                
        return unsubscribeEventClass(client_no, auth_key, class_no, do_write);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> subscribeEvent(Long client_no, String auth_key, Long event_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().subscribeEvent(client_no, auth_key, event_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> subscribeEvent(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long event_id = (Long) map.get("event_id");
                
        return subscribeEvent(client_no, auth_key, event_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> unsubscribeEvent(Long client_no, String auth_key, Long event_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().unsubscribeEvent(client_no, auth_key, event_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> unsubscribeEvent(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long event_id = (Long) map.get("event_id");
                
        return unsubscribeEvent(client_no, auth_key, event_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> subscribeEvents(Long client_no, String auth_key, com.aria.common.shared.EventListArray event_list){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().subscribeEvents(client_no, auth_key, event_list, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> subscribeEvents(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        com.aria.common.shared.EventListArray event_list = (com.aria.common.shared.EventListArray) map.get("event_list");
                
        return subscribeEvents(client_no, auth_key, event_list);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> unsubscribeEvents(Long client_no, String auth_key, com.aria.common.shared.EventListArray event_list){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().unsubscribeEvents(client_no, auth_key, event_list, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> unsubscribeEvents(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        com.aria.common.shared.EventListArray event_list = (com.aria.common.shared.EventListArray) map.get("event_list");
                
        return unsubscribeEvents(client_no, auth_key, event_list);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> clientHasEventClass(Long client_no, String auth_key, Long class_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_response = new javax.xml.ws.Holder();

        
        getCompletePort().clientHasEventClass(client_no, auth_key, class_no, h_error_code, h_error_msg, h_response);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("response",((javax.xml.ws.Holder)h_response).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> clientHasEventClass(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long class_no = (Long) map.get("class_no");
                
        return clientHasEventClass(client_no, auth_key, class_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> genRandomString(Long client_no, String auth_key, String rand_type, Long rand_length, String rand_case){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_random_string = new javax.xml.ws.Holder();

        
        getCompletePort().genRandomString(client_no, auth_key, rand_type, rand_length, rand_case, h_error_code, h_error_msg, h_random_string);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("random_string",((javax.xml.ws.Holder)h_random_string).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> genRandomString(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String rand_type = (String) map.get("rand_type");
                Long rand_length = (Long) map.get("rand_length");
                String rand_case = (String) map.get("rand_case");
                
        return genRandomString(client_no, auth_key, rand_type, rand_length, rand_case);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getRateSchedulesForPlan(Long client_no, String auth_key, Long plan_no, String currency_cd, String client_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_rate_sched = new javax.xml.ws.Holder();

        
        getCompletePort().getRateSchedulesForPlan(client_no, auth_key, plan_no, currency_cd, client_plan_id, h_error_code, h_error_msg, h_rate_sched);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("rate_sched",((javax.xml.ws.Holder)h_rate_sched).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getRateSchedulesForPlan(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long plan_no = (Long) map.get("plan_no");
                String currency_cd = (String) map.get("currency_cd");
                String client_plan_id = (String) map.get("client_plan_id");
                
        return getRateSchedulesForPlan(client_no, auth_key, plan_no, currency_cd, client_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getCurrentSystemVersion(Long client_no, String auth_key){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_version = new javax.xml.ws.Holder();

        
        getCompletePort().getCurrentSystemVersion(client_no, auth_key, h_error_code, h_error_msg, h_version);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("version",((javax.xml.ws.Holder)h_version).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getCurrentSystemVersion(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getCurrentSystemVersion(client_no, auth_key);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAllClientReceiptIds(Long client_no, String auth_key, String start_date_range, String end_date_range){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_receipt = new javax.xml.ws.Holder();

        
        getCompletePort().getAllClientReceiptIds(client_no, auth_key, start_date_range, end_date_range, h_error_code, h_error_msg, h_client_receipt);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("client_receipt",((javax.xml.ws.Holder)h_client_receipt).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAllClientReceiptIds(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String start_date_range = (String) map.get("start_date_range");
                String end_date_range = (String) map.get("end_date_range");
                
        return getAllClientReceiptIds(client_no, auth_key, start_date_range, end_date_range);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientItemsBasic(Long client_no, String auth_key, String filter_currency_cd, String return_no_cost_items, Long filter_item_no, String include_inactive_items, String filter_client_item_id){
        javax.xml.ws.Holder h_items_basic = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getClientItemsBasic(client_no, auth_key, filter_currency_cd, return_no_cost_items, filter_item_no, include_inactive_items, filter_client_item_id, h_items_basic, h_error_code, h_error_msg);

        getHashMapReturnValues().put("items_basic",((javax.xml.ws.Holder)h_items_basic).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientItemsBasic(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String filter_currency_cd = (String) map.get("filter_currency_cd");
                String return_no_cost_items = (String) map.get("return_no_cost_items");
                Long filter_item_no = (Long) map.get("filter_item_no");
                String include_inactive_items = (String) map.get("include_inactive_items");
                String filter_client_item_id = (String) map.get("filter_client_item_id");
                
        return getClientItemsBasic(client_no, auth_key, filter_currency_cd, return_no_cost_items, filter_item_no, include_inactive_items, filter_client_item_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getRegUssParams(Long client_no, String auth_key, String session_id){
        javax.xml.ws.Holder h_out_reg_uss_params = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getRegUssParams(client_no, auth_key, session_id, h_out_reg_uss_params, h_error_code, h_error_msg);

        getHashMapReturnValues().put("out_reg_uss_params",((javax.xml.ws.Holder)h_out_reg_uss_params).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getRegUssParams(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String session_id = (String) map.get("session_id");
                
        return getRegUssParams(client_no, auth_key, session_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setRegUssParams(Long client_no, String auth_key, String session_id, com.aria.common.shared.InRegUssParamsArray in_reg_uss_params, Long override_timeout_minutes){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setRegUssParams(client_no, auth_key, session_id, in_reg_uss_params, override_timeout_minutes, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setRegUssParams(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String session_id = (String) map.get("session_id");
                com.aria.common.shared.InRegUssParamsArray in_reg_uss_params = (com.aria.common.shared.InRegUssParamsArray) map.get("in_reg_uss_params");
                Long override_timeout_minutes = (Long) map.get("override_timeout_minutes");
                
        return setRegUssParams(client_no, auth_key, session_id, in_reg_uss_params, override_timeout_minutes);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> deleteRegUssParams(Long client_no, String auth_key, String session_id, com.aria.common.shared.ParamNamesArray param_names){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().deleteRegUssParams(client_no, auth_key, session_id, param_names, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> deleteRegUssParams(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String session_id = (String) map.get("session_id");
                com.aria.common.shared.ParamNamesArray param_names = (com.aria.common.shared.ParamNamesArray) map.get("param_names");
                
        return deleteRegUssParams(client_no, auth_key, session_id, param_names);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> replaceRegUssParams(Long client_no, String auth_key, String session_id, com.aria.common.shared.InRegUssParamsArray in_reg_uss_params){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().replaceRegUssParams(client_no, auth_key, session_id, in_reg_uss_params, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> replaceRegUssParams(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String session_id = (String) map.get("session_id");
                com.aria.common.shared.InRegUssParamsArray in_reg_uss_params = (com.aria.common.shared.InRegUssParamsArray) map.get("in_reg_uss_params");
                
        return replaceRegUssParams(client_no, auth_key, session_id, in_reg_uss_params);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> clearRegUssParams(Long client_no, String auth_key, String session_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().clearRegUssParams(client_no, auth_key, session_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> clearRegUssParams(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String session_id = (String) map.get("session_id");
                
        return clearRegUssParams(client_no, auth_key, session_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getRegUssConfigParams(Long client_no, String auth_key, String set_name){
        javax.xml.ws.Holder h_out_reg_uss_config_params = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getRegUssConfigParams(client_no, auth_key, set_name, h_out_reg_uss_config_params, h_error_code, h_error_msg);

        getHashMapReturnValues().put("out_reg_uss_config_params",((javax.xml.ws.Holder)h_out_reg_uss_config_params).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getRegUssConfigParams(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String set_name = (String) map.get("set_name");
                
        return getRegUssConfigParams(client_no, auth_key, set_name);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setRegUssConfigParams(Long client_no, String auth_key, String set_name, com.aria.common.shared.InRegUssConfigParamsArray in_reg_uss_config_params, String set_description, Long set_type_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setRegUssConfigParams(client_no, auth_key, set_name, in_reg_uss_config_params, set_description, set_type_no, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setRegUssConfigParams(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String set_name = (String) map.get("set_name");
                com.aria.common.shared.InRegUssConfigParamsArray in_reg_uss_config_params = (com.aria.common.shared.InRegUssConfigParamsArray) map.get("in_reg_uss_config_params");
                String set_description = (String) map.get("set_description");
                Long set_type_no = (Long) map.get("set_type_no");
                
        return setRegUssConfigParams(client_no, auth_key, set_name, in_reg_uss_config_params, set_description, set_type_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> deleteRegUssConfigParams(Long client_no, String auth_key, String set_name, com.aria.common.shared.ParamNamesArray param_names){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().deleteRegUssConfigParams(client_no, auth_key, set_name, param_names, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> deleteRegUssConfigParams(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String set_name = (String) map.get("set_name");
                com.aria.common.shared.ParamNamesArray param_names = (com.aria.common.shared.ParamNamesArray) map.get("param_names");
                
        return deleteRegUssConfigParams(client_no, auth_key, set_name, param_names);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> replaceRegUssConfigParams(Long client_no, String auth_key, String set_name, com.aria.common.shared.InRegUssConfigParamsArray in_reg_uss_config_params){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().replaceRegUssConfigParams(client_no, auth_key, set_name, in_reg_uss_config_params, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> replaceRegUssConfigParams(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String set_name = (String) map.get("set_name");
                com.aria.common.shared.InRegUssConfigParamsArray in_reg_uss_config_params = (com.aria.common.shared.InRegUssConfigParamsArray) map.get("in_reg_uss_config_params");
                
        return replaceRegUssConfigParams(client_no, auth_key, set_name, in_reg_uss_config_params);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> clearRegUssConfigParams(Long client_no, String auth_key, String set_name){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().clearRegUssConfigParams(client_no, auth_key, set_name, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> clearRegUssConfigParams(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String set_name = (String) map.get("set_name");
                
        return clearRegUssConfigParams(client_no, auth_key, set_name);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientCurrencies(Long client_no, String auth_key){
        javax.xml.ws.Holder h_client_currency = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getClientCurrencies(client_no, auth_key, h_client_currency, h_error_code, h_error_msg);

        getHashMapReturnValues().put("client_currency",((javax.xml.ws.Holder)h_client_currency).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientCurrencies(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getClientCurrencies(client_no, auth_key);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientItemImages(Long client_no, String auth_key, Long item_no, String client_item_id){
        javax.xml.ws.Holder h_item_images = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getClientItemImages(client_no, auth_key, item_no, client_item_id, h_item_images, h_error_code, h_error_msg);

        getHashMapReturnValues().put("item_images",((javax.xml.ws.Holder)h_item_images).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientItemImages(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long item_no = (Long) map.get("item_no");
                String client_item_id = (String) map.get("client_item_id");
                
        return getClientItemImages(client_no, auth_key, item_no, client_item_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getTopLevelItemClass(Long client_no, String auth_key){
        javax.xml.ws.Holder h_top_item_class = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getTopLevelItemClass(client_no, auth_key, h_top_item_class, h_error_code, h_error_msg);

        getHashMapReturnValues().put("top_item_class",((javax.xml.ws.Holder)h_top_item_class).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getTopLevelItemClass(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getTopLevelItemClass(client_no, auth_key);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getParentForItemClass(Long client_no, String auth_key, Long filter_class_no){
        javax.xml.ws.Holder h_parent_item_class = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getParentForItemClass(client_no, auth_key, filter_class_no, h_parent_item_class, h_error_code, h_error_msg);

        getHashMapReturnValues().put("parent_item_class",((javax.xml.ws.Holder)h_parent_item_class).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getParentForItemClass(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long filter_class_no = (Long) map.get("filter_class_no");
                
        return getParentForItemClass(client_no, auth_key, filter_class_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getChildForItemClass(Long client_no, String auth_key, Long filter_class_no){
        javax.xml.ws.Holder h_child_item_class = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getChildForItemClass(client_no, auth_key, filter_class_no, h_child_item_class, h_error_code, h_error_msg);

        getHashMapReturnValues().put("child_item_class",((javax.xml.ws.Holder)h_child_item_class).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getChildForItemClass(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long filter_class_no = (Long) map.get("filter_class_no");
                
        return getChildForItemClass(client_no, auth_key, filter_class_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getItemsByClass(Long client_no, String auth_key, Long filter_class_no){
        javax.xml.ws.Holder h_class_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getItemsByClass(client_no, auth_key, filter_class_no, h_class_items, h_error_code, h_error_msg);

        getHashMapReturnValues().put("class_items",((javax.xml.ws.Holder)h_class_items).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getItemsByClass(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long filter_class_no = (Long) map.get("filter_class_no");
                
        return getItemsByClass(client_no, auth_key, filter_class_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getMasterPlansBySuppField(Long client_no, String auth_key, Long field_no, String field_val, String field_name){
        javax.xml.ws.Holder h_master_plans_by_supp_field = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getMasterPlansBySuppField(client_no, auth_key, field_no, field_val, field_name, h_master_plans_by_supp_field, h_error_code, h_error_msg);

        getHashMapReturnValues().put("master_plans_by_supp_field",((javax.xml.ws.Holder)h_master_plans_by_supp_field).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getMasterPlansBySuppField(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long field_no = (Long) map.get("field_no");
                String field_val = (String) map.get("field_val");
                String field_name = (String) map.get("field_name");
                
        return getMasterPlansBySuppField(client_no, auth_key, field_no, field_val, field_name);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getSuppPlansBySuppField(Long client_no, String auth_key, Long field_no, String field_val, String field_name){
        javax.xml.ws.Holder h_supp_plans_by_supp_field = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getSuppPlansBySuppField(client_no, auth_key, field_no, field_val, field_name, h_supp_plans_by_supp_field, h_error_code, h_error_msg);

        getHashMapReturnValues().put("supp_plans_by_supp_field",((javax.xml.ws.Holder)h_supp_plans_by_supp_field).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getSuppPlansBySuppField(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long field_no = (Long) map.get("field_no");
                String field_val = (String) map.get("field_val");
                String field_name = (String) map.get("field_name");
                
        return getSuppPlansBySuppField(client_no, auth_key, field_no, field_val, field_name);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getItemsBySuppField(Long client_no, String auth_key, Long field_no, String field_val, String field_name){
        javax.xml.ws.Holder h_items_by_supp_field = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getItemsBySuppField(client_no, auth_key, field_no, field_val, field_name, h_items_by_supp_field, h_error_code, h_error_msg);

        getHashMapReturnValues().put("items_by_supp_field",((javax.xml.ws.Holder)h_items_by_supp_field).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getItemsBySuppField(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long field_no = (Long) map.get("field_no");
                String field_val = (String) map.get("field_val");
                String field_name = (String) map.get("field_name");
                
        return getItemsBySuppField(client_no, auth_key, field_no, field_val, field_name);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getEmailTemplates(Long client_no, String auth_key, String filter_template_class){
        javax.xml.ws.Holder h_templates_by_client = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getEmailTemplates(client_no, auth_key, filter_template_class, h_templates_by_client, h_error_code, h_error_msg);

        getHashMapReturnValues().put("templates_by_client",((javax.xml.ws.Holder)h_templates_by_client).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getEmailTemplates(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String filter_template_class = (String) map.get("filter_template_class");
                
        return getEmailTemplates(client_no, auth_key, filter_template_class);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getVirtualDatetime(Long client_no, String auth_key){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_virtual_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_virtual_time = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_system_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_system_time = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_current_offset_hours = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_is_batch_running = new javax.xml.ws.Holder();

        
        getCompletePort().getVirtualDatetime(client_no, auth_key, h_error_code, h_error_msg, h_virtual_date, h_virtual_time, h_system_date, h_system_time, h_current_offset_hours, h_is_batch_running);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("virtual_date",((javax.xml.ws.Holder)h_virtual_date).value);
        getHashMapReturnValues().put("virtual_time",((javax.xml.ws.Holder)h_virtual_time).value);
        getHashMapReturnValues().put("system_date",((javax.xml.ws.Holder)h_system_date).value);
        getHashMapReturnValues().put("system_time",((javax.xml.ws.Holder)h_system_time).value);
        getHashMapReturnValues().put("current_offset_hours",((javax.xml.ws.Holder)h_current_offset_hours).value);
        getHashMapReturnValues().put("is_batch_running",((javax.xml.ws.Holder)h_is_batch_running).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getVirtualDatetime(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getVirtualDatetime(client_no, auth_key);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> advanceVirtualDatetime(Long client_no, String auth_key, Long offset_hours){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_virtual_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_virtual_time = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_system_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_system_time = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_current_offset_hours = new javax.xml.ws.Holder();

        
        getCompletePort().advanceVirtualDatetime(client_no, auth_key, offset_hours, h_error_code, h_error_msg, h_virtual_date, h_virtual_time, h_system_date, h_system_time, h_current_offset_hours);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("virtual_date",((javax.xml.ws.Holder)h_virtual_date).value);
        getHashMapReturnValues().put("virtual_time",((javax.xml.ws.Holder)h_virtual_time).value);
        getHashMapReturnValues().put("system_date",((javax.xml.ws.Holder)h_system_date).value);
        getHashMapReturnValues().put("system_time",((javax.xml.ws.Holder)h_system_time).value);
        getHashMapReturnValues().put("current_offset_hours",((javax.xml.ws.Holder)h_current_offset_hours).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> advanceVirtualDatetime(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long offset_hours = (Long) map.get("offset_hours");
                
        return advanceVirtualDatetime(client_no, auth_key, offset_hours);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getDailyBatchStatus(Long client_no, String auth_key, String batch_date){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_status = new javax.xml.ws.Holder();

        
        getCompletePort().getDailyBatchStatus(client_no, auth_key, batch_date, h_error_code, h_error_msg, h_status);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("status",((javax.xml.ws.Holder)h_status).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getDailyBatchStatus(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String batch_date = (String) map.get("batch_date");
                
        return getDailyBatchStatus(client_no, auth_key, batch_date);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setExternalObjectId(Long client_no, String auth_key, Long destination_id, Long source_type_id, Long object_id, String external_id, Long action_directive){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setExternalObjectId(client_no, auth_key, destination_id, source_type_id, object_id, external_id, action_directive, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setExternalObjectId(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long destination_id = (Long) map.get("destination_id");
                Long source_type_id = (Long) map.get("source_type_id");
                Long object_id = (Long) map.get("object_id");
                String external_id = (String) map.get("external_id");
                Long action_directive = (Long) map.get("action_directive");
                
        return setExternalObjectId(client_no, auth_key, destination_id, source_type_id, object_id, external_id, action_directive);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctSurcharges(Long client_no, String auth_key, Long acct_no, String include_detail_ind){
        javax.xml.ws.Holder h_all_acct_surcharges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctSurcharges(client_no, auth_key, acct_no, include_detail_ind, h_all_acct_surcharges, h_error_code, h_error_msg);

        getHashMapReturnValues().put("all_acct_surcharges",((javax.xml.ws.Holder)h_all_acct_surcharges).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctSurcharges(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String include_detail_ind = (String) map.get("include_detail_ind");
                
        return getAcctSurcharges(client_no, auth_key, acct_no, include_detail_ind);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientPlansAllM(Long client_no, String auth_key, Long plan_no, Long acct_no, String promo_code, Long parent_plan_no, com.aria.common.shared.SuppFieldNamesArray supp_field_names, com.aria.common.shared.SuppFieldValuesArray supp_field_values, String include_all_rate_schedules, String include_plan_hierarchy, String client_plan_id, String client_parent_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_client_plan_dtls = new javax.xml.ws.Holder();

        
        getCompletePort().getClientPlansAllM(client_no, auth_key, plan_no, acct_no, promo_code, parent_plan_no, supp_field_names, supp_field_values, include_all_rate_schedules, include_plan_hierarchy, client_plan_id, client_parent_plan_id, h_error_code, h_error_msg, h_all_client_plan_dtls);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_client_plan_dtls",((javax.xml.ws.Holder)h_all_client_plan_dtls).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientPlansAllM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long plan_no = (Long) map.get("plan_no");
                Long acct_no = (Long) map.get("acct_no");
                String promo_code = (String) map.get("promo_code");
                Long parent_plan_no = (Long) map.get("parent_plan_no");
                com.aria.common.shared.SuppFieldNamesArray supp_field_names = (com.aria.common.shared.SuppFieldNamesArray) map.get("supp_field_names");
                com.aria.common.shared.SuppFieldValuesArray supp_field_values = (com.aria.common.shared.SuppFieldValuesArray) map.get("supp_field_values");
                String include_all_rate_schedules = (String) map.get("include_all_rate_schedules");
                String include_plan_hierarchy = (String) map.get("include_plan_hierarchy");
                String client_plan_id = (String) map.get("client_plan_id");
                String client_parent_plan_id = (String) map.get("client_parent_plan_id");
                
        return getClientPlansAllM(client_no, auth_key, plan_no, acct_no, promo_code, parent_plan_no, supp_field_names, supp_field_values, include_all_rate_schedules, include_plan_hierarchy, client_plan_id, client_parent_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getClientPlansBasicM(Long client_no, String auth_key, Long plan_no, String client_plan_id, String include_rs_summary){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plan_details = new javax.xml.ws.Holder();

        
        getCompletePort().getClientPlansBasicM(client_no, auth_key, plan_no, client_plan_id, include_rs_summary, h_error_code, h_error_msg, h_plan_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("plan_details",((javax.xml.ws.Holder)h_plan_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getClientPlansBasicM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long plan_no = (Long) map.get("plan_no");
                String client_plan_id = (String) map.get("client_plan_id");
                String include_rs_summary = (String) map.get("include_rs_summary");
                
        return getClientPlansBasicM(client_no, auth_key, plan_no, client_plan_id, include_rs_summary);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getMasterPlansBySuppFieldM(Long client_no, String auth_key, String field_val, Long field_no, String field_name, String include_rs_summary){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plans_dtl_by_supp_field = new javax.xml.ws.Holder();

        
        getCompletePort().getMasterPlansBySuppFieldM(client_no, auth_key, field_val, field_no, field_name, include_rs_summary, h_error_code, h_error_msg, h_master_plans_dtl_by_supp_field);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("master_plans_dtl_by_supp_field",((javax.xml.ws.Holder)h_master_plans_dtl_by_supp_field).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getMasterPlansBySuppFieldM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String field_val = (String) map.get("field_val");
                Long field_no = (Long) map.get("field_no");
                String field_name = (String) map.get("field_name");
                String include_rs_summary = (String) map.get("include_rs_summary");
                
        return getMasterPlansBySuppFieldM(client_no, auth_key, field_val, field_no, field_name, include_rs_summary);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getSuppPlansBySuppFieldM(Long client_no, String auth_key, String field_val, Long field_no, String field_name, String include_rs_summary){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_plans_dtl_by_supp_field = new javax.xml.ws.Holder();

        
        getCompletePort().getSuppPlansBySuppFieldM(client_no, auth_key, field_val, field_no, field_name, include_rs_summary, h_error_code, h_error_msg, h_supp_plans_dtl_by_supp_field);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("supp_plans_dtl_by_supp_field",((javax.xml.ws.Holder)h_supp_plans_dtl_by_supp_field).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getSuppPlansBySuppFieldM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String field_val = (String) map.get("field_val");
                Long field_no = (Long) map.get("field_no");
                String field_name = (String) map.get("field_name");
                String include_rs_summary = (String) map.get("include_rs_summary");
                
        return getSuppPlansBySuppFieldM(client_no, auth_key, field_val, field_no, field_name, include_rs_summary);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getCouponDetails(Long client_no, String auth_key, Long acct_no, String coupon_cd){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_coupons = new javax.xml.ws.Holder();

        
        getCompletePort().getCouponDetails(client_no, auth_key, acct_no, coupon_cd, h_error_code, h_error_msg, h_coupons);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("coupons",((javax.xml.ws.Holder)h_coupons).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getCouponDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String coupon_cd = (String) map.get("coupon_cd");
                
        return getCouponDetails(client_no, auth_key, acct_no, coupon_cd);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> deleteAcctCoupon(Long client_no, String auth_key, Long acct_no, String coupon_cd){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().deleteAcctCoupon(client_no, auth_key, acct_no, coupon_cd, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> deleteAcctCoupon(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String coupon_cd = (String) map.get("coupon_cd");
                
        return deleteAcctCoupon(client_no, auth_key, acct_no, coupon_cd);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateAcctContact(Long client_no, String auth_key, Long account_no, String first_name, String last_name, String mi, String company_name, String address1, String address2, String city, String locality, String state_prov, String country, String postal_code, String intl_phone, String alt_email, String birthdate, String address3){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().updateAcctContact(client_no, auth_key, account_no, first_name, last_name, mi, company_name, address1, address2, city, locality, state_prov, country, postal_code, intl_phone, alt_email, birthdate, address3, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateAcctContact(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                String first_name = (String) map.get("first_name");
                String last_name = (String) map.get("last_name");
                String mi = (String) map.get("mi");
                String company_name = (String) map.get("company_name");
                String address1 = (String) map.get("address1");
                String address2 = (String) map.get("address2");
                String city = (String) map.get("city");
                String locality = (String) map.get("locality");
                String state_prov = (String) map.get("state_prov");
                String country = (String) map.get("country");
                String postal_code = (String) map.get("postal_code");
                String intl_phone = (String) map.get("intl_phone");
                String alt_email = (String) map.get("alt_email");
                String birthdate = (String) map.get("birthdate");
                String address3 = (String) map.get("address3");
                
        return updateAcctContact(client_no, auth_key, account_no, first_name, last_name, mi, company_name, address1, address2, city, locality, state_prov, country, postal_code, intl_phone, alt_email, birthdate, address3);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateAcctCredentials(Long client_no, String auth_key, Long account_no, String password, String secret_question_answer, String secret_question, String pin){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().updateAcctCredentials(client_no, auth_key, account_no, password, secret_question_answer, secret_question, pin, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateAcctCredentials(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                String password = (String) map.get("password");
                String secret_question_answer = (String) map.get("secret_question_answer");
                String secret_question = (String) map.get("secret_question");
                String pin = (String) map.get("pin");
                
        return updateAcctCredentials(client_no, auth_key, account_no, password, secret_question_answer, secret_question, pin);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateAcctStatus(Long client_no, String auth_key, Long account_no, Long status_cd, Long queue_days, String queue_date, Long force_bill_date_reset, String comments, String client_receipt_id, String alt_do_dunning, String status_degrade_date){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().updateAcctStatus(client_no, auth_key, account_no, status_cd, queue_days, queue_date, force_bill_date_reset, comments, client_receipt_id, alt_do_dunning, status_degrade_date, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateAcctStatus(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long status_cd = (Long) map.get("status_cd");
                Long queue_days = (Long) map.get("queue_days");
                String queue_date = (String) map.get("queue_date");
                Long force_bill_date_reset = (Long) map.get("force_bill_date_reset");
                String comments = (String) map.get("comments");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String alt_do_dunning = (String) map.get("alt_do_dunning");
                String status_degrade_date = (String) map.get("status_degrade_date");
                
        return updateAcctStatus(client_no, auth_key, account_no, status_cd, queue_days, queue_date, force_bill_date_reset, comments, client_receipt_id, alt_do_dunning, status_degrade_date);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateAcctSuppFields(Long client_no, String auth_key, Long account_no, String field_name, String value_text){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().updateAcctSuppFields(client_no, auth_key, account_no, field_name, value_text, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateAcctSuppFields(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                String field_name = (String) map.get("field_name");
                String value_text = (String) map.get("value_text");
                
        return updateAcctSuppFields(client_no, auth_key, account_no, field_name, value_text);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateAcctBillingContact(Long client_no, String auth_key, Long account_no, String first_name, String last_name, String middle_initial, String company_name, String address1, String address2, String city, String locality, String state, String country, String zip, String intl_phone, String email, String do_collect, String change_status_after_coll, String reset_dates_after_status, String address3, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        
        getCompletePort().updateAcctBillingContact(client_no, auth_key, account_no, first_name, last_name, middle_initial, company_name, address1, address2, city, locality, state, country, zip, intl_phone, email, do_collect, change_status_after_coll, reset_dates_after_status, address3, client_receipt_id, h_error_code, h_error_msg, h_collection_error_code, h_collection_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateAcctBillingContact(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                String first_name = (String) map.get("first_name");
                String last_name = (String) map.get("last_name");
                String middle_initial = (String) map.get("middle_initial");
                String company_name = (String) map.get("company_name");
                String address1 = (String) map.get("address1");
                String address2 = (String) map.get("address2");
                String city = (String) map.get("city");
                String locality = (String) map.get("locality");
                String state = (String) map.get("state");
                String country = (String) map.get("country");
                String zip = (String) map.get("zip");
                String intl_phone = (String) map.get("intl_phone");
                String email = (String) map.get("email");
                String do_collect = (String) map.get("do_collect");
                String change_status_after_coll = (String) map.get("change_status_after_coll");
                String reset_dates_after_status = (String) map.get("reset_dates_after_status");
                String address3 = (String) map.get("address3");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return updateAcctBillingContact(client_no, auth_key, account_no, first_name, last_name, middle_initial, company_name, address1, address2, city, locality, state, country, zip, intl_phone, email, do_collect, change_status_after_coll, reset_dates_after_status, address3, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateAcctNotifyMethod(Long client_no, String auth_key, Long account_no, Long notify_method){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().updateAcctNotifyMethod(client_no, auth_key, account_no, notify_method, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateAcctNotifyMethod(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long notify_method = (Long) map.get("notify_method");
                
        return updateAcctNotifyMethod(client_no, auth_key, account_no, notify_method);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctNotifyMethod(Long client_no, String auth_key, Long account_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_notify_method = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_notify_method_name = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctNotifyMethod(client_no, auth_key, account_no, h_error_code, h_error_msg, h_notify_method, h_notify_method_name);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("notify_method",((javax.xml.ws.Holder)h_notify_method).value);
        getHashMapReturnValues().put("notify_method_name",((javax.xml.ws.Holder)h_notify_method_name).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctNotifyMethod(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                
        return getAcctNotifyMethod(client_no, auth_key, account_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setPayMethodBankDraft(Long client_no, String auth_key, Long account_no, String bank_routing_num, String bank_acct_num, String do_collect, String change_status_after_coll, String reset_dates_after_status, String bank_acct_type, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        
        getCompletePort().setPayMethodBankDraft(client_no, auth_key, account_no, bank_routing_num, bank_acct_num, do_collect, change_status_after_coll, reset_dates_after_status, bank_acct_type, client_receipt_id, h_error_code, h_error_msg, h_collection_error_code, h_collection_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setPayMethodBankDraft(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String do_collect = (String) map.get("do_collect");
                String change_status_after_coll = (String) map.get("change_status_after_coll");
                String reset_dates_after_status = (String) map.get("reset_dates_after_status");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return setPayMethodBankDraft(client_no, auth_key, account_no, bank_routing_num, bank_acct_num, do_collect, change_status_after_coll, reset_dates_after_status, bank_acct_type, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setPayMethodCc(Long client_no, String auth_key, Long account_no, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String do_collect, String change_status_after_coll, String reset_dates_after_status, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        
        getCompletePort().setPayMethodCc(client_no, auth_key, account_no, cc_number, cc_expire_mm, cc_expire_yyyy, do_collect, change_status_after_coll, reset_dates_after_status, client_receipt_id, h_error_code, h_error_msg, h_collection_error_code, h_collection_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setPayMethodCc(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String do_collect = (String) map.get("do_collect");
                String change_status_after_coll = (String) map.get("change_status_after_coll");
                String reset_dates_after_status = (String) map.get("reset_dates_after_status");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return setPayMethodCc(client_no, auth_key, account_no, cc_number, cc_expire_mm, cc_expire_yyyy, do_collect, change_status_after_coll, reset_dates_after_status, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setPayMethodNetTerms(Long client_no, String auth_key, Long account_no, Long pay_method){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setPayMethodNetTerms(client_no, auth_key, account_no, pay_method, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setPayMethodNetTerms(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long pay_method = (Long) map.get("pay_method");
                
        return setPayMethodNetTerms(client_no, auth_key, account_no, pay_method);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setPaymentResponsibility(Long client_no, String auth_key, Long account_no, Long resp_level_cd, Long senior_account_no, String senior_acct_user_id, String client_senior_acct_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setPaymentResponsibility(client_no, auth_key, account_no, resp_level_cd, senior_account_no, senior_acct_user_id, client_senior_acct_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setPaymentResponsibility(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long resp_level_cd = (Long) map.get("resp_level_cd");
                Long senior_account_no = (Long) map.get("senior_account_no");
                String senior_acct_user_id = (String) map.get("senior_acct_user_id");
                String client_senior_acct_id = (String) map.get("client_senior_acct_id");
                
        return setPaymentResponsibility(client_no, auth_key, account_no, resp_level_cd, senior_account_no, senior_acct_user_id, client_senior_acct_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setServicePlanImmediately(Long client_no, String auth_key, Long account_no, Long plan_no, String client_receipt_id, String client_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setServicePlanImmediately(client_no, auth_key, account_no, plan_no, client_receipt_id, client_plan_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setServicePlanImmediately(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long plan_no = (Long) map.get("plan_no");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String client_plan_id = (String) map.get("client_plan_id");
                
        return setServicePlanImmediately(client_no, auth_key, account_no, plan_no, client_receipt_id, client_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> toggleTestAccount(Long client_no, String auth_key, Long account_no, Long test_acct_ind){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().toggleTestAccount(client_no, auth_key, account_no, test_acct_ind, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> toggleTestAccount(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long test_acct_ind = (Long) map.get("test_acct_ind");
                
        return toggleTestAccount(client_no, auth_key, account_no, test_acct_ind);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> validatePaymentInformation(Long client_no, String auth_key, Long account_no, Long CVV, Long seq_no, String inTrackingNumber, String inAuthValue, Long alt_pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bill_company_name, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_address1, String bill_address2, String bill_city, String bill_locality, String bill_state_prov, String bill_zip, String bill_country, String bill_email, String bill_phone, String bill_phone_extension, String bill_cell_phone, String bill_work_phone, String bill_work_phone_extension, String currency_cd, Long acct_group_no, String bill_address3, String alt_client_acct_group_id, String track_data1, String track_data2, String client_acct_group_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        
        getCompletePort().validatePaymentInformation(client_no, auth_key, account_no, CVV, seq_no, inTrackingNumber, inAuthValue, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, currency_cd, acct_group_no, bill_address3, alt_client_acct_group_id, track_data1, track_data2, client_acct_group_id, h_error_code, h_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> validatePaymentInformation(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long CVV = (Long) map.get("CVV");
                Long seq_no = (Long) map.get("seq_no");
                String inTrackingNumber = (String) map.get("inTrackingNumber");
                String inAuthValue = (String) map.get("inAuthValue");
                Long alt_pay_method = (Long) map.get("alt_pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_zip = (String) map.get("bill_zip");
                String bill_country = (String) map.get("bill_country");
                String bill_email = (String) map.get("bill_email");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_extension = (String) map.get("bill_phone_extension");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_extension = (String) map.get("bill_work_phone_extension");
                String currency_cd = (String) map.get("currency_cd");
                Long acct_group_no = (Long) map.get("acct_group_no");
                String bill_address3 = (String) map.get("bill_address3");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                String client_acct_group_id = (String) map.get("client_acct_group_id");
                
        return validatePaymentInformation(client_no, auth_key, account_no, CVV, seq_no, inTrackingNumber, inAuthValue, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, currency_cd, acct_group_no, bill_address3, alt_client_acct_group_id, track_data1, track_data2, client_acct_group_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> banAcct(Long client_no, String auth_key, Long account_no, String userid, Long days_to_restore, String date_to_restore, Long reason_cd, String comments){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().banAcct(client_no, auth_key, account_no, userid, days_to_restore, date_to_restore, reason_cd, comments, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> banAcct(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                String userid = (String) map.get("userid");
                Long days_to_restore = (Long) map.get("days_to_restore");
                String date_to_restore = (String) map.get("date_to_restore");
                Long reason_cd = (Long) map.get("reason_cd");
                String comments = (String) map.get("comments");
                
        return banAcct(client_no, auth_key, account_no, userid, days_to_restore, date_to_restore, reason_cd, comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctTransHistory(Long client_no, String auth_key, Long account_no, Long transaction_type, String start_date, String end_date, Long record_limit, Long filter_statement_no, String include_void_transactions){
        javax.xml.ws.Holder h_history = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctTransHistory(client_no, auth_key, account_no, transaction_type, start_date, end_date, record_limit, filter_statement_no, include_void_transactions, h_history, h_error_code, h_error_msg);

        getHashMapReturnValues().put("history",((javax.xml.ws.Holder)h_history).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctTransHistory(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long transaction_type = (Long) map.get("transaction_type");
                String start_date = (String) map.get("start_date");
                String end_date = (String) map.get("end_date");
                Long record_limit = (Long) map.get("record_limit");
                Long filter_statement_no = (Long) map.get("filter_statement_no");
                String include_void_transactions = (String) map.get("include_void_transactions");
                
        return getAcctTransHistory(client_no, auth_key, account_no, transaction_type, start_date, end_date, record_limit, filter_statement_no, include_void_transactions);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updatePaymentMethod(Long client_no, String auth_key, Long account_number, String first_name, String last_name, String middle_initial, String company_name, String address1, String address2, String city, String locality, String state, String country, String zip, String intl_phone, String phone_npa, String phone_nxx, String phone_suffix, String phone_extension, String email, String pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_routing_num, String bank_acct_num, String do_collect, String change_status_after_coll, String reset_dates_after_status, String client_receipt_id, String bank_acct_type, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd, Long primary_or_bkup_pay_method_ind, Long ref_bkup_seq_no){
        javax.xml.ws.Holder h_seq_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        
        getCompletePort().updatePaymentMethod(client_no, auth_key, account_number, first_name, last_name, middle_initial, company_name, address1, address2, city, locality, state, country, zip, intl_phone, phone_npa, phone_nxx, phone_suffix, phone_extension, email, pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, do_collect, change_status_after_coll, reset_dates_after_status, client_receipt_id, bank_acct_type, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, primary_or_bkup_pay_method_ind, ref_bkup_seq_no, h_seq_no, h_error_code, h_error_msg, h_collection_error_code, h_collection_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments);

        getHashMapReturnValues().put("seq_no",((javax.xml.ws.Holder)h_seq_no).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updatePaymentMethod(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_number = (Long) map.get("account_number");
                String first_name = (String) map.get("first_name");
                String last_name = (String) map.get("last_name");
                String middle_initial = (String) map.get("middle_initial");
                String company_name = (String) map.get("company_name");
                String address1 = (String) map.get("address1");
                String address2 = (String) map.get("address2");
                String city = (String) map.get("city");
                String locality = (String) map.get("locality");
                String state = (String) map.get("state");
                String country = (String) map.get("country");
                String zip = (String) map.get("zip");
                String intl_phone = (String) map.get("intl_phone");
                String phone_npa = (String) map.get("phone_npa");
                String phone_nxx = (String) map.get("phone_nxx");
                String phone_suffix = (String) map.get("phone_suffix");
                String phone_extension = (String) map.get("phone_extension");
                String email = (String) map.get("email");
                String pay_method = (String) map.get("pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String do_collect = (String) map.get("do_collect");
                String change_status_after_coll = (String) map.get("change_status_after_coll");
                String reset_dates_after_status = (String) map.get("reset_dates_after_status");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                Long primary_or_bkup_pay_method_ind = (Long) map.get("primary_or_bkup_pay_method_ind");
                Long ref_bkup_seq_no = (Long) map.get("ref_bkup_seq_no");
                
        return updatePaymentMethod(client_no, auth_key, account_number, first_name, last_name, middle_initial, company_name, address1, address2, city, locality, state, country, zip, intl_phone, phone_npa, phone_nxx, phone_suffix, phone_extension, email, pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, do_collect, change_status_after_coll, reset_dates_after_status, client_receipt_id, bank_acct_type, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, primary_or_bkup_pay_method_ind, ref_bkup_seq_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> authorizeElectronicPayment(Long client_no, String auth_key, Long account_number, Double amount, Long payment_source, String CVV, Long bill_seq, String inTrackingNumber, String inAuthValue, String alt_client_acct_group_id, String track_data1, String track_data2, Long alt_pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_routing_num, String bank_acct_num, String bank_acct_type, String bill_company_name, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_address1, String bill_address2, String bill_address3, String bill_city, String bill_locality, String bill_state_prov, String bill_zip, String bill_country, String bill_email, String bill_phone, String bill_phone_extension, String bill_cell_phone, String bill_work_phone, String bill_work_phone_extension, String record_cc_on_auth_failure, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        
        getCompletePort().authorizeElectronicPayment(client_no, auth_key, account_number, amount, payment_source, CVV, bill_seq, inTrackingNumber, inAuthValue, alt_client_acct_group_id, track_data1, track_data2, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bank_acct_type, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_address3, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, record_cc_on_auth_failure, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, h_error_code, h_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> authorizeElectronicPayment(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_number = (Long) map.get("account_number");
                Double amount = (Double) map.get("amount");
                Long payment_source = (Long) map.get("payment_source");
                String CVV = (String) map.get("CVV");
                Long bill_seq = (Long) map.get("bill_seq");
                String inTrackingNumber = (String) map.get("inTrackingNumber");
                String inAuthValue = (String) map.get("inAuthValue");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                Long alt_pay_method = (Long) map.get("alt_pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_address3 = (String) map.get("bill_address3");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_zip = (String) map.get("bill_zip");
                String bill_country = (String) map.get("bill_country");
                String bill_email = (String) map.get("bill_email");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_extension = (String) map.get("bill_phone_extension");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_extension = (String) map.get("bill_work_phone_extension");
                String record_cc_on_auth_failure = (String) map.get("record_cc_on_auth_failure");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                
        return authorizeElectronicPayment(client_no, auth_key, account_number, amount, payment_source, CVV, bill_seq, inTrackingNumber, inAuthValue, alt_client_acct_group_id, track_data1, track_data2, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bank_acct_type, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_address3, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, record_cc_on_auth_failure, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> authorizeElectronicPaymentM(Long client_no, String auth_key, Long acct_no, Double amount, Long plan_instance_no, String client_plan_instance_id, Long billing_group_no, String client_billing_group_id, Long payment_source, String CVV, Long bill_seq, String inTrackingNumber, String inAuthValue, String alt_client_acct_group_id, String track_data1, String track_data2, Long alt_pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_routing_num, String bank_acct_num, String bank_acct_type, String bill_company_name, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_address1, String bill_address2, String bill_address3, String bill_city, String bill_locality, String bill_state_prov, String bill_zip, String bill_country, String bill_email, String bill_phone, String bill_phone_extension, String bill_cell_phone, String bill_work_phone, String bill_work_phone_extension, String record_cc_on_auth_failure, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        
        getCompletePort().authorizeElectronicPaymentM(client_no, auth_key, acct_no, amount, plan_instance_no, client_plan_instance_id, billing_group_no, client_billing_group_id, payment_source, CVV, bill_seq, inTrackingNumber, inAuthValue, alt_client_acct_group_id, track_data1, track_data2, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bank_acct_type, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_address3, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, record_cc_on_auth_failure, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, h_error_code, h_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> authorizeElectronicPaymentM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Double amount = (Double) map.get("amount");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                Long billing_group_no = (Long) map.get("billing_group_no");
                String client_billing_group_id = (String) map.get("client_billing_group_id");
                Long payment_source = (Long) map.get("payment_source");
                String CVV = (String) map.get("CVV");
                Long bill_seq = (Long) map.get("bill_seq");
                String inTrackingNumber = (String) map.get("inTrackingNumber");
                String inAuthValue = (String) map.get("inAuthValue");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                Long alt_pay_method = (Long) map.get("alt_pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_address3 = (String) map.get("bill_address3");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_zip = (String) map.get("bill_zip");
                String bill_country = (String) map.get("bill_country");
                String bill_email = (String) map.get("bill_email");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_extension = (String) map.get("bill_phone_extension");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_extension = (String) map.get("bill_work_phone_extension");
                String record_cc_on_auth_failure = (String) map.get("record_cc_on_auth_failure");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                
        return authorizeElectronicPaymentM(client_no, auth_key, acct_no, amount, plan_instance_no, client_plan_instance_id, billing_group_no, client_billing_group_id, payment_source, CVV, bill_seq, inTrackingNumber, inAuthValue, alt_client_acct_group_id, track_data1, track_data2, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bank_acct_type, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_address3, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, record_cc_on_auth_failure, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getQueuedServicePlans(Long client_no, String auth_key, Long account_number){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_queued_plans = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_current_rate_schedule_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_current_rate_schedule_id = new javax.xml.ws.Holder();

        
        getCompletePort().getQueuedServicePlans(client_no, auth_key, account_number, h_error_code, h_error_msg, h_queued_plans, h_current_rate_schedule_no, h_client_current_rate_schedule_id);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("queued_plans",((javax.xml.ws.Holder)h_queued_plans).value);
        getHashMapReturnValues().put("current_rate_schedule_no",((javax.xml.ws.Holder)h_current_rate_schedule_no).value);
        getHashMapReturnValues().put("client_current_rate_schedule_id",((javax.xml.ws.Holder)h_client_current_rate_schedule_id).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getQueuedServicePlans(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_number = (Long) map.get("account_number");
                
        return getQueuedServicePlans(client_no, auth_key, account_number);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelQueuedServicePlan(Long client_no, String auth_key, Long account_number, com.aria.common.shared.PlanNoToRemoveArray plan_no_to_remove, String remove_all_queued_plan_no, String remove_terminate_pending){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().cancelQueuedServicePlan(client_no, auth_key, account_number, plan_no_to_remove, remove_all_queued_plan_no, remove_terminate_pending, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelQueuedServicePlan(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_number = (Long) map.get("account_number");
                com.aria.common.shared.PlanNoToRemoveArray plan_no_to_remove = (com.aria.common.shared.PlanNoToRemoveArray) map.get("plan_no_to_remove");
                String remove_all_queued_plan_no = (String) map.get("remove_all_queued_plan_no");
                String remove_terminate_pending = (String) map.get("remove_terminate_pending");
                
        return cancelQueuedServicePlan(client_no, auth_key, account_number, plan_no_to_remove, remove_all_queued_plan_no, remove_terminate_pending);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctStatusHistory(Long client_no, String auth_key, Long account_number){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_stat_hist = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctStatusHistory(client_no, auth_key, account_number, h_error_code, h_error_msg, h_stat_hist);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("stat_hist",((javax.xml.ws.Holder)h_stat_hist).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctStatusHistory(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_number = (Long) map.get("account_number");
                
        return getAcctStatusHistory(client_no, auth_key, account_number);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPlanHistory(Long client_no, String auth_key, Long account_number){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plan_hist = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPlanHistory(client_no, auth_key, account_number, h_error_code, h_error_msg, h_plan_hist);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("plan_hist",((javax.xml.ws.Holder)h_plan_hist).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPlanHistory(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_number = (Long) map.get("account_number");
                
        return getAcctPlanHistory(client_no, auth_key, account_number);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctSuppPlanHistory(Long client_no, String auth_key, Long acct_no, Long plan_no, String client_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_plan_hist = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctSuppPlanHistory(client_no, auth_key, acct_no, plan_no, client_plan_id, h_error_code, h_error_msg, h_supp_plan_hist);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("supp_plan_hist",((javax.xml.ws.Holder)h_supp_plan_hist).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctSuppPlanHistory(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long plan_no = (Long) map.get("plan_no");
                String client_plan_id = (String) map.get("client_plan_id");
                
        return getAcctSuppPlanHistory(client_no, auth_key, acct_no, plan_no, client_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAvailablePlans(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plans = new javax.xml.ws.Holder();

        
        getCompletePort().getAvailablePlans(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_plans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("plans",((javax.xml.ws.Holder)h_plans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAvailablePlans(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAvailablePlans(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAvailablePlansAll(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_plans = new javax.xml.ws.Holder();

        
        getCompletePort().getAvailablePlansAll(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_all_plans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_plans",((javax.xml.ws.Holder)h_all_plans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAvailablePlansAll(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAvailablePlansAll(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getPlansByPromoCode(Long client_no, String auth_key, String promo_code){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plans = new javax.xml.ws.Holder();

        
        getCompletePort().getPlansByPromoCode(client_no, auth_key, promo_code, h_error_code, h_error_msg, h_plans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("plans",((javax.xml.ws.Holder)h_plans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPlansByPromoCode(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String promo_code = (String) map.get("promo_code");
                
        return getPlansByPromoCode(client_no, auth_key, promo_code);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getPlansByPromoCodeAll(Long client_no, String auth_key, String promo_code){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_plans = new javax.xml.ws.Holder();

        
        getCompletePort().getPlansByPromoCodeAll(client_no, auth_key, promo_code, h_error_code, h_error_msg, h_all_plans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_plans",((javax.xml.ws.Holder)h_all_plans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPlansByPromoCodeAll(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String promo_code = (String) map.get("promo_code");
                
        return getPlansByPromoCodeAll(client_no, auth_key, promo_code);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctDetailsAll(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_first_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_mi = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_last_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_userid = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_birthdate = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_job_title = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_salutation = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_senior_acct_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_acct_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_resp_level_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_is_test_acct = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_alt_email = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_address1 = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_address2 = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_city = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_state_prov = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_locality = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_postal_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_country = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_company_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cell_phone_npa = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cell_phone_nxx = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cell_phone_suffix = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_fax_phone = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_intl_cell_phone = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_intl_phone = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_phone_extension = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_phone_npa = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_phone_nxx = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_phone_suffix = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_work_phone = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_work_phone_extension = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_work_phone_npa = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_work_phone_nxx = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_work_phone_suffix = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bill_day = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_created = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_date_to_expire = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_date_to_suspend = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_last_arrears_bill_thru_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_last_bill_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_last_bill_thru_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_next_bill_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plan_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_status_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_status_degrade_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_status_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_status_label = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plan_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plan_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plan_units = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_notify_method = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_notify_method_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_PASSWORD = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_pin = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_secret_question = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_secret_question_answer = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_pay_method = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_pay_method_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_currency_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_tax_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_email = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_first_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_middle_initial = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_last_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_address1 = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_address2 = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_city = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_state = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_locality = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_zip = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_country = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cc_suffix = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cc_expire_mm = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cc_expire_yyyy = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cc_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bank_acct_suffix = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bank_routing_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_cell_phone = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_cell_phone_npa = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_cell_phone_nxx = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_cell_phone_suffix = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_company_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_intl_phone = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_phone_extension = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_phone_npa = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_phone_nxx = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_phone_suffix = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_work_phone = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_work_phone_extension = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_work_phone_npa = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_work_phone_nxx = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_work_phone_suffix = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_balance = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_create_client_receipt_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plan_client_receipt_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_status_client_receipt_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_taxpayer_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_alt_msg_template_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_seq_func_group_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_promo_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_address3 = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_address3 = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_address_verification_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_address_match_score = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_address_verification_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_address_match_score = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_plan_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_alt_msg_template_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_pay_method = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_email = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_first_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_middle_initial = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_last_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_address1 = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_address2 = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_city = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_state = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_locality = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_zip = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_country = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_cc_suffix = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_cc_expire_mm = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_cc_expire_yyyy = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_cc_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_bank_acct_suffix = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_bank_routing_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_cell_phone = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_cell_phone_npa = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_cell_phone_nxx = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_cell_phone_suffix = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_company_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_intl_phone = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_phone_extension = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_work_phone = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_work_phone_extension = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_work_phone_npa = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_work_phone_nxx = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_bkup_billing_work_phone_suffix = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_stmnt_email_list = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_approval_required = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_stmnt_email_list_cc = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_stmnt_email_list_bcc = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_posting_method_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_start_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctDetailsAll(client_no, auth_key, acct_no, h_first_name, h_mi, h_last_name, h_userid, h_birthdate, h_job_title, h_salutation, h_senior_acct_no, h_client_acct_id, h_resp_level_cd, h_is_test_acct, h_alt_email, h_address1, h_address2, h_city, h_state_prov, h_locality, h_postal_code, h_country, h_company_name, h_cell_phone_npa, h_cell_phone_nxx, h_cell_phone_suffix, h_fax_phone, h_intl_cell_phone, h_intl_phone, h_phone_extension, h_phone_npa, h_phone_nxx, h_phone_suffix, h_work_phone, h_work_phone_extension, h_work_phone_npa, h_work_phone_nxx, h_work_phone_suffix, h_bill_day, h_created, h_date_to_expire, h_date_to_suspend, h_last_arrears_bill_thru_date, h_last_bill_date, h_last_bill_thru_date, h_next_bill_date, h_plan_date, h_status_date, h_status_degrade_date, h_status_cd, h_status_label, h_plan_no, h_plan_name, h_plan_units, h_notify_method, h_notify_method_name, h_PASSWORD, h_pin, h_secret_question, h_secret_question_answer, h_pay_method, h_pay_method_name, h_currency_cd, h_tax_id, h_billing_email, h_billing_first_name, h_billing_middle_initial, h_billing_last_name, h_billing_address1, h_billing_address2, h_billing_city, h_billing_state, h_billing_locality, h_billing_zip, h_billing_country, h_cc_suffix, h_cc_expire_mm, h_cc_expire_yyyy, h_cc_id, h_bank_acct_suffix, h_bank_routing_no, h_billing_cell_phone, h_billing_cell_phone_npa, h_billing_cell_phone_nxx, h_billing_cell_phone_suffix, h_billing_company_name, h_billing_intl_phone, h_billing_phone_extension, h_billing_phone_npa, h_billing_phone_nxx, h_billing_phone_suffix, h_billing_work_phone, h_billing_work_phone_extension, h_billing_work_phone_npa, h_billing_work_phone_nxx, h_billing_work_phone_suffix, h_balance, h_acct_create_client_receipt_id, h_plan_client_receipt_id, h_status_client_receipt_id, h_taxpayer_id, h_alt_msg_template_no, h_seq_func_group_no, h_promo_cd, h_address3, h_billing_address3, h_address_verification_code, h_address_match_score, h_billing_address_verification_code, h_billing_address_match_score, h_client_plan_id, h_client_alt_msg_template_id, h_bkup_pay_method, h_bkup_billing_email, h_bkup_billing_first_name, h_bkup_billing_middle_initial, h_bkup_billing_last_name, h_bkup_billing_address1, h_bkup_billing_address2, h_bkup_billing_city, h_bkup_billing_state, h_bkup_billing_locality, h_bkup_billing_zip, h_bkup_billing_country, h_bkup_cc_suffix, h_bkup_cc_expire_mm, h_bkup_cc_expire_yyyy, h_bkup_cc_id, h_bkup_bank_acct_suffix, h_bkup_bank_routing_no, h_bkup_billing_cell_phone, h_bkup_billing_cell_phone_npa, h_bkup_billing_cell_phone_nxx, h_bkup_billing_cell_phone_suffix, h_bkup_billing_company_name, h_bkup_billing_intl_phone, h_bkup_billing_phone_extension, h_bkup_billing_work_phone, h_bkup_billing_work_phone_extension, h_bkup_billing_work_phone_npa, h_bkup_billing_work_phone_nxx, h_bkup_billing_work_phone_suffix, h_stmnt_email_list, h_invoice_approval_required, h_stmnt_email_list_cc, h_stmnt_email_list_bcc, h_invoice_posting_method_cd, h_acct_start_date, h_error_code, h_error_msg);

        getHashMapReturnValues().put("first_name",((javax.xml.ws.Holder)h_first_name).value);
        getHashMapReturnValues().put("mi",((javax.xml.ws.Holder)h_mi).value);
        getHashMapReturnValues().put("last_name",((javax.xml.ws.Holder)h_last_name).value);
        getHashMapReturnValues().put("userid",((javax.xml.ws.Holder)h_userid).value);
        getHashMapReturnValues().put("birthdate",((javax.xml.ws.Holder)h_birthdate).value);
        getHashMapReturnValues().put("job_title",((javax.xml.ws.Holder)h_job_title).value);
        getHashMapReturnValues().put("salutation",((javax.xml.ws.Holder)h_salutation).value);
        getHashMapReturnValues().put("senior_acct_no",((javax.xml.ws.Holder)h_senior_acct_no).value);
        getHashMapReturnValues().put("client_acct_id",((javax.xml.ws.Holder)h_client_acct_id).value);
        getHashMapReturnValues().put("resp_level_cd",((javax.xml.ws.Holder)h_resp_level_cd).value);
        getHashMapReturnValues().put("is_test_acct",((javax.xml.ws.Holder)h_is_test_acct).value);
        getHashMapReturnValues().put("alt_email",((javax.xml.ws.Holder)h_alt_email).value);
        getHashMapReturnValues().put("address1",((javax.xml.ws.Holder)h_address1).value);
        getHashMapReturnValues().put("address2",((javax.xml.ws.Holder)h_address2).value);
        getHashMapReturnValues().put("city",((javax.xml.ws.Holder)h_city).value);
        getHashMapReturnValues().put("state_prov",((javax.xml.ws.Holder)h_state_prov).value);
        getHashMapReturnValues().put("locality",((javax.xml.ws.Holder)h_locality).value);
        getHashMapReturnValues().put("postal_code",((javax.xml.ws.Holder)h_postal_code).value);
        getHashMapReturnValues().put("country",((javax.xml.ws.Holder)h_country).value);
        getHashMapReturnValues().put("company_name",((javax.xml.ws.Holder)h_company_name).value);
        getHashMapReturnValues().put("cell_phone_npa",((javax.xml.ws.Holder)h_cell_phone_npa).value);
        getHashMapReturnValues().put("cell_phone_nxx",((javax.xml.ws.Holder)h_cell_phone_nxx).value);
        getHashMapReturnValues().put("cell_phone_suffix",((javax.xml.ws.Holder)h_cell_phone_suffix).value);
        getHashMapReturnValues().put("fax_phone",((javax.xml.ws.Holder)h_fax_phone).value);
        getHashMapReturnValues().put("intl_cell_phone",((javax.xml.ws.Holder)h_intl_cell_phone).value);
        getHashMapReturnValues().put("intl_phone",((javax.xml.ws.Holder)h_intl_phone).value);
        getHashMapReturnValues().put("phone_extension",((javax.xml.ws.Holder)h_phone_extension).value);
        getHashMapReturnValues().put("phone_npa",((javax.xml.ws.Holder)h_phone_npa).value);
        getHashMapReturnValues().put("phone_nxx",((javax.xml.ws.Holder)h_phone_nxx).value);
        getHashMapReturnValues().put("phone_suffix",((javax.xml.ws.Holder)h_phone_suffix).value);
        getHashMapReturnValues().put("work_phone",((javax.xml.ws.Holder)h_work_phone).value);
        getHashMapReturnValues().put("work_phone_extension",((javax.xml.ws.Holder)h_work_phone_extension).value);
        getHashMapReturnValues().put("work_phone_npa",((javax.xml.ws.Holder)h_work_phone_npa).value);
        getHashMapReturnValues().put("work_phone_nxx",((javax.xml.ws.Holder)h_work_phone_nxx).value);
        getHashMapReturnValues().put("work_phone_suffix",((javax.xml.ws.Holder)h_work_phone_suffix).value);
        getHashMapReturnValues().put("bill_day",((javax.xml.ws.Holder)h_bill_day).value);
        getHashMapReturnValues().put("created",((javax.xml.ws.Holder)h_created).value);
        getHashMapReturnValues().put("date_to_expire",((javax.xml.ws.Holder)h_date_to_expire).value);
        getHashMapReturnValues().put("date_to_suspend",((javax.xml.ws.Holder)h_date_to_suspend).value);
        getHashMapReturnValues().put("last_arrears_bill_thru_date",((javax.xml.ws.Holder)h_last_arrears_bill_thru_date).value);
        getHashMapReturnValues().put("last_bill_date",((javax.xml.ws.Holder)h_last_bill_date).value);
        getHashMapReturnValues().put("last_bill_thru_date",((javax.xml.ws.Holder)h_last_bill_thru_date).value);
        getHashMapReturnValues().put("next_bill_date",((javax.xml.ws.Holder)h_next_bill_date).value);
        getHashMapReturnValues().put("plan_date",((javax.xml.ws.Holder)h_plan_date).value);
        getHashMapReturnValues().put("status_date",((javax.xml.ws.Holder)h_status_date).value);
        getHashMapReturnValues().put("status_degrade_date",((javax.xml.ws.Holder)h_status_degrade_date).value);
        getHashMapReturnValues().put("status_cd",((javax.xml.ws.Holder)h_status_cd).value);
        getHashMapReturnValues().put("status_label",((javax.xml.ws.Holder)h_status_label).value);
        getHashMapReturnValues().put("plan_no",((javax.xml.ws.Holder)h_plan_no).value);
        getHashMapReturnValues().put("plan_name",((javax.xml.ws.Holder)h_plan_name).value);
        getHashMapReturnValues().put("plan_units",((javax.xml.ws.Holder)h_plan_units).value);
        getHashMapReturnValues().put("notify_method",((javax.xml.ws.Holder)h_notify_method).value);
        getHashMapReturnValues().put("notify_method_name",((javax.xml.ws.Holder)h_notify_method_name).value);
        getHashMapReturnValues().put("PASSWORD",((javax.xml.ws.Holder)h_PASSWORD).value);
        getHashMapReturnValues().put("pin",((javax.xml.ws.Holder)h_pin).value);
        getHashMapReturnValues().put("secret_question",((javax.xml.ws.Holder)h_secret_question).value);
        getHashMapReturnValues().put("secret_question_answer",((javax.xml.ws.Holder)h_secret_question_answer).value);
        getHashMapReturnValues().put("pay_method",((javax.xml.ws.Holder)h_pay_method).value);
        getHashMapReturnValues().put("pay_method_name",((javax.xml.ws.Holder)h_pay_method_name).value);
        getHashMapReturnValues().put("currency_cd",((javax.xml.ws.Holder)h_currency_cd).value);
        getHashMapReturnValues().put("tax_id",((javax.xml.ws.Holder)h_tax_id).value);
        getHashMapReturnValues().put("billing_email",((javax.xml.ws.Holder)h_billing_email).value);
        getHashMapReturnValues().put("billing_first_name",((javax.xml.ws.Holder)h_billing_first_name).value);
        getHashMapReturnValues().put("billing_middle_initial",((javax.xml.ws.Holder)h_billing_middle_initial).value);
        getHashMapReturnValues().put("billing_last_name",((javax.xml.ws.Holder)h_billing_last_name).value);
        getHashMapReturnValues().put("billing_address1",((javax.xml.ws.Holder)h_billing_address1).value);
        getHashMapReturnValues().put("billing_address2",((javax.xml.ws.Holder)h_billing_address2).value);
        getHashMapReturnValues().put("billing_city",((javax.xml.ws.Holder)h_billing_city).value);
        getHashMapReturnValues().put("billing_state",((javax.xml.ws.Holder)h_billing_state).value);
        getHashMapReturnValues().put("billing_locality",((javax.xml.ws.Holder)h_billing_locality).value);
        getHashMapReturnValues().put("billing_zip",((javax.xml.ws.Holder)h_billing_zip).value);
        getHashMapReturnValues().put("billing_country",((javax.xml.ws.Holder)h_billing_country).value);
        getHashMapReturnValues().put("cc_suffix",((javax.xml.ws.Holder)h_cc_suffix).value);
        getHashMapReturnValues().put("cc_expire_mm",((javax.xml.ws.Holder)h_cc_expire_mm).value);
        getHashMapReturnValues().put("cc_expire_yyyy",((javax.xml.ws.Holder)h_cc_expire_yyyy).value);
        getHashMapReturnValues().put("cc_id",((javax.xml.ws.Holder)h_cc_id).value);
        getHashMapReturnValues().put("bank_acct_suffix",((javax.xml.ws.Holder)h_bank_acct_suffix).value);
        getHashMapReturnValues().put("bank_routing_no",((javax.xml.ws.Holder)h_bank_routing_no).value);
        getHashMapReturnValues().put("billing_cell_phone",((javax.xml.ws.Holder)h_billing_cell_phone).value);
        getHashMapReturnValues().put("billing_cell_phone_npa",((javax.xml.ws.Holder)h_billing_cell_phone_npa).value);
        getHashMapReturnValues().put("billing_cell_phone_nxx",((javax.xml.ws.Holder)h_billing_cell_phone_nxx).value);
        getHashMapReturnValues().put("billing_cell_phone_suffix",((javax.xml.ws.Holder)h_billing_cell_phone_suffix).value);
        getHashMapReturnValues().put("billing_company_name",((javax.xml.ws.Holder)h_billing_company_name).value);
        getHashMapReturnValues().put("billing_intl_phone",((javax.xml.ws.Holder)h_billing_intl_phone).value);
        getHashMapReturnValues().put("billing_phone_extension",((javax.xml.ws.Holder)h_billing_phone_extension).value);
        getHashMapReturnValues().put("billing_phone_npa",((javax.xml.ws.Holder)h_billing_phone_npa).value);
        getHashMapReturnValues().put("billing_phone_nxx",((javax.xml.ws.Holder)h_billing_phone_nxx).value);
        getHashMapReturnValues().put("billing_phone_suffix",((javax.xml.ws.Holder)h_billing_phone_suffix).value);
        getHashMapReturnValues().put("billing_work_phone",((javax.xml.ws.Holder)h_billing_work_phone).value);
        getHashMapReturnValues().put("billing_work_phone_extension",((javax.xml.ws.Holder)h_billing_work_phone_extension).value);
        getHashMapReturnValues().put("billing_work_phone_npa",((javax.xml.ws.Holder)h_billing_work_phone_npa).value);
        getHashMapReturnValues().put("billing_work_phone_nxx",((javax.xml.ws.Holder)h_billing_work_phone_nxx).value);
        getHashMapReturnValues().put("billing_work_phone_suffix",((javax.xml.ws.Holder)h_billing_work_phone_suffix).value);
        getHashMapReturnValues().put("balance",((javax.xml.ws.Holder)h_balance).value);
        getHashMapReturnValues().put("acct_create_client_receipt_id",((javax.xml.ws.Holder)h_acct_create_client_receipt_id).value);
        getHashMapReturnValues().put("plan_client_receipt_id",((javax.xml.ws.Holder)h_plan_client_receipt_id).value);
        getHashMapReturnValues().put("status_client_receipt_id",((javax.xml.ws.Holder)h_status_client_receipt_id).value);
        getHashMapReturnValues().put("taxpayer_id",((javax.xml.ws.Holder)h_taxpayer_id).value);
        getHashMapReturnValues().put("alt_msg_template_no",((javax.xml.ws.Holder)h_alt_msg_template_no).value);
        getHashMapReturnValues().put("seq_func_group_no",((javax.xml.ws.Holder)h_seq_func_group_no).value);
        getHashMapReturnValues().put("promo_cd",((javax.xml.ws.Holder)h_promo_cd).value);
        getHashMapReturnValues().put("address3",((javax.xml.ws.Holder)h_address3).value);
        getHashMapReturnValues().put("billing_address3",((javax.xml.ws.Holder)h_billing_address3).value);
        getHashMapReturnValues().put("address_verification_code",((javax.xml.ws.Holder)h_address_verification_code).value);
        getHashMapReturnValues().put("address_match_score",((javax.xml.ws.Holder)h_address_match_score).value);
        getHashMapReturnValues().put("billing_address_verification_code",((javax.xml.ws.Holder)h_billing_address_verification_code).value);
        getHashMapReturnValues().put("billing_address_match_score",((javax.xml.ws.Holder)h_billing_address_match_score).value);
        getHashMapReturnValues().put("client_plan_id",((javax.xml.ws.Holder)h_client_plan_id).value);
        getHashMapReturnValues().put("client_alt_msg_template_id",((javax.xml.ws.Holder)h_client_alt_msg_template_id).value);
        getHashMapReturnValues().put("bkup_pay_method",((javax.xml.ws.Holder)h_bkup_pay_method).value);
        getHashMapReturnValues().put("bkup_billing_email",((javax.xml.ws.Holder)h_bkup_billing_email).value);
        getHashMapReturnValues().put("bkup_billing_first_name",((javax.xml.ws.Holder)h_bkup_billing_first_name).value);
        getHashMapReturnValues().put("bkup_billing_middle_initial",((javax.xml.ws.Holder)h_bkup_billing_middle_initial).value);
        getHashMapReturnValues().put("bkup_billing_last_name",((javax.xml.ws.Holder)h_bkup_billing_last_name).value);
        getHashMapReturnValues().put("bkup_billing_address1",((javax.xml.ws.Holder)h_bkup_billing_address1).value);
        getHashMapReturnValues().put("bkup_billing_address2",((javax.xml.ws.Holder)h_bkup_billing_address2).value);
        getHashMapReturnValues().put("bkup_billing_city",((javax.xml.ws.Holder)h_bkup_billing_city).value);
        getHashMapReturnValues().put("bkup_billing_state",((javax.xml.ws.Holder)h_bkup_billing_state).value);
        getHashMapReturnValues().put("bkup_billing_locality",((javax.xml.ws.Holder)h_bkup_billing_locality).value);
        getHashMapReturnValues().put("bkup_billing_zip",((javax.xml.ws.Holder)h_bkup_billing_zip).value);
        getHashMapReturnValues().put("bkup_billing_country",((javax.xml.ws.Holder)h_bkup_billing_country).value);
        getHashMapReturnValues().put("bkup_cc_suffix",((javax.xml.ws.Holder)h_bkup_cc_suffix).value);
        getHashMapReturnValues().put("bkup_cc_expire_mm",((javax.xml.ws.Holder)h_bkup_cc_expire_mm).value);
        getHashMapReturnValues().put("bkup_cc_expire_yyyy",((javax.xml.ws.Holder)h_bkup_cc_expire_yyyy).value);
        getHashMapReturnValues().put("bkup_cc_id",((javax.xml.ws.Holder)h_bkup_cc_id).value);
        getHashMapReturnValues().put("bkup_bank_acct_suffix",((javax.xml.ws.Holder)h_bkup_bank_acct_suffix).value);
        getHashMapReturnValues().put("bkup_bank_routing_no",((javax.xml.ws.Holder)h_bkup_bank_routing_no).value);
        getHashMapReturnValues().put("bkup_billing_cell_phone",((javax.xml.ws.Holder)h_bkup_billing_cell_phone).value);
        getHashMapReturnValues().put("bkup_billing_cell_phone_npa",((javax.xml.ws.Holder)h_bkup_billing_cell_phone_npa).value);
        getHashMapReturnValues().put("bkup_billing_cell_phone_nxx",((javax.xml.ws.Holder)h_bkup_billing_cell_phone_nxx).value);
        getHashMapReturnValues().put("bkup_billing_cell_phone_suffix",((javax.xml.ws.Holder)h_bkup_billing_cell_phone_suffix).value);
        getHashMapReturnValues().put("bkup_billing_company_name",((javax.xml.ws.Holder)h_bkup_billing_company_name).value);
        getHashMapReturnValues().put("bkup_billing_intl_phone",((javax.xml.ws.Holder)h_bkup_billing_intl_phone).value);
        getHashMapReturnValues().put("bkup_billing_phone_extension",((javax.xml.ws.Holder)h_bkup_billing_phone_extension).value);
        getHashMapReturnValues().put("bkup_billing_work_phone",((javax.xml.ws.Holder)h_bkup_billing_work_phone).value);
        getHashMapReturnValues().put("bkup_billing_work_phone_extension",((javax.xml.ws.Holder)h_bkup_billing_work_phone_extension).value);
        getHashMapReturnValues().put("bkup_billing_work_phone_npa",((javax.xml.ws.Holder)h_bkup_billing_work_phone_npa).value);
        getHashMapReturnValues().put("bkup_billing_work_phone_nxx",((javax.xml.ws.Holder)h_bkup_billing_work_phone_nxx).value);
        getHashMapReturnValues().put("bkup_billing_work_phone_suffix",((javax.xml.ws.Holder)h_bkup_billing_work_phone_suffix).value);
        getHashMapReturnValues().put("stmnt_email_list",((javax.xml.ws.Holder)h_stmnt_email_list).value);
        getHashMapReturnValues().put("invoice_approval_required",((javax.xml.ws.Holder)h_invoice_approval_required).value);
        getHashMapReturnValues().put("stmnt_email_list_cc",((javax.xml.ws.Holder)h_stmnt_email_list_cc).value);
        getHashMapReturnValues().put("stmnt_email_list_bcc",((javax.xml.ws.Holder)h_stmnt_email_list_bcc).value);
        getHashMapReturnValues().put("invoice_posting_method_cd",((javax.xml.ws.Holder)h_invoice_posting_method_cd).value);
        getHashMapReturnValues().put("acct_start_date",((javax.xml.ws.Holder)h_acct_start_date).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctDetailsAll(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAcctDetailsAll(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getChildAccts(Long client_no, String auth_key, Long parent_acct_no, String do_multi_level){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_child_accts = new javax.xml.ws.Holder();

        
        getCompletePort().getChildAccts(client_no, auth_key, parent_acct_no, do_multi_level, h_error_code, h_error_msg, h_child_accts);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("child_accts",((javax.xml.ws.Holder)h_child_accts).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getChildAccts(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long parent_acct_no = (Long) map.get("parent_acct_no");
                String do_multi_level = (String) map.get("do_multi_level");
                
        return getChildAccts(client_no, auth_key, parent_acct_no, do_multi_level);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getFamilyTransHistory(Long client_no, String auth_key, Long parent_acct_no, String do_multi_level, Long trans_type, String start_date, String end_date, Long record_limit, String include_void_transactions){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_fam_trans = new javax.xml.ws.Holder();

        
        getCompletePort().getFamilyTransHistory(client_no, auth_key, parent_acct_no, do_multi_level, trans_type, start_date, end_date, record_limit, include_void_transactions, h_error_code, h_error_msg, h_fam_trans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("fam_trans",((javax.xml.ws.Holder)h_fam_trans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getFamilyTransHistory(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long parent_acct_no = (Long) map.get("parent_acct_no");
                String do_multi_level = (String) map.get("do_multi_level");
                Long trans_type = (Long) map.get("trans_type");
                String start_date = (String) map.get("start_date");
                String end_date = (String) map.get("end_date");
                Long record_limit = (Long) map.get("record_limit");
                String include_void_transactions = (String) map.get("include_void_transactions");
                
        return getFamilyTransHistory(client_no, auth_key, parent_acct_no, do_multi_level, trans_type, start_date, end_date, record_limit, include_void_transactions);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateExistingBillingInfo(Long client_no, String auth_key, Long acct_no, Long seq_no, String address1, String address2, String city, String state, String zip, String country, Long cc_expire_mm, Long cc_expire_yyyy, Long phone_npa, Long phone_nxx, String phone_suffix, String phone_ext, String phone_country_cd, String intl_phone, String email, String locality, Long cell_phone_npa, Long cell_phone_nxx, String cell_phone_suffix, Long work_phone_npa, Long work_phone_nxx, String work_phone_suffix, String work_phone_ext, String do_collect, String change_status_after_coll, String reset_dates_after_status, String address3, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        
        getCompletePort().updateExistingBillingInfo(client_no, auth_key, acct_no, seq_no, address1, address2, city, state, zip, country, cc_expire_mm, cc_expire_yyyy, phone_npa, phone_nxx, phone_suffix, phone_ext, phone_country_cd, intl_phone, email, locality, cell_phone_npa, cell_phone_nxx, cell_phone_suffix, work_phone_npa, work_phone_nxx, work_phone_suffix, work_phone_ext, do_collect, change_status_after_coll, reset_dates_after_status, address3, client_receipt_id, h_error_code, h_error_msg, h_collection_error_code, h_collection_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateExistingBillingInfo(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long seq_no = (Long) map.get("seq_no");
                String address1 = (String) map.get("address1");
                String address2 = (String) map.get("address2");
                String city = (String) map.get("city");
                String state = (String) map.get("state");
                String zip = (String) map.get("zip");
                String country = (String) map.get("country");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                Long phone_npa = (Long) map.get("phone_npa");
                Long phone_nxx = (Long) map.get("phone_nxx");
                String phone_suffix = (String) map.get("phone_suffix");
                String phone_ext = (String) map.get("phone_ext");
                String phone_country_cd = (String) map.get("phone_country_cd");
                String intl_phone = (String) map.get("intl_phone");
                String email = (String) map.get("email");
                String locality = (String) map.get("locality");
                Long cell_phone_npa = (Long) map.get("cell_phone_npa");
                Long cell_phone_nxx = (Long) map.get("cell_phone_nxx");
                String cell_phone_suffix = (String) map.get("cell_phone_suffix");
                Long work_phone_npa = (Long) map.get("work_phone_npa");
                Long work_phone_nxx = (Long) map.get("work_phone_nxx");
                String work_phone_suffix = (String) map.get("work_phone_suffix");
                String work_phone_ext = (String) map.get("work_phone_ext");
                String do_collect = (String) map.get("do_collect");
                String change_status_after_coll = (String) map.get("change_status_after_coll");
                String reset_dates_after_status = (String) map.get("reset_dates_after_status");
                String address3 = (String) map.get("address3");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return updateExistingBillingInfo(client_no, auth_key, acct_no, seq_no, address1, address2, city, state, zip, country, cc_expire_mm, cc_expire_yyyy, phone_npa, phone_nxx, phone_suffix, phone_ext, phone_country_cd, intl_phone, email, locality, cell_phone_npa, cell_phone_nxx, cell_phone_suffix, work_phone_npa, work_phone_nxx, work_phone_suffix, work_phone_ext, do_collect, change_status_after_coll, reset_dates_after_status, address3, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> sendAcctEmail(Long client_no, String auth_key, String user_id, String template_class, Long template_no, String client_receipt_id, String client_template_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().sendAcctEmail(client_no, auth_key, user_id, template_class, template_no, client_receipt_id, client_template_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> sendAcctEmail(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String user_id = (String) map.get("user_id");
                String template_class = (String) map.get("template_class");
                Long template_no = (Long) map.get("template_no");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String client_template_id = (String) map.get("client_template_id");
                
        return sendAcctEmail(client_no, auth_key, user_id, template_class, template_no, client_receipt_id, client_template_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> useridExists(Long client_no, String auth_key, String user_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().useridExists(client_no, auth_key, user_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> useridExists(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String user_id = (String) map.get("user_id");
                
        return useridExists(client_no, auth_key, user_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> useridIsAvailable(Long client_no, String auth_key, String user_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().useridIsAvailable(client_no, auth_key, user_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> useridIsAvailable(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String user_id = (String) map.get("user_id");
                
        return useridIsAvailable(client_no, auth_key, user_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getStandingUsage(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_su = new javax.xml.ws.Holder();

        
        getCompletePort().getStandingUsage(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_su);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("su",((javax.xml.ws.Holder)h_su).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getStandingUsage(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getStandingUsage(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> recordStandingUsage(Long client_no, String auth_key, Long acct_no, Long usage_type, String usage_type_code, Double usage_units, String next_usage_date, String alt_desc, Long plan_no, String first_usage_date, String recurring_ind, String client_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().recordStandingUsage(client_no, auth_key, acct_no, usage_type, usage_type_code, usage_units, next_usage_date, alt_desc, plan_no, first_usage_date, recurring_ind, client_plan_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> recordStandingUsage(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long usage_type = (Long) map.get("usage_type");
                String usage_type_code = (String) map.get("usage_type_code");
                Double usage_units = (Double) map.get("usage_units");
                String next_usage_date = (String) map.get("next_usage_date");
                String alt_desc = (String) map.get("alt_desc");
                Long plan_no = (Long) map.get("plan_no");
                String first_usage_date = (String) map.get("first_usage_date");
                String recurring_ind = (String) map.get("recurring_ind");
                String client_plan_id = (String) map.get("client_plan_id");
                
        return recordStandingUsage(client_no, auth_key, acct_no, usage_type, usage_type_code, usage_units, next_usage_date, alt_desc, plan_no, first_usage_date, recurring_ind, client_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> disableStandingUsage(Long client_no, String auth_key, Long acct_no, Long standing_usage_rec_no, String comments){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().disableStandingUsage(client_no, auth_key, acct_no, standing_usage_rec_no, comments, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> disableStandingUsage(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long standing_usage_rec_no = (Long) map.get("standing_usage_rec_no");
                String comments = (String) map.get("comments");
                
        return disableStandingUsage(client_no, auth_key, acct_no, standing_usage_rec_no, comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> disableStandingUsageByPlan(Long client_no, String auth_key, Long acct_no, Long plan_no, String comments, String client_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().disableStandingUsageByPlan(client_no, auth_key, acct_no, plan_no, comments, client_plan_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> disableStandingUsageByPlan(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long plan_no = (Long) map.get("plan_no");
                String comments = (String) map.get("comments");
                String client_plan_id = (String) map.get("client_plan_id");
                
        return disableStandingUsageByPlan(client_no, auth_key, acct_no, plan_no, comments, client_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> disableAllStandingUsage(Long client_no, String auth_key, Long acct_no, String comments){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().disableAllStandingUsage(client_no, auth_key, acct_no, comments, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> disableAllStandingUsage(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String comments = (String) map.get("comments");
                
        return disableAllStandingUsage(client_no, auth_key, acct_no, comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPlans(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_plans = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPlans(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_acct_plans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_plans",((javax.xml.ws.Holder)h_acct_plans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPlans(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAcctPlans(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPlansAll(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_acct_plans = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPlansAll(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_all_acct_plans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_acct_plans",((javax.xml.ws.Holder)h_all_acct_plans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPlansAll(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAcctPlansAll(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctSuppFields(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_fields = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctSuppFields(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_supp_fields);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("supp_fields",((javax.xml.ws.Holder)h_supp_fields).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctSuppFields(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAcctSuppFields(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getSuppFieldValues(Long client_no, String auth_key, Long acct_no, String field_name){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_field_values = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_supp_field_values = new javax.xml.ws.Holder();

        
        getCompletePort().getSuppFieldValues(client_no, auth_key, acct_no, field_name, h_error_code, h_error_msg, h_supp_field_values, h_acct_supp_field_values);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("supp_field_values",((javax.xml.ws.Holder)h_supp_field_values).value);
        getHashMapReturnValues().put("acct_supp_field_values",((javax.xml.ws.Holder)h_acct_supp_field_values).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getSuppFieldValues(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String field_name = (String) map.get("field_name");
                
        return getSuppFieldValues(client_no, auth_key, acct_no, field_name);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getSuppPlansByPromoCode(Long client_no, String auth_key, String promo_code){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plans = new javax.xml.ws.Holder();

        
        getCompletePort().getSuppPlansByPromoCode(client_no, auth_key, promo_code, h_error_code, h_error_msg, h_plans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("plans",((javax.xml.ws.Holder)h_plans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getSuppPlansByPromoCode(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String promo_code = (String) map.get("promo_code");
                
        return getSuppPlansByPromoCode(client_no, auth_key, promo_code);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getSuppPlansByPromoCodeAll(Long client_no, String auth_key, String promo_code){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_plans = new javax.xml.ws.Holder();

        
        getCompletePort().getSuppPlansByPromoCodeAll(client_no, auth_key, promo_code, h_error_code, h_error_msg, h_all_plans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_plans",((javax.xml.ws.Holder)h_all_plans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getSuppPlansByPromoCodeAll(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String promo_code = (String) map.get("promo_code");
                
        return getSuppPlansByPromoCodeAll(client_no, auth_key, promo_code);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> assignSuppPlan(Long client_no, String auth_key, Long acct_no, Long supp_plan_no, String client_supp_plan_id, Long alt_rate_schedule_no, Long num_plan_units, String coupon_code, Long assignment_directive, String comments, String do_write, String client_receipt_id, Long contract_type_no, Double contract_alt_recur_fee, Long contract_length_months, Double contract_cancel_fee, String contract_comments, String contract_start_date, Long offset_months, Long auto_offset_months_option, String alt_proration_start_date, String alt_client_acct_group_id, com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates, String effective_date, Long offset_interval, String contract_end_date, Long sync_mstr_bill_dates_override, String client_alt_rate_schedule_id, com.aria.common.shared.SurchargeNoArray surcharge_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_plan_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_activation_fee = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_mthly_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_annu_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().assignSuppPlan(client_no, auth_key, acct_no, supp_plan_no, client_supp_plan_id, alt_rate_schedule_no, num_plan_units, coupon_code, assignment_directive, comments, do_write, client_receipt_id, contract_type_no, contract_alt_recur_fee, contract_length_months, contract_cancel_fee, contract_comments, contract_start_date, offset_months, auto_offset_months_option, alt_proration_start_date, alt_client_acct_group_id, new_acct_custom_rates, effective_date, offset_interval, contract_end_date, sync_mstr_bill_dates_override, client_alt_rate_schedule_id, surcharge_no, h_error_code, h_error_msg, h_proration_result_amount, h_invoice_no, h_supp_plan_line_items, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_total_tax_credit, h_total_credit_before_tax, h_total, h_expectd_activation_fee, h_expectd_mthly_recurring_cost, h_expectd_annu_recurring_cost, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proration_result_amount",((javax.xml.ws.Holder)h_proration_result_amount).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("supp_plan_line_items",((javax.xml.ws.Holder)h_supp_plan_line_items).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("total_tax_credit",((javax.xml.ws.Holder)h_total_tax_credit).value);
        getHashMapReturnValues().put("total_credit_before_tax",((javax.xml.ws.Holder)h_total_credit_before_tax).value);
        getHashMapReturnValues().put("total",((javax.xml.ws.Holder)h_total).value);
        getHashMapReturnValues().put("expectd_activation_fee",((javax.xml.ws.Holder)h_expectd_activation_fee).value);
        getHashMapReturnValues().put("expectd_mthly_recurring_cost",((javax.xml.ws.Holder)h_expectd_mthly_recurring_cost).value);
        getHashMapReturnValues().put("expectd_annu_recurring_cost",((javax.xml.ws.Holder)h_expectd_annu_recurring_cost).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> assignSuppPlan(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long supp_plan_no = (Long) map.get("supp_plan_no");
                String client_supp_plan_id = (String) map.get("client_supp_plan_id");
                Long alt_rate_schedule_no = (Long) map.get("alt_rate_schedule_no");
                Long num_plan_units = (Long) map.get("num_plan_units");
                String coupon_code = (String) map.get("coupon_code");
                Long assignment_directive = (Long) map.get("assignment_directive");
                String comments = (String) map.get("comments");
                String do_write = (String) map.get("do_write");
                String client_receipt_id = (String) map.get("client_receipt_id");
                Long contract_type_no = (Long) map.get("contract_type_no");
                Double contract_alt_recur_fee = (Double) map.get("contract_alt_recur_fee");
                Long contract_length_months = (Long) map.get("contract_length_months");
                Double contract_cancel_fee = (Double) map.get("contract_cancel_fee");
                String contract_comments = (String) map.get("contract_comments");
                String contract_start_date = (String) map.get("contract_start_date");
                Long offset_months = (Long) map.get("offset_months");
                Long auto_offset_months_option = (Long) map.get("auto_offset_months_option");
                String alt_proration_start_date = (String) map.get("alt_proration_start_date");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates = (com.aria.common.shared.NewAcctCustomRatesArray) map.get("new_acct_custom_rates");
                String effective_date = (String) map.get("effective_date");
                Long offset_interval = (Long) map.get("offset_interval");
                String contract_end_date = (String) map.get("contract_end_date");
                Long sync_mstr_bill_dates_override = (Long) map.get("sync_mstr_bill_dates_override");
                String client_alt_rate_schedule_id = (String) map.get("client_alt_rate_schedule_id");
                com.aria.common.shared.SurchargeNoArray surcharge_no = (com.aria.common.shared.SurchargeNoArray) map.get("surcharge_no");
                
        return assignSuppPlan(client_no, auth_key, acct_no, supp_plan_no, client_supp_plan_id, alt_rate_schedule_no, num_plan_units, coupon_code, assignment_directive, comments, do_write, client_receipt_id, contract_type_no, contract_alt_recur_fee, contract_length_months, contract_cancel_fee, contract_comments, contract_start_date, offset_months, auto_offset_months_option, alt_proration_start_date, alt_client_acct_group_id, new_acct_custom_rates, effective_date, offset_interval, contract_end_date, sync_mstr_bill_dates_override, client_alt_rate_schedule_id, surcharge_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelSuppPlan(Long client_no, String auth_key, Long acct_no, Long supp_plan_no, Long assignment_directive, String comments, String do_write, String client_receipt_id, String alt_proration_start_date, String effective_date, Long offset_interval, String invoice_unbilled_usage, String client_supp_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_plan_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_tax_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_service_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_plan_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().cancelSuppPlan(client_no, auth_key, acct_no, supp_plan_no, assignment_directive, comments, do_write, client_receipt_id, alt_proration_start_date, effective_date, offset_interval, invoice_unbilled_usage, client_supp_plan_id, h_error_code, h_error_msg, h_proration_result_amount, h_invoice_no, h_supp_plan_line_items, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_total_tax_credit, h_total_credit_before_tax, h_total, h_proration_credit_result_amount, h_proration_credit_amount, h_proration_tax_amount, h_client_service_id, h_client_plan_id, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proration_result_amount",((javax.xml.ws.Holder)h_proration_result_amount).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("supp_plan_line_items",((javax.xml.ws.Holder)h_supp_plan_line_items).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("total_tax_credit",((javax.xml.ws.Holder)h_total_tax_credit).value);
        getHashMapReturnValues().put("total_credit_before_tax",((javax.xml.ws.Holder)h_total_credit_before_tax).value);
        getHashMapReturnValues().put("total",((javax.xml.ws.Holder)h_total).value);
        getHashMapReturnValues().put("proration_credit_result_amount",((javax.xml.ws.Holder)h_proration_credit_result_amount).value);
        getHashMapReturnValues().put("proration_credit_amount",((javax.xml.ws.Holder)h_proration_credit_amount).value);
        getHashMapReturnValues().put("proration_tax_amount",((javax.xml.ws.Holder)h_proration_tax_amount).value);
        getHashMapReturnValues().put("client_service_id",((javax.xml.ws.Holder)h_client_service_id).value);
        getHashMapReturnValues().put("client_plan_id",((javax.xml.ws.Holder)h_client_plan_id).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelSuppPlan(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long supp_plan_no = (Long) map.get("supp_plan_no");
                Long assignment_directive = (Long) map.get("assignment_directive");
                String comments = (String) map.get("comments");
                String do_write = (String) map.get("do_write");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String alt_proration_start_date = (String) map.get("alt_proration_start_date");
                String effective_date = (String) map.get("effective_date");
                Long offset_interval = (Long) map.get("offset_interval");
                String invoice_unbilled_usage = (String) map.get("invoice_unbilled_usage");
                String client_supp_plan_id = (String) map.get("client_supp_plan_id");
                
        return cancelSuppPlan(client_no, auth_key, acct_no, supp_plan_no, assignment_directive, comments, do_write, client_receipt_id, alt_proration_start_date, effective_date, offset_interval, invoice_unbilled_usage, client_supp_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> modifySuppPlan(Long client_no, String auth_key, Long acct_no, Long supp_plan_no, Long alt_rate_schedule_no, Long num_plan_units, String coupon_code, Long assignment_directive, String comments, String do_write, String client_receipt_id, com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates, String effective_date, Long offset_interval, String client_plan_id, String client_alt_rate_schedule_id, com.aria.common.shared.SurchargeNoArray surcharge_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_plan_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_tax_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_activation_fee = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_mthly_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_annu_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().modifySuppPlan(client_no, auth_key, acct_no, supp_plan_no, alt_rate_schedule_no, num_plan_units, coupon_code, assignment_directive, comments, do_write, client_receipt_id, new_acct_custom_rates, effective_date, offset_interval, client_plan_id, client_alt_rate_schedule_id, surcharge_no, h_error_code, h_error_msg, h_proration_result_amount, h_invoice_no, h_supp_plan_line_items, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_total_tax_credit, h_total_credit_before_tax, h_total, h_proration_credit_result_amount, h_proration_credit_amount, h_proration_tax_amount, h_expectd_activation_fee, h_expectd_mthly_recurring_cost, h_expectd_annu_recurring_cost, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proration_result_amount",((javax.xml.ws.Holder)h_proration_result_amount).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("supp_plan_line_items",((javax.xml.ws.Holder)h_supp_plan_line_items).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("total_tax_credit",((javax.xml.ws.Holder)h_total_tax_credit).value);
        getHashMapReturnValues().put("total_credit_before_tax",((javax.xml.ws.Holder)h_total_credit_before_tax).value);
        getHashMapReturnValues().put("total",((javax.xml.ws.Holder)h_total).value);
        getHashMapReturnValues().put("proration_credit_result_amount",((javax.xml.ws.Holder)h_proration_credit_result_amount).value);
        getHashMapReturnValues().put("proration_credit_amount",((javax.xml.ws.Holder)h_proration_credit_amount).value);
        getHashMapReturnValues().put("proration_tax_amount",((javax.xml.ws.Holder)h_proration_tax_amount).value);
        getHashMapReturnValues().put("expectd_activation_fee",((javax.xml.ws.Holder)h_expectd_activation_fee).value);
        getHashMapReturnValues().put("expectd_mthly_recurring_cost",((javax.xml.ws.Holder)h_expectd_mthly_recurring_cost).value);
        getHashMapReturnValues().put("expectd_annu_recurring_cost",((javax.xml.ws.Holder)h_expectd_annu_recurring_cost).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> modifySuppPlan(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long supp_plan_no = (Long) map.get("supp_plan_no");
                Long alt_rate_schedule_no = (Long) map.get("alt_rate_schedule_no");
                Long num_plan_units = (Long) map.get("num_plan_units");
                String coupon_code = (String) map.get("coupon_code");
                Long assignment_directive = (Long) map.get("assignment_directive");
                String comments = (String) map.get("comments");
                String do_write = (String) map.get("do_write");
                String client_receipt_id = (String) map.get("client_receipt_id");
                com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates = (com.aria.common.shared.NewAcctCustomRatesArray) map.get("new_acct_custom_rates");
                String effective_date = (String) map.get("effective_date");
                Long offset_interval = (Long) map.get("offset_interval");
                String client_plan_id = (String) map.get("client_plan_id");
                String client_alt_rate_schedule_id = (String) map.get("client_alt_rate_schedule_id");
                com.aria.common.shared.SurchargeNoArray surcharge_no = (com.aria.common.shared.SurchargeNoArray) map.get("surcharge_no");
                
        return modifySuppPlan(client_no, auth_key, acct_no, supp_plan_no, alt_rate_schedule_no, num_plan_units, coupon_code, assignment_directive, comments, do_write, client_receipt_id, new_acct_custom_rates, effective_date, offset_interval, client_plan_id, client_alt_rate_schedule_id, surcharge_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> replaceSuppPlan(Long client_no, String auth_key, Long acct_no, Long existing_supp_plan_no, Long new_supp_plan_no, Long alt_rate_schedule_no, Long num_plan_units, String coupon_code, Long assignment_directive, String comments, String do_write, String client_receipt_id, Long offset_months, Long auto_offset_months_option, String alt_client_acct_group_id, com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates, String effective_date, Long offset_interval, String invoice_unbilled_usage, Long sync_mstr_bill_dates_override, String client_existing_supp_plan_id, String client_new_supp_plan_id, String client_alt_rate_schedule_id, com.aria.common.shared.SurchargeNoArray surcharge_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_plan_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_tax_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_activation_fee = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_mthly_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_annu_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().replaceSuppPlan(client_no, auth_key, acct_no, existing_supp_plan_no, new_supp_plan_no, alt_rate_schedule_no, num_plan_units, coupon_code, assignment_directive, comments, do_write, client_receipt_id, offset_months, auto_offset_months_option, alt_client_acct_group_id, new_acct_custom_rates, effective_date, offset_interval, invoice_unbilled_usage, sync_mstr_bill_dates_override, client_existing_supp_plan_id, client_new_supp_plan_id, client_alt_rate_schedule_id, surcharge_no, h_error_code, h_error_msg, h_proration_result_amount, h_invoice_no, h_supp_plan_line_items, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_total_tax_credit, h_total_credit_before_tax, h_total, h_proration_credit_result_amount, h_proration_credit_amount, h_proration_tax_amount, h_expectd_activation_fee, h_expectd_mthly_recurring_cost, h_expectd_annu_recurring_cost, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proration_result_amount",((javax.xml.ws.Holder)h_proration_result_amount).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("supp_plan_line_items",((javax.xml.ws.Holder)h_supp_plan_line_items).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("total_tax_credit",((javax.xml.ws.Holder)h_total_tax_credit).value);
        getHashMapReturnValues().put("total_credit_before_tax",((javax.xml.ws.Holder)h_total_credit_before_tax).value);
        getHashMapReturnValues().put("total",((javax.xml.ws.Holder)h_total).value);
        getHashMapReturnValues().put("proration_credit_result_amount",((javax.xml.ws.Holder)h_proration_credit_result_amount).value);
        getHashMapReturnValues().put("proration_credit_amount",((javax.xml.ws.Holder)h_proration_credit_amount).value);
        getHashMapReturnValues().put("proration_tax_amount",((javax.xml.ws.Holder)h_proration_tax_amount).value);
        getHashMapReturnValues().put("expectd_activation_fee",((javax.xml.ws.Holder)h_expectd_activation_fee).value);
        getHashMapReturnValues().put("expectd_mthly_recurring_cost",((javax.xml.ws.Holder)h_expectd_mthly_recurring_cost).value);
        getHashMapReturnValues().put("expectd_annu_recurring_cost",((javax.xml.ws.Holder)h_expectd_annu_recurring_cost).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> replaceSuppPlan(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long existing_supp_plan_no = (Long) map.get("existing_supp_plan_no");
                Long new_supp_plan_no = (Long) map.get("new_supp_plan_no");
                Long alt_rate_schedule_no = (Long) map.get("alt_rate_schedule_no");
                Long num_plan_units = (Long) map.get("num_plan_units");
                String coupon_code = (String) map.get("coupon_code");
                Long assignment_directive = (Long) map.get("assignment_directive");
                String comments = (String) map.get("comments");
                String do_write = (String) map.get("do_write");
                String client_receipt_id = (String) map.get("client_receipt_id");
                Long offset_months = (Long) map.get("offset_months");
                Long auto_offset_months_option = (Long) map.get("auto_offset_months_option");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates = (com.aria.common.shared.NewAcctCustomRatesArray) map.get("new_acct_custom_rates");
                String effective_date = (String) map.get("effective_date");
                Long offset_interval = (Long) map.get("offset_interval");
                String invoice_unbilled_usage = (String) map.get("invoice_unbilled_usage");
                Long sync_mstr_bill_dates_override = (Long) map.get("sync_mstr_bill_dates_override");
                String client_existing_supp_plan_id = (String) map.get("client_existing_supp_plan_id");
                String client_new_supp_plan_id = (String) map.get("client_new_supp_plan_id");
                String client_alt_rate_schedule_id = (String) map.get("client_alt_rate_schedule_id");
                com.aria.common.shared.SurchargeNoArray surcharge_no = (com.aria.common.shared.SurchargeNoArray) map.get("surcharge_no");
                
        return replaceSuppPlan(client_no, auth_key, acct_no, existing_supp_plan_no, new_supp_plan_no, alt_rate_schedule_no, num_plan_units, coupon_code, assignment_directive, comments, do_write, client_receipt_id, offset_months, auto_offset_months_option, alt_client_acct_group_id, new_acct_custom_rates, effective_date, offset_interval, invoice_unbilled_usage, sync_mstr_bill_dates_override, client_existing_supp_plan_id, client_new_supp_plan_id, client_alt_rate_schedule_id, surcharge_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAvailChildPlansForPlan(Long client_no, String auth_key, Long in_plan_no, String in_client_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plans = new javax.xml.ws.Holder();

        
        getCompletePort().getAvailChildPlansForPlan(client_no, auth_key, in_plan_no, in_client_plan_id, h_error_code, h_error_msg, h_plans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("plans",((javax.xml.ws.Holder)h_plans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAvailChildPlansForPlan(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long in_plan_no = (Long) map.get("in_plan_no");
                String in_client_plan_id = (String) map.get("in_client_plan_id");
                
        return getAvailChildPlansForPlan(client_no, auth_key, in_plan_no, in_client_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAvailChildPlansForPlanAll(Long client_no, String auth_key, Long in_plan_no, String in_client_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_plans = new javax.xml.ws.Holder();

        
        getCompletePort().getAvailChildPlansForPlanAll(client_no, auth_key, in_plan_no, in_client_plan_id, h_error_code, h_error_msg, h_all_plans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_plans",((javax.xml.ws.Holder)h_all_plans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAvailChildPlansForPlanAll(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long in_plan_no = (Long) map.get("in_plan_no");
                String in_client_plan_id = (String) map.get("in_client_plan_id");
                
        return getAvailChildPlansForPlanAll(client_no, auth_key, in_plan_no, in_client_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAvailChildPlansForAcct(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plans = new javax.xml.ws.Holder();

        
        getCompletePort().getAvailChildPlansForAcct(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_plans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("plans",((javax.xml.ws.Holder)h_plans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAvailChildPlansForAcct(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAvailChildPlansForAcct(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAvailChildPlansForAcctAll(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_plans = new javax.xml.ws.Holder();

        
        getCompletePort().getAvailChildPlansForAcctAll(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_all_plans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_plans",((javax.xml.ws.Holder)h_all_plans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAvailChildPlansForAcctAll(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAvailChildPlansForAcctAll(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctGroupsByClient(Long client_no, String auth_key){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_groups = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctGroupsByClient(client_no, auth_key, h_error_code, h_error_msg, h_acct_groups);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_groups",((javax.xml.ws.Holder)h_acct_groups).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctGroupsByClient(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getAcctGroupsByClient(client_no, auth_key);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctGroupsByAcct(Long client_no, String auth_key, Long acct_no, String user_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_groups = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctGroupsByAcct(client_no, auth_key, acct_no, user_id, h_error_code, h_error_msg, h_acct_groups);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_groups",((javax.xml.ws.Holder)h_acct_groups).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctGroupsByAcct(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String user_id = (String) map.get("user_id");
                
        return getAcctGroupsByAcct(client_no, auth_key, acct_no, user_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> assignFunctionalAcctGroup(Long client_no, String auth_key, Long acct_no, Long group_no, String client_acct_group_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().assignFunctionalAcctGroup(client_no, auth_key, acct_no, group_no, client_acct_group_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> assignFunctionalAcctGroup(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long group_no = (Long) map.get("group_no");
                String client_acct_group_id = (String) map.get("client_acct_group_id");
                
        return assignFunctionalAcctGroup(client_no, auth_key, acct_no, group_no, client_acct_group_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> assignCollectionsAcctGroup(Long client_no, String auth_key, Long acct_no, Long group_no, String client_acct_group_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().assignCollectionsAcctGroup(client_no, auth_key, acct_no, group_no, client_acct_group_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> assignCollectionsAcctGroup(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long group_no = (Long) map.get("group_no");
                String client_acct_group_id = (String) map.get("client_acct_group_id");
                
        return assignCollectionsAcctGroup(client_no, auth_key, acct_no, group_no, client_acct_group_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> removeAcctFromGroup(Long client_no, String auth_key, Long acct_no, Long group_no, String client_acct_group_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().removeAcctFromGroup(client_no, auth_key, acct_no, group_no, client_acct_group_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> removeAcctFromGroup(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long group_no = (Long) map.get("group_no");
                String client_acct_group_id = (String) map.get("client_acct_group_id");
                
        return removeAcctFromGroup(client_no, auth_key, acct_no, group_no, client_acct_group_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createAcctComplete(Long client_no, String auth_key, Long master_plan_no, String client_master_plan_id, String alt_start_date, String client_acct_id, String userid, Long status_cd, Long master_plan_units, com.aria.common.shared.SuppPlansArray supp_plans, com.aria.common.shared.SuppPlanUnitsArray supp_plan_units, Long notify_method, String promo_cd, String password, String secret_question, String secret_question_answer, String first_name, String mi, String last_name, String company_name, String address1, String address2, String city, String locality, String state_prov, String country, String postal_cd, String phone, String phone_ext, String cell_phone, String work_phone, String work_phone_ext, String email, String birthdate, String bill_first_name, String bill_mi, String bill_last_name, String bill_company_name, String bill_address1, String bill_address2, String bill_city, String bill_locality, String bill_state_prov, String bill_country, String bill_postal_cd, String bill_phone, String bill_phone_ext, String bill_cell_phone, String bill_work_phone, String bill_work_phone_ext, String bill_email, Long pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_acct_no, String bank_routing_no, Long resp_level_cd, Long senior_acct_no, String senior_acct_user_id, String client_senior_acct_id, com.aria.common.shared.FunctionalAcctGroupsArray functional_acct_groups, com.aria.common.shared.CollectionsAcctGroupsArray collections_acct_groups, com.aria.common.shared.SuppFieldNamesArray supp_field_names, com.aria.common.shared.SuppFieldValuesArray supp_field_values, Long test_acct_ind, Long status_until_alt_start, Double balance_forward, Long alt_bill_day, String do_full_invoicing, String do_prorated_invoicing, Long master_plan_alt_rate_sched_no, com.aria.common.shared.SuppPlanAltRateSchedNoArray supp_plan_alt_rate_sched_no, String client_receipt_id, String currency_cd, String cvv, String taxpayer_id, String bill_agreement_id, String retroactive_start_date, com.aria.common.shared.CouponCodesArray coupon_codes, com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates, Long alt_msg_template_no, Long seq_func_group_no, com.aria.common.shared.NewAcctPlanContractsArray new_acct_plan_contracts, String bank_acct_type, String address3, String bill_address3, com.aria.common.shared.UsageAccumulationConfigArray usage_accumulation_config, com.aria.common.shared.EnableUsagePoolingPlanNoArray enable_usage_pooling_plan_no, com.aria.common.shared.ClientFuncAcctGroupIdsArray client_func_acct_group_ids, com.aria.common.shared.ClientCollAcctGroupIdsArray client_coll_acct_group_ids, String track_data1, String track_data2, String do_write, Long tax_exemption_level, Long cn_alt_msg_template_no, String invoice_approval_required, String create_session, com.aria.common.shared.ClientSuppPlanIdsArray client_supp_plan_ids, String client_mp_alt_rate_sched_id, com.aria.common.shared.ClientSpAltRateSchedIdsArray client_sp_alt_rate_sched_ids, String client_alt_msg_template_id, String client_cn_alt_msg_template_no, com.aria.common.shared.SurchargeNoArray surcharge_no, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd, String bkup_bill_first_name, String bkup_bill_mi, String bkup_bill_last_name, String bkup_bill_company_name, String bkup_bill_address1, String bkup_bill_address2, String bkup_bill_address3, String bkup_bill_city, String bkup_bill_locality, String bkup_bill_state_prov, String bkup_bill_country, String bkup_bill_postal_cd, String bkup_bill_phone, String bkup_bill_phone_ext, String bkup_bill_cell_phone, String bkup_bill_work_phone, String bkup_bill_work_phone_ext, String bkup_bill_email, Long bkup_pay_method, String bkup_cc_number, Long bkup_cc_expire_mm, Long bkup_cc_expire_yyyy, String bkup_bank_acct_no, String bkup_bank_routing_no, String bkup_bank_acct_type, String bkup_bill_agreement_id, String bkup_cvv, String seq_func_group_id, Long revrec_profile_id, String revrec_client_defined_id, String stmnt_email_list, String stmnt_email_list_cc, String stmnt_email_list_bcc, Long invoice_posting_method_cd, String acct_start_date){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_userid = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoicing_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoicing_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_new_acct_plan_contracts = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_credit_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_total_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_new_acct_invoice_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_session_id = new javax.xml.ws.Holder();

        
        getCompletePort().createAcctComplete(client_no, auth_key, master_plan_no, client_master_plan_id, alt_start_date, client_acct_id, userid, status_cd, master_plan_units, supp_plans, supp_plan_units, notify_method, promo_cd, password, secret_question, secret_question_answer, first_name, mi, last_name, company_name, address1, address2, city, locality, state_prov, country, postal_cd, phone, phone_ext, cell_phone, work_phone, work_phone_ext, email, birthdate, bill_first_name, bill_mi, bill_last_name, bill_company_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_country, bill_postal_cd, bill_phone, bill_phone_ext, bill_cell_phone, bill_work_phone, bill_work_phone_ext, bill_email, pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_acct_no, bank_routing_no, resp_level_cd, senior_acct_no, senior_acct_user_id, client_senior_acct_id, functional_acct_groups, collections_acct_groups, supp_field_names, supp_field_values, test_acct_ind, status_until_alt_start, balance_forward, alt_bill_day, do_full_invoicing, do_prorated_invoicing, master_plan_alt_rate_sched_no, supp_plan_alt_rate_sched_no, client_receipt_id, currency_cd, cvv, taxpayer_id, bill_agreement_id, retroactive_start_date, coupon_codes, new_acct_custom_rates, alt_msg_template_no, seq_func_group_no, new_acct_plan_contracts, bank_acct_type, address3, bill_address3, usage_accumulation_config, enable_usage_pooling_plan_no, client_func_acct_group_ids, client_coll_acct_group_ids, track_data1, track_data2, do_write, tax_exemption_level, cn_alt_msg_template_no, invoice_approval_required, create_session, client_supp_plan_ids, client_mp_alt_rate_sched_id, client_sp_alt_rate_sched_ids, client_alt_msg_template_id, client_cn_alt_msg_template_no, surcharge_no, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, bkup_bill_first_name, bkup_bill_mi, bkup_bill_last_name, bkup_bill_company_name, bkup_bill_address1, bkup_bill_address2, bkup_bill_address3, bkup_bill_city, bkup_bill_locality, bkup_bill_state_prov, bkup_bill_country, bkup_bill_postal_cd, bkup_bill_phone, bkup_bill_phone_ext, bkup_bill_cell_phone, bkup_bill_work_phone, bkup_bill_work_phone_ext, bkup_bill_email, bkup_pay_method, bkup_cc_number, bkup_cc_expire_mm, bkup_cc_expire_yyyy, bkup_bank_acct_no, bkup_bank_routing_no, bkup_bank_acct_type, bkup_bill_agreement_id, bkup_cvv, seq_func_group_id, revrec_profile_id, revrec_client_defined_id, stmnt_email_list, stmnt_email_list_cc, stmnt_email_list_bcc, invoice_posting_method_cd, acct_start_date, h_error_code, h_error_msg, h_acct_no, h_out_userid, h_invoicing_error_code, h_invoicing_error_msg, h_invoice_no, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_out_new_acct_plan_contracts, h_invoice_charges_before_tax, h_invoice_tax_charges, h_invoice_charges_after_tax, h_invoice_credit_amount, h_invoice_total_amount, h_new_acct_invoice_line_items, h_third_party_errors, h_session_id);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_no",((javax.xml.ws.Holder)h_acct_no).value);
        getHashMapReturnValues().put("out_userid",((javax.xml.ws.Holder)h_out_userid).value);
        getHashMapReturnValues().put("invoicing_error_code",((javax.xml.ws.Holder)h_invoicing_error_code).value);
        getHashMapReturnValues().put("invoicing_error_msg",((javax.xml.ws.Holder)h_invoicing_error_msg).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("out_new_acct_plan_contracts",((javax.xml.ws.Holder)h_out_new_acct_plan_contracts).value);
        getHashMapReturnValues().put("invoice_charges_before_tax",((javax.xml.ws.Holder)h_invoice_charges_before_tax).value);
        getHashMapReturnValues().put("invoice_tax_charges",((javax.xml.ws.Holder)h_invoice_tax_charges).value);
        getHashMapReturnValues().put("invoice_charges_after_tax",((javax.xml.ws.Holder)h_invoice_charges_after_tax).value);
        getHashMapReturnValues().put("invoice_credit_amount",((javax.xml.ws.Holder)h_invoice_credit_amount).value);
        getHashMapReturnValues().put("invoice_total_amount",((javax.xml.ws.Holder)h_invoice_total_amount).value);
        getHashMapReturnValues().put("new_acct_invoice_line_items",((javax.xml.ws.Holder)h_new_acct_invoice_line_items).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        getHashMapReturnValues().put("session_id",((javax.xml.ws.Holder)h_session_id).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createAcctComplete(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long master_plan_no = (Long) map.get("master_plan_no");
                String client_master_plan_id = (String) map.get("client_master_plan_id");
                String alt_start_date = (String) map.get("alt_start_date");
                String client_acct_id = (String) map.get("client_acct_id");
                String userid = (String) map.get("userid");
                Long status_cd = (Long) map.get("status_cd");
                Long master_plan_units = (Long) map.get("master_plan_units");
                com.aria.common.shared.SuppPlansArray supp_plans = (com.aria.common.shared.SuppPlansArray) map.get("supp_plans");
                com.aria.common.shared.SuppPlanUnitsArray supp_plan_units = (com.aria.common.shared.SuppPlanUnitsArray) map.get("supp_plan_units");
                Long notify_method = (Long) map.get("notify_method");
                String promo_cd = (String) map.get("promo_cd");
                String password = (String) map.get("password");
                String secret_question = (String) map.get("secret_question");
                String secret_question_answer = (String) map.get("secret_question_answer");
                String first_name = (String) map.get("first_name");
                String mi = (String) map.get("mi");
                String last_name = (String) map.get("last_name");
                String company_name = (String) map.get("company_name");
                String address1 = (String) map.get("address1");
                String address2 = (String) map.get("address2");
                String city = (String) map.get("city");
                String locality = (String) map.get("locality");
                String state_prov = (String) map.get("state_prov");
                String country = (String) map.get("country");
                String postal_cd = (String) map.get("postal_cd");
                String phone = (String) map.get("phone");
                String phone_ext = (String) map.get("phone_ext");
                String cell_phone = (String) map.get("cell_phone");
                String work_phone = (String) map.get("work_phone");
                String work_phone_ext = (String) map.get("work_phone_ext");
                String email = (String) map.get("email");
                String birthdate = (String) map.get("birthdate");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_mi = (String) map.get("bill_mi");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_country = (String) map.get("bill_country");
                String bill_postal_cd = (String) map.get("bill_postal_cd");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_ext = (String) map.get("bill_phone_ext");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_ext = (String) map.get("bill_work_phone_ext");
                String bill_email = (String) map.get("bill_email");
                Long pay_method = (Long) map.get("pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_acct_no = (String) map.get("bank_acct_no");
                String bank_routing_no = (String) map.get("bank_routing_no");
                Long resp_level_cd = (Long) map.get("resp_level_cd");
                Long senior_acct_no = (Long) map.get("senior_acct_no");
                String senior_acct_user_id = (String) map.get("senior_acct_user_id");
                String client_senior_acct_id = (String) map.get("client_senior_acct_id");
                com.aria.common.shared.FunctionalAcctGroupsArray functional_acct_groups = (com.aria.common.shared.FunctionalAcctGroupsArray) map.get("functional_acct_groups");
                com.aria.common.shared.CollectionsAcctGroupsArray collections_acct_groups = (com.aria.common.shared.CollectionsAcctGroupsArray) map.get("collections_acct_groups");
                com.aria.common.shared.SuppFieldNamesArray supp_field_names = (com.aria.common.shared.SuppFieldNamesArray) map.get("supp_field_names");
                com.aria.common.shared.SuppFieldValuesArray supp_field_values = (com.aria.common.shared.SuppFieldValuesArray) map.get("supp_field_values");
                Long test_acct_ind = (Long) map.get("test_acct_ind");
                Long status_until_alt_start = (Long) map.get("status_until_alt_start");
                Double balance_forward = (Double) map.get("balance_forward");
                Long alt_bill_day = (Long) map.get("alt_bill_day");
                String do_full_invoicing = (String) map.get("do_full_invoicing");
                String do_prorated_invoicing = (String) map.get("do_prorated_invoicing");
                Long master_plan_alt_rate_sched_no = (Long) map.get("master_plan_alt_rate_sched_no");
                com.aria.common.shared.SuppPlanAltRateSchedNoArray supp_plan_alt_rate_sched_no = (com.aria.common.shared.SuppPlanAltRateSchedNoArray) map.get("supp_plan_alt_rate_sched_no");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String currency_cd = (String) map.get("currency_cd");
                String cvv = (String) map.get("cvv");
                String taxpayer_id = (String) map.get("taxpayer_id");
                String bill_agreement_id = (String) map.get("bill_agreement_id");
                String retroactive_start_date = (String) map.get("retroactive_start_date");
                com.aria.common.shared.CouponCodesArray coupon_codes = (com.aria.common.shared.CouponCodesArray) map.get("coupon_codes");
                com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates = (com.aria.common.shared.NewAcctCustomRatesArray) map.get("new_acct_custom_rates");
                Long alt_msg_template_no = (Long) map.get("alt_msg_template_no");
                Long seq_func_group_no = (Long) map.get("seq_func_group_no");
                com.aria.common.shared.NewAcctPlanContractsArray new_acct_plan_contracts = (com.aria.common.shared.NewAcctPlanContractsArray) map.get("new_acct_plan_contracts");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String address3 = (String) map.get("address3");
                String bill_address3 = (String) map.get("bill_address3");
                com.aria.common.shared.UsageAccumulationConfigArray usage_accumulation_config = (com.aria.common.shared.UsageAccumulationConfigArray) map.get("usage_accumulation_config");
                com.aria.common.shared.EnableUsagePoolingPlanNoArray enable_usage_pooling_plan_no = (com.aria.common.shared.EnableUsagePoolingPlanNoArray) map.get("enable_usage_pooling_plan_no");
                com.aria.common.shared.ClientFuncAcctGroupIdsArray client_func_acct_group_ids = (com.aria.common.shared.ClientFuncAcctGroupIdsArray) map.get("client_func_acct_group_ids");
                com.aria.common.shared.ClientCollAcctGroupIdsArray client_coll_acct_group_ids = (com.aria.common.shared.ClientCollAcctGroupIdsArray) map.get("client_coll_acct_group_ids");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                String do_write = (String) map.get("do_write");
                Long tax_exemption_level = (Long) map.get("tax_exemption_level");
                Long cn_alt_msg_template_no = (Long) map.get("cn_alt_msg_template_no");
                String invoice_approval_required = (String) map.get("invoice_approval_required");
                String create_session = (String) map.get("create_session");
                com.aria.common.shared.ClientSuppPlanIdsArray client_supp_plan_ids = (com.aria.common.shared.ClientSuppPlanIdsArray) map.get("client_supp_plan_ids");
                String client_mp_alt_rate_sched_id = (String) map.get("client_mp_alt_rate_sched_id");
                com.aria.common.shared.ClientSpAltRateSchedIdsArray client_sp_alt_rate_sched_ids = (com.aria.common.shared.ClientSpAltRateSchedIdsArray) map.get("client_sp_alt_rate_sched_ids");
                String client_alt_msg_template_id = (String) map.get("client_alt_msg_template_id");
                String client_cn_alt_msg_template_no = (String) map.get("client_cn_alt_msg_template_no");
                com.aria.common.shared.SurchargeNoArray surcharge_no = (com.aria.common.shared.SurchargeNoArray) map.get("surcharge_no");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                String bkup_bill_first_name = (String) map.get("bkup_bill_first_name");
                String bkup_bill_mi = (String) map.get("bkup_bill_mi");
                String bkup_bill_last_name = (String) map.get("bkup_bill_last_name");
                String bkup_bill_company_name = (String) map.get("bkup_bill_company_name");
                String bkup_bill_address1 = (String) map.get("bkup_bill_address1");
                String bkup_bill_address2 = (String) map.get("bkup_bill_address2");
                String bkup_bill_address3 = (String) map.get("bkup_bill_address3");
                String bkup_bill_city = (String) map.get("bkup_bill_city");
                String bkup_bill_locality = (String) map.get("bkup_bill_locality");
                String bkup_bill_state_prov = (String) map.get("bkup_bill_state_prov");
                String bkup_bill_country = (String) map.get("bkup_bill_country");
                String bkup_bill_postal_cd = (String) map.get("bkup_bill_postal_cd");
                String bkup_bill_phone = (String) map.get("bkup_bill_phone");
                String bkup_bill_phone_ext = (String) map.get("bkup_bill_phone_ext");
                String bkup_bill_cell_phone = (String) map.get("bkup_bill_cell_phone");
                String bkup_bill_work_phone = (String) map.get("bkup_bill_work_phone");
                String bkup_bill_work_phone_ext = (String) map.get("bkup_bill_work_phone_ext");
                String bkup_bill_email = (String) map.get("bkup_bill_email");
                Long bkup_pay_method = (Long) map.get("bkup_pay_method");
                String bkup_cc_number = (String) map.get("bkup_cc_number");
                Long bkup_cc_expire_mm = (Long) map.get("bkup_cc_expire_mm");
                Long bkup_cc_expire_yyyy = (Long) map.get("bkup_cc_expire_yyyy");
                String bkup_bank_acct_no = (String) map.get("bkup_bank_acct_no");
                String bkup_bank_routing_no = (String) map.get("bkup_bank_routing_no");
                String bkup_bank_acct_type = (String) map.get("bkup_bank_acct_type");
                String bkup_bill_agreement_id = (String) map.get("bkup_bill_agreement_id");
                String bkup_cvv = (String) map.get("bkup_cvv");
                String seq_func_group_id = (String) map.get("seq_func_group_id");
                Long revrec_profile_id = (Long) map.get("revrec_profile_id");
                String revrec_client_defined_id = (String) map.get("revrec_client_defined_id");
                String stmnt_email_list = (String) map.get("stmnt_email_list");
                String stmnt_email_list_cc = (String) map.get("stmnt_email_list_cc");
                String stmnt_email_list_bcc = (String) map.get("stmnt_email_list_bcc");
                Long invoice_posting_method_cd = (Long) map.get("invoice_posting_method_cd");
                String acct_start_date = (String) map.get("acct_start_date");
                
        return createAcctComplete(client_no, auth_key, master_plan_no, client_master_plan_id, alt_start_date, client_acct_id, userid, status_cd, master_plan_units, supp_plans, supp_plan_units, notify_method, promo_cd, password, secret_question, secret_question_answer, first_name, mi, last_name, company_name, address1, address2, city, locality, state_prov, country, postal_cd, phone, phone_ext, cell_phone, work_phone, work_phone_ext, email, birthdate, bill_first_name, bill_mi, bill_last_name, bill_company_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_country, bill_postal_cd, bill_phone, bill_phone_ext, bill_cell_phone, bill_work_phone, bill_work_phone_ext, bill_email, pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_acct_no, bank_routing_no, resp_level_cd, senior_acct_no, senior_acct_user_id, client_senior_acct_id, functional_acct_groups, collections_acct_groups, supp_field_names, supp_field_values, test_acct_ind, status_until_alt_start, balance_forward, alt_bill_day, do_full_invoicing, do_prorated_invoicing, master_plan_alt_rate_sched_no, supp_plan_alt_rate_sched_no, client_receipt_id, currency_cd, cvv, taxpayer_id, bill_agreement_id, retroactive_start_date, coupon_codes, new_acct_custom_rates, alt_msg_template_no, seq_func_group_no, new_acct_plan_contracts, bank_acct_type, address3, bill_address3, usage_accumulation_config, enable_usage_pooling_plan_no, client_func_acct_group_ids, client_coll_acct_group_ids, track_data1, track_data2, do_write, tax_exemption_level, cn_alt_msg_template_no, invoice_approval_required, create_session, client_supp_plan_ids, client_mp_alt_rate_sched_id, client_sp_alt_rate_sched_ids, client_alt_msg_template_id, client_cn_alt_msg_template_no, surcharge_no, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, bkup_bill_first_name, bkup_bill_mi, bkup_bill_last_name, bkup_bill_company_name, bkup_bill_address1, bkup_bill_address2, bkup_bill_address3, bkup_bill_city, bkup_bill_locality, bkup_bill_state_prov, bkup_bill_country, bkup_bill_postal_cd, bkup_bill_phone, bkup_bill_phone_ext, bkup_bill_cell_phone, bkup_bill_work_phone, bkup_bill_work_phone_ext, bkup_bill_email, bkup_pay_method, bkup_cc_number, bkup_cc_expire_mm, bkup_cc_expire_yyyy, bkup_bank_acct_no, bkup_bank_routing_no, bkup_bank_acct_type, bkup_bill_agreement_id, bkup_cvv, seq_func_group_id, revrec_profile_id, revrec_client_defined_id, stmnt_email_list, stmnt_email_list_cc, stmnt_email_list_bcc, invoice_posting_method_cd, acct_start_date);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> applyCouponToAcct(Long client_no, String auth_key, Long acct_no, String coupon_code){
        javax.xml.ws.Holder h_user_success_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().applyCouponToAcct(client_no, auth_key, acct_no, coupon_code, h_user_success_msg, h_error_code, h_error_msg);

        getHashMapReturnValues().put("user_success_msg",((javax.xml.ws.Holder)h_user_success_msg).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> applyCouponToAcct(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String coupon_code = (String) map.get("coupon_code");
                
        return applyCouponToAcct(client_no, auth_key, acct_no, coupon_code);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createAdvancedServiceCredit(Long client_no, String auth_key, Long acct_no, Double amount, Long reason_code, String comments, Long eligible_plan_no, Long eligible_service_no, Long alt_service_no_to_apply, Long frequency_no, Long frequency_interval_months, String initial_credit_date, Double percent_amount, Long percent_eval_plan_no, Long percent_eval_service_no, com.aria.common.shared.EligibleServiceTypesArray eligible_service_types, String client_eligible_plan_id, String client_eligible_service_id, String client_alt_service_id_to_apply, String client_percent_eval_plan_id, String client_percent_eval_service_id, String credit_expiry_type_ind, Long credit_expiry_months, String credit_expiry_date, com.aria.common.shared.EligibleServicePlansArray eligible_service_plans, com.aria.common.shared.ClientEligibleServicePlanIdsArray client_eligible_service_plan_ids){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().createAdvancedServiceCredit(client_no, auth_key, acct_no, amount, reason_code, comments, eligible_plan_no, eligible_service_no, alt_service_no_to_apply, frequency_no, frequency_interval_months, initial_credit_date, percent_amount, percent_eval_plan_no, percent_eval_service_no, eligible_service_types, client_eligible_plan_id, client_eligible_service_id, client_alt_service_id_to_apply, client_percent_eval_plan_id, client_percent_eval_service_id, credit_expiry_type_ind, credit_expiry_months, credit_expiry_date, eligible_service_plans, client_eligible_service_plan_ids, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createAdvancedServiceCredit(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Double amount = (Double) map.get("amount");
                Long reason_code = (Long) map.get("reason_code");
                String comments = (String) map.get("comments");
                Long eligible_plan_no = (Long) map.get("eligible_plan_no");
                Long eligible_service_no = (Long) map.get("eligible_service_no");
                Long alt_service_no_to_apply = (Long) map.get("alt_service_no_to_apply");
                Long frequency_no = (Long) map.get("frequency_no");
                Long frequency_interval_months = (Long) map.get("frequency_interval_months");
                String initial_credit_date = (String) map.get("initial_credit_date");
                Double percent_amount = (Double) map.get("percent_amount");
                Long percent_eval_plan_no = (Long) map.get("percent_eval_plan_no");
                Long percent_eval_service_no = (Long) map.get("percent_eval_service_no");
                com.aria.common.shared.EligibleServiceTypesArray eligible_service_types = (com.aria.common.shared.EligibleServiceTypesArray) map.get("eligible_service_types");
                String client_eligible_plan_id = (String) map.get("client_eligible_plan_id");
                String client_eligible_service_id = (String) map.get("client_eligible_service_id");
                String client_alt_service_id_to_apply = (String) map.get("client_alt_service_id_to_apply");
                String client_percent_eval_plan_id = (String) map.get("client_percent_eval_plan_id");
                String client_percent_eval_service_id = (String) map.get("client_percent_eval_service_id");
                String credit_expiry_type_ind = (String) map.get("credit_expiry_type_ind");
                Long credit_expiry_months = (Long) map.get("credit_expiry_months");
                String credit_expiry_date = (String) map.get("credit_expiry_date");
                com.aria.common.shared.EligibleServicePlansArray eligible_service_plans = (com.aria.common.shared.EligibleServicePlansArray) map.get("eligible_service_plans");
                com.aria.common.shared.ClientEligibleServicePlanIdsArray client_eligible_service_plan_ids = (com.aria.common.shared.ClientEligibleServicePlanIdsArray) map.get("client_eligible_service_plan_ids");
                
        return createAdvancedServiceCredit(client_no, auth_key, acct_no, amount, reason_code, comments, eligible_plan_no, eligible_service_no, alt_service_no_to_apply, frequency_no, frequency_interval_months, initial_credit_date, percent_amount, percent_eval_plan_no, percent_eval_service_no, eligible_service_types, client_eligible_plan_id, client_eligible_service_id, client_alt_service_id_to_apply, client_percent_eval_plan_id, client_percent_eval_service_id, credit_expiry_type_ind, credit_expiry_months, credit_expiry_date, eligible_service_plans, client_eligible_service_plan_ids);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctNoFromUserId(Long client_no, String auth_key, String user_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_no = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctNoFromUserId(client_no, auth_key, user_id, h_error_code, h_error_msg, h_acct_no);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_no",((javax.xml.ws.Holder)h_acct_no).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctNoFromUserId(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String user_id = (String) map.get("user_id");
                
        return getAcctNoFromUserId(client_no, auth_key, user_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getUserIdFromAcctNo(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_user_id = new javax.xml.ws.Holder();

        
        getCompletePort().getUserIdFromAcctNo(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_user_id);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("user_id",((javax.xml.ws.Holder)h_user_id).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getUserIdFromAcctNo(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getUserIdFromAcctNo(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPlanContract(Long client_no, String auth_key, Long acct_no, Long plan_no, String client_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_plan_contract = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPlanContract(client_no, auth_key, acct_no, plan_no, client_plan_id, h_error_code, h_error_msg, h_acct_plan_contract);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_plan_contract",((javax.xml.ws.Holder)h_acct_plan_contract).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPlanContract(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long plan_no = (Long) map.get("plan_no");
                String client_plan_id = (String) map.get("client_plan_id");
                
        return getAcctPlanContract(client_no, auth_key, acct_no, plan_no, client_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createAcctPlanContract(Long client_no, String auth_key, Long acct_no, Long plan_no, Long length_months, String end_date, String client_plan_id, Long type_no, Double alt_recur_fee, Double cancel_fee, String create_comments, String start_date, String do_auto_discard){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_contract_no = new javax.xml.ws.Holder();

        
        getCompletePort().createAcctPlanContract(client_no, auth_key, acct_no, plan_no, length_months, end_date, client_plan_id, type_no, alt_recur_fee, cancel_fee, create_comments, start_date, do_auto_discard, h_error_code, h_error_msg, h_contract_no);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("contract_no",((javax.xml.ws.Holder)h_contract_no).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createAcctPlanContract(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long plan_no = (Long) map.get("plan_no");
                Long length_months = (Long) map.get("length_months");
                String end_date = (String) map.get("end_date");
                String client_plan_id = (String) map.get("client_plan_id");
                Long type_no = (Long) map.get("type_no");
                Double alt_recur_fee = (Double) map.get("alt_recur_fee");
                Double cancel_fee = (Double) map.get("cancel_fee");
                String create_comments = (String) map.get("create_comments");
                String start_date = (String) map.get("start_date");
                String do_auto_discard = (String) map.get("do_auto_discard");
                
        return createAcctPlanContract(client_no, auth_key, acct_no, plan_no, length_months, end_date, client_plan_id, type_no, alt_recur_fee, cancel_fee, create_comments, start_date, do_auto_discard);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> modifyAcctPlanContract(Long client_no, String auth_key, Long acct_no, Long contract_no, Long type_no, Double alt_recur_fee, Long length_months, Double cancel_fee, String start_date, String update_comments, String end_date){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().modifyAcctPlanContract(client_no, auth_key, acct_no, contract_no, type_no, alt_recur_fee, length_months, cancel_fee, start_date, update_comments, end_date, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> modifyAcctPlanContract(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long contract_no = (Long) map.get("contract_no");
                Long type_no = (Long) map.get("type_no");
                Double alt_recur_fee = (Double) map.get("alt_recur_fee");
                Long length_months = (Long) map.get("length_months");
                Double cancel_fee = (Double) map.get("cancel_fee");
                String start_date = (String) map.get("start_date");
                String update_comments = (String) map.get("update_comments");
                String end_date = (String) map.get("end_date");
                
        return modifyAcctPlanContract(client_no, auth_key, acct_no, contract_no, type_no, alt_recur_fee, length_months, cancel_fee, start_date, update_comments, end_date);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelAcctPlanContract(Long client_no, String auth_key, Long acct_no, Long contract_no, String update_comments, Long close_status){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().cancelAcctPlanContract(client_no, auth_key, acct_no, contract_no, update_comments, close_status, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelAcctPlanContract(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long contract_no = (Long) map.get("contract_no");
                String update_comments = (String) map.get("update_comments");
                Long close_status = (Long) map.get("close_status");
                
        return cancelAcctPlanContract(client_no, auth_key, acct_no, contract_no, update_comments, close_status);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getUsageHistory(Long client_no, String auth_key, Long acct_no, Long specified_usage_type_no, String date_range_start, String date_range_end, String specified_usage_type_code, com.aria.common.shared.UsageQualifier1Array usage_qualifier_1, com.aria.common.shared.UsageQualifier2Array usage_qualifier_2, com.aria.common.shared.UsageQualifier3Array usage_qualifier_3, com.aria.common.shared.UsageQualifier4Array usage_qualifier_4, Long limit, Long offset, Long transaction_id, Long invoice_no, Long invoice_line_item, String retrieve_excluded_usage){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_usage_history_records = new javax.xml.ws.Holder();

        
        getCompletePort().getUsageHistory(client_no, auth_key, acct_no, specified_usage_type_no, date_range_start, date_range_end, specified_usage_type_code, usage_qualifier_1, usage_qualifier_2, usage_qualifier_3, usage_qualifier_4, limit, offset, transaction_id, invoice_no, invoice_line_item, retrieve_excluded_usage, h_error_code, h_error_msg, h_usage_history_records);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("usage_history_records",((javax.xml.ws.Holder)h_usage_history_records).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getUsageHistory(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long specified_usage_type_no = (Long) map.get("specified_usage_type_no");
                String date_range_start = (String) map.get("date_range_start");
                String date_range_end = (String) map.get("date_range_end");
                String specified_usage_type_code = (String) map.get("specified_usage_type_code");
                com.aria.common.shared.UsageQualifier1Array usage_qualifier_1 = (com.aria.common.shared.UsageQualifier1Array) map.get("usage_qualifier_1");
                com.aria.common.shared.UsageQualifier2Array usage_qualifier_2 = (com.aria.common.shared.UsageQualifier2Array) map.get("usage_qualifier_2");
                com.aria.common.shared.UsageQualifier3Array usage_qualifier_3 = (com.aria.common.shared.UsageQualifier3Array) map.get("usage_qualifier_3");
                com.aria.common.shared.UsageQualifier4Array usage_qualifier_4 = (com.aria.common.shared.UsageQualifier4Array) map.get("usage_qualifier_4");
                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                Long transaction_id = (Long) map.get("transaction_id");
                Long invoice_no = (Long) map.get("invoice_no");
                Long invoice_line_item = (Long) map.get("invoice_line_item");
                String retrieve_excluded_usage = (String) map.get("retrieve_excluded_usage");
                
        return getUsageHistory(client_no, auth_key, acct_no, specified_usage_type_no, date_range_start, date_range_end, specified_usage_type_code, usage_qualifier_1, usage_qualifier_2, usage_qualifier_3, usage_qualifier_4, limit, offset, transaction_id, invoice_no, invoice_line_item, retrieve_excluded_usage);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctMessage(Long client_no, String auth_key, Long acct_no, Long message_id, String do_encoding){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_message_body = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_mime_type = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctMessage(client_no, auth_key, acct_no, message_id, do_encoding, h_error_code, h_error_msg, h_message_body, h_mime_type);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("message_body",((javax.xml.ws.Holder)h_message_body).value);
        getHashMapReturnValues().put("mime_type",((javax.xml.ws.Holder)h_mime_type).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctMessage(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long message_id = (Long) map.get("message_id");
                String do_encoding = (String) map.get("do_encoding");
                
        return getAcctMessage(client_no, auth_key, acct_no, message_id, do_encoding);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctMessageSize(Long client_no, String auth_key, Long acct_no, Long message_id, String do_encoding){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_num_chars = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctMessageSize(client_no, auth_key, acct_no, message_id, do_encoding, h_error_code, h_error_msg, h_num_chars);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("num_chars",((javax.xml.ws.Holder)h_num_chars).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctMessageSize(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long message_id = (Long) map.get("message_id");
                String do_encoding = (String) map.get("do_encoding");
                
        return getAcctMessageSize(client_no, auth_key, acct_no, message_id, do_encoding);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateMasterPlan(Long client_no, String auth_key, Long acct_no, Long master_plan_no, Long alt_rate_schedule_no, Long num_plan_units, Long assignment_directive, String do_write, String client_receipt_id, String force_currency_change, String auto_cancel_supp_plans, Long offset_months, String alt_proration_start_date, String alt_client_acct_group_id, com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates, String effective_date, Long offset_interval, String invoice_unbilled_usage, String coupon_code, String client_master_plan_id, String client_alt_rate_schedule_id, com.aria.common.shared.SurchargeNoArray surcharge_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cancelled_supp_plans = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_activation_fee = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_mthly_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_annu_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_upd_acct_invoice_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().updateMasterPlan(client_no, auth_key, acct_no, master_plan_no, alt_rate_schedule_no, num_plan_units, assignment_directive, do_write, client_receipt_id, force_currency_change, auto_cancel_supp_plans, offset_months, alt_proration_start_date, alt_client_acct_group_id, new_acct_custom_rates, effective_date, offset_interval, invoice_unbilled_usage, coupon_code, client_master_plan_id, client_alt_rate_schedule_id, surcharge_no, h_error_code, h_error_msg, h_proration_result_amount, h_collection_error_code, h_collection_error_msg, h_statement_error_code, h_statement_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_invoice_no, h_cancelled_supp_plans, h_expectd_activation_fee, h_expectd_mthly_recurring_cost, h_expectd_annu_recurring_cost, h_upd_acct_invoice_line_items, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_total_tax_credit, h_total_credit_before_tax, h_total, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proration_result_amount",((javax.xml.ws.Holder)h_proration_result_amount).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("statement_error_code",((javax.xml.ws.Holder)h_statement_error_code).value);
        getHashMapReturnValues().put("statement_error_msg",((javax.xml.ws.Holder)h_statement_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("cancelled_supp_plans",((javax.xml.ws.Holder)h_cancelled_supp_plans).value);
        getHashMapReturnValues().put("expectd_activation_fee",((javax.xml.ws.Holder)h_expectd_activation_fee).value);
        getHashMapReturnValues().put("expectd_mthly_recurring_cost",((javax.xml.ws.Holder)h_expectd_mthly_recurring_cost).value);
        getHashMapReturnValues().put("expectd_annu_recurring_cost",((javax.xml.ws.Holder)h_expectd_annu_recurring_cost).value);
        getHashMapReturnValues().put("upd_acct_invoice_line_items",((javax.xml.ws.Holder)h_upd_acct_invoice_line_items).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("total_tax_credit",((javax.xml.ws.Holder)h_total_tax_credit).value);
        getHashMapReturnValues().put("total_credit_before_tax",((javax.xml.ws.Holder)h_total_credit_before_tax).value);
        getHashMapReturnValues().put("total",((javax.xml.ws.Holder)h_total).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateMasterPlan(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long master_plan_no = (Long) map.get("master_plan_no");
                Long alt_rate_schedule_no = (Long) map.get("alt_rate_schedule_no");
                Long num_plan_units = (Long) map.get("num_plan_units");
                Long assignment_directive = (Long) map.get("assignment_directive");
                String do_write = (String) map.get("do_write");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String force_currency_change = (String) map.get("force_currency_change");
                String auto_cancel_supp_plans = (String) map.get("auto_cancel_supp_plans");
                Long offset_months = (Long) map.get("offset_months");
                String alt_proration_start_date = (String) map.get("alt_proration_start_date");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates = (com.aria.common.shared.NewAcctCustomRatesArray) map.get("new_acct_custom_rates");
                String effective_date = (String) map.get("effective_date");
                Long offset_interval = (Long) map.get("offset_interval");
                String invoice_unbilled_usage = (String) map.get("invoice_unbilled_usage");
                String coupon_code = (String) map.get("coupon_code");
                String client_master_plan_id = (String) map.get("client_master_plan_id");
                String client_alt_rate_schedule_id = (String) map.get("client_alt_rate_schedule_id");
                com.aria.common.shared.SurchargeNoArray surcharge_no = (com.aria.common.shared.SurchargeNoArray) map.get("surcharge_no");
                
        return updateMasterPlan(client_no, auth_key, acct_no, master_plan_no, alt_rate_schedule_no, num_plan_units, assignment_directive, do_write, client_receipt_id, force_currency_change, auto_cancel_supp_plans, offset_months, alt_proration_start_date, alt_client_acct_group_id, new_acct_custom_rates, effective_date, offset_interval, invoice_unbilled_usage, coupon_code, client_master_plan_id, client_alt_rate_schedule_id, surcharge_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateAcctComplete(Long client_no, String auth_key, Long acct_no, String first_name, String last_name, String middle_initial, String company_name, String address1, String address2, String city, String locality, String state_prov, String country, String postal_cd, String phone, String phone_ext, String cell_phone, String work_phone, String work_phone_ext, String email, String birthdate, String bill_first_name, String bill_last_name, String bill_middle_initial, String bill_company_name, String bill_address1, String bill_address2, String bill_city, String bill_locality, String bill_state_prov, String bill_country, String bill_postal_cd, String bill_phone, String bill_phone_ext, String bill_cell_phone, String bill_work_phone, String bill_work_phone_ext, String bill_email, Long pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_routing_num, String bank_acct_num, Long master_plan_no, Long master_plan_alt_rate_sched_no, Long master_plan_units, Long master_plan_assign_directive, com.aria.common.shared.UpdateAcctSuppFieldArray update_acct_supp_field, com.aria.common.shared.UpdateAcctFuncGroupArray update_acct_func_group, com.aria.common.shared.UpdateAcctCollGroupArray update_acct_coll_group, Long status_cd, Long notify_method, String password, String secret_question, String secret_question_answer, String pin, Long test_acct_ind, Long resp_level_cd, Long senior_acct_no, String senior_acct_user_id, String client_senior_acct_id, String client_acct_id, String do_collect, String change_status_after_coll, String reset_dates_after_status, String client_receipt_id, String alt_do_dunning, String force_currency_change, String cvv, String taxpayer_id, String bill_agreement_id, String auto_cancel_supp_plans, Long offset_months, String alt_proration_start_date, Long alt_msg_template_no, Long seq_func_group_no, String bank_acct_type, String address3, String bill_address3, com.aria.common.shared.UsageAccumulationConfigArray usage_accumulation_config, com.aria.common.shared.EnableUsagePoolingPlanNoArray enable_usage_pooling_plan_no, com.aria.common.shared.DisableUsagePoolingPlanNoArray disable_usage_pooling_plan_no, String alt_client_acct_group_id, String track_data1, String track_data2, Long offset_interval, Long tax_exemption_level, Long cn_alt_msg_template_no, String promo_cd, String invoice_unbilled_usage, String coupon_code, String userid, String invoice_approval_required, String client_master_plan_id, String client_mp_alt_rate_sched_id, String client_alt_msg_template_id, String client_cn_alt_msg_template_id, com.aria.common.shared.UpdateSurchargeArray update_surcharge, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd, String bkup_bill_first_name, String bkup_bill_mi, String bkup_bill_last_name, String bkup_bill_company_name, String bkup_bill_address1, String bkup_bill_address2, String bkup_bill_address3, String bkup_bill_city, String bkup_bill_locality, String bkup_bill_state_prov, String bkup_bill_country, String bkup_bill_postal_cd, String bkup_bill_phone, String bkup_bill_phone_ext, String bkup_bill_cell_phone, String bkup_bill_work_phone, String bkup_bill_work_phone_ext, String bkup_bill_email, Long bkup_pay_method, String bkup_cc_number, Long bkup_cc_expire_mm, Long bkup_cc_expire_yyyy, String bkup_bank_acct_no, String bkup_bank_routing_no, String bkup_bank_acct_type, String bkup_bill_agreement_id, String bkup_cvv, String seq_func_group_id, Long revrec_profile_id, String revrec_client_defined_id, String stmnt_email_list, String stmnt_email_list_cc, String stmnt_email_list_bcc, Long invoice_posting_method_cd, String acct_start_date){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_parent_child_sync_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_parent_child_sync_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_coll_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_coll_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_stmt_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_stmt_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cancelled_supp_plans = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().updateAcctComplete(client_no, auth_key, acct_no, first_name, last_name, middle_initial, company_name, address1, address2, city, locality, state_prov, country, postal_cd, phone, phone_ext, cell_phone, work_phone, work_phone_ext, email, birthdate, bill_first_name, bill_last_name, bill_middle_initial, bill_company_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_country, bill_postal_cd, bill_phone, bill_phone_ext, bill_cell_phone, bill_work_phone, bill_work_phone_ext, bill_email, pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, master_plan_no, master_plan_alt_rate_sched_no, master_plan_units, master_plan_assign_directive, update_acct_supp_field, update_acct_func_group, update_acct_coll_group, status_cd, notify_method, password, secret_question, secret_question_answer, pin, test_acct_ind, resp_level_cd, senior_acct_no, senior_acct_user_id, client_senior_acct_id, client_acct_id, do_collect, change_status_after_coll, reset_dates_after_status, client_receipt_id, alt_do_dunning, force_currency_change, cvv, taxpayer_id, bill_agreement_id, auto_cancel_supp_plans, offset_months, alt_proration_start_date, alt_msg_template_no, seq_func_group_no, bank_acct_type, address3, bill_address3, usage_accumulation_config, enable_usage_pooling_plan_no, disable_usage_pooling_plan_no, alt_client_acct_group_id, track_data1, track_data2, offset_interval, tax_exemption_level, cn_alt_msg_template_no, promo_cd, invoice_unbilled_usage, coupon_code, userid, invoice_approval_required, client_master_plan_id, client_mp_alt_rate_sched_id, client_alt_msg_template_id, client_cn_alt_msg_template_id, update_surcharge, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, bkup_bill_first_name, bkup_bill_mi, bkup_bill_last_name, bkup_bill_company_name, bkup_bill_address1, bkup_bill_address2, bkup_bill_address3, bkup_bill_city, bkup_bill_locality, bkup_bill_state_prov, bkup_bill_country, bkup_bill_postal_cd, bkup_bill_phone, bkup_bill_phone_ext, bkup_bill_cell_phone, bkup_bill_work_phone, bkup_bill_work_phone_ext, bkup_bill_email, bkup_pay_method, bkup_cc_number, bkup_cc_expire_mm, bkup_cc_expire_yyyy, bkup_bank_acct_no, bkup_bank_routing_no, bkup_bank_acct_type, bkup_bill_agreement_id, bkup_cvv, seq_func_group_id, revrec_profile_id, revrec_client_defined_id, stmnt_email_list, stmnt_email_list_cc, stmnt_email_list_bcc, invoice_posting_method_cd, acct_start_date, h_error_code, h_error_msg, h_proration_result_amount, h_collection_error_code, h_collection_error_msg, h_parent_child_sync_error_code, h_parent_child_sync_error_msg, h_master_plan_error_code, h_master_plan_error_msg, h_master_plan_coll_error_code, h_master_plan_coll_error_msg, h_master_plan_stmt_error_code, h_master_plan_stmt_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_invoice_no, h_cancelled_supp_plans, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proration_result_amount",((javax.xml.ws.Holder)h_proration_result_amount).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("parent_child_sync_error_code",((javax.xml.ws.Holder)h_parent_child_sync_error_code).value);
        getHashMapReturnValues().put("parent_child_sync_error_msg",((javax.xml.ws.Holder)h_parent_child_sync_error_msg).value);
        getHashMapReturnValues().put("master_plan_error_code",((javax.xml.ws.Holder)h_master_plan_error_code).value);
        getHashMapReturnValues().put("master_plan_error_msg",((javax.xml.ws.Holder)h_master_plan_error_msg).value);
        getHashMapReturnValues().put("master_plan_coll_error_code",((javax.xml.ws.Holder)h_master_plan_coll_error_code).value);
        getHashMapReturnValues().put("master_plan_coll_error_msg",((javax.xml.ws.Holder)h_master_plan_coll_error_msg).value);
        getHashMapReturnValues().put("master_plan_stmt_error_code",((javax.xml.ws.Holder)h_master_plan_stmt_error_code).value);
        getHashMapReturnValues().put("master_plan_stmt_error_msg",((javax.xml.ws.Holder)h_master_plan_stmt_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("cancelled_supp_plans",((javax.xml.ws.Holder)h_cancelled_supp_plans).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateAcctComplete(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String first_name = (String) map.get("first_name");
                String last_name = (String) map.get("last_name");
                String middle_initial = (String) map.get("middle_initial");
                String company_name = (String) map.get("company_name");
                String address1 = (String) map.get("address1");
                String address2 = (String) map.get("address2");
                String city = (String) map.get("city");
                String locality = (String) map.get("locality");
                String state_prov = (String) map.get("state_prov");
                String country = (String) map.get("country");
                String postal_cd = (String) map.get("postal_cd");
                String phone = (String) map.get("phone");
                String phone_ext = (String) map.get("phone_ext");
                String cell_phone = (String) map.get("cell_phone");
                String work_phone = (String) map.get("work_phone");
                String work_phone_ext = (String) map.get("work_phone_ext");
                String email = (String) map.get("email");
                String birthdate = (String) map.get("birthdate");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_country = (String) map.get("bill_country");
                String bill_postal_cd = (String) map.get("bill_postal_cd");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_ext = (String) map.get("bill_phone_ext");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_ext = (String) map.get("bill_work_phone_ext");
                String bill_email = (String) map.get("bill_email");
                Long pay_method = (Long) map.get("pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                Long master_plan_no = (Long) map.get("master_plan_no");
                Long master_plan_alt_rate_sched_no = (Long) map.get("master_plan_alt_rate_sched_no");
                Long master_plan_units = (Long) map.get("master_plan_units");
                Long master_plan_assign_directive = (Long) map.get("master_plan_assign_directive");
                com.aria.common.shared.UpdateAcctSuppFieldArray update_acct_supp_field = (com.aria.common.shared.UpdateAcctSuppFieldArray) map.get("update_acct_supp_field");
                com.aria.common.shared.UpdateAcctFuncGroupArray update_acct_func_group = (com.aria.common.shared.UpdateAcctFuncGroupArray) map.get("update_acct_func_group");
                com.aria.common.shared.UpdateAcctCollGroupArray update_acct_coll_group = (com.aria.common.shared.UpdateAcctCollGroupArray) map.get("update_acct_coll_group");
                Long status_cd = (Long) map.get("status_cd");
                Long notify_method = (Long) map.get("notify_method");
                String password = (String) map.get("password");
                String secret_question = (String) map.get("secret_question");
                String secret_question_answer = (String) map.get("secret_question_answer");
                String pin = (String) map.get("pin");
                Long test_acct_ind = (Long) map.get("test_acct_ind");
                Long resp_level_cd = (Long) map.get("resp_level_cd");
                Long senior_acct_no = (Long) map.get("senior_acct_no");
                String senior_acct_user_id = (String) map.get("senior_acct_user_id");
                String client_senior_acct_id = (String) map.get("client_senior_acct_id");
                String client_acct_id = (String) map.get("client_acct_id");
                String do_collect = (String) map.get("do_collect");
                String change_status_after_coll = (String) map.get("change_status_after_coll");
                String reset_dates_after_status = (String) map.get("reset_dates_after_status");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String alt_do_dunning = (String) map.get("alt_do_dunning");
                String force_currency_change = (String) map.get("force_currency_change");
                String cvv = (String) map.get("cvv");
                String taxpayer_id = (String) map.get("taxpayer_id");
                String bill_agreement_id = (String) map.get("bill_agreement_id");
                String auto_cancel_supp_plans = (String) map.get("auto_cancel_supp_plans");
                Long offset_months = (Long) map.get("offset_months");
                String alt_proration_start_date = (String) map.get("alt_proration_start_date");
                Long alt_msg_template_no = (Long) map.get("alt_msg_template_no");
                Long seq_func_group_no = (Long) map.get("seq_func_group_no");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String address3 = (String) map.get("address3");
                String bill_address3 = (String) map.get("bill_address3");
                com.aria.common.shared.UsageAccumulationConfigArray usage_accumulation_config = (com.aria.common.shared.UsageAccumulationConfigArray) map.get("usage_accumulation_config");
                com.aria.common.shared.EnableUsagePoolingPlanNoArray enable_usage_pooling_plan_no = (com.aria.common.shared.EnableUsagePoolingPlanNoArray) map.get("enable_usage_pooling_plan_no");
                com.aria.common.shared.DisableUsagePoolingPlanNoArray disable_usage_pooling_plan_no = (com.aria.common.shared.DisableUsagePoolingPlanNoArray) map.get("disable_usage_pooling_plan_no");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                Long offset_interval = (Long) map.get("offset_interval");
                Long tax_exemption_level = (Long) map.get("tax_exemption_level");
                Long cn_alt_msg_template_no = (Long) map.get("cn_alt_msg_template_no");
                String promo_cd = (String) map.get("promo_cd");
                String invoice_unbilled_usage = (String) map.get("invoice_unbilled_usage");
                String coupon_code = (String) map.get("coupon_code");
                String userid = (String) map.get("userid");
                String invoice_approval_required = (String) map.get("invoice_approval_required");
                String client_master_plan_id = (String) map.get("client_master_plan_id");
                String client_mp_alt_rate_sched_id = (String) map.get("client_mp_alt_rate_sched_id");
                String client_alt_msg_template_id = (String) map.get("client_alt_msg_template_id");
                String client_cn_alt_msg_template_id = (String) map.get("client_cn_alt_msg_template_id");
                com.aria.common.shared.UpdateSurchargeArray update_surcharge = (com.aria.common.shared.UpdateSurchargeArray) map.get("update_surcharge");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                String bkup_bill_first_name = (String) map.get("bkup_bill_first_name");
                String bkup_bill_mi = (String) map.get("bkup_bill_mi");
                String bkup_bill_last_name = (String) map.get("bkup_bill_last_name");
                String bkup_bill_company_name = (String) map.get("bkup_bill_company_name");
                String bkup_bill_address1 = (String) map.get("bkup_bill_address1");
                String bkup_bill_address2 = (String) map.get("bkup_bill_address2");
                String bkup_bill_address3 = (String) map.get("bkup_bill_address3");
                String bkup_bill_city = (String) map.get("bkup_bill_city");
                String bkup_bill_locality = (String) map.get("bkup_bill_locality");
                String bkup_bill_state_prov = (String) map.get("bkup_bill_state_prov");
                String bkup_bill_country = (String) map.get("bkup_bill_country");
                String bkup_bill_postal_cd = (String) map.get("bkup_bill_postal_cd");
                String bkup_bill_phone = (String) map.get("bkup_bill_phone");
                String bkup_bill_phone_ext = (String) map.get("bkup_bill_phone_ext");
                String bkup_bill_cell_phone = (String) map.get("bkup_bill_cell_phone");
                String bkup_bill_work_phone = (String) map.get("bkup_bill_work_phone");
                String bkup_bill_work_phone_ext = (String) map.get("bkup_bill_work_phone_ext");
                String bkup_bill_email = (String) map.get("bkup_bill_email");
                Long bkup_pay_method = (Long) map.get("bkup_pay_method");
                String bkup_cc_number = (String) map.get("bkup_cc_number");
                Long bkup_cc_expire_mm = (Long) map.get("bkup_cc_expire_mm");
                Long bkup_cc_expire_yyyy = (Long) map.get("bkup_cc_expire_yyyy");
                String bkup_bank_acct_no = (String) map.get("bkup_bank_acct_no");
                String bkup_bank_routing_no = (String) map.get("bkup_bank_routing_no");
                String bkup_bank_acct_type = (String) map.get("bkup_bank_acct_type");
                String bkup_bill_agreement_id = (String) map.get("bkup_bill_agreement_id");
                String bkup_cvv = (String) map.get("bkup_cvv");
                String seq_func_group_id = (String) map.get("seq_func_group_id");
                Long revrec_profile_id = (Long) map.get("revrec_profile_id");
                String revrec_client_defined_id = (String) map.get("revrec_client_defined_id");
                String stmnt_email_list = (String) map.get("stmnt_email_list");
                String stmnt_email_list_cc = (String) map.get("stmnt_email_list_cc");
                String stmnt_email_list_bcc = (String) map.get("stmnt_email_list_bcc");
                Long invoice_posting_method_cd = (Long) map.get("invoice_posting_method_cd");
                String acct_start_date = (String) map.get("acct_start_date");
                
        return updateAcctComplete(client_no, auth_key, acct_no, first_name, last_name, middle_initial, company_name, address1, address2, city, locality, state_prov, country, postal_cd, phone, phone_ext, cell_phone, work_phone, work_phone_ext, email, birthdate, bill_first_name, bill_last_name, bill_middle_initial, bill_company_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_country, bill_postal_cd, bill_phone, bill_phone_ext, bill_cell_phone, bill_work_phone, bill_work_phone_ext, bill_email, pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, master_plan_no, master_plan_alt_rate_sched_no, master_plan_units, master_plan_assign_directive, update_acct_supp_field, update_acct_func_group, update_acct_coll_group, status_cd, notify_method, password, secret_question, secret_question_answer, pin, test_acct_ind, resp_level_cd, senior_acct_no, senior_acct_user_id, client_senior_acct_id, client_acct_id, do_collect, change_status_after_coll, reset_dates_after_status, client_receipt_id, alt_do_dunning, force_currency_change, cvv, taxpayer_id, bill_agreement_id, auto_cancel_supp_plans, offset_months, alt_proration_start_date, alt_msg_template_no, seq_func_group_no, bank_acct_type, address3, bill_address3, usage_accumulation_config, enable_usage_pooling_plan_no, disable_usage_pooling_plan_no, alt_client_acct_group_id, track_data1, track_data2, offset_interval, tax_exemption_level, cn_alt_msg_template_no, promo_cd, invoice_unbilled_usage, coupon_code, userid, invoice_approval_required, client_master_plan_id, client_mp_alt_rate_sched_id, client_alt_msg_template_id, client_cn_alt_msg_template_id, update_surcharge, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, bkup_bill_first_name, bkup_bill_mi, bkup_bill_last_name, bkup_bill_company_name, bkup_bill_address1, bkup_bill_address2, bkup_bill_address3, bkup_bill_city, bkup_bill_locality, bkup_bill_state_prov, bkup_bill_country, bkup_bill_postal_cd, bkup_bill_phone, bkup_bill_phone_ext, bkup_bill_cell_phone, bkup_bill_work_phone, bkup_bill_work_phone_ext, bkup_bill_email, bkup_pay_method, bkup_cc_number, bkup_cc_expire_mm, bkup_cc_expire_yyyy, bkup_bank_acct_no, bkup_bank_routing_no, bkup_bank_acct_type, bkup_bill_agreement_id, bkup_cvv, seq_func_group_id, revrec_profile_id, revrec_client_defined_id, stmnt_email_list, stmnt_email_list_cc, stmnt_email_list_bcc, invoice_posting_method_cd, acct_start_date);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAllAcctReceiptIds(Long client_no, String auth_key, Long acct_no, String start_date_range, String end_date_range){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_receipt = new javax.xml.ws.Holder();

        
        getCompletePort().getAllAcctReceiptIds(client_no, auth_key, acct_no, start_date_range, end_date_range, h_error_code, h_error_msg, h_acct_receipt);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_receipt",((javax.xml.ws.Holder)h_acct_receipt).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAllAcctReceiptIds(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String start_date_range = (String) map.get("start_date_range");
                String end_date_range = (String) map.get("end_date_range");
                
        return getAllAcctReceiptIds(client_no, auth_key, acct_no, start_date_range, end_date_range);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> sendArcThresholdEmail(Long client_no, String auth_key, Long acct_no, Long resource_threshold_level, Long resource_balance, String resource_name, String resource_units_label){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().sendArcThresholdEmail(client_no, auth_key, acct_no, resource_threshold_level, resource_balance, resource_name, resource_units_label, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> sendArcThresholdEmail(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long resource_threshold_level = (Long) map.get("resource_threshold_level");
                Long resource_balance = (Long) map.get("resource_balance");
                String resource_name = (String) map.get("resource_name");
                String resource_units_label = (String) map.get("resource_units_label");
                
        return sendArcThresholdEmail(client_no, auth_key, acct_no, resource_threshold_level, resource_balance, resource_name, resource_units_label);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setAcctTaxExemptStatus(Long client_no, String auth_key, Long acct_no, Long exemption_level){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setAcctTaxExemptStatus(client_no, auth_key, acct_no, exemption_level, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setAcctTaxExemptStatus(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long exemption_level = (Long) map.get("exemption_level");
                
        return setAcctTaxExemptStatus(client_no, auth_key, acct_no, exemption_level);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctTaxExemptStatus(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_exemption_level = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_exemption_level_desc = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctTaxExemptStatus(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_exemption_level, h_exemption_level_desc);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("exemption_level",((javax.xml.ws.Holder)h_exemption_level).value);
        getHashMapReturnValues().put("exemption_level_desc",((javax.xml.ws.Holder)h_exemption_level_desc).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctTaxExemptStatus(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAcctTaxExemptStatus(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> closeAcctInstallation(Long client_no, String auth_key, Long acct_no, String install_complete_ind, String comments){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().closeAcctInstallation(client_no, auth_key, acct_no, install_complete_ind, comments, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> closeAcctInstallation(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String install_complete_ind = (String) map.get("install_complete_ind");
                String comments = (String) map.get("comments");
                
        return closeAcctInstallation(client_no, auth_key, acct_no, install_complete_ind, comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getUnappliedServiceCredits(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unapplied_service_credits = new javax.xml.ws.Holder();

        
        getCompletePort().getUnappliedServiceCredits(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_unapplied_service_credits);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("unapplied_service_credits",((javax.xml.ws.Holder)h_unapplied_service_credits).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getUnappliedServiceCredits(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getUnappliedServiceCredits(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getRecurringCreditInfo(Long client_no, String auth_key, Long acct_no, Long filter_credit_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_recurring_credit_info = new javax.xml.ws.Holder();

        
        getCompletePort().getRecurringCreditInfo(client_no, auth_key, acct_no, filter_credit_no, h_error_code, h_error_msg, h_recurring_credit_info);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("recurring_credit_info",((javax.xml.ws.Holder)h_recurring_credit_info).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getRecurringCreditInfo(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long filter_credit_no = (Long) map.get("filter_credit_no");
                
        return getRecurringCreditInfo(client_no, auth_key, acct_no, filter_credit_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getPendingInvoiceNo(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        
        getCompletePort().getPendingInvoiceNo(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_invoice_no);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPendingInvoiceNo(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getPendingInvoiceNo(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> removePayMethod(Long client_no, String auth_key, Long acct_no, Long primary_or_bkup_pay_mthd_ind){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().removePayMethod(client_no, auth_key, acct_no, primary_or_bkup_pay_mthd_ind, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> removePayMethod(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long primary_or_bkup_pay_mthd_ind = (Long) map.get("primary_or_bkup_pay_mthd_ind");
                
        return removePayMethod(client_no, auth_key, acct_no, primary_or_bkup_pay_mthd_ind);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> assignCustomAcctRates(Long client_no, String auth_key, Long acct_no, com.aria.common.shared.CustomAcctRatesArray custom_acct_rates, Long plan_no, Long service_no, String client_plan_id, String client_service_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().assignCustomAcctRates(client_no, auth_key, acct_no, custom_acct_rates, plan_no, service_no, client_plan_id, client_service_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> assignCustomAcctRates(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                com.aria.common.shared.CustomAcctRatesArray custom_acct_rates = (com.aria.common.shared.CustomAcctRatesArray) map.get("custom_acct_rates");
                Long plan_no = (Long) map.get("plan_no");
                Long service_no = (Long) map.get("service_no");
                String client_plan_id = (String) map.get("client_plan_id");
                String client_service_id = (String) map.get("client_service_id");
                
        return assignCustomAcctRates(client_no, auth_key, acct_no, custom_acct_rates, plan_no, service_no, client_plan_id, client_service_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctsWithExistingPayMethod(Long client_no, String auth_key, Long pay_method, String form_payment_acct_id, String bank_routing_num){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_accts_with_pay_method = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctsWithExistingPayMethod(client_no, auth_key, pay_method, form_payment_acct_id, bank_routing_num, h_error_code, h_error_msg, h_accts_with_pay_method);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("accts_with_pay_method",((javax.xml.ws.Holder)h_accts_with_pay_method).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctsWithExistingPayMethod(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long pay_method = (Long) map.get("pay_method");
                String form_payment_acct_id = (String) map.get("form_payment_acct_id");
                String bank_routing_num = (String) map.get("bank_routing_num");
                
        return getAcctsWithExistingPayMethod(client_no, auth_key, pay_method, form_payment_acct_id, bank_routing_num);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> adjustBillingDates(Long client_no, String auth_key, Long acct_no, Long action_directive, Long adjustment_days, String comments){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().adjustBillingDates(client_no, auth_key, acct_no, action_directive, adjustment_days, comments, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> adjustBillingDates(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long action_directive = (Long) map.get("action_directive");
                Long adjustment_days = (Long) map.get("adjustment_days");
                String comments = (String) map.get("comments");
                
        return adjustBillingDates(client_no, auth_key, acct_no, action_directive, adjustment_days, comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> writeAcctComment(Long client_no, String auth_key, Long acct_no, String comment){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().writeAcctComment(client_no, auth_key, acct_no, comment, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> writeAcctComment(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String comment = (String) map.get("comment");
                
        return writeAcctComment(client_no, auth_key, acct_no, comment);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctComments(Long client_no, String auth_key, Long acct_no, String date_range_start, String date_range_end, String do_url_encoding, String filter_application_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_comments = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctComments(client_no, auth_key, acct_no, date_range_start, date_range_end, do_url_encoding, filter_application_id, h_error_code, h_error_msg, h_acct_comments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_comments",((javax.xml.ws.Holder)h_acct_comments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctComments(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String date_range_start = (String) map.get("date_range_start");
                String date_range_end = (String) map.get("date_range_end");
                String do_url_encoding = (String) map.get("do_url_encoding");
                String filter_application_id = (String) map.get("filter_application_id");
                
        return getAcctComments(client_no, auth_key, acct_no, date_range_start, date_range_end, do_url_encoding, filter_application_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> modifyAcctSuppFields(Long client_no, String auth_key, Long acct_no, com.aria.common.shared.AcctSuppFieldsArray acct_supp_fields){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().modifyAcctSuppFields(client_no, auth_key, acct_no, acct_supp_fields, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> modifyAcctSuppFields(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                com.aria.common.shared.AcctSuppFieldsArray acct_supp_fields = (com.aria.common.shared.AcctSuppFieldsArray) map.get("acct_supp_fields");
                
        return modifyAcctSuppFields(client_no, auth_key, acct_no, acct_supp_fields);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> removeCustomAcctRates(Long client_no, String auth_key, Long acct_no, Long plan_no, String client_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().removeCustomAcctRates(client_no, auth_key, acct_no, plan_no, client_plan_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> removeCustomAcctRates(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long plan_no = (Long) map.get("plan_no");
                String client_plan_id = (String) map.get("client_plan_id");
                
        return removeCustomAcctRates(client_no, auth_key, acct_no, plan_no, client_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctStatementHistory(Long client_no, String auth_key, Long acct_no, String user_id, String start_date, String end_date, String include_invoice_activity_eligibility){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_history = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctStatementHistory(client_no, auth_key, acct_no, user_id, start_date, end_date, include_invoice_activity_eligibility, h_error_code, h_error_msg, h_statement_history);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("statement_history",((javax.xml.ws.Holder)h_statement_history).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctStatementHistory(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String user_id = (String) map.get("user_id");
                String start_date = (String) map.get("start_date");
                String end_date = (String) map.get("end_date");
                String include_invoice_activity_eligibility = (String) map.get("include_invoice_activity_eligibility");
                
        return getAcctStatementHistory(client_no, auth_key, acct_no, user_id, start_date, end_date, include_invoice_activity_eligibility);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctStatementHistoryM(Long client_no, String auth_key, Long acct_no, String user_id, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, String start_date, String end_date, String include_invoice_activity_eligibility){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statements_history = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctStatementHistoryM(client_no, auth_key, acct_no, user_id, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, start_date, end_date, include_invoice_activity_eligibility, h_error_code, h_error_msg, h_statements_history);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("statements_history",((javax.xml.ws.Holder)h_statements_history).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctStatementHistoryM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String user_id = (String) map.get("user_id");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                String start_date = (String) map.get("start_date");
                String end_date = (String) map.get("end_date");
                String include_invoice_activity_eligibility = (String) map.get("include_invoice_activity_eligibility");
                
        return getAcctStatementHistoryM(client_no, auth_key, acct_no, user_id, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, start_date, end_date, include_invoice_activity_eligibility);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctInvoiceHistory(Long client_no, String auth_key, Long acct_no, String user_id, String start_bill_date, String end_bill_date, String include_voided, Long posting_status_cd, String posting_user){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_history = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctInvoiceHistory(client_no, auth_key, acct_no, user_id, start_bill_date, end_bill_date, include_voided, posting_status_cd, posting_user, h_error_code, h_error_msg, h_invoice_history);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("invoice_history",((javax.xml.ws.Holder)h_invoice_history).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctInvoiceHistory(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String user_id = (String) map.get("user_id");
                String start_bill_date = (String) map.get("start_bill_date");
                String end_bill_date = (String) map.get("end_bill_date");
                String include_voided = (String) map.get("include_voided");
                Long posting_status_cd = (Long) map.get("posting_status_cd");
                String posting_user = (String) map.get("posting_user");
                
        return getAcctInvoiceHistory(client_no, auth_key, acct_no, user_id, start_bill_date, end_bill_date, include_voided, posting_status_cd, posting_user);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getStatementContent(Long client_no, String auth_key, Long acct_no, Long statement_no, String do_encoding){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_content = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_mime_type = new javax.xml.ws.Holder();

        
        getCompletePort().getStatementContent(client_no, auth_key, acct_no, statement_no, do_encoding, h_error_code, h_error_msg, h_statement_content, h_mime_type);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("statement_content",((javax.xml.ws.Holder)h_statement_content).value);
        getHashMapReturnValues().put("mime_type",((javax.xml.ws.Holder)h_mime_type).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getStatementContent(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long statement_no = (Long) map.get("statement_no");
                String do_encoding = (String) map.get("do_encoding");
                
        return getStatementContent(client_no, auth_key, acct_no, statement_no, do_encoding);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getStatementContentSize(Long client_no, String auth_key, Long acct_no, Long statement_no, String do_encoding){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_num_chars = new javax.xml.ws.Holder();

        
        getCompletePort().getStatementContentSize(client_no, auth_key, acct_no, statement_no, do_encoding, h_error_code, h_error_msg, h_num_chars);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("num_chars",((javax.xml.ws.Holder)h_num_chars).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getStatementContentSize(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long statement_no = (Long) map.get("statement_no");
                String do_encoding = (String) map.get("do_encoding");
                
        return getStatementContentSize(client_no, auth_key, acct_no, statement_no, do_encoding);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctHasOrderedSku(Long client_no, String auth_key, Long acct_no, String sku){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_ordered_ind = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billed_ind = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_paid_ind = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctHasOrderedSku(client_no, auth_key, acct_no, sku, h_error_code, h_error_msg, h_ordered_ind, h_billed_ind, h_paid_ind);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("ordered_ind",((javax.xml.ws.Holder)h_ordered_ind).value);
        getHashMapReturnValues().put("billed_ind",((javax.xml.ws.Holder)h_billed_ind).value);
        getHashMapReturnValues().put("paid_ind",((javax.xml.ws.Holder)h_paid_ind).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctHasOrderedSku(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String sku = (String) map.get("sku");
                
        return getAcctHasOrderedSku(client_no, auth_key, acct_no, sku);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getUseridHasOrderedSku(Long client_no, String auth_key, String user_id, String sku){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_ordered_ind = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billed_ind = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_paid_ind = new javax.xml.ws.Holder();

        
        getCompletePort().getUseridHasOrderedSku(client_no, auth_key, user_id, sku, h_error_code, h_error_msg, h_acct_no, h_ordered_ind, h_billed_ind, h_paid_ind);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_no",((javax.xml.ws.Holder)h_acct_no).value);
        getHashMapReturnValues().put("ordered_ind",((javax.xml.ws.Holder)h_ordered_ind).value);
        getHashMapReturnValues().put("billed_ind",((javax.xml.ws.Holder)h_billed_ind).value);
        getHashMapReturnValues().put("paid_ind",((javax.xml.ws.Holder)h_paid_ind).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getUseridHasOrderedSku(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String user_id = (String) map.get("user_id");
                String sku = (String) map.get("sku");
                
        return getUseridHasOrderedSku(client_no, auth_key, user_id, sku);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> assignSuppPlanMulti(Long client_no, String auth_key, Long acct_no, com.aria.common.shared.SuppPlansToAssignArray supp_plans_to_assign, Long assignment_directive, String do_write, String comments, String client_receipt_id, String alt_proration_start_date, com.aria.common.shared.CouponCodesArray coupon_codes, String effective_date, Long sync_mstr_bill_dates_override, com.aria.common.shared.SuppPlanSurchargesArray supp_plan_surcharges, com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_multi_sp_invoice_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_activation_fee = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_mthly_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_annu_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().assignSuppPlanMulti(client_no, auth_key, acct_no, supp_plans_to_assign, assignment_directive, do_write, comments, client_receipt_id, alt_proration_start_date, coupon_codes, effective_date, sync_mstr_bill_dates_override, supp_plan_surcharges, new_acct_custom_rates, h_error_code, h_error_msg, h_proration_result_amount, h_invoice_no, h_multi_sp_invoice_line_items, h_collection_error_code, h_collection_error_msg, h_statement_error_code, h_statement_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_total_tax_credit, h_total_credit_before_tax, h_total, h_expectd_activation_fee, h_expectd_mthly_recurring_cost, h_expectd_annu_recurring_cost, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proration_result_amount",((javax.xml.ws.Holder)h_proration_result_amount).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("multi_sp_invoice_line_items",((javax.xml.ws.Holder)h_multi_sp_invoice_line_items).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("statement_error_code",((javax.xml.ws.Holder)h_statement_error_code).value);
        getHashMapReturnValues().put("statement_error_msg",((javax.xml.ws.Holder)h_statement_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("total_tax_credit",((javax.xml.ws.Holder)h_total_tax_credit).value);
        getHashMapReturnValues().put("total_credit_before_tax",((javax.xml.ws.Holder)h_total_credit_before_tax).value);
        getHashMapReturnValues().put("total",((javax.xml.ws.Holder)h_total).value);
        getHashMapReturnValues().put("expectd_activation_fee",((javax.xml.ws.Holder)h_expectd_activation_fee).value);
        getHashMapReturnValues().put("expectd_mthly_recurring_cost",((javax.xml.ws.Holder)h_expectd_mthly_recurring_cost).value);
        getHashMapReturnValues().put("expectd_annu_recurring_cost",((javax.xml.ws.Holder)h_expectd_annu_recurring_cost).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> assignSuppPlanMulti(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                com.aria.common.shared.SuppPlansToAssignArray supp_plans_to_assign = (com.aria.common.shared.SuppPlansToAssignArray) map.get("supp_plans_to_assign");
                Long assignment_directive = (Long) map.get("assignment_directive");
                String do_write = (String) map.get("do_write");
                String comments = (String) map.get("comments");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String alt_proration_start_date = (String) map.get("alt_proration_start_date");
                com.aria.common.shared.CouponCodesArray coupon_codes = (com.aria.common.shared.CouponCodesArray) map.get("coupon_codes");
                String effective_date = (String) map.get("effective_date");
                Long sync_mstr_bill_dates_override = (Long) map.get("sync_mstr_bill_dates_override");
                com.aria.common.shared.SuppPlanSurchargesArray supp_plan_surcharges = (com.aria.common.shared.SuppPlanSurchargesArray) map.get("supp_plan_surcharges");
                com.aria.common.shared.NewAcctCustomRatesArray new_acct_custom_rates = (com.aria.common.shared.NewAcctCustomRatesArray) map.get("new_acct_custom_rates");
                
        return assignSuppPlanMulti(client_no, auth_key, acct_no, supp_plans_to_assign, assignment_directive, do_write, comments, client_receipt_id, alt_proration_start_date, coupon_codes, effective_date, sync_mstr_bill_dates_override, supp_plan_surcharges, new_acct_custom_rates);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPaymentMethods(Long client_no, String auth_key, Long acct_no, Long filter_seq_no){
        javax.xml.ws.Holder h_acct_pay_methods = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPaymentMethods(client_no, auth_key, acct_no, filter_seq_no, h_acct_pay_methods, h_error_code, h_error_msg);

        getHashMapReturnValues().put("acct_pay_methods",((javax.xml.ws.Holder)h_acct_pay_methods).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPaymentMethods(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long filter_seq_no = (Long) map.get("filter_seq_no");
                
        return getAcctPaymentMethods(client_no, auth_key, acct_no, filter_seq_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> genStatement(Long client_no, String auth_key, Long acct_no, String send_email){
        javax.xml.ws.Holder h_statement_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_seq_statement_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().genStatement(client_no, auth_key, acct_no, send_email, h_statement_no, h_seq_statement_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("statement_no",((javax.xml.ws.Holder)h_statement_no).value);
        getHashMapReturnValues().put("seq_statement_id",((javax.xml.ws.Holder)h_seq_statement_id).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> genStatement(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String send_email = (String) map.get("send_email");
                
        return genStatement(client_no, auth_key, acct_no, send_email);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> genStatementM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, String send_email){
        javax.xml.ws.Holder h_statement_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_seq_statement_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().genStatementM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, send_email, h_statement_no, h_seq_statement_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("statement_no",((javax.xml.ws.Holder)h_statement_no).value);
        getHashMapReturnValues().put("seq_statement_id",((javax.xml.ws.Holder)h_seq_statement_id).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> genStatementM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                String send_email = (String) map.get("send_email");
                
        return genStatementM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, send_email);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelUnconsumedCredit(Long client_no, String auth_key, Long acct_no, String coupon_cd){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().cancelUnconsumedCredit(client_no, auth_key, acct_no, coupon_cd, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelUnconsumedCredit(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String coupon_cd = (String) map.get("coupon_cd");
                
        return cancelUnconsumedCredit(client_no, auth_key, acct_no, coupon_cd);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelUnappliedSvceCredits(Long client_no, String auth_key, Long acct_no, com.aria.common.shared.CreditIdsArray credit_ids){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().cancelUnappliedSvceCredits(client_no, auth_key, acct_no, credit_ids, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelUnappliedSvceCredits(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                com.aria.common.shared.CreditIdsArray credit_ids = (com.aria.common.shared.CreditIdsArray) map.get("credit_ids");
                
        return cancelUnappliedSvceCredits(client_no, auth_key, acct_no, credit_ids);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctBalance(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_currency_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_balance = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctBalance(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_currency_cd, h_balance);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("currency_cd",((javax.xml.ws.Holder)h_currency_cd).value);
        getHashMapReturnValues().put("balance",((javax.xml.ws.Holder)h_balance).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctBalance(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAcctBalance(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getUnbilledUsageSummary(Long client_no, String auth_key, Long acct_no, String usage_details_flag, String include_all_usage_unit_thresholds, Long plan_no, Long usage_type_no, String usage_type_code, String retrieve_excluded_usage){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_currency_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_currency_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_mtd_threshold_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_ptd_threshold_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_mtd_threshold_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_ptd_threshold_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_mtd_balance_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_ptd_balance_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_mtd_delta_sign = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_mtd_delta_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_ptd_delta_sign = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_ptd_delta_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_mtd_delta_sign = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_mtd_delta_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_ptd_delta_sign = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_ptd_delta_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unapp_svc_credit_bal_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unapp_svc_credit_delta_sign = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unapp_svc_credit_delta_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unbilled_usage_recs = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unit_threshold_details = new javax.xml.ws.Holder();

        
        getCompletePort().getUnbilledUsageSummary(client_no, auth_key, acct_no, usage_details_flag, include_all_usage_unit_thresholds, plan_no, usage_type_no, usage_type_code, retrieve_excluded_usage, h_error_code, h_error_msg, h_currency_cd, h_currency_name, h_acct_mtd_threshold_amount, h_acct_ptd_threshold_amount, h_client_mtd_threshold_amount, h_client_ptd_threshold_amount, h_mtd_balance_amount, h_ptd_balance_amount, h_acct_mtd_delta_sign, h_acct_mtd_delta_amount, h_acct_ptd_delta_sign, h_acct_ptd_delta_amount, h_client_mtd_delta_sign, h_client_mtd_delta_amount, h_client_ptd_delta_sign, h_client_ptd_delta_amount, h_unapp_svc_credit_bal_amount, h_unapp_svc_credit_delta_sign, h_unapp_svc_credit_delta_amount, h_unbilled_usage_recs, h_unit_threshold_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("currency_cd",((javax.xml.ws.Holder)h_currency_cd).value);
        getHashMapReturnValues().put("currency_name",((javax.xml.ws.Holder)h_currency_name).value);
        getHashMapReturnValues().put("acct_mtd_threshold_amount",((javax.xml.ws.Holder)h_acct_mtd_threshold_amount).value);
        getHashMapReturnValues().put("acct_ptd_threshold_amount",((javax.xml.ws.Holder)h_acct_ptd_threshold_amount).value);
        getHashMapReturnValues().put("client_mtd_threshold_amount",((javax.xml.ws.Holder)h_client_mtd_threshold_amount).value);
        getHashMapReturnValues().put("client_ptd_threshold_amount",((javax.xml.ws.Holder)h_client_ptd_threshold_amount).value);
        getHashMapReturnValues().put("mtd_balance_amount",((javax.xml.ws.Holder)h_mtd_balance_amount).value);
        getHashMapReturnValues().put("ptd_balance_amount",((javax.xml.ws.Holder)h_ptd_balance_amount).value);
        getHashMapReturnValues().put("acct_mtd_delta_sign",((javax.xml.ws.Holder)h_acct_mtd_delta_sign).value);
        getHashMapReturnValues().put("acct_mtd_delta_amount",((javax.xml.ws.Holder)h_acct_mtd_delta_amount).value);
        getHashMapReturnValues().put("acct_ptd_delta_sign",((javax.xml.ws.Holder)h_acct_ptd_delta_sign).value);
        getHashMapReturnValues().put("acct_ptd_delta_amount",((javax.xml.ws.Holder)h_acct_ptd_delta_amount).value);
        getHashMapReturnValues().put("client_mtd_delta_sign",((javax.xml.ws.Holder)h_client_mtd_delta_sign).value);
        getHashMapReturnValues().put("client_mtd_delta_amount",((javax.xml.ws.Holder)h_client_mtd_delta_amount).value);
        getHashMapReturnValues().put("client_ptd_delta_sign",((javax.xml.ws.Holder)h_client_ptd_delta_sign).value);
        getHashMapReturnValues().put("client_ptd_delta_amount",((javax.xml.ws.Holder)h_client_ptd_delta_amount).value);
        getHashMapReturnValues().put("unapp_svc_credit_bal_amount",((javax.xml.ws.Holder)h_unapp_svc_credit_bal_amount).value);
        getHashMapReturnValues().put("unapp_svc_credit_delta_sign",((javax.xml.ws.Holder)h_unapp_svc_credit_delta_sign).value);
        getHashMapReturnValues().put("unapp_svc_credit_delta_amount",((javax.xml.ws.Holder)h_unapp_svc_credit_delta_amount).value);
        getHashMapReturnValues().put("unbilled_usage_recs",((javax.xml.ws.Holder)h_unbilled_usage_recs).value);
        getHashMapReturnValues().put("unit_threshold_details",((javax.xml.ws.Holder)h_unit_threshold_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getUnbilledUsageSummary(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String usage_details_flag = (String) map.get("usage_details_flag");
                String include_all_usage_unit_thresholds = (String) map.get("include_all_usage_unit_thresholds");
                Long plan_no = (Long) map.get("plan_no");
                Long usage_type_no = (Long) map.get("usage_type_no");
                String usage_type_code = (String) map.get("usage_type_code");
                String retrieve_excluded_usage = (String) map.get("retrieve_excluded_usage");
                
        return getUnbilledUsageSummary(client_no, auth_key, acct_no, usage_details_flag, include_all_usage_unit_thresholds, plan_no, usage_type_no, usage_type_code, retrieve_excluded_usage);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setAcctUsgMtdThreshold(Long client_no, String auth_key, Long acct_no, Double amount, com.aria.common.shared.UsageUnitThresholdsArray usage_unit_thresholds){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setAcctUsgMtdThreshold(client_no, auth_key, acct_no, amount, usage_unit_thresholds, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setAcctUsgMtdThreshold(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Double amount = (Double) map.get("amount");
                com.aria.common.shared.UsageUnitThresholdsArray usage_unit_thresholds = (com.aria.common.shared.UsageUnitThresholdsArray) map.get("usage_unit_thresholds");
                
        return setAcctUsgMtdThreshold(client_no, auth_key, acct_no, amount, usage_unit_thresholds);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setAcctUsgPtdThreshold(Long client_no, String auth_key, Long acct_no, Double amount, com.aria.common.shared.UsageUnitThresholdsArray usage_unit_thresholds){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setAcctUsgPtdThreshold(client_no, auth_key, acct_no, amount, usage_unit_thresholds, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setAcctUsgPtdThreshold(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Double amount = (Double) map.get("amount");
                com.aria.common.shared.UsageUnitThresholdsArray usage_unit_thresholds = (com.aria.common.shared.UsageUnitThresholdsArray) map.get("usage_unit_thresholds");
                
        return setAcctUsgPtdThreshold(client_no, auth_key, acct_no, amount, usage_unit_thresholds);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setClientUsgMtdThreshold(Long client_no, String auth_key, Long acct_no, Double amount, com.aria.common.shared.UsageUnitThresholdsArray usage_unit_thresholds){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setClientUsgMtdThreshold(client_no, auth_key, acct_no, amount, usage_unit_thresholds, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setClientUsgMtdThreshold(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Double amount = (Double) map.get("amount");
                com.aria.common.shared.UsageUnitThresholdsArray usage_unit_thresholds = (com.aria.common.shared.UsageUnitThresholdsArray) map.get("usage_unit_thresholds");
                
        return setClientUsgMtdThreshold(client_no, auth_key, acct_no, amount, usage_unit_thresholds);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setClientUsgPtdThreshold(Long client_no, String auth_key, Long acct_no, Double amount, com.aria.common.shared.UsageUnitThresholdsArray usage_unit_thresholds){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setClientUsgPtdThreshold(client_no, auth_key, acct_no, amount, usage_unit_thresholds, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setClientUsgPtdThreshold(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Double amount = (Double) map.get("amount");
                com.aria.common.shared.UsageUnitThresholdsArray usage_unit_thresholds = (com.aria.common.shared.UsageUnitThresholdsArray) map.get("usage_unit_thresholds");
                
        return setClientUsgPtdThreshold(client_no, auth_key, acct_no, amount, usage_unit_thresholds);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> resetUsgMtdBal(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().resetUsgMtdBal(client_no, auth_key, acct_no, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> resetUsgMtdBal(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return resetUsgMtdBal(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> resetUsgPtdBal(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().resetUsgPtdBal(client_no, auth_key, acct_no, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> resetUsgPtdBal(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return resetUsgPtdBal(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctMultiplanContract(Long client_no, String auth_key, Long acct_no, Long contract_no, String exclude_terminated_plans){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_type_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_length_months = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_create_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_update_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_create_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_update_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_start_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_end_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plan_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plan_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_plan_id = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctMultiplanContract(client_no, auth_key, acct_no, contract_no, exclude_terminated_plans, h_error_code, h_error_msg, h_type_no, h_length_months, h_create_comments, h_update_comments, h_create_date, h_update_date, h_start_date, h_end_date, h_status_code, h_plan_no, h_plan_name, h_client_plan_id);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("type_no",((javax.xml.ws.Holder)h_type_no).value);
        getHashMapReturnValues().put("length_months",((javax.xml.ws.Holder)h_length_months).value);
        getHashMapReturnValues().put("create_comments",((javax.xml.ws.Holder)h_create_comments).value);
        getHashMapReturnValues().put("update_comments",((javax.xml.ws.Holder)h_update_comments).value);
        getHashMapReturnValues().put("create_date",((javax.xml.ws.Holder)h_create_date).value);
        getHashMapReturnValues().put("update_date",((javax.xml.ws.Holder)h_update_date).value);
        getHashMapReturnValues().put("start_date",((javax.xml.ws.Holder)h_start_date).value);
        getHashMapReturnValues().put("end_date",((javax.xml.ws.Holder)h_end_date).value);
        getHashMapReturnValues().put("status_code",((javax.xml.ws.Holder)h_status_code).value);
        getHashMapReturnValues().put("plan_no",((javax.xml.ws.Holder)h_plan_no).value);
        getHashMapReturnValues().put("plan_name",((javax.xml.ws.Holder)h_plan_name).value);
        getHashMapReturnValues().put("client_plan_id",((javax.xml.ws.Holder)h_client_plan_id).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctMultiplanContract(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long contract_no = (Long) map.get("contract_no");
                String exclude_terminated_plans = (String) map.get("exclude_terminated_plans");
                
        return getAcctMultiplanContract(client_no, auth_key, acct_no, contract_no, exclude_terminated_plans);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createAcctMultiplanContract(Long client_no, String auth_key, Long acct_no, Long length_months, String end_date, com.aria.common.shared.PlanNoArray plan_no, Long type_no, String create_comments, String start_date, String do_auto_discard, com.aria.common.shared.ClientPlanIdArray client_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_contract_no = new javax.xml.ws.Holder();

        
        getCompletePort().createAcctMultiplanContract(client_no, auth_key, acct_no, length_months, end_date, plan_no, type_no, create_comments, start_date, do_auto_discard, client_plan_id, h_error_code, h_error_msg, h_contract_no);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("contract_no",((javax.xml.ws.Holder)h_contract_no).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createAcctMultiplanContract(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long length_months = (Long) map.get("length_months");
                String end_date = (String) map.get("end_date");
                com.aria.common.shared.PlanNoArray plan_no = (com.aria.common.shared.PlanNoArray) map.get("plan_no");
                Long type_no = (Long) map.get("type_no");
                String create_comments = (String) map.get("create_comments");
                String start_date = (String) map.get("start_date");
                String do_auto_discard = (String) map.get("do_auto_discard");
                com.aria.common.shared.ClientPlanIdArray client_plan_id = (com.aria.common.shared.ClientPlanIdArray) map.get("client_plan_id");
                
        return createAcctMultiplanContract(client_no, auth_key, acct_no, length_months, end_date, plan_no, type_no, create_comments, start_date, do_auto_discard, client_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> modifyAcctMultiplanContract(Long client_no, String auth_key, Long acct_no, Long contract_no, Long type_no, Long length_months, String start_date, String update_comments, Long modify_directive, com.aria.common.shared.PlansInputArray plans_input, String end_date, com.aria.common.shared.ClientPlanIdArray client_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().modifyAcctMultiplanContract(client_no, auth_key, acct_no, contract_no, type_no, length_months, start_date, update_comments, modify_directive, plans_input, end_date, client_plan_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> modifyAcctMultiplanContract(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long contract_no = (Long) map.get("contract_no");
                Long type_no = (Long) map.get("type_no");
                Long length_months = (Long) map.get("length_months");
                String start_date = (String) map.get("start_date");
                String update_comments = (String) map.get("update_comments");
                Long modify_directive = (Long) map.get("modify_directive");
                com.aria.common.shared.PlansInputArray plans_input = (com.aria.common.shared.PlansInputArray) map.get("plans_input");
                String end_date = (String) map.get("end_date");
                com.aria.common.shared.ClientPlanIdArray client_plan_id = (com.aria.common.shared.ClientPlanIdArray) map.get("client_plan_id");
                
        return modifyAcctMultiplanContract(client_no, auth_key, acct_no, contract_no, type_no, length_months, start_date, update_comments, modify_directive, plans_input, end_date, client_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelAcctMultiplanContract(Long client_no, String auth_key, Long acct_no, Long contract_no, String update_comments, Long close_status){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().cancelAcctMultiplanContract(client_no, auth_key, acct_no, contract_no, update_comments, close_status, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelAcctMultiplanContract(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long contract_no = (Long) map.get("contract_no");
                String update_comments = (String) map.get("update_comments");
                Long close_status = (Long) map.get("close_status");
                
        return cancelAcctMultiplanContract(client_no, auth_key, acct_no, contract_no, update_comments, close_status);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctUniversalContract(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_type_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_length_months = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_create_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_update_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_create_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_update_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_start_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_end_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_contract_no = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctUniversalContract(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_type_no, h_length_months, h_create_comments, h_update_comments, h_create_date, h_update_date, h_start_date, h_end_date, h_status_code, h_contract_no);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("type_no",((javax.xml.ws.Holder)h_type_no).value);
        getHashMapReturnValues().put("length_months",((javax.xml.ws.Holder)h_length_months).value);
        getHashMapReturnValues().put("create_comments",((javax.xml.ws.Holder)h_create_comments).value);
        getHashMapReturnValues().put("update_comments",((javax.xml.ws.Holder)h_update_comments).value);
        getHashMapReturnValues().put("create_date",((javax.xml.ws.Holder)h_create_date).value);
        getHashMapReturnValues().put("update_date",((javax.xml.ws.Holder)h_update_date).value);
        getHashMapReturnValues().put("start_date",((javax.xml.ws.Holder)h_start_date).value);
        getHashMapReturnValues().put("end_date",((javax.xml.ws.Holder)h_end_date).value);
        getHashMapReturnValues().put("status_code",((javax.xml.ws.Holder)h_status_code).value);
        getHashMapReturnValues().put("contract_no",((javax.xml.ws.Holder)h_contract_no).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctUniversalContract(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAcctUniversalContract(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createAcctUniversalContract(Long client_no, String auth_key, Long acct_no, Long length_months, String end_date, Long type_no, String create_comments, String start_date){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_contract_no = new javax.xml.ws.Holder();

        
        getCompletePort().createAcctUniversalContract(client_no, auth_key, acct_no, length_months, end_date, type_no, create_comments, start_date, h_error_code, h_error_msg, h_contract_no);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("contract_no",((javax.xml.ws.Holder)h_contract_no).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createAcctUniversalContract(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long length_months = (Long) map.get("length_months");
                String end_date = (String) map.get("end_date");
                Long type_no = (Long) map.get("type_no");
                String create_comments = (String) map.get("create_comments");
                String start_date = (String) map.get("start_date");
                
        return createAcctUniversalContract(client_no, auth_key, acct_no, length_months, end_date, type_no, create_comments, start_date);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> modifyAcctUniversalContract(Long client_no, String auth_key, Long acct_no, Long contract_no, Long type_no, Long length_months, String start_date, String update_comments, String end_date){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().modifyAcctUniversalContract(client_no, auth_key, acct_no, contract_no, type_no, length_months, start_date, update_comments, end_date, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> modifyAcctUniversalContract(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long contract_no = (Long) map.get("contract_no");
                Long type_no = (Long) map.get("type_no");
                Long length_months = (Long) map.get("length_months");
                String start_date = (String) map.get("start_date");
                String update_comments = (String) map.get("update_comments");
                String end_date = (String) map.get("end_date");
                
        return modifyAcctUniversalContract(client_no, auth_key, acct_no, contract_no, type_no, length_months, start_date, update_comments, end_date);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelAcctUniversalContract(Long client_no, String auth_key, Long acct_no, String update_comments, Long close_status){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().cancelAcctUniversalContract(client_no, auth_key, acct_no, update_comments, close_status, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelAcctUniversalContract(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String update_comments = (String) map.get("update_comments");
                Long close_status = (Long) map.get("close_status");
                
        return cancelAcctUniversalContract(client_no, auth_key, acct_no, update_comments, close_status);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctHierarchyDetails(Long client_no, String auth_key, Long acct_no, Long hierarchy_filter, Long include_current_acct){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_hierarchy_details = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctHierarchyDetails(client_no, auth_key, acct_no, hierarchy_filter, include_current_acct, h_error_code, h_error_msg, h_acct_hierarchy_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_hierarchy_details",((javax.xml.ws.Holder)h_acct_hierarchy_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctHierarchyDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long hierarchy_filter = (Long) map.get("hierarchy_filter");
                Long include_current_acct = (Long) map.get("include_current_acct");
                
        return getAcctHierarchyDetails(client_no, auth_key, acct_no, hierarchy_filter, include_current_acct);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAllAcctContracts(Long client_no, String auth_key, Long acct_no, Long filter_status_code, String exclude_terminated_plans){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_acct_contracts = new javax.xml.ws.Holder();

        
        getCompletePort().getAllAcctContracts(client_no, auth_key, acct_no, filter_status_code, exclude_terminated_plans, h_error_code, h_error_msg, h_all_acct_contracts);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_acct_contracts",((javax.xml.ws.Holder)h_all_acct_contracts).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAllAcctContracts(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long filter_status_code = (Long) map.get("filter_status_code");
                String exclude_terminated_plans = (String) map.get("exclude_terminated_plans");
                
        return getAllAcctContracts(client_no, auth_key, acct_no, filter_status_code, exclude_terminated_plans);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setAcctNotifyOverride(Long client_no, String auth_key, Long acct_no, String acct_user_id, String client_acct_id, String template_class, Long override_template_no, Long behavioral_option, Long override_template_option){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setAcctNotifyOverride(client_no, auth_key, acct_no, acct_user_id, client_acct_id, template_class, override_template_no, behavioral_option, override_template_option, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setAcctNotifyOverride(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String acct_user_id = (String) map.get("acct_user_id");
                String client_acct_id = (String) map.get("client_acct_id");
                String template_class = (String) map.get("template_class");
                Long override_template_no = (Long) map.get("override_template_no");
                Long behavioral_option = (Long) map.get("behavioral_option");
                Long override_template_option = (Long) map.get("override_template_option");
                
        return setAcctNotifyOverride(client_no, auth_key, acct_no, acct_user_id, client_acct_id, template_class, override_template_no, behavioral_option, override_template_option);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setAcctNotifyTmpltGrp(Long client_no, String auth_key, Long acct_no, String acct_user_id, String client_acct_id, String notification_template_group_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setAcctNotifyTmpltGrp(client_no, auth_key, acct_no, acct_user_id, client_acct_id, notification_template_group_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setAcctNotifyTmpltGrp(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String acct_user_id = (String) map.get("acct_user_id");
                String client_acct_id = (String) map.get("client_acct_id");
                String notification_template_group_id = (String) map.get("notification_template_group_id");
                
        return setAcctNotifyTmpltGrp(client_no, auth_key, acct_no, acct_user_id, client_acct_id, notification_template_group_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctNotificationDetails(Long client_no, String auth_key, Long acct_no, String acct_user_id, String client_acct_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_notification_details = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctNotificationDetails(client_no, auth_key, acct_no, acct_user_id, client_acct_id, h_error_code, h_error_msg, h_acct_notification_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_notification_details",((javax.xml.ws.Holder)h_acct_notification_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctNotificationDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String acct_user_id = (String) map.get("acct_user_id");
                String client_acct_id = (String) map.get("client_acct_id");
                
        return getAcctNotificationDetails(client_no, auth_key, acct_no, acct_user_id, client_acct_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctCredits(Long client_no, String auth_key, Long acct_no, Long limit_records){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_credits = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctCredits(client_no, auth_key, acct_no, limit_records, h_error_code, h_error_msg, h_acct_credits);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_credits",((javax.xml.ws.Holder)h_acct_credits).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctCredits(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long limit_records = (Long) map.get("limit_records");
                
        return getAcctCredits(client_no, auth_key, acct_no, limit_records);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctCreditDetails(Long client_no, String auth_key, Long acct_no, Long credit_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_created_by = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_created_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_credit_type = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_applied_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unapplied_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_reason_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_reason_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_void_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_credit_expiry_type_ind = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_credit_expiry_months = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_credit_expiry_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_eligible_service_plan_details = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctCreditDetails(client_no, auth_key, acct_no, credit_no, h_error_code, h_error_msg, h_created_by, h_created_date, h_amount, h_credit_type, h_applied_amount, h_unapplied_amount, h_reason_code, h_reason_text, h_comments, h_transaction_id, h_void_transaction_id, h_credit_expiry_type_ind, h_credit_expiry_months, h_credit_expiry_date, h_eligible_service_plan_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("created_by",((javax.xml.ws.Holder)h_created_by).value);
        getHashMapReturnValues().put("created_date",((javax.xml.ws.Holder)h_created_date).value);
        getHashMapReturnValues().put("amount",((javax.xml.ws.Holder)h_amount).value);
        getHashMapReturnValues().put("credit_type",((javax.xml.ws.Holder)h_credit_type).value);
        getHashMapReturnValues().put("applied_amount",((javax.xml.ws.Holder)h_applied_amount).value);
        getHashMapReturnValues().put("unapplied_amount",((javax.xml.ws.Holder)h_unapplied_amount).value);
        getHashMapReturnValues().put("reason_code",((javax.xml.ws.Holder)h_reason_code).value);
        getHashMapReturnValues().put("reason_text",((javax.xml.ws.Holder)h_reason_text).value);
        getHashMapReturnValues().put("comments",((javax.xml.ws.Holder)h_comments).value);
        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("void_transaction_id",((javax.xml.ws.Holder)h_void_transaction_id).value);
        getHashMapReturnValues().put("credit_expiry_type_ind",((javax.xml.ws.Holder)h_credit_expiry_type_ind).value);
        getHashMapReturnValues().put("credit_expiry_months",((javax.xml.ws.Holder)h_credit_expiry_months).value);
        getHashMapReturnValues().put("credit_expiry_date",((javax.xml.ws.Holder)h_credit_expiry_date).value);
        getHashMapReturnValues().put("eligible_service_plan_details",((javax.xml.ws.Holder)h_eligible_service_plan_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctCreditDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long credit_no = (Long) map.get("credit_no");
                
        return getAcctCreditDetails(client_no, auth_key, acct_no, credit_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getCreditReasonCodes(Long client_no, String auth_key){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_credit_reason_codes = new javax.xml.ws.Holder();

        
        getCompletePort().getCreditReasonCodes(client_no, auth_key, h_error_code, h_error_msg, h_credit_reason_codes);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("credit_reason_codes",((javax.xml.ws.Holder)h_credit_reason_codes).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getCreditReasonCodes(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return getCreditReasonCodes(client_no, auth_key);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> savePaypalBillAgreement(Long client_no, String auth_key, Long acct_no, String token){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().savePaypalBillAgreement(client_no, auth_key, acct_no, token, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> savePaypalBillAgreement(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String token = (String) map.get("token");
                
        return savePaypalBillAgreement(client_no, auth_key, acct_no, token);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> savePaypalBillAgreementM(Long client_no, String auth_key, Long acct_no, Long billing_group_no, String client_billing_group_id, Long master_plan_instance_no, String client_master_plan_instance_id, String token){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().savePaypalBillAgreementM(client_no, auth_key, acct_no, billing_group_no, client_billing_group_id, master_plan_instance_no, client_master_plan_instance_id, token, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> savePaypalBillAgreementM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long billing_group_no = (Long) map.get("billing_group_no");
                String client_billing_group_id = (String) map.get("client_billing_group_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                String token = (String) map.get("token");
                
        return savePaypalBillAgreementM(client_no, auth_key, acct_no, billing_group_no, client_billing_group_id, master_plan_instance_no, client_master_plan_instance_id, token);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> initPaypalBillAgreement(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_return_url = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_token = new javax.xml.ws.Holder();

        
        getCompletePort().initPaypalBillAgreement(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_return_url, h_token);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("return_url",((javax.xml.ws.Holder)h_return_url).value);
        getHashMapReturnValues().put("token",((javax.xml.ws.Holder)h_token).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> initPaypalBillAgreement(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return initPaypalBillAgreement(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctServiceOutageCredit(Long client_no, String auth_key, Long acct_no, String outage_start_date, String outage_end_date, String outage_start_time, String outage_end_time, com.aria.common.shared.PlansToGetOutageArray plans_to_get_outage, Double adjust_percent, com.aria.common.shared.ClientPlanIdsToGetOutageArray client_plan_ids_to_get_outage){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_no = new javax.xml.ws.Holder(acct_no);
        javax.xml.ws.Holder h_service_outage_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_outage_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_adjusted_outage_credit = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctServiceOutageCredit(client_no, auth_key, h_acct_no, outage_start_date, outage_end_date, outage_start_time, outage_end_time, plans_to_get_outage, adjust_percent, client_plan_ids_to_get_outage, h_error_code, h_error_msg, h_service_outage_line_items, h_total_outage_credit, h_adjusted_outage_credit);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_no",((javax.xml.ws.Holder)h_acct_no).value);
        getHashMapReturnValues().put("service_outage_line_items",((javax.xml.ws.Holder)h_service_outage_line_items).value);
        getHashMapReturnValues().put("total_outage_credit",((javax.xml.ws.Holder)h_total_outage_credit).value);
        getHashMapReturnValues().put("adjusted_outage_credit",((javax.xml.ws.Holder)h_adjusted_outage_credit).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctServiceOutageCredit(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String outage_start_date = (String) map.get("outage_start_date");
                String outage_end_date = (String) map.get("outage_end_date");
                String outage_start_time = (String) map.get("outage_start_time");
                String outage_end_time = (String) map.get("outage_end_time");
                com.aria.common.shared.PlansToGetOutageArray plans_to_get_outage = (com.aria.common.shared.PlansToGetOutageArray) map.get("plans_to_get_outage");
                Double adjust_percent = (Double) map.get("adjust_percent");
                com.aria.common.shared.ClientPlanIdsToGetOutageArray client_plan_ids_to_get_outage = (com.aria.common.shared.ClientPlanIdsToGetOutageArray) map.get("client_plan_ids_to_get_outage");
                
        return getAcctServiceOutageCredit(client_no, auth_key, acct_no, outage_start_date, outage_end_date, outage_start_time, outage_end_time, plans_to_get_outage, adjust_percent, client_plan_ids_to_get_outage);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getUsageSummaryByType(Long client_no, String auth_key, Long acct_no, String user_id, Long usage_type_filter, String date_filter_start_date, String date_filter_start_time, String date_filter_end_date, String date_filter_end_time, Long billed_filter, Long billing_period_flag, com.aria.common.shared.UsageQualifier1Array usage_qualifier_1, com.aria.common.shared.UsageQualifier2Array usage_qualifier_2, com.aria.common.shared.UsageQualifier3Array usage_qualifier_3, com.aria.common.shared.UsageQualifier4Array usage_qualifier_4, String usage_type_cd_filter, String retrieve_excluded_usage){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_start_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_start_time = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_end_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_end_time = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_usage_summary_records = new javax.xml.ws.Holder();

        
        getCompletePort().getUsageSummaryByType(client_no, auth_key, acct_no, user_id, usage_type_filter, date_filter_start_date, date_filter_start_time, date_filter_end_date, date_filter_end_time, billed_filter, billing_period_flag, usage_qualifier_1, usage_qualifier_2, usage_qualifier_3, usage_qualifier_4, usage_type_cd_filter, retrieve_excluded_usage, h_error_code, h_error_msg, h_start_date, h_start_time, h_end_date, h_end_time, h_usage_summary_records);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("start_date",((javax.xml.ws.Holder)h_start_date).value);
        getHashMapReturnValues().put("start_time",((javax.xml.ws.Holder)h_start_time).value);
        getHashMapReturnValues().put("end_date",((javax.xml.ws.Holder)h_end_date).value);
        getHashMapReturnValues().put("end_time",((javax.xml.ws.Holder)h_end_time).value);
        getHashMapReturnValues().put("usage_summary_records",((javax.xml.ws.Holder)h_usage_summary_records).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getUsageSummaryByType(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String user_id = (String) map.get("user_id");
                Long usage_type_filter = (Long) map.get("usage_type_filter");
                String date_filter_start_date = (String) map.get("date_filter_start_date");
                String date_filter_start_time = (String) map.get("date_filter_start_time");
                String date_filter_end_date = (String) map.get("date_filter_end_date");
                String date_filter_end_time = (String) map.get("date_filter_end_time");
                Long billed_filter = (Long) map.get("billed_filter");
                Long billing_period_flag = (Long) map.get("billing_period_flag");
                com.aria.common.shared.UsageQualifier1Array usage_qualifier_1 = (com.aria.common.shared.UsageQualifier1Array) map.get("usage_qualifier_1");
                com.aria.common.shared.UsageQualifier2Array usage_qualifier_2 = (com.aria.common.shared.UsageQualifier2Array) map.get("usage_qualifier_2");
                com.aria.common.shared.UsageQualifier3Array usage_qualifier_3 = (com.aria.common.shared.UsageQualifier3Array) map.get("usage_qualifier_3");
                com.aria.common.shared.UsageQualifier4Array usage_qualifier_4 = (com.aria.common.shared.UsageQualifier4Array) map.get("usage_qualifier_4");
                String usage_type_cd_filter = (String) map.get("usage_type_cd_filter");
                String retrieve_excluded_usage = (String) map.get("retrieve_excluded_usage");
                
        return getUsageSummaryByType(client_no, auth_key, acct_no, user_id, usage_type_filter, date_filter_start_date, date_filter_start_time, date_filter_end_date, date_filter_end_time, billed_filter, billing_period_flag, usage_qualifier_1, usage_qualifier_2, usage_qualifier_3, usage_qualifier_4, usage_type_cd_filter, retrieve_excluded_usage);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctOpenCharges(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_open_charge_items = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctOpenCharges(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_total_amount, h_open_charge_items);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("total_amount",((javax.xml.ws.Holder)h_total_amount).value);
        getHashMapReturnValues().put("open_charge_items",((javax.xml.ws.Holder)h_open_charge_items).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctOpenCharges(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAcctOpenCharges(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createAcctCompleteM(Long client_no, String auth_key, String do_write, String client_receipt_id, com.aria.common.shared.AcctArray acct){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_acct = new javax.xml.ws.Holder();

        
        getCompletePort().createAcctCompleteM(client_no, auth_key, do_write, client_receipt_id, acct, h_error_code, h_error_msg, h_out_acct);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("out_acct",((javax.xml.ws.Holder)h_out_acct).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createAcctCompleteM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String do_write = (String) map.get("do_write");
                String client_receipt_id = (String) map.get("client_receipt_id");
                com.aria.common.shared.AcctArray acct = (com.aria.common.shared.AcctArray) map.get("acct");
                
        return createAcctCompleteM(client_no, auth_key, do_write, client_receipt_id, acct);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> acctPlanInstallCompleteM(Long client_no, String auth_key, Long acct_no, Long master_plan_instance_no, String client_master_plan_instance_id, String install_complete_ind, String comments){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().acctPlanInstallCompleteM(client_no, auth_key, acct_no, master_plan_instance_no, client_master_plan_instance_id, install_complete_ind, comments, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> acctPlanInstallCompleteM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                String install_complete_ind = (String) map.get("install_complete_ind");
                String comments = (String) map.get("comments");
                
        return acctPlanInstallCompleteM(client_no, auth_key, acct_no, master_plan_instance_no, client_master_plan_instance_id, install_complete_ind, comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPaymentMethodsM(Long client_no, String auth_key, Long acct_no, Long payment_method_no, Long filter_status){
        javax.xml.ws.Holder h_account_payment_methods = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPaymentMethodsM(client_no, auth_key, acct_no, payment_method_no, filter_status, h_account_payment_methods, h_error_code, h_error_msg);

        getHashMapReturnValues().put("account_payment_methods",((javax.xml.ws.Holder)h_account_payment_methods).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPaymentMethodsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long payment_method_no = (Long) map.get("payment_method_no");
                Long filter_status = (Long) map.get("filter_status");
                
        return getAcctPaymentMethodsM(client_no, auth_key, acct_no, payment_method_no, filter_status);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updatePaymentMethodM(Long client_no, String auth_key, Long acct_no, Long payment_method_no, String client_payment_method_id, Long disabled_ind, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_company_name, String bill_address1, String bill_address2, String bill_address3, String bill_city, String bill_locality, String bill_state_prov, String bill_country, String bill_postal_cd, String bill_phone, String bill_phone_ext, String bill_cell_phone, String bill_work_phone, String bill_work_phone_ext, String bill_fax, String bill_email, String bill_birthdate, String pay_method_name, String pay_method_description, Long pay_method_type, String cc_num, Long cc_expire_mm, Long cc_expire_yyyy, String cvv, String bank_acct_num, String bank_routing_num, String bill_agreement_id, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd, String do_collect, String change_status_after_coll, String reset_dates_after_status, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_seq_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_info = new javax.xml.ws.Holder();

        
        getCompletePort().updatePaymentMethodM(client_no, auth_key, acct_no, payment_method_no, client_payment_method_id, disabled_ind, bill_first_name, bill_middle_initial, bill_last_name, bill_company_name, bill_address1, bill_address2, bill_address3, bill_city, bill_locality, bill_state_prov, bill_country, bill_postal_cd, bill_phone, bill_phone_ext, bill_cell_phone, bill_work_phone, bill_work_phone_ext, bill_fax, bill_email, bill_birthdate, pay_method_name, pay_method_description, pay_method_type, cc_num, cc_expire_mm, cc_expire_yyyy, cvv, bank_acct_num, bank_routing_num, bill_agreement_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, do_collect, change_status_after_coll, reset_dates_after_status, client_receipt_id, h_error_code, h_error_msg, h_seq_no, h_collection_info);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("seq_no",((javax.xml.ws.Holder)h_seq_no).value);
        getHashMapReturnValues().put("collection_info",((javax.xml.ws.Holder)h_collection_info).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updatePaymentMethodM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long payment_method_no = (Long) map.get("payment_method_no");
                String client_payment_method_id = (String) map.get("client_payment_method_id");
                Long disabled_ind = (Long) map.get("disabled_ind");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_address3 = (String) map.get("bill_address3");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_country = (String) map.get("bill_country");
                String bill_postal_cd = (String) map.get("bill_postal_cd");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_ext = (String) map.get("bill_phone_ext");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_ext = (String) map.get("bill_work_phone_ext");
                String bill_fax = (String) map.get("bill_fax");
                String bill_email = (String) map.get("bill_email");
                String bill_birthdate = (String) map.get("bill_birthdate");
                String pay_method_name = (String) map.get("pay_method_name");
                String pay_method_description = (String) map.get("pay_method_description");
                Long pay_method_type = (Long) map.get("pay_method_type");
                String cc_num = (String) map.get("cc_num");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String cvv = (String) map.get("cvv");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bill_agreement_id = (String) map.get("bill_agreement_id");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                String do_collect = (String) map.get("do_collect");
                String change_status_after_coll = (String) map.get("change_status_after_coll");
                String reset_dates_after_status = (String) map.get("reset_dates_after_status");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return updatePaymentMethodM(client_no, auth_key, acct_no, payment_method_no, client_payment_method_id, disabled_ind, bill_first_name, bill_middle_initial, bill_last_name, bill_company_name, bill_address1, bill_address2, bill_address3, bill_city, bill_locality, bill_state_prov, bill_country, bill_postal_cd, bill_phone, bill_phone_ext, bill_cell_phone, bill_work_phone, bill_work_phone_ext, bill_fax, bill_email, bill_birthdate, pay_method_name, pay_method_description, pay_method_type, cc_num, cc_expire_mm, cc_expire_yyyy, cvv, bank_acct_num, bank_routing_num, bill_agreement_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, do_collect, change_status_after_coll, reset_dates_after_status, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctHierarchyDetailsM(Long client_no, String auth_key, Long acct_no, Long hierarchy_filter, Long include_current_acct, Long include_supp_plans, Long include_billing_groups, Long include_payment_methods){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_hierarchy_dtls = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctHierarchyDetailsM(client_no, auth_key, acct_no, hierarchy_filter, include_current_acct, include_supp_plans, include_billing_groups, include_payment_methods, h_error_code, h_error_msg, h_acct_hierarchy_dtls);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_hierarchy_dtls",((javax.xml.ws.Holder)h_acct_hierarchy_dtls).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctHierarchyDetailsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long hierarchy_filter = (Long) map.get("hierarchy_filter");
                Long include_current_acct = (Long) map.get("include_current_acct");
                Long include_supp_plans = (Long) map.get("include_supp_plans");
                Long include_billing_groups = (Long) map.get("include_billing_groups");
                Long include_payment_methods = (Long) map.get("include_payment_methods");
                
        return getAcctHierarchyDetailsM(client_no, auth_key, acct_no, hierarchy_filter, include_current_acct, include_supp_plans, include_billing_groups, include_payment_methods);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctDetailsAllM(Long client_no, String auth_key, Long acct_no, Long include_supp_plans, Long include_billing_groups, Long include_payment_methods){
        javax.xml.ws.Holder h_acct_no = new javax.xml.ws.Holder(acct_no);
        javax.xml.ws.Holder h_client_acct_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_userid = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_first_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_middle_initial = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_last_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_company_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_address1 = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_address2 = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_address3 = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_city = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_locality = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_state_prov = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_country_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_postal_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_phone = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_phone_ext = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cell_phone = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_work_phone = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_work_phone_ext = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_fax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_email = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_birthdate = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_status_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_notify_method = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_senior_acct_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_senior_acct_user_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_senior_client_acct_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_test_acct_ind = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_taxpayer_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_start_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_alt_msg_template_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_seq_func_group_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_tax_exemption_level = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_alt_msg_template_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_cn_alt_msg_template_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_revrec_profile_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_revrec_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_approval_required = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_functional_acct_group = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_acct_group = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_field = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_surcharges_info = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_currency = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_balance = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_address_verification_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_address_match_score = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_create_client_receipt_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_status_client_receipt_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_coupons = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_groups_info = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_payment_methods_info = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plans_info = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_consumer_acct_ind = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctDetailsAllM(client_no, auth_key, h_acct_no, include_supp_plans, include_billing_groups, include_payment_methods, h_client_acct_id, h_userid, h_first_name, h_middle_initial, h_last_name, h_company_name, h_address1, h_address2, h_address3, h_city, h_locality, h_state_prov, h_country_cd, h_postal_cd, h_phone, h_phone_ext, h_cell_phone, h_work_phone, h_work_phone_ext, h_fax, h_email, h_birthdate, h_status_cd, h_notify_method, h_senior_acct_no, h_senior_acct_user_id, h_senior_client_acct_id, h_test_acct_ind, h_taxpayer_id, h_acct_start_date, h_alt_msg_template_no, h_seq_func_group_no, h_tax_exemption_level, h_client_alt_msg_template_id, h_client_cn_alt_msg_template_id, h_revrec_profile_no, h_client_revrec_id, h_invoice_approval_required, h_functional_acct_group, h_collection_acct_group, h_supp_field, h_acct_surcharges_info, h_acct_currency, h_acct_balance, h_address_verification_code, h_address_match_score, h_acct_create_client_receipt_id, h_status_client_receipt_id, h_acct_coupons, h_billing_groups_info, h_payment_methods_info, h_master_plans_info, h_consumer_acct_ind, h_error_code, h_error_msg);

        getHashMapReturnValues().put("acct_no",((javax.xml.ws.Holder)h_acct_no).value);
        getHashMapReturnValues().put("client_acct_id",((javax.xml.ws.Holder)h_client_acct_id).value);
        getHashMapReturnValues().put("userid",((javax.xml.ws.Holder)h_userid).value);
        getHashMapReturnValues().put("first_name",((javax.xml.ws.Holder)h_first_name).value);
        getHashMapReturnValues().put("middle_initial",((javax.xml.ws.Holder)h_middle_initial).value);
        getHashMapReturnValues().put("last_name",((javax.xml.ws.Holder)h_last_name).value);
        getHashMapReturnValues().put("company_name",((javax.xml.ws.Holder)h_company_name).value);
        getHashMapReturnValues().put("address1",((javax.xml.ws.Holder)h_address1).value);
        getHashMapReturnValues().put("address2",((javax.xml.ws.Holder)h_address2).value);
        getHashMapReturnValues().put("address3",((javax.xml.ws.Holder)h_address3).value);
        getHashMapReturnValues().put("city",((javax.xml.ws.Holder)h_city).value);
        getHashMapReturnValues().put("locality",((javax.xml.ws.Holder)h_locality).value);
        getHashMapReturnValues().put("state_prov",((javax.xml.ws.Holder)h_state_prov).value);
        getHashMapReturnValues().put("country_cd",((javax.xml.ws.Holder)h_country_cd).value);
        getHashMapReturnValues().put("postal_cd",((javax.xml.ws.Holder)h_postal_cd).value);
        getHashMapReturnValues().put("phone",((javax.xml.ws.Holder)h_phone).value);
        getHashMapReturnValues().put("phone_ext",((javax.xml.ws.Holder)h_phone_ext).value);
        getHashMapReturnValues().put("cell_phone",((javax.xml.ws.Holder)h_cell_phone).value);
        getHashMapReturnValues().put("work_phone",((javax.xml.ws.Holder)h_work_phone).value);
        getHashMapReturnValues().put("work_phone_ext",((javax.xml.ws.Holder)h_work_phone_ext).value);
        getHashMapReturnValues().put("fax",((javax.xml.ws.Holder)h_fax).value);
        getHashMapReturnValues().put("email",((javax.xml.ws.Holder)h_email).value);
        getHashMapReturnValues().put("birthdate",((javax.xml.ws.Holder)h_birthdate).value);
        getHashMapReturnValues().put("status_cd",((javax.xml.ws.Holder)h_status_cd).value);
        getHashMapReturnValues().put("notify_method",((javax.xml.ws.Holder)h_notify_method).value);
        getHashMapReturnValues().put("senior_acct_no",((javax.xml.ws.Holder)h_senior_acct_no).value);
        getHashMapReturnValues().put("senior_acct_user_id",((javax.xml.ws.Holder)h_senior_acct_user_id).value);
        getHashMapReturnValues().put("senior_client_acct_id",((javax.xml.ws.Holder)h_senior_client_acct_id).value);
        getHashMapReturnValues().put("test_acct_ind",((javax.xml.ws.Holder)h_test_acct_ind).value);
        getHashMapReturnValues().put("taxpayer_id",((javax.xml.ws.Holder)h_taxpayer_id).value);
        getHashMapReturnValues().put("acct_start_date",((javax.xml.ws.Holder)h_acct_start_date).value);
        getHashMapReturnValues().put("alt_msg_template_no",((javax.xml.ws.Holder)h_alt_msg_template_no).value);
        getHashMapReturnValues().put("seq_func_group_no",((javax.xml.ws.Holder)h_seq_func_group_no).value);
        getHashMapReturnValues().put("tax_exemption_level",((javax.xml.ws.Holder)h_tax_exemption_level).value);
        getHashMapReturnValues().put("client_alt_msg_template_id",((javax.xml.ws.Holder)h_client_alt_msg_template_id).value);
        getHashMapReturnValues().put("client_cn_alt_msg_template_id",((javax.xml.ws.Holder)h_client_cn_alt_msg_template_id).value);
        getHashMapReturnValues().put("revrec_profile_no",((javax.xml.ws.Holder)h_revrec_profile_no).value);
        getHashMapReturnValues().put("client_revrec_id",((javax.xml.ws.Holder)h_client_revrec_id).value);
        getHashMapReturnValues().put("invoice_approval_required",((javax.xml.ws.Holder)h_invoice_approval_required).value);
        getHashMapReturnValues().put("functional_acct_group",((javax.xml.ws.Holder)h_functional_acct_group).value);
        getHashMapReturnValues().put("collection_acct_group",((javax.xml.ws.Holder)h_collection_acct_group).value);
        getHashMapReturnValues().put("supp_field",((javax.xml.ws.Holder)h_supp_field).value);
        getHashMapReturnValues().put("acct_surcharges_info",((javax.xml.ws.Holder)h_acct_surcharges_info).value);
        getHashMapReturnValues().put("acct_currency",((javax.xml.ws.Holder)h_acct_currency).value);
        getHashMapReturnValues().put("acct_balance",((javax.xml.ws.Holder)h_acct_balance).value);
        getHashMapReturnValues().put("address_verification_code",((javax.xml.ws.Holder)h_address_verification_code).value);
        getHashMapReturnValues().put("address_match_score",((javax.xml.ws.Holder)h_address_match_score).value);
        getHashMapReturnValues().put("acct_create_client_receipt_id",((javax.xml.ws.Holder)h_acct_create_client_receipt_id).value);
        getHashMapReturnValues().put("status_client_receipt_id",((javax.xml.ws.Holder)h_status_client_receipt_id).value);
        getHashMapReturnValues().put("acct_coupons",((javax.xml.ws.Holder)h_acct_coupons).value);
        getHashMapReturnValues().put("billing_groups_info",((javax.xml.ws.Holder)h_billing_groups_info).value);
        getHashMapReturnValues().put("payment_methods_info",((javax.xml.ws.Holder)h_payment_methods_info).value);
        getHashMapReturnValues().put("master_plans_info",((javax.xml.ws.Holder)h_master_plans_info).value);
        getHashMapReturnValues().put("consumer_acct_ind",((javax.xml.ws.Holder)h_consumer_acct_ind).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctDetailsAllM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long include_supp_plans = (Long) map.get("include_supp_plans");
                Long include_billing_groups = (Long) map.get("include_billing_groups");
                Long include_payment_methods = (Long) map.get("include_payment_methods");
                
        return getAcctDetailsAllM(client_no, auth_key, acct_no, include_supp_plans, include_billing_groups, include_payment_methods);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateAcctCompleteM(Long client_no, String auth_key, String client_receipt_id, Long acct_no, String client_acct_id, String userid, String password, String secret_question, String secret_question_answer, String pin, String first_name, String mi, String last_name, String company_name, String address1, String address2, String address3, String city, String locality, String state_prov, String country_cd, String postal_cd, String phone, String phone_ext, String cell_phone, String work_phone, String work_phone_ext, String fax, String email, String birthdate, Long status_cd, Long notify_method, Long senior_acct_no, String senior_acct_userid, String senior_client_acct_id, Long test_acct_ind, String taxpayer_id, String alt_client_acct_group_id, com.aria.common.shared.AcctCouponsArray acct_coupons, String acct_start_date, Long alt_msg_template_no, Long cn_alt_msg_template_no, Long seq_func_group_no, Long client_seq_func_group_id, Long tax_exemption_level, String client_alt_msg_template_id, String client_cn_alt_msg_template_id, String reset_dates_after_status, String new_client_acct_id, Long invoicing_option, String alt_start_date, Long alt_bill_day, String retroactive_start_date, com.aria.common.shared.FunctionalAcctGroupsUpdateArray functional_acct_groups_update, com.aria.common.shared.CollectionAcctGroupsUpdateArray collection_acct_groups_update, com.aria.common.shared.AcctSuppFieldsUpdateArray acct_supp_fields_update, com.aria.common.shared.AccountSurchargesArray account_surcharges, String client_master_plan_instance_id, Long master_plan_instance_no, String new_client_master_plan_instance_id, String client_master_plan_id, Long master_plan_no, String master_plan_instance_desc, Long dunning_group_no, String client_dunning_group_id, Long mp_billing_group_no, String client_mp_billing_group_id, Long master_plan_instance_status, Long master_plan_units, Long resp_level_cd, Long parent_master_plan_inst_no, Long alt_rate_schedule_no, String client_alt_rate_schedule_id, String promo_cd, com.aria.common.shared.MpCouponsArray mp_coupons, Long master_plan_assign_directive, Long offset_months, Long offset_interval, String invoice_unbilled_usage, String invoice_approval_required, String status_degrade_date, Long usage_accumulation_reset_months, String usage_pooling, String usage_threshold_applicability, com.aria.common.shared.MasterPlanPlanInstFieldsArray master_plan_plan_inst_fields, com.aria.common.shared.MpSurchargesArray mp_surcharges, com.aria.common.shared.UpdateAcctCustomRatesArray update_acct_custom_rates, com.aria.common.shared.BillingGroupsArrayArray billing_groups_array, com.aria.common.shared.PaymentMethodsArrayArray payment_methods_array, Long revrec_profile_no, String client_revrec_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_parent_child_sync_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_parent_child_sync_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_coll_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_coll_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_stmt_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_stmt_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_instance_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_client_mp_instance_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_master_plan_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_client_master_plan_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_master_plan_instance_description = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_proration_result_total_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_proration_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_proration_tax_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_proration_surcharge_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_proration_credit_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_plan_instance_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_client_supp_plan_instance_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_plan_proration_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_plan_proration_tax_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_plan_proration_surcharge_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_plan_proration_credit_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_billing_group_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_client_billing_group_id = new javax.xml.ws.Holder();

        
        getCompletePort().updateAcctCompleteM(client_no, auth_key, client_receipt_id, acct_no, client_acct_id, userid, password, secret_question, secret_question_answer, pin, first_name, mi, last_name, company_name, address1, address2, address3, city, locality, state_prov, country_cd, postal_cd, phone, phone_ext, cell_phone, work_phone, work_phone_ext, fax, email, birthdate, status_cd, notify_method, senior_acct_no, senior_acct_userid, senior_client_acct_id, test_acct_ind, taxpayer_id, alt_client_acct_group_id, acct_coupons, acct_start_date, alt_msg_template_no, cn_alt_msg_template_no, seq_func_group_no, client_seq_func_group_id, tax_exemption_level, client_alt_msg_template_id, client_cn_alt_msg_template_id, reset_dates_after_status, new_client_acct_id, invoicing_option, alt_start_date, alt_bill_day, retroactive_start_date, functional_acct_groups_update, collection_acct_groups_update, acct_supp_fields_update, account_surcharges, client_master_plan_instance_id, master_plan_instance_no, new_client_master_plan_instance_id, client_master_plan_id, master_plan_no, master_plan_instance_desc, dunning_group_no, client_dunning_group_id, mp_billing_group_no, client_mp_billing_group_id, master_plan_instance_status, master_plan_units, resp_level_cd, parent_master_plan_inst_no, alt_rate_schedule_no, client_alt_rate_schedule_id, promo_cd, mp_coupons, master_plan_assign_directive, offset_months, offset_interval, invoice_unbilled_usage, invoice_approval_required, status_degrade_date, usage_accumulation_reset_months, usage_pooling, usage_threshold_applicability, master_plan_plan_inst_fields, mp_surcharges, update_acct_custom_rates, billing_groups_array, payment_methods_array, revrec_profile_no, client_revrec_id, h_error_code, h_error_msg, h_collection_error_code, h_collection_error_msg, h_parent_child_sync_error_code, h_parent_child_sync_error_msg, h_master_plan_error_code, h_master_plan_error_msg, h_master_plan_coll_error_code, h_master_plan_coll_error_msg, h_master_plan_stmt_error_code, h_master_plan_stmt_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_third_party_errors, h_master_plan_instance_id, h_out_client_mp_instance_id, h_out_master_plan_no, h_out_client_master_plan_id, h_out_master_plan_instance_description, h_master_plan_proration_result_total_amount, h_master_plan_proration_amount, h_master_plan_proration_tax_amount, h_master_plan_proration_surcharge_amount, h_master_plan_proration_credit_amount, h_supp_plan_instance_id, h_out_client_supp_plan_instance_id, h_supp_plan_proration_amount, h_supp_plan_proration_tax_amount, h_supp_plan_proration_surcharge_amount, h_supp_plan_proration_credit_amount, h_out_invoice_no, h_out_billing_group_no, h_out_client_billing_group_id);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("parent_child_sync_error_code",((javax.xml.ws.Holder)h_parent_child_sync_error_code).value);
        getHashMapReturnValues().put("parent_child_sync_error_msg",((javax.xml.ws.Holder)h_parent_child_sync_error_msg).value);
        getHashMapReturnValues().put("master_plan_error_code",((javax.xml.ws.Holder)h_master_plan_error_code).value);
        getHashMapReturnValues().put("master_plan_error_msg",((javax.xml.ws.Holder)h_master_plan_error_msg).value);
        getHashMapReturnValues().put("master_plan_coll_error_code",((javax.xml.ws.Holder)h_master_plan_coll_error_code).value);
        getHashMapReturnValues().put("master_plan_coll_error_msg",((javax.xml.ws.Holder)h_master_plan_coll_error_msg).value);
        getHashMapReturnValues().put("master_plan_stmt_error_code",((javax.xml.ws.Holder)h_master_plan_stmt_error_code).value);
        getHashMapReturnValues().put("master_plan_stmt_error_msg",((javax.xml.ws.Holder)h_master_plan_stmt_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        getHashMapReturnValues().put("master_plan_instance_id",((javax.xml.ws.Holder)h_master_plan_instance_id).value);
        getHashMapReturnValues().put("out_client_mp_instance_id",((javax.xml.ws.Holder)h_out_client_mp_instance_id).value);
        getHashMapReturnValues().put("out_master_plan_no",((javax.xml.ws.Holder)h_out_master_plan_no).value);
        getHashMapReturnValues().put("out_client_master_plan_id",((javax.xml.ws.Holder)h_out_client_master_plan_id).value);
        getHashMapReturnValues().put("out_master_plan_instance_description",((javax.xml.ws.Holder)h_out_master_plan_instance_description).value);
        getHashMapReturnValues().put("master_plan_proration_result_total_amount",((javax.xml.ws.Holder)h_master_plan_proration_result_total_amount).value);
        getHashMapReturnValues().put("master_plan_proration_amount",((javax.xml.ws.Holder)h_master_plan_proration_amount).value);
        getHashMapReturnValues().put("master_plan_proration_tax_amount",((javax.xml.ws.Holder)h_master_plan_proration_tax_amount).value);
        getHashMapReturnValues().put("master_plan_proration_surcharge_amount",((javax.xml.ws.Holder)h_master_plan_proration_surcharge_amount).value);
        getHashMapReturnValues().put("master_plan_proration_credit_amount",((javax.xml.ws.Holder)h_master_plan_proration_credit_amount).value);
        getHashMapReturnValues().put("supp_plan_instance_id",((javax.xml.ws.Holder)h_supp_plan_instance_id).value);
        getHashMapReturnValues().put("out_client_supp_plan_instance_id",((javax.xml.ws.Holder)h_out_client_supp_plan_instance_id).value);
        getHashMapReturnValues().put("supp_plan_proration_amount",((javax.xml.ws.Holder)h_supp_plan_proration_amount).value);
        getHashMapReturnValues().put("supp_plan_proration_tax_amount",((javax.xml.ws.Holder)h_supp_plan_proration_tax_amount).value);
        getHashMapReturnValues().put("supp_plan_proration_surcharge_amount",((javax.xml.ws.Holder)h_supp_plan_proration_surcharge_amount).value);
        getHashMapReturnValues().put("supp_plan_proration_credit_amount",((javax.xml.ws.Holder)h_supp_plan_proration_credit_amount).value);
        getHashMapReturnValues().put("out_invoice_no",((javax.xml.ws.Holder)h_out_invoice_no).value);
        getHashMapReturnValues().put("out_billing_group_no",((javax.xml.ws.Holder)h_out_billing_group_no).value);
        getHashMapReturnValues().put("out_client_billing_group_id",((javax.xml.ws.Holder)h_out_client_billing_group_id).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateAcctCompleteM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String client_receipt_id = (String) map.get("client_receipt_id");
                Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                String userid = (String) map.get("userid");
                String password = (String) map.get("password");
                String secret_question = (String) map.get("secret_question");
                String secret_question_answer = (String) map.get("secret_question_answer");
                String pin = (String) map.get("pin");
                String first_name = (String) map.get("first_name");
                String mi = (String) map.get("mi");
                String last_name = (String) map.get("last_name");
                String company_name = (String) map.get("company_name");
                String address1 = (String) map.get("address1");
                String address2 = (String) map.get("address2");
                String address3 = (String) map.get("address3");
                String city = (String) map.get("city");
                String locality = (String) map.get("locality");
                String state_prov = (String) map.get("state_prov");
                String country_cd = (String) map.get("country_cd");
                String postal_cd = (String) map.get("postal_cd");
                String phone = (String) map.get("phone");
                String phone_ext = (String) map.get("phone_ext");
                String cell_phone = (String) map.get("cell_phone");
                String work_phone = (String) map.get("work_phone");
                String work_phone_ext = (String) map.get("work_phone_ext");
                String fax = (String) map.get("fax");
                String email = (String) map.get("email");
                String birthdate = (String) map.get("birthdate");
                Long status_cd = (Long) map.get("status_cd");
                Long notify_method = (Long) map.get("notify_method");
                Long senior_acct_no = (Long) map.get("senior_acct_no");
                String senior_acct_userid = (String) map.get("senior_acct_userid");
                String senior_client_acct_id = (String) map.get("senior_client_acct_id");
                Long test_acct_ind = (Long) map.get("test_acct_ind");
                String taxpayer_id = (String) map.get("taxpayer_id");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                com.aria.common.shared.AcctCouponsArray acct_coupons = (com.aria.common.shared.AcctCouponsArray) map.get("acct_coupons");
                String acct_start_date = (String) map.get("acct_start_date");
                Long alt_msg_template_no = (Long) map.get("alt_msg_template_no");
                Long cn_alt_msg_template_no = (Long) map.get("cn_alt_msg_template_no");
                Long seq_func_group_no = (Long) map.get("seq_func_group_no");
                Long client_seq_func_group_id = (Long) map.get("client_seq_func_group_id");
                Long tax_exemption_level = (Long) map.get("tax_exemption_level");
                String client_alt_msg_template_id = (String) map.get("client_alt_msg_template_id");
                String client_cn_alt_msg_template_id = (String) map.get("client_cn_alt_msg_template_id");
                String reset_dates_after_status = (String) map.get("reset_dates_after_status");
                String new_client_acct_id = (String) map.get("new_client_acct_id");
                Long invoicing_option = (Long) map.get("invoicing_option");
                String alt_start_date = (String) map.get("alt_start_date");
                Long alt_bill_day = (Long) map.get("alt_bill_day");
                String retroactive_start_date = (String) map.get("retroactive_start_date");
                com.aria.common.shared.FunctionalAcctGroupsUpdateArray functional_acct_groups_update = (com.aria.common.shared.FunctionalAcctGroupsUpdateArray) map.get("functional_acct_groups_update");
                com.aria.common.shared.CollectionAcctGroupsUpdateArray collection_acct_groups_update = (com.aria.common.shared.CollectionAcctGroupsUpdateArray) map.get("collection_acct_groups_update");
                com.aria.common.shared.AcctSuppFieldsUpdateArray acct_supp_fields_update = (com.aria.common.shared.AcctSuppFieldsUpdateArray) map.get("acct_supp_fields_update");
                com.aria.common.shared.AccountSurchargesArray account_surcharges = (com.aria.common.shared.AccountSurchargesArray) map.get("account_surcharges");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String new_client_master_plan_instance_id = (String) map.get("new_client_master_plan_instance_id");
                String client_master_plan_id = (String) map.get("client_master_plan_id");
                Long master_plan_no = (Long) map.get("master_plan_no");
                String master_plan_instance_desc = (String) map.get("master_plan_instance_desc");
                Long dunning_group_no = (Long) map.get("dunning_group_no");
                String client_dunning_group_id = (String) map.get("client_dunning_group_id");
                Long mp_billing_group_no = (Long) map.get("mp_billing_group_no");
                String client_mp_billing_group_id = (String) map.get("client_mp_billing_group_id");
                Long master_plan_instance_status = (Long) map.get("master_plan_instance_status");
                Long master_plan_units = (Long) map.get("master_plan_units");
                Long resp_level_cd = (Long) map.get("resp_level_cd");
                Long parent_master_plan_inst_no = (Long) map.get("parent_master_plan_inst_no");
                Long alt_rate_schedule_no = (Long) map.get("alt_rate_schedule_no");
                String client_alt_rate_schedule_id = (String) map.get("client_alt_rate_schedule_id");
                String promo_cd = (String) map.get("promo_cd");
                com.aria.common.shared.MpCouponsArray mp_coupons = (com.aria.common.shared.MpCouponsArray) map.get("mp_coupons");
                Long master_plan_assign_directive = (Long) map.get("master_plan_assign_directive");
                Long offset_months = (Long) map.get("offset_months");
                Long offset_interval = (Long) map.get("offset_interval");
                String invoice_unbilled_usage = (String) map.get("invoice_unbilled_usage");
                String invoice_approval_required = (String) map.get("invoice_approval_required");
                String status_degrade_date = (String) map.get("status_degrade_date");
                Long usage_accumulation_reset_months = (Long) map.get("usage_accumulation_reset_months");
                String usage_pooling = (String) map.get("usage_pooling");
                String usage_threshold_applicability = (String) map.get("usage_threshold_applicability");
                com.aria.common.shared.MasterPlanPlanInstFieldsArray master_plan_plan_inst_fields = (com.aria.common.shared.MasterPlanPlanInstFieldsArray) map.get("master_plan_plan_inst_fields");
                com.aria.common.shared.MpSurchargesArray mp_surcharges = (com.aria.common.shared.MpSurchargesArray) map.get("mp_surcharges");
                com.aria.common.shared.UpdateAcctCustomRatesArray update_acct_custom_rates = (com.aria.common.shared.UpdateAcctCustomRatesArray) map.get("update_acct_custom_rates");
                com.aria.common.shared.BillingGroupsArrayArray billing_groups_array = (com.aria.common.shared.BillingGroupsArrayArray) map.get("billing_groups_array");
                com.aria.common.shared.PaymentMethodsArrayArray payment_methods_array = (com.aria.common.shared.PaymentMethodsArrayArray) map.get("payment_methods_array");
                Long revrec_profile_no = (Long) map.get("revrec_profile_no");
                String client_revrec_id = (String) map.get("client_revrec_id");
                
        return updateAcctCompleteM(client_no, auth_key, client_receipt_id, acct_no, client_acct_id, userid, password, secret_question, secret_question_answer, pin, first_name, mi, last_name, company_name, address1, address2, address3, city, locality, state_prov, country_cd, postal_cd, phone, phone_ext, cell_phone, work_phone, work_phone_ext, fax, email, birthdate, status_cd, notify_method, senior_acct_no, senior_acct_userid, senior_client_acct_id, test_acct_ind, taxpayer_id, alt_client_acct_group_id, acct_coupons, acct_start_date, alt_msg_template_no, cn_alt_msg_template_no, seq_func_group_no, client_seq_func_group_id, tax_exemption_level, client_alt_msg_template_id, client_cn_alt_msg_template_id, reset_dates_after_status, new_client_acct_id, invoicing_option, alt_start_date, alt_bill_day, retroactive_start_date, functional_acct_groups_update, collection_acct_groups_update, acct_supp_fields_update, account_surcharges, client_master_plan_instance_id, master_plan_instance_no, new_client_master_plan_instance_id, client_master_plan_id, master_plan_no, master_plan_instance_desc, dunning_group_no, client_dunning_group_id, mp_billing_group_no, client_mp_billing_group_id, master_plan_instance_status, master_plan_units, resp_level_cd, parent_master_plan_inst_no, alt_rate_schedule_no, client_alt_rate_schedule_id, promo_cd, mp_coupons, master_plan_assign_directive, offset_months, offset_interval, invoice_unbilled_usage, invoice_approval_required, status_degrade_date, usage_accumulation_reset_months, usage_pooling, usage_threshold_applicability, master_plan_plan_inst_fields, mp_surcharges, update_acct_custom_rates, billing_groups_array, payment_methods_array, revrec_profile_no, client_revrec_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctBalanceM(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_currency_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_balance = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_master_plan_instances = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctBalanceM(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_currency_cd, h_acct_balance, h_master_plan_instances);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("currency_cd",((javax.xml.ws.Holder)h_currency_cd).value);
        getHashMapReturnValues().put("acct_balance",((javax.xml.ws.Holder)h_acct_balance).value);
        getHashMapReturnValues().put("master_plan_instances",((javax.xml.ws.Holder)h_master_plan_instances).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctBalanceM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAcctBalanceM(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateContactM(Long client_no, String auth_key, Long acct_no, Long contact_ind, Long billing_group_no, String client_billing_group_id, String first_name, String middle_initial, String last_name, String company_name, String address1, String address2, String address3, String city, String locality, String state_prov, String country_cd, String postal_cd, String phone, String phone_ext, String cell_phone, String work_phone, String work_phone_ext, String fax, String email, String birthdate){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().updateContactM(client_no, auth_key, acct_no, contact_ind, billing_group_no, client_billing_group_id, first_name, middle_initial, last_name, company_name, address1, address2, address3, city, locality, state_prov, country_cd, postal_cd, phone, phone_ext, cell_phone, work_phone, work_phone_ext, fax, email, birthdate, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateContactM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long contact_ind = (Long) map.get("contact_ind");
                Long billing_group_no = (Long) map.get("billing_group_no");
                String client_billing_group_id = (String) map.get("client_billing_group_id");
                String first_name = (String) map.get("first_name");
                String middle_initial = (String) map.get("middle_initial");
                String last_name = (String) map.get("last_name");
                String company_name = (String) map.get("company_name");
                String address1 = (String) map.get("address1");
                String address2 = (String) map.get("address2");
                String address3 = (String) map.get("address3");
                String city = (String) map.get("city");
                String locality = (String) map.get("locality");
                String state_prov = (String) map.get("state_prov");
                String country_cd = (String) map.get("country_cd");
                String postal_cd = (String) map.get("postal_cd");
                String phone = (String) map.get("phone");
                String phone_ext = (String) map.get("phone_ext");
                String cell_phone = (String) map.get("cell_phone");
                String work_phone = (String) map.get("work_phone");
                String work_phone_ext = (String) map.get("work_phone_ext");
                String fax = (String) map.get("fax");
                String email = (String) map.get("email");
                String birthdate = (String) map.get("birthdate");
                
        return updateContactM(client_no, auth_key, acct_no, contact_ind, billing_group_no, client_billing_group_id, first_name, middle_initial, last_name, company_name, address1, address2, address3, city, locality, state_prov, country_cd, postal_cd, phone, phone_ext, cell_phone, work_phone, work_phone_ext, fax, email, birthdate);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctContactsM(Long client_no, String auth_key, Long acct_no, Long billing_group_no, String client_billing_group_id){
        javax.xml.ws.Holder h_account_contact = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_contacts = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_backup_contacts = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_contacts = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctContactsM(client_no, auth_key, acct_no, billing_group_no, client_billing_group_id, h_account_contact, h_billing_contacts, h_backup_contacts, h_statement_contacts, h_error_code, h_error_msg);

        getHashMapReturnValues().put("account_contact",((javax.xml.ws.Holder)h_account_contact).value);
        getHashMapReturnValues().put("billing_contacts",((javax.xml.ws.Holder)h_billing_contacts).value);
        getHashMapReturnValues().put("backup_contacts",((javax.xml.ws.Holder)h_backup_contacts).value);
        getHashMapReturnValues().put("statement_contacts",((javax.xml.ws.Holder)h_statement_contacts).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctContactsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long billing_group_no = (Long) map.get("billing_group_no");
                String client_billing_group_id = (String) map.get("client_billing_group_id");
                
        return getAcctContactsM(client_no, auth_key, acct_no, billing_group_no, client_billing_group_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createAcctBillingGroupM(Long client_no, String auth_key, Long acct_no, String billing_group_name, String billing_group_description, String client_billing_group_id, Long notify_method, Long notify_template_group, Long statement_template, Long credit_note_template, Long primary_payment_method_no, String client_primary_payment_method_id, Long backup_payment_method_no, String client_backup_payment_method_id, String stmt_first_name, String stmt_mi, String stmt_last_name, String stmt_company_name, String stmt_address1, String stmt_address2, String stmt_address3, String stmt_city, String stmt_locality, String stmt_state_prov, String stmt_country, String stmt_postal_cd, String stmt_phone, String stmt_phone_ext, String stmt_cell_phone, String stmt_work_phone, String stmt_work_phone_ext, String stmt_fax, String stmt_email, String stmt_birthdate, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_company_name, String bill_address1, String bill_address2, String bill_address3, String bill_city, String bill_locality, String bill_state_prov, String bill_country, String bill_postal_cd, String bill_phone, String bill_phone_ext, String bill_cell_phone, String bill_work_phone, String bill_work_phone_ext, String bill_fax, String bill_email, String bill_birthdate, String pay_method_name, String client_payment_method_id, String pay_method_description, Long pay_method_type, String cc_num, Long cc_expire_mm, Long cc_expire_yyyy, String bank_acct_num, String bank_routing_num, String cvv, String track_data1, String track_data2, String bill_agreement_id, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd, com.aria.common.shared.MasterPlansSummaryArray master_plans_summary, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        
        getCompletePort().createAcctBillingGroupM(client_no, auth_key, acct_no, billing_group_name, billing_group_description, client_billing_group_id, notify_method, notify_template_group, statement_template, credit_note_template, primary_payment_method_no, client_primary_payment_method_id, backup_payment_method_no, client_backup_payment_method_id, stmt_first_name, stmt_mi, stmt_last_name, stmt_company_name, stmt_address1, stmt_address2, stmt_address3, stmt_city, stmt_locality, stmt_state_prov, stmt_country, stmt_postal_cd, stmt_phone, stmt_phone_ext, stmt_cell_phone, stmt_work_phone, stmt_work_phone_ext, stmt_fax, stmt_email, stmt_birthdate, bill_first_name, bill_middle_initial, bill_last_name, bill_company_name, bill_address1, bill_address2, bill_address3, bill_city, bill_locality, bill_state_prov, bill_country, bill_postal_cd, bill_phone, bill_phone_ext, bill_cell_phone, bill_work_phone, bill_work_phone_ext, bill_fax, bill_email, bill_birthdate, pay_method_name, client_payment_method_id, pay_method_description, pay_method_type, cc_num, cc_expire_mm, cc_expire_yyyy, bank_acct_num, bank_routing_num, cvv, track_data1, track_data2, bill_agreement_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, master_plans_summary, client_receipt_id, h_error_code, h_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createAcctBillingGroupM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String billing_group_name = (String) map.get("billing_group_name");
                String billing_group_description = (String) map.get("billing_group_description");
                String client_billing_group_id = (String) map.get("client_billing_group_id");
                Long notify_method = (Long) map.get("notify_method");
                Long notify_template_group = (Long) map.get("notify_template_group");
                Long statement_template = (Long) map.get("statement_template");
                Long credit_note_template = (Long) map.get("credit_note_template");
                Long primary_payment_method_no = (Long) map.get("primary_payment_method_no");
                String client_primary_payment_method_id = (String) map.get("client_primary_payment_method_id");
                Long backup_payment_method_no = (Long) map.get("backup_payment_method_no");
                String client_backup_payment_method_id = (String) map.get("client_backup_payment_method_id");
                String stmt_first_name = (String) map.get("stmt_first_name");
                String stmt_mi = (String) map.get("stmt_mi");
                String stmt_last_name = (String) map.get("stmt_last_name");
                String stmt_company_name = (String) map.get("stmt_company_name");
                String stmt_address1 = (String) map.get("stmt_address1");
                String stmt_address2 = (String) map.get("stmt_address2");
                String stmt_address3 = (String) map.get("stmt_address3");
                String stmt_city = (String) map.get("stmt_city");
                String stmt_locality = (String) map.get("stmt_locality");
                String stmt_state_prov = (String) map.get("stmt_state_prov");
                String stmt_country = (String) map.get("stmt_country");
                String stmt_postal_cd = (String) map.get("stmt_postal_cd");
                String stmt_phone = (String) map.get("stmt_phone");
                String stmt_phone_ext = (String) map.get("stmt_phone_ext");
                String stmt_cell_phone = (String) map.get("stmt_cell_phone");
                String stmt_work_phone = (String) map.get("stmt_work_phone");
                String stmt_work_phone_ext = (String) map.get("stmt_work_phone_ext");
                String stmt_fax = (String) map.get("stmt_fax");
                String stmt_email = (String) map.get("stmt_email");
                String stmt_birthdate = (String) map.get("stmt_birthdate");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_address3 = (String) map.get("bill_address3");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_country = (String) map.get("bill_country");
                String bill_postal_cd = (String) map.get("bill_postal_cd");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_ext = (String) map.get("bill_phone_ext");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_ext = (String) map.get("bill_work_phone_ext");
                String bill_fax = (String) map.get("bill_fax");
                String bill_email = (String) map.get("bill_email");
                String bill_birthdate = (String) map.get("bill_birthdate");
                String pay_method_name = (String) map.get("pay_method_name");
                String client_payment_method_id = (String) map.get("client_payment_method_id");
                String pay_method_description = (String) map.get("pay_method_description");
                Long pay_method_type = (Long) map.get("pay_method_type");
                String cc_num = (String) map.get("cc_num");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String cvv = (String) map.get("cvv");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                String bill_agreement_id = (String) map.get("bill_agreement_id");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                com.aria.common.shared.MasterPlansSummaryArray master_plans_summary = (com.aria.common.shared.MasterPlansSummaryArray) map.get("master_plans_summary");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return createAcctBillingGroupM(client_no, auth_key, acct_no, billing_group_name, billing_group_description, client_billing_group_id, notify_method, notify_template_group, statement_template, credit_note_template, primary_payment_method_no, client_primary_payment_method_id, backup_payment_method_no, client_backup_payment_method_id, stmt_first_name, stmt_mi, stmt_last_name, stmt_company_name, stmt_address1, stmt_address2, stmt_address3, stmt_city, stmt_locality, stmt_state_prov, stmt_country, stmt_postal_cd, stmt_phone, stmt_phone_ext, stmt_cell_phone, stmt_work_phone, stmt_work_phone_ext, stmt_fax, stmt_email, stmt_birthdate, bill_first_name, bill_middle_initial, bill_last_name, bill_company_name, bill_address1, bill_address2, bill_address3, bill_city, bill_locality, bill_state_prov, bill_country, bill_postal_cd, bill_phone, bill_phone_ext, bill_cell_phone, bill_work_phone, bill_work_phone_ext, bill_fax, bill_email, bill_birthdate, pay_method_name, client_payment_method_id, pay_method_description, pay_method_type, cc_num, cc_expire_mm, cc_expire_yyyy, bank_acct_num, bank_routing_num, cvv, track_data1, track_data2, bill_agreement_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, master_plans_summary, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctBillingGroupDetailsM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long plan_instance_no, String client_plan_instance_id, Long billing_group_no, String client_billing_group_id, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_groups = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_payment_methods_summary = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctBillingGroupDetailsM(client_no, auth_key, acct_no, client_acct_id, plan_instance_no, client_plan_instance_id, billing_group_no, client_billing_group_id, client_receipt_id, h_error_code, h_error_msg, h_billing_groups, h_payment_methods_summary);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("billing_groups",((javax.xml.ws.Holder)h_billing_groups).value);
        getHashMapReturnValues().put("payment_methods_summary",((javax.xml.ws.Holder)h_payment_methods_summary).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctBillingGroupDetailsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                Long billing_group_no = (Long) map.get("billing_group_no");
                String client_billing_group_id = (String) map.get("client_billing_group_id");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return getAcctBillingGroupDetailsM(client_no, auth_key, acct_no, client_acct_id, plan_instance_no, client_plan_instance_id, billing_group_no, client_billing_group_id, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> assignAcctPlanM(Long client_no, String auth_key, Long acct_no, Long new_plan_no, String new_client_plan_id, String client_plan_instance_id, Long existing_billing_group_no, String existing_client_billing_group_id, String billing_group_name, String billing_group_description, String client_def_billing_group_id, Long notify_method, Long notify_template_group, Long statement_template, Long credit_note_template, Long existing_primary_payment_method_no, String existing_client_primary_payment_method_id, Long existing_backup_payment_method_no, String existing_client_backup_payment_method_id, String stmt_first_name, String stmt_mi, String stmt_last_name, String stmt_company_name, String stmt_address1, String stmt_address2, String stmt_address3, String stmt_city, String stmt_locality, String stmt_state_prov, String stmt_country, String stmt_postal_cd, String stmt_phone, String stmt_phone_ext, String stmt_cell_phone, String stmt_work_phone, String stmt_work_phone_ext, String stmt_fax, String stmt_email, String stmt_birthdate, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_company_name, String bill_address1, String bill_address2, String bill_address3, String bill_city, String bill_locality, String bill_state_prov, String bill_country, String bill_postal_cd, String bill_phone, String bill_phone_ext, String bill_cell_phone, String bill_work_phone, String bill_work_phone_ext, String bill_fax, String bill_email, String bill_birthdate, String primary_pay_method_name, String primary_pay_method_cdid, String primary_pay_method_description, Long primary_pay_method_type, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_acct_no, String bank_routing_no, String cvv, String track_data1, String track_data2, String bill_agreement_id, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd, Long existing_dunning_group_no, String existing_client_def_dunning_group_id, String dunning_group_name, String dunning_group_description, String client_dunning_group_id, Long dunning_process_no, String client_dunning_process_id, String alt_start_date, Long status_until_alt_start, Long alt_bill_day, Long invoicing_option, String retroactive_start_date, Double balance_forward, Long resp_level_cd, Long parent_acct_master_plan_inst_id, Long parent_plan_instance_no, String client_parent_plan_instance_id, Long alt_rate_schedule_no, Double plan_units, com.aria.common.shared.CouponCodesArray coupon_codes, String promo_cd, Long plan_status, String plan_instance_description, com.aria.common.shared.PlanInstanceFieldsArray plan_instance_fields, Long assignment_directive, String comments, String do_write, String client_receipt_id, Long offset_months, String alt_proration_start_date, Long auto_offset_months_option, String alt_client_acct_group_id, Long usage_accumulation_reset_months, String usage_pooling, String usage_threshold_applicability, com.aria.common.shared.CustomRatesArray custom_rates, String effective_date, Long offset_interval, Long force_supp_bill_date_reset, String client_alt_rate_schedule_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_activation_fee = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_mthly_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_annu_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_plan_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_tax_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plan_instance_no = new javax.xml.ws.Holder();

        
        getCompletePort().assignAcctPlanM(client_no, auth_key, acct_no, new_plan_no, new_client_plan_id, client_plan_instance_id, existing_billing_group_no, existing_client_billing_group_id, billing_group_name, billing_group_description, client_def_billing_group_id, notify_method, notify_template_group, statement_template, credit_note_template, existing_primary_payment_method_no, existing_client_primary_payment_method_id, existing_backup_payment_method_no, existing_client_backup_payment_method_id, stmt_first_name, stmt_mi, stmt_last_name, stmt_company_name, stmt_address1, stmt_address2, stmt_address3, stmt_city, stmt_locality, stmt_state_prov, stmt_country, stmt_postal_cd, stmt_phone, stmt_phone_ext, stmt_cell_phone, stmt_work_phone, stmt_work_phone_ext, stmt_fax, stmt_email, stmt_birthdate, bill_first_name, bill_middle_initial, bill_last_name, bill_company_name, bill_address1, bill_address2, bill_address3, bill_city, bill_locality, bill_state_prov, bill_country, bill_postal_cd, bill_phone, bill_phone_ext, bill_cell_phone, bill_work_phone, bill_work_phone_ext, bill_fax, bill_email, bill_birthdate, primary_pay_method_name, primary_pay_method_cdid, primary_pay_method_description, primary_pay_method_type, cc_number, cc_expire_mm, cc_expire_yyyy, bank_acct_no, bank_routing_no, cvv, track_data1, track_data2, bill_agreement_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, existing_dunning_group_no, existing_client_def_dunning_group_id, dunning_group_name, dunning_group_description, client_dunning_group_id, dunning_process_no, client_dunning_process_id, alt_start_date, status_until_alt_start, alt_bill_day, invoicing_option, retroactive_start_date, balance_forward, resp_level_cd, parent_acct_master_plan_inst_id, parent_plan_instance_no, client_parent_plan_instance_id, alt_rate_schedule_no, plan_units, coupon_codes, promo_cd, plan_status, plan_instance_description, plan_instance_fields, assignment_directive, comments, do_write, client_receipt_id, offset_months, alt_proration_start_date, auto_offset_months_option, alt_client_acct_group_id, usage_accumulation_reset_months, usage_pooling, usage_threshold_applicability, custom_rates, effective_date, offset_interval, force_supp_bill_date_reset, client_alt_rate_schedule_id, h_error_code, h_error_msg, h_proration_result_amount, h_collection_error_code, h_collection_error_msg, h_statement_error_code, h_statement_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_invoice_no, h_expectd_activation_fee, h_expectd_mthly_recurring_cost, h_expectd_annu_recurring_cost, h_acct_plan_line_items, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_total_tax_credit, h_total_credit_before_tax, h_total, h_proration_tax_amount, h_proration_credit_result_amount, h_proration_credit_amount, h_plan_instance_no);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proration_result_amount",((javax.xml.ws.Holder)h_proration_result_amount).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("statement_error_code",((javax.xml.ws.Holder)h_statement_error_code).value);
        getHashMapReturnValues().put("statement_error_msg",((javax.xml.ws.Holder)h_statement_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("expectd_activation_fee",((javax.xml.ws.Holder)h_expectd_activation_fee).value);
        getHashMapReturnValues().put("expectd_mthly_recurring_cost",((javax.xml.ws.Holder)h_expectd_mthly_recurring_cost).value);
        getHashMapReturnValues().put("expectd_annu_recurring_cost",((javax.xml.ws.Holder)h_expectd_annu_recurring_cost).value);
        getHashMapReturnValues().put("acct_plan_line_items",((javax.xml.ws.Holder)h_acct_plan_line_items).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("total_tax_credit",((javax.xml.ws.Holder)h_total_tax_credit).value);
        getHashMapReturnValues().put("total_credit_before_tax",((javax.xml.ws.Holder)h_total_credit_before_tax).value);
        getHashMapReturnValues().put("total",((javax.xml.ws.Holder)h_total).value);
        getHashMapReturnValues().put("proration_tax_amount",((javax.xml.ws.Holder)h_proration_tax_amount).value);
        getHashMapReturnValues().put("proration_credit_result_amount",((javax.xml.ws.Holder)h_proration_credit_result_amount).value);
        getHashMapReturnValues().put("proration_credit_amount",((javax.xml.ws.Holder)h_proration_credit_amount).value);
        getHashMapReturnValues().put("plan_instance_no",((javax.xml.ws.Holder)h_plan_instance_no).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> assignAcctPlanM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long new_plan_no = (Long) map.get("new_plan_no");
                String new_client_plan_id = (String) map.get("new_client_plan_id");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                Long existing_billing_group_no = (Long) map.get("existing_billing_group_no");
                String existing_client_billing_group_id = (String) map.get("existing_client_billing_group_id");
                String billing_group_name = (String) map.get("billing_group_name");
                String billing_group_description = (String) map.get("billing_group_description");
                String client_def_billing_group_id = (String) map.get("client_def_billing_group_id");
                Long notify_method = (Long) map.get("notify_method");
                Long notify_template_group = (Long) map.get("notify_template_group");
                Long statement_template = (Long) map.get("statement_template");
                Long credit_note_template = (Long) map.get("credit_note_template");
                Long existing_primary_payment_method_no = (Long) map.get("existing_primary_payment_method_no");
                String existing_client_primary_payment_method_id = (String) map.get("existing_client_primary_payment_method_id");
                Long existing_backup_payment_method_no = (Long) map.get("existing_backup_payment_method_no");
                String existing_client_backup_payment_method_id = (String) map.get("existing_client_backup_payment_method_id");
                String stmt_first_name = (String) map.get("stmt_first_name");
                String stmt_mi = (String) map.get("stmt_mi");
                String stmt_last_name = (String) map.get("stmt_last_name");
                String stmt_company_name = (String) map.get("stmt_company_name");
                String stmt_address1 = (String) map.get("stmt_address1");
                String stmt_address2 = (String) map.get("stmt_address2");
                String stmt_address3 = (String) map.get("stmt_address3");
                String stmt_city = (String) map.get("stmt_city");
                String stmt_locality = (String) map.get("stmt_locality");
                String stmt_state_prov = (String) map.get("stmt_state_prov");
                String stmt_country = (String) map.get("stmt_country");
                String stmt_postal_cd = (String) map.get("stmt_postal_cd");
                String stmt_phone = (String) map.get("stmt_phone");
                String stmt_phone_ext = (String) map.get("stmt_phone_ext");
                String stmt_cell_phone = (String) map.get("stmt_cell_phone");
                String stmt_work_phone = (String) map.get("stmt_work_phone");
                String stmt_work_phone_ext = (String) map.get("stmt_work_phone_ext");
                String stmt_fax = (String) map.get("stmt_fax");
                String stmt_email = (String) map.get("stmt_email");
                String stmt_birthdate = (String) map.get("stmt_birthdate");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_address3 = (String) map.get("bill_address3");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_country = (String) map.get("bill_country");
                String bill_postal_cd = (String) map.get("bill_postal_cd");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_ext = (String) map.get("bill_phone_ext");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_ext = (String) map.get("bill_work_phone_ext");
                String bill_fax = (String) map.get("bill_fax");
                String bill_email = (String) map.get("bill_email");
                String bill_birthdate = (String) map.get("bill_birthdate");
                String primary_pay_method_name = (String) map.get("primary_pay_method_name");
                String primary_pay_method_cdid = (String) map.get("primary_pay_method_cdid");
                String primary_pay_method_description = (String) map.get("primary_pay_method_description");
                Long primary_pay_method_type = (Long) map.get("primary_pay_method_type");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_acct_no = (String) map.get("bank_acct_no");
                String bank_routing_no = (String) map.get("bank_routing_no");
                String cvv = (String) map.get("cvv");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                String bill_agreement_id = (String) map.get("bill_agreement_id");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                Long existing_dunning_group_no = (Long) map.get("existing_dunning_group_no");
                String existing_client_def_dunning_group_id = (String) map.get("existing_client_def_dunning_group_id");
                String dunning_group_name = (String) map.get("dunning_group_name");
                String dunning_group_description = (String) map.get("dunning_group_description");
                String client_dunning_group_id = (String) map.get("client_dunning_group_id");
                Long dunning_process_no = (Long) map.get("dunning_process_no");
                String client_dunning_process_id = (String) map.get("client_dunning_process_id");
                String alt_start_date = (String) map.get("alt_start_date");
                Long status_until_alt_start = (Long) map.get("status_until_alt_start");
                Long alt_bill_day = (Long) map.get("alt_bill_day");
                Long invoicing_option = (Long) map.get("invoicing_option");
                String retroactive_start_date = (String) map.get("retroactive_start_date");
                Double balance_forward = (Double) map.get("balance_forward");
                Long resp_level_cd = (Long) map.get("resp_level_cd");
                Long parent_acct_master_plan_inst_id = (Long) map.get("parent_acct_master_plan_inst_id");
                Long parent_plan_instance_no = (Long) map.get("parent_plan_instance_no");
                String client_parent_plan_instance_id = (String) map.get("client_parent_plan_instance_id");
                Long alt_rate_schedule_no = (Long) map.get("alt_rate_schedule_no");
                Double plan_units = (Double) map.get("plan_units");
                com.aria.common.shared.CouponCodesArray coupon_codes = (com.aria.common.shared.CouponCodesArray) map.get("coupon_codes");
                String promo_cd = (String) map.get("promo_cd");
                Long plan_status = (Long) map.get("plan_status");
                String plan_instance_description = (String) map.get("plan_instance_description");
                com.aria.common.shared.PlanInstanceFieldsArray plan_instance_fields = (com.aria.common.shared.PlanInstanceFieldsArray) map.get("plan_instance_fields");
                Long assignment_directive = (Long) map.get("assignment_directive");
                String comments = (String) map.get("comments");
                String do_write = (String) map.get("do_write");
                String client_receipt_id = (String) map.get("client_receipt_id");
                Long offset_months = (Long) map.get("offset_months");
                String alt_proration_start_date = (String) map.get("alt_proration_start_date");
                Long auto_offset_months_option = (Long) map.get("auto_offset_months_option");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                Long usage_accumulation_reset_months = (Long) map.get("usage_accumulation_reset_months");
                String usage_pooling = (String) map.get("usage_pooling");
                String usage_threshold_applicability = (String) map.get("usage_threshold_applicability");
                com.aria.common.shared.CustomRatesArray custom_rates = (com.aria.common.shared.CustomRatesArray) map.get("custom_rates");
                String effective_date = (String) map.get("effective_date");
                Long offset_interval = (Long) map.get("offset_interval");
                Long force_supp_bill_date_reset = (Long) map.get("force_supp_bill_date_reset");
                String client_alt_rate_schedule_id = (String) map.get("client_alt_rate_schedule_id");
                
        return assignAcctPlanM(client_no, auth_key, acct_no, new_plan_no, new_client_plan_id, client_plan_instance_id, existing_billing_group_no, existing_client_billing_group_id, billing_group_name, billing_group_description, client_def_billing_group_id, notify_method, notify_template_group, statement_template, credit_note_template, existing_primary_payment_method_no, existing_client_primary_payment_method_id, existing_backup_payment_method_no, existing_client_backup_payment_method_id, stmt_first_name, stmt_mi, stmt_last_name, stmt_company_name, stmt_address1, stmt_address2, stmt_address3, stmt_city, stmt_locality, stmt_state_prov, stmt_country, stmt_postal_cd, stmt_phone, stmt_phone_ext, stmt_cell_phone, stmt_work_phone, stmt_work_phone_ext, stmt_fax, stmt_email, stmt_birthdate, bill_first_name, bill_middle_initial, bill_last_name, bill_company_name, bill_address1, bill_address2, bill_address3, bill_city, bill_locality, bill_state_prov, bill_country, bill_postal_cd, bill_phone, bill_phone_ext, bill_cell_phone, bill_work_phone, bill_work_phone_ext, bill_fax, bill_email, bill_birthdate, primary_pay_method_name, primary_pay_method_cdid, primary_pay_method_description, primary_pay_method_type, cc_number, cc_expire_mm, cc_expire_yyyy, bank_acct_no, bank_routing_no, cvv, track_data1, track_data2, bill_agreement_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, existing_dunning_group_no, existing_client_def_dunning_group_id, dunning_group_name, dunning_group_description, client_dunning_group_id, dunning_process_no, client_dunning_process_id, alt_start_date, status_until_alt_start, alt_bill_day, invoicing_option, retroactive_start_date, balance_forward, resp_level_cd, parent_acct_master_plan_inst_id, parent_plan_instance_no, client_parent_plan_instance_id, alt_rate_schedule_no, plan_units, coupon_codes, promo_cd, plan_status, plan_instance_description, plan_instance_fields, assignment_directive, comments, do_write, client_receipt_id, offset_months, alt_proration_start_date, auto_offset_months_option, alt_client_acct_group_id, usage_accumulation_reset_months, usage_pooling, usage_threshold_applicability, custom_rates, effective_date, offset_interval, force_supp_bill_date_reset, client_alt_rate_schedule_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelAcctPlanM(Long client_no, String auth_key, Long acct_no, String client_receipt_id, Long plan_instance_no, String client_plan_instance_id, Long assignment_directive, String comments, String alt_proration_start_date, String effective_date, Long offset_interval, String invoice_unbilled_usage, String do_write){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_plan_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_tax_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().cancelAcctPlanM(client_no, auth_key, acct_no, client_receipt_id, plan_instance_no, client_plan_instance_id, assignment_directive, comments, alt_proration_start_date, effective_date, offset_interval, invoice_unbilled_usage, do_write, h_error_code, h_error_msg, h_proration_result_amount, h_invoice_no, h_acct_plan_line_items, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_total_tax_credit, h_total_credit_before_tax, h_total, h_proration_credit_result_amount, h_proration_credit_amount, h_proration_tax_amount, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proration_result_amount",((javax.xml.ws.Holder)h_proration_result_amount).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("acct_plan_line_items",((javax.xml.ws.Holder)h_acct_plan_line_items).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("total_tax_credit",((javax.xml.ws.Holder)h_total_tax_credit).value);
        getHashMapReturnValues().put("total_credit_before_tax",((javax.xml.ws.Holder)h_total_credit_before_tax).value);
        getHashMapReturnValues().put("total",((javax.xml.ws.Holder)h_total).value);
        getHashMapReturnValues().put("proration_credit_result_amount",((javax.xml.ws.Holder)h_proration_credit_result_amount).value);
        getHashMapReturnValues().put("proration_credit_amount",((javax.xml.ws.Holder)h_proration_credit_amount).value);
        getHashMapReturnValues().put("proration_tax_amount",((javax.xml.ws.Holder)h_proration_tax_amount).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelAcctPlanM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_receipt_id = (String) map.get("client_receipt_id");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                Long assignment_directive = (Long) map.get("assignment_directive");
                String comments = (String) map.get("comments");
                String alt_proration_start_date = (String) map.get("alt_proration_start_date");
                String effective_date = (String) map.get("effective_date");
                Long offset_interval = (Long) map.get("offset_interval");
                String invoice_unbilled_usage = (String) map.get("invoice_unbilled_usage");
                String do_write = (String) map.get("do_write");
                
        return cancelAcctPlanM(client_no, auth_key, acct_no, client_receipt_id, plan_instance_no, client_plan_instance_id, assignment_directive, comments, alt_proration_start_date, effective_date, offset_interval, invoice_unbilled_usage, do_write);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createAcctDunningGroupM(Long client_no, String auth_key, Long acct_no, String dunning_group_name, String dunning_group_description, String client_dunning_group_id, Long dunning_process_no, String client_dunning_process_id, com.aria.common.shared.MasterPlansSummaryArray master_plans_summary, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().createAcctDunningGroupM(client_no, auth_key, acct_no, dunning_group_name, dunning_group_description, client_dunning_group_id, dunning_process_no, client_dunning_process_id, master_plans_summary, client_receipt_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createAcctDunningGroupM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String dunning_group_name = (String) map.get("dunning_group_name");
                String dunning_group_description = (String) map.get("dunning_group_description");
                String client_dunning_group_id = (String) map.get("client_dunning_group_id");
                Long dunning_process_no = (Long) map.get("dunning_process_no");
                String client_dunning_process_id = (String) map.get("client_dunning_process_id");
                com.aria.common.shared.MasterPlansSummaryArray master_plans_summary = (com.aria.common.shared.MasterPlansSummaryArray) map.get("master_plans_summary");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return createAcctDunningGroupM(client_no, auth_key, acct_no, dunning_group_name, dunning_group_description, client_dunning_group_id, dunning_process_no, client_dunning_process_id, master_plans_summary, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateAcctPlanM(Long client_no, String auth_key, Long acct_no, Long plan_instance_no, String client_plan_instance_id, Long alt_rate_schedule_no, Double plan_units, com.aria.common.shared.CouponCodesArray coupon_codes, String promo_cd, Long plan_status, String plan_instance_description, com.aria.common.shared.PlanInstanceFieldUpdateArray plan_instance_field_update, Long assignment_directive, String comments, String do_write, String client_receipt_id, com.aria.common.shared.CustomRatesArray custom_rates, String effective_date, Long offset_interval, Long force_master_bill_date_reset, String client_alt_rate_schedule_id, Long new_client_plan_inst_id, String dunning_state, String degrade_date, Long resp_level_cd, String parent_acct_master_plan_inst_id, Long usage_accumulation_reset_months, String usage_pooling, String usage_threshold_applicability){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_activation_fee = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_mthly_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_annu_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_plan_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_tax_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_amount = new javax.xml.ws.Holder();

        
        getCompletePort().updateAcctPlanM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, alt_rate_schedule_no, plan_units, coupon_codes, promo_cd, plan_status, plan_instance_description, plan_instance_field_update, assignment_directive, comments, do_write, client_receipt_id, custom_rates, effective_date, offset_interval, force_master_bill_date_reset, client_alt_rate_schedule_id, new_client_plan_inst_id, dunning_state, degrade_date, resp_level_cd, parent_acct_master_plan_inst_id, usage_accumulation_reset_months, usage_pooling, usage_threshold_applicability, h_error_code, h_error_msg, h_proration_result_amount, h_collection_error_code, h_collection_error_msg, h_statement_error_code, h_statement_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_invoice_no, h_expectd_activation_fee, h_expectd_mthly_recurring_cost, h_expectd_annu_recurring_cost, h_acct_plan_line_items, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_total_tax_credit, h_total_credit_before_tax, h_total, h_proration_tax_amount, h_proration_credit_result_amount, h_proration_credit_amount);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proration_result_amount",((javax.xml.ws.Holder)h_proration_result_amount).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("statement_error_code",((javax.xml.ws.Holder)h_statement_error_code).value);
        getHashMapReturnValues().put("statement_error_msg",((javax.xml.ws.Holder)h_statement_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("expectd_activation_fee",((javax.xml.ws.Holder)h_expectd_activation_fee).value);
        getHashMapReturnValues().put("expectd_mthly_recurring_cost",((javax.xml.ws.Holder)h_expectd_mthly_recurring_cost).value);
        getHashMapReturnValues().put("expectd_annu_recurring_cost",((javax.xml.ws.Holder)h_expectd_annu_recurring_cost).value);
        getHashMapReturnValues().put("acct_plan_line_items",((javax.xml.ws.Holder)h_acct_plan_line_items).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("total_tax_credit",((javax.xml.ws.Holder)h_total_tax_credit).value);
        getHashMapReturnValues().put("total_credit_before_tax",((javax.xml.ws.Holder)h_total_credit_before_tax).value);
        getHashMapReturnValues().put("total",((javax.xml.ws.Holder)h_total).value);
        getHashMapReturnValues().put("proration_tax_amount",((javax.xml.ws.Holder)h_proration_tax_amount).value);
        getHashMapReturnValues().put("proration_credit_result_amount",((javax.xml.ws.Holder)h_proration_credit_result_amount).value);
        getHashMapReturnValues().put("proration_credit_amount",((javax.xml.ws.Holder)h_proration_credit_amount).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateAcctPlanM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                Long alt_rate_schedule_no = (Long) map.get("alt_rate_schedule_no");
                Double plan_units = (Double) map.get("plan_units");
                com.aria.common.shared.CouponCodesArray coupon_codes = (com.aria.common.shared.CouponCodesArray) map.get("coupon_codes");
                String promo_cd = (String) map.get("promo_cd");
                Long plan_status = (Long) map.get("plan_status");
                String plan_instance_description = (String) map.get("plan_instance_description");
                com.aria.common.shared.PlanInstanceFieldUpdateArray plan_instance_field_update = (com.aria.common.shared.PlanInstanceFieldUpdateArray) map.get("plan_instance_field_update");
                Long assignment_directive = (Long) map.get("assignment_directive");
                String comments = (String) map.get("comments");
                String do_write = (String) map.get("do_write");
                String client_receipt_id = (String) map.get("client_receipt_id");
                com.aria.common.shared.CustomRatesArray custom_rates = (com.aria.common.shared.CustomRatesArray) map.get("custom_rates");
                String effective_date = (String) map.get("effective_date");
                Long offset_interval = (Long) map.get("offset_interval");
                Long force_master_bill_date_reset = (Long) map.get("force_master_bill_date_reset");
                String client_alt_rate_schedule_id = (String) map.get("client_alt_rate_schedule_id");
                Long new_client_plan_inst_id = (Long) map.get("new_client_plan_inst_id");
                String dunning_state = (String) map.get("dunning_state");
                String degrade_date = (String) map.get("degrade_date");
                Long resp_level_cd = (Long) map.get("resp_level_cd");
                String parent_acct_master_plan_inst_id = (String) map.get("parent_acct_master_plan_inst_id");
                Long usage_accumulation_reset_months = (Long) map.get("usage_accumulation_reset_months");
                String usage_pooling = (String) map.get("usage_pooling");
                String usage_threshold_applicability = (String) map.get("usage_threshold_applicability");
                
        return updateAcctPlanM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, alt_rate_schedule_no, plan_units, coupon_codes, promo_cd, plan_status, plan_instance_description, plan_instance_field_update, assignment_directive, comments, do_write, client_receipt_id, custom_rates, effective_date, offset_interval, force_master_bill_date_reset, client_alt_rate_schedule_id, new_client_plan_inst_id, dunning_state, degrade_date, resp_level_cd, parent_acct_master_plan_inst_id, usage_accumulation_reset_months, usage_pooling, usage_threshold_applicability);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateAcctBillingGroupM(Long client_no, String auth_key, Long acct_no, Long billing_group_no, String billing_group_name, String billing_group_description, String client_billing_group_id, String new_client_billing_group_id, Long notify_method, Long notify_template_group, Long statement_template, Long credit_note_template, Long primary_payment_method_no, String client_primary_payment_method_id, Long backup_payment_method_no, String client_backup_payment_method_id, String stmt_first_name, String stmt_mi, String stmt_last_name, String stmt_company_name, String stmt_address1, String stmt_address2, String stmt_address3, String stmt_city, String stmt_locality, String stmt_state_prov, String stmt_country, String stmt_postal_cd, String stmt_phone, String stmt_phone_ext, String stmt_cell_phone, String stmt_work_phone, String stmt_work_phone_ext, String stmt_fax, String stmt_email, String stmt_birthdate, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_company_name, String bill_address1, String bill_address2, String bill_address3, String bill_city, String bill_locality, String bill_state_prov, String bill_country, String bill_postal_cd, String bill_phone, String bill_phone_ext, String bill_cell_phone, String bill_work_phone, String bill_work_phone_ext, String bill_fax, String bill_email, String bill_birthdate, String pay_method_name, String client_payment_method_id, String pay_method_description, Long pay_method_type, String cc_num, Long cc_expire_mm, Long cc_expire_yyyy, String bank_acct_num, String bank_routing_num, String cvv, String track_data1, String track_data2, String bill_agreement_id, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd, Long billing_group_directive, com.aria.common.shared.MasterPlansSummaryArray master_plans_summary, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        
        getCompletePort().updateAcctBillingGroupM(client_no, auth_key, acct_no, billing_group_no, billing_group_name, billing_group_description, client_billing_group_id, new_client_billing_group_id, notify_method, notify_template_group, statement_template, credit_note_template, primary_payment_method_no, client_primary_payment_method_id, backup_payment_method_no, client_backup_payment_method_id, stmt_first_name, stmt_mi, stmt_last_name, stmt_company_name, stmt_address1, stmt_address2, stmt_address3, stmt_city, stmt_locality, stmt_state_prov, stmt_country, stmt_postal_cd, stmt_phone, stmt_phone_ext, stmt_cell_phone, stmt_work_phone, stmt_work_phone_ext, stmt_fax, stmt_email, stmt_birthdate, bill_first_name, bill_middle_initial, bill_last_name, bill_company_name, bill_address1, bill_address2, bill_address3, bill_city, bill_locality, bill_state_prov, bill_country, bill_postal_cd, bill_phone, bill_phone_ext, bill_cell_phone, bill_work_phone, bill_work_phone_ext, bill_fax, bill_email, bill_birthdate, pay_method_name, client_payment_method_id, pay_method_description, pay_method_type, cc_num, cc_expire_mm, cc_expire_yyyy, bank_acct_num, bank_routing_num, cvv, track_data1, track_data2, bill_agreement_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, billing_group_directive, master_plans_summary, client_receipt_id, h_error_code, h_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateAcctBillingGroupM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long billing_group_no = (Long) map.get("billing_group_no");
                String billing_group_name = (String) map.get("billing_group_name");
                String billing_group_description = (String) map.get("billing_group_description");
                String client_billing_group_id = (String) map.get("client_billing_group_id");
                String new_client_billing_group_id = (String) map.get("new_client_billing_group_id");
                Long notify_method = (Long) map.get("notify_method");
                Long notify_template_group = (Long) map.get("notify_template_group");
                Long statement_template = (Long) map.get("statement_template");
                Long credit_note_template = (Long) map.get("credit_note_template");
                Long primary_payment_method_no = (Long) map.get("primary_payment_method_no");
                String client_primary_payment_method_id = (String) map.get("client_primary_payment_method_id");
                Long backup_payment_method_no = (Long) map.get("backup_payment_method_no");
                String client_backup_payment_method_id = (String) map.get("client_backup_payment_method_id");
                String stmt_first_name = (String) map.get("stmt_first_name");
                String stmt_mi = (String) map.get("stmt_mi");
                String stmt_last_name = (String) map.get("stmt_last_name");
                String stmt_company_name = (String) map.get("stmt_company_name");
                String stmt_address1 = (String) map.get("stmt_address1");
                String stmt_address2 = (String) map.get("stmt_address2");
                String stmt_address3 = (String) map.get("stmt_address3");
                String stmt_city = (String) map.get("stmt_city");
                String stmt_locality = (String) map.get("stmt_locality");
                String stmt_state_prov = (String) map.get("stmt_state_prov");
                String stmt_country = (String) map.get("stmt_country");
                String stmt_postal_cd = (String) map.get("stmt_postal_cd");
                String stmt_phone = (String) map.get("stmt_phone");
                String stmt_phone_ext = (String) map.get("stmt_phone_ext");
                String stmt_cell_phone = (String) map.get("stmt_cell_phone");
                String stmt_work_phone = (String) map.get("stmt_work_phone");
                String stmt_work_phone_ext = (String) map.get("stmt_work_phone_ext");
                String stmt_fax = (String) map.get("stmt_fax");
                String stmt_email = (String) map.get("stmt_email");
                String stmt_birthdate = (String) map.get("stmt_birthdate");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_address3 = (String) map.get("bill_address3");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_country = (String) map.get("bill_country");
                String bill_postal_cd = (String) map.get("bill_postal_cd");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_ext = (String) map.get("bill_phone_ext");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_ext = (String) map.get("bill_work_phone_ext");
                String bill_fax = (String) map.get("bill_fax");
                String bill_email = (String) map.get("bill_email");
                String bill_birthdate = (String) map.get("bill_birthdate");
                String pay_method_name = (String) map.get("pay_method_name");
                String client_payment_method_id = (String) map.get("client_payment_method_id");
                String pay_method_description = (String) map.get("pay_method_description");
                Long pay_method_type = (Long) map.get("pay_method_type");
                String cc_num = (String) map.get("cc_num");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String cvv = (String) map.get("cvv");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                String bill_agreement_id = (String) map.get("bill_agreement_id");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                Long billing_group_directive = (Long) map.get("billing_group_directive");
                com.aria.common.shared.MasterPlansSummaryArray master_plans_summary = (com.aria.common.shared.MasterPlansSummaryArray) map.get("master_plans_summary");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return updateAcctBillingGroupM(client_no, auth_key, acct_no, billing_group_no, billing_group_name, billing_group_description, client_billing_group_id, new_client_billing_group_id, notify_method, notify_template_group, statement_template, credit_note_template, primary_payment_method_no, client_primary_payment_method_id, backup_payment_method_no, client_backup_payment_method_id, stmt_first_name, stmt_mi, stmt_last_name, stmt_company_name, stmt_address1, stmt_address2, stmt_address3, stmt_city, stmt_locality, stmt_state_prov, stmt_country, stmt_postal_cd, stmt_phone, stmt_phone_ext, stmt_cell_phone, stmt_work_phone, stmt_work_phone_ext, stmt_fax, stmt_email, stmt_birthdate, bill_first_name, bill_middle_initial, bill_last_name, bill_company_name, bill_address1, bill_address2, bill_address3, bill_city, bill_locality, bill_state_prov, bill_country, bill_postal_cd, bill_phone, bill_phone_ext, bill_cell_phone, bill_work_phone, bill_work_phone_ext, bill_fax, bill_email, bill_birthdate, pay_method_name, client_payment_method_id, pay_method_description, pay_method_type, cc_num, cc_expire_mm, cc_expire_yyyy, bank_acct_num, bank_routing_num, cvv, track_data1, track_data2, bill_agreement_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, billing_group_directive, master_plans_summary, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> replaceAcctPlanM(Long client_no, String auth_key, Long acct_no, Long plan_instance_no, String client_plan_instance_id, Long new_plan_no, String new_client_plan_id, String new_client_plan_instance_id, Long alt_rate_schedule_no, Double plan_units, com.aria.common.shared.CouponCodesArray coupon_codes, String promo_cd, com.aria.common.shared.MpSurchargesArray mp_surcharges, Long plan_status, String plan_instance_description, com.aria.common.shared.PlanInstanceFieldUpdateArray plan_instance_field_update, Long assignment_directive, String comments, String do_write, String client_receipt_id, Long offset_months, String alt_proration_start_date, Long auto_offset_months_option, String alt_client_acct_group_id, com.aria.common.shared.CustomRatesArray custom_rates, String effective_date, Long offset_interval, String invoice_unbilled_usage, Long force_supp_bill_date_reset, Long force_master_bill_date_reset, String client_alt_rate_schedule_id, Long usage_accumulation_reset_months, String usage_pooling, String usage_threshold_applicability){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_activation_fee = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_mthly_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_annu_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_plan_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_tax_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().replaceAcctPlanM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, new_plan_no, new_client_plan_id, new_client_plan_instance_id, alt_rate_schedule_no, plan_units, coupon_codes, promo_cd, mp_surcharges, plan_status, plan_instance_description, plan_instance_field_update, assignment_directive, comments, do_write, client_receipt_id, offset_months, alt_proration_start_date, auto_offset_months_option, alt_client_acct_group_id, custom_rates, effective_date, offset_interval, invoice_unbilled_usage, force_supp_bill_date_reset, force_master_bill_date_reset, client_alt_rate_schedule_id, usage_accumulation_reset_months, usage_pooling, usage_threshold_applicability, h_error_code, h_error_msg, h_proration_result_amount, h_collection_error_code, h_collection_error_msg, h_statement_error_code, h_statement_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_invoice_no, h_expectd_activation_fee, h_expectd_mthly_recurring_cost, h_expectd_annu_recurring_cost, h_acct_plan_line_items, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_total_tax_credit, h_total_credit_before_tax, h_total, h_proration_credit_result_amount, h_proration_credit_amount, h_proration_tax_amount, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proration_result_amount",((javax.xml.ws.Holder)h_proration_result_amount).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("statement_error_code",((javax.xml.ws.Holder)h_statement_error_code).value);
        getHashMapReturnValues().put("statement_error_msg",((javax.xml.ws.Holder)h_statement_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("expectd_activation_fee",((javax.xml.ws.Holder)h_expectd_activation_fee).value);
        getHashMapReturnValues().put("expectd_mthly_recurring_cost",((javax.xml.ws.Holder)h_expectd_mthly_recurring_cost).value);
        getHashMapReturnValues().put("expectd_annu_recurring_cost",((javax.xml.ws.Holder)h_expectd_annu_recurring_cost).value);
        getHashMapReturnValues().put("acct_plan_line_items",((javax.xml.ws.Holder)h_acct_plan_line_items).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("total_tax_credit",((javax.xml.ws.Holder)h_total_tax_credit).value);
        getHashMapReturnValues().put("total_credit_before_tax",((javax.xml.ws.Holder)h_total_credit_before_tax).value);
        getHashMapReturnValues().put("total",((javax.xml.ws.Holder)h_total).value);
        getHashMapReturnValues().put("proration_credit_result_amount",((javax.xml.ws.Holder)h_proration_credit_result_amount).value);
        getHashMapReturnValues().put("proration_credit_amount",((javax.xml.ws.Holder)h_proration_credit_amount).value);
        getHashMapReturnValues().put("proration_tax_amount",((javax.xml.ws.Holder)h_proration_tax_amount).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> replaceAcctPlanM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                Long new_plan_no = (Long) map.get("new_plan_no");
                String new_client_plan_id = (String) map.get("new_client_plan_id");
                String new_client_plan_instance_id = (String) map.get("new_client_plan_instance_id");
                Long alt_rate_schedule_no = (Long) map.get("alt_rate_schedule_no");
                Double plan_units = (Double) map.get("plan_units");
                com.aria.common.shared.CouponCodesArray coupon_codes = (com.aria.common.shared.CouponCodesArray) map.get("coupon_codes");
                String promo_cd = (String) map.get("promo_cd");
                com.aria.common.shared.MpSurchargesArray mp_surcharges = (com.aria.common.shared.MpSurchargesArray) map.get("mp_surcharges");
                Long plan_status = (Long) map.get("plan_status");
                String plan_instance_description = (String) map.get("plan_instance_description");
                com.aria.common.shared.PlanInstanceFieldUpdateArray plan_instance_field_update = (com.aria.common.shared.PlanInstanceFieldUpdateArray) map.get("plan_instance_field_update");
                Long assignment_directive = (Long) map.get("assignment_directive");
                String comments = (String) map.get("comments");
                String do_write = (String) map.get("do_write");
                String client_receipt_id = (String) map.get("client_receipt_id");
                Long offset_months = (Long) map.get("offset_months");
                String alt_proration_start_date = (String) map.get("alt_proration_start_date");
                Long auto_offset_months_option = (Long) map.get("auto_offset_months_option");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                com.aria.common.shared.CustomRatesArray custom_rates = (com.aria.common.shared.CustomRatesArray) map.get("custom_rates");
                String effective_date = (String) map.get("effective_date");
                Long offset_interval = (Long) map.get("offset_interval");
                String invoice_unbilled_usage = (String) map.get("invoice_unbilled_usage");
                Long force_supp_bill_date_reset = (Long) map.get("force_supp_bill_date_reset");
                Long force_master_bill_date_reset = (Long) map.get("force_master_bill_date_reset");
                String client_alt_rate_schedule_id = (String) map.get("client_alt_rate_schedule_id");
                Long usage_accumulation_reset_months = (Long) map.get("usage_accumulation_reset_months");
                String usage_pooling = (String) map.get("usage_pooling");
                String usage_threshold_applicability = (String) map.get("usage_threshold_applicability");
                
        return replaceAcctPlanM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, new_plan_no, new_client_plan_id, new_client_plan_instance_id, alt_rate_schedule_no, plan_units, coupon_codes, promo_cd, mp_surcharges, plan_status, plan_instance_description, plan_instance_field_update, assignment_directive, comments, do_write, client_receipt_id, offset_months, alt_proration_start_date, auto_offset_months_option, alt_client_acct_group_id, custom_rates, effective_date, offset_interval, invoice_unbilled_usage, force_supp_bill_date_reset, force_master_bill_date_reset, client_alt_rate_schedule_id, usage_accumulation_reset_months, usage_pooling, usage_threshold_applicability);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPlanBalanceM(Long client_no, String auth_key, Long acct_no, Long plan_instance_no, String client_plan_instance_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_currency_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_current_balance_due = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_balance_due = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPlanBalanceM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, h_error_code, h_error_msg, h_currency_cd, h_current_balance_due, h_total_balance_due);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("currency_cd",((javax.xml.ws.Holder)h_currency_cd).value);
        getHashMapReturnValues().put("current_balance_due",((javax.xml.ws.Holder)h_current_balance_due).value);
        getHashMapReturnValues().put("total_balance_due",((javax.xml.ws.Holder)h_total_balance_due).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPlanBalanceM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                
        return getAcctPlanBalanceM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPlanNotifyMethodM(Long client_no, String auth_key, Long acct_no, Long plan_instance_no, String client_plan_instance_id, Long billing_group_no, String client_def_billing_group_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_notify_method = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_notify_method_name = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPlanNotifyMethodM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, billing_group_no, client_def_billing_group_id, h_error_code, h_error_msg, h_notify_method, h_notify_method_name);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("notify_method",((javax.xml.ws.Holder)h_notify_method).value);
        getHashMapReturnValues().put("notify_method_name",((javax.xml.ws.Holder)h_notify_method_name).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPlanNotifyMethodM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                Long billing_group_no = (Long) map.get("billing_group_no");
                String client_def_billing_group_id = (String) map.get("client_def_billing_group_id");
                
        return getAcctPlanNotifyMethodM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, billing_group_no, client_def_billing_group_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setPaymentResponsibilityM(Long client_no, String auth_key, Long account_no, Long plan_instance_no, String client_plan_instance_id, Long resp_level_cd, Long senior_acct_no, String senior_acct_user_id, String client_senior_acct_id, Long senior_plan_instance_no, String client_senior_plan_instance_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setPaymentResponsibilityM(client_no, auth_key, account_no, plan_instance_no, client_plan_instance_id, resp_level_cd, senior_acct_no, senior_acct_user_id, client_senior_acct_id, senior_plan_instance_no, client_senior_plan_instance_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setPaymentResponsibilityM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                Long resp_level_cd = (Long) map.get("resp_level_cd");
                Long senior_acct_no = (Long) map.get("senior_acct_no");
                String senior_acct_user_id = (String) map.get("senior_acct_user_id");
                String client_senior_acct_id = (String) map.get("client_senior_acct_id");
                Long senior_plan_instance_no = (Long) map.get("senior_plan_instance_no");
                String client_senior_plan_instance_id = (String) map.get("client_senior_plan_instance_id");
                
        return setPaymentResponsibilityM(client_no, auth_key, account_no, plan_instance_no, client_plan_instance_id, resp_level_cd, senior_acct_no, senior_acct_user_id, client_senior_acct_id, senior_plan_instance_no, client_senior_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> removeAcctPlanCustomRatesM(Long client_no, String auth_key, Long acct_no, Long plan_instance_no, String client_plan_instance_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().removeAcctPlanCustomRatesM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> removeAcctPlanCustomRatesM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                
        return removeAcctPlanCustomRatesM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctDunningGroupDetailsM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long plan_instance_no, String client_plan_instance_id, Long dunning_group_no, String client_dunning_group_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_dunning_groups = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctDunningGroupDetailsM(client_no, auth_key, acct_no, client_acct_id, plan_instance_no, client_plan_instance_id, dunning_group_no, client_dunning_group_id, h_error_code, h_error_msg, h_dunning_groups);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("dunning_groups",((javax.xml.ws.Holder)h_dunning_groups).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctDunningGroupDetailsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                Long dunning_group_no = (Long) map.get("dunning_group_no");
                String client_dunning_group_id = (String) map.get("client_dunning_group_id");
                
        return getAcctDunningGroupDetailsM(client_no, auth_key, acct_no, client_acct_id, plan_instance_no, client_plan_instance_id, dunning_group_no, client_dunning_group_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateAcctDunningGroupM(Long client_no, String auth_key, Long acct_no, Long dunning_group_no, String client_dunning_group_id, String new_client_dunning_group_id, String dunning_group_name, String dunning_group_description, Long dunning_process_no, String client_dunning_process_id, Long dunning_group_directive, com.aria.common.shared.MasterPlansSummaryArray master_plans_summary){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().updateAcctDunningGroupM(client_no, auth_key, acct_no, dunning_group_no, client_dunning_group_id, new_client_dunning_group_id, dunning_group_name, dunning_group_description, dunning_process_no, client_dunning_process_id, dunning_group_directive, master_plans_summary, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateAcctDunningGroupM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long dunning_group_no = (Long) map.get("dunning_group_no");
                String client_dunning_group_id = (String) map.get("client_dunning_group_id");
                String new_client_dunning_group_id = (String) map.get("new_client_dunning_group_id");
                String dunning_group_name = (String) map.get("dunning_group_name");
                String dunning_group_description = (String) map.get("dunning_group_description");
                Long dunning_process_no = (Long) map.get("dunning_process_no");
                String client_dunning_process_id = (String) map.get("client_dunning_process_id");
                Long dunning_group_directive = (Long) map.get("dunning_group_directive");
                com.aria.common.shared.MasterPlansSummaryArray master_plans_summary = (com.aria.common.shared.MasterPlansSummaryArray) map.get("master_plans_summary");
                
        return updateAcctDunningGroupM(client_no, auth_key, acct_no, dunning_group_no, client_dunning_group_id, new_client_dunning_group_id, dunning_group_name, dunning_group_description, dunning_process_no, client_dunning_process_id, dunning_group_directive, master_plans_summary);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateAcctPlanStatusM(Long client_no, String auth_key, Long acct_no, Long plan_instance_no, String client_plan_instance_id, Long status_cd, String dunning_state, String degrade_date, Long queue_days, String queue_date, Long force_bill_date_reset, String comments, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().updateAcctPlanStatusM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, status_cd, dunning_state, degrade_date, queue_days, queue_date, force_bill_date_reset, comments, client_receipt_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateAcctPlanStatusM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                Long status_cd = (Long) map.get("status_cd");
                String dunning_state = (String) map.get("dunning_state");
                String degrade_date = (String) map.get("degrade_date");
                Long queue_days = (Long) map.get("queue_days");
                String queue_date = (String) map.get("queue_date");
                Long force_bill_date_reset = (Long) map.get("force_bill_date_reset");
                String comments = (String) map.get("comments");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return updateAcctPlanStatusM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, status_cd, dunning_state, degrade_date, queue_days, queue_date, force_bill_date_reset, comments, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelQueuedAcctPlanChangeM(Long client_no, String auth_key, Long acct_no, com.aria.common.shared.PlanInstanceToRemoveArray plan_instance_to_remove, com.aria.common.shared.QueueIdToRemoveArray queue_id_to_remove, String remove_all_queued_plans, String remove_terminate_pending){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().cancelQueuedAcctPlanChangeM(client_no, auth_key, acct_no, plan_instance_to_remove, queue_id_to_remove, remove_all_queued_plans, remove_terminate_pending, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelQueuedAcctPlanChangeM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                com.aria.common.shared.PlanInstanceToRemoveArray plan_instance_to_remove = (com.aria.common.shared.PlanInstanceToRemoveArray) map.get("plan_instance_to_remove");
                com.aria.common.shared.QueueIdToRemoveArray queue_id_to_remove = (com.aria.common.shared.QueueIdToRemoveArray) map.get("queue_id_to_remove");
                String remove_all_queued_plans = (String) map.get("remove_all_queued_plans");
                String remove_terminate_pending = (String) map.get("remove_terminate_pending");
                
        return cancelQueuedAcctPlanChangeM(client_no, auth_key, acct_no, plan_instance_to_remove, queue_id_to_remove, remove_all_queued_plans, remove_terminate_pending);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> adjustAcctPlanBillingDatesM(Long client_no, String auth_key, Long acct_no, com.aria.common.shared.BillingDatesArray billing_dates, String comments){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().adjustAcctPlanBillingDatesM(client_no, auth_key, acct_no, billing_dates, comments, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> adjustAcctPlanBillingDatesM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                com.aria.common.shared.BillingDatesArray billing_dates = (com.aria.common.shared.BillingDatesArray) map.get("billing_dates");
                String comments = (String) map.get("comments");
                
        return adjustAcctPlanBillingDatesM(client_no, auth_key, acct_no, billing_dates, comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAvailPlansForAcctM(Long client_no, String auth_key, Long acct_no, Long plan_instance_no, String client_plan_instance_id, String promo_cd, String include_full_plan_hierarchy_plans, String include_rs_summary){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_client_avail_plans = new javax.xml.ws.Holder();

        
        getCompletePort().getAvailPlansForAcctM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, promo_cd, include_full_plan_hierarchy_plans, include_rs_summary, h_error_code, h_error_msg, h_all_client_avail_plans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_client_avail_plans",((javax.xml.ws.Holder)h_all_client_avail_plans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAvailPlansForAcctM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                String promo_cd = (String) map.get("promo_cd");
                String include_full_plan_hierarchy_plans = (String) map.get("include_full_plan_hierarchy_plans");
                String include_rs_summary = (String) map.get("include_rs_summary");
                
        return getAvailPlansForAcctM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, promo_cd, include_full_plan_hierarchy_plans, include_rs_summary);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAvailPlansForAcctAllM(Long client_no, String auth_key, Long acct_no, Long plan_instance_no, String client_plan_instance_id, String promo_cd, String include_full_plan_hierarchy_plans, String include_rs_summary){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_client_plans_services = new javax.xml.ws.Holder();

        
        getCompletePort().getAvailPlansForAcctAllM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, promo_cd, include_full_plan_hierarchy_plans, include_rs_summary, h_error_code, h_error_msg, h_all_client_plans_services);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_client_plans_services",((javax.xml.ws.Holder)h_all_client_plans_services).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAvailPlansForAcctAllM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                String promo_cd = (String) map.get("promo_cd");
                String include_full_plan_hierarchy_plans = (String) map.get("include_full_plan_hierarchy_plans");
                String include_rs_summary = (String) map.get("include_rs_summary");
                
        return getAvailPlansForAcctAllM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, promo_cd, include_full_plan_hierarchy_plans, include_rs_summary);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPlansM(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_plans_m = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPlansM(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_acct_plans_m);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_plans_m",((javax.xml.ws.Holder)h_acct_plans_m).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPlansM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAcctPlansM(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPlansAllM(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_acct_plans_m = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPlansAllM(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_all_acct_plans_m);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_acct_plans_m",((javax.xml.ws.Holder)h_all_acct_plans_m).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPlansAllM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getAcctPlansAllM(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> modifyAcctPlanUnitInstances(Long client_no, String auth_key, Long acct_no, com.aria.common.shared.PlanUnitsArray plan_units, com.aria.common.shared.NewClientPlanUnitInstArray new_client_plan_unit_inst){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_supp_plan_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_tax_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_activation_fee = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_mthly_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_annu_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().modifyAcctPlanUnitInstances(client_no, auth_key, acct_no, plan_units, new_client_plan_unit_inst, h_error_code, h_error_msg, h_proration_result_amount, h_invoice_no, h_supp_plan_line_items, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_total_tax_credit, h_total_credit_before_tax, h_total, h_proration_credit_result_amount, h_proration_credit_amount, h_proration_tax_amount, h_expectd_activation_fee, h_expectd_mthly_recurring_cost, h_expectd_annu_recurring_cost, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proration_result_amount",((javax.xml.ws.Holder)h_proration_result_amount).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("supp_plan_line_items",((javax.xml.ws.Holder)h_supp_plan_line_items).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("total_tax_credit",((javax.xml.ws.Holder)h_total_tax_credit).value);
        getHashMapReturnValues().put("total_credit_before_tax",((javax.xml.ws.Holder)h_total_credit_before_tax).value);
        getHashMapReturnValues().put("total",((javax.xml.ws.Holder)h_total).value);
        getHashMapReturnValues().put("proration_credit_result_amount",((javax.xml.ws.Holder)h_proration_credit_result_amount).value);
        getHashMapReturnValues().put("proration_credit_amount",((javax.xml.ws.Holder)h_proration_credit_amount).value);
        getHashMapReturnValues().put("proration_tax_amount",((javax.xml.ws.Holder)h_proration_tax_amount).value);
        getHashMapReturnValues().put("expectd_activation_fee",((javax.xml.ws.Holder)h_expectd_activation_fee).value);
        getHashMapReturnValues().put("expectd_mthly_recurring_cost",((javax.xml.ws.Holder)h_expectd_mthly_recurring_cost).value);
        getHashMapReturnValues().put("expectd_annu_recurring_cost",((javax.xml.ws.Holder)h_expectd_annu_recurring_cost).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> modifyAcctPlanUnitInstances(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                com.aria.common.shared.PlanUnitsArray plan_units = (com.aria.common.shared.PlanUnitsArray) map.get("plan_units");
                com.aria.common.shared.NewClientPlanUnitInstArray new_client_plan_unit_inst = (com.aria.common.shared.NewClientPlanUnitInstArray) map.get("new_client_plan_unit_inst");
                
        return modifyAcctPlanUnitInstances(client_no, auth_key, acct_no, plan_units, new_client_plan_unit_inst);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPlanUnitInstanceAll(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long plan_no, String client_plan_id, Long queued_ind, Long plan_unit_inst_no, String client_plan_unit_inst_id, Long status_cd, Long plan_unit_inst_status_cd, Long fulfillment_only){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_no = new javax.xml.ws.Holder(acct_no);
        javax.xml.ws.Holder h_client_acct_id = new javax.xml.ws.Holder(client_acct_id);
        javax.xml.ws.Holder h_all_plan_unit_instances = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPlanUnitInstanceAll(client_no, auth_key, h_acct_no, h_client_acct_id, plan_no, client_plan_id, queued_ind, plan_unit_inst_no, client_plan_unit_inst_id, status_cd, plan_unit_inst_status_cd, fulfillment_only, h_error_code, h_error_msg, h_all_plan_unit_instances);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_no",((javax.xml.ws.Holder)h_acct_no).value);
        getHashMapReturnValues().put("client_acct_id",((javax.xml.ws.Holder)h_client_acct_id).value);
        getHashMapReturnValues().put("all_plan_unit_instances",((javax.xml.ws.Holder)h_all_plan_unit_instances).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPlanUnitInstanceAll(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long plan_no = (Long) map.get("plan_no");
                String client_plan_id = (String) map.get("client_plan_id");
                Long queued_ind = (Long) map.get("queued_ind");
                Long plan_unit_inst_no = (Long) map.get("plan_unit_inst_no");
                String client_plan_unit_inst_id = (String) map.get("client_plan_unit_inst_id");
                Long status_cd = (Long) map.get("status_cd");
                Long plan_unit_inst_status_cd = (Long) map.get("plan_unit_inst_status_cd");
                Long fulfillment_only = (Long) map.get("fulfillment_only");
                
        return getAcctPlanUnitInstanceAll(client_no, auth_key, acct_no, client_acct_id, plan_no, client_plan_id, queued_ind, plan_unit_inst_no, client_plan_unit_inst_id, status_cd, plan_unit_inst_status_cd, fulfillment_only);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateAcctPlanUnitInstance(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long plan_unit_inst_no, String client_plan_unit_inst_id, String new_client_plan_unit_inst_id, com.aria.common.shared.PlanUnitInstServicesArray plan_unit_inst_services, com.aria.common.shared.PlanUnitInstFieldsArray plan_unit_inst_fields, String do_write){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_acct_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_client_acct_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_plan_unit_inst_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_client_plan_unit_inst_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_monthly_rec_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_annual_rec_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().updateAcctPlanUnitInstance(client_no, auth_key, acct_no, client_acct_id, plan_unit_inst_no, client_plan_unit_inst_id, new_client_plan_unit_inst_id, plan_unit_inst_services, plan_unit_inst_fields, do_write, h_error_code, h_error_msg, h_out_acct_no, h_out_client_acct_id, h_out_plan_unit_inst_no, h_out_client_plan_unit_inst_id, h_proration_result_amount, h_invoice_no, h_invoice_line_items, h_collection_error_code, h_collection_error_msg, h_statement_error_code, h_statement_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_total_tax_credit, h_total_credit_before_tax, h_total, h_expectd_monthly_rec_cost, h_expectd_annual_rec_cost, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("out_acct_no",((javax.xml.ws.Holder)h_out_acct_no).value);
        getHashMapReturnValues().put("out_client_acct_id",((javax.xml.ws.Holder)h_out_client_acct_id).value);
        getHashMapReturnValues().put("out_plan_unit_inst_no",((javax.xml.ws.Holder)h_out_plan_unit_inst_no).value);
        getHashMapReturnValues().put("out_client_plan_unit_inst_id",((javax.xml.ws.Holder)h_out_client_plan_unit_inst_id).value);
        getHashMapReturnValues().put("proration_result_amount",((javax.xml.ws.Holder)h_proration_result_amount).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("invoice_line_items",((javax.xml.ws.Holder)h_invoice_line_items).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("statement_error_code",((javax.xml.ws.Holder)h_statement_error_code).value);
        getHashMapReturnValues().put("statement_error_msg",((javax.xml.ws.Holder)h_statement_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("total_tax_credit",((javax.xml.ws.Holder)h_total_tax_credit).value);
        getHashMapReturnValues().put("total_credit_before_tax",((javax.xml.ws.Holder)h_total_credit_before_tax).value);
        getHashMapReturnValues().put("total",((javax.xml.ws.Holder)h_total).value);
        getHashMapReturnValues().put("expectd_monthly_rec_cost",((javax.xml.ws.Holder)h_expectd_monthly_rec_cost).value);
        getHashMapReturnValues().put("expectd_annual_rec_cost",((javax.xml.ws.Holder)h_expectd_annual_rec_cost).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateAcctPlanUnitInstance(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long plan_unit_inst_no = (Long) map.get("plan_unit_inst_no");
                String client_plan_unit_inst_id = (String) map.get("client_plan_unit_inst_id");
                String new_client_plan_unit_inst_id = (String) map.get("new_client_plan_unit_inst_id");
                com.aria.common.shared.PlanUnitInstServicesArray plan_unit_inst_services = (com.aria.common.shared.PlanUnitInstServicesArray) map.get("plan_unit_inst_services");
                com.aria.common.shared.PlanUnitInstFieldsArray plan_unit_inst_fields = (com.aria.common.shared.PlanUnitInstFieldsArray) map.get("plan_unit_inst_fields");
                String do_write = (String) map.get("do_write");
                
        return updateAcctPlanUnitInstance(client_no, auth_key, acct_no, client_acct_id, plan_unit_inst_no, client_plan_unit_inst_id, new_client_plan_unit_inst_id, plan_unit_inst_services, plan_unit_inst_fields, do_write);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> assignCustomAcctPlanRatesM(Long client_no, String auth_key, Long acct_no, Long plan_instance_no, String client_plan_instance_id, com.aria.common.shared.CustomAcctRatesArray custom_acct_rates, Long service_no, String client_service_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().assignCustomAcctPlanRatesM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, custom_acct_rates, service_no, client_service_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> assignCustomAcctPlanRatesM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                com.aria.common.shared.CustomAcctRatesArray custom_acct_rates = (com.aria.common.shared.CustomAcctRatesArray) map.get("custom_acct_rates");
                Long service_no = (Long) map.get("service_no");
                String client_service_id = (String) map.get("client_service_id");
                
        return assignCustomAcctPlanRatesM(client_no, auth_key, acct_no, plan_instance_no, client_plan_instance_id, custom_acct_rates, service_no, client_service_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getQueuedAcctPlansM(Long client_no, String auth_key, Long account_number){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_queued_plans = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_current_rate_schedule_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_current_rate_schedule_id = new javax.xml.ws.Holder();

        
        getCompletePort().getQueuedAcctPlansM(client_no, auth_key, account_number, h_error_code, h_error_msg, h_queued_plans, h_current_rate_schedule_no, h_client_current_rate_schedule_id);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("queued_plans",((javax.xml.ws.Holder)h_queued_plans).value);
        getHashMapReturnValues().put("current_rate_schedule_no",((javax.xml.ws.Holder)h_current_rate_schedule_no).value);
        getHashMapReturnValues().put("client_current_rate_schedule_id",((javax.xml.ws.Holder)h_client_current_rate_schedule_id).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getQueuedAcctPlansM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_number = (Long) map.get("account_number");
                
        return getQueuedAcctPlansM(client_no, auth_key, account_number);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getInvoiceHistoryM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_id, String client_master_plan_instance_id, String user_id, String start_bill_date, String end_bill_date, String include_voided){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_hist = new javax.xml.ws.Holder();

        
        getCompletePort().getInvoiceHistoryM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_id, client_master_plan_instance_id, user_id, start_bill_date, end_bill_date, include_voided, h_error_code, h_error_msg, h_invoice_hist);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("invoice_hist",((javax.xml.ws.Holder)h_invoice_hist).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getInvoiceHistoryM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_id = (Long) map.get("master_plan_instance_id");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                String user_id = (String) map.get("user_id");
                String start_bill_date = (String) map.get("start_bill_date");
                String end_bill_date = (String) map.get("end_bill_date");
                String include_voided = (String) map.get("include_voided");
                
        return getInvoiceHistoryM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_id, client_master_plan_instance_id, user_id, start_bill_date, end_bill_date, include_voided);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getPendingInvoiceNoM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_pending_invoice = new javax.xml.ws.Holder();

        
        getCompletePort().getPendingInvoiceNoM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, h_error_code, h_error_msg, h_pending_invoice);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("pending_invoice",((javax.xml.ws.Holder)h_pending_invoice).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPendingInvoiceNoM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                
        return getPendingInvoiceNoM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getUnappliedServiceCreditsM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unapplied_service_credits_details = new javax.xml.ws.Holder();

        
        getCompletePort().getUnappliedServiceCreditsM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, h_error_code, h_error_msg, h_unapplied_service_credits_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("unapplied_service_credits_details",((javax.xml.ws.Holder)h_unapplied_service_credits_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getUnappliedServiceCreditsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                
        return getUnappliedServiceCreditsM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctCreditsM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, Long limit_records){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_credits = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctCreditsM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, limit_records, h_error_code, h_error_msg, h_all_credits);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_credits",((javax.xml.ws.Holder)h_all_credits).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctCreditsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                Long limit_records = (Long) map.get("limit_records");
                
        return getAcctCreditsM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, limit_records);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getRecurringCreditInfoM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, Long filter_credit_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_recurring_credits_details = new javax.xml.ws.Holder();

        
        getCompletePort().getRecurringCreditInfoM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, filter_credit_no, h_error_code, h_error_msg, h_recurring_credits_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("recurring_credits_details",((javax.xml.ws.Holder)h_recurring_credits_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getRecurringCreditInfoM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                Long filter_credit_no = (Long) map.get("filter_credit_no");
                
        return getRecurringCreditInfoM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, filter_credit_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createAdvancedServiceCreditM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, Double amount, Long reason_code, String comments, Long eligible_plan_no, Long eligible_service_no, Long alt_service_no_to_apply, Long frequency_no, Long frequency_interval_months, String initial_credit_date, Double percent_amount, Long percent_eval_plan_no, Long percent_eval_service_no, com.aria.common.shared.EligibleServiceTypesArray eligible_service_types, String client_eligible_plan_id, String client_eligible_service_id, String client_alt_service_id_to_apply, String client_percent_eval_plan_id, String client_percent_eval_service_id, String credit_expiry_type_ind, Long credit_expiry_months, String credit_expiry_date, com.aria.common.shared.EligibleServicePlansArray eligible_service_plans, com.aria.common.shared.ClientEligibleServicePlanIdsArray client_eligible_service_plan_ids){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().createAdvancedServiceCreditM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, amount, reason_code, comments, eligible_plan_no, eligible_service_no, alt_service_no_to_apply, frequency_no, frequency_interval_months, initial_credit_date, percent_amount, percent_eval_plan_no, percent_eval_service_no, eligible_service_types, client_eligible_plan_id, client_eligible_service_id, client_alt_service_id_to_apply, client_percent_eval_plan_id, client_percent_eval_service_id, credit_expiry_type_ind, credit_expiry_months, credit_expiry_date, eligible_service_plans, client_eligible_service_plan_ids, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createAdvancedServiceCreditM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                Double amount = (Double) map.get("amount");
                Long reason_code = (Long) map.get("reason_code");
                String comments = (String) map.get("comments");
                Long eligible_plan_no = (Long) map.get("eligible_plan_no");
                Long eligible_service_no = (Long) map.get("eligible_service_no");
                Long alt_service_no_to_apply = (Long) map.get("alt_service_no_to_apply");
                Long frequency_no = (Long) map.get("frequency_no");
                Long frequency_interval_months = (Long) map.get("frequency_interval_months");
                String initial_credit_date = (String) map.get("initial_credit_date");
                Double percent_amount = (Double) map.get("percent_amount");
                Long percent_eval_plan_no = (Long) map.get("percent_eval_plan_no");
                Long percent_eval_service_no = (Long) map.get("percent_eval_service_no");
                com.aria.common.shared.EligibleServiceTypesArray eligible_service_types = (com.aria.common.shared.EligibleServiceTypesArray) map.get("eligible_service_types");
                String client_eligible_plan_id = (String) map.get("client_eligible_plan_id");
                String client_eligible_service_id = (String) map.get("client_eligible_service_id");
                String client_alt_service_id_to_apply = (String) map.get("client_alt_service_id_to_apply");
                String client_percent_eval_plan_id = (String) map.get("client_percent_eval_plan_id");
                String client_percent_eval_service_id = (String) map.get("client_percent_eval_service_id");
                String credit_expiry_type_ind = (String) map.get("credit_expiry_type_ind");
                Long credit_expiry_months = (Long) map.get("credit_expiry_months");
                String credit_expiry_date = (String) map.get("credit_expiry_date");
                com.aria.common.shared.EligibleServicePlansArray eligible_service_plans = (com.aria.common.shared.EligibleServicePlansArray) map.get("eligible_service_plans");
                com.aria.common.shared.ClientEligibleServicePlanIdsArray client_eligible_service_plan_ids = (com.aria.common.shared.ClientEligibleServicePlanIdsArray) map.get("client_eligible_service_plan_ids");
                
        return createAdvancedServiceCreditM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, amount, reason_code, comments, eligible_plan_no, eligible_service_no, alt_service_no_to_apply, frequency_no, frequency_interval_months, initial_credit_date, percent_amount, percent_eval_plan_no, percent_eval_service_no, eligible_service_types, client_eligible_plan_id, client_eligible_service_id, client_alt_service_id_to_apply, client_percent_eval_plan_id, client_percent_eval_service_id, credit_expiry_type_ind, credit_expiry_months, credit_expiry_date, eligible_service_plans, client_eligible_service_plan_ids);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctServiceOutageCreditM(Long client_no, String auth_key, Long acct_no, String client_acct_id, String outage_start_date, String outage_end_date, Long master_plan_instance_no, String client_master_plan_instance_id, String outage_start_time, String outage_end_time, com.aria.common.shared.PlansToGetOutageArray plans_to_get_outage, Double adjust_percent, com.aria.common.shared.ClientPlanIdsToGetOutageArray client_plan_ids_to_get_outage){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_no = new javax.xml.ws.Holder(acct_no);
        javax.xml.ws.Holder h_service_outage_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_outage_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_adjusted_outage_credit = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctServiceOutageCreditM(client_no, auth_key, h_acct_no, client_acct_id, outage_start_date, outage_end_date, master_plan_instance_no, client_master_plan_instance_id, outage_start_time, outage_end_time, plans_to_get_outage, adjust_percent, client_plan_ids_to_get_outage, h_error_code, h_error_msg, h_service_outage_line_items, h_total_outage_credit, h_adjusted_outage_credit);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_no",((javax.xml.ws.Holder)h_acct_no).value);
        getHashMapReturnValues().put("service_outage_line_items",((javax.xml.ws.Holder)h_service_outage_line_items).value);
        getHashMapReturnValues().put("total_outage_credit",((javax.xml.ws.Holder)h_total_outage_credit).value);
        getHashMapReturnValues().put("adjusted_outage_credit",((javax.xml.ws.Holder)h_adjusted_outage_credit).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctServiceOutageCreditM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                String outage_start_date = (String) map.get("outage_start_date");
                String outage_end_date = (String) map.get("outage_end_date");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                String outage_start_time = (String) map.get("outage_start_time");
                String outage_end_time = (String) map.get("outage_end_time");
                com.aria.common.shared.PlansToGetOutageArray plans_to_get_outage = (com.aria.common.shared.PlansToGetOutageArray) map.get("plans_to_get_outage");
                Double adjust_percent = (Double) map.get("adjust_percent");
                com.aria.common.shared.ClientPlanIdsToGetOutageArray client_plan_ids_to_get_outage = (com.aria.common.shared.ClientPlanIdsToGetOutageArray) map.get("client_plan_ids_to_get_outage");
                
        return getAcctServiceOutageCreditM(client_no, auth_key, acct_no, client_acct_id, outage_start_date, outage_end_date, master_plan_instance_no, client_master_plan_instance_id, outage_start_time, outage_end_time, plans_to_get_outage, adjust_percent, client_plan_ids_to_get_outage);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getCreditDetailsM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long credit_no, Long master_plan_instance_no, String client_master_plan_instance_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_created_by = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_created_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_credit_type = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_applied_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unapplied_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_reason_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_reason_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_void_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_credit_expiry_type_ind = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_credit_expiry_months = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_credit_expiry_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_eligible_service_plan_details = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_acct_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_master_plan_instance_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_client_mp_instance_id = new javax.xml.ws.Holder();

        
        getCompletePort().getCreditDetailsM(client_no, auth_key, acct_no, client_acct_id, credit_no, master_plan_instance_no, client_master_plan_instance_id, h_error_code, h_error_msg, h_created_by, h_created_date, h_amount, h_credit_type, h_applied_amount, h_unapplied_amount, h_reason_code, h_reason_text, h_comments, h_transaction_id, h_void_transaction_id, h_credit_expiry_type_ind, h_credit_expiry_months, h_credit_expiry_date, h_eligible_service_plan_details, h_out_acct_no, h_out_master_plan_instance_no, h_out_client_mp_instance_id);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("created_by",((javax.xml.ws.Holder)h_created_by).value);
        getHashMapReturnValues().put("created_date",((javax.xml.ws.Holder)h_created_date).value);
        getHashMapReturnValues().put("amount",((javax.xml.ws.Holder)h_amount).value);
        getHashMapReturnValues().put("credit_type",((javax.xml.ws.Holder)h_credit_type).value);
        getHashMapReturnValues().put("applied_amount",((javax.xml.ws.Holder)h_applied_amount).value);
        getHashMapReturnValues().put("unapplied_amount",((javax.xml.ws.Holder)h_unapplied_amount).value);
        getHashMapReturnValues().put("reason_code",((javax.xml.ws.Holder)h_reason_code).value);
        getHashMapReturnValues().put("reason_text",((javax.xml.ws.Holder)h_reason_text).value);
        getHashMapReturnValues().put("comments",((javax.xml.ws.Holder)h_comments).value);
        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("void_transaction_id",((javax.xml.ws.Holder)h_void_transaction_id).value);
        getHashMapReturnValues().put("credit_expiry_type_ind",((javax.xml.ws.Holder)h_credit_expiry_type_ind).value);
        getHashMapReturnValues().put("credit_expiry_months",((javax.xml.ws.Holder)h_credit_expiry_months).value);
        getHashMapReturnValues().put("credit_expiry_date",((javax.xml.ws.Holder)h_credit_expiry_date).value);
        getHashMapReturnValues().put("eligible_service_plan_details",((javax.xml.ws.Holder)h_eligible_service_plan_details).value);
        getHashMapReturnValues().put("out_acct_no",((javax.xml.ws.Holder)h_out_acct_no).value);
        getHashMapReturnValues().put("out_master_plan_instance_no",((javax.xml.ws.Holder)h_out_master_plan_instance_no).value);
        getHashMapReturnValues().put("out_client_mp_instance_id",((javax.xml.ws.Holder)h_out_client_mp_instance_id).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getCreditDetailsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long credit_no = (Long) map.get("credit_no");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                
        return getCreditDetailsM(client_no, auth_key, acct_no, client_acct_id, credit_no, master_plan_instance_no, client_master_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelUnappliedServiceCreditsM(Long client_no, String auth_key, com.aria.common.shared.CreditIdsArray credit_ids, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().cancelUnappliedServiceCreditsM(client_no, auth_key, credit_ids, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelUnappliedServiceCreditsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        com.aria.common.shared.CreditIdsArray credit_ids = (com.aria.common.shared.CreditIdsArray) map.get("credit_ids");
                Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                
        return cancelUnappliedServiceCreditsM(client_no, auth_key, credit_ids, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctTransHistoryM(Long client_no, String auth_key, Long account_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, Long transaction_type, String start_date, String end_date, Long record_limit, Long filter_statement_no, String include_void_transactions){
        javax.xml.ws.Holder h_history = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctTransHistoryM(client_no, auth_key, account_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, transaction_type, start_date, end_date, record_limit, filter_statement_no, include_void_transactions, h_history, h_error_code, h_error_msg);

        getHashMapReturnValues().put("history",((javax.xml.ws.Holder)h_history).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctTransHistoryM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                Long transaction_type = (Long) map.get("transaction_type");
                String start_date = (String) map.get("start_date");
                String end_date = (String) map.get("end_date");
                Long record_limit = (Long) map.get("record_limit");
                Long filter_statement_no = (Long) map.get("filter_statement_no");
                String include_void_transactions = (String) map.get("include_void_transactions");
                
        return getAcctTransHistoryM(client_no, auth_key, account_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, transaction_type, start_date, end_date, record_limit, filter_statement_no, include_void_transactions);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getPlansByPromoCodeM(Long client_no, String auth_key, String promo_code, String include_rs_summary){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plan_details = new javax.xml.ws.Holder();

        
        getCompletePort().getPlansByPromoCodeM(client_no, auth_key, promo_code, include_rs_summary, h_error_code, h_error_msg, h_plan_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("plan_details",((javax.xml.ws.Holder)h_plan_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPlansByPromoCodeM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String promo_code = (String) map.get("promo_code");
                String include_rs_summary = (String) map.get("include_rs_summary");
                
        return getPlansByPromoCodeM(client_no, auth_key, promo_code, include_rs_summary);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getPlansByPromoCodeAllM(Long client_no, String auth_key, String promo_code, String include_rs_summary){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_plan_details = new javax.xml.ws.Holder();

        
        getCompletePort().getPlansByPromoCodeAllM(client_no, auth_key, promo_code, include_rs_summary, h_error_code, h_error_msg, h_all_plan_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_plan_details",((javax.xml.ws.Holder)h_all_plan_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPlansByPromoCodeAllM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String promo_code = (String) map.get("promo_code");
                String include_rs_summary = (String) map.get("include_rs_summary");
                
        return getPlansByPromoCodeAllM(client_no, auth_key, promo_code, include_rs_summary);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getRateSchedulesForPlanM(Long client_no, String auth_key, Long plan_no, String currency_cd, String client_plan_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_rate_scheds = new javax.xml.ws.Holder();

        
        getCompletePort().getRateSchedulesForPlanM(client_no, auth_key, plan_no, currency_cd, client_plan_id, h_error_code, h_error_msg, h_rate_scheds);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("rate_scheds",((javax.xml.ws.Holder)h_rate_scheds).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getRateSchedulesForPlanM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long plan_no = (Long) map.get("plan_no");
                String currency_cd = (String) map.get("currency_cd");
                String client_plan_id = (String) map.get("client_plan_id");
                
        return getRateSchedulesForPlanM(client_no, auth_key, plan_no, currency_cd, client_plan_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getFamilyTransHistoryM(Long client_no, String auth_key, Long parent_acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, String do_multi_level, Long trans_type, String start_date, String end_date, Long record_limit, String include_void_transactions){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_fam_transactions = new javax.xml.ws.Holder();

        
        getCompletePort().getFamilyTransHistoryM(client_no, auth_key, parent_acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, do_multi_level, trans_type, start_date, end_date, record_limit, include_void_transactions, h_error_code, h_error_msg, h_fam_transactions);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("fam_transactions",((javax.xml.ws.Holder)h_fam_transactions).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getFamilyTransHistoryM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long parent_acct_no = (Long) map.get("parent_acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                String do_multi_level = (String) map.get("do_multi_level");
                Long trans_type = (Long) map.get("trans_type");
                String start_date = (String) map.get("start_date");
                String end_date = (String) map.get("end_date");
                Long record_limit = (Long) map.get("record_limit");
                String include_void_transactions = (String) map.get("include_void_transactions");
                
        return getFamilyTransHistoryM(client_no, auth_key, parent_acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, do_multi_level, trans_type, start_date, end_date, record_limit, include_void_transactions);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getSuppPlansByPromoCodeM(Long client_no, String auth_key, String promo_code, String include_rs_summary){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plans_details = new javax.xml.ws.Holder();

        
        getCompletePort().getSuppPlansByPromoCodeM(client_no, auth_key, promo_code, include_rs_summary, h_error_code, h_error_msg, h_plans_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("plans_details",((javax.xml.ws.Holder)h_plans_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getSuppPlansByPromoCodeM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String promo_code = (String) map.get("promo_code");
                String include_rs_summary = (String) map.get("include_rs_summary");
                
        return getSuppPlansByPromoCodeM(client_no, auth_key, promo_code, include_rs_summary);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getSuppPlansByPromoCodeAllM(Long client_no, String auth_key, String promo_code, String include_rs_summary){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_plan_details = new javax.xml.ws.Holder();

        
        getCompletePort().getSuppPlansByPromoCodeAllM(client_no, auth_key, promo_code, include_rs_summary, h_error_code, h_error_msg, h_all_plan_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_plan_details",((javax.xml.ws.Holder)h_all_plan_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getSuppPlansByPromoCodeAllM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String promo_code = (String) map.get("promo_code");
                String include_rs_summary = (String) map.get("include_rs_summary");
                
        return getSuppPlansByPromoCodeAllM(client_no, auth_key, promo_code, include_rs_summary);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPlanHistoryM(Long client_no, String auth_key, Long acct_no, Long filter_plan_instance_no, String filter_client_plan_instance_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_plan_history = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPlanHistoryM(client_no, auth_key, acct_no, filter_plan_instance_no, filter_client_plan_instance_id, h_error_code, h_error_msg, h_plan_history);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("plan_history",((javax.xml.ws.Holder)h_plan_history).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPlanHistoryM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long filter_plan_instance_no = (Long) map.get("filter_plan_instance_no");
                String filter_client_plan_instance_id = (String) map.get("filter_client_plan_instance_id");
                
        return getAcctPlanHistoryM(client_no, auth_key, acct_no, filter_plan_instance_no, filter_client_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getUsageSummaryByTypeM(Long client_no, String auth_key, Long acct_no, String user_id, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, Long usage_type_filter, String date_filter_start_date, String date_filter_start_time, String date_filter_end_date, String date_filter_end_time, Long billed_filter, Long billing_period_flag, com.aria.common.shared.UsageQualifier1Array usage_qualifier_1, com.aria.common.shared.UsageQualifier2Array usage_qualifier_2, com.aria.common.shared.UsageQualifier3Array usage_qualifier_3, com.aria.common.shared.UsageQualifier4Array usage_qualifier_4, String usage_type_cd_filter, String retrieve_excluded_usage){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_start_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_start_time = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_end_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_end_time = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_usage_summary_recs = new javax.xml.ws.Holder();

        
        getCompletePort().getUsageSummaryByTypeM(client_no, auth_key, acct_no, user_id, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, usage_type_filter, date_filter_start_date, date_filter_start_time, date_filter_end_date, date_filter_end_time, billed_filter, billing_period_flag, usage_qualifier_1, usage_qualifier_2, usage_qualifier_3, usage_qualifier_4, usage_type_cd_filter, retrieve_excluded_usage, h_error_code, h_error_msg, h_start_date, h_start_time, h_end_date, h_end_time, h_usage_summary_recs);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("start_date",((javax.xml.ws.Holder)h_start_date).value);
        getHashMapReturnValues().put("start_time",((javax.xml.ws.Holder)h_start_time).value);
        getHashMapReturnValues().put("end_date",((javax.xml.ws.Holder)h_end_date).value);
        getHashMapReturnValues().put("end_time",((javax.xml.ws.Holder)h_end_time).value);
        getHashMapReturnValues().put("usage_summary_recs",((javax.xml.ws.Holder)h_usage_summary_recs).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getUsageSummaryByTypeM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String user_id = (String) map.get("user_id");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                Long usage_type_filter = (Long) map.get("usage_type_filter");
                String date_filter_start_date = (String) map.get("date_filter_start_date");
                String date_filter_start_time = (String) map.get("date_filter_start_time");
                String date_filter_end_date = (String) map.get("date_filter_end_date");
                String date_filter_end_time = (String) map.get("date_filter_end_time");
                Long billed_filter = (Long) map.get("billed_filter");
                Long billing_period_flag = (Long) map.get("billing_period_flag");
                com.aria.common.shared.UsageQualifier1Array usage_qualifier_1 = (com.aria.common.shared.UsageQualifier1Array) map.get("usage_qualifier_1");
                com.aria.common.shared.UsageQualifier2Array usage_qualifier_2 = (com.aria.common.shared.UsageQualifier2Array) map.get("usage_qualifier_2");
                com.aria.common.shared.UsageQualifier3Array usage_qualifier_3 = (com.aria.common.shared.UsageQualifier3Array) map.get("usage_qualifier_3");
                com.aria.common.shared.UsageQualifier4Array usage_qualifier_4 = (com.aria.common.shared.UsageQualifier4Array) map.get("usage_qualifier_4");
                String usage_type_cd_filter = (String) map.get("usage_type_cd_filter");
                String retrieve_excluded_usage = (String) map.get("retrieve_excluded_usage");
                
        return getUsageSummaryByTypeM(client_no, auth_key, acct_no, user_id, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, usage_type_filter, date_filter_start_date, date_filter_start_time, date_filter_end_date, date_filter_end_time, billed_filter, billing_period_flag, usage_qualifier_1, usage_qualifier_2, usage_qualifier_3, usage_qualifier_4, usage_type_cd_filter, retrieve_excluded_usage);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getUsageHistoryM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, Long specified_usage_type_no, String date_range_start, String date_range_end, String specified_usage_type_code, com.aria.common.shared.UsageQualifier1Array usage_qualifier_1, com.aria.common.shared.UsageQualifier2Array usage_qualifier_2, com.aria.common.shared.UsageQualifier3Array usage_qualifier_3, com.aria.common.shared.UsageQualifier4Array usage_qualifier_4, Long limit, Long offset, Long invoice_no, Long invoice_line_item, String retrieve_excluded_usage){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_usage_history_recs = new javax.xml.ws.Holder();

        
        getCompletePort().getUsageHistoryM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, specified_usage_type_no, date_range_start, date_range_end, specified_usage_type_code, usage_qualifier_1, usage_qualifier_2, usage_qualifier_3, usage_qualifier_4, limit, offset, invoice_no, invoice_line_item, retrieve_excluded_usage, h_error_code, h_error_msg, h_usage_history_recs);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("usage_history_recs",((javax.xml.ws.Holder)h_usage_history_recs).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getUsageHistoryM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                Long specified_usage_type_no = (Long) map.get("specified_usage_type_no");
                String date_range_start = (String) map.get("date_range_start");
                String date_range_end = (String) map.get("date_range_end");
                String specified_usage_type_code = (String) map.get("specified_usage_type_code");
                com.aria.common.shared.UsageQualifier1Array usage_qualifier_1 = (com.aria.common.shared.UsageQualifier1Array) map.get("usage_qualifier_1");
                com.aria.common.shared.UsageQualifier2Array usage_qualifier_2 = (com.aria.common.shared.UsageQualifier2Array) map.get("usage_qualifier_2");
                com.aria.common.shared.UsageQualifier3Array usage_qualifier_3 = (com.aria.common.shared.UsageQualifier3Array) map.get("usage_qualifier_3");
                com.aria.common.shared.UsageQualifier4Array usage_qualifier_4 = (com.aria.common.shared.UsageQualifier4Array) map.get("usage_qualifier_4");
                Long limit = (Long) map.get("limit");
                Long offset = (Long) map.get("offset");
                Long invoice_no = (Long) map.get("invoice_no");
                Long invoice_line_item = (Long) map.get("invoice_line_item");
                String retrieve_excluded_usage = (String) map.get("retrieve_excluded_usage");
                
        return getUsageHistoryM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, specified_usage_type_no, date_range_start, date_range_end, specified_usage_type_code, usage_qualifier_1, usage_qualifier_2, usage_qualifier_3, usage_qualifier_4, limit, offset, invoice_no, invoice_line_item, retrieve_excluded_usage);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setMonetaryUsgThresholdM(Long client_no, String auth_key, Long threshold_scope, Long threshold_category, Long amount, Long acct_no, String client_acct_id, Long master_plan_instance_id, String client_master_plan_instance_id, com.aria.common.shared.UsageUnitThresholdsArray usage_unit_thresholds){
        javax.xml.ws.Holder h_acct_no = new javax.xml.ws.Holder(acct_no);
        javax.xml.ws.Holder h_client_acct_id = new javax.xml.ws.Holder(client_acct_id);
        javax.xml.ws.Holder h_master_plan_instance_id = new javax.xml.ws.Holder(master_plan_instance_id);
        javax.xml.ws.Holder h_client_master_plan_instance_id = new javax.xml.ws.Holder(client_master_plan_instance_id);
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setMonetaryUsgThresholdM(client_no, auth_key, threshold_scope, threshold_category, amount, h_acct_no, h_client_acct_id, h_master_plan_instance_id, h_client_master_plan_instance_id, usage_unit_thresholds, h_error_code, h_error_msg);

        getHashMapReturnValues().put("acct_no",((javax.xml.ws.Holder)h_acct_no).value);
        getHashMapReturnValues().put("client_acct_id",((javax.xml.ws.Holder)h_client_acct_id).value);
        getHashMapReturnValues().put("master_plan_instance_id",((javax.xml.ws.Holder)h_master_plan_instance_id).value);
        getHashMapReturnValues().put("client_master_plan_instance_id",((javax.xml.ws.Holder)h_client_master_plan_instance_id).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setMonetaryUsgThresholdM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long threshold_scope = (Long) map.get("threshold_scope");
                Long threshold_category = (Long) map.get("threshold_category");
                Long amount = (Long) map.get("amount");
                Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_id = (Long) map.get("master_plan_instance_id");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                com.aria.common.shared.UsageUnitThresholdsArray usage_unit_thresholds = (com.aria.common.shared.UsageUnitThresholdsArray) map.get("usage_unit_thresholds");
                
        return setMonetaryUsgThresholdM(client_no, auth_key, threshold_scope, threshold_category, amount, acct_no, client_acct_id, master_plan_instance_id, client_master_plan_instance_id, usage_unit_thresholds);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setUsgMtdPtdBalM(Long client_no, String auth_key, Long threshold_category, Long acct_no, String client_acct_id, Long master_plan_instance_id, String client_master_plan_instance_id){
        javax.xml.ws.Holder h_acct_no = new javax.xml.ws.Holder(acct_no);
        javax.xml.ws.Holder h_client_acct_id = new javax.xml.ws.Holder(client_acct_id);
        javax.xml.ws.Holder h_master_plan_instance_id = new javax.xml.ws.Holder(master_plan_instance_id);
        javax.xml.ws.Holder h_client_master_plan_instance_id = new javax.xml.ws.Holder(client_master_plan_instance_id);
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setUsgMtdPtdBalM(client_no, auth_key, threshold_category, h_acct_no, h_client_acct_id, h_master_plan_instance_id, h_client_master_plan_instance_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("acct_no",((javax.xml.ws.Holder)h_acct_no).value);
        getHashMapReturnValues().put("client_acct_id",((javax.xml.ws.Holder)h_client_acct_id).value);
        getHashMapReturnValues().put("master_plan_instance_id",((javax.xml.ws.Holder)h_master_plan_instance_id).value);
        getHashMapReturnValues().put("client_master_plan_instance_id",((javax.xml.ws.Holder)h_client_master_plan_instance_id).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setUsgMtdPtdBalM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long threshold_category = (Long) map.get("threshold_category");
                Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_id = (Long) map.get("master_plan_instance_id");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                
        return setUsgMtdPtdBalM(client_no, auth_key, threshold_category, acct_no, client_acct_id, master_plan_instance_id, client_master_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getUnbilledUsageSummaryM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_id, String client_master_plan_instance_id, String usage_details_flag, String include_all_usage_unit_thresholds, Long plan_no, Long usage_type_no, String usage_type_cd, String retrieve_excluded_usage){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_currency_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_currency_name = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_no = new javax.xml.ws.Holder(acct_no);
        javax.xml.ws.Holder h_client_acct_id = new javax.xml.ws.Holder(client_acct_id);
        javax.xml.ws.Holder h_master_plan_instance_id = new javax.xml.ws.Holder(master_plan_instance_id);
        javax.xml.ws.Holder h_client_master_plan_instance_id = new javax.xml.ws.Holder(client_master_plan_instance_id);
        javax.xml.ws.Holder h_mpi_mtd_threshold_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_mpi_ptd_threshold_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_mtd_threshold_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_ptd_threshold_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_mtd_balance_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_ptd_balance_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_mpi_mtd_delta_sign = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_mpi_mtd_delta_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_mpi_ptd_delta_sign = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_mpi_ptd_delta_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_mtd_delta_sign = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_mtd_delta_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_ptd_delta_sign = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_ptd_delta_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unapp_svc_credit_bal_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unapp_svc_credit_delta_sign = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unapp_svc_credit_delta_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unbilled_usage_rec = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unit_threshold_details = new javax.xml.ws.Holder();

        
        getCompletePort().getUnbilledUsageSummaryM(client_no, auth_key, h_acct_no, h_client_acct_id, h_master_plan_instance_id, h_client_master_plan_instance_id, usage_details_flag, include_all_usage_unit_thresholds, plan_no, usage_type_no, usage_type_cd, retrieve_excluded_usage, h_error_code, h_error_msg, h_currency_cd, h_currency_name, h_mpi_mtd_threshold_amount, h_mpi_ptd_threshold_amount, h_client_mtd_threshold_amount, h_client_ptd_threshold_amount, h_mtd_balance_amount, h_ptd_balance_amount, h_mpi_mtd_delta_sign, h_mpi_mtd_delta_amount, h_mpi_ptd_delta_sign, h_mpi_ptd_delta_amount, h_client_mtd_delta_sign, h_client_mtd_delta_amount, h_client_ptd_delta_sign, h_client_ptd_delta_amount, h_unapp_svc_credit_bal_amount, h_unapp_svc_credit_delta_sign, h_unapp_svc_credit_delta_amount, h_unbilled_usage_rec, h_unit_threshold_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("currency_cd",((javax.xml.ws.Holder)h_currency_cd).value);
        getHashMapReturnValues().put("currency_name",((javax.xml.ws.Holder)h_currency_name).value);
        getHashMapReturnValues().put("acct_no",((javax.xml.ws.Holder)h_acct_no).value);
        getHashMapReturnValues().put("client_acct_id",((javax.xml.ws.Holder)h_client_acct_id).value);
        getHashMapReturnValues().put("master_plan_instance_id",((javax.xml.ws.Holder)h_master_plan_instance_id).value);
        getHashMapReturnValues().put("client_master_plan_instance_id",((javax.xml.ws.Holder)h_client_master_plan_instance_id).value);
        getHashMapReturnValues().put("mpi_mtd_threshold_amount",((javax.xml.ws.Holder)h_mpi_mtd_threshold_amount).value);
        getHashMapReturnValues().put("mpi_ptd_threshold_amount",((javax.xml.ws.Holder)h_mpi_ptd_threshold_amount).value);
        getHashMapReturnValues().put("client_mtd_threshold_amount",((javax.xml.ws.Holder)h_client_mtd_threshold_amount).value);
        getHashMapReturnValues().put("client_ptd_threshold_amount",((javax.xml.ws.Holder)h_client_ptd_threshold_amount).value);
        getHashMapReturnValues().put("mtd_balance_amount",((javax.xml.ws.Holder)h_mtd_balance_amount).value);
        getHashMapReturnValues().put("ptd_balance_amount",((javax.xml.ws.Holder)h_ptd_balance_amount).value);
        getHashMapReturnValues().put("mpi_mtd_delta_sign",((javax.xml.ws.Holder)h_mpi_mtd_delta_sign).value);
        getHashMapReturnValues().put("mpi_mtd_delta_amount",((javax.xml.ws.Holder)h_mpi_mtd_delta_amount).value);
        getHashMapReturnValues().put("mpi_ptd_delta_sign",((javax.xml.ws.Holder)h_mpi_ptd_delta_sign).value);
        getHashMapReturnValues().put("mpi_ptd_delta_amount",((javax.xml.ws.Holder)h_mpi_ptd_delta_amount).value);
        getHashMapReturnValues().put("client_mtd_delta_sign",((javax.xml.ws.Holder)h_client_mtd_delta_sign).value);
        getHashMapReturnValues().put("client_mtd_delta_amount",((javax.xml.ws.Holder)h_client_mtd_delta_amount).value);
        getHashMapReturnValues().put("client_ptd_delta_sign",((javax.xml.ws.Holder)h_client_ptd_delta_sign).value);
        getHashMapReturnValues().put("client_ptd_delta_amount",((javax.xml.ws.Holder)h_client_ptd_delta_amount).value);
        getHashMapReturnValues().put("unapp_svc_credit_bal_amount",((javax.xml.ws.Holder)h_unapp_svc_credit_bal_amount).value);
        getHashMapReturnValues().put("unapp_svc_credit_delta_sign",((javax.xml.ws.Holder)h_unapp_svc_credit_delta_sign).value);
        getHashMapReturnValues().put("unapp_svc_credit_delta_amount",((javax.xml.ws.Holder)h_unapp_svc_credit_delta_amount).value);
        getHashMapReturnValues().put("unbilled_usage_rec",((javax.xml.ws.Holder)h_unbilled_usage_rec).value);
        getHashMapReturnValues().put("unit_threshold_details",((javax.xml.ws.Holder)h_unit_threshold_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getUnbilledUsageSummaryM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_id = (Long) map.get("master_plan_instance_id");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                String usage_details_flag = (String) map.get("usage_details_flag");
                String include_all_usage_unit_thresholds = (String) map.get("include_all_usage_unit_thresholds");
                Long plan_no = (Long) map.get("plan_no");
                Long usage_type_no = (Long) map.get("usage_type_no");
                String usage_type_cd = (String) map.get("usage_type_cd");
                String retrieve_excluded_usage = (String) map.get("retrieve_excluded_usage");
                
        return getUnbilledUsageSummaryM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_id, client_master_plan_instance_id, usage_details_flag, include_all_usage_unit_thresholds, plan_no, usage_type_no, usage_type_cd, retrieve_excluded_usage);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> applyCouponToAcctM(Long client_no, String auth_key, String coupon_code, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id){
        javax.xml.ws.Holder h_user_success_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().applyCouponToAcctM(client_no, auth_key, coupon_code, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, h_user_success_msg, h_error_code, h_error_msg);

        getHashMapReturnValues().put("user_success_msg",((javax.xml.ws.Holder)h_user_success_msg).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> applyCouponToAcctM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String coupon_code = (String) map.get("coupon_code");
                Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                
        return applyCouponToAcctM(client_no, auth_key, coupon_code, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctCouponDetailsM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, String coupon_cd){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_coupons_detail = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctCouponDetailsM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, coupon_cd, h_error_code, h_error_msg, h_coupons_detail);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("coupons_detail",((javax.xml.ws.Holder)h_coupons_detail).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctCouponDetailsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                String coupon_cd = (String) map.get("coupon_cd");
                
        return getAcctCouponDetailsM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, coupon_cd);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> deleteAcctCouponM(Long client_no, String auth_key, Long acct_no, String client_acct_id, String coupon_cd, Long master_plan_instance_no, String client_master_plan_instance_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().deleteAcctCouponM(client_no, auth_key, acct_no, client_acct_id, coupon_cd, master_plan_instance_no, client_master_plan_instance_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> deleteAcctCouponM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                String coupon_cd = (String) map.get("coupon_cd");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                
        return deleteAcctCouponM(client_no, auth_key, acct_no, client_acct_id, coupon_cd, master_plan_instance_no, client_master_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> modifyAcctPlanUnitInstancesM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long plan_inst_no, String client_plan_inst_id, com.aria.common.shared.RemovePlanUnitsArray remove_plan_units, Long assignment_directive, Double new_plan_units, com.aria.common.shared.NewClientPlanUnitInstArray new_client_plan_unit_inst){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cancelled_supp_plans = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_activation_fee = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_mthly_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_expectd_annu_recurring_cost = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_line_item = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_result_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_credit_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proration_tax_amount = new javax.xml.ws.Holder();

        
        getCompletePort().modifyAcctPlanUnitInstancesM(client_no, auth_key, acct_no, client_acct_id, plan_inst_no, client_plan_inst_id, remove_plan_units, assignment_directive, new_plan_units, new_client_plan_unit_inst, h_error_code, h_error_msg, h_proration_result_amount, h_collection_error_code, h_collection_error_msg, h_statement_error_code, h_statement_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_cancelled_supp_plans, h_invoice_no, h_expectd_activation_fee, h_expectd_mthly_recurring_cost, h_expectd_annu_recurring_cost, h_invoice_line_item, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_total_tax_credit, h_total_credit_before_tax, h_total, h_proration_credit_result_amount, h_proration_credit_amount, h_proration_tax_amount);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("proration_result_amount",((javax.xml.ws.Holder)h_proration_result_amount).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("statement_error_code",((javax.xml.ws.Holder)h_statement_error_code).value);
        getHashMapReturnValues().put("statement_error_msg",((javax.xml.ws.Holder)h_statement_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("cancelled_supp_plans",((javax.xml.ws.Holder)h_cancelled_supp_plans).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("expectd_activation_fee",((javax.xml.ws.Holder)h_expectd_activation_fee).value);
        getHashMapReturnValues().put("expectd_mthly_recurring_cost",((javax.xml.ws.Holder)h_expectd_mthly_recurring_cost).value);
        getHashMapReturnValues().put("expectd_annu_recurring_cost",((javax.xml.ws.Holder)h_expectd_annu_recurring_cost).value);
        getHashMapReturnValues().put("invoice_line_item",((javax.xml.ws.Holder)h_invoice_line_item).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("total_tax_credit",((javax.xml.ws.Holder)h_total_tax_credit).value);
        getHashMapReturnValues().put("total_credit_before_tax",((javax.xml.ws.Holder)h_total_credit_before_tax).value);
        getHashMapReturnValues().put("total",((javax.xml.ws.Holder)h_total).value);
        getHashMapReturnValues().put("proration_credit_result_amount",((javax.xml.ws.Holder)h_proration_credit_result_amount).value);
        getHashMapReturnValues().put("proration_credit_amount",((javax.xml.ws.Holder)h_proration_credit_amount).value);
        getHashMapReturnValues().put("proration_tax_amount",((javax.xml.ws.Holder)h_proration_tax_amount).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> modifyAcctPlanUnitInstancesM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long plan_inst_no = (Long) map.get("plan_inst_no");
                String client_plan_inst_id = (String) map.get("client_plan_inst_id");
                com.aria.common.shared.RemovePlanUnitsArray remove_plan_units = (com.aria.common.shared.RemovePlanUnitsArray) map.get("remove_plan_units");
                Long assignment_directive = (Long) map.get("assignment_directive");
                Double new_plan_units = (Double) map.get("new_plan_units");
                com.aria.common.shared.NewClientPlanUnitInstArray new_client_plan_unit_inst = (com.aria.common.shared.NewClientPlanUnitInstArray) map.get("new_client_plan_unit_inst");
                
        return modifyAcctPlanUnitInstancesM(client_no, auth_key, acct_no, client_acct_id, plan_inst_no, client_plan_inst_id, remove_plan_units, assignment_directive, new_plan_units, new_client_plan_unit_inst);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPlanUnitInstanceAllM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long plan_instance_no, String client_plan_instance_id, Long queued_ind, Long plan_unit_inst_no, String client_plan_unit_inst_id, Long status_cd, Long plan_unit_inst_status_cd, Long fulfillment_only){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_no = new javax.xml.ws.Holder(acct_no);
        javax.xml.ws.Holder h_client_acct_id = new javax.xml.ws.Holder(client_acct_id);
        javax.xml.ws.Holder h_all_plan_instances = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPlanUnitInstanceAllM(client_no, auth_key, h_acct_no, h_client_acct_id, plan_instance_no, client_plan_instance_id, queued_ind, plan_unit_inst_no, client_plan_unit_inst_id, status_cd, plan_unit_inst_status_cd, fulfillment_only, h_error_code, h_error_msg, h_all_plan_instances);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("acct_no",((javax.xml.ws.Holder)h_acct_no).value);
        getHashMapReturnValues().put("client_acct_id",((javax.xml.ws.Holder)h_client_acct_id).value);
        getHashMapReturnValues().put("all_plan_instances",((javax.xml.ws.Holder)h_all_plan_instances).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPlanUnitInstanceAllM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                Long queued_ind = (Long) map.get("queued_ind");
                Long plan_unit_inst_no = (Long) map.get("plan_unit_inst_no");
                String client_plan_unit_inst_id = (String) map.get("client_plan_unit_inst_id");
                Long status_cd = (Long) map.get("status_cd");
                Long plan_unit_inst_status_cd = (Long) map.get("plan_unit_inst_status_cd");
                Long fulfillment_only = (Long) map.get("fulfillment_only");
                
        return getAcctPlanUnitInstanceAllM(client_no, auth_key, acct_no, client_acct_id, plan_instance_no, client_plan_instance_id, queued_ind, plan_unit_inst_no, client_plan_unit_inst_id, status_cd, plan_unit_inst_status_cd, fulfillment_only);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createInstanceContractM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long type_no, Long length_months, String end_date, com.aria.common.shared.ContractPlanInstancesArray contract_plan_instances, String client_contract_id, Double cancel_fee, String create_comments, String start_date, String do_auto_discard, String cascade_action, com.aria.common.shared.ContractRolloverCustomRatesArray contract_rollover_custom_rates){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_contract_no = new javax.xml.ws.Holder();

        
        getCompletePort().createInstanceContractM(client_no, auth_key, acct_no, client_acct_id, type_no, length_months, end_date, contract_plan_instances, client_contract_id, cancel_fee, create_comments, start_date, do_auto_discard, cascade_action, contract_rollover_custom_rates, h_error_code, h_error_msg, h_contract_no);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("contract_no",((javax.xml.ws.Holder)h_contract_no).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createInstanceContractM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long type_no = (Long) map.get("type_no");
                Long length_months = (Long) map.get("length_months");
                String end_date = (String) map.get("end_date");
                com.aria.common.shared.ContractPlanInstancesArray contract_plan_instances = (com.aria.common.shared.ContractPlanInstancesArray) map.get("contract_plan_instances");
                String client_contract_id = (String) map.get("client_contract_id");
                Double cancel_fee = (Double) map.get("cancel_fee");
                String create_comments = (String) map.get("create_comments");
                String start_date = (String) map.get("start_date");
                String do_auto_discard = (String) map.get("do_auto_discard");
                String cascade_action = (String) map.get("cascade_action");
                com.aria.common.shared.ContractRolloverCustomRatesArray contract_rollover_custom_rates = (com.aria.common.shared.ContractRolloverCustomRatesArray) map.get("contract_rollover_custom_rates");
                
        return createInstanceContractM(client_no, auth_key, acct_no, client_acct_id, type_no, length_months, end_date, contract_plan_instances, client_contract_id, cancel_fee, create_comments, start_date, do_auto_discard, cascade_action, contract_rollover_custom_rates);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> modifyInstanceContractM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long contract_no, String client_contract_id, com.aria.common.shared.ContractPlanInstancesArray contract_plan_instances, Long type_no, Long length_months, String update_comments, Double cancel_fee, Long action_directive, String start_date, String end_date, String cascade_action, com.aria.common.shared.ContractRolloverCustomRatesArray contract_rollover_custom_rates){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().modifyInstanceContractM(client_no, auth_key, acct_no, client_acct_id, contract_no, client_contract_id, contract_plan_instances, type_no, length_months, update_comments, cancel_fee, action_directive, start_date, end_date, cascade_action, contract_rollover_custom_rates, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> modifyInstanceContractM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long contract_no = (Long) map.get("contract_no");
                String client_contract_id = (String) map.get("client_contract_id");
                com.aria.common.shared.ContractPlanInstancesArray contract_plan_instances = (com.aria.common.shared.ContractPlanInstancesArray) map.get("contract_plan_instances");
                Long type_no = (Long) map.get("type_no");
                Long length_months = (Long) map.get("length_months");
                String update_comments = (String) map.get("update_comments");
                Double cancel_fee = (Double) map.get("cancel_fee");
                Long action_directive = (Long) map.get("action_directive");
                String start_date = (String) map.get("start_date");
                String end_date = (String) map.get("end_date");
                String cascade_action = (String) map.get("cascade_action");
                com.aria.common.shared.ContractRolloverCustomRatesArray contract_rollover_custom_rates = (com.aria.common.shared.ContractRolloverCustomRatesArray) map.get("contract_rollover_custom_rates");
                
        return modifyInstanceContractM(client_no, auth_key, acct_no, client_acct_id, contract_no, client_contract_id, contract_plan_instances, type_no, length_months, update_comments, cancel_fee, action_directive, start_date, end_date, cascade_action, contract_rollover_custom_rates);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelInstanceContractM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long contract_no, String client_contract_id, String update_comments, Long close_status){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().cancelInstanceContractM(client_no, auth_key, acct_no, client_acct_id, contract_no, client_contract_id, update_comments, close_status, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelInstanceContractM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long contract_no = (Long) map.get("contract_no");
                String client_contract_id = (String) map.get("client_contract_id");
                String update_comments = (String) map.get("update_comments");
                Long close_status = (Long) map.get("close_status");
                
        return cancelInstanceContractM(client_no, auth_key, acct_no, client_acct_id, contract_no, client_contract_id, update_comments, close_status);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getInstanceContractM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long contract_no, String client_contract_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_type_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_length_months = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_create_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_update_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_create_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_update_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_start_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_end_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_contract_plan_instance_details = new javax.xml.ws.Holder();

        
        getCompletePort().getInstanceContractM(client_no, auth_key, acct_no, client_acct_id, contract_no, client_contract_id, h_error_code, h_error_msg, h_type_no, h_length_months, h_create_comments, h_update_comments, h_create_date, h_update_date, h_start_date, h_end_date, h_status_code, h_contract_plan_instance_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("type_no",((javax.xml.ws.Holder)h_type_no).value);
        getHashMapReturnValues().put("length_months",((javax.xml.ws.Holder)h_length_months).value);
        getHashMapReturnValues().put("create_comments",((javax.xml.ws.Holder)h_create_comments).value);
        getHashMapReturnValues().put("update_comments",((javax.xml.ws.Holder)h_update_comments).value);
        getHashMapReturnValues().put("create_date",((javax.xml.ws.Holder)h_create_date).value);
        getHashMapReturnValues().put("update_date",((javax.xml.ws.Holder)h_update_date).value);
        getHashMapReturnValues().put("start_date",((javax.xml.ws.Holder)h_start_date).value);
        getHashMapReturnValues().put("end_date",((javax.xml.ws.Holder)h_end_date).value);
        getHashMapReturnValues().put("status_code",((javax.xml.ws.Holder)h_status_code).value);
        getHashMapReturnValues().put("contract_plan_instance_details",((javax.xml.ws.Holder)h_contract_plan_instance_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getInstanceContractM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long contract_no = (Long) map.get("contract_no");
                String client_contract_id = (String) map.get("client_contract_id");
                
        return getInstanceContractM(client_no, auth_key, acct_no, client_acct_id, contract_no, client_contract_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAllAcctContractsM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long filter_status_code, String exclude_terminated_plan_inst){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_all_acct_contracts_m = new javax.xml.ws.Holder();

        
        getCompletePort().getAllAcctContractsM(client_no, auth_key, acct_no, client_acct_id, filter_status_code, exclude_terminated_plan_inst, h_error_code, h_error_msg, h_all_acct_contracts_m);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("all_acct_contracts_m",((javax.xml.ws.Holder)h_all_acct_contracts_m).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAllAcctContractsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long filter_status_code = (Long) map.get("filter_status_code");
                String exclude_terminated_plan_inst = (String) map.get("exclude_terminated_plan_inst");
                
        return getAllAcctContractsM(client_no, auth_key, acct_no, client_acct_id, filter_status_code, exclude_terminated_plan_inst);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getInvNoFromBalXfer(Long client_no, String auth_key, Long transaction_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_acct_no = new javax.xml.ws.Holder();

        
        getCompletePort().getInvNoFromBalXfer(client_no, auth_key, transaction_id, h_error_code, h_error_msg, h_invoice_no, h_acct_no);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("acct_no",((javax.xml.ws.Holder)h_acct_no).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getInvNoFromBalXfer(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long transaction_id = (Long) map.get("transaction_id");
                
        return getInvNoFromBalXfer(client_no, auth_key, transaction_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> voidTransaction(Long client_no, String auth_key, Long account_no, Long transaction_id, Long reason_code, String comments, String client_receipt_id, String discard_invoice_usage){
        javax.xml.ws.Holder h_new_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().voidTransaction(client_no, auth_key, account_no, transaction_id, reason_code, comments, client_receipt_id, discard_invoice_usage, h_new_transaction_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("new_transaction_id",((javax.xml.ws.Holder)h_new_transaction_id).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> voidTransaction(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long transaction_id = (Long) map.get("transaction_id");
                Long reason_code = (Long) map.get("reason_code");
                String comments = (String) map.get("comments");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String discard_invoice_usage = (String) map.get("discard_invoice_usage");
                
        return voidTransaction(client_no, auth_key, account_no, transaction_id, reason_code, comments, client_receipt_id, discard_invoice_usage);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> reinstateTransaction(Long client_no, String auth_key, Long account_no, Long transaction_id, String comments){
        javax.xml.ws.Holder h_new_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().reinstateTransaction(client_no, auth_key, account_no, transaction_id, comments, h_new_transaction_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("new_transaction_id",((javax.xml.ws.Holder)h_new_transaction_id).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> reinstateTransaction(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long transaction_id = (Long) map.get("transaction_id");
                String comments = (String) map.get("comments");
                
        return reinstateTransaction(client_no, auth_key, account_no, transaction_id, comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> transferAccountBalance(Long client_no, String auth_key, Long source_account_no, Long target_account_no, String client_receipt_id){
        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_balance_transferred = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().transferAccountBalance(client_no, auth_key, source_account_no, target_account_no, client_receipt_id, h_transaction_id, h_balance_transferred, h_error_code, h_error_msg);

        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("balance_transferred",((javax.xml.ws.Holder)h_balance_transferred).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> transferAccountBalance(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long source_account_no = (Long) map.get("source_account_no");
                Long target_account_no = (Long) map.get("target_account_no");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return transferAccountBalance(client_no, auth_key, source_account_no, target_account_no, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createOrder(Long client_no, String auth_key, Long account_no, com.aria.common.shared.OrderLineItemsArray order_line_items, Long bill_immediately, Long bill_seq, String client_order_id, String client_receipt_id, Long alt_pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_routing_num, String bank_acct_num, String bill_company_name, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_address1, String bill_address2, String bill_city, String bill_locality, String bill_state_prov, String bill_zip, String bill_country, String bill_email, String bill_phone, String bill_phone_extension, String bill_cell_phone, String bill_work_phone, String bill_work_phone_extension, String cvv, String bank_acct_type, String bill_address3, String do_write, String coupon_cd, String alt_client_acct_group_id, String track_data1, String track_data2, Long alt_inv_template_no, String client_alt_inv_template_id, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd, String statement_message, String fulfilled_date, String order_comments){
        javax.xml.ws.Holder h_order_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoicing_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoicing_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cart_invoice_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().createOrder(client_no, auth_key, account_no, order_line_items, bill_immediately, bill_seq, client_order_id, client_receipt_id, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, bank_acct_type, bill_address3, do_write, coupon_cd, alt_client_acct_group_id, track_data1, track_data2, alt_inv_template_no, client_alt_inv_template_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, statement_message, fulfilled_date, order_comments, h_order_no, h_transaction_id, h_invoicing_error_code, h_invoicing_error_msg, h_statement_error_cd, h_statement_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_invoice_no, h_error_code, h_error_msg, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_cart_invoice_line_items, h_third_party_errors);

        getHashMapReturnValues().put("order_no",((javax.xml.ws.Holder)h_order_no).value);
        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("invoicing_error_code",((javax.xml.ws.Holder)h_invoicing_error_code).value);
        getHashMapReturnValues().put("invoicing_error_msg",((javax.xml.ws.Holder)h_invoicing_error_msg).value);
        getHashMapReturnValues().put("statement_error_cd",((javax.xml.ws.Holder)h_statement_error_cd).value);
        getHashMapReturnValues().put("statement_error_msg",((javax.xml.ws.Holder)h_statement_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("cart_invoice_line_items",((javax.xml.ws.Holder)h_cart_invoice_line_items).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createOrder(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                com.aria.common.shared.OrderLineItemsArray order_line_items = (com.aria.common.shared.OrderLineItemsArray) map.get("order_line_items");
                Long bill_immediately = (Long) map.get("bill_immediately");
                Long bill_seq = (Long) map.get("bill_seq");
                String client_order_id = (String) map.get("client_order_id");
                String client_receipt_id = (String) map.get("client_receipt_id");
                Long alt_pay_method = (Long) map.get("alt_pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_zip = (String) map.get("bill_zip");
                String bill_country = (String) map.get("bill_country");
                String bill_email = (String) map.get("bill_email");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_extension = (String) map.get("bill_phone_extension");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_extension = (String) map.get("bill_work_phone_extension");
                String cvv = (String) map.get("cvv");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String bill_address3 = (String) map.get("bill_address3");
                String do_write = (String) map.get("do_write");
                String coupon_cd = (String) map.get("coupon_cd");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                Long alt_inv_template_no = (Long) map.get("alt_inv_template_no");
                String client_alt_inv_template_id = (String) map.get("client_alt_inv_template_id");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                String statement_message = (String) map.get("statement_message");
                String fulfilled_date = (String) map.get("fulfilled_date");
                String order_comments = (String) map.get("order_comments");
                
        return createOrder(client_no, auth_key, account_no, order_line_items, bill_immediately, bill_seq, client_order_id, client_receipt_id, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, bank_acct_type, bill_address3, do_write, coupon_cd, alt_client_acct_group_id, track_data1, track_data2, alt_inv_template_no, client_alt_inv_template_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, statement_message, fulfilled_date, order_comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> settleAccountBalance(Long client_no, String auth_key, Long account_no, Long alt_pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_routing_num, String bank_acct_num, String bill_company_name, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_address1, String bill_address2, String bill_city, String bill_locality, String bill_state_prov, String bill_zip, String bill_country, String bill_email, String bill_phone, String bill_phone_extension, String bill_cell_phone, String bill_work_phone, String bill_work_phone_extension, String cvv, String bank_acct_type, String bill_address3, String alt_client_acct_group_id, String track_data1, String track_data2, String force_balance_scope, String client_receipt_id, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd){
        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().settleAccountBalance(client_no, auth_key, account_no, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, bank_acct_type, bill_address3, alt_client_acct_group_id, track_data1, track_data2, force_balance_scope, client_receipt_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, h_transaction_id, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_error_code, h_error_msg);

        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> settleAccountBalance(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long alt_pay_method = (Long) map.get("alt_pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_zip = (String) map.get("bill_zip");
                String bill_country = (String) map.get("bill_country");
                String bill_email = (String) map.get("bill_email");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_extension = (String) map.get("bill_phone_extension");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_extension = (String) map.get("bill_work_phone_extension");
                String cvv = (String) map.get("cvv");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String bill_address3 = (String) map.get("bill_address3");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                String force_balance_scope = (String) map.get("force_balance_scope");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                
        return settleAccountBalance(client_no, auth_key, account_no, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, bank_acct_type, bill_address3, alt_client_acct_group_id, track_data1, track_data2, force_balance_scope, client_receipt_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> collectFromAccount(Long client_no, String auth_key, Long account_no, Double amount_to_collect, Long bill_seq, String client_receipt_id, com.aria.common.shared.SpecificChargeTransactionIdArray specific_charge_transaction_id, Long alt_pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_routing_num, String bank_acct_num, String bill_company_name, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_address1, String bill_address2, String bill_city, String bill_locality, String bill_state_prov, String bill_zip, String bill_country, String bill_email, String bill_phone, String bill_phone_extension, String bill_cell_phone, String bill_work_phone, String bill_work_phone_extension, String cvv, String bank_acct_type, String bill_address3, String alt_client_acct_group_id, String track_data1, String track_data2, Long payment_application_method, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd){
        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().collectFromAccount(client_no, auth_key, account_no, amount_to_collect, bill_seq, client_receipt_id, specific_charge_transaction_id, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, bank_acct_type, bill_address3, alt_client_acct_group_id, track_data1, track_data2, payment_application_method, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, h_transaction_id, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_error_code, h_error_msg);

        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> collectFromAccount(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Double amount_to_collect = (Double) map.get("amount_to_collect");
                Long bill_seq = (Long) map.get("bill_seq");
                String client_receipt_id = (String) map.get("client_receipt_id");
                com.aria.common.shared.SpecificChargeTransactionIdArray specific_charge_transaction_id = (com.aria.common.shared.SpecificChargeTransactionIdArray) map.get("specific_charge_transaction_id");
                Long alt_pay_method = (Long) map.get("alt_pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_zip = (String) map.get("bill_zip");
                String bill_country = (String) map.get("bill_country");
                String bill_email = (String) map.get("bill_email");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_extension = (String) map.get("bill_phone_extension");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_extension = (String) map.get("bill_work_phone_extension");
                String cvv = (String) map.get("cvv");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String bill_address3 = (String) map.get("bill_address3");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                Long payment_application_method = (Long) map.get("payment_application_method");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                
        return collectFromAccount(client_no, auth_key, account_no, amount_to_collect, bill_seq, client_receipt_id, specific_charge_transaction_id, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, bank_acct_type, bill_address3, alt_client_acct_group_id, track_data1, track_data2, payment_application_method, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> recordExternalPayment(Long client_no, String auth_key, Long account_no, String reference_code, Double payment_amount, String comments, String client_receipt_id, com.aria.common.shared.SpecificChargeTransactionIdArray specific_charge_transaction_id, Long external_destination_id, String external_id, com.aria.common.shared.InvoiceNoArray invoice_no){
        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().recordExternalPayment(client_no, auth_key, account_no, reference_code, payment_amount, comments, client_receipt_id, specific_charge_transaction_id, external_destination_id, external_id, invoice_no, h_transaction_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> recordExternalPayment(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                String reference_code = (String) map.get("reference_code");
                Double payment_amount = (Double) map.get("payment_amount");
                String comments = (String) map.get("comments");
                String client_receipt_id = (String) map.get("client_receipt_id");
                com.aria.common.shared.SpecificChargeTransactionIdArray specific_charge_transaction_id = (com.aria.common.shared.SpecificChargeTransactionIdArray) map.get("specific_charge_transaction_id");
                Long external_destination_id = (Long) map.get("external_destination_id");
                String external_id = (String) map.get("external_id");
                com.aria.common.shared.InvoiceNoArray invoice_no = (com.aria.common.shared.InvoiceNoArray) map.get("invoice_no");
                
        return recordExternalPayment(client_no, auth_key, account_no, reference_code, payment_amount, comments, client_receipt_id, specific_charge_transaction_id, external_destination_id, external_id, invoice_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> recordOutGoingPayment(Long client_no, String auth_key, Long account_no, Double payment_amount, String reference_code, String comments){
        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().recordOutGoingPayment(client_no, auth_key, account_no, payment_amount, reference_code, comments, h_transaction_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> recordOutGoingPayment(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Double payment_amount = (Double) map.get("payment_amount");
                String reference_code = (String) map.get("reference_code");
                String comments = (String) map.get("comments");
                
        return recordOutGoingPayment(client_no, auth_key, account_no, payment_amount, reference_code, comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> applyServiceCredit(Long client_no, String auth_key, Long account_no, Double credit_amount, Long credit_reason_code, String comments){
        javax.xml.ws.Holder h_credit_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().applyServiceCredit(client_no, auth_key, account_no, credit_amount, credit_reason_code, comments, h_credit_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("credit_id",((javax.xml.ws.Holder)h_credit_id).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> applyServiceCredit(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Double credit_amount = (Double) map.get("credit_amount");
                Long credit_reason_code = (Long) map.get("credit_reason_code");
                String comments = (String) map.get("comments");
                
        return applyServiceCredit(client_no, auth_key, account_no, credit_amount, credit_reason_code, comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> applyCashCredit(Long client_no, String auth_key, Long account_no, Double credit_amount, Long credit_reason_code, String comments, com.aria.common.shared.SpecificChargeTransactionIdArray specific_charge_transaction_id, String client_receipt_id){
        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().applyCashCredit(client_no, auth_key, account_no, credit_amount, credit_reason_code, comments, specific_charge_transaction_id, client_receipt_id, h_transaction_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> applyCashCredit(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Double credit_amount = (Double) map.get("credit_amount");
                Long credit_reason_code = (Long) map.get("credit_reason_code");
                String comments = (String) map.get("comments");
                com.aria.common.shared.SpecificChargeTransactionIdArray specific_charge_transaction_id = (com.aria.common.shared.SpecificChargeTransactionIdArray) map.get("specific_charge_transaction_id");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return applyCashCredit(client_no, auth_key, account_no, credit_amount, credit_reason_code, comments, specific_charge_transaction_id, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> recordStandingOrder(Long client_no, String auth_key, Long account_no, Long billing_interval_units, Long times_to_bill, String billing_interval_type, String first_bill_date, com.aria.common.shared.StandingOrderArray standing_order, String client_order_id, String client_receipt_id, String statement_message, String order_comments){
        javax.xml.ws.Holder h_standing_order_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().recordStandingOrder(client_no, auth_key, account_no, billing_interval_units, times_to_bill, billing_interval_type, first_bill_date, standing_order, client_order_id, client_receipt_id, statement_message, order_comments, h_standing_order_no, h_error_code, h_error_msg);

        getHashMapReturnValues().put("standing_order_no",((javax.xml.ws.Holder)h_standing_order_no).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> recordStandingOrder(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long billing_interval_units = (Long) map.get("billing_interval_units");
                Long times_to_bill = (Long) map.get("times_to_bill");
                String billing_interval_type = (String) map.get("billing_interval_type");
                String first_bill_date = (String) map.get("first_bill_date");
                com.aria.common.shared.StandingOrderArray standing_order = (com.aria.common.shared.StandingOrderArray) map.get("standing_order");
                String client_order_id = (String) map.get("client_order_id");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String statement_message = (String) map.get("statement_message");
                String order_comments = (String) map.get("order_comments");
                
        return recordStandingOrder(client_no, auth_key, account_no, billing_interval_units, times_to_bill, billing_interval_type, first_bill_date, standing_order, client_order_id, client_receipt_id, statement_message, order_comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelStandingOrder(Long client_no, String auth_key, Long standing_order_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().cancelStandingOrder(client_no, auth_key, standing_order_no, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelStandingOrder(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long standing_order_no = (Long) map.get("standing_order_no");
                
        return cancelStandingOrder(client_no, auth_key, standing_order_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> movePayment(Long client_no, String auth_key, Long account_no, Long payment_id, com.aria.common.shared.SpecificChargeTransactionIdArray specific_charge_transaction_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().movePayment(client_no, auth_key, account_no, payment_id, specific_charge_transaction_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> movePayment(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long payment_id = (Long) map.get("payment_id");
                com.aria.common.shared.SpecificChargeTransactionIdArray specific_charge_transaction_id = (com.aria.common.shared.SpecificChargeTransactionIdArray) map.get("specific_charge_transaction_id");
                
        return movePayment(client_no, auth_key, account_no, payment_id, specific_charge_transaction_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> bulkRecordUsage(Long client_no, String auth_key, com.aria.common.shared.UsageRecordsArray usage_records, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_records = new javax.xml.ws.Holder();

        
        getCompletePort().bulkRecordUsage(client_no, auth_key, usage_records, client_receipt_id, h_error_code, h_error_msg, h_error_records);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("error_records",((javax.xml.ws.Holder)h_error_records).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> bulkRecordUsage(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        com.aria.common.shared.UsageRecordsArray usage_records = (com.aria.common.shared.UsageRecordsArray) map.get("usage_records");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return bulkRecordUsage(client_no, auth_key, usage_records, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> recordUsage(Long client_no, String auth_key, Long acct_no, String userid, Long usage_type, Double usage_units, String usage_type_code, String usage_date, Double billable_units, Double amt, Double rate, String telco_from, String telco_to, String comments, String exclude_from_billing, String exclusion_comments, String qualifier_1, String qualifier_2, String qualifier_3, String qualifier_4, Long parent_usage_rec_no, String client_record_id, String caller_id, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_usage_rec_no = new javax.xml.ws.Holder();

        
        getCompletePort().recordUsage(client_no, auth_key, acct_no, userid, usage_type, usage_units, usage_type_code, usage_date, billable_units, amt, rate, telco_from, telco_to, comments, exclude_from_billing, exclusion_comments, qualifier_1, qualifier_2, qualifier_3, qualifier_4, parent_usage_rec_no, client_record_id, caller_id, client_receipt_id, h_error_code, h_error_msg, h_usage_rec_no);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("usage_rec_no",((javax.xml.ws.Holder)h_usage_rec_no).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> recordUsage(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String userid = (String) map.get("userid");
                Long usage_type = (Long) map.get("usage_type");
                Double usage_units = (Double) map.get("usage_units");
                String usage_type_code = (String) map.get("usage_type_code");
                String usage_date = (String) map.get("usage_date");
                Double billable_units = (Double) map.get("billable_units");
                Double amt = (Double) map.get("amt");
                Double rate = (Double) map.get("rate");
                String telco_from = (String) map.get("telco_from");
                String telco_to = (String) map.get("telco_to");
                String comments = (String) map.get("comments");
                String exclude_from_billing = (String) map.get("exclude_from_billing");
                String exclusion_comments = (String) map.get("exclusion_comments");
                String qualifier_1 = (String) map.get("qualifier_1");
                String qualifier_2 = (String) map.get("qualifier_2");
                String qualifier_3 = (String) map.get("qualifier_3");
                String qualifier_4 = (String) map.get("qualifier_4");
                Long parent_usage_rec_no = (Long) map.get("parent_usage_rec_no");
                String client_record_id = (String) map.get("client_record_id");
                String caller_id = (String) map.get("caller_id");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return recordUsage(client_no, auth_key, acct_no, userid, usage_type, usage_units, usage_type_code, usage_date, billable_units, amt, rate, telco_from, telco_to, comments, exclude_from_billing, exclusion_comments, qualifier_1, qualifier_2, qualifier_3, qualifier_4, parent_usage_rec_no, client_record_id, caller_id, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getOrder(Long client_no, String auth_key, Long acct_no, Long my_order_no, String my_client_order_id, Long limit_records, Long details_flag){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_order = new javax.xml.ws.Holder();

        
        getCompletePort().getOrder(client_no, auth_key, acct_no, my_order_no, my_client_order_id, limit_records, details_flag, h_error_code, h_error_msg, h_order);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("order",((javax.xml.ws.Holder)h_order).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getOrder(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long my_order_no = (Long) map.get("my_order_no");
                String my_client_order_id = (String) map.get("my_client_order_id");
                Long limit_records = (Long) map.get("limit_records");
                Long details_flag = (Long) map.get("details_flag");
                
        return getOrder(client_no, auth_key, acct_no, my_order_no, my_client_order_id, limit_records, details_flag);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getStandingOrder(Long client_no, String auth_key, Long acct_no, Long my_standing_order, String my_client_order_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_so = new javax.xml.ws.Holder();

        
        getCompletePort().getStandingOrder(client_no, auth_key, acct_no, my_standing_order, my_client_order_id, h_error_code, h_error_msg, h_so);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("so",((javax.xml.ws.Holder)h_so).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getStandingOrder(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long my_standing_order = (Long) map.get("my_standing_order");
                String my_client_order_id = (String) map.get("my_client_order_id");
                
        return getStandingOrder(client_no, auth_key, acct_no, my_standing_order, my_client_order_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getStandingOrderItems(Long client_no, String auth_key, Long standing_order_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_so_items = new javax.xml.ws.Holder();

        
        getCompletePort().getStandingOrderItems(client_no, auth_key, standing_order_no, h_error_code, h_error_msg, h_so_items);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("so_items",((javax.xml.ws.Holder)h_so_items).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getStandingOrderItems(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long standing_order_no = (Long) map.get("standing_order_no");
                
        return getStandingOrderItems(client_no, auth_key, standing_order_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getStandingOrderHist(Long client_no, String auth_key, Long standing_order_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_order = new javax.xml.ws.Holder();

        
        getCompletePort().getStandingOrderHist(client_no, auth_key, standing_order_no, h_error_code, h_error_msg, h_order);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("order",((javax.xml.ws.Holder)h_order).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getStandingOrderHist(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long standing_order_no = (Long) map.get("standing_order_no");
                
        return getStandingOrderHist(client_no, auth_key, standing_order_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> preCalcInvoice(Long client_no, String auth_key, String log_id, String first_name, String mi, String last_name, String address1, String address2, String city, String state_prov_code, String zip_code, String country_code, String currency_code, com.aria.common.shared.PreCalcPlanArray pre_calc_plan, com.aria.common.shared.PreCalcSkuArray pre_calc_sku, Long tax_exempt_cd, String address3){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_inv_calc_out = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().preCalcInvoice(client_no, auth_key, log_id, first_name, mi, last_name, address1, address2, city, state_prov_code, zip_code, country_code, currency_code, pre_calc_plan, pre_calc_sku, tax_exempt_cd, address3, h_error_code, h_error_msg, h_inv_calc_out, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("inv_calc_out",((javax.xml.ws.Holder)h_inv_calc_out).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> preCalcInvoice(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String log_id = (String) map.get("log_id");
                String first_name = (String) map.get("first_name");
                String mi = (String) map.get("mi");
                String last_name = (String) map.get("last_name");
                String address1 = (String) map.get("address1");
                String address2 = (String) map.get("address2");
                String city = (String) map.get("city");
                String state_prov_code = (String) map.get("state_prov_code");
                String zip_code = (String) map.get("zip_code");
                String country_code = (String) map.get("country_code");
                String currency_code = (String) map.get("currency_code");
                com.aria.common.shared.PreCalcPlanArray pre_calc_plan = (com.aria.common.shared.PreCalcPlanArray) map.get("pre_calc_plan");
                com.aria.common.shared.PreCalcSkuArray pre_calc_sku = (com.aria.common.shared.PreCalcSkuArray) map.get("pre_calc_sku");
                Long tax_exempt_cd = (Long) map.get("tax_exempt_cd");
                String address3 = (String) map.get("address3");
                
        return preCalcInvoice(client_no, auth_key, log_id, first_name, mi, last_name, address1, address2, city, state_prov_code, zip_code, country_code, currency_code, pre_calc_plan, pre_calc_sku, tax_exempt_cd, address3);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getOrderItems(Long client_no, String auth_key, Long order_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_order_items = new javax.xml.ws.Holder();

        
        getCompletePort().getOrderItems(client_no, auth_key, order_no, h_error_code, h_error_msg, h_order_items);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("order_items",((javax.xml.ws.Holder)h_order_items).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getOrderItems(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long order_no = (Long) map.get("order_no");
                
        return getOrderItems(client_no, auth_key, order_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> genInvoice(Long client_no, String auth_key, Long acct_no, String force_pending, String client_receipt_id, Long alt_bill_day, Long invoice_mode){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().genInvoice(client_no, auth_key, acct_no, force_pending, client_receipt_id, alt_bill_day, invoice_mode, h_error_code, h_error_msg, h_invoice_no, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> genInvoice(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String force_pending = (String) map.get("force_pending");
                String client_receipt_id = (String) map.get("client_receipt_id");
                Long alt_bill_day = (Long) map.get("alt_bill_day");
                Long invoice_mode = (Long) map.get("invoice_mode");
                
        return genInvoice(client_no, auth_key, acct_no, force_pending, client_receipt_id, alt_bill_day, invoice_mode);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPreviewStatement(Long client_no, String auth_key, Long acct_no, Double alt_stmt_template_no, Long auto_skip_to_next_bill_date){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_statement = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_mime_type = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPreviewStatement(client_no, auth_key, acct_no, alt_stmt_template_no, auto_skip_to_next_bill_date, h_error_code, h_error_msg, h_out_statement, h_mime_type);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("out_statement",((javax.xml.ws.Holder)h_out_statement).value);
        getHashMapReturnValues().put("mime_type",((javax.xml.ws.Holder)h_mime_type).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPreviewStatement(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Double alt_stmt_template_no = (Double) map.get("alt_stmt_template_no");
                Long auto_skip_to_next_bill_date = (Long) map.get("auto_skip_to_next_bill_date");
                
        return getAcctPreviewStatement(client_no, auth_key, acct_no, alt_stmt_template_no, auto_skip_to_next_bill_date);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPreviewStatementM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, Double alt_stmt_template_no, Long auto_skip_to_next_bill_date){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_statement = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_mime_type = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPreviewStatementM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, alt_stmt_template_no, auto_skip_to_next_bill_date, h_error_code, h_error_msg, h_out_statement, h_mime_type);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("out_statement",((javax.xml.ws.Holder)h_out_statement).value);
        getHashMapReturnValues().put("mime_type",((javax.xml.ws.Holder)h_mime_type).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPreviewStatementM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                Double alt_stmt_template_no = (Double) map.get("alt_stmt_template_no");
                Long auto_skip_to_next_bill_date = (Long) map.get("auto_skip_to_next_bill_date");
                
        return getAcctPreviewStatementM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, alt_stmt_template_no, auto_skip_to_next_bill_date);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getStatementForInvoice(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long invoice_no, String do_encoding){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_statement = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_mime_type = new javax.xml.ws.Holder();

        
        getCompletePort().getStatementForInvoice(client_no, auth_key, acct_no, client_acct_id, invoice_no, do_encoding, h_error_code, h_error_msg, h_out_statement, h_mime_type);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("out_statement",((javax.xml.ws.Holder)h_out_statement).value);
        getHashMapReturnValues().put("mime_type",((javax.xml.ws.Holder)h_mime_type).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getStatementForInvoice(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long invoice_no = (Long) map.get("invoice_no");
                String do_encoding = (String) map.get("do_encoding");
                
        return getStatementForInvoice(client_no, auth_key, acct_no, client_acct_id, invoice_no, do_encoding);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getStatementForInvSize(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long invoice_no, String do_encoding){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_num_chars = new javax.xml.ws.Holder();

        
        getCompletePort().getStatementForInvSize(client_no, auth_key, acct_no, client_acct_id, invoice_no, do_encoding, h_error_code, h_error_msg, h_num_chars);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("num_chars",((javax.xml.ws.Holder)h_num_chars).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getStatementForInvSize(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long invoice_no = (Long) map.get("invoice_no");
                String do_encoding = (String) map.get("do_encoding");
                
        return getStatementForInvSize(client_no, auth_key, acct_no, client_acct_id, invoice_no, do_encoding);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getInvoiceDetails(Long client_no, String auth_key, Long acct_no, Long src_transaction_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_is_pending_ind = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_custom_status_label = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_custom_status_desc = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_notes = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_type_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_from_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_to_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_posting_status_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_posting_user = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_posting_date = new javax.xml.ws.Holder();

        
        getCompletePort().getInvoiceDetails(client_no, auth_key, acct_no, src_transaction_id, h_error_code, h_error_msg, h_invoice_line_items, h_is_pending_ind, h_custom_status_label, h_custom_status_desc, h_client_notes, h_invoice_type_cd, h_from_date, h_to_date, h_posting_status_cd, h_posting_user, h_posting_date);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("invoice_line_items",((javax.xml.ws.Holder)h_invoice_line_items).value);
        getHashMapReturnValues().put("is_pending_ind",((javax.xml.ws.Holder)h_is_pending_ind).value);
        getHashMapReturnValues().put("custom_status_label",((javax.xml.ws.Holder)h_custom_status_label).value);
        getHashMapReturnValues().put("custom_status_desc",((javax.xml.ws.Holder)h_custom_status_desc).value);
        getHashMapReturnValues().put("client_notes",((javax.xml.ws.Holder)h_client_notes).value);
        getHashMapReturnValues().put("invoice_type_cd",((javax.xml.ws.Holder)h_invoice_type_cd).value);
        getHashMapReturnValues().put("from_date",((javax.xml.ws.Holder)h_from_date).value);
        getHashMapReturnValues().put("to_date",((javax.xml.ws.Holder)h_to_date).value);
        getHashMapReturnValues().put("posting_status_cd",((javax.xml.ws.Holder)h_posting_status_cd).value);
        getHashMapReturnValues().put("posting_user",((javax.xml.ws.Holder)h_posting_user).value);
        getHashMapReturnValues().put("posting_date",((javax.xml.ws.Holder)h_posting_date).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getInvoiceDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long src_transaction_id = (Long) map.get("src_transaction_id");
                
        return getInvoiceDetails(client_no, auth_key, acct_no, src_transaction_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getPaymentsOnInvoice(Long client_no, String auth_key, Long acct_no, Long src_transaction_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_payments = new javax.xml.ws.Holder();

        
        getCompletePort().getPaymentsOnInvoice(client_no, auth_key, acct_no, src_transaction_id, h_error_code, h_error_msg, h_invoice_payments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("invoice_payments",((javax.xml.ws.Holder)h_invoice_payments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPaymentsOnInvoice(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long src_transaction_id = (Long) map.get("src_transaction_id");
                
        return getPaymentsOnInvoice(client_no, auth_key, acct_no, src_transaction_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getPaymentApplications(Long client_no, String auth_key, Long acct_no, Long src_transaction_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_payment_applications = new javax.xml.ws.Holder();

        
        getCompletePort().getPaymentApplications(client_no, auth_key, acct_no, src_transaction_id, h_error_code, h_error_msg, h_payment_applications);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("payment_applications",((javax.xml.ws.Holder)h_payment_applications).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPaymentApplications(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long src_transaction_id = (Long) map.get("src_transaction_id");
                
        return getPaymentApplications(client_no, auth_key, acct_no, src_transaction_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAllActionsByReceiptId(Long client_no, String auth_key, Long acct_no, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_receipt_action = new javax.xml.ws.Holder();

        
        getCompletePort().getAllActionsByReceiptId(client_no, auth_key, acct_no, client_receipt_id, h_error_code, h_error_msg, h_receipt_action);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("receipt_action",((javax.xml.ws.Holder)h_receipt_action).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAllActionsByReceiptId(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return getAllActionsByReceiptId(client_no, auth_key, acct_no, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> managePendingInvoice(Long client_no, String auth_key, Long invoice_no, Long acct_no, Long action_directive, Long bill_seq, Long alt_pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_routing_num, String bank_acct_num, String bill_company_name, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_address1, String bill_address2, String bill_city, String bill_locality, String bill_state_prov, String bill_zip, String bill_country, String bill_email, String bill_phone, String bill_phone_extension, String bill_cell_phone, String bill_work_phone, String bill_work_phone_extension, String cvv, String alt_collect_on_approve, String alt_send_statement_on_approve, String cancel_orders_on_discard, String bank_acct_type, String bill_address3, String track_data1, String track_data2, String client_receipt_id, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd, String custom_status_label, String client_notes){
        javax.xml.ws.Holder h_new_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().managePendingInvoice(client_no, auth_key, invoice_no, acct_no, action_directive, bill_seq, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, alt_collect_on_approve, alt_send_statement_on_approve, cancel_orders_on_discard, bank_acct_type, bill_address3, track_data1, track_data2, client_receipt_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, custom_status_label, client_notes, h_new_invoice_no, h_collection_error_code, h_collection_error_msg, h_statement_error_code, h_statement_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_error_code, h_error_msg);

        getHashMapReturnValues().put("new_invoice_no",((javax.xml.ws.Holder)h_new_invoice_no).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("statement_error_code",((javax.xml.ws.Holder)h_statement_error_code).value);
        getHashMapReturnValues().put("statement_error_msg",((javax.xml.ws.Holder)h_statement_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> managePendingInvoice(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long invoice_no = (Long) map.get("invoice_no");
                Long acct_no = (Long) map.get("acct_no");
                Long action_directive = (Long) map.get("action_directive");
                Long bill_seq = (Long) map.get("bill_seq");
                Long alt_pay_method = (Long) map.get("alt_pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_zip = (String) map.get("bill_zip");
                String bill_country = (String) map.get("bill_country");
                String bill_email = (String) map.get("bill_email");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_extension = (String) map.get("bill_phone_extension");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_extension = (String) map.get("bill_work_phone_extension");
                String cvv = (String) map.get("cvv");
                String alt_collect_on_approve = (String) map.get("alt_collect_on_approve");
                String alt_send_statement_on_approve = (String) map.get("alt_send_statement_on_approve");
                String cancel_orders_on_discard = (String) map.get("cancel_orders_on_discard");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String bill_address3 = (String) map.get("bill_address3");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                String custom_status_label = (String) map.get("custom_status_label");
                String client_notes = (String) map.get("client_notes");
                
        return managePendingInvoice(client_no, auth_key, invoice_no, acct_no, action_directive, bill_seq, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, alt_collect_on_approve, alt_send_statement_on_approve, cancel_orders_on_discard, bank_acct_type, bill_address3, track_data1, track_data2, client_receipt_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, custom_status_label, client_notes);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelOrder(Long client_no, String auth_key, Long acct_no, Long order_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().cancelOrder(client_no, auth_key, acct_no, order_no, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelOrder(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long order_no = (Long) map.get("order_no");
                
        return cancelOrder(client_no, auth_key, acct_no, order_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getRefundDetails(Long client_no, String auth_key, Long acct_no, String include_voided, Long aria_event_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_refund_details = new javax.xml.ws.Holder();

        
        getCompletePort().getRefundDetails(client_no, auth_key, acct_no, include_voided, aria_event_no, h_error_code, h_error_msg, h_refund_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("refund_details",((javax.xml.ws.Holder)h_refund_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getRefundDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String include_voided = (String) map.get("include_voided");
                Long aria_event_no = (Long) map.get("aria_event_no");
                
        return getRefundDetails(client_no, auth_key, acct_no, include_voided, aria_event_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createOrderWithPlans(Long client_no, String auth_key, Long acct_no, com.aria.common.shared.OrderLineItemsArray order_line_items, com.aria.common.shared.CartSuppPlansArray cart_supp_plans, String client_order_id, String coupon_code, String comments, String do_write, String client_receipt_id, Long bill_seq, Long alt_pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_routing_num, String bank_acct_num, String bill_company_name, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_address1, String bill_address2, String bill_city, String bill_locality, String bill_state_prov, String bill_zip, String bill_country, String bill_email, String bill_phone, String bill_phone_extension, String bill_cell_phone, String bill_work_phone, String bill_work_phone_extension, String cvv, String bank_acct_type, String bill_address3, String track_data1, String track_data2, Long alt_inv_template_no, Long sync_mstr_bill_dates_override, com.aria.common.shared.MultipleCouponsArray multiple_coupons, String client_alt_inv_template_id, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd, String statement_message, String order_comments){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_order_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cart_invoice_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoicing_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoicing_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().createOrderWithPlans(client_no, auth_key, acct_no, order_line_items, cart_supp_plans, client_order_id, coupon_code, comments, do_write, client_receipt_id, bill_seq, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, bank_acct_type, bill_address3, track_data1, track_data2, alt_inv_template_no, sync_mstr_bill_dates_override, multiple_coupons, client_alt_inv_template_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, statement_message, order_comments, h_error_code, h_error_msg, h_order_no, h_invoice_no, h_cart_invoice_line_items, h_invoicing_error_code, h_invoicing_error_msg, h_collection_error_code, h_collection_error_msg, h_statement_error_code, h_statement_error_msg, h_transaction_id, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("order_no",((javax.xml.ws.Holder)h_order_no).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("cart_invoice_line_items",((javax.xml.ws.Holder)h_cart_invoice_line_items).value);
        getHashMapReturnValues().put("invoicing_error_code",((javax.xml.ws.Holder)h_invoicing_error_code).value);
        getHashMapReturnValues().put("invoicing_error_msg",((javax.xml.ws.Holder)h_invoicing_error_msg).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("statement_error_code",((javax.xml.ws.Holder)h_statement_error_code).value);
        getHashMapReturnValues().put("statement_error_msg",((javax.xml.ws.Holder)h_statement_error_msg).value);
        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createOrderWithPlans(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                com.aria.common.shared.OrderLineItemsArray order_line_items = (com.aria.common.shared.OrderLineItemsArray) map.get("order_line_items");
                com.aria.common.shared.CartSuppPlansArray cart_supp_plans = (com.aria.common.shared.CartSuppPlansArray) map.get("cart_supp_plans");
                String client_order_id = (String) map.get("client_order_id");
                String coupon_code = (String) map.get("coupon_code");
                String comments = (String) map.get("comments");
                String do_write = (String) map.get("do_write");
                String client_receipt_id = (String) map.get("client_receipt_id");
                Long bill_seq = (Long) map.get("bill_seq");
                Long alt_pay_method = (Long) map.get("alt_pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_zip = (String) map.get("bill_zip");
                String bill_country = (String) map.get("bill_country");
                String bill_email = (String) map.get("bill_email");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_extension = (String) map.get("bill_phone_extension");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_extension = (String) map.get("bill_work_phone_extension");
                String cvv = (String) map.get("cvv");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String bill_address3 = (String) map.get("bill_address3");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                Long alt_inv_template_no = (Long) map.get("alt_inv_template_no");
                Long sync_mstr_bill_dates_override = (Long) map.get("sync_mstr_bill_dates_override");
                com.aria.common.shared.MultipleCouponsArray multiple_coupons = (com.aria.common.shared.MultipleCouponsArray) map.get("multiple_coupons");
                String client_alt_inv_template_id = (String) map.get("client_alt_inv_template_id");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                String statement_message = (String) map.get("statement_message");
                String order_comments = (String) map.get("order_comments");
                
        return createOrderWithPlans(client_no, auth_key, acct_no, order_line_items, cart_supp_plans, client_order_id, coupon_code, comments, do_write, client_receipt_id, bill_seq, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, bank_acct_type, bill_address3, track_data1, track_data2, alt_inv_template_no, sync_mstr_bill_dates_override, multiple_coupons, client_alt_inv_template_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, statement_message, order_comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getRefundablePayments(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_refundable_payments = new javax.xml.ws.Holder();

        
        getCompletePort().getRefundablePayments(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_refundable_payments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("refundable_payments",((javax.xml.ws.Holder)h_refundable_payments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getRefundablePayments(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getRefundablePayments(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getReversibleInvsByPayment(Long client_no, String auth_key, Long acct_no, Long payment_transaction_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_reversible_invoices = new javax.xml.ws.Holder();

        
        getCompletePort().getReversibleInvsByPayment(client_no, auth_key, acct_no, payment_transaction_id, h_error_code, h_error_msg, h_reversible_invoices);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("reversible_invoices",((javax.xml.ws.Holder)h_reversible_invoices).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getReversibleInvsByPayment(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long payment_transaction_id = (Long) map.get("payment_transaction_id");
                
        return getReversibleInvsByPayment(client_no, auth_key, acct_no, payment_transaction_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> issueRefundToAcct(Long client_no, String auth_key, Long acct_no, Long payment_transaction_id, Long reason_code, Double total_refund_amount, String refund_check_number, String comments, String do_write, String auto_calc_refund, com.aria.common.shared.InvoicesToReverseArray invoices_to_reverse, String client_receipt_id, String is_unlinked_refund){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_applied_total_refund_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_applied_total_reversal_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_reversed_invoice_lines = new javax.xml.ws.Holder();

        
        getCompletePort().issueRefundToAcct(client_no, auth_key, acct_no, payment_transaction_id, reason_code, total_refund_amount, refund_check_number, comments, do_write, auto_calc_refund, invoices_to_reverse, client_receipt_id, is_unlinked_refund, h_error_code, h_error_msg, h_applied_total_refund_amount, h_applied_total_reversal_amount, h_transaction_id, h_reversed_invoice_lines);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("applied_total_refund_amount",((javax.xml.ws.Holder)h_applied_total_refund_amount).value);
        getHashMapReturnValues().put("applied_total_reversal_amount",((javax.xml.ws.Holder)h_applied_total_reversal_amount).value);
        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("reversed_invoice_lines",((javax.xml.ws.Holder)h_reversed_invoice_lines).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> issueRefundToAcct(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long payment_transaction_id = (Long) map.get("payment_transaction_id");
                Long reason_code = (Long) map.get("reason_code");
                Double total_refund_amount = (Double) map.get("total_refund_amount");
                String refund_check_number = (String) map.get("refund_check_number");
                String comments = (String) map.get("comments");
                String do_write = (String) map.get("do_write");
                String auto_calc_refund = (String) map.get("auto_calc_refund");
                com.aria.common.shared.InvoicesToReverseArray invoices_to_reverse = (com.aria.common.shared.InvoicesToReverseArray) map.get("invoices_to_reverse");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String is_unlinked_refund = (String) map.get("is_unlinked_refund");
                
        return issueRefundToAcct(client_no, auth_key, acct_no, payment_transaction_id, reason_code, total_refund_amount, refund_check_number, comments, do_write, auto_calc_refund, invoices_to_reverse, client_receipt_id, is_unlinked_refund);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateRefundCheckNo(Long client_no, String auth_key, Long acct_no, String acct_user_id, String client_acct_id, Long transaction_id, Long refund_check_number){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().updateRefundCheckNo(client_no, auth_key, acct_no, acct_user_id, client_acct_id, transaction_id, refund_check_number, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateRefundCheckNo(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String acct_user_id = (String) map.get("acct_user_id");
                String client_acct_id = (String) map.get("client_acct_id");
                Long transaction_id = (Long) map.get("transaction_id");
                Long refund_check_number = (Long) map.get("refund_check_number");
                
        return updateRefundCheckNo(client_no, auth_key, acct_no, acct_user_id, client_acct_id, transaction_id, refund_check_number);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getWriteoffDetails(Long client_no, String auth_key, Long acct_no, Long aria_event_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_writeoff_details = new javax.xml.ws.Holder();

        
        getCompletePort().getWriteoffDetails(client_no, auth_key, acct_no, aria_event_no, h_error_code, h_error_msg, h_writeoff_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("writeoff_details",((javax.xml.ws.Holder)h_writeoff_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getWriteoffDetails(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long aria_event_no = (Long) map.get("aria_event_no");
                
        return getWriteoffDetails(client_no, auth_key, acct_no, aria_event_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAriaXmlStatement(Long client_no, String auth_key, Long acct_no, Long xml_statement_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_xml_statement_content = new javax.xml.ws.Holder();

        
        getCompletePort().getAriaXmlStatement(client_no, auth_key, acct_no, xml_statement_no, h_error_code, h_error_msg, h_xml_statement_content);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("xml_statement_content",((javax.xml.ws.Holder)h_xml_statement_content).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAriaXmlStatement(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long xml_statement_no = (Long) map.get("xml_statement_no");
                
        return getAriaXmlStatement(client_no, auth_key, acct_no, xml_statement_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPaymentHistory(Long client_no, String auth_key, Long acct_no, String start_date, String end_date, Long limit_records, Long details_flag){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_payment_history = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPaymentHistory(client_no, auth_key, acct_no, start_date, end_date, limit_records, details_flag, h_error_code, h_error_msg, h_payment_history);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("payment_history",((javax.xml.ws.Holder)h_payment_history).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPaymentHistory(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String start_date = (String) map.get("start_date");
                String end_date = (String) map.get("end_date");
                Long limit_records = (Long) map.get("limit_records");
                Long details_flag = (Long) map.get("details_flag");
                
        return getAcctPaymentHistory(client_no, auth_key, acct_no, start_date, end_date, limit_records, details_flag);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateCcBlacklist(Long client_no, String auth_key, String cc_num, Long assignment_directive, String notes){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().updateCcBlacklist(client_no, auth_key, cc_num, assignment_directive, notes, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateCcBlacklist(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String cc_num = (String) map.get("cc_num");
                Long assignment_directive = (Long) map.get("assignment_directive");
                String notes = (String) map.get("notes");
                
        return updateCcBlacklist(client_no, auth_key, cc_num, assignment_directive, notes);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> compareAgainstCcBlacklist(Long client_no, String auth_key, String cc_num, Long include_details){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cc_num_blacklisted = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_notes = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_date_added = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_date_removed = new javax.xml.ws.Holder();

        
        getCompletePort().compareAgainstCcBlacklist(client_no, auth_key, cc_num, include_details, h_error_code, h_error_msg, h_cc_num_blacklisted, h_notes, h_date_added, h_date_removed);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("cc_num_blacklisted",((javax.xml.ws.Holder)h_cc_num_blacklisted).value);
        getHashMapReturnValues().put("notes",((javax.xml.ws.Holder)h_notes).value);
        getHashMapReturnValues().put("date_added",((javax.xml.ws.Holder)h_date_added).value);
        getHashMapReturnValues().put("date_removed",((javax.xml.ws.Holder)h_date_removed).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> compareAgainstCcBlacklist(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String cc_num = (String) map.get("cc_num");
                Long include_details = (Long) map.get("include_details");
                
        return compareAgainstCcBlacklist(client_no, auth_key, cc_num, include_details);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getCcVelocityInfo(Long client_no, String auth_key, String cc_num, String start_date, String end_date){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_velocity_data = new javax.xml.ws.Holder();

        
        getCompletePort().getCcVelocityInfo(client_no, auth_key, cc_num, start_date, end_date, h_error_code, h_error_msg, h_velocity_data);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("velocity_data",((javax.xml.ws.Holder)h_velocity_data).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getCcVelocityInfo(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String cc_num = (String) map.get("cc_num");
                String start_date = (String) map.get("start_date");
                String end_date = (String) map.get("end_date");
                
        return getCcVelocityInfo(client_no, auth_key, cc_num, start_date, end_date);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getPaymentApplicationDtls(Long client_no, String auth_key, Long acct_no, Long transaction_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_payment_application_details = new javax.xml.ws.Holder();

        
        getCompletePort().getPaymentApplicationDtls(client_no, auth_key, acct_no, transaction_id, h_error_code, h_error_msg, h_payment_application_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("payment_application_details",((javax.xml.ws.Holder)h_payment_application_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPaymentApplicationDtls(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long transaction_id = (Long) map.get("transaction_id");
                
        return getPaymentApplicationDtls(client_no, auth_key, acct_no, transaction_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getExtendedTransactionInfo(Long client_no, String auth_key, Long acct_no, Long transaction_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_trans_create_user = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_trans_create_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_extended_transaction_qualifiers = new javax.xml.ws.Holder();

        
        getCompletePort().getExtendedTransactionInfo(client_no, auth_key, acct_no, transaction_id, h_error_code, h_error_msg, h_trans_create_user, h_trans_create_date, h_extended_transaction_qualifiers);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("trans_create_user",((javax.xml.ws.Holder)h_trans_create_user).value);
        getHashMapReturnValues().put("trans_create_date",((javax.xml.ws.Holder)h_trans_create_date).value);
        getHashMapReturnValues().put("extended_transaction_qualifiers",((javax.xml.ws.Holder)h_extended_transaction_qualifiers).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getExtendedTransactionInfo(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long transaction_id = (Long) map.get("transaction_id");
                
        return getExtendedTransactionInfo(client_no, auth_key, acct_no, transaction_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> discardUsage(Long client_no, String auth_key, com.aria.common.shared.UsageRecordNosArray usage_record_nos, com.aria.common.shared.ClientRecordIdsArray client_record_ids, Long exclusion_reason_cd, String exclusion_comment){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_failed_records = new javax.xml.ws.Holder();

        
        getCompletePort().discardUsage(client_no, auth_key, usage_record_nos, client_record_ids, exclusion_reason_cd, exclusion_comment, h_error_code, h_error_msg, h_failed_records);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("failed_records",((javax.xml.ws.Holder)h_failed_records).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> discardUsage(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        com.aria.common.shared.UsageRecordNosArray usage_record_nos = (com.aria.common.shared.UsageRecordNosArray) map.get("usage_record_nos");
                com.aria.common.shared.ClientRecordIdsArray client_record_ids = (com.aria.common.shared.ClientRecordIdsArray) map.get("client_record_ids");
                Long exclusion_reason_cd = (Long) map.get("exclusion_reason_cd");
                String exclusion_comment = (String) map.get("exclusion_comment");
                
        return discardUsage(client_no, auth_key, usage_record_nos, client_record_ids, exclusion_reason_cd, exclusion_comment);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createWriteoffOrDispute(Long client_no, String auth_key, Long acct_no, Long invoice_no, Double amount, Long reason_code, String comments, Long do_dispute, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_rec_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_created_by = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_amount = new javax.xml.ws.Holder(amount);
        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder(invoice_no);
        javax.xml.ws.Holder h_invoice_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_amt = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_dispute_creation_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_dispute_exp_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_comments = new javax.xml.ws.Holder(comments);
        javax.xml.ws.Holder h_reason_code = new javax.xml.ws.Holder(reason_code);
        javax.xml.ws.Holder h_secondary_reason_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_dispute_ind = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_can_unsettle = new javax.xml.ws.Holder();

        
        getCompletePort().createWriteoffOrDispute(client_no, auth_key, acct_no, h_invoice_no, h_amount, h_reason_code, h_comments, do_dispute, client_receipt_id, h_error_code, h_error_msg, h_rec_no, h_created_by, h_invoice_date, h_invoice_amt, h_dispute_creation_date, h_dispute_exp_date, h_secondary_reason_code, h_dispute_ind, h_can_unsettle);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("rec_no",((javax.xml.ws.Holder)h_rec_no).value);
        getHashMapReturnValues().put("created_by",((javax.xml.ws.Holder)h_created_by).value);
        getHashMapReturnValues().put("amount",((javax.xml.ws.Holder)h_amount).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("invoice_date",((javax.xml.ws.Holder)h_invoice_date).value);
        getHashMapReturnValues().put("invoice_amt",((javax.xml.ws.Holder)h_invoice_amt).value);
        getHashMapReturnValues().put("dispute_creation_date",((javax.xml.ws.Holder)h_dispute_creation_date).value);
        getHashMapReturnValues().put("dispute_exp_date",((javax.xml.ws.Holder)h_dispute_exp_date).value);
        getHashMapReturnValues().put("comments",((javax.xml.ws.Holder)h_comments).value);
        getHashMapReturnValues().put("reason_code",((javax.xml.ws.Holder)h_reason_code).value);
        getHashMapReturnValues().put("secondary_reason_code",((javax.xml.ws.Holder)h_secondary_reason_code).value);
        getHashMapReturnValues().put("dispute_ind",((javax.xml.ws.Holder)h_dispute_ind).value);
        getHashMapReturnValues().put("can_unsettle",((javax.xml.ws.Holder)h_can_unsettle).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createWriteoffOrDispute(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long invoice_no = (Long) map.get("invoice_no");
                Double amount = (Double) map.get("amount");
                Long reason_code = (Long) map.get("reason_code");
                String comments = (String) map.get("comments");
                Long do_dispute = (Long) map.get("do_dispute");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return createWriteoffOrDispute(client_no, auth_key, acct_no, invoice_no, amount, reason_code, comments, do_dispute, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctWriteoffOrDisputes(Long client_no, String auth_key, Long acct_no, Long dispute_or_writeoff_flag, Long details_flag){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_write_off_info = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctWriteoffOrDisputes(client_no, auth_key, acct_no, dispute_or_writeoff_flag, details_flag, h_error_code, h_error_msg, h_write_off_info);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("write_off_info",((javax.xml.ws.Holder)h_write_off_info).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctWriteoffOrDisputes(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long dispute_or_writeoff_flag = (Long) map.get("dispute_or_writeoff_flag");
                Long details_flag = (Long) map.get("details_flag");
                
        return getAcctWriteoffOrDisputes(client_no, auth_key, acct_no, dispute_or_writeoff_flag, details_flag);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getInvoicesToWriteoffOrDispute(Long client_no, String auth_key, Long acct_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_details = new javax.xml.ws.Holder();

        
        getCompletePort().getInvoicesToWriteoffOrDispute(client_no, auth_key, acct_no, h_error_code, h_error_msg, h_invoice_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("invoice_details",((javax.xml.ws.Holder)h_invoice_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getInvoicesToWriteoffOrDispute(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                
        return getInvoicesToWriteoffOrDispute(client_no, auth_key, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> settleDisputeHold(Long client_no, String auth_key, Long acct_no, Long dispute_no, Long settlement_action, String comments, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_rec_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_created_by = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_amt = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_dispute_creation_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_dispute_exp_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_comments = new javax.xml.ws.Holder(comments);
        javax.xml.ws.Holder h_reason_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_secondary_reason_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_dispute_ind = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_can_unsettle = new javax.xml.ws.Holder();

        
        getCompletePort().settleDisputeHold(client_no, auth_key, acct_no, dispute_no, settlement_action, h_comments, client_receipt_id, h_error_code, h_error_msg, h_rec_no, h_created_by, h_amount, h_invoice_no, h_invoice_date, h_invoice_amt, h_dispute_creation_date, h_dispute_exp_date, h_reason_code, h_secondary_reason_code, h_dispute_ind, h_can_unsettle);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("rec_no",((javax.xml.ws.Holder)h_rec_no).value);
        getHashMapReturnValues().put("created_by",((javax.xml.ws.Holder)h_created_by).value);
        getHashMapReturnValues().put("amount",((javax.xml.ws.Holder)h_amount).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("invoice_date",((javax.xml.ws.Holder)h_invoice_date).value);
        getHashMapReturnValues().put("invoice_amt",((javax.xml.ws.Holder)h_invoice_amt).value);
        getHashMapReturnValues().put("dispute_creation_date",((javax.xml.ws.Holder)h_dispute_creation_date).value);
        getHashMapReturnValues().put("dispute_exp_date",((javax.xml.ws.Holder)h_dispute_exp_date).value);
        getHashMapReturnValues().put("comments",((javax.xml.ws.Holder)h_comments).value);
        getHashMapReturnValues().put("reason_code",((javax.xml.ws.Holder)h_reason_code).value);
        getHashMapReturnValues().put("secondary_reason_code",((javax.xml.ws.Holder)h_secondary_reason_code).value);
        getHashMapReturnValues().put("dispute_ind",((javax.xml.ws.Holder)h_dispute_ind).value);
        getHashMapReturnValues().put("can_unsettle",((javax.xml.ws.Holder)h_can_unsettle).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> settleDisputeHold(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long dispute_no = (Long) map.get("dispute_no");
                Long settlement_action = (Long) map.get("settlement_action");
                String comments = (String) map.get("comments");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return settleDisputeHold(client_no, auth_key, acct_no, dispute_no, settlement_action, comments, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelRecurringCredits(Long client_no, String auth_key, Long acct_no, String userid, String client_acct_id, com.aria.common.shared.RecurringCreditNoArray recurring_credit_no, String cancel_comments){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_codes = new javax.xml.ws.Holder();

        
        getCompletePort().cancelRecurringCredits(client_no, auth_key, acct_no, userid, client_acct_id, recurring_credit_no, cancel_comments, h_error_code, h_error_msg, h_error_codes);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("error_codes",((javax.xml.ws.Holder)h_error_codes).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelRecurringCredits(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String userid = (String) map.get("userid");
                String client_acct_id = (String) map.get("client_acct_id");
                com.aria.common.shared.RecurringCreditNoArray recurring_credit_no = (com.aria.common.shared.RecurringCreditNoArray) map.get("recurring_credit_no");
                String cancel_comments = (String) map.get("cancel_comments");
                
        return cancelRecurringCredits(client_no, auth_key, acct_no, userid, client_acct_id, recurring_credit_no, cancel_comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateOrder(Long client_no, String auth_key, Long account_no, Long order_no, Long bill_immediately, Long alt_pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_routing_num, String bank_acct_num, String bill_company_name, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_address1, String bill_address2, String bill_city, String bill_locality, String bill_state_prov, String bill_zip, String bill_country, String bill_email, String bill_phone, String bill_work_phone, String bill_work_phone_extension, String cvv, String bill_address3, String do_write, String alt_client_acct_group_id, String track_data1, String track_data2, Long alt_inv_template_no, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd, String fulfilled_date){
        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoicing_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoicing_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cart_invoice_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().updateOrder(client_no, auth_key, account_no, order_no, bill_immediately, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_work_phone, bill_work_phone_extension, cvv, bill_address3, do_write, alt_client_acct_group_id, track_data1, track_data2, alt_inv_template_no, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, fulfilled_date, h_transaction_id, h_invoicing_error_code, h_invoicing_error_msg, h_statement_error_cd, h_statement_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_invoice_no, h_error_code, h_error_msg, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_cart_invoice_line_items, h_third_party_errors);

        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("invoicing_error_code",((javax.xml.ws.Holder)h_invoicing_error_code).value);
        getHashMapReturnValues().put("invoicing_error_msg",((javax.xml.ws.Holder)h_invoicing_error_msg).value);
        getHashMapReturnValues().put("statement_error_cd",((javax.xml.ws.Holder)h_statement_error_cd).value);
        getHashMapReturnValues().put("statement_error_msg",((javax.xml.ws.Holder)h_statement_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("cart_invoice_line_items",((javax.xml.ws.Holder)h_cart_invoice_line_items).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateOrder(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long order_no = (Long) map.get("order_no");
                Long bill_immediately = (Long) map.get("bill_immediately");
                Long alt_pay_method = (Long) map.get("alt_pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_zip = (String) map.get("bill_zip");
                String bill_country = (String) map.get("bill_country");
                String bill_email = (String) map.get("bill_email");
                String bill_phone = (String) map.get("bill_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_extension = (String) map.get("bill_work_phone_extension");
                String cvv = (String) map.get("cvv");
                String bill_address3 = (String) map.get("bill_address3");
                String do_write = (String) map.get("do_write");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                Long alt_inv_template_no = (Long) map.get("alt_inv_template_no");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                String fulfilled_date = (String) map.get("fulfilled_date");
                
        return updateOrder(client_no, auth_key, account_no, order_no, bill_immediately, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_work_phone, bill_work_phone_extension, cvv, bill_address3, do_write, alt_client_acct_group_id, track_data1, track_data2, alt_inv_template_no, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, fulfilled_date);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> updateAcctInvoice(Long client_no, String auth_key, Long account_no, Long src_transaction_id, String custom_status_label, String client_notes, Long posting_status_cd, String posting_user){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().updateAcctInvoice(client_no, auth_key, account_no, src_transaction_id, custom_status_label, client_notes, posting_status_cd, posting_user, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> updateAcctInvoice(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long account_no = (Long) map.get("account_no");
                Long src_transaction_id = (Long) map.get("src_transaction_id");
                String custom_status_label = (String) map.get("custom_status_label");
                String client_notes = (String) map.get("client_notes");
                Long posting_status_cd = (Long) map.get("posting_status_cd");
                String posting_user = (String) map.get("posting_user");
                
        return updateAcctInvoice(client_no, auth_key, account_no, src_transaction_id, custom_status_label, client_notes, posting_status_cd, posting_user);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createOrderM(Long client_no, String auth_key, Long acct_no, String client_acct_id, String client_plan_instance_id, Long plan_instance_no, com.aria.common.shared.OrderLineItemsArray order_line_items, Long bill_immediately, Long bill_seq, String client_order_id, String client_receipt_id, Long alt_pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_routing_num, String bank_acct_num, String bill_company_name, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_address1, String bill_address2, String bill_city, String bill_locality, String bill_state_prov, String bill_zip, String bill_country, String bill_email, String bill_phone, String bill_phone_extension, String bill_cell_phone, String bill_work_phone, String bill_work_phone_extension, String cvv, String bank_acct_type, String bill_address3, String do_write, String coupon_cd, String alt_client_acct_group_id, String track_data1, String track_data2, Long alt_inv_template_no, String client_alt_inv_template_id, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd, String statement_message, String fulfilled_date, String order_comments){
        javax.xml.ws.Holder h_order_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoicing_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoicing_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cart_invoice_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().createOrderM(client_no, auth_key, acct_no, client_acct_id, client_plan_instance_id, plan_instance_no, order_line_items, bill_immediately, bill_seq, client_order_id, client_receipt_id, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, bank_acct_type, bill_address3, do_write, coupon_cd, alt_client_acct_group_id, track_data1, track_data2, alt_inv_template_no, client_alt_inv_template_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, statement_message, fulfilled_date, order_comments, h_order_no, h_transaction_id, h_invoicing_error_code, h_invoicing_error_msg, h_statement_error_cd, h_statement_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_invoice_no, h_error_code, h_error_msg, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_cart_invoice_line_items, h_third_party_errors);

        getHashMapReturnValues().put("order_no",((javax.xml.ws.Holder)h_order_no).value);
        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("invoicing_error_code",((javax.xml.ws.Holder)h_invoicing_error_code).value);
        getHashMapReturnValues().put("invoicing_error_msg",((javax.xml.ws.Holder)h_invoicing_error_msg).value);
        getHashMapReturnValues().put("statement_error_cd",((javax.xml.ws.Holder)h_statement_error_cd).value);
        getHashMapReturnValues().put("statement_error_msg",((javax.xml.ws.Holder)h_statement_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("cart_invoice_line_items",((javax.xml.ws.Holder)h_cart_invoice_line_items).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createOrderM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                com.aria.common.shared.OrderLineItemsArray order_line_items = (com.aria.common.shared.OrderLineItemsArray) map.get("order_line_items");
                Long bill_immediately = (Long) map.get("bill_immediately");
                Long bill_seq = (Long) map.get("bill_seq");
                String client_order_id = (String) map.get("client_order_id");
                String client_receipt_id = (String) map.get("client_receipt_id");
                Long alt_pay_method = (Long) map.get("alt_pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_zip = (String) map.get("bill_zip");
                String bill_country = (String) map.get("bill_country");
                String bill_email = (String) map.get("bill_email");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_extension = (String) map.get("bill_phone_extension");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_extension = (String) map.get("bill_work_phone_extension");
                String cvv = (String) map.get("cvv");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String bill_address3 = (String) map.get("bill_address3");
                String do_write = (String) map.get("do_write");
                String coupon_cd = (String) map.get("coupon_cd");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                Long alt_inv_template_no = (Long) map.get("alt_inv_template_no");
                String client_alt_inv_template_id = (String) map.get("client_alt_inv_template_id");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                String statement_message = (String) map.get("statement_message");
                String fulfilled_date = (String) map.get("fulfilled_date");
                String order_comments = (String) map.get("order_comments");
                
        return createOrderM(client_no, auth_key, acct_no, client_acct_id, client_plan_instance_id, plan_instance_no, order_line_items, bill_immediately, bill_seq, client_order_id, client_receipt_id, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, bank_acct_type, bill_address3, do_write, coupon_cd, alt_client_acct_group_id, track_data1, track_data2, alt_inv_template_no, client_alt_inv_template_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, statement_message, fulfilled_date, order_comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getInvoiceDetailsM(Long client_no, String auth_key, Long invoice_no, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_line_details = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_is_pending_ind = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_custom_status_label = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_custom_status_desc = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_notes = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_type_cd = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_from_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_to_date = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_group_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_billing_group_no = new javax.xml.ws.Holder();

        
        getCompletePort().getInvoiceDetailsM(client_no, auth_key, invoice_no, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, h_error_code, h_error_msg, h_invoice_line_details, h_is_pending_ind, h_custom_status_label, h_custom_status_desc, h_client_notes, h_invoice_type_cd, h_from_date, h_to_date, h_billing_group_no, h_client_billing_group_no);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("invoice_line_details",((javax.xml.ws.Holder)h_invoice_line_details).value);
        getHashMapReturnValues().put("is_pending_ind",((javax.xml.ws.Holder)h_is_pending_ind).value);
        getHashMapReturnValues().put("custom_status_label",((javax.xml.ws.Holder)h_custom_status_label).value);
        getHashMapReturnValues().put("custom_status_desc",((javax.xml.ws.Holder)h_custom_status_desc).value);
        getHashMapReturnValues().put("client_notes",((javax.xml.ws.Holder)h_client_notes).value);
        getHashMapReturnValues().put("invoice_type_cd",((javax.xml.ws.Holder)h_invoice_type_cd).value);
        getHashMapReturnValues().put("from_date",((javax.xml.ws.Holder)h_from_date).value);
        getHashMapReturnValues().put("to_date",((javax.xml.ws.Holder)h_to_date).value);
        getHashMapReturnValues().put("billing_group_no",((javax.xml.ws.Holder)h_billing_group_no).value);
        getHashMapReturnValues().put("client_billing_group_no",((javax.xml.ws.Holder)h_client_billing_group_no).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getInvoiceDetailsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long invoice_no = (Long) map.get("invoice_no");
                Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                
        return getInvoiceDetailsM(client_no, auth_key, invoice_no, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getInvNoFromBalXferM(Long client_no, String auth_key, Long transaction_id, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_outacct_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_outclient_acct_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_billing_group_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_client_billing_group_id = new javax.xml.ws.Holder();

        
        getCompletePort().getInvNoFromBalXferM(client_no, auth_key, transaction_id, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, h_error_code, h_error_msg, h_invoice_no, h_outacct_no, h_outclient_acct_id, h_billing_group_no, h_client_billing_group_id);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("outacct_no",((javax.xml.ws.Holder)h_outacct_no).value);
        getHashMapReturnValues().put("outclient_acct_id",((javax.xml.ws.Holder)h_outclient_acct_id).value);
        getHashMapReturnValues().put("billing_group_no",((javax.xml.ws.Holder)h_billing_group_no).value);
        getHashMapReturnValues().put("client_billing_group_id",((javax.xml.ws.Holder)h_client_billing_group_id).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getInvNoFromBalXferM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long transaction_id = (Long) map.get("transaction_id");
                Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                
        return getInvNoFromBalXferM(client_no, auth_key, transaction_id, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getRefundablePaymentsM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_refundable_payments = new javax.xml.ws.Holder();

        
        getCompletePort().getRefundablePaymentsM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, h_error_code, h_error_msg, h_refundable_payments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("refundable_payments",((javax.xml.ws.Holder)h_refundable_payments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getRefundablePaymentsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                
        return getRefundablePaymentsM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> applyServiceCreditM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Double credit_amount, Long credit_reason_code, Long master_plan_instance_no, String client_master_plan_instance_id, String comments){
        javax.xml.ws.Holder h_credit_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().applyServiceCreditM(client_no, auth_key, acct_no, client_acct_id, credit_amount, credit_reason_code, master_plan_instance_no, client_master_plan_instance_id, comments, h_credit_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("credit_id",((javax.xml.ws.Holder)h_credit_id).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> applyServiceCreditM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Double credit_amount = (Double) map.get("credit_amount");
                Long credit_reason_code = (Long) map.get("credit_reason_code");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                String comments = (String) map.get("comments");
                
        return applyServiceCreditM(client_no, auth_key, acct_no, client_acct_id, credit_amount, credit_reason_code, master_plan_instance_no, client_master_plan_instance_id, comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> cancelRecurringCreditsM(Long client_no, String auth_key, Long acct_no, String userid, String client_acct_id, com.aria.common.shared.RecurringCreditNoArray recurring_credit_no, Long master_plan_instance_no, String client_master_plan_instance_id, String cancel_comments){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_codes = new javax.xml.ws.Holder();

        
        getCompletePort().cancelRecurringCreditsM(client_no, auth_key, acct_no, userid, client_acct_id, recurring_credit_no, master_plan_instance_no, client_master_plan_instance_id, cancel_comments, h_error_code, h_error_msg, h_error_codes);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("error_codes",((javax.xml.ws.Holder)h_error_codes).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> cancelRecurringCreditsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String userid = (String) map.get("userid");
                String client_acct_id = (String) map.get("client_acct_id");
                com.aria.common.shared.RecurringCreditNoArray recurring_credit_no = (com.aria.common.shared.RecurringCreditNoArray) map.get("recurring_credit_no");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                String cancel_comments = (String) map.get("cancel_comments");
                
        return cancelRecurringCreditsM(client_no, auth_key, acct_no, userid, client_acct_id, recurring_credit_no, master_plan_instance_no, client_master_plan_instance_id, cancel_comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getInvoicesToWriteoffOrDisputeM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_details = new javax.xml.ws.Holder();

        
        getCompletePort().getInvoicesToWriteoffOrDisputeM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, h_error_code, h_error_msg, h_invoice_details);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("invoice_details",((javax.xml.ws.Holder)h_invoice_details).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getInvoicesToWriteoffOrDisputeM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                
        return getInvoicesToWriteoffOrDisputeM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getOrderM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long order_no, String client_order_id, Long limit_records, Long details_flag){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_orders = new javax.xml.ws.Holder();

        
        getCompletePort().getOrderM(client_no, auth_key, acct_no, client_acct_id, order_no, client_order_id, limit_records, details_flag, h_error_code, h_error_msg, h_orders);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("orders",((javax.xml.ws.Holder)h_orders).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getOrderM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long order_no = (Long) map.get("order_no");
                String client_order_id = (String) map.get("client_order_id");
                Long limit_records = (Long) map.get("limit_records");
                Long details_flag = (Long) map.get("details_flag");
                
        return getOrderM(client_no, auth_key, acct_no, client_acct_id, order_no, client_order_id, limit_records, details_flag);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getWriteoffDetailsM(Long client_no, String auth_key, Long writeoff_transaction_id, Long acct_no, String client_acct_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_writeoff_detail = new javax.xml.ws.Holder();

        
        getCompletePort().getWriteoffDetailsM(client_no, auth_key, writeoff_transaction_id, acct_no, client_acct_id, h_error_code, h_error_msg, h_writeoff_detail);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("writeoff_detail",((javax.xml.ws.Holder)h_writeoff_detail).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getWriteoffDetailsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long writeoff_transaction_id = (Long) map.get("writeoff_transaction_id");
                Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                
        return getWriteoffDetailsM(client_no, auth_key, writeoff_transaction_id, acct_no, client_acct_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctWriteoffOrDisputesM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, Long dispute_or_writeoff_flag, Long details_flag){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_writeoff_dispute_info = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctWriteoffOrDisputesM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, dispute_or_writeoff_flag, details_flag, h_error_code, h_error_msg, h_writeoff_dispute_info);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("writeoff_dispute_info",((javax.xml.ws.Holder)h_writeoff_dispute_info).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctWriteoffOrDisputesM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                Long dispute_or_writeoff_flag = (Long) map.get("dispute_or_writeoff_flag");
                Long details_flag = (Long) map.get("details_flag");
                
        return getAcctWriteoffOrDisputesM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, dispute_or_writeoff_flag, details_flag);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getReversibleInvsByPaymentM(Long client_no, String auth_key, Long acct_no, Long payment_transaction_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_reversible_inv_trans = new javax.xml.ws.Holder();

        
        getCompletePort().getReversibleInvsByPaymentM(client_no, auth_key, acct_no, payment_transaction_id, h_error_code, h_error_msg, h_reversible_inv_trans);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("reversible_inv_trans",((javax.xml.ws.Holder)h_reversible_inv_trans).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getReversibleInvsByPaymentM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Long payment_transaction_id = (Long) map.get("payment_transaction_id");
                
        return getReversibleInvsByPaymentM(client_no, auth_key, acct_no, payment_transaction_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> issueRefundToAcctM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long payment_transaction_id, Long reason_code, Double total_refund_amount, String refund_check_number, String comments, String do_write, String auto_calc_refund, com.aria.common.shared.InvoiceTransToReverseArray invoice_trans_to_reverse, String client_receipt_id, String is_unlinked_refund){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_applied_total_refund_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_applied_total_reversal_amount = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_reversed_invoice_transactions = new javax.xml.ws.Holder();

        
        getCompletePort().issueRefundToAcctM(client_no, auth_key, acct_no, client_acct_id, payment_transaction_id, reason_code, total_refund_amount, refund_check_number, comments, do_write, auto_calc_refund, invoice_trans_to_reverse, client_receipt_id, is_unlinked_refund, h_error_code, h_error_msg, h_applied_total_refund_amount, h_applied_total_reversal_amount, h_out_transaction_id, h_reversed_invoice_transactions);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("applied_total_refund_amount",((javax.xml.ws.Holder)h_applied_total_refund_amount).value);
        getHashMapReturnValues().put("applied_total_reversal_amount",((javax.xml.ws.Holder)h_applied_total_reversal_amount).value);
        getHashMapReturnValues().put("out_transaction_id",((javax.xml.ws.Holder)h_out_transaction_id).value);
        getHashMapReturnValues().put("reversed_invoice_transactions",((javax.xml.ws.Holder)h_reversed_invoice_transactions).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> issueRefundToAcctM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long payment_transaction_id = (Long) map.get("payment_transaction_id");
                Long reason_code = (Long) map.get("reason_code");
                Double total_refund_amount = (Double) map.get("total_refund_amount");
                String refund_check_number = (String) map.get("refund_check_number");
                String comments = (String) map.get("comments");
                String do_write = (String) map.get("do_write");
                String auto_calc_refund = (String) map.get("auto_calc_refund");
                com.aria.common.shared.InvoiceTransToReverseArray invoice_trans_to_reverse = (com.aria.common.shared.InvoiceTransToReverseArray) map.get("invoice_trans_to_reverse");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String is_unlinked_refund = (String) map.get("is_unlinked_refund");
                
        return issueRefundToAcctM(client_no, auth_key, acct_no, client_acct_id, payment_transaction_id, reason_code, total_refund_amount, refund_check_number, comments, do_write, auto_calc_refund, invoice_trans_to_reverse, client_receipt_id, is_unlinked_refund);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> voidInvoiceM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long invoice_no, Long reason_code, String client_receipt_id, String comments){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_void_transactions = new javax.xml.ws.Holder();

        
        getCompletePort().voidInvoiceM(client_no, auth_key, acct_no, client_acct_id, invoice_no, reason_code, client_receipt_id, comments, h_error_code, h_error_msg, h_void_transactions);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("void_transactions",((javax.xml.ws.Holder)h_void_transactions).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> voidInvoiceM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long invoice_no = (Long) map.get("invoice_no");
                Long reason_code = (Long) map.get("reason_code");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String comments = (String) map.get("comments");
                
        return voidInvoiceM(client_no, auth_key, acct_no, client_acct_id, invoice_no, reason_code, client_receipt_id, comments);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createWriteoffOrDisputeM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long invoice_no, Long reason_code, String comments, String writeoff_date, Long do_dispute, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_writeoff_transactions = new javax.xml.ws.Holder();

        
        getCompletePort().createWriteoffOrDisputeM(client_no, auth_key, acct_no, client_acct_id, invoice_no, reason_code, comments, writeoff_date, do_dispute, client_receipt_id, h_error_code, h_error_msg, h_writeoff_transactions);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("writeoff_transactions",((javax.xml.ws.Holder)h_writeoff_transactions).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createWriteoffOrDisputeM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long invoice_no = (Long) map.get("invoice_no");
                Long reason_code = (Long) map.get("reason_code");
                String comments = (String) map.get("comments");
                String writeoff_date = (String) map.get("writeoff_date");
                Long do_dispute = (Long) map.get("do_dispute");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return createWriteoffOrDisputeM(client_no, auth_key, acct_no, client_acct_id, invoice_no, reason_code, comments, writeoff_date, do_dispute, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> settleAccountBalanceM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, Long payment_method_no, String client_payment_method_id, Long alt_pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_routing_num, String bank_acct_num, String bill_company_name, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_address1, String bill_address2, String bill_city, String bill_locality, String bill_state_prov, String bill_zip, String bill_country, String bill_email, String bill_phone, String bill_phone_extension, String bill_cell_phone, String bill_work_phone, String bill_work_phone_extension, String cvv, String bank_acct_type, String bill_address3, String alt_client_acct_group_id, String track_data1, String track_data2, String force_balance_scope, String client_receipt_id, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd){
        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().settleAccountBalanceM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, payment_method_no, client_payment_method_id, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, bank_acct_type, bill_address3, alt_client_acct_group_id, track_data1, track_data2, force_balance_scope, client_receipt_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, h_transaction_id, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_error_code, h_error_msg);

        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> settleAccountBalanceM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                Long payment_method_no = (Long) map.get("payment_method_no");
                String client_payment_method_id = (String) map.get("client_payment_method_id");
                Long alt_pay_method = (Long) map.get("alt_pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_zip = (String) map.get("bill_zip");
                String bill_country = (String) map.get("bill_country");
                String bill_email = (String) map.get("bill_email");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_extension = (String) map.get("bill_phone_extension");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_extension = (String) map.get("bill_work_phone_extension");
                String cvv = (String) map.get("cvv");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String bill_address3 = (String) map.get("bill_address3");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                String force_balance_scope = (String) map.get("force_balance_scope");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                
        return settleAccountBalanceM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, payment_method_no, client_payment_method_id, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, bank_acct_type, bill_address3, alt_client_acct_group_id, track_data1, track_data2, force_balance_scope, client_receipt_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> collectFromAccountM(Long client_no, String auth_key, Long acct_no, Double amount_to_collect, Long payment_method_no, String client_payment_method_id, String client_receipt_id, com.aria.common.shared.SpecificChargeTransactionIdArray specific_charge_transaction_id, Long alt_pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_routing_num, String bank_acct_num, String bill_company_name, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_address1, String bill_address2, String bill_city, String bill_locality, String bill_state_prov, String bill_zip, String bill_country, String bill_email, String bill_phone, String bill_phone_extension, String bill_cell_phone, String bill_work_phone, String bill_work_phone_extension, String cvv, String bank_acct_type, String bill_address3, String alt_client_acct_group_id, String track_data1, String track_data2, Long payment_application_method, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd){
        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().collectFromAccountM(client_no, auth_key, acct_no, amount_to_collect, payment_method_no, client_payment_method_id, client_receipt_id, specific_charge_transaction_id, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, bank_acct_type, bill_address3, alt_client_acct_group_id, track_data1, track_data2, payment_application_method, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, h_transaction_id, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_error_code, h_error_msg);

        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> collectFromAccountM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                Double amount_to_collect = (Double) map.get("amount_to_collect");
                Long payment_method_no = (Long) map.get("payment_method_no");
                String client_payment_method_id = (String) map.get("client_payment_method_id");
                String client_receipt_id = (String) map.get("client_receipt_id");
                com.aria.common.shared.SpecificChargeTransactionIdArray specific_charge_transaction_id = (com.aria.common.shared.SpecificChargeTransactionIdArray) map.get("specific_charge_transaction_id");
                Long alt_pay_method = (Long) map.get("alt_pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_zip = (String) map.get("bill_zip");
                String bill_country = (String) map.get("bill_country");
                String bill_email = (String) map.get("bill_email");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_extension = (String) map.get("bill_phone_extension");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_extension = (String) map.get("bill_work_phone_extension");
                String cvv = (String) map.get("cvv");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String bill_address3 = (String) map.get("bill_address3");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                Long payment_application_method = (Long) map.get("payment_application_method");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                
        return collectFromAccountM(client_no, auth_key, acct_no, amount_to_collect, payment_method_no, client_payment_method_id, client_receipt_id, specific_charge_transaction_id, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, bank_acct_type, bill_address3, alt_client_acct_group_id, track_data1, track_data2, payment_application_method, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getAcctPaymentHistoryM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, String start_date, String end_date, Long limit_records, Long details_flag){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_payment_history = new javax.xml.ws.Holder();

        
        getCompletePort().getAcctPaymentHistoryM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, start_date, end_date, limit_records, details_flag, h_error_code, h_error_msg, h_payment_history);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("payment_history",((javax.xml.ws.Holder)h_payment_history).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getAcctPaymentHistoryM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                String start_date = (String) map.get("start_date");
                String end_date = (String) map.get("end_date");
                Long limit_records = (Long) map.get("limit_records");
                Long details_flag = (Long) map.get("details_flag");
                
        return getAcctPaymentHistoryM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, start_date, end_date, limit_records, details_flag);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getPaymentsOnInvoiceM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long invoice_no){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_payments = new javax.xml.ws.Holder();

        
        getCompletePort().getPaymentsOnInvoiceM(client_no, auth_key, acct_no, client_acct_id, invoice_no, h_error_code, h_error_msg, h_invoice_payments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("invoice_payments",((javax.xml.ws.Holder)h_invoice_payments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getPaymentsOnInvoiceM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long invoice_no = (Long) map.get("invoice_no");
                
        return getPaymentsOnInvoiceM(client_no, auth_key, acct_no, client_acct_id, invoice_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> getUnappliedCreditsPaymentsM(Long client_no, String auth_key, Long acct_no, String client_acct_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_unapplied_payments = new javax.xml.ws.Holder();

        
        getCompletePort().getUnappliedCreditsPaymentsM(client_no, auth_key, acct_no, client_acct_id, h_error_code, h_error_msg, h_unapplied_payments);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("unapplied_payments",((javax.xml.ws.Holder)h_unapplied_payments).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> getUnappliedCreditsPaymentsM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                
        return getUnappliedCreditsPaymentsM(client_no, auth_key, acct_no, client_acct_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> recordUsageM(Long client_no, String auth_key, Double usage_units, Long acct_no, String userid, Long master_plan_instance_no, String client_master_plan_instance_id, Long plan_instance_no, Long usage_type, String usage_date, Double billable_units, Double amt, Double rate, String telco_from, String telco_to, String comments, String exclude_from_billing, String exclusion_comments, String qualifier_1, String qualifier_2, String qualifier_3, String qualifier_4, Long parent_usage_rec_no, String usage_type_code, String client_record_id, String caller_id, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_usage_rec_no = new javax.xml.ws.Holder();

        
        getCompletePort().recordUsageM(client_no, auth_key, usage_units, acct_no, userid, master_plan_instance_no, client_master_plan_instance_id, plan_instance_no, usage_type, usage_date, billable_units, amt, rate, telco_from, telco_to, comments, exclude_from_billing, exclusion_comments, qualifier_1, qualifier_2, qualifier_3, qualifier_4, parent_usage_rec_no, usage_type_code, client_record_id, caller_id, client_receipt_id, h_error_code, h_error_msg, h_usage_rec_no);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("usage_rec_no",((javax.xml.ws.Holder)h_usage_rec_no).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> recordUsageM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Double usage_units = (Double) map.get("usage_units");
                Long acct_no = (Long) map.get("acct_no");
                String userid = (String) map.get("userid");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                Long plan_instance_no = (Long) map.get("plan_instance_no");
                Long usage_type = (Long) map.get("usage_type");
                String usage_date = (String) map.get("usage_date");
                Double billable_units = (Double) map.get("billable_units");
                Double amt = (Double) map.get("amt");
                Double rate = (Double) map.get("rate");
                String telco_from = (String) map.get("telco_from");
                String telco_to = (String) map.get("telco_to");
                String comments = (String) map.get("comments");
                String exclude_from_billing = (String) map.get("exclude_from_billing");
                String exclusion_comments = (String) map.get("exclusion_comments");
                String qualifier_1 = (String) map.get("qualifier_1");
                String qualifier_2 = (String) map.get("qualifier_2");
                String qualifier_3 = (String) map.get("qualifier_3");
                String qualifier_4 = (String) map.get("qualifier_4");
                Long parent_usage_rec_no = (Long) map.get("parent_usage_rec_no");
                String usage_type_code = (String) map.get("usage_type_code");
                String client_record_id = (String) map.get("client_record_id");
                String caller_id = (String) map.get("caller_id");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return recordUsageM(client_no, auth_key, usage_units, acct_no, userid, master_plan_instance_no, client_master_plan_instance_id, plan_instance_no, usage_type, usage_date, billable_units, amt, rate, telco_from, telco_to, comments, exclude_from_billing, exclusion_comments, qualifier_1, qualifier_2, qualifier_3, qualifier_4, parent_usage_rec_no, usage_type_code, client_record_id, caller_id, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> bulkRecordUsageM(Long client_no, String auth_key, com.aria.common.shared.UsageRecsArray usage_recs, String client_receipt_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_records = new javax.xml.ws.Holder();

        
        getCompletePort().bulkRecordUsageM(client_no, auth_key, usage_recs, client_receipt_id, h_error_code, h_error_msg, h_error_records);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("error_records",((javax.xml.ws.Holder)h_error_records).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> bulkRecordUsageM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        com.aria.common.shared.UsageRecsArray usage_recs = (com.aria.common.shared.UsageRecsArray) map.get("usage_recs");
                String client_receipt_id = (String) map.get("client_receipt_id");
                
        return bulkRecordUsageM(client_no, auth_key, usage_recs, client_receipt_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> genInvoiceM(Long client_no, String auth_key, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, Long billing_group_no, String client_billing_group_id, String force_pending, String client_receipt_id, Long alt_bill_day, Long invoice_mode){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_acct_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_client_acct_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_billing_group_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_client_billing_group_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().genInvoiceM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, billing_group_no, client_billing_group_id, force_pending, client_receipt_id, alt_bill_day, invoice_mode, h_error_code, h_error_msg, h_invoice_no, h_out_acct_no, h_out_client_acct_id, h_out_billing_group_no, h_out_client_billing_group_id, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("out_acct_no",((javax.xml.ws.Holder)h_out_acct_no).value);
        getHashMapReturnValues().put("out_client_acct_id",((javax.xml.ws.Holder)h_out_client_acct_id).value);
        getHashMapReturnValues().put("out_billing_group_no",((javax.xml.ws.Holder)h_out_billing_group_no).value);
        getHashMapReturnValues().put("out_client_billing_group_id",((javax.xml.ws.Holder)h_out_client_billing_group_id).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> genInvoiceM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                Long billing_group_no = (Long) map.get("billing_group_no");
                String client_billing_group_id = (String) map.get("client_billing_group_id");
                String force_pending = (String) map.get("force_pending");
                String client_receipt_id = (String) map.get("client_receipt_id");
                Long alt_bill_day = (Long) map.get("alt_bill_day");
                Long invoice_mode = (Long) map.get("invoice_mode");
                
        return genInvoiceM(client_no, auth_key, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, billing_group_no, client_billing_group_id, force_pending, client_receipt_id, alt_bill_day, invoice_mode);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> managePendingInvoiceM(Long client_no, String auth_key, Long invoice_no, Long acct_no, String client_acct_id, Long master_plan_instance_no, String client_master_plan_instance_id, Long action_directive, Long bill_seq, Long alt_pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String bank_routing_num, String bank_acct_num, String bill_company_name, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_address1, String bill_address2, String bill_city, String bill_locality, String bill_state_prov, String bill_zip, String bill_country, String bill_email, String bill_phone, String bill_phone_extension, String bill_cell_phone, String bill_work_phone, String bill_work_phone_extension, String cvv, String alt_collect_on_approve, String alt_send_statement_on_approve, String cancel_orders_on_discard, String bank_acct_type, String bill_address3, String track_data1, String track_data2, String client_receipt_id, String iban, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String mandate_id, String bank_id_cd, String bank_branch_cd, String custom_status_label, String client_notes){
        javax.xml.ws.Holder h_new_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_acct_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_client_acct_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_billing_group_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_out_client_billing_group_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_collection_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().managePendingInvoiceM(client_no, auth_key, invoice_no, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, action_directive, bill_seq, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, alt_collect_on_approve, alt_send_statement_on_approve, cancel_orders_on_discard, bank_acct_type, bill_address3, track_data1, track_data2, client_receipt_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, custom_status_label, client_notes, h_new_invoice_no, h_out_acct_no, h_out_client_acct_id, h_out_billing_group_no, h_out_client_billing_group_id, h_collection_error_code, h_collection_error_msg, h_statement_error_code, h_statement_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_error_code, h_error_msg);

        getHashMapReturnValues().put("new_invoice_no",((javax.xml.ws.Holder)h_new_invoice_no).value);
        getHashMapReturnValues().put("out_acct_no",((javax.xml.ws.Holder)h_out_acct_no).value);
        getHashMapReturnValues().put("out_client_acct_id",((javax.xml.ws.Holder)h_out_client_acct_id).value);
        getHashMapReturnValues().put("out_billing_group_no",((javax.xml.ws.Holder)h_out_billing_group_no).value);
        getHashMapReturnValues().put("out_client_billing_group_id",((javax.xml.ws.Holder)h_out_client_billing_group_id).value);
        getHashMapReturnValues().put("collection_error_code",((javax.xml.ws.Holder)h_collection_error_code).value);
        getHashMapReturnValues().put("collection_error_msg",((javax.xml.ws.Holder)h_collection_error_msg).value);
        getHashMapReturnValues().put("statement_error_code",((javax.xml.ws.Holder)h_statement_error_code).value);
        getHashMapReturnValues().put("statement_error_msg",((javax.xml.ws.Holder)h_statement_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> managePendingInvoiceM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long invoice_no = (Long) map.get("invoice_no");
                Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                Long master_plan_instance_no = (Long) map.get("master_plan_instance_no");
                String client_master_plan_instance_id = (String) map.get("client_master_plan_instance_id");
                Long action_directive = (Long) map.get("action_directive");
                Long bill_seq = (Long) map.get("bill_seq");
                Long alt_pay_method = (Long) map.get("alt_pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_zip = (String) map.get("bill_zip");
                String bill_country = (String) map.get("bill_country");
                String bill_email = (String) map.get("bill_email");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_extension = (String) map.get("bill_phone_extension");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_extension = (String) map.get("bill_work_phone_extension");
                String cvv = (String) map.get("cvv");
                String alt_collect_on_approve = (String) map.get("alt_collect_on_approve");
                String alt_send_statement_on_approve = (String) map.get("alt_send_statement_on_approve");
                String cancel_orders_on_discard = (String) map.get("cancel_orders_on_discard");
                String bank_acct_type = (String) map.get("bank_acct_type");
                String bill_address3 = (String) map.get("bill_address3");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                String client_receipt_id = (String) map.get("client_receipt_id");
                String iban = (String) map.get("iban");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String mandate_id = (String) map.get("mandate_id");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                String custom_status_label = (String) map.get("custom_status_label");
                String client_notes = (String) map.get("client_notes");
                
        return managePendingInvoiceM(client_no, auth_key, invoice_no, acct_no, client_acct_id, master_plan_instance_no, client_master_plan_instance_id, action_directive, bill_seq, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, bank_routing_num, bank_acct_num, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, cvv, alt_collect_on_approve, alt_send_statement_on_approve, cancel_orders_on_discard, bank_acct_type, bill_address3, track_data1, track_data2, client_receipt_id, iban, bank_check_digit, bank_swift_cd, bank_country_cd, mandate_id, bank_id_cd, bank_branch_cd, custom_status_label, client_notes);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> createOrderWithPlanM(Long client_no, String auth_key, Long acct_no, String client_acct_id, com.aria.common.shared.OrderLineItemsArray order_line_items, Long parent_plan_instance_no, String client_parent_plan_instance_id, Long supp_plan_instance_no, String client_plan_instance_id, Long supp_plan_no, String client_supp_plan_id, Long supp_plan_units, Long assignment_directive, Long bill_immediately, Long bill_seq, String client_order_id, String client_receipt_id, Long alt_pay_method, String cc_number, Long cc_expire_mm, Long cc_expire_yyyy, String cvv, String bank_routing_num, String bank_acct_num, Long bank_check_digit, String bank_swift_cd, String bank_country_cd, String bank_id_cd, String bank_branch_cd, String mandate_id, String iban, String bill_company_name, String bill_first_name, String bill_middle_initial, String bill_last_name, String bill_address1, String bill_address2, String bill_address3, String bill_city, String bill_locality, String bill_state_prov, String bill_zip, String bill_country, String bill_email, String bill_phone, String bill_phone_extension, String bill_cell_phone, String bill_work_phone, String bill_work_phone_extension, com.aria.common.shared.MultipleCouponsArray multiple_coupons, String alt_client_acct_group_id, String client_alt_inv_template_id, Long alt_inv_template_no, String statement_message, String track_data1, String track_data2, String do_write){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_order_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoice_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_transaction_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoicing_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_invoicing_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_statement_error_msg = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cvv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_avs_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_cavv_response = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_status_text = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_payment_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_auth_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_proc_merch_comments = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_before_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_tax_charges = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_charges_after_tax = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_total_credit = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_cart_inv_line_items = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_third_party_errors = new javax.xml.ws.Holder();

        
        getCompletePort().createOrderWithPlanM(client_no, auth_key, acct_no, client_acct_id, order_line_items, parent_plan_instance_no, client_parent_plan_instance_id, supp_plan_instance_no, client_plan_instance_id, supp_plan_no, client_supp_plan_id, supp_plan_units, assignment_directive, bill_immediately, bill_seq, client_order_id, client_receipt_id, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, cvv, bank_routing_num, bank_acct_num, bank_check_digit, bank_swift_cd, bank_country_cd, bank_id_cd, bank_branch_cd, mandate_id, iban, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_address3, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, multiple_coupons, alt_client_acct_group_id, client_alt_inv_template_id, alt_inv_template_no, statement_message, track_data1, track_data2, do_write, h_error_code, h_error_msg, h_order_no, h_invoice_no, h_transaction_id, h_invoicing_error_code, h_invoicing_error_msg, h_statement_error_code, h_statement_error_msg, h_proc_cvv_response, h_proc_avs_response, h_proc_cavv_response, h_proc_status_code, h_proc_status_text, h_proc_payment_id, h_proc_auth_code, h_proc_merch_comments, h_total_charges_before_tax, h_total_tax_charges, h_total_charges_after_tax, h_total_credit, h_cart_inv_line_items, h_third_party_errors);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        getHashMapReturnValues().put("order_no",((javax.xml.ws.Holder)h_order_no).value);
        getHashMapReturnValues().put("invoice_no",((javax.xml.ws.Holder)h_invoice_no).value);
        getHashMapReturnValues().put("transaction_id",((javax.xml.ws.Holder)h_transaction_id).value);
        getHashMapReturnValues().put("invoicing_error_code",((javax.xml.ws.Holder)h_invoicing_error_code).value);
        getHashMapReturnValues().put("invoicing_error_msg",((javax.xml.ws.Holder)h_invoicing_error_msg).value);
        getHashMapReturnValues().put("statement_error_code",((javax.xml.ws.Holder)h_statement_error_code).value);
        getHashMapReturnValues().put("statement_error_msg",((javax.xml.ws.Holder)h_statement_error_msg).value);
        getHashMapReturnValues().put("proc_cvv_response",((javax.xml.ws.Holder)h_proc_cvv_response).value);
        getHashMapReturnValues().put("proc_avs_response",((javax.xml.ws.Holder)h_proc_avs_response).value);
        getHashMapReturnValues().put("proc_cavv_response",((javax.xml.ws.Holder)h_proc_cavv_response).value);
        getHashMapReturnValues().put("proc_status_code",((javax.xml.ws.Holder)h_proc_status_code).value);
        getHashMapReturnValues().put("proc_status_text",((javax.xml.ws.Holder)h_proc_status_text).value);
        getHashMapReturnValues().put("proc_payment_id",((javax.xml.ws.Holder)h_proc_payment_id).value);
        getHashMapReturnValues().put("proc_auth_code",((javax.xml.ws.Holder)h_proc_auth_code).value);
        getHashMapReturnValues().put("proc_merch_comments",((javax.xml.ws.Holder)h_proc_merch_comments).value);
        getHashMapReturnValues().put("total_charges_before_tax",((javax.xml.ws.Holder)h_total_charges_before_tax).value);
        getHashMapReturnValues().put("total_tax_charges",((javax.xml.ws.Holder)h_total_tax_charges).value);
        getHashMapReturnValues().put("total_charges_after_tax",((javax.xml.ws.Holder)h_total_charges_after_tax).value);
        getHashMapReturnValues().put("total_credit",((javax.xml.ws.Holder)h_total_credit).value);
        getHashMapReturnValues().put("cart_inv_line_items",((javax.xml.ws.Holder)h_cart_inv_line_items).value);
        getHashMapReturnValues().put("third_party_errors",((javax.xml.ws.Holder)h_third_party_errors).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> createOrderWithPlanM(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        Long acct_no = (Long) map.get("acct_no");
                String client_acct_id = (String) map.get("client_acct_id");
                com.aria.common.shared.OrderLineItemsArray order_line_items = (com.aria.common.shared.OrderLineItemsArray) map.get("order_line_items");
                Long parent_plan_instance_no = (Long) map.get("parent_plan_instance_no");
                String client_parent_plan_instance_id = (String) map.get("client_parent_plan_instance_id");
                Long supp_plan_instance_no = (Long) map.get("supp_plan_instance_no");
                String client_plan_instance_id = (String) map.get("client_plan_instance_id");
                Long supp_plan_no = (Long) map.get("supp_plan_no");
                String client_supp_plan_id = (String) map.get("client_supp_plan_id");
                Long supp_plan_units = (Long) map.get("supp_plan_units");
                Long assignment_directive = (Long) map.get("assignment_directive");
                Long bill_immediately = (Long) map.get("bill_immediately");
                Long bill_seq = (Long) map.get("bill_seq");
                String client_order_id = (String) map.get("client_order_id");
                String client_receipt_id = (String) map.get("client_receipt_id");
                Long alt_pay_method = (Long) map.get("alt_pay_method");
                String cc_number = (String) map.get("cc_number");
                Long cc_expire_mm = (Long) map.get("cc_expire_mm");
                Long cc_expire_yyyy = (Long) map.get("cc_expire_yyyy");
                String cvv = (String) map.get("cvv");
                String bank_routing_num = (String) map.get("bank_routing_num");
                String bank_acct_num = (String) map.get("bank_acct_num");
                Long bank_check_digit = (Long) map.get("bank_check_digit");
                String bank_swift_cd = (String) map.get("bank_swift_cd");
                String bank_country_cd = (String) map.get("bank_country_cd");
                String bank_id_cd = (String) map.get("bank_id_cd");
                String bank_branch_cd = (String) map.get("bank_branch_cd");
                String mandate_id = (String) map.get("mandate_id");
                String iban = (String) map.get("iban");
                String bill_company_name = (String) map.get("bill_company_name");
                String bill_first_name = (String) map.get("bill_first_name");
                String bill_middle_initial = (String) map.get("bill_middle_initial");
                String bill_last_name = (String) map.get("bill_last_name");
                String bill_address1 = (String) map.get("bill_address1");
                String bill_address2 = (String) map.get("bill_address2");
                String bill_address3 = (String) map.get("bill_address3");
                String bill_city = (String) map.get("bill_city");
                String bill_locality = (String) map.get("bill_locality");
                String bill_state_prov = (String) map.get("bill_state_prov");
                String bill_zip = (String) map.get("bill_zip");
                String bill_country = (String) map.get("bill_country");
                String bill_email = (String) map.get("bill_email");
                String bill_phone = (String) map.get("bill_phone");
                String bill_phone_extension = (String) map.get("bill_phone_extension");
                String bill_cell_phone = (String) map.get("bill_cell_phone");
                String bill_work_phone = (String) map.get("bill_work_phone");
                String bill_work_phone_extension = (String) map.get("bill_work_phone_extension");
                com.aria.common.shared.MultipleCouponsArray multiple_coupons = (com.aria.common.shared.MultipleCouponsArray) map.get("multiple_coupons");
                String alt_client_acct_group_id = (String) map.get("alt_client_acct_group_id");
                String client_alt_inv_template_id = (String) map.get("client_alt_inv_template_id");
                Long alt_inv_template_no = (Long) map.get("alt_inv_template_no");
                String statement_message = (String) map.get("statement_message");
                String track_data1 = (String) map.get("track_data1");
                String track_data2 = (String) map.get("track_data2");
                String do_write = (String) map.get("do_write");
                
        return createOrderWithPlanM(client_no, auth_key, acct_no, client_acct_id, order_line_items, parent_plan_instance_no, client_parent_plan_instance_id, supp_plan_instance_no, client_plan_instance_id, supp_plan_no, client_supp_plan_id, supp_plan_units, assignment_directive, bill_immediately, bill_seq, client_order_id, client_receipt_id, alt_pay_method, cc_number, cc_expire_mm, cc_expire_yyyy, cvv, bank_routing_num, bank_acct_num, bank_check_digit, bank_swift_cd, bank_country_cd, bank_id_cd, bank_branch_cd, mandate_id, iban, bill_company_name, bill_first_name, bill_middle_initial, bill_last_name, bill_address1, bill_address2, bill_address3, bill_city, bill_locality, bill_state_prov, bill_zip, bill_country, bill_email, bill_phone, bill_phone_extension, bill_cell_phone, bill_work_phone, bill_work_phone_extension, multiple_coupons, alt_client_acct_group_id, client_alt_inv_template_id, alt_inv_template_no, statement_message, track_data1, track_data2, do_write);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setSessionAuth(Long client_no, String auth_key, String user_id, String password){
        javax.xml.ws.Holder h_session_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setSessionAuth(client_no, auth_key, user_id, password, h_session_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("session_id",((javax.xml.ws.Holder)h_session_id).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setSessionAuth(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String user_id = (String) map.get("user_id");
                String password = (String) map.get("password");
                
        return setSessionAuth(client_no, auth_key, user_id, password);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> setSession(Long client_no, String auth_key, String user_id, Long acct_no){
        javax.xml.ws.Holder h_session_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().setSession(client_no, auth_key, user_id, acct_no, h_session_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("session_id",((javax.xml.ws.Holder)h_session_id).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> setSession(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String user_id = (String) map.get("user_id");
                Long acct_no = (Long) map.get("acct_no");
                
        return setSession(client_no, auth_key, user_id, acct_no);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> validateSession(Long client_no, String auth_key, String session_id){
        javax.xml.ws.Holder h_user_id = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_account_no = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().validateSession(client_no, auth_key, session_id, h_user_id, h_account_no, h_error_code, h_error_msg);

        getHashMapReturnValues().put("user_id",((javax.xml.ws.Holder)h_user_id).value);
        getHashMapReturnValues().put("account_no",((javax.xml.ws.Holder)h_account_no).value);
        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> validateSession(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String session_id = (String) map.get("session_id");
                
        return validateSession(client_no, auth_key, session_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> keepAlive(Long client_no, String auth_key, String session_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().keepAlive(client_no, auth_key, session_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> keepAlive(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String session_id = (String) map.get("session_id");
                
        return keepAlive(client_no, auth_key, session_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> killSession(Long client_no, String auth_key, String session_id){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().killSession(client_no, auth_key, session_id, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> killSession(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        String session_id = (String) map.get("session_id");
                
        return killSession(client_no, auth_key, session_id);
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public Map<String,Object> authenticateCaller(Long client_no, String auth_key){
        javax.xml.ws.Holder h_error_code = new javax.xml.ws.Holder();

        javax.xml.ws.Holder h_error_msg = new javax.xml.ws.Holder();

        
        getCompletePort().authenticateCaller(client_no, auth_key, h_error_code, h_error_msg);

        getHashMapReturnValues().put("error_code",((javax.xml.ws.Holder)h_error_code).value);
        getHashMapReturnValues().put("error_msg",((javax.xml.ws.Holder)h_error_msg).value);
        
        return getHashMapReturnValues();
    }

    public Map<String,Object> authenticateCaller(Map<String,Object> map){
        Long client_no = (Long) map.get("client_no");
        String auth_key = (String) map.get("auth_key");
        
        return authenticateCaller(client_no, auth_key);
    }

    /********************************** END - METHODS IMPLEMENTATION ***********************************************/
}
