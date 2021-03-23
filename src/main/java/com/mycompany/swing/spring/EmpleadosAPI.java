package com.mycompany.swing.spring;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class EmpleadosAPI {

    public String GetAllEmpleados() throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        try {
            HttpGet getRequest = new HttpGet("http://localhost:8080/api/empleados");
            HttpResponse response = httpClient.execute(getRequest);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != 200) {
                throw new RuntimeException("Failed with HTTP error code : " + statusCode);
            }
            HttpEntity httpEntity = response.getEntity();
            String apiOutput = EntityUtils.toString(httpEntity);
            return apiOutput;
        } finally {
            httpClient.getConnectionManager().shutdown();
        }
    }

    public String GetIdEmpleados(String id) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        try {
            HttpGet getRequest = new HttpGet("http://localhost:8080/api/empleados/" + id);
            HttpResponse response = httpClient.execute(getRequest);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != 200) {
                throw new RuntimeException("Failed with HTTP error code : " + statusCode);
            }

            HttpEntity httpEntity = response.getEntity();
            String apiOutput = EntityUtils.toString(httpEntity);
            return apiOutput;
        } finally {
            httpClient.getConnectionManager().shutdown();
        }
    }

    public void PostNewEmpleado(String emp) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        try {
            HttpPost postRequest = new HttpPost("http://localhost:8080/api/empleados");
            postRequest.addHeader("content-type", "application/json");
            StringEntity userEntity = new StringEntity(emp);
            postRequest.setEntity(userEntity);
            HttpResponse response = httpClient.execute(postRequest);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != 200) {
                throw new RuntimeException("Failed with HTTP error code : " + statusCode);
            }
        } finally {
            httpClient.getConnectionManager().shutdown();
        }
    }

    public void PutUpdateEmpleado(String emp, String id) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        try {
            HttpPut putRequest = new HttpPut("http://localhost:8080/api/empleados/" + id);
            putRequest.addHeader("content-type", "application/json");
            StringEntity userEntity = new StringEntity(emp);
            putRequest.setEntity(userEntity);
            HttpResponse response = httpClient.execute(putRequest);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != 200) {
                throw new RuntimeException("Failed with HTTP error code : " + statusCode);
            }
        } finally {
            httpClient.getConnectionManager().shutdown();
        }
    }

    public void DeleteIdEmpleado(String id) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        try {
            HttpDelete deleteRequest = new HttpDelete("http://localhost:8080/api/empleados/" + id);
            HttpResponse response = httpClient.execute(deleteRequest);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != 200) {
                throw new RuntimeException("Failed with HTTP error code : " + statusCode);
            }
        } finally {
            httpClient.getConnectionManager().shutdown();
        }
    }

}
