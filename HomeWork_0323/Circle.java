package HomeWork_0323;

public class Circle extends Select{

    public Circle(){

    }
    @Override
    public void info(){
        System.out.print("반지름 입력 : ");
        h = sc.nextInt();
        System.out.print("넓이 : "+(h*h)*Math.PI);
    }
}
