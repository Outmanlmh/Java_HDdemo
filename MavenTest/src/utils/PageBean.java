package utils;

/**
 * @author LiMingHang
 * @date2019.03.09 10:52.
 */
public class PageBean {
    private int pageNum;
    private int pageSize;
    private int totalCount;
    private int totalPages;


    public PageBean() {
    }

    public PageBean(int pageNum, int pageSize, int totalCount) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPages = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
    }


}
