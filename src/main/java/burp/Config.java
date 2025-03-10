package burp;

public class Config {
    public static boolean IS_RUNNING = false;
    public static String PROXY_HOST = "127.0.0.1";
    public static Integer PROXY_PORT = 7777;
    public static String PROXY_USERNAME = null;
    public static String PROXY_PASSWORD = null;
    public static Integer PROXY_TIMEOUT = 5000;
    public static String DOMAIN_REGX = "";
    public static String SUFFIX_REGX = "js|css|jpeg|gif|jpg|png|pdf|rar|zip|docx|doc|svg|jpeg|ico|woff|woff2|ttf|otf";

   // 新增关键字、域名黑名单
    public static String BLACKLIST_REGX = "google.com|baidu.com|mozilla.org|mozilla.com|googleapis.com|delete|remove";

    public static Integer REQUEST_TOTAL = 0;
    public static Integer SUCCESS_TOTAL = 0;
    public static Integer FAIL_TOTAL = 0;
    
    public static Integer INTERVAL_TIME = 5000;
}
