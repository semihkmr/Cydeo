package Task15March;

public class awszone {
    public static void main(String[] args) {
        String app = "etsy";
        String zones ="us-east-1,us-west-2,us-west-1";

        String[] arrayZones = zones.split(",");
        System.out.println("Deploying " + app + "to us "+ arrayZones[0]+"\n"+"Deployment completed for "+ arrayZones[0]);
        System.out.println("Deploying " + app + "to us "+ arrayZones[1]+"\n"+"Deployment completed for "+ arrayZones[1]);
        System.out.println("Deploying " + app + "to us "+ arrayZones[2]+"\n"+"Deployment completed for "+ arrayZones[2]);



    }
}
