import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.BoolInt;

public class Message {
    /**
     * Message ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Date when the message has been sent in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Date when the message has been updated in Unixtime
     */
    @SerializedName("update_time")
    private Integer updateTime;

    /**
     * Information whether the message is outcoming
     */
    @SerializedName("out")
    private BoolInt out;
}