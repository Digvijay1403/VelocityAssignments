public class Methods {
    public static void main(String[] args) {


        System.out.println(Math.round(coneVolume(4,5)));
       }
    public static double coneVolume(double radiusOfCircle,double hieghtOfCone){
        return ((Math.PI * Math.pow(radiusOfCircle,2)*hieghtOfCone)/3);
    }
}

