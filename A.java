public class A {
    private int A1;
    private float A2;
    private int a;
    private int b;

    public int getA1() {
        return A1;
    }
    public void setA1(int a1) {
        A1 = a1;
    }
    public float getA2() {
        return A2;
    }
    public void setA2(float a2) {
        A2 = a2;
    }
    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public void getSoma(){
        System.out.println("Soma de a + b é: " + (a+b));
    }
    
    public void MA1(){
        System.out.println("MA1");
    }

    public void MA2(){
        System.out.println("MA2");
    }

    public void MA3(){
        System.out.println("Alteração a classe A partir do clone");
    }


}
