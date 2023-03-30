package HomeWork_0323;

public class Triangle extends Select{

    public Triangle(){

    }
    @Override
    public void info(){
        System.out.print("높이 입력 : ");
        h = sc.nextInt();
        System.out.print("밑변 입력 : ");
        b = sc.nextInt();
        System.out.print("넓이 : "+(h*b)/2);
    }
}
