package com.naz.chatapp.Fragments;


import com.naz.chatapp.Notifications.MyResponse;
import com.naz.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA4lbVGkc:APA91bHSXjC69i3qL1S10yqXk9b6Q_PpSXzdZT_tYBmyyMkHaacyg0WqNPRLlZd7upqxJ3c6u8OnJFGF8w_PZZJ2XwVNv2mq9wJGNC-ihw9MB5MjJHEPDG2RPrk5ra-hwKsSAau67Jek"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}