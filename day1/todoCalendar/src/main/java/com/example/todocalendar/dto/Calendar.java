package com.example.todocalendar.dto;

public class Calendar {
    private String date;
    private String title;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Calendar calendar = (Calendar) o;

        return date.equals(calendar.date);
    }

    @Override
    public int hashCode() {
        return date.hashCode();
    }
}
