package com.company;

public class HTML {
    private String titel;
    private String paragraaf = "";
    private String HTML;

    public HTML(String titel) {
        this.titel = titel;
    }

    public void addParagraaf(String s) {
        this.paragraaf = this.paragraaf + "<p>" + s + "</p>\n";
    }

    public String getHTML() {
        HTML = "<html>\n" +
                "<head>\n" +
                String.format("<title>%s</title>\n", titel) +
                "</head>\n" +
                "<body>\n" +
                String.format("<h1>%s</h1>\n", titel) +
                this.paragraaf +
                "</body>\n" +
                "</html>\n";
        return HTML;
    }
}
