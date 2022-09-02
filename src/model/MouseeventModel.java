package model;

public class MouseeventModel {
    private int x, y;
    private int count;
    private String checkin;

    public MouseeventModel(){
        this.x = 0;
        this.y = 0;
        this.count = 0;
        this.checkin = "N";
    }
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getCount(){
        return this.count;
    }
    public void setCount(int count){
        this.count = count;
    }
    public String getCheckin(){
        return this.checkin;
    }
    public void setCheckin(String checkin){
        this.checkin = checkin;
    }
    public void click(){
        this.count++;
    }
    
}
