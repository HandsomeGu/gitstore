package Connection;

import android.os.Looper;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import sss.gqd.com.stockquery.DetailActivity;

/**
 * Created by guquanding on 2017/5/24.
 *
 * @function：将HttpUrlConnection进行封装
 *
 */

public class ConnectionUtil {
    public static void sendRequest(final String url, final ResponseListener listener, final Class<?> clazz){
        new Thread(){
            @Override
            public void run() {
                try {
                    URL u = new URL(url);
                    HttpURLConnection connection = (HttpURLConnection) u.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setReadTimeout(5000);
                    connection.setConnectTimeout(5000);
                    connection.connect();

                    if(connection.getResponseCode()==HttpURLConnection.HTTP_OK){
                        InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        String s ="";
                        StringBuffer stringBuffer = new StringBuffer();
                        if((s=bufferedReader.readLine()) != null){
                            stringBuffer.append(s);
                        }
                        String data = stringBuffer.toString();
                        if(listener!=null){
                            if(clazz==null){
                                listener.onSuccess(data);
                            }else{
                                Gson gson =new Gson();
                                listener.onSuccess(gson.fromJson(data,clazz));
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
