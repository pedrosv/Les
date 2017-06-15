package br.com.addvisor.util;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import br.com.addvisor.R;
import br.com.addvisor.activities.MainActivity;
import br.com.addvisor.activities.SplashActivity;

public class ReceiverNotification extends BroadcastReceiver{
	
    @Override
    public void onReceive(Context context, Intent intent) {
    	StartNotification(context);
    }

    private void StartNotification(Context context){
		
		NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
		PendingIntent p = PendingIntent.getActivity(context, 0, new Intent(context, SplashActivity.class), 0);

		NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
		builder.setTicker("Avalie seus últimos serviços");
		builder.setContentTitle("EuCONFIO");
		builder.setContentText("Avalie os últimos serviços que voce ultilizou ");
		builder.setSmallIcon(R.drawable.ic_launcher);
		builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_launcher));
		builder.setContentIntent(p);	

//		NotificationCompat.InboxStyle style = new NotificationCompat.InboxStyle();
//		String [] descs = new String[]{"Descrição 1", "Descrição 2", "Descrição 3", "Descrição 4"};
//		for(int i = 0; i < descs.length; i++){
//			style.addLine(descs[i]);
//		}
//		
//		builder.setStyle(style);

		Notification n = builder.build();
		n.vibrate = new long[]{150, 300, 150, 600};
		n.flags = Notification.FLAG_AUTO_CANCEL;
		nm.notify(R.drawable.ic_launcher, n);

		try{
			Uri som = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
			Ringtone toque = RingtoneManager.getRingtone(context, som);
			toque.play();
		}
		catch(Exception e){}
	}
}