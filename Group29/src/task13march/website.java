package task13march;

public class website {
    public static void main(String[] args) {
        String [] website ={"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com",
              "  nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com",
                "comcast.net", "tamu.edu", "utexas.edu"};
        int com=0;
        int edu=0;
        int org=0;
        int other=0;
        for (int i = 0; i <website.length ; i++) {
            if(website[i].contains(""+".com")){
                com++;
            }
            else if(website[i].contains(""+".org")){
                org++;
            }
            else  if(website[i].contains(""+".edu")){
                edu++;
            }
            else{
                other++;
            }
        }
        System.out.println("org "+org);
        System.out.println("com "+com);
        System.out.println("edu "+edu);
        System.out.println("other "+other);

    }

}
