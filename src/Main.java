import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // chủ đề 1 : Lớp String, StringBuilder, StringBuffer

        String str1 = "                                  "; // tạo trong String pool của vùng nhớ heap
        String str2 = "hung hx"; // gă địa chỉ của str1 cho str2
        // in đia chỉ tham chiêu
//        System.out.println("địa chỉ str1 : "+System.identityHashCode(str1));
//        System.out.println("địa chỉ str2 : "+System.identityHashCode(str2));
//
//        String str3 = new String("hung hx"); // tạo trong vùng nhớ heap nhung ko thuộc stringpool
//        String str4 = new String("hung hx");
//
//
//        System.out.println("địa chỉ str3 : "+System.identityHashCode(str3));
//        System.out.println("địa chỉ str4 : "+System.identityHashCode(str4));
////        str1 ="hunghx"; // bất cứ thao tác chỉnh sửa chuỗi nào đều thay đổi vùng nhớ chuỗi ban đầu
//        System.out.println("địa chỉ str1 : "+System.identityHashCode(str1));
//        // các phương thức làm việc với chuỗi
////        System.out.println(str1 == str2); // true
////        System.out.println(str1.equals(str2)); // true
////        System.out.println(str1 == str3); // false
//        System.out.println(str1.equals(str3)); // true
//        // cắt chuỗi
//        System.out.println(str1.substring(2,6));
//        // tách thành mảng
//        System.out.println(Arrays.toString(str1.split("n")));
//        // tìm kiếm và thay thế
//        String abc = "hello các bạn trẻ, hôm nay th nao";
//
//        String  o = abc.replaceAll("h","0");
//        System.out.println(o);

//        System.out.println("str1 chữa kí tự h :"+str1.contains("h"));
        System.out.println(str1.isBlank()); // trả ề true khi chuỗi l empty hoặc chứa toàn khoảng trắng
        System.out.println(str1.isEmpty()); // chuỗi ""

        // StringBuilder và StringBuffer
        StringBuilder str = new StringBuilder("hung hx");
        str.append("JAVA"); // JAVhung hx, hung hxJAV
        System.out.println(str);
        str.delete(3,5);
        System.out.println(str);
        str.insert(3,"g ");
        System.out.println(str);

        // StringBuilder và StringBuffer khác gì nhau : StringBuilder nhanh hơn

        // chủ đề 2 : biểu thức chính qui : regex (regular expression) : validate dữ liệu đầu vào
        // Pattern
        // Matcher


        // số điện thoại bắt đầu bằng 0| +84 , theo sau là 9 kí tự số
        String regex = "^(0|\\+84)\\d{9}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("+85987644532");
        System.out.println(m.matches());

//        boolean check = Pattern.compile(regex).matcher("094575486458").matches();
//        boolean check = Pattern.matches("09493865745",regex);
        boolean check = "0984938654".matches(regex);

        // tạo biểu thức chính quy cho email (abc@gmail.com / abc@yahoo.com / abc@rikkei.com)
        // phần đầu ít nhất 1 kí tự
        // dấu @
        // đuôi gmail.com / yahoo.com / rikkei.com

        String regexEmail = "^[a-z0-9A-Z]+@(gmail|yahoo|rikkei)\\.com$";
        System.out.println(Pattern.matches(regexEmail,"hung@gmail.com"));
        // username ko chua khoang trăng và kí tự đặc biet, tối thiểu 6 kí tự
        String regexUsername = "^[a-z0-9]{6,}$";
        System.out.println(Pattern.matches(regexUsername,"hung123"));
    }
}