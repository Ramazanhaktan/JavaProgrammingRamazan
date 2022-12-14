package day11_Switch_Scanner;

public class BrowserName {

    public static void main(String[] args) {

        String browserName = "edge";
        String result = "";
        switch (browserName){
            case "chrome":
                result = "The selected browser is chrome";
                break;
            case "firefox":
                result = "The selected browser is firefox";
                break;
            case "opera":
                result = "The selected browser is opera";
                break;
            case "safari":
                result = "The selected browser is safari";
                break;
            case "edge":
                result = "The selected browser is edge";
                break;
            default:
                result = "Invalid Browser";

        }

        System.out.println(result);
    }
}
