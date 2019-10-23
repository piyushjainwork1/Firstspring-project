package com.school.studentDetails.service;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Service
public class UnirestService {


  public void callingUni() throws UnirestException, JSONException {
    HttpResponse<JsonNode> response =

        Unirest.get("http://localhost:8080/StudentInfo/getdetails").asJson();


    JSONArray a = response.getBody().getArray();
    for (int i = 0; i < a.length(); i++) {
      JSONObject obj = a.getJSONObject(i);

      String s = obj.getString("stuname");


      System.out.println(s);

      String s1 = obj.getString("origin");

      System.out.println(s1);
    }



  }
}
