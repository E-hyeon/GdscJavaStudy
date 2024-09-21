package src.section3.ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: data value = " + dataA.value);
        System.out.println("dataA = " + dataA);
        changReference(dataA);
        System.out.println("메서드 호출 후: data value = " + dataA.value);
    }
    static void changReference(Data datax){
        System.out.println("datax = " + datax);
        datax.value = 20;
    }
}
