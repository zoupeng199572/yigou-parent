package cn.itsource.yigou.query;

/**
 * 公共的查询条件封装
 */
public class BaseQuery {
    private Integer page = 1;
    private Integer size = 10;
    private String keyword;

    @Override
    public String toString() {
        return "BaseQuery{" +
                "page=" + page +
                ", size=" + size +
                ", keyword='" + keyword + '\'' +
                '}';
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
