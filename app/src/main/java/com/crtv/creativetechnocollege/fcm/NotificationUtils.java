package com.crtv.creativetechnocollege.fcm;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.text.Html;

import androidx.core.app.NotificationCompat;

import com.crtv.creativetechnocollege.MainActivity;
import com.example.creativetechnocollege.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class NotificationUtils {

    private static final String CHANNEL_ID = "myChannel";
    private static final String CHANNEL_NAME = "myChannelName";

    // this hash map is used to open a specific activity when user click on notification
    private Map<String, Class> activityMap = new HashMap<>();

    private Context context;


    public NotificationUtils(Context context) {
        this.context = context;

        activityMap.put("mainActivity", MainActivity.class);
    }

    @SuppressLint("UnspecifiedImmutableFlag")
    void displayNotification(NotificationVO notificationVO, Intent resultIntent){

        String title = notificationVO.getTitle();
        String message = notificationVO.getMessage();
        String iconUrl = notificationVO.getIconUrl();
        String action = notificationVO.getAction();
        String actionDestination = notificationVO.getActionDestination();

        Bitmap bitmap = null;

        if(iconUrl != null){
            bitmap = getBitmapFromUrl(iconUrl);
        }

        PendingIntent resultPendingIntent;

        if(action != null && action.equals("url")){
            Intent notificationIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(actionDestination));
            resultPendingIntent = PendingIntent.getActivity(context,0,notificationIntent, 0);
        }
        else if(action != null && action.equals("activity") && activityMap.containsKey(actionDestination)){
            resultIntent = new Intent(context, activityMap.get(actionDestination));

            resultPendingIntent = PendingIntent.getActivity(context, 0, resultIntent, PendingIntent.FLAG_CANCEL_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        }
        else{

            resultIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);

            resultPendingIntent = PendingIntent.getActivity(context, 0, resultIntent, PendingIntent.FLAG_CANCEL_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        }

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context, CHANNEL_ID);

        Notification notification;

        if(bitmap == null){
            NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();

            inboxStyle.addLine(message);

            notification = mBuilder.setTicker(title).setWhen(0)
                    .setAutoCancel(true)
                    .setContentTitle(title)
                    .setContentIntent(resultPendingIntent)
                    .setStyle(new NotificationCompat.BigTextStyle().bigText(message))
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setContentText(message)
                    .build();
        }
        else{
            NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();

            bigPictureStyle.setBigContentTitle(title);
            bigPictureStyle.setSummaryText(Html.fromHtml(message).toString());
            bigPictureStyle.bigPicture(bitmap);

            notification = mBuilder.setTicker(title).setWhen(0)
                    .setAutoCancel(false)
                    .setContentText(title)
                    .setContentIntent(resultPendingIntent)
                    .setStyle(bigPictureStyle)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setContentText(message)
                    .build();
        }

        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);

            notificationManager.createNotificationChannel(channel);
        }

        notificationManager.notify((int) System.currentTimeMillis(), notification);

    }

    private Bitmap getBitmapFromUrl(String iconUrl){

        try{
            URL url = new URL(iconUrl);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();

            InputStream inputStream = connection.getInputStream();
            return BitmapFactory.decodeStream(inputStream);
        }
        catch (IOException exception){
            return null;
        }
    }
}
