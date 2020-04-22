package com.anish.practicetesting.api_testing;

public class ServiceUser {

    ApiService apiService = new ApiService();

    public String getMessage(){
        return apiService.getMessage();
    }

    public String sendMessage(String msg){
        return apiService.pushMessage(msg);
    }

}
