
interface Searchable {

    boolean search(String keyword);
}

class WebPage implements Searchable {

    private String url;
    private String htmlContent;

    public WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }

    public boolean search(String keyword) {
        return htmlContent.contains(keyword);
    }
}

class Main1 {

    public static void main(String[] args) {
        WebPage webPage = new WebPage("https://www.w3resource.com", "This is a sample webpage.");

        boolean webPageContainsKeyword = webPage.search("webpage");

        System.out.println("Webpage contains keyword 'webpage': " + webPageContainsKeyword);

    }
}
