package Connection;

/**
 * Created by guquanding on 2017/5/24.
 */

public interface ResponseListener {

    void onSuccess(Object object);

    void onError(String errorMsg);
}
