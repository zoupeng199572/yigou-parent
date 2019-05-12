package cn.itsource.aigou.utils;


import java.util.ArrayList;
import java.util.List;

public class PageList<T> {

    private long total; /*总条目数*/
    private List<T> rows = new ArrayList<T>(); /*当前页的数据*/

    public PageList() {
    }

    public PageList(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
