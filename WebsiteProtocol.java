import java.util.Scanner;

public class WebsiteProtocol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the url: ");
        String website =  sc.nextLine();

        String protocol = website.substring(0, website.indexOf(":"));
        String website_type = website.substring(website.lastIndexOf(".")+1);
        System.out.println(website_type);

        if (protocol.equals("http"))
        {
            protocol = "HyperText transfer protocol";
        } else if (protocol.equals("https")) {
            protocol = "HyperText transfer protocol Secure";
        } else if (protocol.equals("ftp")) {
            protocol = "File transfer protocol";
        }
        else
        {
            protocol = "Protocol Unknown";
        }

        if (website_type.equals("com"))
        {
            website_type = "Commercial";
        } else if (website_type.equals("gov")) {
            website_type = "Government";
        } else if (website_type.equals("biz")) {
            website_type = "Business";
        } else if (website_type.equals("net")) {
            website_type = "Network";
        }
        else
        {
            website_type = "Website Type Unknown";
        }

        System.out.println("The protocol of the given url: " + protocol);
        System.out.println("The website type of given url: " + website_type);
    }
}
