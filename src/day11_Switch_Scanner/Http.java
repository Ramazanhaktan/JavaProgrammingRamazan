package day11_Switch_Scanner;

public class Http {

    public static void main(String[] args) {
        /*,int statusCode = 400;

        String result = (statusCode == 200)? "OK" :(statusCode == 201)? "created"
                :(statusCode == 202)? "accepted" :(statusCode == 301)? "moved permanently" :(statusCode == 303)? "see others"
                :(statusCode== 304)? "not modified" :(statusCode == 307)? "temporary redirect"
                :(statusCode == 400)? "bad request" :(statusCode == 401)? "unauthorized" :(statusCode == 403)? "forbidden"
                :(statusCode == 404)? "not found" :(statusCode == 410)? "gone" :(statusCode == 500)? "internal server error"
                :(statusCode == 503)? "service unavailable" : "invalid";

        System.out.println(result);
                 */

        int statusCode = 500;
        String result = "";

        switch (statusCode) {
            case 200:
                result = "OK";
                break;
            case 201:
                result = "created";
                break;
            case 202:
                result = "accepted";
                break;
            case 301:
                result = "moved permanently";
                break;
            case 304:
                result = "not modified";

        }

        System.out.println(result);
    }
}
