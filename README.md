# DemoSpringMVC

簡單的 SpringMVC 實作

1.使用 AnnotationConfig 方法來做 Servlet Mapping 與使用 Bean/Configuration/ComponentScan 標籤，
可以省去使用???-servlet.xml 的設定方法，讓修改不需要去修改 server 上的檔案設定。

2.使用 InternalResourceViewResolver 的前綴後綴分離來將 request 做導向，
這樣子未來如果要做技術轉移，就不用修改所有文檔相關的文字，只需要修改 config 相關的設定即可。

資料來源:https://www.youtube.com/watch?v=g2b-NbR48Jo
