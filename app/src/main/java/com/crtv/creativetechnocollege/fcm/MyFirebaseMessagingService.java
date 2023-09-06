package com.crtv.creativetechnocollege.fcm;


import android.content.Intent;

import androidx.annotation.NonNull;


import com.crtv.creativetechnocollege.MainActivity;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        if(remoteMessage.getData().size() > 0){

            Map<String, String> data = remoteMessage.getData();

            handleData(data);
        }
        else{
            handleNotification(remoteMessage.getNotification());
        }
    }

    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);
    }

    private void handleData(Map<String, String> data){

        String title = data.get("title");
        String message = data.get("message");
        String image = data.get("image");
        String action = data.get("action");
        String actionDestination = data.get("action_destination");

        NotificationVO notificationVO = new NotificationVO();
        notificationVO.setTitle(title);
        notificationVO.setMessage(message);
        notificationVO.setIconUrl(image);
        notificationVO.setAction(action);
        notificationVO.setActionDestination(actionDestination);

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        NotificationUtils notificationUtils = new NotificationUtils(getApplicationContext());
        notificationUtils.displayNotification(notificationVO, intent);
    }

    private void handleNotification(RemoteMessage.Notification notification){

        String title = notification.getTitle();
        String message = notification.getBody();

        NotificationVO notificationVO = new NotificationVO();

        notificationVO.setTitle(title);
        notificationVO.setMessage(message);

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        NotificationUtils notificationUtils = new NotificationUtils(getApplicationContext());

        notificationUtils.displayNotification(notificationVO, intent);
    }

}

