package com.api;

import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.io.InputStreamReader;

public class ResponseCode {

    public static void main(String[] args) throws ClientProtocolException, IOException {

        String urlOld = "http://httpstat.us/403";

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(urlOld);
        request.addHeader ("Accept", "application/json");

        HttpResponse response = client.execute(request);

        InputStreamReader streamReader = new InputStreamReader(response.getEntity().getContent());
        StatusCodeModel currentCode = new Gson().fromJson(streamReader, StatusCodeModel.class);

        StatusCodeModel statusCode = new StatusCodeModel();
        statusCode.setCode(403);
        statusCode.setDescription("Fobidden");

        System.out.println(currentCode);
        System.out.println(currentCode.getDescription());
        System.out.println(currentCode.getCode());
        System.out.println(currentCode.getCode()==403);



    }
}
