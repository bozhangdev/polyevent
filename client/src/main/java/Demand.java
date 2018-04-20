import java.util.Calendar;

/**
 * 该class存放一个组织者举办活动的请求
 */
public class Demand {
    /**
     * 活动举办年月日，格式为yyMMdd（180329为2018年3月29日）
     * 注意！！Calendar的月份是从0开始的，如果实际月份是3，往calendar里放的时候是2
     */
    private Calendar date;
    private int numberOfRoom;   //需要的房间数
    private int numberOfPeople;   //参加的人数
    private String name;    //活动的名称

    public Calendar getDate() {
        return date;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public String getName() {
        return name;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public void setName(String name) {
        this.name = name;
    }
}
