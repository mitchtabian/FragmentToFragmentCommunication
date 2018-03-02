package codingwithmitch.com.fragmenttofragmentcommunication;

/**
 * Created by User on 3/2/2018.
 */

public interface IMainActivity {

    void setToolbarTitle(String fragmentTag);

    void inflateFragment(String fragmentTag, String message);
}
