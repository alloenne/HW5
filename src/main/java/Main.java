import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int check = service.calcSqrt(100, 300);
        System.out.println(check);
    }
}