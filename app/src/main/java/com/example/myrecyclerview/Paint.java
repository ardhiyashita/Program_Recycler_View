package com.example.myrecyclerview;

public class Paint {
    private String paint_name;
    private String detail;
    private int photo;

    public String getPaint_name() {
        return paint_name;
    }

    public void setPaint_name(String paint_name) {
        this.paint_name = paint_name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
//catatan:
//membuat POJO (Plain Old Java Object) -> disini kita membuat suatu objek, tugasnya menampung class Paint
//isinya hanya 3 item: paint_name, detail, photo