package HomeWork_0323;

public class Square extends Rectangle{

    public Square(){

    }
    @Override
    public void info(){
        System.out.print("한변 입력 : ");
        h = sc.nextInt();
        System.out.print("넓이 : "+(h*h));
    }
}
