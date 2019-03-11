package utils;

import java.util.List;

/**
 * @author LiMingHang
 * @date2019.03.09 11:24.
 */
public class ResultData {
    private int pageNum;
    private int pageSize;
    private int totalCount;
    private int totalPages;
    private List lists;
    private String url;
    private String pageView;

    public  ResultData(int pageNum, int pageSize, int totalCount, List lists) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.lists = lists;
        this.totalPages = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
    }

    public List<?> getLists() {
        return lists;
    }

    public void setUrl() {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        setPageView(url);
        this.url = url;
    }
    private void setPageView(String url){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<url>");

        //上一页
        if (pageNum == 1) {
            stringBuffer.append(" <li>首页</li>");
            stringBuffer.append(" <li>上一页</li>");
        } else {
            stringBuffer.append(" <li><a href='" + url+"?pageNum=1'>首页</a></li>");
            stringBuffer.append("  <li><a href='"+url+"?pageNum="+(pageNum - 1)+"'>上一页</a></li>");
        }

        //中间页
        for (int i = 1; i <= 5; i++) {
            if (i == pageNum) {
                stringBuffer.append(" <li>" + i + "</li>");
            } else {
                stringBuffer.append("  <li><a href='"+url+"?pageNum="+(i)+"'>" + i + "</a></li>");
            }
        }


        //下一页
        if (pageNum == totalPages) {
            stringBuffer.append("  <li>下一页</li>");
            stringBuffer.append(" <li>尾页</li>");
        } else {
            stringBuffer.append("  <li><a href='"+url+"pageNum=" + (pageNum + 1) + "'>下一页</a></li>");
            stringBuffer.append(" <li><a href='" + url + "pageNum="+(totalPages)+"'>尾页</a></li>");
        }
        stringBuffer.append("</url>");
        this.pageView=stringBuffer.toString();

    }
    public String getPageView(){
        return pageView;
    }
}
